package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Kenneth Moreland's Blackbody colormap.
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "BlackBodyExtended", source = "Kenneth Moreland")
public final class BlackBodyExtended extends SequentialColormap {
    /**
     * Create a colormap based on Kenneth Moreland's Blackbody colormap.
     */
    public BlackBodyExtended() {
        super(
                Color.BLACK,
                new Color(0.0101374824394f, 0.00309707775864f, 0.0186947688226f),
                new Color(0.0202749648788f, 0.00619415551729f, 0.0373895376451f),
                new Color(0.0304124473182f, 0.00929123327593f, 0.0543730466212f),
                new Color(0.040548151584f, 0.0123883110346f, 0.0683014309138f),
                new Color(0.0498579739205f, 0.0154853887932f, 0.080315419637f),
                new Color(0.0581341316501f, 0.0185824665519f, 0.090995501602f),
                new Color(0.0656336351649f, 0.021680071775f, 0.100691391737f),
                new Color(0.0722475202415f, 0.0248071597449f, 0.110174306594f),
                new Color(0.0779826615536f, 0.0279817253797f, 0.119793697403f),
                new Color(0.0829641829057f, 0.0312059576425f, 0.129541188996f),
                new Color(0.0872790832235f, 0.0344820454969f, 0.13940964359f),
                new Color(0.0909891256343f, 0.0378121779064f, 0.149392909739f),
                new Color(0.0941383905599f, 0.0411820117344f, 0.159485630993f),
                new Color(0.0969160200013f, 0.0443652873369f, 0.169685195162f),
                new Color(0.0998107233034f, 0.04711415805f, 0.179993141326f),
                new Color(0.102843166557f, 0.0494512524379f, 0.19040491396f),
                new Color(0.106002189299f, 0.0514066954333f, 0.200916098665f),
                new Color(0.109277239325f, 0.0530022446943f, 0.211522770989f),
                new Color(0.112658408967f, 0.0542531048798f, 0.222221417868f),
                new Color(0.116136450397f, 0.0551690978407f, 0.23300887421f),
                new Color(0.119680576749f, 0.0558051633455f, 0.243880789372f),
                new Color(0.123192906339f, 0.0563721135831f, 0.254828771755f),
                new Color(0.126664392264f, 0.0568909056844f, 0.265850766721f),
                new Color(0.130095818409f, 0.0573607083348f, 0.276945442487f),
                new Color(0.133487907948f, 0.0577806246547f, 0.288111512743f),
                new Color(0.136841329227f, 0.0581496879472f, 0.299347735292f),
                new Color(0.140156700901f, 0.0584668568752f, 0.310652910572f),
                new Color(0.143434596431f, 0.0587310100025f, 0.322025880087f),
                new Color(0.146675548039f, 0.0589409396126f, 0.333465524819f),
                new Color(0.149880050191f, 0.0590953447116f, 0.344970763632f),
                new Color(0.153048562691f, 0.0591928230953f, 0.35654055169f),
                new Color(0.156181513418f, 0.0592318623446f, 0.36817387892f),
                new Color(0.159279300771f, 0.0592108295833f, 0.379869768509f),
                new Color(0.162342295854f, 0.0591279597989f, 0.391627275457f),
                new Color(0.165370844426f, 0.0589813424887f, 0.403445485185f),
                new Color(0.168365268657f, 0.0587689063413f, 0.415323512202f),
                new Color(0.171325868712f, 0.0584884016013f, 0.427260498829f),
                new Color(0.17425292417f, 0.0581373796878f, 0.43925561398f),
                new Color(0.177146695316f, 0.0577131695345f, 0.451308052009f),
                new Color(0.180007424306f, 0.0572128499968f, 0.463417031598f),
                new Color(0.182835336226f, 0.0566332175033f, 0.475581794718f),
                new Color(0.185630640054f, 0.0559707479213f, 0.487801605626f),
                new Color(0.188393529533f, 0.0552215513258f, 0.500075749922f),
                new Color(0.191124183972f, 0.0543813179974f, 0.512403533651f),
                new Color(0.19382276897f, 0.0534452534807f, 0.524784282449f),
                new Color(0.196489437086f, 0.0524079998731f, 0.537217340735f),
                new Color(0.199124328442f, 0.0512635396022f, 0.549702070943f),
                new Color(0.201727571284f, 0.050005076683f, 0.562237852788f),
                new Color(0.204299282487f, 0.0486248886588f, 0.574824082583f),
                new Color(0.206839568024f, 0.047114139861f, 0.58746017257f),
                new Color(0.209348523395f, 0.045462642867f, 0.600145550302f),
                new Color(0.211826234018f, 0.0436585494237f, 0.612879658048f),
                new Color(0.214272775586f, 0.0416879435341f, 0.625661952227f),
                new Color(0.216688214399f, 0.0395249342808f, 0.638491902868f),
                new Color(0.219072607667f, 0.0372013664489f, 0.651368993107f),
                new Color(0.222929794331f, 0.0345647549557f, 0.662964568291f),
                new Color(0.231793628696f, 0.0311578128252f, 0.670094461482f),
                new Color(0.240556567405f, 0.0275842456758f, 0.67723851665f),
                new Color(0.249229931956f, 0.0238413112563f, 0.684396650051f),
                new Color(0.257823522899f, 0.0199262673159f, 0.691568779078f),
                new Color(0.266345878381f, 0.0158363716034f, 0.698754822242f),
                new Color(0.274804479751f, 0.0115688818679f, 0.705954699143f),
                new Color(0.283205916767f, 0.00712105585842f, 0.71316833045f),
                new Color(0.291556021641f, 0.00249015132382f, 0.720395637879f),
                new Color(0.299859978739f, 0f, 0.727636544174f),
                new Color(0.308122415092f, 0f, 0.734890973082f),
                new Color(0.316347475619f, 0f, 0.742158849334f),
                new Color(0.324538886078f, 0f, 0.749440098628f),
                new Color(0.332700006078f, 0f, 0.756734647608f),
                new Color(0.340833873984f, 0f, 0.764042423846f),
                new Color(0.34894324516f, 0f, 0.771363355821f),
                new Color(0.357030624712f, 0f, 0.778697372906f),
                new Color(0.365098295648f, 0f, 0.78604440535f),
                new Color(0.373148343212f, 0f, 0.793404384256f),
                new Color(0.381182675996f, 0f, 0.800777241571f),
                new Color(0.389203044328f, 0f, 0.808162910069f),
                new Color(0.397211056351f, 0f, 0.815561323331f),
                new Color(0.405208192133f, 0f, 0.822972415735f),
                new Color(0.413195816086f, 0f, 0.830396122439f),
                new Color(0.421175187933f, 0f, 0.837832379368f),
                new Color(0.429147472424f, 0f, 0.845281123198f),
                new Color(0.43711374797f, 0f, 0.852742291342f),
                new Color(0.445075014323f, 0f, 0.860215821941f),
                new Color(0.453032199444f, 0f, 0.867701653845f),
                new Color(0.460986165649f, 0f, 0.875199726605f),
                new Color(0.468937715122f, 0f, 0.882709980459f),
                new Color(0.476887594869f, 0f, 0.890232356319f),
                new Color(0.485004625388f, 0f, 0.897461019709f),
                new Color(0.508009259543f, 0f, 0.875902611884f),
                new Color(0.529298474394f, 0f, 0.854427239533f),
                new Color(0.54911487266f, 0f, 0.83303506856f),
                new Color(0.567648947223f, 0f, 0.811726188858f),
                new Color(0.585053610254f, 0f, 0.790500601661f),
                new Color(0.60145390233f, 0f, 0.769358204835f),
                new Color(0.616953700927f, 0f, 0.748298775698f),
                new Color(0.631640488426f, 0f, 0.727321950911f),
                new Color(0.645588823947f, 0f, 0.706427202873f),
                new Color(0.658862924978f, 0f, 0.685613811912f),
                new Color(0.671518622656f, 0f, 0.664880833402f),
                new Color(0.683604866855f, 0f, 0.644227058756f),
                new Color(0.69516490159f, 0f, 0.62365096892f),
                new Color(0.706237194862f, 0f, 0.603150678717f),
                new Color(0.716856182865f, 0f, 0.582723869881f),
                new Color(0.727052871904f, 0f, 0.562367710068f),
                new Color(0.736855329917f, 0f, 0.542078754329f),
                new Color(0.746289091365f, 0f, 0.521852824484f),
                new Color(0.755377493438f, 0f, 0.501684860407f),
                new Color(0.764141957288f, 0f, 0.481568735273f),
                new Color(0.772602224874f, 0f, 0.461497024097f),
                new Color(0.780776559685f, 0f, 0.441460711021f),
                new Color(0.788681917828f, 0f, 0.421448815304f),
                new Color(0.796334094645f, 0f, 0.401447907855f),
                new Color(0.803747850989f, 0f, 0.381441478118f),
                new Color(0.810937022485f, 0f, 0.361409092755f),
                new Color(0.817914614473f, 0f, 0.341325258857f),
                new Color(0.824692884841f, 0.0000734011567811f, 0.321157858384f),
                new Color(0.831283416568f, 0.0163630224312f, 0.300865944086f),
                new Color(0.837697181463f, 0.0333073217846f, 0.280396555777f),
                new Color(0.843944596359f, 0.0500422611734f, 0.259679979992f),
                new Color(0.849847850481f, 0.0649438388555f, 0.239913764598f),
                new Color(0.852783913041f, 0.0857351146746f, 0.239847850553f),
                new Color(0.855713686243f, 0.10323174513f, 0.239769030361f),
                new Color(0.858637176783f, 0.118638315272f, 0.239677178099f),
                new Color(0.861554391302f, 0.132579566531f, 0.239572165219f),
                new Color(0.864465336393f, 0.145427102824f, 0.239453860465f),
                new Color(0.867370018594f, 0.157422331241f, 0.23932212979f),
                new Color(0.870268444391f, 0.168732091717f, 0.239176836258f),
                new Color(0.873160620215f, 0.17947711643f, 0.239017839954f),
                new Color(0.876046552444f, 0.18974793649f, 0.238844997886f),
                new Color(0.878926247401f, 0.199614390364f, 0.238658163878f),
                new Color(0.881799711355f, 0.209131616384f, 0.238457188469f),
                new Color(0.884666950518f, 0.218343994573f, 0.238241918797f),
                new Color(0.887527971048f, 0.227287832959f, 0.238012198488f),
                new Color(0.890382779045f, 0.235993253593f, 0.237767867528f),
                new Color(0.893231380554f, 0.244485550793f, 0.237508762146f),
                new Color(0.896073781563f, 0.252786190995f, 0.237234714675f),
                new Color(0.898909988002f, 0.260913563029f, 0.236945553419f),
                new Color(0.901740005746f, 0.268883550695f, 0.236641102506f),
                new Color(0.90456384061f, 0.276709976321f, 0.236321181742f),
                new Color(0.907381498352f, 0.284404948997f, 0.235985606449f),
                new Color(0.910192984675f, 0.291979141289f, 0.235634187307f),
                new Color(0.912998305219f, 0.299442011521f, 0.235266730178f),
                new Color(0.915797465569f, 0.30680198411f, 0.234883035925f),
                new Color(0.918590471251f, 0.314066597184f, 0.234482900226f),
                new Color(0.921377327732f, 0.321242624441f, 0.234066113378f),
                new Color(0.924158040421f, 0.328336176485f, 0.233632460084f),
                new Color(0.926932614668f, 0.335352785717f, 0.23318171924f),
                new Color(0.929701055763f, 0.34229747789f, 0.232713663703f),
                new Color(0.932463368938f, 0.349174832795f, 0.232228060055f),
                new Color(0.935219559368f, 0.355989036026f, 0.231724668345f),
                new Color(0.937969632164f, 0.362743923355f, 0.231203241827f),
                new Color(0.940713592384f, 0.369443018963f, 0.230663526679f),
                new Color(0.943451445021f, 0.376089568541f, 0.230105261709f),
                new Color(0.946183195012f, 0.382686568047f, 0.229528178041f),
                new Color(0.948908847236f, 0.389236788818f, 0.228931998794f),
                new Color(0.951628406509f, 0.395742799569f, 0.228316438729f),
                new Color(0.954341877591f, 0.402206985731f, 0.227681203888f),
                new Color(0.957049265181f, 0.408631566522f, 0.227025991208f),
                new Color(0.959750573919f, 0.415018610051f, 0.226350488109f),
                new Color(0.962445808388f, 0.421370046735f, 0.225654372069f),
                new Color(0.965134973109f, 0.427687681239f, 0.224937310159f),
                new Color(0.967818072544f, 0.433973203149f, 0.224198958563f),
                new Color(0.970495111099f, 0.440228196515f, 0.223438962061f),
                new Color(0.973166093118f, 0.446454148428f, 0.222656953484f),
                new Color(0.975831022887f, 0.452652456733f, 0.221852553134f),
                new Color(0.978489904633f, 0.458824436978f, 0.221025368166f),
                new Color(0.978326336078f, 0.467275306816f, 0.219581026038f),
                new Color(0.977407887448f, 0.476216983171f, 0.217945137057f),
                new Color(0.976460212659f, 0.485050990935f, 0.216268570734f),
                new Color(0.975483038855f, 0.493783717836f, 0.21455014879f),
                new Color(0.974476088283f, 0.502421017023f, 0.212788629034f),
                new Color(0.973439078159f, 0.510968266092f, 0.210982700349f),
                new Color(0.972371720526f, 0.519430418083f, 0.209130977158f),
                new Color(0.971273722106f, 0.527812045722f, 0.207231993306f),
                new Color(0.970144784151f, 0.536117379961f, 0.205284195284f),
                new Color(0.968984602287f, 0.544350343702f, 0.203285934695f),
                new Color(0.967792866347f, 0.552514581399f, 0.201235459869f),
                new Color(0.96656926021f, 0.560613485139f, 0.199130906497f),
                new Color(0.96531346162f, 0.568650217707f, 0.196970287147f),
                new Color(0.96402514201f, 0.576627733036f, 0.19475147949f),
                new Color(0.962703966311f, 0.584548794395f, 0.192472213031f),
                new Color(0.961349592762f, 0.592415990625f, 0.19013005413f),
                new Color(0.959961672704f, 0.600231750648f, 0.187722389f),
                new Color(0.958539850371f, 0.607998356494f, 0.185246404369f),
                new Color(0.957083762677f, 0.615717954997f, 0.182699065391f),
                new Color(0.955593038983f, 0.623392568352f, 0.180077090305f),
                new Color(0.954067300869f, 0.631024103638f, 0.177376921246f),
                new Color(0.952506161882f, 0.638614361439f, 0.174594690477f),
                new Color(0.950909227291f, 0.646165043674f, 0.171726181113f),
                new Color(0.949276093816f, 0.653677760698f, 0.168766781215f),
                new Color(0.947606349356f, 0.661154037779f, 0.165711429842f),
                new Color(0.945899572699f, 0.668595321005f, 0.16255455324f),
                new Color(0.94415533323f, 0.676002982678f, 0.159289988917f),
                new Color(0.942373190614f, 0.683378326253f, 0.155910894638f),
                new Color(0.940552694478f, 0.690722590871f, 0.152409638545f),
                new Color(0.938693384065f, 0.698036955514f, 0.148777665371f),
                new Color(0.936794787891f, 0.705322542833f, 0.145005332103f),
                new Color(0.934856423369f, 0.712580422673f, 0.141081704112f),
                new Color(0.93287779643f, 0.719811615317f, 0.136994299516f),
                new Color(0.930858401119f, 0.727017094494f, 0.132728764762f),
                new Color(0.928797719178f, 0.734197790149f, 0.128268457446f),
                new Color(0.926695219605f, 0.741354591018f, 0.123593901827f),
                new Color(0.924550358196f, 0.748488347006f, 0.118682066221f),
                new Color(0.922362577067f, 0.755599871405f, 0.113505385676f),
                new Color(0.92013130415f, 0.762689942944f, 0.108030411151f),
                new Color(0.917855952666f, 0.769759307704f, 0.102215895045f),
                new Color(0.915535920574f, 0.776808680896f, 0.0960099971103f),
                new Color(0.913170589992f, 0.783838748527f, 0.0893460619973f),
                new Color(0.910759326593f, 0.790850168944f, 0.0821359641994f),
                new Color(0.908301478963f, 0.797843574283f, 0.0742590606018f),
                new Color(0.905796377936f, 0.804819571825f, 0.0655426065723f),
                new Color(0.903243335889f, 0.81177874526f, 0.0557239136507f),
                new Color(0.900641646005f, 0.818721655873f, 0.0443679916567f),
                new Color(0.897990581493f, 0.825648843662f, 0.0311921975972f),
                new Color(0.898553007849f, 0.831233249825f, 0.0682610078157f),
                new Color(0.902890379229f, 0.835257282572f, 0.127173791555f),
                new Color(0.907153202363f, 0.839290415225f, 0.16936596405f),
                new Color(0.911340063464f, 0.843332745276f, 0.204553625577f),
                new Color(0.915449563182f, 0.847384366892f, 0.235764224808f),
                new Color(0.919480314548f, 0.851445370991f, 0.264391329421f),
                new Color(0.923430940957f, 0.85551584532f, 0.291204862021f),
                new Color(0.927300074214f, 0.859595874528f, 0.316679372942f),
                new Color(0.931086352617f, 0.863685540241f, 0.341129701928f),
                new Color(0.934788419075f, 0.867784921127f, 0.364776124263f),
                new Color(0.938404919262f, 0.871894092973f, 0.387779074121f),
                new Color(0.941934499804f, 0.876013128743f, 0.410259138592f),
                new Color(0.945375806484f, 0.880142098652f, 0.43230927905f),
                new Color(0.948727482467f, 0.884281070227f, 0.454002666231f),
                new Color(0.951988166539f, 0.888430108369f, 0.475397903f),
                new Color(0.955156491362f, 0.892589275414f, 0.496542620799f),
                new Color(0.958231081722f, 0.896758631197f, 0.51747602533f),
                new Color(0.96121055279f, 0.900938233107f, 0.538230741549f),
                new Color(0.964093508368f, 0.905128136146f, 0.55883417852f),
                new Color(0.966878539132f, 0.909328392984f, 0.579309557384f),
                new Color(0.969564220862f, 0.913539054016f, 0.599676697971f),
                new Color(0.972149112643f, 0.917760167413f, 0.619952629264f),
                new Color(0.974631755056f, 0.921991779176f, 0.640152069209f),
                new Color(0.977010668325f, 0.92623393319f, 0.660287806118f),
                new Color(0.979284350439f, 0.930486671268f, 0.680371005012f),
                new Color(0.981451275229f, 0.934750033206f, 0.700411455972f),
                new Color(0.9835098904f, 0.939024056828f, 0.720417777213f),
                new Color(0.985458615506f, 0.943308778035f, 0.740397582441f),
                new Color(0.987295839871f, 0.94760423085f, 0.760357619768f),
                new Color(0.989019920437f, 0.951910447464f, 0.780303887791f),
                new Color(0.990629179549f, 0.956227458278f, 0.80024173319f),
                new Color(0.992121902645f, 0.960555291948f, 0.820175933243f),
                new Color(0.993496335869f, 0.964893975428f, 0.840110765987f),
                new Color(0.994750683575f, 0.969243534009f, 0.860050070139f),
                new Color(0.995883105733f, 0.973603991364f, 0.879997296537f),
                new Color(0.99689171521f, 0.97797536958f, 0.899955552467f),
                new Color(0.997774574927f, 0.982357689206f, 0.919927640041f),
                new Color(0.998529694871f, 0.986750969284f, 0.939916089534f),
                new Color(0.999155028965f, 0.991155227389f, 0.959923188443f),
                new Color(0.999648471753f, 0.995570479665f, 0.979951006929f),
                Color.WHITE

        );


    }


}
