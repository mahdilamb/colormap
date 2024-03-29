package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * MPL Magma
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Magma",source = "Matplotlib")
public final class Magma extends SequentialColormap {
    /**
     * Create a colormap based on MPL Magna
     */
    public Magma() {
        //data from https://github.com/matplotlib/matplotlib/blob/f2116d82dfd6b82fe178230766d95ea9ac2b0c8c/lib/matplotlib/_cm_listed.py#L1288
        super(
                new Color(0.001462f, 0.000466f, 0.013866f),
                new Color(0.002258f, 0.001295f, 0.018331f),
                new Color(0.003279f, 0.002305f, 0.023708f),
                new Color(0.004512f, 0.003490f, 0.029965f),
                new Color(0.005950f, 0.004843f, 0.037130f),
                new Color(0.007588f, 0.006356f, 0.044973f),
                new Color(0.009426f, 0.008022f, 0.052844f),
                new Color(0.011465f, 0.009828f, 0.060750f),
                new Color(0.013708f, 0.011771f, 0.068667f),
                new Color(0.016156f, 0.013840f, 0.076603f),
                new Color(0.018815f, 0.016026f, 0.084584f),
                new Color(0.021692f, 0.018320f, 0.092610f),
                new Color(0.024792f, 0.020715f, 0.100676f),
                new Color(0.028123f, 0.023201f, 0.108787f),
                new Color(0.031696f, 0.025765f, 0.116965f),
                new Color(0.035520f, 0.028397f, 0.125209f),
                new Color(0.039608f, 0.031090f, 0.133515f),
                new Color(0.043830f, 0.033830f, 0.141886f),
                new Color(0.048062f, 0.036607f, 0.150327f),
                new Color(0.052320f, 0.039407f, 0.158841f),
                new Color(0.056615f, 0.042160f, 0.167446f),
                new Color(0.060949f, 0.044794f, 0.176129f),
                new Color(0.065330f, 0.047318f, 0.184892f),
                new Color(0.069764f, 0.049726f, 0.193735f),
                new Color(0.074257f, 0.052017f, 0.202660f),
                new Color(0.078815f, 0.054184f, 0.211667f),
                new Color(0.083446f, 0.056225f, 0.220755f),
                new Color(0.088155f, 0.058133f, 0.229922f),
                new Color(0.092949f, 0.059904f, 0.239164f),
                new Color(0.097833f, 0.061531f, 0.248477f),
                new Color(0.102815f, 0.063010f, 0.257854f),
                new Color(0.107899f, 0.064335f, 0.267289f),
                new Color(0.113094f, 0.065492f, 0.276784f),
                new Color(0.118405f, 0.066479f, 0.286321f),
                new Color(0.123833f, 0.067295f, 0.295879f),
                new Color(0.129380f, 0.067935f, 0.305443f),
                new Color(0.135053f, 0.068391f, 0.315000f),
                new Color(0.140858f, 0.068654f, 0.324538f),
                new Color(0.146785f, 0.068738f, 0.334011f),
                new Color(0.152839f, 0.068637f, 0.343404f),
                new Color(0.159018f, 0.068354f, 0.352688f),
                new Color(0.165308f, 0.067911f, 0.361816f),
                new Color(0.171713f, 0.067305f, 0.370771f),
                new Color(0.178212f, 0.066576f, 0.379497f),
                new Color(0.184801f, 0.065732f, 0.387973f),
                new Color(0.191460f, 0.064818f, 0.396152f),
                new Color(0.198177f, 0.063862f, 0.404009f),
                new Color(0.204935f, 0.062907f, 0.411514f),
                new Color(0.211718f, 0.061992f, 0.418647f),
                new Color(0.218512f, 0.061158f, 0.425392f),
                new Color(0.225302f, 0.060445f, 0.431742f),
                new Color(0.232077f, 0.059889f, 0.437695f),
                new Color(0.238826f, 0.059517f, 0.443256f),
                new Color(0.245543f, 0.059352f, 0.448436f),
                new Color(0.252220f, 0.059415f, 0.453248f),
                new Color(0.258857f, 0.059706f, 0.457710f),
                new Color(0.265447f, 0.060237f, 0.461840f),
                new Color(0.271994f, 0.060994f, 0.465660f),
                new Color(0.278493f, 0.061978f, 0.469190f),
                new Color(0.284951f, 0.063168f, 0.472451f),
                new Color(0.291366f, 0.064553f, 0.475462f),
                new Color(0.297740f, 0.066117f, 0.478243f),
                new Color(0.304081f, 0.067835f, 0.480812f),
                new Color(0.310382f, 0.069702f, 0.483186f),
                new Color(0.316654f, 0.071690f, 0.485380f),
                new Color(0.322899f, 0.073782f, 0.487408f),
                new Color(0.329114f, 0.075972f, 0.489287f),
                new Color(0.335308f, 0.078236f, 0.491024f),
                new Color(0.341482f, 0.080564f, 0.492631f),
                new Color(0.347636f, 0.082946f, 0.494121f),
                new Color(0.353773f, 0.085373f, 0.495501f),
                new Color(0.359898f, 0.087831f, 0.496778f),
                new Color(0.366012f, 0.090314f, 0.497960f),
                new Color(0.372116f, 0.092816f, 0.499053f),
                new Color(0.378211f, 0.095332f, 0.500067f),
                new Color(0.384299f, 0.097855f, 0.501002f),
                new Color(0.390384f, 0.100379f, 0.501864f),
                new Color(0.396467f, 0.102902f, 0.502658f),
                new Color(0.402548f, 0.105420f, 0.503386f),
                new Color(0.408629f, 0.107930f, 0.504052f),
                new Color(0.414709f, 0.110431f, 0.504662f),
                new Color(0.420791f, 0.112920f, 0.505215f),
                new Color(0.426877f, 0.115395f, 0.505714f),
                new Color(0.432967f, 0.117855f, 0.506160f),
                new Color(0.439062f, 0.120298f, 0.506555f),
                new Color(0.445163f, 0.122724f, 0.506901f),
                new Color(0.451271f, 0.125132f, 0.507198f),
                new Color(0.457386f, 0.127522f, 0.507448f),
                new Color(0.463508f, 0.129893f, 0.507652f),
                new Color(0.469640f, 0.132245f, 0.507809f),
                new Color(0.475780f, 0.134577f, 0.507921f),
                new Color(0.481929f, 0.136891f, 0.507989f),
                new Color(0.488088f, 0.139186f, 0.508011f),
                new Color(0.494258f, 0.141462f, 0.507988f),
                new Color(0.500438f, 0.143719f, 0.507920f),
                new Color(0.506629f, 0.145958f, 0.507806f),
                new Color(0.512831f, 0.148179f, 0.507648f),
                new Color(0.519045f, 0.150383f, 0.507443f),
                new Color(0.525270f, 0.152569f, 0.507192f),
                new Color(0.531507f, 0.154739f, 0.506895f),
                new Color(0.537755f, 0.156894f, 0.506551f),
                new Color(0.544015f, 0.159033f, 0.506159f),
                new Color(0.550287f, 0.161158f, 0.505719f),
                new Color(0.556571f, 0.163269f, 0.505230f),
                new Color(0.562866f, 0.165368f, 0.504692f),
                new Color(0.569172f, 0.167454f, 0.504105f),
                new Color(0.575490f, 0.169530f, 0.503466f),
                new Color(0.581819f, 0.171596f, 0.502777f),
                new Color(0.588158f, 0.173652f, 0.502035f),
                new Color(0.594508f, 0.175701f, 0.501241f),
                new Color(0.600868f, 0.177743f, 0.500394f),
                new Color(0.607238f, 0.179779f, 0.499492f),
                new Color(0.613617f, 0.181811f, 0.498536f),
                new Color(0.620005f, 0.183840f, 0.497524f),
                new Color(0.626401f, 0.185867f, 0.496456f),
                new Color(0.632805f, 0.187893f, 0.495332f),
                new Color(0.639216f, 0.189921f, 0.494150f),
                new Color(0.645633f, 0.191952f, 0.492910f),
                new Color(0.652056f, 0.193986f, 0.491611f),
                new Color(0.658483f, 0.196027f, 0.490253f),
                new Color(0.664915f, 0.198075f, 0.488836f),
                new Color(0.671349f, 0.200133f, 0.487358f),
                new Color(0.677786f, 0.202203f, 0.485819f),
                new Color(0.684224f, 0.204286f, 0.484219f),
                new Color(0.690661f, 0.206384f, 0.482558f),
                new Color(0.697098f, 0.208501f, 0.480835f),
                new Color(0.703532f, 0.210638f, 0.479049f),
                new Color(0.709962f, 0.212797f, 0.477201f),
                new Color(0.716387f, 0.214982f, 0.475290f),
                new Color(0.722805f, 0.217194f, 0.473316f),
                new Color(0.729216f, 0.219437f, 0.471279f),
                new Color(0.735616f, 0.221713f, 0.469180f),
                new Color(0.742004f, 0.224025f, 0.467018f),
                new Color(0.748378f, 0.226377f, 0.464794f),
                new Color(0.754737f, 0.228772f, 0.462509f),
                new Color(0.761077f, 0.231214f, 0.460162f),
                new Color(0.767398f, 0.233705f, 0.457755f),
                new Color(0.773695f, 0.236249f, 0.455289f),
                new Color(0.779968f, 0.238851f, 0.452765f),
                new Color(0.786212f, 0.241514f, 0.450184f),
                new Color(0.792427f, 0.244242f, 0.447543f),
                new Color(0.798608f, 0.247040f, 0.444848f),
                new Color(0.804752f, 0.249911f, 0.442102f),
                new Color(0.810855f, 0.252861f, 0.439305f),
                new Color(0.816914f, 0.255895f, 0.436461f),
                new Color(0.822926f, 0.259016f, 0.433573f),
                new Color(0.828886f, 0.262229f, 0.430644f),
                new Color(0.834791f, 0.265540f, 0.427671f),
                new Color(0.840636f, 0.268953f, 0.424666f),
                new Color(0.846416f, 0.272473f, 0.421631f),
                new Color(0.852126f, 0.276106f, 0.418573f),
                new Color(0.857763f, 0.279857f, 0.415496f),
                new Color(0.863320f, 0.283729f, 0.412403f),
                new Color(0.868793f, 0.287728f, 0.409303f),
                new Color(0.874176f, 0.291859f, 0.406205f),
                new Color(0.879464f, 0.296125f, 0.403118f),
                new Color(0.884651f, 0.300530f, 0.400047f),
                new Color(0.889731f, 0.305079f, 0.397002f),
                new Color(0.894700f, 0.309773f, 0.393995f),
                new Color(0.899552f, 0.314616f, 0.391037f),
                new Color(0.904281f, 0.319610f, 0.388137f),
                new Color(0.908884f, 0.324755f, 0.385308f),
                new Color(0.913354f, 0.330052f, 0.382563f),
                new Color(0.917689f, 0.335500f, 0.379915f),
                new Color(0.921884f, 0.341098f, 0.377376f),
                new Color(0.925937f, 0.346844f, 0.374959f),
                new Color(0.929845f, 0.352734f, 0.372677f),
                new Color(0.933606f, 0.358764f, 0.370541f),
                new Color(0.937221f, 0.364929f, 0.368567f),
                new Color(0.940687f, 0.371224f, 0.366762f),
                new Color(0.944006f, 0.377643f, 0.365136f),
                new Color(0.947180f, 0.384178f, 0.363701f),
                new Color(0.950210f, 0.390820f, 0.362468f),
                new Color(0.953099f, 0.397563f, 0.361438f),
                new Color(0.955849f, 0.404400f, 0.360619f),
                new Color(0.958464f, 0.411324f, 0.360014f),
                new Color(0.960949f, 0.418323f, 0.359630f),
                new Color(0.963310f, 0.425390f, 0.359469f),
                new Color(0.965549f, 0.432519f, 0.359529f),
                new Color(0.967671f, 0.439703f, 0.359810f),
                new Color(0.969680f, 0.446936f, 0.360311f),
                new Color(0.971582f, 0.454210f, 0.361030f),
                new Color(0.973381f, 0.461520f, 0.361965f),
                new Color(0.975082f, 0.468861f, 0.363111f),
                new Color(0.976690f, 0.476226f, 0.364466f),
                new Color(0.978210f, 0.483612f, 0.366025f),
                new Color(0.979645f, 0.491014f, 0.367783f),
                new Color(0.981000f, 0.498428f, 0.369734f),
                new Color(0.982279f, 0.505851f, 0.371874f),
                new Color(0.983485f, 0.513280f, 0.374198f),
                new Color(0.984622f, 0.520713f, 0.376698f),
                new Color(0.985693f, 0.528148f, 0.379371f),
                new Color(0.986700f, 0.535582f, 0.382210f),
                new Color(0.987646f, 0.543015f, 0.385210f),
                new Color(0.988533f, 0.550446f, 0.388365f),
                new Color(0.989363f, 0.557873f, 0.391671f),
                new Color(0.990138f, 0.565296f, 0.395122f),
                new Color(0.990871f, 0.572706f, 0.398714f),
                new Color(0.991558f, 0.580107f, 0.402441f),
                new Color(0.992196f, 0.587502f, 0.406299f),
                new Color(0.992785f, 0.594891f, 0.410283f),
                new Color(0.993326f, 0.602275f, 0.414390f),
                new Color(0.993834f, 0.609644f, 0.418613f),
                new Color(0.994309f, 0.616999f, 0.422950f),
                new Color(0.994738f, 0.624350f, 0.427397f),
                new Color(0.995122f, 0.631696f, 0.431951f),
                new Color(0.995480f, 0.639027f, 0.436607f),
                new Color(0.995810f, 0.646344f, 0.441361f),
                new Color(0.996096f, 0.653659f, 0.446213f),
                new Color(0.996341f, 0.660969f, 0.451160f),
                new Color(0.996580f, 0.668256f, 0.456192f),
                new Color(0.996775f, 0.675541f, 0.461314f),
                new Color(0.996925f, 0.682828f, 0.466526f),
                new Color(0.997077f, 0.690088f, 0.471811f),
                new Color(0.997186f, 0.697349f, 0.477182f),
                new Color(0.997254f, 0.704611f, 0.482635f),
                new Color(0.997325f, 0.711848f, 0.488154f),
                new Color(0.997351f, 0.719089f, 0.493755f),
                new Color(0.997351f, 0.726324f, 0.499428f),
                new Color(0.997341f, 0.733545f, 0.505167f),
                new Color(0.997285f, 0.740772f, 0.510983f),
                new Color(0.997228f, 0.747981f, 0.516859f),
                new Color(0.997138f, 0.755190f, 0.522806f),
                new Color(0.997019f, 0.762398f, 0.528821f),
                new Color(0.996898f, 0.769591f, 0.534892f),
                new Color(0.996727f, 0.776795f, 0.541039f),
                new Color(0.996571f, 0.783977f, 0.547233f),
                new Color(0.996369f, 0.791167f, 0.553499f),
                new Color(0.996162f, 0.798348f, 0.559820f),
                new Color(0.995932f, 0.805527f, 0.566202f),
                new Color(0.995680f, 0.812706f, 0.572645f),
                new Color(0.995424f, 0.819875f, 0.579140f),
                new Color(0.995131f, 0.827052f, 0.585701f),
                new Color(0.994851f, 0.834213f, 0.592307f),
                new Color(0.994524f, 0.841387f, 0.598983f),
                new Color(0.994222f, 0.848540f, 0.605696f),
                new Color(0.993866f, 0.855711f, 0.612482f),
                new Color(0.993545f, 0.862859f, 0.619299f),
                new Color(0.993170f, 0.870024f, 0.626189f),
                new Color(0.992831f, 0.877168f, 0.633109f),
                new Color(0.992440f, 0.884330f, 0.640099f),
                new Color(0.992089f, 0.891470f, 0.647116f),
                new Color(0.991688f, 0.898627f, 0.654202f),
                new Color(0.991332f, 0.905763f, 0.661309f),
                new Color(0.990930f, 0.912915f, 0.668481f),
                new Color(0.990570f, 0.920049f, 0.675675f),
                new Color(0.990175f, 0.927196f, 0.682926f),
                new Color(0.989815f, 0.934329f, 0.690198f),
                new Color(0.989434f, 0.941470f, 0.697519f),
                new Color(0.989077f, 0.948604f, 0.704863f),
                new Color(0.988717f, 0.955742f, 0.712242f),
                new Color(0.988367f, 0.962878f, 0.719649f),
                new Color(0.988033f, 0.970012f, 0.727077f),
                new Color(0.987691f, 0.977154f, 0.734536f),
                new Color(0.987387f, 0.984288f, 0.742002f),
                new Color(0.987053f, 0.991438f, 0.749504f)
        );


    }


}
