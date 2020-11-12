package net.mahdilamb.colormap.diverging;

import net.mahdilamb.colormap.ColorMapType;
import net.mahdilamb.colormap.LinearColorMap;
import net.mahdilamb.colormap.NewColorMap;
import net.mahdilamb.colormap.color.Color;

@NewColorMap(type = ColorMapType.DIVERGING, name = "SmoothCoolWarm")
public final class SmoothCoolWarm extends LinearColorMap {
    public SmoothCoolWarm() {
        super(
                new Color(0.338999030442358f, 0.290177126281036f, 0.762712567787502f),
                new Color(0.343207654143344f, 0.297250670551253f, 0.768868415518558f),
                new Color(0.347417047891218f, 0.304305324276927f, 0.774961782940433f),
                new Color(0.351627529335875f, 0.311341307651279f, 0.780991701149735f),
                new Color(0.355839406963136f, 0.318358750343096f, 0.786957212599914f),
                new Color(0.360052979926255f, 0.325357700692458f, 0.792857371243497f),
                new Color(0.364268537870799f, 0.332338133804503f, 0.798691242672608f),
                new Color(0.368486360754279f, 0.339299958696706f, 0.804457904257704f),
                new Color(0.372706718661827f, 0.346243024630193f, 0.810156445284479f),
                new Color(0.376929871619104f, 0.353167126735109f, 0.815785967088885f),
                new Color(0.381156069403571f, 0.360072011023215f, 0.821345583190198f),
                new Color(0.385385551355159f, 0.366957378866872f, 0.8268344194221f),
                new Color(0.389618546187306f, 0.373822891011937f, 0.832251614061711f),
                new Color(0.393855271799274f, 0.38066817118237f, 0.837596317956536f),
                new Color(0.398095935090596f, 0.387492809326199f, 0.842867694649269f),
                new Color(0.402340731778411f, 0.394296364545603f, 0.848064920500421f),
                new Color(0.40658984621845f, 0.401078367748081f, 0.853187184808723f),
                new Color(0.410843451230328f, 0.407838324050737f, 0.858233689929266f),
                new Color(0.415101707927773f, 0.414575714965542f, 0.863203651389329f),
                new Color(0.419364765554368f, 0.421290000389818f, 0.868096298001878f),
                new Color(0.423632761325343f, 0.427980620423179f, 0.872910871976675f),
                new Color(0.427905820275887f, 0.434646997029484f, 0.877646629028978f),
                new Color(0.43218405511645f, 0.441288535560112f, 0.882302838485783f),
                new Color(0.436467566095413f, 0.44790462615294f, 0.8868787833896f),
                new Color(0.440756440869506f, 0.454494645019643f, 0.891373760599698f),
                new Color(0.445050754382288f, 0.461057955632547f, 0.895787080890819f),
                new Color(0.449350568750994f, 0.467593909820923f, 0.90011806904931f),
                new Color(0.45365593316199f, 0.474101848785516f, 0.904366063966656f),
                new Color(0.457966883775054f, 0.480581104039159f, 0.908530418730384f),
                new Color(0.462283443636696f, 0.487030998280397f, 0.912610500712308f),
                new Color(0.466605622602634f, 0.493450846206371f, 0.916605691654104f),
                new Color(0.4709334172696f, 0.49983995527051f, 0.920515387750165f),
                new Color(0.475266810916528f, 0.506197626389994f, 0.924338999727741f),
                new Color(0.47960577345523f, 0.512523154607467f, 0.928075952924326f),
                new Color(0.483950261390591f, 0.518815829711009f, 0.93172568736227f),
                new Color(0.488300217790297f, 0.525074936815947f, 0.935287657820609f),
                new Color(0.492655572264098f, 0.531299756911789f, 0.938761333904079f),
                new Color(0.497016240952581f, 0.537489567377182f, 0.942146200109301f),
                new Color(0.501382126525404f, 0.543643642465552f, 0.945441755888131f),
                new Color(0.505753118188903f, 0.549761253763822f, 0.948647515708135f),
                new Color(0.510129091703012f, 0.555841670626371f, 0.951763009110198f),
                new Color(0.514509909407371f, 0.561884160586201f, 0.954787780763233f),
                new Color(0.518895420256498f, 0.567887989745094f, 0.957721390515997f),
                new Color(0.523285459863886f, 0.573852423144388f, 0.960563413445974f),
                new Color(0.527679850554883f, 0.579776725117839f, 0.963313439905337f),
                new Color(0.532078401428162f, 0.585660159627921f, 0.965971075563972f),
                new Color(0.536480908425618f, 0.591501990586783f, 0.968535941449541f),
                new Color(0.540887154410494f, 0.597301482162983f, 0.971007673984588f),
                new Color(0.545296909253533f, 0.603057899075025f, 0.97338592502068f),
                new Color(0.549709929926936f, 0.608770506872629f, 0.975670361869563f),
                new Color(0.554125960605912f, 0.61443857220659f, 0.977860667331337f),
                new Color(0.55854473277759f, 0.620061363088013f, 0.979956539719638f),
                new Color(0.562965965357054f, 0.625638149137634f, 0.981957692883826f),
                new Color(0.567389364810255f, 0.631168201825896f, 0.983863856228162f),
                new Color(0.57181462528357f, 0.63665079470438f, 0.985674774727994f),
                new Color(0.576241428739732f, 0.642085203629146f, 0.98739020894292f),
                new Color(0.580669445099899f, 0.647470706976496f, 0.98900993502694f),
                new Color(0.585098332391599f, 0.652806585851636f, 0.990533744735605f),
                new Color(0.589527736902282f, 0.658092124290657f, 0.991961445430133f),
                new Color(0.593957293338244f, 0.66332660945625f, 0.993292860078523f),
                new Color(0.598386624988638f, 0.668509331827511f, 0.994527827253647f),
                new Color(0.60281534389433f, 0.673639585384179f, 0.995666201128323f),
                new Color(0.607243051021336f, 0.678716667785621f, 0.996707851467377f),
                new Color(0.611669336438593f, 0.68373988054486f, 0.997652663616693f),
                new Color(0.61609377949979f, 0.688708529197895f, 0.998500538489254f),
                new Color(0.62051594902903f, 0.693621923468581f, 0.999251392548167f),
                new Color(0.624935403510066f, 0.698479377429283f, 0.9999051577867f),
                new Color(0.62935169127886f, 0.70328020965752f, 1f),
                new Color(0.633764350719237f, 0.708023743388797f, 1f),
                new Color(0.638172910461389f, 0.712709306665797f, 1f),
                new Color(0.642576889582999f, 0.717336232484112f, 1f),
                new Color(0.64697579781276f, 0.721903858934654f, 1f),
                new Color(0.651369135736074f, 0.726411529342908f, 1f),
                new Color(0.655756395002697f, 0.730858592405135f, 1f),
                new Color(0.660137058536141f, 0.73524440232167f, 1f),
                new Color(0.664510600744614f, 0.739568318927416f, 1f),
                new Color(0.668876487733311f, 0.743829707819641f, 1f),
                new Color(0.673234177517849f, 0.748027940483184f, 1f),
                new Color(0.677583120238682f, 0.75216239441314f, 1f),
                new Color(0.681922758376294f, 0.756232453235135f, 0.999566165980966f),
                new Color(0.686252526967009f, 0.760237506823239f, 0.998862170797099f),
                new Color(0.690571853819259f, 0.764176951415609f, 0.998061907605509f),
                new Color(0.694880159730128f, 0.76805018972792f, 0.997165551738271f),
                new Color(0.69917685870204f, 0.771856631064639f, 0.996173293264838f),
                new Color(0.703461358159432f, 0.775595691428212f, 0.995085336919239f),
                new Color(0.707733059165279f, 0.779266793626193f, 0.993901902024443f),
                new Color(0.711991356637326f, 0.782869367376391f, 0.992623222413889f),
                new Color(0.716235639563915f, 0.786402849410047f, 0.991249546350197f),
                new Color(0.720465291219267f, 0.789866683573106f, 0.989781136441091f),
                new Color(0.724679689378116f, 0.793260320925603f, 0.988218269552509f),
                new Color(0.72887820652959f, 0.796583219839208f, 0.986561236718953f),
                new Color(0.733060210090211f, 0.799834846092946f, 0.984810343051058f),
                new Color(0.737225062615953f, 0.803014672967137f, 0.982965907640424f),
                new Color(0.74137212201323f, 0.806122181335562f, 0.981028263461685f),
                new Color(0.745500741748756f, 0.809156859755885f, 0.978997757271871f),
                new Color(0.749610271058174f, 0.812118204558355f, 0.976874749507035f),
                new Color(0.7537000551534f, 0.815005719932801f, 0.974659614176188f),
                new Color(0.757769435428586f, 0.81781891801392f, 0.972352738752536f),
                new Color(0.761817749664665f, 0.820557318964907f, 0.969954524062031f),
                new Color(0.765844332232395f, 0.823220451059393f, 0.967465384169263f),
                new Color(0.769848514293858f, 0.82580785076174f, 0.964885746260679f),
                new Color(0.773829624002355f, 0.828319062805674f, 0.962216050525163f),
                new Color(0.777786986700659f, 0.830753640271271f, 0.95945675003197f),
                new Color(0.781719925117576f, 0.833111144660304f, 0.956608310606031f),
                new Color(0.785627759562783f, 0.835391145969941f, 0.953671210700641f),
                new Color(0.789509808119894f, 0.837593222764813f, 0.950645941267519f),
                new Color(0.793365386837742f, 0.839716962247432f, 0.947533005624279f),
                new Color(0.797193809919837f, 0.84176196032697f, 0.944332919319279f),
                new Color(0.80099438991198f, 0.84372782168639f, 0.94104620999389f),
                new Color(0.804766437888006f, 0.845614159847931f, 0.937673417242158f),
                new Color(0.80850926363366f, 0.847420597236928f, 0.934215092467885f),
                new Color(0.812222175828561f, 0.849146765243974f, 0.930671798739111f),
                new Color(0.815904482226264f, 0.850792304285406f, 0.927044110640016f),
                new Color(0.819555489832411f, 0.852356863862109f, 0.923332614120214f),
                new Color(0.823174505080946f, 0.853840102616625f, 0.919537906341469f),
                new Color(0.826760834008418f, 0.855241688388554f, 0.91566059552179f),
                new Color(0.830313782426346f, 0.856561298268242f, 0.91170130077693f),
                new Color(0.833832656091664f, 0.857798618648725f, 0.907660651959254f),
                new Color(0.837316760875235f, 0.858953345275924f, 0.90353928949398f),
                new Color(0.84076540292845f, 0.86002518329708f, 0.899337864212773f),
                new Color(0.844177888847914f, 0.861013847307382f, 0.895057037184662f),
                new Color(0.84755352583823f, 0.861919061394815f, 0.890697479544281f),
                new Color(0.850891621872883f, 0.862740559183148f, 0.88625987231739f),
                new Color(0.854191485853246f, 0.863478083873096f, 0.881744906243658f),
                new Color(0.857452427765714f, 0.864131388281592f, 0.877153281596672f),
                new Color(0.860673758836986f, 0.864700234879159f, 0.872485708001137f),
                new Color(0.863854791687499f, 0.865184395825357f, 0.867742904247223f),
                new Color(0.867330172095592f, 0.864540193790038f, 0.862606204184647f),
                new Color(0.871070378944125f, 0.862768865839348f, 0.857104915331612f),
                new Color(0.874730228191914f, 0.860914528829235f, 0.851568854999154f),
                new Color(0.878309567594265f, 0.858977442673852f, 0.845998954057085f),
                new Color(0.881808244333521f, 0.856957876310522f, 0.840396142257746f),
                new Color(0.885226105403018f, 0.854856107597699f, 0.834761348080346f),
                new Color(0.888562997974072f, 0.852672423210055f, 0.829095498576805f),
                new Color(0.891818769746953f, 0.850407118530621f, 0.823399519219124f),
                new Color(0.894993269286757f, 0.848060497539883f, 0.817674333748294f),
                new Color(0.898086346344997f, 0.845632872701745f, 0.811920864024785f),
                new Color(0.901097852167712f, 0.843124564846249f, 0.806140029880617f),
                new Color(0.904027639790806f, 0.840535903048967f, 0.800332748973057f),
                new Color(0.906875564323303f, 0.837867224506926f, 0.794499936639948f),
                new Color(0.909641483219143f, 0.83511887441096f, 0.788642505756688f),
                new Color(0.912325256538132f, 0.832291205814369f, 0.782761366594903f),
                new Color(0.914926747196565f, 0.829384579497733f, 0.776857426682804f),
                new Color(0.917445821208073f, 0.826399363829747f, 0.770931590667279f),
                new Color(0.91988234791516f, 0.823335934623925f, 0.764984760177709f),
                new Color(0.922236200211884f, 0.820194674991007f, 0.759017833691562f),
                new Color(0.92450725475811f, 0.816975975186894f, 0.753031706401747f),
                new Color(0.926695392185736f, 0.813680232455927f, 0.747027270085782f),
                new Color(0.928800497297254f, 0.810307850869318f, 0.741005412976774f),
                new Color(0.930822459257011f, 0.806859241158512f, 0.734967019636233f),
                new Color(0.932761171775479f, 0.803334820543262f, 0.728912970828742f),
                new Color(0.934616533286861f, 0.799735012554176f, 0.722844143398503f),
                new Color(0.936388447120313f, 0.796060246849478f, 0.716761410147773f),
                new Color(0.938076821665046f, 0.792310959025706f, 0.710665639717204f),
                new Color(0.939681570529586f, 0.788487590422056f, 0.704557696468121f),
                new Color(0.941202612695404f, 0.784590587918056f, 0.698438440366728f),
                new Color(0.942639872665165f, 0.78062040372423f, 0.692308726870297f),
                new Color(0.943993280605793f, 0.776577495165396f, 0.686169406815315f),
                new Color(0.945262772486561f, 0.772462324456202f, 0.680021326307646f),
                new Color(0.94644829021239f, 0.768275358468485f, 0.67386532661469f),
                new Color(0.947549781752535f, 0.764017068490019f, 0.667702244059591f),
                new Color(0.948567201264818f, 0.759687929974142f, 0.66153290991748f),
                new Color(0.949500509215586f, 0.755288422279778f, 0.655358150313788f),
                new Color(0.95034967249551f, 0.750819028401265f, 0.649178786124648f),
                new Color(0.951114664531396f, 0.746280234687422f, 0.642995632879383f),
                new Color(0.951795465394112f, 0.741672530549177f, 0.636809500665136f),
                new Color(0.952392061902783f, 0.73699640815508f, 0.630621194033608f),
                new Color(0.952904447725339f, 0.732252362113939f, 0.624431511909975f),
                new Color(0.953332623475557f, 0.727440889143773f, 0.618241247503959f),
                new Color(0.953676596806676f, 0.722562487726195f, 0.612051188223104f),
                new Color(0.9539363825017f, 0.717617657745276f, 0.60586211558825f),
                new Color(0.954112002560468f, 0.712606900109873f, 0.599674805151241f),
                new Color(0.954203486283595f, 0.707530716358287f, 0.593490026414884f),
                new Color(0.95421087035334f, 0.702389608244055f, 0.587308542755173f),
                new Color(0.954134198911515f, 0.697184077301553f, 0.581131111345797f),
                new Color(0.953973523634464f, 0.691914624390003f, 0.574958483084972f),
                new Color(0.953728903805224f, 0.686581749214301f, 0.56879140252459f),
                new Color(0.9534004063829f, 0.681185949821008f, 0.562630607801729f),
                new Color(0.952988106069337f, 0.675727722067648f, 0.556476830572542f),
                new Color(0.952492085373135f, 0.670207559063312f, 0.550330795948546f),
                new Color(0.951912434671061f, 0.664625950578367f, 0.544193222435331f),
                new Color(0.951249252266923f, 0.658983382420898f, 0.538064821873735f),
                new Color(0.950502644447936f, 0.653280335777236f, 0.531946299383482f),
                new Color(0.949672725538637f, 0.647517286513722f, 0.525838353309338f),
                new Color(0.948759617952396f, 0.641694704436553f, 0.519741675169797f),
                new Color(0.947763452240548f, 0.635813052506253f, 0.513656949608339f),
                new Color(0.9466843671392f, 0.629872786002973f, 0.507584854347277f),
                new Color(0.945522509613742f, 0.623874351638442f, 0.501526060144247f),
                new Color(0.944278034901094f, 0.617818186609958f, 0.495481230751355f),
                new Color(0.942951106549729f, 0.611704717591333f, 0.489451022877025f),
                new Color(0.941541896457496f, 0.60553435965518f, 0.483436086150598f),
                new Color(0.940050584907264f, 0.599307515120315f, 0.477437063089705f),
                new Color(0.93847736060044f, 0.593024572317396f, 0.471454589070457f),
                new Color(0.936822420688348f, 0.586685904265135f, 0.465489292300514f),
                new Color(0.935085970801533f, 0.58029186724859f, 0.459541793795059f),
                new Color(0.933268225076975f, 0.573842799290067f, 0.453612707355736f),
                new Color(0.931369406183265f, 0.567339018502074f, 0.447702639552602f),
                new Color(0.929389745343741f, 0.560780821310526f, 0.441812189709148f),
                new Color(0.927329482357614f, 0.554168480535001f, 0.435941949890438f),
                new Color(0.9251888656191f, 0.547502243311235f, 0.430092504894443f),
                new Color(0.922968152134563f, 0.540782328839238f, 0.424264432246612f),
                new Color(0.920667607537711f, 0.534008925938287f, 0.41845830219776f),
                new Color(0.918287506102822f, 0.527182190387693f, 0.412674677725343f),
                new Color(0.91582813075605f, 0.520302242029472f, 0.406914114538188f),
                new Color(0.913289773084799f, 0.513369161605863f, 0.40117716108475f),
                new Color(0.910672733345184f, 0.506382987301003f, 0.395464358564998f),
                new Color(0.907977320467602f, 0.49934371095181f, 0.389776240945996f),
                new Color(0.905203852060396f, 0.492251273888194f, 0.384113334981274f),
                new Color(0.902352654411657f, 0.485105562356998f, 0.378476160234088f),
                new Color(0.899424062489141f, 0.477906402477358f, 0.372865229104676f),
                new Color(0.896418419938328f, 0.470653554667306f, 0.367281046861591f),
                new Color(0.893336079078631f, 0.463346707472234f, 0.361724111677254f),
                new Color(0.890177400897753f, 0.455985470714903f, 0.356194914667812f),
                new Color(0.886942755044205f, 0.448569367873812f, 0.35069393993745f),
                new Color(0.883632519817993f, 0.44109782758139f, 0.34522166462727f),
                new Color(0.880247082159479f, 0.433570174115165f, 0.33977855896887f),
                new Color(0.876786837636418f, 0.425985616733171f, 0.334365086342778f),
                new Color(0.873252190429186f, 0.418343237678431f, 0.328981703341878f),
                new Color(0.869643553314191f, 0.410641978645497f, 0.323628859839986f),
                new Color(0.865961347645486f, 0.402880625463272f, 0.31830699906574f),
                new Color(0.862206003334582f, 0.39505779070106f, 0.313016557681972f),
                new Color(0.858377958828458f, 0.387171893846783f, 0.307757965870748f),
                new Color(0.854477661085794f, 0.379221138634685f, 0.302531647424241f),
                new Color(0.850505565551405f, 0.371203487011008f, 0.297338019841663f),
                new Color(0.846462136128899f, 0.363116629115064f, 0.292177494432418f),
                new Color(0.842347845151561f, 0.354957948513643f, 0.287050476425728f),
                new Color(0.838163173351449f, 0.346724481749902f, 0.281957365086905f),
                new Color(0.833908609826737f, 0.338412871042509f, 0.276898553840539f),
                new Color(0.829584652007281f, 0.330019308680884f, 0.27187443040079f),
                new Color(0.825191805618422f, 0.321539471286471f, 0.266885376909069f),
                new Color(0.820730584643037f, 0.312968441617855f, 0.261931770079312f),
                new Color(0.816201511281833f, 0.304300614947247f, 0.257013981351136f),
                new Color(0.811605115911886f, 0.29552958616705f, 0.252132377051113f),
                new Color(0.806941937043441f, 0.286648012611522f, 0.247287318562432f),
                new Color(0.802212521274968f, 0.277647445972912f, 0.242479162503221f),
                new Color(0.797417423246482f, 0.268518124465368f, 0.23770826091379f),
                new Color(0.792557205591125f, 0.259248713257859f, 0.232974961453065f),
                new Color(0.787632438885035f, 0.249825976719218f, 0.228279607604489f),
                new Color(0.78264370159548f, 0.240234359501093f, 0.223622538891635f),
                new Color(0.777591580027294f, 0.230455443811697f, 0.219004091103799f),
                new Color(0.772476668267581f, 0.220467235560159f, 0.214424596531818f),
                new Color(0.767299568128751f, 0.210243209242125f, 0.209884384214324f),
                new Color(0.762060889089834f, 0.19975100498944f, 0.205383780194663f),
                new Color(0.756761248236131f, 0.188950611108299f, 0.200923107788637f),
                new Color(0.751401270197181f, 0.177791762699263f, 0.196502687863241f),
                new Color(0.745981587083065f, 0.166210103842132f, 0.192122839126473f),
                new Color(0.740502838419064f, 0.154121317973799f, 0.187783878428295f),
                new Color(0.734965671078673f, 0.141411750184522f, 0.183486121072727f),
                new Color(0.729370739214996f, 0.127922592143062f, 0.179229881140994f),
                new Color(0.72371870419052f, 0.113421307748994f, 0.175015471825558f),
                new Color(0.718010234505317f, 0.0975450762677193f, 0.170843205774764f),
                new Color(0.712246005723655f, 0.079673652769889f, 0.166713395447694f),
                new Color(0.706426700399069f, 0.058582625010108f, 0.162626353478699f),
                new Color(0.700553007997906f, 0.0315924751208027f, 0.158582393050876f),
                new Color(0.694625624821363f, 0.00296461045767925f, 0.154581828277596f));


    }

}
