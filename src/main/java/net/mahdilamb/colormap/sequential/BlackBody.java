package net.mahdilamb.colormap.sequential;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.SEQUENTIAL, name = "BlackBody")
public final class BlackBody extends LinearColorMap {
    public BlackBody(Double lowValue, Double highValue) {
        super(lowValue, highValue,
                new Color(0.0124985675549f, 0.00376710208302f, 0.00210713336054f),
                new Color(0.0249971351098f, 0.00753420416604f, 0.00421426672107f),
                new Color(0.0374957026647f, 0.0113013062491f, 0.00632140008161f),
                new Color(0.0492581088139f, 0.0150684083321f, 0.00842853344215f),
                new Color(0.0594165938721f, 0.0188355104151f, 0.0105356668027f),
                new Color(0.0684471877541f, 0.0226026124981f, 0.0126428001632f),
                new Color(0.0766363089899f, 0.0263697145811f, 0.0147499335238f),
                new Color(0.0841678787653f, 0.0301368166641f, 0.0168570668843f),
                new Color(0.0911680855116f, 0.0339039187472f, 0.0189642002448f),
                new Color(0.0977278294789f, 0.0376710208302f, 0.0210713336054f),
                new Color(0.103915087694f, 0.0414146679499f, 0.0231784669659f),
                new Color(0.109782226099f, 0.044974293467f, 0.0252856003264f),
                new Color(0.115370570052f, 0.0483647728382f, 0.027392733687f),
                new Color(0.120713391496f, 0.0516062923368f, 0.0294998670475f),
                new Color(0.125837934386f, 0.054715381023f, 0.0316070004081f),
                new Color(0.130854584645f, 0.0576505684502f, 0.0337193392032f),
                new Color(0.13604190193f, 0.06025908266f, 0.0358534453625f),
                new Color(0.14140417663f, 0.0625542306901f, 0.0380109209821f),
                new Color(0.146927404384f, 0.0645557290717f, 0.0401922566139f),
                new Color(0.152598730721f, 0.0662787359665f, 0.0423389683918f),
                new Color(0.158389635306f, 0.0677778384763f, 0.0444339133373f),
                new Color(0.164222599234f, 0.0692401824912f, 0.046456344033f),
                new Color(0.170089016456f, 0.0706848851824f, 0.0484086974279f),
                new Color(0.175987920545f, 0.0721120614255f, 0.0502958207167f),
                new Color(0.181918421843f, 0.0735218171731f, 0.0521219928396f),
                new Color(0.187879698899f, 0.0749142499447f, 0.0538910122917f),
                new Color(0.19387099103f, 0.0762894492712f, 0.0556062682658f),
                new Color(0.199891591854f, 0.0776474970992f, 0.0572707988285f),
                new Color(0.205940843628f, 0.0789884681608f, 0.0588873389018f),
                new Color(0.212018132302f, 0.0803124303088f, 0.0604583601449f),
                new Color(0.218122883178f, 0.0816194448242f, 0.0619861043454f),
                new Color(0.224254557086f, 0.0829095666958f, 0.0634726115611f),
                new Color(0.230412647017f, 0.0841828448758f, 0.0649197439858f),
                new Color(0.236596675144f, 0.0854393225134f, 0.0663292063043f),
                new Color(0.242806190184f, 0.0866790371676f, 0.0677025631472f),
                new Color(0.249040765054f, 0.0879020210012f, 0.0690412541328f),
                new Color(0.255299994784f, 0.0891083009582f, 0.0703466068909f),
                new Color(0.26158349466f, 0.0902978989252f, 0.0716198483882f),
                new Color(0.267890898557f, 0.0914708318774f, 0.0728621148187f),
                new Color(0.274221857454f, 0.0926271120122f, 0.0740744602728f),
                new Color(0.280576038088f, 0.0937667468691f, 0.0752578643655f),
                new Color(0.286953121761f, 0.0948897394388f, 0.07641323897f),
                new Color(0.293352803248f, 0.0959960882604f, 0.077541434183f),
                new Color(0.299774789817f, 0.0970857875089f, 0.0786432436236f),
                new Color(0.306218800348f, 0.0981588270728f, 0.0797194091565f),
                new Color(0.312684564525f, 0.0992151926224f, 0.0807706251109f),
                new Color(0.319171134912f, 0.10025502621f, 0.0818055914811f),
                new Color(0.325676914545f, 0.101278631704f, 0.0828412386963f),
                new Color(0.332201791044f, 0.102285972873f, 0.0838775716485f),
                new Color(0.33874565084f, 0.103277010196f, 0.0849145970685f),
                new Color(0.345308379611f, 0.104251700818f, 0.0859523214123f),
                new Color(0.351889862505f, 0.105209998536f, 0.0869907508714f),
                new Color(0.358489984344f, 0.106151853789f, 0.0880298913836f),
                new Color(0.365108629799f, 0.107077213638f, 0.0890697486419f),
                new Color(0.371745683545f, 0.107986021747f, 0.0901103281045f),
                new Color(0.378401030403f, 0.108878218356f, 0.0911516350032f),
                new Color(0.385074555462f, 0.109753740249f, 0.0921936743521f),
                new Color(0.391766144185f, 0.110612520723f, 0.0932364509556f),
                new Color(0.398475682511f, 0.111454489549f, 0.0942799694164f),
                new Color(0.405203056934f, 0.112279572927f, 0.0953242341425f),
                new Color(0.411948154577f, 0.113087693439f, 0.0963692493548f),
                new Color(0.418710863264f, 0.113878770002f, 0.0974150190938f),
                new Color(0.425491071569f, 0.114652717803f, 0.098461547226f),
                new Color(0.432288668871f, 0.115409448248f, 0.0995088374503f),
                new Color(0.439103545394f, 0.116148868889f, 0.100556893304f),
                new Color(0.445935592246f, 0.116870883353f, 0.101605718168f),
                new Color(0.452784701449f, 0.117575391273f, 0.102655315275f),
                new Color(0.459650765971f, 0.118262288197f, 0.10370568771f),
                new Color(0.46653367974f, 0.118931465509f, 0.10475683842f),
                new Color(0.473433337672f, 0.11958281033f, 0.105808770216f),
                new Color(0.480349635682f, 0.120216205427f, 0.10686148578f),
                new Color(0.487282470697f, 0.120831529099f, 0.107914987668f),
                new Color(0.494231740665f, 0.121428655073f, 0.108969278312f),
                new Color(0.501197344567f, 0.122007452382f, 0.110024360032f),
                new Color(0.508179182414f, 0.122567785241f, 0.11108023503f),
                new Color(0.515177155256f, 0.123109512914f, 0.112136905403f),
                new Color(0.522191165184f, 0.123632489573f, 0.113194373138f),
                new Color(0.529221115323f, 0.12413656415f, 0.114252640123f),
                new Color(0.536266909839f, 0.12462158018f, 0.115311708147f),
                new Color(0.543328453928f, 0.125087375633f, 0.116371578905f),
                new Color(0.550405653818f, 0.125533782739f, 0.117432253997f),
                new Color(0.557498416761f, 0.125960627799f, 0.118493734936f),
                new Color(0.564606651025f, 0.126367730992f, 0.11955602315f),
                new Color(0.571730265893f, 0.126754906165f, 0.120619119982f),
                new Color(0.57886917165f, 0.12712196061f, 0.121683026697f),
                new Color(0.586023279576f, 0.127468694834f, 0.122747744479f),
                new Color(0.59319250194f, 0.127794902308f, 0.123813274439f),
                new Color(0.600376751988f, 0.12810036921f, 0.124879617617f),
                new Color(0.607575943936f, 0.128384874145f, 0.125946774979f),
                new Color(0.614789992957f, 0.128648187853f, 0.127014747427f),
                new Color(0.622018815174f, 0.128890072894f, 0.128083535793f),
                new Color(0.629262327647f, 0.129110283326f, 0.12915314085f),
                new Color(0.636520448365f, 0.129308564349f, 0.130223563305f),
                new Color(0.643793096232f, 0.129484651934f, 0.131294803809f),
                new Color(0.65108019106f, 0.129638272432f, 0.132366862954f),
                new Color(0.658381653554f, 0.129769142155f, 0.133439741276f),
                new Color(0.665697405303f, 0.129876966926f, 0.134513439256f),
                new Color(0.67302736877f, 0.129961441609f, 0.135587957327f),
                new Color(0.680371467279f, 0.130022249607f, 0.136663295866f),
                new Color(0.686819633179f, 0.132061139735f, 0.137260535772f),
                new Color(0.690577321338f, 0.139841365035f, 0.136421938331f),
                new Color(0.694333453232f, 0.147366583596f, 0.135554156099f),
                new Color(0.69808804669f, 0.154670100683f, 0.134656431336f),
                new Color(0.701841119323f, 0.161779110231f, 0.133727968564f),
                new Color(0.705592688522f, 0.16871613022f, 0.132767931803f),
                new Color(0.709342771462f, 0.175500034803f, 0.131775441528f),
                new Color(0.713091385109f, 0.182146813036f, 0.130749571337f),
                new Color(0.716838546221f, 0.188670137478f, 0.129689344281f),
                new Color(0.720584271352f, 0.195081797593f, 0.128593728817f),
                new Color(0.724328576854f, 0.201392035109f, 0.127461634333f),
                new Color(0.728071478883f, 0.207609807026f, 0.126291906198f),
                new Color(0.7318129934f, 0.213742994383f, 0.125083320255f),
                new Color(0.735553136174f, 0.219798569795f, 0.123834576701f),
                new Color(0.739291922788f, 0.225782733244f, 0.122544293247f),
                new Color(0.743029368637f, 0.231701023129f, 0.121210997469f),
                new Color(0.746765488936f, 0.237558407857f, 0.11983311822f),
                new Color(0.75050029872f, 0.243359361942f, 0.118408975956f),
                new Color(0.754233812848f, 0.249107929694f, 0.116936771817f),
                new Color(0.757966046005f, 0.254807778863f, 0.115414575242f),
                new Color(0.761697012704f, 0.260462246095f, 0.113840309888f),
                new Color(0.765426727292f, 0.266074375673f, 0.112211737544f),
                new Color(0.769155203948f, 0.271646952701f, 0.110526439697f),
                new Color(0.77288245669f, 0.277182531676f, 0.108781796299f),
                new Color(0.776608499373f, 0.28268346119f, 0.106974961217f),
                new Color(0.780333345697f, 0.288151905399f, 0.105102833683f),
                new Color(0.784057009203f, 0.293589862731f, 0.103162024955f),
                new Color(0.787779503281f, 0.298999182276f, 0.101148819133f),
                new Color(0.791500841169f, 0.304381578185f, 0.0990591268518f),
                new Color(0.795221035957f, 0.309738642359f, 0.0968884301939f),
                new Color(0.798940100587f, 0.315071855678f, 0.0946317167004f),
                new Color(0.802658047857f, 0.320382597962f, 0.0922833997264f),
                new Color(0.806374890426f, 0.325672156837f, 0.0898372215234f),
                new Color(0.810090640808f, 0.330941735639f, 0.0872861342463f),
                new Color(0.813805311384f, 0.336192460496f, 0.0846221524179f),
                new Color(0.817518914394f, 0.341425386671f, 0.0818361680288f),
                new Color(0.821231461948f, 0.346641504267f, 0.0789177160322f),
                new Color(0.824942966022f, 0.351841743372f, 0.0758546729705f),
                new Color(0.828653438464f, 0.357026978703f, 0.0726328638943f),
                new Color(0.832362890991f, 0.362198033804f, 0.0692355410618f),
                new Color(0.836071335196f, 0.367355684865f, 0.065642679414f),
                new Color(0.839778782546f, 0.372500664176f, 0.0618300036213f),
                new Color(0.843485244386f, 0.377633663287f, 0.0577676104278f),
                new Color(0.847190731941f, 0.382755335881f, 0.0534179600786f),
                new Color(0.850895256314f, 0.387866300395f, 0.0487328445222f),
                new Color(0.854598828494f, 0.39296714243f, 0.0436486154689f),
                new Color(0.858301459351f, 0.398058416948f, 0.0380796196638f),
                new Color(0.862003159643f, 0.403140650294f, 0.0322904386835f),
                new Color(0.865703940014f, 0.408214342055f, 0.0264118339446f),
                new Color(0.869403810997f, 0.413279966769f, 0.0204432589796f),
                new Color(0.870620849202f, 0.420259688127f, 0.0196207043343f),
                new Color(0.871622154301f, 0.427341619388f, 0.0192250591085f),
                new Color(0.87260643877f, 0.434372519047f, 0.0188396073492f),
                new Color(0.87357362974f, 0.441355114094f, 0.0184645577569f),
                new Color(0.874523653517f, 0.448291940683f, 0.0181001190322f),
                new Color(0.875456435563f, 0.45518536159f, 0.0177464998757f),
                new Color(0.876371900482f, 0.462037581704f, 0.017403908988f),
                new Color(0.877269972004f, 0.468850661816f, 0.0170725550697f),
                new Color(0.878150572968f, 0.47562653091f, 0.0167526468212f),
                new Color(0.879013625306f, 0.482366997164f, 0.0164443929432f),
                new Color(0.879859050028f, 0.489073757822f, 0.0161480021363f),
                new Color(0.880686767202f, 0.495748408058f, 0.0158636831011f),
                new Color(0.881496695939f, 0.502392448976f, 0.015591644538f),
                new Color(0.882288754373f, 0.509007294828f, 0.0153320951477f),
                new Color(0.883062859646f, 0.51559427955f, 0.0150852436308f),
                new Color(0.883818927886f, 0.522154662692f, 0.0148512986878f),
                new Color(0.884556874192f, 0.528689634804f, 0.0146304690194f),
                new Color(0.885276612612f, 0.535200322339f, 0.014422963326f),
                new Color(0.885978056125f, 0.541687792133f, 0.0142289903082f),
                new Color(0.886661116621f, 0.548153055488f, 0.0140487586667f),
                new Color(0.887325704879f, 0.554597071914f, 0.013882477102f),
                new Color(0.88797173055f, 0.561020752565f, 0.0137303543147f),
                new Color(0.888599102131f, 0.56742496338f, 0.0135925990053f),
                new Color(0.889207726947f, 0.573810527989f, 0.0134694198745f),
                new Color(0.889797511128f, 0.580178230371f, 0.0133610256227f),
                new Color(0.890368359587f, 0.586528817319f, 0.0132676249506f),
                new Color(0.890920175994f, 0.592863000709f, 0.0131894265588f),
                new Color(0.891452862757f, 0.5991814596f, 0.0131266391478f),
                new Color(0.891966320994f, 0.605484842178f, 0.0130794714182f),
                new Color(0.892460450511f, 0.611773767557f, 0.0130481320706f),
                new Color(0.892935149775f, 0.618048827454f, 0.0130328298055f),
                new Color(0.893390315889f, 0.624310587737f, 0.0130337733235f),
                new Color(0.893825844568f, 0.630559589875f, 0.0130511713252f),
                new Color(0.894241630107f, 0.636796352279f, 0.0130852325112f),
                new Color(0.894637565357f, 0.643021371558f, 0.013136165582f),
                new Color(0.895013541696f, 0.649235123688f, 0.0132041792383f),
                new Color(0.895369449001f, 0.655438065104f, 0.0132894821805f),
                new Color(0.895705175617f, 0.661630633721f, 0.0133922831093f),
                new Color(0.896020608327f, 0.66781324989f, 0.0135127907252f),
                new Color(0.89631563232f, 0.673986317291f, 0.0136512137289f),
                new Color(0.896590131162f, 0.680150223773f, 0.0138077608208f),
                new Color(0.896843986762f, 0.686305342141f, 0.0139826407016f),
                new Color(0.897077079337f, 0.692452030892f, 0.0141760620719f),
                new Color(0.897289287378f, 0.698590634912f, 0.0143882336321f),
                new Color(0.89748048762f, 0.704721486124f, 0.0146193640829f),
                new Color(0.897650554997f, 0.710844904108f, 0.0148696621249f),
                new Color(0.897799362612f, 0.716961196674f, 0.0151393364586f),
                new Color(0.897926781699f, 0.72307066041f, 0.0154285957846f),
                new Color(0.89803268158f, 0.729173581195f, 0.0157376488035f),
                new Color(0.898116929626f, 0.735270234683f, 0.0160667042159f),
                new Color(0.89817939122f, 0.741360886763f, 0.0164159707222f),
                new Color(0.89821992971f, 0.747445793991f, 0.0167856570232f),
                new Color(0.89823840637f, 0.753525204f, 0.0171759718194f),
                new Color(0.898234680352f, 0.759599355884f, 0.0175871238113f),
                new Color(0.898208608643f, 0.76566848057f, 0.0180193216995f),
                new Color(0.898160046015f, 0.771732801162f, 0.0184727741846f),
                new Color(0.898088844982f, 0.777792533271f, 0.0189476899672f),
                new Color(0.897994855746f, 0.783847885327f, 0.0194442777479f),
                new Color(0.897877926148f, 0.789899058877f, 0.0199627462272f),
                new Color(0.897737901615f, 0.795946248863f, 0.0205033041056f),
                new Color(0.897574625107f, 0.801989643893f, 0.0210661600838f),
                new Color(0.897387937062f, 0.808029426494f, 0.0216515228624f),
                new Color(0.897177675337f, 0.814065773352f, 0.0222596011419f),
                new Color(0.896943675152f, 0.820098855544f, 0.0228906036229f),
                new Color(0.896685769028f, 0.826128838754f, 0.023544739006f),
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
                new Color(1f, 1f, 1f));


    }


}
