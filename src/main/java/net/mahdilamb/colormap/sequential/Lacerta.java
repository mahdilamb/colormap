package net.mahdilamb.colormap.sequential;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.ColorImpl;
/**
 * Colormap from Peter Karpov @see <a href="http://inversed.ru/index.htm">Peter Karpov</a>. Lacerta
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "Lacerta")
public final class Lacerta extends LinearColormap {
    /**
     * Create a colormap based on Lacerta
     */
    public Lacerta() {
        super(
                new ColorImpl(0f, 0f, 0f),
                new ColorImpl(0.0106800027858887f, 0.000336853776647296f, 0.0428855412549295f),
                new ColorImpl(0.019010352975483f, 0.00120549836908178f, 0.0766233766318336f),
                new ColorImpl(0.0253319407053869f, 0.00242196316942438f, 0.102475952768534f),
                new ColorImpl(0.0304851376362079f, 0.003905810070571f, 0.123758105726186f),
                new ColorImpl(0.03486386134175f, 0.00561107672552925f, 0.142017326551857f),
                new ColorImpl(0.0386811314195504f, 0.00750654831313505f, 0.158085666713933f),
                new ColorImpl(0.0420664561330795f, 0.00956892563740309f, 0.172465652243497f),
                new ColorImpl(0.045095936081351f, 0.0117772786632109f, 0.185447974150584f),
                new ColorImpl(0.0478436364704828f, 0.0141195347276055f, 0.19731961313566f),
                new ColorImpl(0.0503596264811666f, 0.0165851314352538f, 0.208272580184419f),
                new ColorImpl(0.0526826326690106f, 0.0191656995056289f, 0.218454742063701f),
                new ColorImpl(0.0548422709596013f, 0.0218541275974864f, 0.227978285619233f),
                new ColorImpl(0.056861285182755f, 0.0246440495791228f, 0.236928420569062f),
                new ColorImpl(0.0587588121352765f, 0.0275302478330234f, 0.245376559909855f),
                new ColorImpl(0.0605505140448147f, 0.0305081436148874f, 0.253380612618301f),
                new ColorImpl(0.0622483147065821f, 0.0335730870960257f, 0.260983647074909f),
                new ColorImpl(0.0638635433464216f, 0.0367215374241924f, 0.26822688205497f),
                new ColorImpl(0.0654055028693082f, 0.0399501113845422f, 0.275143587638154f),
                new ColorImpl(0.0668525787291017f, 0.0432365601493516f, 0.281637255016964f),
                new ColorImpl(0.0681965628431436f, 0.0465644810965943f, 0.28766768347561f),
                new ColorImpl(0.0694582218858319f, 0.0499369222634603f, 0.293317204524245f),
                new ColorImpl(0.0706901024263333f, 0.0533837572080411f, 0.298803196845573f),
                new ColorImpl(0.0718993194674636f, 0.0569063705652834f, 0.304151858397937f),
                new ColorImpl(0.0730851397676213f, 0.0605005522409412f, 0.30935633938825f),
                new ColorImpl(0.0742485264508374f, 0.0641633249789502f, 0.314417045223221f),
                new ColorImpl(0.0753901393058298f, 0.0678914555794271f, 0.319333189573954f),
                new ColorImpl(0.0765106300753106f, 0.0716816804721967f, 0.324104046089512f),
                new ColorImpl(0.0776107174954569f, 0.0755307815011123f, 0.328729269713675f),
                new ColorImpl(0.0786911679962687f, 0.079435582976395f, 0.333208817900438f),
                new ColorImpl(0.0797527933603138f, 0.0833929623518634f, 0.33754294285278f),
                new ColorImpl(0.0807964488699934f, 0.0873998609721967f, 0.341732185076195f),
                new ColorImpl(0.0818230301979775f, 0.0914532930183061f, 0.345777360870078f),
                new ColorImpl(0.0828334701643173f, 0.0955503535871949f, 0.34967954854601f),
                new ColorImpl(0.0838287353107305f, 0.0996882257749228f, 0.353440073201999f),
                new ColorImpl(0.0848098223171446f, 0.103864186712037f, 0.357060490205764f),
                new ColorImpl(0.0857777543246045f, 0.108075612561398f, 0.360542567711546f),
                new ColorImpl(0.086733577222868f, 0.112319982503614f, 0.363888268514659f),
                new ColorImpl(0.0876783559549357f, 0.116594881748453f, 0.367099731524931f),
                new ColorImpl(0.0886131708845014f, 0.120898003621431f, 0.370179253114777f),
                new ColorImpl(0.0895391142660329f, 0.125227150783468f, 0.37312926857085f),
                new ColorImpl(0.0904572868509966f, 0.129580235648033f, 0.375952333850638f),
                new ColorImpl(0.0913687946577552f, 0.13395528006476f, 0.378651107817718f),
                new ColorImpl(0.0922747459269693f, 0.138350414341209f, 0.381228335102174f),
                new ColorImpl(0.0931762482790155f, 0.142763875675568f, 0.38368682970649f),
                new ColorImpl(0.0940744060850346f, 0.147194006072705f, 0.386029459452383f),
                new ColorImpl(0.0949703180587972f, 0.151639249814468f, 0.38825913134096f),
                new ColorImpl(0.0958650744606311f, 0.156098149556f, 0.390378775385172f),
                new ColorImpl(0.0967597704128563f, 0.160569368360141f, 0.392391393930096f),
                new ColorImpl(0.0976554463542983f, 0.165051590778099f, 0.394299815295256f),
                new ColorImpl(0.0985531746654516f, 0.169543664249071f, 0.396107041279114f),
                new ColorImpl(0.0994539978072941f, 0.174044496162764f, 0.397815991229176f),
                new ColorImpl(0.10035914519572f, 0.178553435450569f, 0.399430362407032f),
                new ColorImpl(0.101269027669378f, 0.183068481514158f, 0.400950623770152f),
                new ColorImpl(0.102190613914067f, 0.187599709553568f, 0.402403143468013f),
                new ColorImpl(0.10310851611318f, 0.192116299456565f, 0.403726243514182f),
                new ColorImpl(0.104039855545038f, 0.196647198437414f, 0.4049862859053f),
                new ColorImpl(0.104980208549369f, 0.201181899659696f, 0.406164806870318f),
                new ColorImpl(0.105930487853813f, 0.205719784122492f, 0.407264368685454f),
                new ColorImpl(0.106891568221474f, 0.210260248495259f, 0.408287396233037f),
                new ColorImpl(0.107864345998947f, 0.214802817783311f, 0.409236402845792f),
                new ColorImpl(0.108849684844599f, 0.21934703723397f, 0.410113778313961f),
                new ColorImpl(0.10984843000813f, 0.22389249601277f, 0.41092184192685f),
                new ColorImpl(0.110861408548247f, 0.228438823928342f, 0.41166284129861f),
                new ColorImpl(0.111889429754651f, 0.232985688591544f, 0.412338952138488f),
                new ColorImpl(0.112933285544287f, 0.237532792566969f, 0.412952278084581f),
                new ColorImpl(0.113993750902043f, 0.242079870670893f, 0.413504850858894f),
                new ColorImpl(0.115071584358513f, 0.246626687414535f, 0.413998630705224f),
                new ColorImpl(0.116167528498059f, 0.251173034590398f, 0.414435507074158f),
                new ColorImpl(0.117282310491078f, 0.255718728998585f, 0.414817299522137f),
                new ColorImpl(0.118416642644939f, 0.260263610309268f, 0.415145758794242f),
                new ColorImpl(0.11957122296866f, 0.264807539056935f, 0.415422568062904f),
                new ColorImpl(0.120746735772142f, 0.269350394817857f, 0.415649344384103f),
                new ColorImpl(0.121943852194025f, 0.27389207433917f, 0.415827639994468f),
                new ColorImpl(0.123163230781691f, 0.27843248989301f, 0.415958943874798f),
                new ColorImpl(0.124405518126589f, 0.282971567869905f, 0.416044683570888f),
                new ColorImpl(0.125671349413273f, 0.287509247293111f, 0.416086226781676f),
                new ColorImpl(0.126961348990174f, 0.292045478493915f, 0.416084883080436f),
                new ColorImpl(0.12827613093255f, 0.29658022188124f, 0.416041905659977f),
                new ColorImpl(0.129616299596011f, 0.301113446800136f, 0.41595849309038f),
                new ColorImpl(0.130982450159258f, 0.305645130473893f, 0.415835791079192f),
                new ColorImpl(0.132375169154925f, 0.310175257024637f, 0.415674894225338f),
                new ColorImpl(0.133795034987626f, 0.314703816567464f, 0.4154768477592f),
                new ColorImpl(0.135242618438504f, 0.319230804373351f, 0.415242649262359f),
                new ColorImpl(0.136718448247739f, 0.32375613743239f, 0.414973144407389f),
                new ColorImpl(0.138223186260964f, 0.328280067369791f, 0.414669558782894f),
                new ColorImpl(0.139757278284066f, 0.332802351899764f, 0.414332438397236f),
                new ColorImpl(0.141321304407786f, 0.337323082751816f, 0.413962713219115f),
                new ColorImpl(0.14291580436185f, 0.341842270519808f, 0.413561167331989f),
                new ColorImpl(0.144541312975632f, 0.346359927134636f, 0.413128546810163f),
                new ColorImpl(0.146198360580279f, 0.35087606539267f, 0.41266556118509f),
                new ColorImpl(0.147887473396267f, 0.355390698522336f, 0.412172884867171f),
                new ColorImpl(0.149609173906616f, 0.359903839785944f, 0.411651158522366f),
                new ColorImpl(0.151363981216015f, 0.364415502114002f, 0.411100990403261f),
                new ColorImpl(0.153152411396169f, 0.368925697769472f, 0.410522957634522f),
                new ColorImpl(0.154974977817665f, 0.373434438039568f, 0.409917607452884f),
                new ColorImpl(0.156832191468721f, 0.377941732952863f, 0.409285458402079f),
                new ColorImpl(0.15872456126117f, 0.382447591019627f, 0.408627001483231f),
                new ColorImpl(0.160652594324039f, 0.386952018993445f, 0.407942701261424f),
                new ColorImpl(0.162616796285111f, 0.391455021652332f, 0.407232996929287f),
                new ColorImpl(0.164617671540838f, 0.395956601597643f, 0.406498303328489f),
                new ColorImpl(0.166655723514995f, 0.400456759069238f, 0.405739011930183f),
                new ColorImpl(0.168731454906438f, 0.404955491775453f, 0.404955491775453f),
                new ColorImpl(0.170845340817168f, 0.409452729765894f, 0.404148026247998f),
                new ColorImpl(0.172997938589153f, 0.413948598080276f, 0.403317074116423f),
                new ColorImpl(0.175189721816195f, 0.418443017986655f, 0.40246287444261f),
                new ColorImpl(0.177421192570698f, 0.42293597561793f, 0.401585715196882f),
                new ColorImpl(0.179692853288342f, 0.427427453903815f, 0.40068586606216f),
                new ColorImpl(0.182005206958044f, 0.431917432464707f, 0.399763579159001f),
                new ColorImpl(0.184358757303447f, 0.43640588751283f, 0.39881908973895f),
                new ColorImpl(0.186754008956243f, 0.44089279175986f, 0.397852616847366f),
                new ColorImpl(0.189191467621623f, 0.445378114330338f, 0.396864363956927f),
                new ColorImpl(0.191671640236112f, 0.449861820680184f, 0.395854519572946f),
                new ColorImpl(0.194195035118072f, 0.454343872519718f, 0.394823257811645f),
                new ColorImpl(0.196762162111106f, 0.458824227740614f, 0.393770738952471f),
                new ColorImpl(0.199373532720611f, 0.463302840346276f, 0.392697109965562f),
                new ColorImpl(0.202029660243688f, 0.467779660385139f, 0.391602505015381f),
                new ColorImpl(0.204731059892632f, 0.472254633886481f, 0.390487045941558f),
                new ColorImpl(0.207478248912193f, 0.476727702798311f, 0.389350842717919f),
                new ColorImpl(0.210271746690778f, 0.481198804926974f, 0.388193993890668f),
                new ColorImpl(0.21311207486579f, 0.485667873878122f, 0.387016586996628f),
                new ColorImpl(0.215999757423235f, 0.490134838998738f, 0.385818698962464f),
                new ColorImpl(0.218935320791756f, 0.494599625319908f, 0.38460039648572f),
                new ColorImpl(0.221919293931233f, 0.499062153500089f, 0.383361736398528f),
                new ColorImpl(0.224952208416048f, 0.50352233976861f, 0.382102766014775f),
                new ColorImpl(0.228034598513147f, 0.507980095869181f, 0.380823523461503f),
                new ColorImpl(0.231167001254993f, 0.512435329003209f, 0.379524037995284f),
                new ColorImpl(0.234349956507481f, 0.516887941772713f, 0.378204330304287f),
                new ColorImpl(0.237584007032915f, 0.521337832122678f, 0.376864412796717f),
                new ColorImpl(0.240869698548096f, 0.525784893282663f, 0.37550428987629f),
                new ColorImpl(0.244207579777586f, 0.530229013707538f, 0.374123958205374f),
                new ColorImpl(0.247598202502189f, 0.534670077017194f, 0.372723406956401f),
                new ColorImpl(0.251042121602684f, 0.539107961935101f, 0.371302618052139f),
                new ColorImpl(0.254539895098846f, 0.543542542225613f, 0.36986156639538f),
                new ColorImpl(0.258092084183756f, 0.547973686629896f, 0.368400220088581f),
                new ColorImpl(0.261699253253423f, 0.552401258800397f, 0.366918540643975f),
                new ColorImpl(0.265361969931708f, 0.556825117233747f, 0.365416483184647f),
                new ColorImpl(0.269080805090538f, 0.561245115202046f, 0.363893996637047f),
                new ColorImpl(0.272856332865408f, 0.56566110068242f, 0.362351023915405f),
                new ColorImpl(0.276689130666119f, 0.570072916284817f, 0.36078750209847f),
                new ColorImpl(0.280579779182733f, 0.574480399177962f, 0.359203362599014f),
                new ColorImpl(0.284528862386706f, 0.57888338101342f, 0.357598531326483f),
                new ColorImpl(0.288536967527128f, 0.583281687847722f, 0.355972928843208f),
                new ColorImpl(0.292604685122031f, 0.587675140062507f, 0.354326470514531f),
                new ColorImpl(0.29673260894469f, 0.592063552282651f, 0.352659066653208f),
                new ColorImpl(0.300921336004835f, 0.596446733292329f, 0.350970622658446f),
                new ColorImpl(0.305171466524708f, 0.600824485949002f, 0.349261039149901f),
                new ColorImpl(0.309483603931945f, 0.605196607138479f, 0.347530212121744f),
                new ColorImpl(0.313858354776645f, 0.609562887589224f, 0.345778033011891f),
                new ColorImpl(0.318296328697385f, 0.613923111793322f, 0.34400438883208f),
                new ColorImpl(0.32279813842017f, 0.618277057998544f, 0.342209162334078f),
                new ColorImpl(0.327364400084263f, 0.622624498827191f, 0.340392232512631f),
                new ColorImpl(0.331995731427132f, 0.626965197830263f, 0.338553472882645f),
                new ColorImpl(0.336692726824269f, 0.631298862795505f, 0.336692726824269f),
                new ColorImpl(0.341456116246568f, 0.63562544344457f, 0.33480996617067f),
                new ColorImpl(0.346286456880583f, 0.639944552618854f, 0.332904982109515f),
                new ColorImpl(0.351184232811623f, 0.644255661033671f, 0.330977496190375f),
                new ColorImpl(0.356150294712229f, 0.648558903129613f, 0.329027573562241f),
                new ColorImpl(0.361185187025727f, 0.652853836430524f, 0.327054980133853f),
                new ColorImpl(0.366289560925001f, 0.657140203307128f, 0.325059577721371f),
                new ColorImpl(0.371464069134533f, 0.661417736740331f, 0.323041223236583f),
                new ColorImpl(0.37670934821892f, 0.66568612916023f, 0.320999753885799f),
                new ColorImpl(0.382025959038923f, 0.669944929356179f, 0.318934939268931f),
                new ColorImpl(0.387414670246841f, 0.674194041149887f, 0.316846720027572f),
                new ColorImpl(0.392876086098602f, 0.678433066988378f, 0.314734892432333f),
                new ColorImpl(0.398410846885373f, 0.682661662643975f, 0.312599279863908f),
                new ColorImpl(0.404019589769125f, 0.686879468458475f, 0.310439700023202f),
                new ColorImpl(0.409702979918708f, 0.691086162313004f, 0.308255988914529f),
                new ColorImpl(0.415461669929495f, 0.695281390094934f, 0.306047969032859f),
                new ColorImpl(0.421296313646201f, 0.699464789727217f, 0.303815460646537f),
                new ColorImpl(0.427207565670295f, 0.70363599051578f, 0.30155828164962f),
                new ColorImpl(0.433196081160967f, 0.707794613014454f, 0.299276247652569f),
                new ColorImpl(0.439262515626591f, 0.711940268888584f, 0.296969172073845f),
                new ColorImpl(0.445407524706443f, 0.716072560777461f, 0.294636866232576f),
                new ColorImpl(0.451631763942429f, 0.72019108215564f, 0.292279139442474f),
                new ColorImpl(0.457935888540605f, 0.724295417193297f, 0.289895799107164f),
                new ColorImpl(0.464320553122226f, 0.728385140615726f, 0.28748665081708f),
                new ColorImpl(0.470786411464097f, 0.732459817562121f, 0.285051498448124f),
                new ColorImpl(0.477334150115572f, 0.736519055731788f, 0.282590164324253f),
                new ColorImpl(0.483964342747194f, 0.740562280631262f, 0.280102402939842f),
                new ColorImpl(0.490677684661487f, 0.744589098854038f, 0.277588041239443f),
                new ColorImpl(0.497474823244545f, 0.748599035403188f, 0.275046877076606f),
                new ColorImpl(0.504356402401873f, 0.752591603250276f, 0.272478706496234f),
                new ColorImpl(0.511323064206548f, 0.756566306191772f, 0.269883324962835f),
                new ColorImpl(0.518375454626068f, 0.760522647558752f, 0.267260530552236f),
                new ColorImpl(0.525514203805049f, 0.764460101480158f, 0.264610113904657f),
                new ColorImpl(0.532739942936397f, 0.768378138381701f, 0.261931867573884f),
                new ColorImpl(0.540053301929915f, 0.772276221759779f, 0.259225584926359f),
                new ColorImpl(0.547454924089999f, 0.776153829238075f, 0.256491067166973f),
                new ColorImpl(0.554945372584665f, 0.780010320451367f, 0.253728079885898f),
                new ColorImpl(0.562525284326477f, 0.783845156494624f, 0.250936426246226f),
                new ColorImpl(0.570195344583577f, 0.787657860517115f, 0.248115931838527f),
                new ColorImpl(0.577956029591154f, 0.791447662512938f, 0.245266332914165f),
                new ColorImpl(0.585807722352598f, 0.79521366916452f, 0.242387335524589f),
                new ColorImpl(0.594470453322074f, 0.798758333334675f, 0.241780255145954f),
                new ColorImpl(0.60515349958032f, 0.801725787504773f, 0.247749339717679f),
                new ColorImpl(0.615787890610906f, 0.804675228930842f, 0.253929533203169f),
                new ColorImpl(0.626369426730624f, 0.80760786293671f, 0.26032189760839f),
                new ColorImpl(0.636893900202263f, 0.810524932179319f, 0.266927496224813f),
                new ColorImpl(0.647357094833261f, 0.813427716214289f, 0.273747393559814f),
                new ColorImpl(0.657754773111681f, 0.81631752437928f, 0.280782629047468f),
                new ColorImpl(0.66808271239207f, 0.819195714801141f, 0.288034292682801f),
                new ColorImpl(0.678336660464474f, 0.822063670588054f, 0.295503433665696f),
                new ColorImpl(0.688512527777896f, 0.824922906845776f, 0.303191486621555f),
                new ColorImpl(0.698605794186781f, 0.827774739535303f, 0.311098958141215f),
                new ColorImpl(0.708612270024272f, 0.830620707799025f, 0.319227102369556f),
                new ColorImpl(0.718527647424696f, 0.833462324734025f, 0.327576934533308f),
                new ColorImpl(0.728347598430609f, 0.836301130929279f, 0.336149443664803f),
                new ColorImpl(0.738067816601871f, 0.83913871921916f, 0.344945694232958f),
                new ColorImpl(0.747683785369769f, 0.841976591257586f, 0.353966242675083f),
                new ColorImpl(0.757191293770146f, 0.8448164742553f, 0.363212428840714f),
                new ColorImpl(0.766585791123564f, 0.847659919743669f, 0.372684739830338f),
                new ColorImpl(0.775862963911971f, 0.850508665576967f, 0.382384292020702f),
                new ColorImpl(0.785018112213258f, 0.853364227592766f, 0.392311150916633f),
                new ColorImpl(0.794046949474574f, 0.856228428077419f, 0.402466513342329f),
                new ColorImpl(0.802944881023204f, 0.859102912552257f, 0.4128507120705f),
                new ColorImpl(0.811707357909945f, 0.86198938303343f, 0.423464180317129f),
                new ColorImpl(0.820329806587761f, 0.864889548012262f, 0.434307245947869f),
                new ColorImpl(0.828807630099191f, 0.867805119767715f, 0.445380121349983f),
                new ColorImpl(0.837136209659318f, 0.870737811564284f, 0.456682892976384f),
                new ColorImpl(0.845310906620444f, 0.873689334705012f, 0.468215510465379f),
                new ColorImpl(0.85332706487596f, 0.876661395463876f, 0.479977775469315f),
                new ColorImpl(0.861180013726413f, 0.879655691899552f, 0.491969330233681f),
                new ColorImpl(0.868865071229304f, 0.882673910553811f, 0.504189645974361f),
                new ColorImpl(0.876377548052561f, 0.885717723039263f, 0.516638011107201f),
                new ColorImpl(0.883712751849458f, 0.888788782522696f, 0.529313519390664f),
                new ColorImpl(0.890865992170299f, 0.891888720111929f, 0.542215058049264f),
                new ColorImpl(0.897832585923237f, 0.895019141155897f, 0.555341295952373f),
                new ColorImpl(0.904607863393186f, 0.898181621469542f, 0.568690671929995f),
                new ColorImpl(0.911187174823898f, 0.901377703497057f, 0.582261383313858f),
                new ColorImpl(0.91756589756385f, 0.904608892428977f, 0.596051374798521f),
                new ColorImpl(0.923739443771586f, 0.907876652290481f, 0.610058327722683f),
                new ColorImpl(0.929703268670597f, 0.911182402019948f, 0.624279649874875f),
                new ColorImpl(0.9354528793375f, 0.914527511557959f, 0.638712465929118f),
                new ColorImpl(0.940983844000312f, 0.917913297967212f, 0.65335360861313f),
                new ColorImpl(0.946291801815663f, 0.921341021602451f, 0.668199610701408f),
                new ColorImpl(0.951372373973517f, 0.924811729098817f, 0.683246052304292f),
                new ColorImpl(0.956221560432749f, 0.92832683675977f, 0.698490029031702f),
                new ColorImpl(0.960835186126268f, 0.931887280219597f, 0.713926576922308f),
                new ColorImpl(0.965209279788763f, 0.935494055271608f, 0.729550963868135f),
                new ColorImpl(0.969339995777518f, 0.939148083222554f, 0.745358132869768f),
                new ColorImpl(0.973223625812363f, 0.942850207884146f, 0.761342701131079f),
                new ColorImpl(0.976856610826252f, 0.946601192808069f, 0.777498960714786f),
                new ColorImpl(0.980235551741966f, 0.950401716019138f, 0.793820869308235f),
                new ColorImpl(0.983357226388097f, 0.954252380481502f, 0.810302106868315f),
                new ColorImpl(0.986218592153985f, 0.958153689995203f, 0.826935988908588f),
                new ColorImpl(0.988816802599366f, 0.962106057930684f, 0.843715517027732f),
                new ColorImpl(0.991149226066397f, 0.966109833434863f, 0.860633500948004f),
                new ColorImpl(0.993213438630142f, 0.970165241430693f, 0.877682325321041f),
                new ColorImpl(0.995007280991111f, 0.97427259346539f, 0.894854828036685f),
                new ColorImpl(0.996528600615071f, 0.978430808784463f, 0.91213827859486f),
                new ColorImpl(0.997776104131634f, 0.982642327606626f, 0.929534428190729f),
                new ColorImpl(0.998747986475828f, 0.986904865954588f, 0.947025916666152f),
                new ColorImpl(0.999443165018352f, 0.991218876921181f, 0.964606690797033f),
                new ColorImpl(0.99986071847071f, 0.995584056869886f, 0.98226778446761f),
                new ColorImpl(1f, 1f, 1f));


    }


}
