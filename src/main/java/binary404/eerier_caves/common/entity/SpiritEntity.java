package binary404.eerier_caves.common.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.NaturalSpawner;

public class SpiritEntity {

    public static boolean attemptSpawn(BlockPos pos, int spiritCount, ServerPlayer player) {
        RandomSource random = player.getRandom();
        for(int l = 0; l < 50; l++) {
            int i = pos.getX() + Mth.nextInt(random, 7, 14) * Mth.nextInt(random, -1, 1);
            int j = pos.getY() + Mth.nextInt(random, 7, 14) * Mth.nextInt(random, -1, 1);
            int k = pos.getZ() + Mth.nextInt(random, 7, 14) * Mth.nextInt(random, -1, 1);
            BlockPos attempt = new BlockPos(i, j, k);
            if(player.level.noCollision(EntityType.VEX.getAABB(i + 0.5, j + 0.5, k + 0.5))) {
                Vex vex = EntityType.VEX.spawn(player.getLevel(), null, null, null, attempt, MobSpawnType.MOB_SUMMONED, false, false);
                vex.setTarget(player);
                return true;
            }
        }
        return false;
    }

}
