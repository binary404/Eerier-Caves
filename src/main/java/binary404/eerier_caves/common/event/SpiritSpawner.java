package binary404.eerier_caves.common.event;

import binary404.eerier_caves.common.entity.SpiritEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class SpiritSpawner {

    public static Map<Player, SpiritInfo> playerCounters = new HashMap<>();

    @SubscribeEvent
    public static void playerCheck(TickEvent.PlayerTickEvent event) {
        //Only on server and only every second
        if(event.side.isServer() && event.phase == TickEvent.Phase.START && event.player.tickCount % 20 == 0) {
            ServerPlayer player = (ServerPlayer) event.player;
            Level level = player.level;
            SpiritInfo info = playerCounters.getOrDefault(player, new SpiritInfo());
            BlockPos pos = new BlockPos(player.getX(), player.getY(), player.getZ());
            int blockLight = level.getBrightness(LightLayer.BLOCK, pos);
            int skyLight = level.getBrightness(LightLayer.SKY, pos);
            if(blockLight <= 7 && skyLight <= 4) {
                if(!info.lastInDark) {
                    info.lastInDark = true;
                }
                info.counter++;
            }else if(info.lastInDark) {
                info.reset();
            }
            if(info.counter % 30 == 0 && info.counter != 0) {
                if(SpiritEntity.attemptSpawn(pos, info.spiritCount, player)) {
                    info.spiritCount++;
                    System.out.println(info.lastInDark);
                }
            }
            playerCounters.put(player, info);
        }
    }

    public static class SpiritInfo {
        public int counter = 0;
        public boolean lastInDark = false;
        public int spiritCount = 0;

        public SpiritInfo(){

        }

        public void reset() {
            lastInDark = false;
            counter = 0;
            spiritCount = 0;
        }

    }

}
