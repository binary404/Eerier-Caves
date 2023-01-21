package binary404.eerier_caves;

import binary404.eerier_caves.common.worldgen.EerierCavesBiomes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EerierCaves.MODID)
public class EerierCaves {

    public static final String MODID = "eerier_caves";
    private static final Logger LOGGER = LogManager.getLogger(MODID);

    public EerierCaves() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup");
        EerierCavesBiomes.setupTerraBlender();
    }

    public void onServerStarting(ServerStartingEvent event) {

    }
}
