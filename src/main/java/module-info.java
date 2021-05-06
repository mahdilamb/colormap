/**
 * A colormap module to provide the easy construction of linear and categorical colormaps.
 */
module net.mahdilamb.colormap {
    requires java.desktop;
    exports net.mahdilamb.colormap;
    exports net.mahdilamb.colormap.reference;
    exports net.mahdilamb.colormap.reference.cyclic;
    exports net.mahdilamb.colormap.reference.diverging;
    exports net.mahdilamb.colormap.reference.qualitative;
    exports net.mahdilamb.colormap.reference.sequential;

}