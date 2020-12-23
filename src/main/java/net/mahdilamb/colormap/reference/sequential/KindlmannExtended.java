package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.Color;
import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;

/**
 * An extended version of the colormap presented in Kindlmann
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "KindlmannExtended")
public final class KindlmannExtended extends SequentialColormap {
    /**
     * Create a colormap based on the derived colormap from Kindlmann, et al.
     */
    public KindlmannExtended() {
        super(
                new Color(0.0180584653964f, 0.000875333094297f, 0.0158976099199f),
                new Color(0.0358446051389f, 0.00174980699631f, 0.0328047687723f),
                new Color(0.0522636499211f, 0.00255635257187f, 0.050049172046f),
                new Color(0.06595973063f, 0.00316349374618f, 0.0653730066735f),
                new Color(0.0775624917691f, 0.00377981404209f, 0.0790449485008f),
                new Color(0.0877061880207f, 0.00440417464933f, 0.0916119341295f),
                new Color(0.0968151684079f, 0.00497304541006f, 0.103540340406f),
                new Color(0.104722118803f, 0.00554119297516f, 0.11599716231f),
                new Color(0.111370425372f, 0.00620204611365f, 0.129261639264f),
                new Color(0.116946513903f, 0.00684812185869f, 0.143552980958f),
                new Color(0.121535323949f, 0.00759362900681f, 0.158271380422f),
                new Color(0.125608952746f, 0.00824751570213f, 0.172948297189f),
                new Color(0.129116053052f, 0.00897961657386f, 0.187269898157f),
                new Color(0.132214226742f, 0.0096321961349f, 0.201480459693f),
                new Color(0.134903090655f, 0.0103013238918f, 0.215382661822f),
                new Color(0.137265159112f, 0.0109393452309f, 0.229013577036f),
                new Color(0.139353106158f, 0.0115621203072f, 0.242296207746f),
                new Color(0.141228114177f, 0.0121823978304f, 0.255153941069f),
                new Color(0.142958459351f, 0.0128106067635f, 0.267511245419f),
                new Color(0.144632880203f, 0.0133745067794f, 0.279430555591f),
                new Color(0.146311489693f, 0.0138565170718f, 0.290986319638f),
                new Color(0.147985088662f, 0.0144350251536f, 0.302261972457f),
                new Color(0.149707708963f, 0.0149622508005f, 0.313501070947f),
                new Color(0.15150937992f, 0.0155149777138f, 0.324530460502f),
                new Color(0.153431086644f, 0.0159967974703f, 0.335465361707f),
                new Color(0.155506784775f, 0.0164900613996f, 0.346132556517f),
                new Color(0.15777230058f, 0.0169915776714f, 0.356506192632f),
                new Color(0.160258091584f, 0.0174996875948f, 0.366565290795f),
                new Color(0.162987579688f, 0.0180145188299f, 0.376294691501f),
                new Color(0.165965739373f, 0.0184349864779f, 0.385840777704f),
                new Color(0.16918579306f, 0.0188710692978f, 0.39506689055f),
                new Color(0.172195422223f, 0.0192910917595f, 0.40464415821f),
                new Color(0.173403705169f, 0.0198899561305f, 0.416451132788f),
                new Color(0.173861044438f, 0.0205279465565f, 0.429138791396f),
                new Color(0.172365040039f, 0.0212232568816f, 0.444077549211f),
                new Color(0.168164143733f, 0.0220817021201f, 0.461671910382f),
                new Color(0.159952146892f, 0.0230256208157f, 0.482744336407f),
                new Color(0.145360278175f, 0.024227775933f, 0.508035519531f),
                new Color(0.118833057349f, 0.0257460880057f, 0.538929643256f),
                new Color(0.0592158892749f, 0.0275724315861f, 0.577825147355f),
                new Color(0.0274333703176f, 0.0556969414662f, 0.573236714621f),
                new Color(0.0266106561556f, 0.0822574864661f, 0.552306416405f),
                new Color(0.025323468955f, 0.102759202176f, 0.531339176589f),
                new Color(0.0245816364626f, 0.119718526877f, 0.510265658092f),
                new Color(0.0235080815879f, 0.134168958766f, 0.489764126426f),
                new Color(0.0226233659426f, 0.146776332692f, 0.469819962498f),
                new Color(0.0215547333709f, 0.157937576357f, 0.450747864098f),
                new Color(0.0206993298305f, 0.16795289041f, 0.432484330083f),
                new Color(0.0198967605312f, 0.177031635917f, 0.41516848254f),
                new Color(0.0192303955284f, 0.18533855557f, 0.398809925251f),
                new Color(0.0182867657147f, 0.193007654432f, 0.383581078901f),
                new Color(0.0176128170512f, 0.200140415477f, 0.36927508329f),
                new Color(0.0170148487985f, 0.206823590156f, 0.355950858235f),
                new Color(0.01653121034f, 0.213126962847f, 0.343569825475f),
                new Color(0.0159456483298f, 0.219116312109f, 0.332154924132f),
                new Color(0.0155113860923f, 0.224833901477f, 0.321585900677f),
                new Color(0.0149788117254f, 0.230330436099f, 0.311871103985f),
                new Color(0.0145817257042f, 0.235632318086f, 0.302898649355f),
                new Color(0.0140334508886f, 0.240781289809f, 0.294664914215f),
                new Color(0.0138286995253f, 0.24578010019f, 0.287029297837f),
                new Color(0.0133840751072f, 0.250676352423f, 0.280026567675f),
                new Color(0.0132072369246f, 0.255463537867f, 0.273536935901f),
                new Color(0.0129634785301f, 0.260172611311f, 0.267551533796f),
                new Color(0.01275628057f, 0.264812412048f, 0.261996025246f),
                new Color(0.0130214917563f, 0.269399802958f, 0.2564471131f),
                new Color(0.013275541579f, 0.273973459141f, 0.250784410116f),
                new Color(0.0135425133387f, 0.278532552634f, 0.245007619091f),
                new Color(0.0135126185665f, 0.283093979942f, 0.239111937329f),
                new Color(0.0138754745934f, 0.287621824293f, 0.23310130526f),
                new Color(0.013980997516f, 0.292151067118f, 0.226960860596f),
                new Color(0.0141904009456f, 0.296663130996f, 0.220696296671f),
                new Color(0.0145304863521f, 0.301157183524f, 0.214309158478f),
                new Color(0.0146578033742f, 0.305651900786f, 0.207766742968f),
                new Color(0.0149534063519f, 0.310127653915f, 0.201094597458f),
                new Color(0.0150555796267f, 0.314603774411f, 0.194248861492f),
                new Color(0.0153591079009f, 0.319060012372f, 0.187269706758f),
                new Color(0.0154816148389f, 0.323516334236f, 0.180102458832f),
                new Color(0.0158320447878f, 0.327951947526f, 0.17280379686f),
                new Color(0.0160049395278f, 0.332387434875f, 0.165308974604f),
                new Color(0.0164236283821f, 0.336801542341f, 0.157694092826f),
                new Color(0.0166572444204f, 0.341215451176f, 0.149885785417f),
                new Color(0.0166866212706f, 0.345629414532f, 0.141882953872f),
                new Color(0.0169565382695f, 0.350021626219f, 0.133799378962f),
                new Color(0.0169942848998f, 0.354414106962f, 0.125553279371f),
                new Color(0.0172595614171f, 0.358784804599f, 0.117294366612f),
                new Color(0.0177521102088f, 0.363133676965f, 0.109085926267f),
                new Color(0.0179561236801f, 0.367483581358f, 0.100853542824f),
                new Color(0.0178318333763f, 0.371835170462f, 0.0926596323485f),
                new Color(0.0184069150757f, 0.376143131735f, 0.084959044806f),
                new Color(0.0186127396493f, 0.380453888309f, 0.0775516709271f),
                new Color(0.0184053173473f, 0.384768452568f, 0.0705745923215f),
                new Color(0.0188750949188f, 0.389041323406f, 0.0646649213733f),
                new Color(0.018887726719f, 0.39332016766f, 0.059585575389f),
                new Color(0.0189892401061f, 0.39758314905f, 0.0557613443634f),
                new Color(0.0191553702936f, 0.401836286524f, 0.0530002144934f),
                new Color(0.0195726975527f, 0.406079284257f, 0.0509259961276f),
                new Color(0.0200605678256f, 0.410315329479f, 0.0499257009659f),
                new Color(0.0199339926505f, 0.414589372335f, 0.0478973341401f),
                new Color(0.0201198564949f, 0.418870758267f, 0.0446949427693f),
                new Color(0.0202744574697f, 0.423173801671f, 0.039760474672f),
                new Color(0.0206785146173f, 0.427489232063f, 0.0329964698916f),
                new Color(0.0209912092412f, 0.431830508155f, 0.0242501787314f),
                new Color(0.0349723445527f, 0.435710102841f, 0.0210033099722f),
                new Color(0.0568879927503f, 0.439264307473f, 0.0211778526846f),
                new Color(0.0767479553296f, 0.442716711831f, 0.0212184127479f),
                new Color(0.0957871138849f, 0.446040085637f, 0.0214867829864f),
                new Color(0.114044842671f, 0.44925275321f, 0.0216092073315f),
                new Color(0.1318104468f, 0.452350731622f, 0.0215750256604f),
                new Color(0.149470028439f, 0.455308584136f, 0.0217616999145f),
                new Color(0.167053697064f, 0.45812383477f, 0.0221744111686f),
                new Color(0.184236193933f, 0.460837074209f, 0.0220219560819f),
                new Color(0.201440136403f, 0.463403083185f, 0.0220863418691f),
                new Color(0.218654252618f, 0.465820835436f, 0.022373913789f),
                new Color(0.23574290226f, 0.468109977517f, 0.022477547036f),
                new Color(0.252842941703f, 0.47024955625f, 0.0228083262913f),
                new Color(0.269736892289f, 0.472278349938f, 0.0225244412619f),
                new Color(0.286742684767f, 0.474138353353f, 0.0228931346916f),
                new Color(0.303649814199f, 0.475868629906f, 0.0230684253847f),
                new Color(0.320467842222f, 0.47746917857f, 0.0230437190067f),
                new Color(0.337203492551f, 0.478940196186f, 0.0228130802442f),
                new Color(0.353977518492f, 0.480250608264f, 0.0232755329729f),
                new Color(0.37059809134f, 0.481450683186f, 0.0230858051611f),
                new Color(0.387178256798f, 0.482510801383f, 0.0231497853431f),
                new Color(0.403701391535f, 0.483434884226f, 0.023480468515f),
                new Color(0.420087339906f, 0.484251117248f, 0.0231416662007f),
                new Color(0.436435341245f, 0.484925361047f, 0.0235552762937f),
                new Color(0.452650469281f, 0.485494834886f, 0.0232942153785f),
                new Color(0.468883184798f, 0.485908993767f, 0.0236001754074f),
                new Color(0.485651484791f, 0.486012657079f, 0.0234198862573f),
                new Color(0.503100421156f, 0.485724148423f, 0.0242401761586f),
                new Color(0.521220887411f, 0.485020977675f, 0.0251173152935f),
                new Color(0.540032006724f, 0.483860737672f, 0.0260755646195f),
                new Color(0.559561329233f, 0.482196106284f, 0.0266793371253f),
                new Color(0.579802776807f, 0.47997623333f, 0.0278581744233f),
                new Color(0.600792297647f, 0.477141258357f, 0.0287161497724f),
                new Color(0.622520503646f, 0.473631357255f, 0.0297062017882f),
                new Color(0.644983693461f, 0.469380216359f, 0.0308169231996f),
                new Color(0.668171263815f, 0.464315602087f, 0.0320261521594f),
                new Color(0.692064697472f, 0.458358889744f, 0.0332998807226f),
                new Color(0.716681934384f, 0.451402297499f, 0.0341928395725f),
                new Color(0.741898899545f, 0.443392751729f, 0.0354509848299f),
                new Color(0.767707726612f, 0.434210395185f, 0.0365931233555f),
                new Color(0.793989118643f, 0.423781203541f, 0.0379020221348f),
                new Color(0.820656977454f, 0.41200156363f, 0.0392481800425f),
                new Color(0.847612515856f, 0.398759158615f, 0.0404892124241f),
                new Color(0.874674242221f, 0.38398939182f, 0.04178030419f),
                new Color(0.901707799473f, 0.3675822286f, 0.0429499264058f),
                new Color(0.928415174219f, 0.349573677887f, 0.044424104252f),
                new Color(0.954545481796f, 0.329991381325f, 0.0462442266644f),
                new Color(0.957301344371f, 0.33609564364f, 0.104215812979f),
                new Color(0.959117492626f, 0.343220002001f, 0.142599846881f),
                new Color(0.960545553503f, 0.350720062574f, 0.17223852748f),
                new Color(0.961694689697f, 0.358466816251f, 0.196508613818f),
                new Color(0.962634746497f, 0.366378566255f, 0.21695690863f),
                new Color(0.963502228203f, 0.374312232539f, 0.234369992224f),
                new Color(0.964204505811f, 0.382356182548f, 0.249483013559f),
                new Color(0.964827517636f, 0.390420441894f, 0.262649173343f),
                new Color(0.965339521585f, 0.398529069481f, 0.274255453153f),
                new Color(0.965913832211f, 0.406496561314f, 0.284842512633f),
                new Color(0.96660239999f, 0.414004257475f, 0.299477112022f),
                new Color(0.967424045438f, 0.421156664498f, 0.315952978265f),
                new Color(0.96824448919f, 0.428060999844f, 0.334462757437f),
                new Color(0.96925265516f, 0.434535360032f, 0.355085184136f),
                new Color(0.970255192862f, 0.440768027519f, 0.377386202244f),
                new Color(0.971400042438f, 0.44666745097f, 0.400715009813f),
                new Color(0.972494124682f, 0.4524136941f, 0.42479050885f),
                new Color(0.973682286844f, 0.457914388253f, 0.449200759171f),
                new Color(0.974414038449f, 0.463612717678f, 0.474012162616f),
                new Color(0.974706252057f, 0.469501541549f, 0.498966836373f),
                new Color(0.974924322329f, 0.475311962572f, 0.523734287229f),
                new Color(0.975203228437f, 0.480956638403f, 0.54818506882f),
                new Color(0.975442392691f, 0.486524219209f, 0.572303627832f),
                new Color(0.975773849859f, 0.491929059137f, 0.596023932317f),
                new Color(0.975974803481f, 0.497346258966f, 0.619361874151f),
                new Color(0.976292748071f, 0.50260450503f, 0.642262831649f),
                new Color(0.976501574349f, 0.507878764176f, 0.664729824313f),
                new Color(0.976728911365f, 0.513085162851f, 0.686740760416f),
                new Color(0.97698331835f, 0.518226546562f, 0.708289955958f),
                new Color(0.97727250063f, 0.523305979649f, 0.72937453976f),
                new Color(0.977484712652f, 0.528412817876f, 0.749962011074f),
                new Color(0.977744873326f, 0.533464543877f, 0.770070436051f),
                new Color(0.977940011141f, 0.538551100225f, 0.789655816439f),
                new Color(0.978193692765f, 0.543590248049f, 0.808753139786f),
                new Color(0.978391929879f, 0.548672499326f, 0.827305977748f),
                new Color(0.978656887895f, 0.55371563806f, 0.845365210221f),
                new Color(0.978873730796f, 0.558810727197f, 0.862861541059f),
                new Color(0.979163196696f, 0.563875343759f, 0.879861049494f),
                new Color(0.979409739754f, 0.569001080649f, 0.896281394661f),
                new Color(0.979615394968f, 0.574192828239f, 0.912108228802f),
                new Color(0.979898784777f, 0.57936751879f, 0.927429573244f),
                new Color(0.980143480993f, 0.584617488548f, 0.942143565762f),
                new Color(0.980428066947f, 0.589851275613f, 0.956547783518f),
                new Color(0.980616730041f, 0.595083361726f, 0.9710772006f),
                new Color(0.976468972257f, 0.603553543446f, 0.981004612526f),
                new Color(0.964805847952f, 0.617572961021f, 0.981714065719f),
                new Color(0.954176640447f, 0.63062291544f, 0.98230045557f),
                new Color(0.944661555225f, 0.642731489199f, 0.982953296597f),
                new Color(0.93603016065f, 0.654130441515f, 0.98346643582f),
                new Color(0.928360756143f, 0.66481724059f, 0.984025523979f),
                new Color(0.921434978877f, 0.674983455547f, 0.984397251418f),
                new Color(0.915422862482f, 0.684546158619f, 0.984911837263f),
                new Color(0.910111827943f, 0.693674997183f, 0.985320520096f),
                new Color(0.905571512771f, 0.702343324126f, 0.985812122819f),
                new Color(0.901601922737f, 0.710699556338f, 0.986111780451f),
                new Color(0.898356871852f, 0.718653125358f, 0.986567164996f),
                new Color(0.895642344584f, 0.726340995476f, 0.986888961516f),
                new Color(0.893521424939f, 0.733727097324f, 0.98726874984f),
                new Color(0.891890609952f, 0.740883482457f, 0.98756617527f),
                new Color(0.890807853428f, 0.747773239593f, 0.987979040431f),
                new Color(0.890095471452f, 0.754514481404f, 0.988182442835f),
                new Color(0.889886635315f, 0.761017145744f, 0.988552456896f),
                new Color(0.890008347904f, 0.767394121872f, 0.988753387001f),
                new Color(0.890588245246f, 0.773556490152f, 0.989172395609f),
                new Color(0.891457946733f, 0.779612719008f, 0.989464223106f),
                new Color(0.892598870881f, 0.785570447984f, 0.989646351742f),
                new Color(0.894063184379f, 0.791389242524f, 0.989928948566f),
                new Color(0.895831034216f, 0.797076748131f, 0.990336671576f),
                new Color(0.897743294753f, 0.802733631489f, 0.990505508391f),
                new Color(0.899923597083f, 0.808271006036f, 0.990843972112f),
                new Color(0.902215072313f, 0.813787255622f, 0.9909846661f),
                new Color(0.904742107148f, 0.819193511768f, 0.991342528157f),
                new Color(0.907348759393f, 0.82458640736f, 0.991548838469f),
                new Color(0.910053474568f, 0.829929090757f, 0.99188862438f),
                new Color(0.91215063232f, 0.835494723044f, 0.992114623845f),
                new Color(0.914160237339f, 0.841082517336f, 0.99238806617f),
                new Color(0.915831974426f, 0.846792360214f, 0.992574850985f),
                new Color(0.917215934105f, 0.85258644636f, 0.992852574612f),
                new Color(0.918343892019f, 0.858451030257f, 0.993234361466f),
                new Color(0.919146606622f, 0.864444157258f, 0.993364248894f),
                new Color(0.919795086974f, 0.870464877501f, 0.993647603398f),
                new Color(0.920331532515f, 0.876496861837f, 0.994102132011f),
                new Color(0.920717493359f, 0.882585544639f, 0.994394261246f),
                new Color(0.921019745287f, 0.888704026867f, 0.99456239769f),
                new Color(0.921345666753f, 0.89478175202f, 0.994968207377f),
                new Color(0.921656719823f, 0.900877705629f, 0.995139198777f),
                new Color(0.922036583364f, 0.906931628552f, 0.995423392604f),
                new Color(0.922499772046f, 0.912939395805f, 0.99582750669f),
                new Color(0.923064404149f, 0.918922352336f, 0.996076872691f),
                new Color(0.923761725923f, 0.92485561751f, 0.996340836063f),
                new Color(0.924647836764f, 0.930744885063f, 0.996384013549f),
                new Color(0.9257491717f, 0.936567221668f, 0.996378230633f),
                new Color(0.927058934539f, 0.942312986593f, 0.996467071272f),
                new Color(0.928619753408f, 0.947979495601f, 0.99655468174f),
                new Color(0.930450561623f, 0.95355995137f, 0.996669185418f),
                new Color(0.932620027359f, 0.959041009932f, 0.996745582305f),
                new Color(0.935159261824f, 0.964410708781f, 0.996829850665f),
                new Color(0.938030872519f, 0.969670689655f, 0.99704499604f),
                new Color(0.941454329103f, 0.974773745108f, 0.997200400762f),
                new Color(0.945484787756f, 0.979697280271f, 0.997379626347f),
                new Color(0.950253823096f, 0.984400825706f, 0.997607280329f),
                new Color(0.955994721365f, 0.988815107679f, 0.997882735782f),
                new Color(0.963064049972f, 0.992831571263f, 0.998213482077f),
                new Color(0.971958790258f, 0.996291841212f, 0.998647995176f),
                new Color(0.983626075978f, 0.99889350257f, 0.999215372248f),
                new Color(1f, 1f, 1f));

    }


}