package l3;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import m3.AbstractC1360a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14478a = Z.m.s("x", "y");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(AbstractC1360a abstractC1360a) {
        abstractC1360a.a();
        int iZ = (int) (abstractC1360a.z() * 255.0d);
        int iZ2 = (int) (abstractC1360a.z() * 255.0d);
        int iZ3 = (int) (abstractC1360a.z() * 255.0d);
        while (abstractC1360a.n()) {
            abstractC1360a.c0();
        }
        abstractC1360a.c();
        return Color.argb(255, iZ, iZ2, iZ3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PointF b(AbstractC1360a abstractC1360a, float f) {
        int iA = O.c.a(abstractC1360a.M());
        if (iA == 0) {
            abstractC1360a.a();
            float fZ = (float) abstractC1360a.z();
            float fZ2 = (float) abstractC1360a.z();
            while (abstractC1360a.M() != 2) {
                abstractC1360a.c0();
            }
            abstractC1360a.c();
            return new PointF(fZ * f, fZ2 * f);
        }
        if (iA != 2) {
            if (iA != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(k1.i.t(abstractC1360a.M())));
            }
            float fZ3 = (float) abstractC1360a.z();
            float fZ4 = (float) abstractC1360a.z();
            while (abstractC1360a.n()) {
                abstractC1360a.c0();
            }
            return new PointF(fZ3 * f, fZ4 * f);
        }
        abstractC1360a.b();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (abstractC1360a.n()) {
            int iA0 = abstractC1360a.a0(f14478a);
            if (iA0 == 0) {
                fD = d(abstractC1360a);
            } else if (iA0 != 1) {
                abstractC1360a.b0();
                abstractC1360a.c0();
            } else {
                fD2 = d(abstractC1360a);
            }
        }
        abstractC1360a.e();
        return new PointF(fD * f, fD2 * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList c(AbstractC1360a abstractC1360a, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC1360a.a();
        while (abstractC1360a.M() == 1) {
            abstractC1360a.a();
            arrayList.add(b(abstractC1360a, f));
            abstractC1360a.c();
        }
        abstractC1360a.c();
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float d(AbstractC1360a abstractC1360a) {
        int iM = abstractC1360a.M();
        int iA = O.c.a(iM);
        if (iA != 0) {
            if (iA == 6) {
                return (float) abstractC1360a.z();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(k1.i.t(iM)));
        }
        abstractC1360a.a();
        float fZ = (float) abstractC1360a.z();
        while (abstractC1360a.n()) {
            abstractC1360a.c0();
        }
        abstractC1360a.c();
        return fZ;
    }
}
