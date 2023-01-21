package binary404.eerier_caves.common.worldgen;

import binary404.eerier_caves.EerierCaves;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

import static binary404.eerier_caves.common.worldgen.OverworldBiomeConstants.FULL_RANGE;

public class EerierCavesRegionPrimary extends Region {

    public static final ResourceLocation LOCATION = new ResourceLocation(EerierCaves.MODID, "overworld_primary");

    public EerierCavesRegionPrimary(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            //builder.replaceBiome(Biomes.DRIPSTONE_CAVES, EerierCavesBiomes.SPIDER_CAVE);
        });
        //this.addBiome(mapper, ParameterUtils.Temperature.HOT.parameter(), ParameterUtils.Humidity.FULL_RANGE.parameter(), ParameterUtils.Continentalness.FULL_RANGE.parameter(), ParameterUtils.Erosion.FULL_RANGE.parameter(), ParameterUtils.Weirdness.FULL_RANGE.parameter(), ParameterUtils.Depth.UNDERGROUND.parameter(), 0.0f, EerierCavesBiomes.BAT_NEST);
        //this.addBiome(mapper, ParameterUtils.Temperature.FULL_RANGE.parameter(), ParameterUtils.Humidity.HUMID.parameter(), ParameterUtils.Continentalness.FULL_RANGE.parameter(), ParameterUtils.Erosion.FULL_RANGE.parameter(), ParameterUtils.Weirdness.FULL_RANGE.parameter(), ParameterUtils.Depth.UNDERGROUND.parameter(), 0.0f, EerierCavesBiomes.SPIDER_CAVE);
    }
}
