package binary404.eerier_caves.common.worldgen;

import net.minecraft.world.level.biome.Climate;

public final class OverworldBiomeConstants {

    public static final float VALLEY_SIZE = 0.05F;
    public static final float LOW_START = 0.26666668F;
    public static final float HIGH_START = 0.4F;
    public static final float HIGH_END = 0.93333334F;
    public static final float PEAK_SIZE = 0.1F;
    public static final float PEAK_START = 0.56666666F;
    public static final float PEAK_END = 0.7666667F;
    public static final float NEAR_INLAND_START = -0.11F;
    public static final float MID_INLAND_START = 0.03F;
    public static final float FAR_INLAND_START = 0.3F;
    public static final float EROSION_INDEX_1_START = -0.78F;
    public static final float EROSION_INDEX_2_START = -0.375F;

    public static final Climate.Parameter FULL_RANGE = Climate.Parameter.span(-1.0F, 1.0F);

    /* Terminology:
        Continentalness: Low to generate near coasts, far to generate away from coasts
        Erosion: Low is hilly terrain, high is flat terrain
     */

    public static final Climate.Parameter[] temperatures = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.45F),
            Climate.Parameter.span(-0.45F, -0.15F),
            Climate.Parameter.span(-0.15F, 0.2F),
            Climate.Parameter.span(0.2F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    public static final Climate.Parameter[] humidities = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.35F),
            Climate.Parameter.span(-0.35F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.1F),
            Climate.Parameter.span(0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 1.0F)
    };

    public static final Climate.Parameter[] erosions = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.78F),
            Climate.Parameter.span(-0.78F, -0.375F),
            Climate.Parameter.span(-0.375F, -0.2225F),
            Climate.Parameter.span(-0.2225F, 0.05F),
            Climate.Parameter.span(0.05F, 0.45F),
            Climate.Parameter.span(0.45F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    public static final Climate.Parameter COMMON_RARENESS_RANGE = Climate.Parameter.span(-1.0F, 0.35F);
    public static final Climate.Parameter RARE_RARENESS_RANGE = Climate.Parameter.span(0.35F, 1.0F);

    public final Climate.Parameter FROZEN_RANGE = this.temperatures[0];
    public final Climate.Parameter UNFROZEN_RANGE = Climate.Parameter.span(this.temperatures[1], this.temperatures[4]);
    public final Climate.Parameter mushroomFieldsContinentalness = Climate.Parameter.span(-1.2F, -1.05F);
    public final Climate.Parameter deepOceanContinentalness = Climate.Parameter.span(-1.05F, -0.455F);
    public final Climate.Parameter oceanContinentalness = Climate.Parameter.span(-0.455F, -0.19F);
    public final Climate.Parameter coastContinentalness = Climate.Parameter.span(-0.19F, -0.11F);
    public final Climate.Parameter inlandContinentalness = Climate.Parameter.span(-0.11F, 0.55F);
    public final Climate.Parameter nearInlandContinentalness = Climate.Parameter.span(-0.11F, 0.03F);
    public final Climate.Parameter midInlandContinentalness = Climate.Parameter.span(0.03F, 0.3F);
    public final Climate.Parameter farInlandContinentalness = Climate.Parameter.span(0.3F, 1.0F);

}
