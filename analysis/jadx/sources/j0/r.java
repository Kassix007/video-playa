package j0;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ColorSpace a(k0.c cVar) {
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13986e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13995q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13996r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13993o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13998t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13997s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13989k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13990l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13987g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13988h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13991m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13994p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, k0.d.f13992n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ColorSpace colorSpace = kotlin.jvm.internal.m.a(cVar, k0.d.f14000v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : kotlin.jvm.internal.m.a(cVar, k0.d.f14001w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof k0.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        k0.q qVar = (k0.q) cVar;
        float[] fArrA = qVar.f14029d.a();
        k0.r rVar = qVar.f14031g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f14041b, rVar.f14042c, rVar.f14043d, rVar.f14044e, rVar.f, rVar.f14045g, rVar.f14040a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(cVar.f13979a, qVar.f14032h, fArrA, transferParameters);
        }
        String str = cVar.f13979a;
        float[] fArr = qVar.f14032h;
        final k0.p pVar = qVar.f14034l;
        final int i = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: j0.q
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d5) {
                switch (i) {
                }
                return ((Number) pVar.invoke(Double.valueOf(d5))).doubleValue();
            }
        };
        final k0.p pVar2 = qVar.f14037o;
        final int i7 = 1;
        k0.q qVar2 = (k0.q) cVar;
        return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: j0.q
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d5) {
                switch (i7) {
                }
                return ((Number) pVar2.invoke(Double.valueOf(d5))).doubleValue();
            }
        }, qVar2.f14030e, qVar2.f);
    }
}
