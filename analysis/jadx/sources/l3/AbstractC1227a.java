package l3;

import a3.C0632k;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import h3.C1123b;
import h3.C1124c;
import java.util.ArrayList;
import m3.C1361b;
import o3.C1415a;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1227a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14445a = Z.m.s("k", "x", "y");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static F3.c a(C1361b c1361b, C0632k c0632k) {
        ArrayList arrayList = new ArrayList();
        if (c1361b.M() == 1) {
            c1361b.a();
            while (c1361b.n()) {
                C1361b c1361b2 = c1361b;
                C0632k c0632k2 = c0632k;
                arrayList.add(new d3.l(c0632k2, o.b(c1361b2, c0632k2, n3.i.c(), f.f14457u, c1361b.M() == 3, false)));
                c1361b = c1361b2;
                c0632k = c0632k2;
            }
            c1361b.c();
            p.b(arrayList);
        } else {
            arrayList.add(new C1415a(n.b(c1361b, n3.i.c())));
        }
        return new F3.c(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h3.e b(C1361b c1361b, C0632k c0632k) {
        c1361b.b();
        F3.c cVarA = null;
        C1123b c1123bH = null;
        boolean z5 = false;
        C1123b c1123bH2 = null;
        while (c1361b.M() != 4) {
            int iA0 = c1361b.a0(f14445a);
            if (iA0 == 0) {
                cVarA = a(c1361b, c0632k);
            } else if (iA0 != 1) {
                if (iA0 != 2) {
                    c1361b.b0();
                    c1361b.c0();
                } else if (c1361b.M() == 6) {
                    c1361b.c0();
                    z5 = true;
                } else {
                    c1123bH = AbstractC0836n2.H(c1361b, c0632k, true);
                }
            } else if (c1361b.M() == 6) {
                c1361b.c0();
                z5 = true;
            } else {
                c1123bH2 = AbstractC0836n2.H(c1361b, c0632k, true);
            }
        }
        c1361b.e();
        if (z5) {
            c0632k.a("Lottie doesn't support expressions.");
        }
        return cVarA != null ? cVarA : new C1124c(c1123bH2, c1123bH);
    }
}
