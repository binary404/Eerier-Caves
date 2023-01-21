package binary404.eerier_caves.common.worldgen;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;

import static binary404.eerier_caves.common.worldgen.OverworldBiomeConstants.*;

import java.util.function.Consumer;

public class EerierCavesPrimaryBiomes {

    protected void addUndergroundBiomes(Registry<Biome> biomeRegistry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addUndergroundBiome(biomeRegistry, mapper, Climate.Parameter.span(-0.2f, 1.0f), Climate.Parameter.span(0.1f, 1.0f), Climate.Parameter.span(0.8f, 1.0f), FULL_RANGE, FULL_RANGE, 0.0f, EerierCavesBiomes.SPIDER_CAVE);
    }

    /**
     *
     * @param biomeRegistry
     * @param mapper
     * @param temperature Range from -1 to 1, -1 being cold and 1 being hot
     * @param humidity Range from -1 to 1, lower being humid higher being dry
     * @param continentalness Range from -? to 1, lower generates closer to coast
     * @param erosion Range from -1 to 1, lower is more hilly higher is more flat
     * @param weirdness It is just plain weird
     * @param offset
     * @param biome The biome to add
     *
     */
    protected void addUndergroundBiome(Registry<Biome> biomeRegistry, Consumer<Pair<Climate .ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.span(0.2F, 0.9F), weirdness, offset), biome));
    }
}
