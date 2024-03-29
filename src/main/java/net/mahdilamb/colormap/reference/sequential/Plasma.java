package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * MPL Plasma
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Plasma",source = "Matplotlib")
public final class Plasma extends SequentialColormap {
    /**
     * Create a colormap based on MPL Plasma.
     */
    public Plasma() {
        //data from https://github.com/matplotlib/matplotlib/blob/f2116d82dfd6b82fe178230766d95ea9ac2b0c8c/lib/matplotlib/_cm_listed.py#L1288
        super(
                new Color(0.050383f, 0.029803f, 0.527975f),
                new Color(0.063536f, 0.028426f, 0.533124f),
                new Color(0.075353f, 0.027206f, 0.538007f),
                new Color(0.086222f, 0.026125f, 0.542658f),
                new Color(0.096379f, 0.025165f, 0.547103f),
                new Color(0.105980f, 0.024309f, 0.551368f),
                new Color(0.115124f, 0.023556f, 0.555468f),
                new Color(0.123903f, 0.022878f, 0.559423f),
                new Color(0.132381f, 0.022258f, 0.563250f),
                new Color(0.140603f, 0.021687f, 0.566959f),
                new Color(0.148607f, 0.021154f, 0.570562f),
                new Color(0.156421f, 0.020651f, 0.574065f),
                new Color(0.164070f, 0.020171f, 0.577478f),
                new Color(0.171574f, 0.019706f, 0.580806f),
                new Color(0.178950f, 0.019252f, 0.584054f),
                new Color(0.186213f, 0.018803f, 0.587228f),
                new Color(0.193374f, 0.018354f, 0.590330f),
                new Color(0.200445f, 0.017902f, 0.593364f),
                new Color(0.207435f, 0.017442f, 0.596333f),
                new Color(0.214350f, 0.016973f, 0.599239f),
                new Color(0.221197f, 0.016497f, 0.602083f),
                new Color(0.227983f, 0.016007f, 0.604867f),
                new Color(0.234715f, 0.015502f, 0.607592f),
                new Color(0.241396f, 0.014979f, 0.610259f),
                new Color(0.248032f, 0.014439f, 0.612868f),
                new Color(0.254627f, 0.013882f, 0.615419f),
                new Color(0.261183f, 0.013308f, 0.617911f),
                new Color(0.267703f, 0.012716f, 0.620346f),
                new Color(0.274191f, 0.012109f, 0.622722f),
                new Color(0.280648f, 0.011488f, 0.625038f),
                new Color(0.287076f, 0.010855f, 0.627295f),
                new Color(0.293478f, 0.010213f, 0.629490f),
                new Color(0.299855f, 0.009561f, 0.631624f),
                new Color(0.306210f, 0.008902f, 0.633694f),
                new Color(0.312543f, 0.008239f, 0.635700f),
                new Color(0.318856f, 0.007576f, 0.637640f),
                new Color(0.325150f, 0.006915f, 0.639512f),
                new Color(0.331426f, 0.006261f, 0.641316f),
                new Color(0.337683f, 0.005618f, 0.643049f),
                new Color(0.343925f, 0.004991f, 0.644710f),
                new Color(0.350150f, 0.004382f, 0.646298f),
                new Color(0.356359f, 0.003798f, 0.647810f),
                new Color(0.362553f, 0.003243f, 0.649245f),
                new Color(0.368733f, 0.002724f, 0.650601f),
                new Color(0.374897f, 0.002245f, 0.651876f),
                new Color(0.381047f, 0.001814f, 0.653068f),
                new Color(0.387183f, 0.001434f, 0.654177f),
                new Color(0.393304f, 0.001114f, 0.655199f),
                new Color(0.399411f, 0.000859f, 0.656133f),
                new Color(0.405503f, 0.000678f, 0.656977f),
                new Color(0.411580f, 0.000577f, 0.657730f),
                new Color(0.417642f, 0.000564f, 0.658390f),
                new Color(0.423689f, 0.000646f, 0.658956f),
                new Color(0.429719f, 0.000831f, 0.659425f),
                new Color(0.435734f, 0.001127f, 0.659797f),
                new Color(0.441732f, 0.001540f, 0.660069f),
                new Color(0.447714f, 0.002080f, 0.660240f),
                new Color(0.453677f, 0.002755f, 0.660310f),
                new Color(0.459623f, 0.003574f, 0.660277f),
                new Color(0.465550f, 0.004545f, 0.660139f),
                new Color(0.471457f, 0.005678f, 0.659897f),
                new Color(0.477344f, 0.006980f, 0.659549f),
                new Color(0.483210f, 0.008460f, 0.659095f),
                new Color(0.489055f, 0.010127f, 0.658534f),
                new Color(0.494877f, 0.011990f, 0.657865f),
                new Color(0.500678f, 0.014055f, 0.657088f),
                new Color(0.506454f, 0.016333f, 0.656202f),
                new Color(0.512206f, 0.018833f, 0.655209f),
                new Color(0.517933f, 0.021563f, 0.654109f),
                new Color(0.523633f, 0.024532f, 0.652901f),
                new Color(0.529306f, 0.027747f, 0.651586f),
                new Color(0.534952f, 0.031217f, 0.650165f),
                new Color(0.540570f, 0.034950f, 0.648640f),
                new Color(0.546157f, 0.038954f, 0.647010f),
                new Color(0.551715f, 0.043136f, 0.645277f),
                new Color(0.557243f, 0.047331f, 0.643443f),
                new Color(0.562738f, 0.051545f, 0.641509f),
                new Color(0.568201f, 0.055778f, 0.639477f),
                new Color(0.573632f, 0.060028f, 0.637349f),
                new Color(0.579029f, 0.064296f, 0.635126f),
                new Color(0.584391f, 0.068579f, 0.632812f),
                new Color(0.589719f, 0.072878f, 0.630408f),
                new Color(0.595011f, 0.077190f, 0.627917f),
                new Color(0.600266f, 0.081516f, 0.625342f),
                new Color(0.605485f, 0.085854f, 0.622686f),
                new Color(0.610667f, 0.090204f, 0.619951f),
                new Color(0.615812f, 0.094564f, 0.617140f),
                new Color(0.620919f, 0.098934f, 0.614257f),
                new Color(0.625987f, 0.103312f, 0.611305f),
                new Color(0.631017f, 0.107699f, 0.608287f),
                new Color(0.636008f, 0.112092f, 0.605205f),
                new Color(0.640959f, 0.116492f, 0.602065f),
                new Color(0.645872f, 0.120898f, 0.598867f),
                new Color(0.650746f, 0.125309f, 0.595617f),
                new Color(0.655580f, 0.129725f, 0.592317f),
                new Color(0.660374f, 0.134144f, 0.588971f),
                new Color(0.665129f, 0.138566f, 0.585582f),
                new Color(0.669845f, 0.142992f, 0.582154f),
                new Color(0.674522f, 0.147419f, 0.578688f),
                new Color(0.679160f, 0.151848f, 0.575189f),
                new Color(0.683758f, 0.156278f, 0.571660f),
                new Color(0.688318f, 0.160709f, 0.568103f),
                new Color(0.692840f, 0.165141f, 0.564522f),
                new Color(0.697324f, 0.169573f, 0.560919f),
                new Color(0.701769f, 0.174005f, 0.557296f),
                new Color(0.706178f, 0.178437f, 0.553657f),
                new Color(0.710549f, 0.182868f, 0.550004f),
                new Color(0.714883f, 0.187299f, 0.546338f),
                new Color(0.719181f, 0.191729f, 0.542663f),
                new Color(0.723444f, 0.196158f, 0.538981f),
                new Color(0.727670f, 0.200586f, 0.535293f),
                new Color(0.731862f, 0.205013f, 0.531601f),
                new Color(0.736019f, 0.209439f, 0.527908f),
                new Color(0.740143f, 0.213864f, 0.524216f),
                new Color(0.744232f, 0.218288f, 0.520524f),
                new Color(0.748289f, 0.222711f, 0.516834f),
                new Color(0.752312f, 0.227133f, 0.513149f),
                new Color(0.756304f, 0.231555f, 0.509468f),
                new Color(0.760264f, 0.235976f, 0.505794f),
                new Color(0.764193f, 0.240396f, 0.502126f),
                new Color(0.768090f, 0.244817f, 0.498465f),
                new Color(0.771958f, 0.249237f, 0.494813f),
                new Color(0.775796f, 0.253658f, 0.491171f),
                new Color(0.779604f, 0.258078f, 0.487539f),
                new Color(0.783383f, 0.262500f, 0.483918f),
                new Color(0.787133f, 0.266922f, 0.480307f),
                new Color(0.790855f, 0.271345f, 0.476706f),
                new Color(0.794549f, 0.275770f, 0.473117f),
                new Color(0.798216f, 0.280197f, 0.469538f),
                new Color(0.801855f, 0.284626f, 0.465971f),
                new Color(0.805467f, 0.289057f, 0.462415f),
                new Color(0.809052f, 0.293491f, 0.458870f),
                new Color(0.812612f, 0.297928f, 0.455338f),
                new Color(0.816144f, 0.302368f, 0.451816f),
                new Color(0.819651f, 0.306812f, 0.448306f),
                new Color(0.823132f, 0.311261f, 0.444806f),
                new Color(0.826588f, 0.315714f, 0.441316f),
                new Color(0.830018f, 0.320172f, 0.437836f),
                new Color(0.833422f, 0.324635f, 0.434366f),
                new Color(0.836801f, 0.329105f, 0.430905f),
                new Color(0.840155f, 0.333580f, 0.427455f),
                new Color(0.843484f, 0.338062f, 0.424013f),
                new Color(0.846788f, 0.342551f, 0.420579f),
                new Color(0.850066f, 0.347048f, 0.417153f),
                new Color(0.853319f, 0.351553f, 0.413734f),
                new Color(0.856547f, 0.356066f, 0.410322f),
                new Color(0.859750f, 0.360588f, 0.406917f),
                new Color(0.862927f, 0.365119f, 0.403519f),
                new Color(0.866078f, 0.369660f, 0.400126f),
                new Color(0.869203f, 0.374212f, 0.396738f),
                new Color(0.872303f, 0.378774f, 0.393355f),
                new Color(0.875376f, 0.383347f, 0.389976f),
                new Color(0.878423f, 0.387932f, 0.386600f),
                new Color(0.881443f, 0.392529f, 0.383229f),
                new Color(0.884436f, 0.397139f, 0.379860f),
                new Color(0.887402f, 0.401762f, 0.376494f),
                new Color(0.890340f, 0.406398f, 0.373130f),
                new Color(0.893250f, 0.411048f, 0.369768f),
                new Color(0.896131f, 0.415712f, 0.366407f),
                new Color(0.898984f, 0.420392f, 0.363047f),
                new Color(0.901807f, 0.425087f, 0.359688f),
                new Color(0.904601f, 0.429797f, 0.356329f),
                new Color(0.907365f, 0.434524f, 0.352970f),
                new Color(0.910098f, 0.439268f, 0.349610f),
                new Color(0.912800f, 0.444029f, 0.346251f),
                new Color(0.915471f, 0.448807f, 0.342890f),
                new Color(0.918109f, 0.453603f, 0.339529f),
                new Color(0.920714f, 0.458417f, 0.336166f),
                new Color(0.923287f, 0.463251f, 0.332801f),
                new Color(0.925825f, 0.468103f, 0.329435f),
                new Color(0.928329f, 0.472975f, 0.326067f),
                new Color(0.930798f, 0.477867f, 0.322697f),
                new Color(0.933232f, 0.482780f, 0.319325f),
                new Color(0.935630f, 0.487712f, 0.315952f),
                new Color(0.937990f, 0.492667f, 0.312575f),
                new Color(0.940313f, 0.497642f, 0.309197f),
                new Color(0.942598f, 0.502639f, 0.305816f),
                new Color(0.944844f, 0.507658f, 0.302433f),
                new Color(0.947051f, 0.512699f, 0.299049f),
                new Color(0.949217f, 0.517763f, 0.295662f),
                new Color(0.951344f, 0.522850f, 0.292275f),
                new Color(0.953428f, 0.527960f, 0.288883f),
                new Color(0.955470f, 0.533093f, 0.285490f),
                new Color(0.957469f, 0.538250f, 0.282096f),
                new Color(0.959424f, 0.543431f, 0.278701f),
                new Color(0.961336f, 0.548636f, 0.275305f),
                new Color(0.963203f, 0.553865f, 0.271909f),
                new Color(0.965024f, 0.559118f, 0.268513f),
                new Color(0.966798f, 0.564396f, 0.265118f),
                new Color(0.968526f, 0.569700f, 0.261721f),
                new Color(0.970205f, 0.575028f, 0.258325f),
                new Color(0.971835f, 0.580382f, 0.254931f),
                new Color(0.973416f, 0.585761f, 0.251540f),
                new Color(0.974947f, 0.591165f, 0.248151f),
                new Color(0.976428f, 0.596595f, 0.244767f),
                new Color(0.977856f, 0.602051f, 0.241387f),
                new Color(0.979233f, 0.607532f, 0.238013f),
                new Color(0.980556f, 0.613039f, 0.234646f),
                new Color(0.981826f, 0.618572f, 0.231287f),
                new Color(0.983041f, 0.624131f, 0.227937f),
                new Color(0.984199f, 0.629718f, 0.224595f),
                new Color(0.985301f, 0.635330f, 0.221265f),
                new Color(0.986345f, 0.640969f, 0.217948f),
                new Color(0.987332f, 0.646633f, 0.214648f),
                new Color(0.988260f, 0.652325f, 0.211364f),
                new Color(0.989128f, 0.658043f, 0.208100f),
                new Color(0.989935f, 0.663787f, 0.204859f),
                new Color(0.990681f, 0.669558f, 0.201642f),
                new Color(0.991365f, 0.675355f, 0.198453f),
                new Color(0.991985f, 0.681179f, 0.195295f),
                new Color(0.992541f, 0.687030f, 0.192170f),
                new Color(0.993032f, 0.692907f, 0.189084f),
                new Color(0.993456f, 0.698810f, 0.186041f),
                new Color(0.993814f, 0.704741f, 0.183043f),
                new Color(0.994103f, 0.710698f, 0.180097f),
                new Color(0.994324f, 0.716681f, 0.177208f),
                new Color(0.994474f, 0.722691f, 0.174381f),
                new Color(0.994553f, 0.728728f, 0.171622f),
                new Color(0.994561f, 0.734791f, 0.168938f),
                new Color(0.994495f, 0.740880f, 0.166335f),
                new Color(0.994355f, 0.746995f, 0.163821f),
                new Color(0.994141f, 0.753137f, 0.161404f),
                new Color(0.993851f, 0.759304f, 0.159092f),
                new Color(0.993482f, 0.765499f, 0.156891f),
                new Color(0.993033f, 0.771720f, 0.154808f),
                new Color(0.992505f, 0.777967f, 0.152855f),
                new Color(0.991897f, 0.784239f, 0.151042f),
                new Color(0.991209f, 0.790537f, 0.149377f),
                new Color(0.990439f, 0.796859f, 0.147870f),
                new Color(0.989587f, 0.803205f, 0.146529f),
                new Color(0.988648f, 0.809579f, 0.145357f),
                new Color(0.987621f, 0.815978f, 0.144363f),
                new Color(0.986509f, 0.822401f, 0.143557f),
                new Color(0.985314f, 0.828846f, 0.142945f),
                new Color(0.984031f, 0.835315f, 0.142528f),
                new Color(0.982653f, 0.841812f, 0.142303f),
                new Color(0.981190f, 0.848329f, 0.142279f),
                new Color(0.979644f, 0.854866f, 0.142453f),
                new Color(0.977995f, 0.861432f, 0.142808f),
                new Color(0.976265f, 0.868016f, 0.143351f),
                new Color(0.974443f, 0.874622f, 0.144061f),
                new Color(0.972530f, 0.881250f, 0.144923f),
                new Color(0.970533f, 0.887896f, 0.145919f),
                new Color(0.968443f, 0.894564f, 0.147014f),
                new Color(0.966271f, 0.901249f, 0.148180f),
                new Color(0.964021f, 0.907950f, 0.149370f),
                new Color(0.961681f, 0.914672f, 0.150520f),
                new Color(0.959276f, 0.921407f, 0.151566f),
                new Color(0.956808f, 0.928152f, 0.152409f),
                new Color(0.954287f, 0.934908f, 0.152921f),
                new Color(0.951726f, 0.941671f, 0.152925f),
                new Color(0.949151f, 0.948435f, 0.152178f),
                new Color(0.946602f, 0.955190f, 0.150328f),
                new Color(0.944152f, 0.961916f, 0.146861f),
                new Color(0.941896f, 0.968590f, 0.140956f),
                new Color(0.940015f, 0.975158f, 0.131326f)
        );
    }


}
