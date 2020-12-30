package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * Colormap from 10.1109/VISUAL.2002.1183788
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Kindlmann", source = "Kindlmann et al")
public final class Kindlmann extends SequentialColormap {
    /**
     * Create a colormap based on Kindlmann, et al.
     */
    public Kindlmann() {
        super(
                new Color(0.0179911464229f, 0.000920064923514f, 0.0156157177605f),
                new Color(0.0359573389421f, 0.00178553210759f, 0.0319686152223f),
                new Color(0.052717504614f, 0.00252887372289f, 0.0485944475368f),
                new Color(0.0664593669057f, 0.00322312300316f, 0.0629875526327f),
                new Color(0.0783789080754f, 0.00380156463246f, 0.0758728198312f),
                new Color(0.0890194458501f, 0.00426758967588f, 0.0877407961252f),
                new Color(0.0985268713734f, 0.00475880811033f, 0.098703029916f),
                new Color(0.107066588617f, 0.00523157681353f, 0.109516758625f),
                new Color(0.11449012489f, 0.00579292222525f, 0.120833508104f),
                new Color(0.120982700612f, 0.00638735196241f, 0.132756772803f),
                new Color(0.126759943415f, 0.00697302447162f, 0.145020000789f),
                new Color(0.132114155782f, 0.00751225838242f, 0.157034897655f),
                new Color(0.137058036252f, 0.00806004196545f, 0.168740910277f),
                new Color(0.141649687793f, 0.0086020586774f, 0.180181586366f),
                new Color(0.145897662326f, 0.00918740207035f, 0.191306061277f),
                new Color(0.149911730845f, 0.00969930668075f, 0.20228018042f),
                new Color(0.153699794586f, 0.0101651632923f, 0.21306910708f),
                new Color(0.157229049852f, 0.0106966648307f, 0.223525579263f),
                new Color(0.160604333941f, 0.0111474503315f, 0.23383850217f),
                new Color(0.163796762742f, 0.0116231373033f, 0.243863642246f),
                new Color(0.166848448357f, 0.0121134415658f, 0.253685702911f),
                new Color(0.169819141386f, 0.0126114478884f, 0.26363818667f),
                new Color(0.172738904452f, 0.0130456304668f, 0.273838903033f),
                new Color(0.175539873723f, 0.0136060166319f, 0.284035834989f),
                new Color(0.178292710791f, 0.0140938263667f, 0.294472726772f),
                new Color(0.180967301212f, 0.0146031444225f, 0.305018418317f),
                new Color(0.183568732274f, 0.0151304937855f, 0.315665343158f),
                new Color(0.186126597895f, 0.0155638077972f, 0.326540250824f),
                new Color(0.188597679232f, 0.016112598419f, 0.337367139559f),
                new Color(0.19101527951f, 0.0166661392128f, 0.348269803401f),
                new Color(0.19338747153f, 0.0172191510076f, 0.359238939756f),
                new Color(0.195737845385f, 0.0176485273411f, 0.370407572449f),
                new Color(0.198044113384f, 0.0181807475065f, 0.381482230849f),
                new Color(0.200323209309f, 0.018816828319f, 0.392447152667f),
                new Color(0.20260874331f, 0.0193080320772f, 0.403582869228f),
                new Color(0.204899513261f, 0.0197675087201f, 0.414734365044f),
                new Color(0.207203487335f, 0.020318509756f, 0.425739793369f),
                new Color(0.209540691203f, 0.0208293220492f, 0.436737009057f),
                new Color(0.211923423866f, 0.0214286969089f, 0.447561641367f),
                new Color(0.214365276602f, 0.0218414047174f, 0.458511304496f),
                new Color(0.216884168073f, 0.0224761710821f, 0.469109681584f),
                new Color(0.219485130374f, 0.0229111574384f, 0.479815538029f),
                new Color(0.222188067595f, 0.0234258259404f, 0.490305809926f),
                new Color(0.224998688279f, 0.0238728708752f, 0.500730803846f),
                new Color(0.227935385801f, 0.0244003542471f, 0.51092309047f),
                new Color(0.230997962124f, 0.0248557429785f, 0.521037675039f),
                new Color(0.234203821386f, 0.0253947921946f, 0.530907891495f),
                new Color(0.237546372868f, 0.0258598394405f, 0.540693759978f),
                new Color(0.241027046685f, 0.0262475798994f, 0.55039511939f),
                new Color(0.244584484796f, 0.0267693440447f, 0.55991166928f),
                new Color(0.2481175218f, 0.0271274399767f, 0.569636574265f),
                new Color(0.24989475832f, 0.0278631362956f, 0.581398671653f),
                new Color(0.251525497218f, 0.0284219720302f, 0.593483256725f),
                new Color(0.252639757507f, 0.0290416288995f, 0.606152585473f),
                new Color(0.252696088643f, 0.0296094624578f, 0.620118665558f),
                new Color(0.251496133219f, 0.0303909420016f, 0.635313719985f),
                new Color(0.248691606409f, 0.0311547780908f, 0.652158617486f),
                new Color(0.243878137586f, 0.0320817761944f, 0.670731330201f),
                new Color(0.23639962754f, 0.0330706616692f, 0.691424807068f),
                new Color(0.225267244623f, 0.0341252602766f, 0.714610866633f),
                new Color(0.208889850342f, 0.0353832411736f, 0.74063638628f),
                new Color(0.184190458638f, 0.0368327602548f, 0.770140652082f),
                new Color(0.143863414546f, 0.0384184443067f, 0.804039880295f),
                new Color(0.0746219638915f, 0.0463798951671f, 0.836091603811f),
                new Color(0.0519296804577f, 0.0798472986086f, 0.829374357579f),
                new Color(0.0394515282547f, 0.107189845036f, 0.816977772194f),
                new Color(0.0384497825314f, 0.130572940256f, 0.800619639495f),
                new Color(0.0376049080062f, 0.150475345512f, 0.783946103531f),
                new Color(0.0366209160453f, 0.167937309627f, 0.767178191635f),
                new Color(0.0362095390452f, 0.183593242522f, 0.750243007035f),
                new Color(0.035009786269f, 0.197766483702f, 0.733612552706f),
                new Color(0.0341816624553f, 0.210769331081f, 0.717059181752f),
                new Color(0.0338207279497f, 0.222790052386f, 0.700632749393f),
                new Color(0.0330602243752f, 0.233954587651f, 0.684623431271f),
                new Color(0.0320054471262f, 0.244386794417f, 0.669049419546f),
                new Color(0.0311985935446f, 0.254189693317f, 0.653810060935f),
                new Color(0.0306931539107f, 0.263438905191f, 0.638927319158f),
                new Color(0.0300923241428f, 0.272196250421f, 0.624527084061f),
                new Color(0.0294532825196f, 0.280518738048f, 0.610613760314f),
                new Color(0.0288266759948f, 0.288454796768f, 0.597189242503f),
                new Color(0.0282582188459f, 0.296045951278f, 0.584253244148f),
                new Color(0.0273581086489f, 0.303331720628f, 0.571895679741f),
                new Color(0.0270296599782f, 0.310337007147f, 0.559924872093f),
                new Color(0.0264448001694f, 0.317097231559f, 0.548516147786f),
                new Color(0.0256345140463f, 0.323638967672f, 0.537652138675f),
                new Color(0.0254927658197f, 0.329971350849f, 0.527160032449f),
                new Color(0.0247401700131f, 0.3361344932f, 0.517263775647f),
                new Color(0.0242644107155f, 0.342132084344f, 0.507792879869f),
                new Color(0.0240860234118f, 0.347978814433f, 0.49873824455f),
                new Color(0.0237705243471f, 0.35369797069f, 0.490153193575f),
                new Color(0.0233150400472f, 0.359303427358f, 0.482017159822f),
                new Color(0.0227099953726f, 0.364807798254f, 0.474309413085f),
                new Color(0.0224155227008f, 0.37021053997f, 0.46695688834f),
                new Color(0.021951068806f, 0.375533039074f, 0.459997929716f),
                new Color(0.0217852450427f, 0.380771775449f, 0.453366342385f),
                new Color(0.0214109796297f, 0.385947880155f, 0.447093322224f),
                new Color(0.0213083626733f, 0.391055299678f, 0.441119612024f),
                new Color(0.0209409639731f, 0.396115195541f, 0.435469406269f),
                new Color(0.0208032233745f, 0.401119315422f, 0.430090411418f),
                new Color(0.0203267971251f, 0.406089062357f, 0.424999913907f),
                new Color(0.0200232189201f, 0.411014240438f, 0.420152583348f),
                new Color(0.0198728054352f, 0.415899382496f, 0.415537874164f),
                new Color(0.0201730386418f, 0.420752205373f, 0.410977892936f),
                new Color(0.0204269128371f, 0.425601519313f, 0.40633093587f),
                new Color(0.020648268745f, 0.430446943879f, 0.401596640503f),
                new Color(0.0208515375655f, 0.435288096472f, 0.3967746856f),
                new Color(0.0210517249569f, 0.4401245929f, 0.391864797966f),
                new Color(0.0212643917258f, 0.44495604798f, 0.386866760343f),
                new Color(0.0215056309954f, 0.449782076175f, 0.381780420593f),
                new Color(0.0217920416135f, 0.45460229226f, 0.376605702372f),
                new Color(0.0221406975556f, 0.459416312029f, 0.371342617564f),
                new Color(0.0225691130702f, 0.464223753035f, 0.365991280754f),
                new Color(0.0224259562301f, 0.469044405085f, 0.360529877855f),
                new Color(0.0230580790144f, 0.473837791931f, 0.354998747537f),
                new Color(0.0231350670787f, 0.478644108687f, 0.349350101263f),
                new Color(0.0233439830722f, 0.483442806659f, 0.343606556264f),
                new Color(0.0237028430224f, 0.488233513041f, 0.337768885308f),
                new Color(0.0235081053068f, 0.493037171153f, 0.331794869685f),
                new Color(0.0242098931481f, 0.497811021508f, 0.325767842034f),
                new Color(0.0243709990305f, 0.502597537708f, 0.319598395605f),
                new Color(0.024730286079f, 0.507375060891f, 0.313331518429f),
                new Color(0.0245356175547f, 0.512165384947f, 0.306908018078f),
                new Color(0.0253294179759f, 0.516924115438f, 0.300448540314f),
                new Color(0.0255766767309f, 0.521695388489f, 0.293828618023f),
                new Color(0.0252539941421f, 0.526479457569f, 0.287037203286f),
                new Color(0.0259778918909f, 0.53123082017f, 0.280225448366f),
                new Color(0.0261331721134f, 0.535994757369f, 0.273241167674f),
                new Color(0.0265399835536f, 0.540748306125f, 0.26616608007f),
                new Color(0.0263475128744f, 0.54551458806f, 0.258909641361f),
                new Color(0.0264005115861f, 0.5502703191f, 0.251565875201f),
                new Color(0.0267081221115f, 0.555015282958f, 0.244143954883f),
                new Color(0.0272784546489f, 0.559749287365f, 0.236654847776f),
                new Color(0.0271978964134f, 0.564496121687f, 0.22898932204f),
                new Color(0.0273628878146f, 0.569231959721f, 0.221271379555f),
                new Color(0.027777471233f, 0.573956676974f, 0.213518485566f),
                new Color(0.0284444308696f, 0.578670178335f, 0.205751413881f),
                new Color(0.0283843289637f, 0.583396856402f, 0.19784223614f),
                new Color(0.0285476524053f, 0.588112448966f, 0.189955334812f),
                new Color(0.0289331144526f, 0.592816944849f, 0.182123550818f),
                new Color(0.0285115878732f, 0.597535139873f, 0.17420506477f),
                new Color(0.0293175331517f, 0.602217649212f, 0.166595804546f),
                new Color(0.0292779096904f, 0.606914200514f, 0.158975696289f),
                new Color(0.0294140830833f, 0.611600149328f, 0.151584202296f),
                new Color(0.029720091465f, 0.616275666466f, 0.144488804029f),
                new Color(0.0301894614322f, 0.620940969293f, 0.137765522615f),
                new Color(0.030815365662f, 0.62559632569f, 0.131498161336f),
                new Color(0.0304596782636f, 0.630267391981f, 0.125510284909f),
                new Color(0.0313631945057f, 0.634903951403f, 0.120413272537f),
                new Color(0.031242877616f, 0.639557176769f, 0.115752028275f),
                new Color(0.0312235432034f, 0.644202264115f, 0.11187543455f),
                new Color(0.031299156354f, 0.648839821508f, 0.108851437083f),
                new Color(0.0314184113993f, 0.653477231267f, 0.106176991919f),
                new Color(0.0315354727534f, 0.658121193765f, 0.103322272239f),
                new Color(0.0325849440421f, 0.662732380265f, 0.10250629337f),
                new Color(0.0324964623759f, 0.667373624657f, 0.101313673182f),
                new Color(0.0322681389383f, 0.672026774497f, 0.0997046382127f),
                new Color(0.0330969943958f, 0.676670839949f, 0.0976295890318f),
                new Color(0.0326757224886f, 0.681353424521f, 0.094299612977f),
                new Color(0.0337229991078f, 0.686019956215f, 0.090359711307f),
                new Color(0.0339064203289f, 0.6907178322f, 0.0849030421592f),
                new Color(0.0334148100448f, 0.695443242051f, 0.0776527768851f),
                new Color(0.0337425640662f, 0.700167125211f, 0.0686502617223f),
                new Color(0.0338207022037f, 0.704910801625f, 0.056740271177f),
                new Color(0.0338743964261f, 0.709670103135f, 0.0403918706963f),
                new Color(0.0587335993149f, 0.713922150001f, 0.0343907068207f),
                new Color(0.087429581386f, 0.717891498333f, 0.0346787868923f),
                new Color(0.111915239145f, 0.721799268215f, 0.0348193031422f),
                new Color(0.134123009678f, 0.725643421661f, 0.0348037451477f),
                new Color(0.155347319743f, 0.729397564257f, 0.0353712537055f),
                new Color(0.175139323574f, 0.733108825242f, 0.0350250894642f),
                new Color(0.194611949127f, 0.736726660802f, 0.0352592690818f),
                new Color(0.213537378156f, 0.740273862291f, 0.0353178375278f),
                new Color(0.232332605347f, 0.743724886122f, 0.035968753389f),
                new Color(0.250513531308f, 0.747126350622f, 0.0356584622917f),
                new Color(0.268691545657f, 0.750429081044f, 0.0359386943737f),
                new Color(0.286648031957f, 0.753655779162f, 0.0360251867582f),
                new Color(0.304629644281f, 0.75678196096f, 0.0367156189835f),
                new Color(0.322255272452f, 0.75985331015f, 0.0363983061994f),
                new Color(0.339942737704f, 0.762822451337f, 0.0366843136703f),
                new Color(0.357515992388f, 0.765711772711f, 0.0367605218778f),
                new Color(0.374994785001f, 0.768520445955f, 0.0366195872647f),
                new Color(0.392536689114f, 0.771225645629f, 0.0370972727808f),
                new Color(0.409994307564f, 0.773849358368f, 0.0373587187295f),
                new Color(0.427379664386f, 0.776391028603f, 0.0373970537272f),
                new Color(0.444702459395f, 0.778850167358f, 0.0372056550069f),
                new Color(0.46207959141f, 0.7812056023f, 0.037651709853f),
                new Color(0.479394440292f, 0.783478485675f, 0.0378707411309f),
                new Color(0.496653275128f, 0.785668578238f, 0.0378566991624f),
                new Color(0.513861188457f, 0.787775695975f, 0.0376038180367f),
                new Color(0.531105711117f, 0.789780640006f, 0.0380113165991f),
                new Color(0.548295506065f, 0.791703354864f, 0.038184710777f),
                new Color(0.565434007525f, 0.793543877596f, 0.0381188749731f),
                new Color(0.582591195967f, 0.795284740401f, 0.0387376313022f),
                new Color(0.599630010222f, 0.796961716746f, 0.0381868400101f),
                new Color(0.616682049504f, 0.798540479427f, 0.0383275339727f),
                new Color(0.633682106833f, 0.800038845211f, 0.0382269187142f),
                new Color(0.650680153913f, 0.801441969801f, 0.0388417763598f),
                new Color(0.667576491456f, 0.802781137769f, 0.0382551020787f),
                new Color(0.684464833385f, 0.804027141476f, 0.0383929993421f),
                new Color(0.701333811535f, 0.80518254406f, 0.0392768048004f),
                new Color(0.718108996552f, 0.80627465814f, 0.038941355259f),
                new Color(0.734858978841f, 0.807278722198f, 0.0393626753188f),
                new Color(0.75152489914f, 0.808219025281f, 0.0385431989517f),
                new Color(0.768180014053f, 0.809064201855f, 0.0395103035394f),
                new Color(0.784981358809f, 0.809779655251f, 0.0389863784715f),
                new Color(0.802205852997f, 0.810269996326f, 0.0386723126896f),
                new Color(0.819870049062f, 0.810514774272f, 0.0395871065987f),
                new Color(0.837964828179f, 0.81050820531f, 0.0407349043605f),
                new Color(0.856495760492f, 0.810239070669f, 0.0411533487121f),
                new Color(0.875477677159f, 0.809684424733f, 0.0418485997787f),
                new Color(0.894915925742f, 0.808826947298f, 0.0428263881801f),
                new Color(0.914815073355f, 0.807648343923f, 0.0440862680746f),
                new Color(0.935192099963f, 0.806127911352f, 0.0447502798991f),
                new Color(0.955553806529f, 0.804329139238f, 0.0673823160971f),
                new Color(0.964388642169f, 0.804746050286f, 0.252819656976f),
                new Color(0.969264675898f, 0.806479603483f, 0.355213883146f),
                new Color(0.972679058372f, 0.808946322667f, 0.427168888808f),
                new Color(0.975344341181f, 0.811910917092f, 0.482670299842f),
                new Color(0.977488081448f, 0.815263982533f, 0.527978708904f),
                new Color(0.979325206692f, 0.81891153223f, 0.566044805012f),
                new Color(0.980856323558f, 0.822821418552f, 0.599002327948f),
                new Color(0.982248942f, 0.826925425849f, 0.627796037997f),
                new Color(0.983429177855f, 0.831222239644f, 0.653523321339f),
                new Color(0.984581461736f, 0.835645803538f, 0.676478782658f),
                new Color(0.985530320813f, 0.840229085332f, 0.697479064842f),
                new Color(0.986439873531f, 0.844915604813f, 0.716603137535f),
                new Color(0.987284696794f, 0.84970175932f, 0.734192410112f),
                new Color(0.988097479774f, 0.854569399954f, 0.750435011311f),
                new Color(0.988784936521f, 0.859536817855f, 0.765642621436f),
                new Color(0.989434072415f, 0.864572812865f, 0.779848654014f),
                new Color(0.990132548978f, 0.869646397487f, 0.793083975622f),
                new Color(0.99072699097f, 0.874795481798f, 0.805638047057f),
                new Color(0.991275757401f, 0.879998726453f, 0.817531592142f),
                new Color(0.991837792113f, 0.885234998583f, 0.828784067795f),
                new Color(0.992337137685f, 0.890521929857f, 0.839541460436f),
                new Color(0.992819103751f, 0.895843059048f, 0.849818455135f),
                new Color(0.993184915734f, 0.901223132537f, 0.859755146555f),
                new Color(0.993764848059f, 0.906565576495f, 0.869111246785f),
                new Color(0.99415826293f, 0.911981196241f, 0.878275818043f),
                new Color(0.994542722176f, 0.917417168324f, 0.887132207634f),
                new Color(0.994951529848f, 0.922861877404f, 0.895689414959f),
                new Color(0.995417956347f, 0.928304043215f, 0.903955783233f),
                new Color(0.995805993584f, 0.933779817088f, 0.912062161581f),
                new Color(0.996137505124f, 0.939281131187f, 0.920014523899f),
                new Color(0.996434662824f, 0.944800045145f, 0.927818426777f),
                new Color(0.996898907451f, 0.950279714893f, 0.935356647591f),
                new Color(0.997197218778f, 0.955810300499f, 0.942878718971f),
                new Color(0.997527495307f, 0.961336154068f, 0.950266270209f),
                new Color(0.997911217012f, 0.966850486732f, 0.957523045365f),
                new Color(0.998179199116f, 0.972397796193f, 0.964774153088f),
                new Color(0.998536844521f, 0.977921894815f, 0.971900557052f),
                new Color(0.998809261864f, 0.983468565536f, 0.979026563766f),
                new Color(0.999205022643f, 0.988981842757f, 0.986032578677f),
                new Color(0.999545232406f, 0.994508167954f, 0.993042540059f),
                Color.WHITE);


    }


}
