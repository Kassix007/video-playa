package l3;

import android.graphics.PointF;
import g3.C1083b;
import m3.AbstractC1360a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements D {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f14462q = new h();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z.m f14463r = Z.m.s("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l3.D
    public final Object a(AbstractC1360a abstractC1360a, float f) {
        PointF pointF;
        PointF pointF2;
        abstractC1360a.b();
        String strK = null;
        float fZ = 0.0f;
        float fZ2 = 0.0f;
        float fZ3 = 0.0f;
        float fZ4 = 0.0f;
        int iG = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zV = true;
        int i = 3;
        String strK2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (abstractC1360a.n()) {
            switch (abstractC1360a.a0(f14463r)) {
                case 0:
                    strK = abstractC1360a.K();
                    break;
                case 1:
                    strK2 = abstractC1360a.K();
                    break;
                case 2:
                    pointF = pointF3;
                    fZ = (float) abstractC1360a.z();
                    pointF3 = pointF;
                    break;
                case 3:
                    PointF pointF5 = pointF3;
                    pointF2 = pointF4;
                    int iG2 = abstractC1360a.G();
                    i = (iG2 > 2 || iG2 < 0) ? 3 : O.c.b(3)[iG2];
                    pointF3 = pointF5;
                    pointF4 = pointF2;
                    break;
                case 4:
                    iG = abstractC1360a.G();
                    break;
                case 5:
                    pointF = pointF3;
                    fZ2 = (float) abstractC1360a.z();
                    pointF3 = pointF;
                    break;
                case 6:
                    pointF = pointF3;
                    fZ3 = (float) abstractC1360a.z();
                    pointF3 = pointF;
                    break;
                case 7:
                    iA = n.a(abstractC1360a);
                    break;
                case 8:
                    iA2 = n.a(abstractC1360a);
                    break;
                case 9:
                    pointF = pointF3;
                    fZ4 = (float) abstractC1360a.z();
                    pointF3 = pointF;
                    break;
                case 10:
                    zV = abstractC1360a.v();
                    break;
                case 11:
                    abstractC1360a.a();
                    pointF2 = pointF4;
                    PointF pointF6 = new PointF(((float) abstractC1360a.z()) * f, ((float) abstractC1360a.z()) * f);
                    abstractC1360a.c();
                    pointF3 = pointF6;
                    pointF4 = pointF2;
                    break;
                case 12:
                    abstractC1360a.a();
                    pointF = pointF3;
                    pointF4 = new PointF(((float) abstractC1360a.z()) * f, ((float) abstractC1360a.z()) * f);
                    abstractC1360a.c();
                    pointF3 = pointF;
                    break;
                default:
                    abstractC1360a.b0();
                    abstractC1360a.c0();
                    break;
            }
        }
        abstractC1360a.e();
        C1083b c1083b = new C1083b();
        c1083b.f13041a = strK;
        c1083b.f13042b = strK2;
        c1083b.f13043c = fZ;
        c1083b.f13044d = i;
        c1083b.f13045e = iG;
        c1083b.f = fZ2;
        c1083b.f13046g = fZ3;
        c1083b.f13047h = iA;
        c1083b.i = iA2;
        c1083b.j = fZ4;
        c1083b.f13048k = zV;
        c1083b.f13049l = pointF3;
        c1083b.f13050m = pointF4;
        return c1083b;
    }
}
