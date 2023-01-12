package binary404.eerier_caves;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EerierCaves.MODID)
public class EerierCaves {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "eerier_caves";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogManager.getLogger(MODID);
    public EerierCaves() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }

    public void onServerStarting(ServerStartingEvent event) {

    }
}
