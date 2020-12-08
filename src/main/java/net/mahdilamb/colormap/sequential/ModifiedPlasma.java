package net.mahdilamb.colormap.sequential;

import net.mahdilamb.colormap.ColormapType;
import net.mahdilamb.colormap.LinearColormap;
import net.mahdilamb.colormap.NewColormap;
import net.mahdilamb.colormap.color.Color;

/**
 * Colormap from Peter Karpov @see <a href="http://inversed.ru/index.htm">Peter Karpov</a>. Modifed Plasma
 */
@NewColormap(type = ColormapType.SEQUENTIAL, name = "ModifiedPlasma")
public final class ModifiedPlasma extends LinearColormap {
    /**
     * Create a colormap based on Modified Plasma.
     */
    public ModifiedPlasma() {
        super(
                Color.create(0f, 0f, 0f),
                Color.create(0.0049277731503758f, 0.00220467048209427f, 0.041348172917105f),
                Color.create(0.0106171701346941f, 0.00383334725532445f, 0.0758045798971295f),
                Color.create(0.0163773744328647f, 0.00496236645565048f, 0.10307495796699f),
                Color.create(0.0222045645994497f, 0.0057977598665304f, 0.126046586036981f),
                Color.create(0.0280876077946331f, 0.00644263452576727f, 0.146128016638522f),
                Color.create(0.0340095063138922f, 0.00695892195684311f, 0.164094733614092f),
                Color.create(0.0399645439198236f, 0.00737926920253931f, 0.180440519914538f),
                Color.create(0.0459038625576645f, 0.00771823492821481f, 0.195310585336388f),
                Color.create(0.051795769585598f, 0.00798899753608449f, 0.208858182088629f),
                Color.create(0.0576399763249279f, 0.00820483671253073f, 0.221303627625658f),
                Color.create(0.0634355278500936f, 0.00837478406544721f, 0.232809062104769f),
                Color.create(0.0691825253255367f, 0.00850521574254306f, 0.243502524368555f),
                Color.create(0.0748815620296926f, 0.00860061710082436f, 0.253486374921165f),
                Color.create(0.0805332141252131f, 0.00866410542133659f, 0.262842747636746f),
                Color.create(0.0861387964224866f, 0.0086979219893927f, 0.271641052737758f),
                Color.create(0.0916980693388432f, 0.00870348596230849f, 0.279934176074565f),
                Color.create(0.0972123912550895f, 0.00868193440606886f, 0.28777114947618f),
                Color.create(0.102682656461082f, 0.00863405848590137f, 0.295192345224072f),
                Color.create(0.108109805490073f, 0.00856047282674221f, 0.302232535784931f),
                Color.create(0.11349263891897f, 0.00846438095175439f, 0.308919661687492f),
                Color.create(0.118851959978488f, 0.00834483930879395f, 0.315329149621655f),
                Color.create(0.124261863374895f, 0.008206760891031f, 0.321669758862764f),
                Color.create(0.129729938182647f, 0.0080499934227415f, 0.327962314689983f),
                Color.create(0.135255705805149f, 0.00787399476809695f, 0.334205800659136f),
                Color.create(0.140838586289803f, 0.00767843380384542f, 0.340399023871452f),
                Color.create(0.146477913038961f, 0.00746319776441055f, 0.346540632057258f),
                Color.create(0.152172841907065f, 0.00722839424016432f, 0.352628905158194f),
                Color.create(0.157922766800576f, 0.0069743776856805f, 0.358662706000878f),
                Color.create(0.163726703638347f, 0.00670172492514598f, 0.364640044884139f),
                Color.create(0.169582863197206f, 0.00641260172515382f, 0.370558514354274f),
                Color.create(0.175490993730859f, 0.00610700353210791f, 0.376416720985305f),
                Color.create(0.181450558913093f, 0.00578549960184871f, 0.382212960334994f),
                Color.create(0.187460487643278f, 0.00544968075580397f, 0.387945113706228f),
                Color.create(0.193519674327377f, 0.00510140789135317f, 0.393610996003459f),
                Color.create(0.199626980667221f, 0.00474281626247813f, 0.399208365124772f),
                Color.create(0.205781239348381f, 0.00437631908598751f, 0.404734928573183f),
                Color.create(0.211981257729612f, 0.00400461071500354f, 0.410188348807952f),
                Color.create(0.2182257453281f, 0.00363079582232094f, 0.415566220385709f),
                Color.create(0.224513653331535f, 0.00325781386760899f, 0.420866216046577f),
                Color.create(0.230843872144936f, 0.00288894650861008f, 0.426085947215533f),
                Color.create(0.23721510050333f, 0.00252806624130055f, 0.431222924204042f),
                Color.create(0.243626019933766f, 0.00217933896724462f, 0.436274645340819f),
                Color.create(0.250075297656191f, 0.00184722368463983f, 0.441238603439745f),
                Color.create(0.256561562952417f, 0.0015364713880264f, 0.446112249229017f),
                Color.create(0.263083487910041f, 0.00125212397528101f, 0.450893138743566f),
                Color.create(0.269639850526278f, 0.000998986085121823f, 0.455578598537847f),
                Color.create(0.276229733511111f, 0.000782314655267222f, 0.460166621465318f),
                Color.create(0.282851121547979f, 0.00060861680987687f, 0.464654181876072f),
                Color.create(0.289502608195738f, 0.000484113075367208f, 0.469038885691783f),
                Color.create(0.296182847339026f, 0.000415296178196962f, 0.473318474944518f),
                Color.create(0.302890310089374f, 0.000408924176894392f, 0.477490458813713f),
                Color.create(0.309623517623976f, 0.000472013443031959f, 0.481552490383493f),
                Color.create(0.316380978401302f, 0.00061183023275617f, 0.485502272939179f),
                Color.create(0.323161189618178f, 0.000835881527879914f, 0.489337568971858f),
                Color.create(0.329963516444831f, 0.00115023011712961f, 0.493056039997108f),
                Color.create(0.336785662950124f, 0.0015643075466473f, 0.496655651529299f),
                Color.create(0.343625994336848f, 0.00208647725645818f, 0.500134394259196f),
                Color.create(0.35048294851741f, 0.00272513898542384f, 0.503490339034413f),
                Color.create(0.357354955156295f, 0.00348887161990995f, 0.506721655223198f),
                Color.create(0.364240437820614f, 0.00438641842542526f, 0.509826615556612f),
                Color.create(0.371137812820137f, 0.00542667174710652f, 0.512803607336898f),
                Color.create(0.378045491012705f, 0.00661865678128495f, 0.515651138514504f),
                Color.create(0.384961878599827f, 0.00797151482185015f, 0.518367845782573f),
                Color.create(0.391885378844036f, 0.00949448599940042f, 0.520952500980155f),
                Color.create(0.398815127606533f, 0.0111955701007262f, 0.523403511466811f),
                Color.create(0.405748761987831f, 0.0130855563538079f, 0.525720387687844f),
                Color.create(0.412684648229199f, 0.0151739369711135f, 0.527902384628477f),
                Color.create(0.419621185641979f, 0.0174701736456536f, 0.529948904143952f),
                Color.create(0.426556780290147f, 0.0199837299674779f, 0.531859518926895f),
                Color.create(0.433489846873495f, 0.0227240521995452f, 0.533633978752f),
                Color.create(0.440418812179132f, 0.0257005507062801f, 0.535272212871202f),
                Color.create(0.447342115272921f, 0.0289225811692666f, 0.536774338480624f),
                Color.create(0.454258212944192f, 0.0323994265274191f, 0.538140658861066f),
                Color.create(0.461182824283837f, 0.0360580883117198f, 0.539391838119194f),
                Color.create(0.468144037619372f, 0.0397629593521402f, 0.54056196448149f),
                Color.create(0.475114615158363f, 0.0435188098345296f, 0.541620495647431f),
                Color.create(0.482073643266192f, 0.0473229143822686f, 0.542545714386866f),
                Color.create(0.489021079969888f, 0.0511739783536295f, 0.543339798257921f),
                Color.create(0.495955100922238f, 0.0550710341497207f, 0.544004196654784f),
                Color.create(0.502873764388943f, 0.0590128611294025f, 0.544540009791388f),
                Color.create(0.509775324014845f, 0.0629981747281562f, 0.544948556859484f),
                Color.create(0.516658071232007f, 0.0670256825341118f, 0.545231351807013f),
                Color.create(0.523520340115719f, 0.0710940868420847f, 0.545390097968944f),
                Color.create(0.530360511695211f, 0.0752020877601346f, 0.545426682123839f),
                Color.create(0.537177019572112f, 0.079348386629458f, 0.545343162752122f),
                Color.create(0.543968351641434f, 0.0835316891586347f, 0.545141767848086f),
                Color.create(0.550733079270377f, 0.0877507129403771f, 0.54482490283438f),
                Color.create(0.557469721412341f, 0.0920041679879187f, 0.544395005588692f),
                Color.create(0.564177027650401f, 0.0962908071150673f, 0.543854814527144f),
                Color.create(0.570853741659666f, 0.100609386713073f, 0.543207109432545f),
                Color.create(0.577498864256781f, 0.104958721158867f, 0.542454959227811f),
                Color.create(0.584110711200538f, 0.109337509680299f, 0.541600815468914f),
                Color.create(0.59068880691023f, 0.11374468583147f, 0.540648277899832f),
                Color.create(0.597231992636979f, 0.118179074009117f, 0.539600300438508f),
                Color.create(0.603739372168274f, 0.122639564711509f, 0.538460070390509f),
                Color.create(0.610210065864056f, 0.127125063685045f, 0.537231047822496f),
                Color.create(0.616643351789408f, 0.131634530113436f, 0.535916403894096f),
                Color.create(0.623038550242853f, 0.136166958330303f, 0.534519340188011f),
                Color.create(0.62939509085371f, 0.140721390038389f, 0.533043146364385f),
                Color.create(0.635712427998436f, 0.145296895465731f, 0.531491058151544f),
                Color.create(0.641990094152084f, 0.149892591125778f, 0.52986629620778f),
                Color.create(0.648227688721014f, 0.154507632264337f, 0.528172042011809f),
                Color.create(0.654424871784298f, 0.159141218076238f, 0.526411430218802f),
                Color.create(0.660581339000698f, 0.163792582863149f, 0.524587517845922f),
                Color.create(0.66669700187098f, 0.168461042388575f, 0.522703420769797f),
                Color.create(0.672771479487414f, 0.173145869721697f, 0.520761908496058f),
                Color.create(0.678804753962809f, 0.177846455194982f, 0.518765914805362f),
                Color.create(0.684796750305798f, 0.182562206009194f, 0.516718204742653f),
                Color.create(0.690747437984785f, 0.18729256702616f, 0.514621450786267f),
                Color.create(0.696656823162895f, 0.192037026745079f, 0.512478226665669f),
                Color.create(0.702524920967558f, 0.196795049342638f, 0.510291324213245f),
                Color.create(0.708351751407606f, 0.201566056436075f, 0.508063852139243f),
                Color.create(0.714137517150824f, 0.206349816705825f, 0.505797127388414f),
                Color.create(0.719882351227149f, 0.211145965827411f, 0.503493294001567f),
                Color.create(0.725586407230744f, 0.21595417426603f, 0.501154391417041f),
                Color.create(0.731249855306573f, 0.220774145913623f, 0.498782346732918f),
                Color.create(0.736872888585244f, 0.225605617548519f, 0.496378986254012f),
                Color.create(0.742455702452997f, 0.230448353680642f, 0.493946017238885f),
                Color.create(0.747998507610989f, 0.235302152510302f, 0.491485052289198f),
                Color.create(0.75350151673223f, 0.240166837234982f, 0.488997592541645f),
                Color.create(0.758964950249584f, 0.245042262482149f, 0.486485043645826f),
                Color.create(0.764389026469127f, 0.249928274921305f, 0.48394885336805f),
                Color.create(0.769773958559674f, 0.25482440782711f, 0.481391972400728f),
                Color.create(0.77511994465758f, 0.25973095921681f, 0.478813632584348f),
                Color.create(0.780427342615872f, 0.264647934882304f, 0.476214938973696f),
                Color.create(0.785696202027932f, 0.269575259278282f, 0.473596724073395f),
                Color.create(0.790926763954858f, 0.274512947025185f, 0.470959865845753f),
                Color.create(0.796119205880421f, 0.279461013718446f, 0.468305127276129f),
                Color.create(0.801273702664647f, 0.284419499043743f, 0.465633210272777f),
                Color.create(0.805738105100778f, 0.290048042105702f, 0.463163921630729f),
                Color.create(0.809751049018631f, 0.296076058435282f, 0.460849439512647f),
                Color.create(0.813721004939928f, 0.302084727958382f, 0.458562428924949f),
                Color.create(0.817648511018372f, 0.308075479882604f, 0.45630109366263f),
                Color.create(0.821534239512075f, 0.314049713771178f, 0.454065987133065f),
                Color.create(0.825378691913137f, 0.320008327733716f, 0.451857259989648f),
                Color.create(0.829182369855351f, 0.325952345112252f, 0.449675155149735f),
                Color.create(0.832945723397579f, 0.331882720811589f, 0.447519858725858f),
                Color.create(0.836669305281018f, 0.337800980721243f, 0.445392030821082f),
                Color.create(0.840353161614656f, 0.343706472697858f, 0.443291067167762f),
                Color.create(0.843998048885346f, 0.349601281018068f, 0.441219200420658f),
                Color.create(0.847604000424637f, 0.355486001810077f, 0.439174503686036f),
                Color.create(0.851171317917493f, 0.361361690088484f, 0.437157272132279f),
                Color.create(0.854700187470084f, 0.367229029783728f, 0.43516750015098f),
                Color.create(0.85819077673231f, 0.37308876716682f, 0.433205247312965f),
                Color.create(0.861643260465951f, 0.378941794717239f, 0.431270735747861f),
                Color.create(0.865057646800317f, 0.384788351224774f, 0.429363671081294f),
                Color.create(0.868434256794581f, 0.390629312842768f, 0.427485801556785f),
                Color.create(0.871772951872364f, 0.396465613978588f, 0.425635647188372f),
                Color.create(0.875073722159423f, 0.402297822080511f, 0.42381322904463f),
                Color.create(0.878336512827983f, 0.408126398379536f, 0.422018491811335f),
                Color.create(0.881561353621096f, 0.413952327432902f, 0.420251933024148f),
                Color.create(0.884748107166469f, 0.419775895756754f, 0.41851340245187f),
                Color.create(0.887896711272872f, 0.4255977238497f, 0.416803302394291f),
                Color.create(0.891007076568341f, 0.431418209956472f, 0.415122060530559f),
                Color.create(0.894078968881431f, 0.437238151197832f, 0.413469268209362f),
                Color.create(0.897112203996527f, 0.443058009811454f, 0.411845110981223f),
                Color.create(0.900106582779815f, 0.448878255747663f, 0.41024983017989f),
                Color.create(0.90306187528981f, 0.454699286983022f, 0.408683637984636f),
                Color.create(0.905977884554032f, 0.460521755150498f, 0.40714707686329f),
                Color.create(0.908854329759f, 0.466345960313198f, 0.405640331854042f),
                Color.create(0.911690879106456f, 0.472172220490519f, 0.404163419516764f),
                Color.create(0.914487275068449f, 0.478001161692273f, 0.402716959082599f),
                Color.create(0.91724323425486f, 0.48383328728953f, 0.401301564531152f),
                Color.create(0.919958394587854f, 0.489668646997724f, 0.399917384876772f),
                Color.create(0.922632451138549f, 0.495507719239519f, 0.398565123326432f),
                Color.create(0.925265070797133f, 0.501350833196045f, 0.397245375912583f),
                Color.create(0.927855741840901f, 0.507198468721125f, 0.395958013077118f),
                Color.create(0.930404184625315f, 0.51305084256497f, 0.394704096285594f),
                Color.create(0.932910057625567f, 0.518908212271966f, 0.39348448264956f),
                Color.create(0.935372992893104f, 0.524770840968143f, 0.392299968184711f),
                Color.create(0.937792616834086f, 0.530638975784116f, 0.391151404524004f),
                Color.create(0.94016855200653f, 0.536512847884191f, 0.390039694281174f),
                Color.create(0.942500412746854f, 0.542392676348107f, 0.388965784649455f),
                Color.create(0.944787393895826f, 0.548279025510239f, 0.387929007127425f),
                Color.create(0.947029451420834f, 0.554171768815161f, 0.386931891734838f),
                Color.create(0.949226198808128f, 0.560071071964089f, 0.385975597868029f),
                Color.create(0.95137724888318f, 0.56597708549096f, 0.385061354721629f),
                Color.create(0.953482216897993f, 0.571889943525726f, 0.384190463655127f),
                Color.create(0.955540719009911f, 0.577809765195241f, 0.383364301754889f),
                Color.create(0.957552374043801f, 0.583736653831132f, 0.382584329504842f),
                Color.create(0.959516285908704f, 0.589671094716194f, 0.381850268250652f),
                Color.create(0.961432352206232f, 0.59561293626798f, 0.381164784089451f),
                Color.create(0.96330035795453f, 0.601562113248138f, 0.380530157374605f),
                Color.create(0.965119937681165f, 0.60751866585224f, 0.379948219598295f),
                Color.create(0.96689073242937f, 0.613482618623202f, 0.379420904816427f),
                Color.create(0.968612388250196f, 0.619453981558449f, 0.378950255519343f),
                Color.create(0.970284558228853f, 0.625432748824254f, 0.378538436957217f),
                Color.create(0.971906902488098f, 0.631418899606987f, 0.378187732528301f),
                Color.create(0.973478523496214f, 0.637412779469587f, 0.377898848867565f),
                Color.create(0.974999235344651f, 0.643414228008152f, 0.377674836748113f),
                Color.create(0.976469072066612f, 0.649422935607033f, 0.377519500165192f),
                Color.create(0.977887729473191f, 0.655438815574068f, 0.377435721353469f),
                Color.create(0.979254912415638f, 0.661461764818362f, 0.37742656286921f),
                Color.create(0.980570337278375f, 0.667491663600064f, 0.377495266797469f),
                Color.create(0.981833731354721f, 0.673528373973038f, 0.377645272920837f),
                Color.create(0.983044834150696f, 0.679571737295123f, 0.377880225946632f),
                Color.create(0.984203396419788f, 0.685621545832351f, 0.378203937325242f),
                Color.create(0.985309194284811f, 0.691677833487771f, 0.378620976830424f),
                Color.create(0.986361982088778f, 0.697740124166382f, 0.379135154401767f),
                Color.create(0.987360622710933f, 0.703808777401684f, 0.37974880501855f),
                Color.create(0.988305869491025f, 0.709882958385618f, 0.380469329029632f),
                Color.create(0.989197554426204f, 0.715962084835524f, 0.381301375900142f),
                Color.create(0.99003557549801f, 0.722046678026084f, 0.382252386807117f),
                Color.create(0.990819802079577f, 0.728135861398748f, 0.383327216390352f),
                Color.create(0.991550151191986f, 0.73422924596989f, 0.384532209678352f),
                Color.create(0.992226566535717f, 0.740326356006226f, 0.385873997148548f),
                Color.create(0.992849037088104f, 0.746427012409935f, 0.387360446728087f),
                Color.create(0.993417575170054f, 0.752530624414385f, 0.388999028349303f),
                Color.create(0.99393223910363f, 0.758636677303297f, 0.390797995329607f),
                Color.create(0.994393125262548f, 0.764744380779691f, 0.392765548409066f),
                Color.create(0.994800406241075f, 0.770853909379237f, 0.394913084914512f),
                Color.create(0.99515427120063f, 0.776963620303174f, 0.397248037519696f),
                Color.create(0.995455005067372f, 0.783073331571042f, 0.39978245004842f),
                Color.create(0.995702952845729f, 0.789182163827974f, 0.402527388121222f),
                Color.create(0.995898537478697f, 0.795289256722808f, 0.405494875896364f),
                Color.create(0.996042273841626f, 0.801393688878459f, 0.408697747256744f),
                Color.create(0.996134775268871f, 0.807494452013969f, 0.412149622648074f),
                Color.create(0.996176764473101f, 0.813590447316567f, 0.415864969270185f),
                Color.create(0.996169089421987f, 0.819680475775913f, 0.419859128777046f),
                Color.create(0.996112738063806f, 0.825763228346071f, 0.424148356250622f),
                Color.create(0.996008850789939f, 0.831837276454163f, 0.428749858813947f),
                Color.create(0.995858743014459f, 0.837901058654023f, 0.43368182260181f),
                Color.create(0.995662789132284f, 0.843953378036828f, 0.438961377529778f),
                Color.create(0.995422013776819f, 0.849992663787472f, 0.444607629618574f),
                Color.create(0.995139792386304f, 0.856016226395462f, 0.450644588169287f),
                Color.create(0.994818338541374f, 0.862021832619982f, 0.457094692812445f),
                Color.create(0.994460167121112f, 0.868007033985985f, 0.463981529506549f),
                Color.create(0.994068131128519f, 0.873969143321351f, 0.471329869909766f),
                Color.create(0.993645461530939f, 0.879905208614157f, 0.479165721446757f),
                Color.create(0.993192589439031f, 0.8858133332443f, 0.487511353400817f),
                Color.create(0.992713810686382f, 0.891689831887464f, 0.496396101212359f),
                Color.create(0.992216250072519f, 0.897529711265198f, 0.50585416239706f),
                Color.create(0.99170515034959f, 0.903328612018379f, 0.515917387083829f),
                Color.create(0.991184080531723f, 0.909082650046105f, 0.526616163937728f),
                Color.create(0.990655526793625f, 0.914788106736789f, 0.537980820039926f),
                Color.create(0.990132884508454f, 0.920436619306186f, 0.550057890920741f),
                Color.create(0.989623854721151f, 0.926021823600588f, 0.562887150048405f),
                Color.create(0.989128270536179f, 0.931539887257879f, 0.576499762825208f),
                Color.create(0.98866673306578f, 0.936978787603763f, 0.590957530540624f),
                Color.create(0.988244865751088f, 0.94233144998361f, 0.606303909671343f),
                Color.create(0.987875587401583f, 0.947587415218886f, 0.622595165530275f),
                Color.create(0.987575881502426f, 0.952733952796484f, 0.639896044714925f),
                Color.create(0.987357549005966f, 0.957759300602481f, 0.658269443493404f),
                Color.create(0.987241901362912f, 0.96264701751531f, 0.677794162796678f),
                Color.create(0.987249748001861f, 0.967379367868502f, 0.698553084228504f),
                Color.create(0.987398311412187f, 0.971938611520658f, 0.720634346562407f),
                Color.create(0.987719138675614f, 0.976299306795481f, 0.744145725097142f),
                Color.create(0.988238796485009f, 0.980435740043607f, 0.769200310436546f),
                Color.create(0.988986813780024f, 0.984318019852982f, 0.79592241009258f),
                Color.create(0.989995651688228f, 0.987911741564395f, 0.824451168638009f),
                Color.create(0.991299512162512f, 0.991177065329144f, 0.854935186542906f),
                Color.create(0.992932811386107f, 0.994069378769566f, 0.887545918530507f),
                Color.create(0.994924141597402f, 0.996538718907553f, 0.922461075997394f),
                Color.create(0.997286260458279f, 0.998532988437932f, 0.959878363715275f),
                Color.create(1f, 1f, 1f));


    }


}
