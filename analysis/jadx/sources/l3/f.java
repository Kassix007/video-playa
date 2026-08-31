package l3;

import android.graphics.Color;
import android.graphics.PointF;
import m3.AbstractC1360a;
import o3.C1417c;

/* JADX INFO: loaded from: classes.dex */
public final class f implements D {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f14454r = new f(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f14455s = new f(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f14456t = new f(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f14457u = new f(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f14458v = new f(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f14459w = new f(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14460q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [l3.f.<clinit>():void] */
    public /* synthetic */ f(int i) {
        this.f14460q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l3.D
    public final Object a(AbstractC1360a abstractC1360a, float f) {
        switch (this.f14460q) {
            case 0:
                boolean z5 = abstractC1360a.M() == 1;
                if (z5) {
                    abstractC1360a.a();
                }
                double dZ = abstractC1360a.z();
                double dZ2 = abstractC1360a.z();
                double dZ3 = abstractC1360a.z();
                double dZ4 = abstractC1360a.M() == 7 ? abstractC1360a.z() : 1.0d;
                if (z5) {
                    abstractC1360a.c();
                }
                if (dZ <= 1.0d && dZ2 <= 1.0d && dZ3 <= 1.0d) {
                    dZ *= 255.0d;
                    dZ2 *= 255.0d;
                    dZ3 *= 255.0d;
                    if (dZ4 <= 1.0d) {
                        dZ4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dZ4, (int) dZ, (int) dZ2, (int) dZ3));
            case 1:
                return Float.valueOf(n.d(abstractC1360a) * f);
            case 2:
                return Integer.valueOf(Math.round(n.d(abstractC1360a) * f));
            case 3:
                return n.b(abstractC1360a, f);
            case 4:
                int iM = abstractC1360a.M();
                if (iM == 1) {
                    return n.b(abstractC1360a, f);
                }
                if (iM == 3) {
                    return n.b(abstractC1360a, f);
                }
                if (iM != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(k1.i.t(iM)));
                }
                PointF pointF = new PointF(((float) abstractC1360a.z()) * f, ((float) abstractC1360a.z()) * f);
                while (abstractC1360a.n()) {
                    abstractC1360a.c0();
                }
                return pointF;
            default:
                boolean z6 = abstractC1360a.M() == 1;
                if (z6) {
                    abstractC1360a.a();
                }
                float fZ = (float) abstractC1360a.z();
                float fZ2 = (float) abstractC1360a.z();
                while (abstractC1360a.n()) {
                    abstractC1360a.c0();
                }
                if (z6) {
                    abstractC1360a.c();
                }
                return new C1417c((fZ / 100.0f) * f, (fZ2 / 100.0f) * f);
        }
    }
}
