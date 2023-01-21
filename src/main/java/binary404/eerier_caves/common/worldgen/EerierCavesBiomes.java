package binary404.eerier_caves.common.worldgen;

import binary404.eerier_caves.EerierCaves;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import org.apache.commons.compress.utils.Lists;
import terrablender.api.Regions;

import java.util.List;

public class EerierCavesBiomes {

    private static List<ResourceKey<Biome>> overworldBiomes = Lists.newArrayList();
    private static List<ResourceKey<Biome>> allBiomes = Lists.newArrayList();


    public static final ResourceKey<Biome> SPIDER_CAVE = registerOverworld("spider_cave");
    public static final ResourceKey<Biome> BAT_NEST = registerOverworld("bat_nest");

    public static void setupTerraBlender() {
        Regions.register(new EerierCavesRegionPrimary(4));
    }

    private static ResourceKey<Biome> registerOverworld(String name) {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, new ResourceLocation(EerierCaves.MODID, name));
        overworldBiomes.add(key);
        allBiomes.add(key);
        return key;
    }

}
