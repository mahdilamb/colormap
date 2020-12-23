package net.mahdilamb.colormap.reference.sequential;

import net.mahdilamb.colormap.SequentialColormap;
import net.mahdilamb.colormap.reference.ColormapType;
import net.mahdilamb.colormap.reference.ReferenceColormap;
import net.mahdilamb.colormap.Color;

/**
 * MPL colormap Cividis
 */
@ReferenceColormap(type = ColormapType.SEQUENTIAL, name = "Cividis")
public final class Cividis extends SequentialColormap {
    /**
     * Create a colormap based on MPL Cividis
     */
    public Cividis() {
        super(
                //data from https://github.com/matplotlib/matplotlib/blob/f2116d82dfd6b82fe178230766d95ea9ac2b0c8c/lib/matplotlib/_cm_listed.py#L1288

                new Color(0.000000, 0.135112, 0.304751),
                new Color(0.000000, 0.138068, 0.311105),
                new Color(0.000000, 0.141013, 0.317579),
                new Color(0.000000, 0.143951, 0.323982),
                new Color(0.000000, 0.146877, 0.330479),
                new Color(0.000000, 0.149791, 0.337065),
                new Color(0.000000, 0.152673, 0.343704),
                new Color(0.000000, 0.155377, 0.350500),
                new Color(0.000000, 0.157932, 0.357521),
                new Color(0.000000, 0.160495, 0.364534),
                new Color(0.000000, 0.163058, 0.371608),
                new Color(0.000000, 0.165621, 0.378769),
                new Color(0.000000, 0.168204, 0.385902),
                new Color(0.000000, 0.170800, 0.393100),
                new Color(0.000000, 0.173420, 0.400353),
                new Color(0.000000, 0.176082, 0.407577),
                new Color(0.000000, 0.178802, 0.414764),
                new Color(0.000000, 0.181610, 0.421859),
                new Color(0.000000, 0.184550, 0.428802),
                new Color(0.000000, 0.186915, 0.435532),
                new Color(0.000000, 0.188769, 0.439563),
                new Color(0.000000, 0.190950, 0.441085),
                new Color(0.000000, 0.193366, 0.441561),
                new Color(0.003602, 0.195911, 0.441564),
                new Color(0.017852, 0.198528, 0.441248),
                new Color(0.032110, 0.201199, 0.440785),
                new Color(0.046205, 0.203903, 0.440196),
                new Color(0.058378, 0.206629, 0.439531),
                new Color(0.068968, 0.209372, 0.438863),
                new Color(0.078624, 0.212122, 0.438105),
                new Color(0.087465, 0.214879, 0.437342),
                new Color(0.095645, 0.217643, 0.436593),
                new Color(0.103401, 0.220406, 0.435790),
                new Color(0.110658, 0.223170, 0.435067),
                new Color(0.117612, 0.225935, 0.434308),
                new Color(0.124291, 0.228697, 0.433547),
                new Color(0.130669, 0.231458, 0.432840),
                new Color(0.136830, 0.234216, 0.432148),
                new Color(0.142852, 0.236972, 0.431404),
                new Color(0.148638, 0.239724, 0.430752),
                new Color(0.154261, 0.242475, 0.430120),
                new Color(0.159733, 0.245221, 0.429528),
                new Color(0.165113, 0.247965, 0.428908),
                new Color(0.170362, 0.250707, 0.428325),
                new Color(0.175490, 0.253444, 0.427790),
                new Color(0.180503, 0.256180, 0.427299),
                new Color(0.185453, 0.258914, 0.426788),
                new Color(0.190303, 0.261644, 0.426329),
                new Color(0.195057, 0.264372, 0.425924),
                new Color(0.199764, 0.267099, 0.425497),
                new Color(0.204385, 0.269823, 0.425126),
                new Color(0.208926, 0.272546, 0.424809),
                new Color(0.213431, 0.275266, 0.424480),
                new Color(0.217863, 0.277985, 0.424206),
                new Color(0.222264, 0.280702, 0.423914),
                new Color(0.226598, 0.283419, 0.423678),
                new Color(0.230871, 0.286134, 0.423498),
                new Color(0.235120, 0.288848, 0.423304),
                new Color(0.239312, 0.291562, 0.423167),
                new Color(0.243485, 0.294274, 0.423014),
                new Color(0.247605, 0.296986, 0.422917),
                new Color(0.251675, 0.299698, 0.422873),
                new Color(0.255731, 0.302409, 0.422814),
                new Color(0.259740, 0.305120, 0.422810),
                new Color(0.263738, 0.307831, 0.422789),
                new Color(0.267693, 0.310542, 0.422821),
                new Color(0.271639, 0.313253, 0.422837),
                new Color(0.275513, 0.315965, 0.422979),
                new Color(0.279411, 0.318677, 0.423031),
                new Color(0.283240, 0.321390, 0.423211),
                new Color(0.287065, 0.324103, 0.423373),
                new Color(0.290884, 0.326816, 0.423517),
                new Color(0.294669, 0.329531, 0.423716),
                new Color(0.298421, 0.332247, 0.423973),
                new Color(0.302169, 0.334963, 0.424213),
                new Color(0.305886, 0.337681, 0.424512),
                new Color(0.309601, 0.340399, 0.424790),
                new Color(0.313287, 0.343120, 0.425120),
                new Color(0.316941, 0.345842, 0.425512),
                new Color(0.320595, 0.348565, 0.425889),
                new Color(0.324250, 0.351289, 0.426250),
                new Color(0.327875, 0.354016, 0.426670),
                new Color(0.331474, 0.356744, 0.427144),
                new Color(0.335073, 0.359474, 0.427605),
                new Color(0.338673, 0.362206, 0.428053),
                new Color(0.342246, 0.364939, 0.428559),
                new Color(0.345793, 0.367676, 0.429127),
                new Color(0.349341, 0.370414, 0.429685),
                new Color(0.352892, 0.373153, 0.430226),
                new Color(0.356418, 0.375896, 0.430823),
                new Color(0.359916, 0.378641, 0.431501),
                new Color(0.363446, 0.381388, 0.432075),
                new Color(0.366923, 0.384139, 0.432796),
                new Color(0.370430, 0.386890, 0.433428),
                new Color(0.373884, 0.389646, 0.434209),
                new Color(0.377371, 0.392404, 0.434890),
                new Color(0.380830, 0.395164, 0.435653),
                new Color(0.384268, 0.397928, 0.436475),
                new Color(0.387705, 0.400694, 0.437305),
                new Color(0.391151, 0.403464, 0.438096),
                new Color(0.394568, 0.406236, 0.438986),
                new Color(0.397991, 0.409011, 0.439848),
                new Color(0.401418, 0.411790, 0.440708),
                new Color(0.404820, 0.414572, 0.441642),
                new Color(0.408226, 0.417357, 0.442570),
                new Color(0.411607, 0.420145, 0.443577),
                new Color(0.414992, 0.422937, 0.444578),
                new Color(0.418383, 0.425733, 0.445560),
                new Color(0.421748, 0.428531, 0.446640),
                new Color(0.425120, 0.431334, 0.447692),
                new Color(0.428462, 0.434140, 0.448864),
                new Color(0.431817, 0.436950, 0.449982),
                new Color(0.435168, 0.439763, 0.451134),
                new Color(0.438504, 0.442580, 0.452341),
                new Color(0.441810, 0.445402, 0.453659),
                new Color(0.445148, 0.448226, 0.454885),
                new Color(0.448447, 0.451053, 0.456264),
                new Color(0.451759, 0.453887, 0.457582),
                new Color(0.455072, 0.456718, 0.458976),
                new Color(0.458366, 0.459552, 0.460457),
                new Color(0.461616, 0.462405, 0.461969),
                new Color(0.464947, 0.465241, 0.463395),
                new Color(0.468254, 0.468083, 0.464908),
                new Color(0.471501, 0.470960, 0.466357),
                new Color(0.474812, 0.473832, 0.467681),
                new Color(0.478186, 0.476699, 0.468845),
                new Color(0.481622, 0.479573, 0.469767),
                new Color(0.485141, 0.482451, 0.470384),
                new Color(0.488697, 0.485318, 0.471008),
                new Color(0.492278, 0.488198, 0.471453),
                new Color(0.495913, 0.491076, 0.471751),
                new Color(0.499552, 0.493960, 0.472032),
                new Color(0.503185, 0.496851, 0.472305),
                new Color(0.506866, 0.499743, 0.472432),
                new Color(0.510540, 0.502643, 0.472550),
                new Color(0.514226, 0.505546, 0.472640),
                new Color(0.517920, 0.508454, 0.472707),
                new Color(0.521643, 0.511367, 0.472639),
                new Color(0.525348, 0.514285, 0.472660),
                new Color(0.529086, 0.517207, 0.472543),
                new Color(0.532829, 0.520135, 0.472401),
                new Color(0.536553, 0.523067, 0.472352),
                new Color(0.540307, 0.526005, 0.472163),
                new Color(0.544069, 0.528948, 0.471947),
                new Color(0.547840, 0.531895, 0.471704),
                new Color(0.551612, 0.534849, 0.471439),
                new Color(0.555393, 0.537807, 0.471147),
                new Color(0.559181, 0.540771, 0.470829),
                new Color(0.562972, 0.543741, 0.470488),
                new Color(0.566802, 0.546715, 0.469988),
                new Color(0.570607, 0.549695, 0.469593),
                new Color(0.574417, 0.552682, 0.469172),
                new Color(0.578236, 0.555673, 0.468724),
                new Color(0.582087, 0.558670, 0.468118),
                new Color(0.585916, 0.561674, 0.467618),
                new Color(0.589753, 0.564682, 0.467090),
                new Color(0.593622, 0.567697, 0.466401),
                new Color(0.597469, 0.570718, 0.465821),
                new Color(0.601354, 0.573743, 0.465074),
                new Color(0.605211, 0.576777, 0.464441),
                new Color(0.609105, 0.579816, 0.463638),
                new Color(0.612977, 0.582861, 0.462950),
                new Color(0.616852, 0.585913, 0.462237),
                new Color(0.620765, 0.588970, 0.461351),
                new Color(0.624654, 0.592034, 0.460583),
                new Color(0.628576, 0.595104, 0.459641),
                new Color(0.632506, 0.598180, 0.458668),
                new Color(0.636412, 0.601264, 0.457818),
                new Color(0.640352, 0.604354, 0.456791),
                new Color(0.644270, 0.607450, 0.455886),
                new Color(0.648222, 0.610553, 0.454801),
                new Color(0.652178, 0.613664, 0.453689),
                new Color(0.656114, 0.616780, 0.452702),
                new Color(0.660082, 0.619904, 0.451534),
                new Color(0.664055, 0.623034, 0.450338),
                new Color(0.668008, 0.626171, 0.449270),
                new Color(0.671991, 0.629316, 0.448018),
                new Color(0.675981, 0.632468, 0.446736),
                new Color(0.679979, 0.635626, 0.445424),
                new Color(0.683950, 0.638793, 0.444251),
                new Color(0.687957, 0.641966, 0.442886),
                new Color(0.691971, 0.645145, 0.441491),
                new Color(0.695985, 0.648334, 0.440072),
                new Color(0.700008, 0.651529, 0.438624),
                new Color(0.704037, 0.654731, 0.437147),
                new Color(0.708067, 0.657942, 0.435647),
                new Color(0.712105, 0.661160, 0.434117),
                new Color(0.716177, 0.664384, 0.432386),
                new Color(0.720222, 0.667618, 0.430805),
                new Color(0.724274, 0.670859, 0.429194),
                new Color(0.728334, 0.674107, 0.427554),
                new Color(0.732422, 0.677364, 0.425717),
                new Color(0.736488, 0.680629, 0.424028),
                new Color(0.740589, 0.683900, 0.422131),
                new Color(0.744664, 0.687181, 0.420393),
                new Color(0.748772, 0.690470, 0.418448),
                new Color(0.752886, 0.693766, 0.416472),
                new Color(0.756975, 0.697071, 0.414659),
                new Color(0.761096, 0.700384, 0.412638),
                new Color(0.765223, 0.703705, 0.410587),
                new Color(0.769353, 0.707035, 0.408516),
                new Color(0.773486, 0.710373, 0.406422),
                new Color(0.777651, 0.713719, 0.404112),
                new Color(0.781795, 0.717074, 0.401966),
                new Color(0.785965, 0.720438, 0.399613),
                new Color(0.790116, 0.723810, 0.397423),
                new Color(0.794298, 0.727190, 0.395016),
                new Color(0.798480, 0.730580, 0.392597),
                new Color(0.802667, 0.733978, 0.390153),
                new Color(0.806859, 0.737385, 0.387684),
                new Color(0.811054, 0.740801, 0.385198),
                new Color(0.815274, 0.744226, 0.382504),
                new Color(0.819499, 0.747659, 0.379785),
                new Color(0.823729, 0.751101, 0.377043),
                new Color(0.827959, 0.754553, 0.374292),
                new Color(0.832192, 0.758014, 0.371529),
                new Color(0.836429, 0.761483, 0.368747),
                new Color(0.840693, 0.764962, 0.365746),
                new Color(0.844957, 0.768450, 0.362741),
                new Color(0.849223, 0.771947, 0.359729),
                new Color(0.853515, 0.775454, 0.356500),
                new Color(0.857809, 0.778969, 0.353259),
                new Color(0.862105, 0.782494, 0.350011),
                new Color(0.866421, 0.786028, 0.346571),
                new Color(0.870717, 0.789572, 0.343333),
                new Color(0.875057, 0.793125, 0.339685),
                new Color(0.879378, 0.796687, 0.336241),
                new Color(0.883720, 0.800258, 0.332599),
                new Color(0.888081, 0.803839, 0.328770),
                new Color(0.892440, 0.807430, 0.324968),
                new Color(0.896818, 0.811030, 0.320982),
                new Color(0.901195, 0.814639, 0.317021),
                new Color(0.905589, 0.818257, 0.312889),
                new Color(0.910000, 0.821885, 0.308594),
                new Color(0.914407, 0.825522, 0.304348),
                new Color(0.918828, 0.829168, 0.299960),
                new Color(0.923279, 0.832822, 0.295244),
                new Color(0.927724, 0.836486, 0.290611),
                new Color(0.932180, 0.840159, 0.285880),
                new Color(0.936660, 0.843841, 0.280876),
                new Color(0.941147, 0.847530, 0.275815),
                new Color(0.945654, 0.851228, 0.270532),
                new Color(0.950178, 0.854933, 0.265085),
                new Color(0.954725, 0.858646, 0.259365),
                new Color(0.959284, 0.862365, 0.253563),
                new Color(0.963872, 0.866089, 0.247445),
                new Color(0.968469, 0.869819, 0.241310),
                new Color(0.973114, 0.873550, 0.234677),
                new Color(0.977780, 0.877281, 0.227954),
                new Color(0.982497, 0.881008, 0.220878),
                new Color(0.987293, 0.884718, 0.213336),
                new Color(0.992218, 0.888385, 0.205468),
                new Color(0.994847, 0.892954, 0.203445),
                new Color(0.995249, 0.898384, 0.207561),
                new Color(0.995503, 0.903866, 0.212370),
                new Color(0.995737, 0.909344, 0.217772)
        );
    }

}