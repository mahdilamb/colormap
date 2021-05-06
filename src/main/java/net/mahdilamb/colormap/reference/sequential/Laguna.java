package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ReferenceColormap;

import java.awt.*;

/**
 * Colormap from Peter Karpov @see <a href="http://inversed.ru/index.htm">Peter Karpov</a>. Laguna
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Laguna",source = "Peter Karpov")
public final class Laguna extends SequentialColormap {
    /**
     * Create a colormap based on Laguna
     */
    public Laguna() {
        super(
                Color.BLACK,
                new Color(0.0120523458472091f, 0.00302976375346293f, 0.0121816260969515f),
                new Color(0.0240095399463226f, 0.0060712599355588f, 0.0245273871238326f),
                new Color(0.0358664407301142f, 0.00912644306195601f, 0.0370330661844431f),
                new Color(0.0472976260774104f, 0.0121152130307314f, 0.0493599760750782f),
                new Color(0.0575862229250587f, 0.0148541727159192f, 0.0607419525372503f),
                new Color(0.0669486447612726f, 0.0173967838460623f, 0.0713751342921341f),
                new Color(0.0755453992405588f, 0.0197829440258496f, 0.0814045513518846f),
                new Color(0.0834992126039898f, 0.0220433998494538f, 0.0909408845207449f),
                new Color(0.090902300764556f, 0.0242014264476442f, 0.10006644961635f),
                new Color(0.0978272640275956f, 0.0262755233368313f, 0.1088456616348f),
                new Color(0.104330720853157f, 0.0282802544201707f, 0.117328059012396f),
                new Color(0.110458727857019f, 0.0302276015363482f, 0.125553585907105f),
                new Color(0.116249090052935f, 0.0321275203643479f, 0.133554669355059f),
                new Color(0.121733262358264f, 0.0339884040560482f, 0.141357973415419f),
                new Color(0.126937729181859f, 0.0358174195689058f, 0.148985667755175f),
                new Color(0.131885030011782f, 0.037620757847593f, 0.156456368804515f),
                new Color(0.136594525161205f, 0.0394038203641259f, 0.163785838446807f),
                new Color(0.141072454305137f, 0.0411682896292163f, 0.170974757700893f),
                new Color(0.145310055643471f, 0.0429113666445194f, 0.178005590721738f),
                new Color(0.149329521190593f, 0.0446392410051133f, 0.184898502396853f),
                new Color(0.153171678562542f, 0.0463639279857561f, 0.191697988621968f),
                new Color(0.156953787820633f, 0.0481213793720637f, 0.198547274600341f),
                new Color(0.160686978844699f, 0.049916373174243f, 0.205460150730603f),
                new Color(0.164369991389117f, 0.0517499697610593f, 0.212434985341435f),
                new Color(0.168001575300007f, 0.053623217037602f, 0.219470076684735f),
                new Color(0.171580477835964f, 0.0555371446446011f, 0.226563634289863f),
                new Color(0.175105438538482f, 0.0574927602160923f, 0.233713769252384f),
                new Color(0.178556345579183f, 0.0594847694701158f, 0.240893068652684f),
                new Color(0.181988468554592f, 0.0615329668649465f, 0.248175723228921f),
                new Color(0.185344000494769f, 0.0636194498041012f, 0.255483272753967f),
                new Color(0.188640535865877f, 0.0657514065683195f, 0.262838882257442f),
                new Color(0.191876837720391f, 0.0679297211910767f, 0.270240209055012f),
                new Color(0.19505160055695f, 0.0701552197480021f, 0.277684707704896f),
                new Color(0.198163610844147f, 0.0724287243074655f, 0.285169852440014f),
                new Color(0.201211655158029f, 0.0747510185913432f, 0.292693007204012f),
                new Color(0.204194647710306f, 0.0771228932054609f, 0.300251609734724f),
                new Color(0.207111251600974f, 0.0795450011698886f, 0.30784261523854f),
                new Color(0.20996036856663f, 0.0820180380172534f, 0.31546320856871f),
                new Color(0.212740867663267f, 0.0845426384448496f, 0.323110407634192f),
                new Color(0.215451649749748f, 0.0871193979695036f, 0.330781156061913f),
                new Color(0.218091645130778f, 0.0897488695992694f, 0.338472318384297f),
                new Color(0.220659818988286f, 0.0924315636042993f, 0.346180687192346f),
                new Color(0.223155173580426f, 0.0951679460878949f, 0.353902985698172f),
                new Color(0.225576738127657f, 0.0979584322604641f, 0.361635850782154f),
                new Color(0.227923630519617f, 0.100803410944425f, 0.369375931379444f),
                new Color(0.230194957345426f, 0.103703199210154f, 0.377119728509083f),
                new Color(0.232389896717477f, 0.106658075958572f, 0.384863727486332f),
                new Color(0.234526898094271f, 0.109677259735376f, 0.392636543968077f),
                new Color(0.236550486860481f, 0.112735349648203f, 0.400342953207929f),
                new Color(0.238510141631149f, 0.115855868111023f, 0.408063139702089f),
                new Color(0.240402944500584f, 0.119038149313386f, 0.415790232498721f),
                new Color(0.242193674569906f, 0.122265070735987f, 0.423460591563709f),
                new Color(0.243916018136065f, 0.125553538822577f, 0.431129607422851f),
                new Color(0.245557765442712f, 0.128897639213036f, 0.438773140627109f),
                new Color(0.247118563445482f, 0.132297243982332f, 0.446387433383447f),
                new Color(0.248598127283483f, 0.135752173636007f, 0.453968723588414f),
                new Color(0.24999624819266f, 0.13926220082881f, 0.461513262537525f),
                new Color(0.2513127718578f, 0.142827037920929f, 0.469017278583477f),
                new Color(0.25254763210456f, 0.146446355268626f, 0.476477042745516f),
                new Color(0.253700832426042f, 0.150119771101236f, 0.483888839122585f),
                new Color(0.254772441880377f, 0.153846848945901f, 0.4912489609533f),
                new Color(0.255762634817757f, 0.157627121902631f, 0.498553791787625f),
                new Color(0.256671633699501f, 0.161460059133672f, 0.505799700963025f),
                new Color(0.257499747637838f, 0.16534508966646f, 0.512983122710963f),
                new Color(0.258247366351839f, 0.169281600142624f, 0.520100550657256f),
                new Color(0.258914947740507f, 0.173268928069672f, 0.527148518816134f),
                new Color(0.259503036235956f, 0.177306375313283f, 0.534123644553204f),
                new Color(0.260012251910031f, 0.181393202978891f, 0.541022613411742f),
                new Color(0.260443291891035f, 0.185528634417163f, 0.547842188661469f),
                new Color(0.260796929430754f, 0.189711856925968f, 0.554579216330571f),
                new Color(0.261074012861041f, 0.193942023585229f, 0.561230630168511f),
                new Color(0.261275464779699f, 0.198218255480174f, 0.567793457263588f),
                new Color(0.261402280736047f, 0.202539643783081f, 0.574264822753427f),
                new Color(0.261455476701847f, 0.206905211513934f, 0.580641840921739f),
                new Color(0.261436297300067f, 0.211314081082831f, 0.586922084387382f),
                new Color(0.261345889955024f, 0.215765222590887f, 0.593102871896776f),
                new Color(0.261185525362833f, 0.220257629528983f, 0.599181762087417f),
                new Color(0.260956537946341f, 0.224790276618609f, 0.6051564305678f),
                new Color(0.260660323520921f, 0.229362122106298f, 0.611024672646983f),
                new Color(0.260298336820815f, 0.233972110057382f, 0.616784405692528f),
                new Color(0.259872088897524f, 0.238619172639529f, 0.622433671112391f),
                new Color(0.259383144402306f, 0.24330223238679f, 0.627970635958552f),
                new Color(0.258833118765324f, 0.248020204435209f, 0.633393594152416f),
                new Color(0.258223675284345f, 0.252771998721425f, 0.638700967334168f),
                new Color(0.257556522136153f, 0.257556522136153f, 0.643891305340384f),
                new Color(0.256833409324005f, 0.262372680624896f, 0.648963286316215f),
                new Color(0.256056125574508f, 0.267219381228794f, 0.653915716470383f),
                new Color(0.255226495197268f, 0.272095534059069f, 0.658747529483018f),
                new Color(0.254346374920488f, 0.277000054199126f, 0.663457785578049f),
                new Color(0.253417650715504f, 0.281931863528974f, 0.66804567027337f),
                new Color(0.252442234622893f, 0.286889892467299f, 0.672510492823393f),
                new Color(0.251422061592407f, 0.29187308162712f, 0.676851684369798f),
                new Color(0.250359086348503f, 0.296880383381626f, 0.681068795817365f),
                new Color(0.249255280292711f, 0.30191076333744f, 0.685161495452635f),
                new Color(0.248112628453467f, 0.306963201713167f, 0.68912956632388f),
                new Color(0.246933126493414f, 0.312036694621707f, 0.692972903401425f),
                new Color(0.245718777783461f, 0.317130255255422f, 0.696691510537728f),
                new Color(0.244471590552171f, 0.32224291497379f, 0.700285497246894f),
                new Color(0.243193575118321f, 0.327373724293751f, 0.703755075323362f),
                new Color(0.241886741213677f, 0.332521753783452f, 0.707100555319453f),
                new Color(0.240553095402272f, 0.337686094860569f, 0.710322342901267f),
                new Color(0.239194638601697f, 0.342865860496827f, 0.713420935102108f),
                new Color(0.237813363711124f, 0.348060185830774f, 0.716396916492186f),
                new Color(0.236411253350034f, 0.353268228691175f, 0.719250955282787f),
                new Color(0.234990277710866f, 0.358489170033774f, 0.721983799382513f),
                new Color(0.233552392528082f, 0.363722214294421f, 0.724596272422446f),
                new Color(0.232099537165432f, 0.368966589661836f, 0.727089269766342f),
                new Color(0.230633632822575f, 0.374221548273465f, 0.729463754521106f),
                new Color(0.229156580862917f, 0.37948636634042f, 0.731720753566451f),
                new Color(0.227670286923499f, 0.384760387572238f, 0.733861436331555f),
                new Color(0.226176545032718f, 0.390042830228363f, 0.735886742404132f),
                new Color(0.224677217030216f, 0.395333089638248f, 0.737797957761748f),
                new Color(0.223174147592207f, 0.400630603707251f, 0.739596447250763f),
                new Color(0.221669090468909f, 0.405934721273495f, 0.741283409052417f),
                new Color(0.220163780455763f, 0.411244826507653f, 0.742860107462025f),
                new Color(0.218659967572506f, 0.416560406821244f, 0.744327989922618f),
                new Color(0.217159345632834f, 0.421880923345742f, 0.745688447405606f),
                new Color(0.215663575400711f, 0.427205852683554f, 0.746942889479307f),
                new Color(0.214174296987113f, 0.432534712014834f, 0.748092785826833f),
                new Color(0.21269311638982f, 0.437867033765549f, 0.749139618753537f),
                new Color(0.211221607407489f, 0.44320236929776f, 0.75008488779001f),
                new Color(0.209761312184561f, 0.448540289988314f, 0.750930109605848f),
                new Color(0.208313763691021f, 0.45388043609364f, 0.751676897040349f),
                new Color(0.206880395867398f, 0.459222321635354f, 0.752326633291807f),
                new Color(0.205462684423428f, 0.464565638517057f, 0.752880976066037f),
                new Color(0.20406204575599f, 0.469910038320114f, 0.753341492165738f),
                new Color(0.202679864639424f, 0.475255190787616f, 0.75370975402313f),
                new Color(0.201317494369535f, 0.480600783266321f, 0.753987337518603f),
                new Color(0.199976253587852f, 0.485946511937122f, 0.754175807181839f),
                new Color(0.198657441496794f, 0.491292117520499f, 0.754276770617885f),
                new Color(0.197362313088565f, 0.49663732411049f, 0.754291782309028f),
                new Color(0.196092098362474f, 0.501981883991519f, 0.754222412774423f),
                new Color(0.194847997332798f, 0.50732556422182f, 0.754070226799204f),
                new Color(0.193631180450811f, 0.512668146052961f, 0.753836781904782f),
                new Color(0.192442788901963f, 0.51800942392343f, 0.753523626298325f),
                new Color(0.191283935997197f, 0.523349207322409f, 0.753132301086841f),
                new Color(0.190155705413663f, 0.528687314061578f, 0.752664330122281f),
                new Color(0.189059156933917f, 0.534023584058647f, 0.752121239389065f),
                new Color(0.1879953150151f, 0.539357845187303f, 0.751504508376752f),
                new Color(0.186965188766061f, 0.544689967389935f, 0.750815646222979f),
                new Color(0.185969313276466f, 0.550018506268605f, 0.750054339522918f),
                new Color(0.1850099646031f, 0.5553472505573f, 0.749227382094093f),
                new Color(0.184086747914801f, 0.560672171619302f, 0.748330877885724f),
                new Color(0.183200930156022f, 0.565994224897897f, 0.747367708711812f),
                new Color(0.182358354052543f, 0.571314009682049f, 0.746338070216627f),
                new Color(0.183613404385308f, 0.576604078552064f, 0.744328201705993f),
                new Color(0.184962349084447f, 0.581878263674632f, 0.742310576566977f),
                new Color(0.186409180578303f, 0.587137587495039f, 0.740287664139913f),
                new Color(0.187955305519981f, 0.592381708789536f, 0.73826116907627f),
                new Color(0.189602780992628f, 0.597610601944114f, 0.736233046068999f),
                new Color(0.191353689521775f, 0.602824233124611f, 0.734205305710195f),
                new Color(0.193210106625086f, 0.608022544835275f, 0.73218000533686f),
                new Color(0.195174082363138f, 0.613205448251646f, 0.730159243954797f),
                new Color(0.197247724058031f, 0.61837286421813f, 0.728145191054618f),
                new Color(0.199433080837871f, 0.6235246684815f, 0.726140049328465f),
                new Color(0.201732207354731f, 0.62866072384351f, 0.724146076948698f),
                new Color(0.204147152846937f, 0.633780875992672f, 0.722165585102231f),
                new Color(0.20667998070278f, 0.638884963554698f, 0.720200946065197f),
                new Color(0.209332645394967f, 0.643972763342918f, 0.718254550891438f),
                new Color(0.212107257357136f, 0.649044112011652f, 0.716328904070476f),
                new Color(0.215005714615409f, 0.654098740969932f, 0.71442649370941f),
                new Color(0.218029971009063f, 0.659136399398299f, 0.712549887452805f),
                new Color(0.221181993582215f, 0.664156835523725f, 0.710701719001904f),
                new Color(0.224463629298951f, 0.669159740451317f, 0.708884639659422f),
                new Color(0.227876797584532f, 0.674144833179035f, 0.70710139033011f),
                new Color(0.23142313494233f, 0.679111711543667f, 0.705354668036863f),
                new Color(0.235104558060857f, 0.684060092131025f, 0.703647339684594f),
                new Color(0.238922954739145f, 0.688989678670223f, 0.701982328051269f),
                new Color(0.242879636481706f, 0.69389994238411f, 0.700362395945641f),
                new Color(0.246976334059211f, 0.698790533623684f, 0.698790533623684f),
                new Color(0.251214573350374f, 0.703661026696591f, 0.697269716568848f),
                new Color(0.255595808285232f, 0.708510977193281f, 0.695802956736014f),
                new Color(0.260121415509428f, 0.713339922292774f, 0.694393300049529f),
                new Color(0.264792688969661f, 0.71814738112888f, 0.693043823691718f),
                new Color(0.269610834440306f, 0.72293285522163f, 0.691757633181946f),
                new Color(0.274576964012907f, 0.727695828978543f, 0.69053785924751f),
                new Color(0.279692090571917f, 0.732435770270195f, 0.689387654489015f),
                new Color(0.284957122281675f, 0.737152131084317f, 0.688310189844253f),
                new Color(0.290372857111086f, 0.741844348262387f, 0.687308650856067f),
                new Color(0.295939977423826f, 0.746511844322345f, 0.68638623375121f),
                new Color(0.301659044663112f, 0.751154028370655f, 0.68554614133872f),
                new Color(0.307530494161103f, 0.755770297106502f, 0.684791578737927f),
                new Color(0.313554630103774f, 0.760360035920409f, 0.684125748947741f),
                new Color(0.319731621984111f, 0.764922620538671f, 0.683551848875827f),
                new Color(0.32606083947154f, 0.769457192346762f, 0.683072754056843f),
                new Color(0.332544077276169f, 0.773963764676181f, 0.682692532075544f),
                new Color(0.339179883889203f, 0.778441280488593f, 0.682413780426119f),
                new Color(0.345966966344853f, 0.782888797912047f, 0.682239197304028f),
                new Color(0.352905239612291f, 0.787305832246894f, 0.682172101241591f),
                new Color(0.359994578057829f, 0.791691929975051f, 0.68221584372753f),
                new Color(0.367233921445486f, 0.79604638171412f, 0.682373360198484f),
                new Color(0.374622083759778f, 0.800368495385052f, 0.68264755567204f),
                new Color(0.382157803743594f, 0.804657614102784f, 0.683041327497429f),
                new Color(0.389839708220023f, 0.808913105770039f, 0.683557544480981f),
                new Color(0.397666233462754f, 0.813134340268984f, 0.68419900271744f),
                new Color(0.405635682531476f, 0.817320709737784f, 0.684968450695557f),
                new Color(0.413746098439782f, 0.821471591660069f, 0.685868517555424f),
                new Color(0.421995434692072f, 0.825586403711773f, 0.686901797857948f),
                new Color(0.430381456351225f, 0.829664575056043f, 0.688070794618406f),
                new Color(0.438901763355012f, 0.833705555398749f, 0.6893779263889f),
                new Color(0.447553792947134f, 0.837708817409524f, 0.690825523327801f),
                new Color(0.456334822427251f, 0.841673859081742f, 0.69241582338668f),
                new Color(0.465241972401448f, 0.845600206079301f, 0.694150968732203f),
                new Color(0.474272210517591f, 0.849487414058491f, 0.696033002416085f),
                new Color(0.483422355666068f, 0.853335070953117f, 0.698063865303979f),
                new Color(0.492689082622596f, 0.857142799210985f, 0.700245393271766f),
                new Color(0.502068927106134f, 0.860910257969938f, 0.702579314675189f),
                new Color(0.511558291221502f, 0.864637145161771f, 0.705067248096083f),
                new Color(0.521153449253137f, 0.868323199532635f, 0.707710700365749f),
                new Color(0.530850553773656f, 0.871968202568882f, 0.710511064863262f),
                new Color(0.540645408338481f, 0.875571917016838f, 0.713469474315513f),
                new Color(0.550534381006022f, 0.879134334760143f, 0.71658736354777f),
                new Color(0.560513094130942f, 0.882655320195486f, 0.719865652000091f),
                new Color(0.570577282062496f, 0.886134843466345f, 0.723305269220901f),
                new Color(0.580722592458166f, 0.889572925610001f, 0.726907027494705f),
                new Color(0.590944593759198f, 0.892969639799162f, 0.730671621866972f),
                new Color(0.601238782751112f, 0.89632511244492f, 0.734599630418015f),
                new Color(0.611600592172756f, 0.899639524157296f, 0.738691514773402f),
                new Color(0.622025398338361f, 0.902913110560566f, 0.742947620837298f),
                new Color(0.632508501450262f, 0.906146155992361f, 0.747368160975033f),
                new Color(0.643045268096528f, 0.909339028491028f, 0.751953307908746f),
                new Color(0.653630873277601f, 0.912492112367392f, 0.7567030136117f),
                new Color(0.664260565741799f, 0.915605874337646f, 0.76161718802407f),
                new Color(0.674929553641417f, 0.918680832537808f, 0.766695617221577f),
                new Color(0.685633031412816f, 0.921717561535389f, 0.771937978744022f),
                new Color(0.696366188113622f, 0.924716692499983f, 0.777343844483836f),
                new Color(0.707124214060463f, 0.92767891285776f, 0.782912682633503f),
                new Color(0.717902307238277f, 0.930604965812055f, 0.788643859710326f),
                new Color(0.72869553547941f, 0.933495614439478f, 0.794536533599577f),
                new Color(0.73949937960298f, 0.936351772792947f, 0.800590061048753f),
                new Color(0.750308984343773f, 0.939174319667497f, 0.806803431989369f),
                new Color(0.761119632171154f, 0.941964212806502f, 0.813175623227992f),
                new Color(0.771926656628695f, 0.944722465200705f, 0.819705532523181f),
                new Color(0.782725410718419f, 0.947450135064007f, 0.826391952317893f),
                new Color(0.793511305645558f, 0.950148332881921f, 0.833233598652747f),
                new Color(0.804279910968716f, 0.95281824314581f, 0.840229192171053f),
                new Color(0.81502648287846f, 0.955461008227213f, 0.847377072541671f),
                new Color(0.825746734246251f, 0.958077911700205f, 0.85467582350746f),
                new Color(0.836436163726873f, 0.960670214168507f, 0.862123724201498f),
                new Color(0.847090795458936f, 0.96323932887293f, 0.869719366379972f),
                new Color(0.857706163965543f, 0.965786575196495f, 0.877460800721574f),
                new Color(0.868278060311595f, 0.968313355720121f, 0.885346160469494f),
                new Color(0.87880243703018f, 0.970821130960458f, 0.893373586040606f),
                new Color(0.889275326529278f, 0.973311397438088f, 0.901541156508774f),
                new Color(0.899692673407571f, 0.975785644910886f, 0.909846739180256f),
                new Color(0.910045030016059f, 0.978244070834799f, 0.918283163157107f),
                new Color(0.920344054546289f, 0.980691986170181f, 0.926862282463351f),
                new Color(0.930573317618246f, 0.983127919156244f, 0.935570353851528f),
                new Color(0.940730668111884f, 0.985553851971222f, 0.944406389071373f),
                new Color(0.950813922431214f, 0.987971764803291f, 0.95336928910956f),
                new Color(0.960819605093819f, 0.990383325344514f, 0.962456633588737f),
                new Color(0.970744323492596f, 0.992790219838831f, 0.971665943558489f),
                new Color(0.980584768357684f, 0.995194151035556f, 0.980994682502062f),
                new Color(0.990337714089507f, 0.997596836137128f, 0.990440257274271f),
                Color.WHITE);

    }


}
