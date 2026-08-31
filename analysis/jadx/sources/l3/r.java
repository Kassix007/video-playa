package l3;

import a3.C0620A;
import a3.C0632k;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import m3.C1361b;
import r.C1566q;
import r.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14486a = Z.m.s("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.m f14487b = Z.m.s("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z.m f14488c = Z.m.s("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z.m f14489d = Z.m.s("cm", "tm", "dr");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static C0632k a(C1361b c1361b) {
        C0632k c0632k;
        float f;
        C0632k c0632k2;
        C0632k c0632k3;
        int i;
        float f7;
        C0632k c0632k4;
        float f8;
        float f9;
        int i7;
        float fC = n3.i.c();
        C1566q c1566q = new C1566q((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        S s6 = new S(0);
        C0632k c0632k5 = new C0632k();
        c1361b.b();
        int iZ = 0;
        int iZ2 = 0;
        float fZ = 0.0f;
        float fZ2 = 0.0f;
        float fZ3 = 0.0f;
        while (c1361b.n()) {
            switch (c1361b.a0(f14486a)) {
                case 0:
                    c0632k = c0632k5;
                    iZ = (int) c1361b.z();
                    c0632k5 = c0632k;
                    break;
                case 1:
                    c0632k = c0632k5;
                    iZ2 = (int) c1361b.z();
                    c0632k5 = c0632k;
                    break;
                case 2:
                    c0632k = c0632k5;
                    fZ2 = (float) c1361b.z();
                    c0632k5 = c0632k;
                    break;
                case 3:
                    f = fC;
                    c0632k2 = c0632k5;
                    fZ = ((float) c1361b.z()) - 0.01f;
                    c0632k5 = c0632k2;
                    fC = f;
                    break;
                case 4:
                    f = fC;
                    c0632k2 = c0632k5;
                    fZ3 = (float) c1361b.z();
                    c0632k5 = c0632k2;
                    fC = f;
                    break;
                case 5:
                    f = fC;
                    c0632k3 = c0632k5;
                    i = iZ2;
                    f7 = fZ2;
                    String[] strArrSplit = c1361b.K().split("\\.");
                    int i8 = Integer.parseInt(strArrSplit[0]);
                    int i9 = Integer.parseInt(strArrSplit[1]);
                    int i10 = Integer.parseInt(strArrSplit[2]);
                    if (i8 < 4 || (i8 <= 4 && (i9 < 4 || (i9 <= 4 && i10 < 0)))) {
                        c0632k3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
                case 6:
                    f = fC;
                    C0632k c0632k6 = c0632k5;
                    i = iZ2;
                    f7 = fZ2;
                    c1361b.a();
                    int i11 = 0;
                    while (c1361b.n()) {
                        C0632k c0632k7 = c0632k6;
                        j3.e eVarA = q.a(c1361b, c0632k7);
                        if (eVarA.f13794e == 3) {
                            i11++;
                        }
                        arrayList.add(eVarA);
                        c1566q.e(eVarA.f13793d, eVarA);
                        if (i11 > 4) {
                            n3.c.b("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        c0632k6 = c0632k7;
                    }
                    c0632k3 = c0632k6;
                    c1361b.c();
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
                case 7:
                    f = fC;
                    i = iZ2;
                    f7 = fZ2;
                    c1361b.a();
                    while (c1361b.n()) {
                        ArrayList arrayList3 = new ArrayList();
                        C1566q c1566q2 = new C1566q((Object) null);
                        c1361b.b();
                        String strK = null;
                        String strK2 = null;
                        String strK3 = null;
                        int iG = 0;
                        int iG2 = 0;
                        while (c1361b.n()) {
                            int iA0 = c1361b.a0(f14487b);
                            if (iA0 != 0) {
                                if (iA0 == 1) {
                                    c1361b.a();
                                    while (c1361b.n()) {
                                        j3.e eVarA2 = q.a(c1361b, c0632k5);
                                        c1566q2.e(eVarA2.f13793d, eVarA2);
                                        arrayList3.add(eVarA2);
                                        c0632k5 = c0632k5;
                                    }
                                    c0632k4 = c0632k5;
                                    c1361b.c();
                                } else if (iA0 == 2) {
                                    iG = c1361b.G();
                                } else if (iA0 == 3) {
                                    iG2 = c1361b.G();
                                } else if (iA0 == 4) {
                                    strK2 = c1361b.K();
                                } else if (iA0 != 5) {
                                    c1361b.b0();
                                    c1361b.c0();
                                    c0632k4 = c0632k5;
                                } else {
                                    strK3 = c1361b.K();
                                }
                                c0632k5 = c0632k4;
                            } else {
                                strK = c1361b.K();
                            }
                        }
                        C0632k c0632k8 = c0632k5;
                        c1361b.e();
                        if (strK2 != null) {
                            map2.put(strK, new C0620A(iG, iG2, strK, strK2, strK3));
                        } else {
                            map.put(strK, arrayList3);
                        }
                        c0632k5 = c0632k8;
                    }
                    c1361b.c();
                    c0632k3 = c0632k5;
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
                case 8:
                    f = fC;
                    i = iZ2;
                    float f10 = fZ2;
                    c1361b.b();
                    while (c1361b.n()) {
                        if (c1361b.a0(f14488c) != 0) {
                            c1361b.b0();
                            c1361b.c0();
                        } else {
                            c1361b.a();
                            while (c1361b.n()) {
                                Z.m mVar = k.f14472a;
                                c1361b.b();
                                String strK4 = null;
                                String strK5 = null;
                                String strK6 = null;
                                while (c1361b.n()) {
                                    int iA02 = c1361b.a0(k.f14472a);
                                    if (iA02 != 0) {
                                        float f11 = f10;
                                        if (iA02 == 1) {
                                            strK5 = c1361b.K();
                                        } else if (iA02 == 2) {
                                            strK6 = c1361b.K();
                                        } else if (iA02 != 3) {
                                            c1361b.b0();
                                            c1361b.c0();
                                        } else {
                                            c1361b.z();
                                        }
                                        f10 = f11;
                                    } else {
                                        strK4 = c1361b.K();
                                    }
                                }
                                c1361b.e();
                                map3.put(strK5, new g3.c(strK4, strK5, strK6));
                                f10 = f10;
                            }
                            c1361b.c();
                        }
                    }
                    f7 = f10;
                    c1361b.e();
                    c0632k3 = c0632k5;
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
                case 9:
                    f = fC;
                    i = iZ2;
                    f8 = fZ2;
                    c1361b.a();
                    while (c1361b.n()) {
                        Z.m mVar2 = j.f14470a;
                        ArrayList arrayList4 = new ArrayList();
                        c1361b.b();
                        double dZ = 0.0d;
                        char cCharAt = 0;
                        String strK7 = null;
                        String strK8 = null;
                        while (c1361b.n()) {
                            int iA03 = c1361b.a0(j.f14470a);
                            if (iA03 == 0) {
                                cCharAt = c1361b.K().charAt(0);
                            } else if (iA03 == 1) {
                                c1361b.z();
                            } else if (iA03 == 2) {
                                dZ = c1361b.z();
                            } else if (iA03 == 3) {
                                strK7 = c1361b.K();
                            } else if (iA03 == 4) {
                                strK8 = c1361b.K();
                            } else if (iA03 != 5) {
                                c1361b.b0();
                                c1361b.c0();
                            } else {
                                c1361b.b();
                                while (c1361b.n()) {
                                    if (c1361b.a0(j.f14471b) != 0) {
                                        c1361b.b0();
                                        c1361b.c0();
                                    } else {
                                        c1361b.a();
                                        while (c1361b.n()) {
                                            arrayList4.add((i3.n) g.a(c1361b, c0632k5));
                                        }
                                        c1361b.c();
                                    }
                                }
                                c1361b.e();
                            }
                        }
                        c1361b.e();
                        g3.d dVar = new g3.d(arrayList4, cCharAt, dZ, strK7, strK8);
                        s6.e(dVar.hashCode(), dVar);
                    }
                    c1361b.c();
                    f7 = f8;
                    c0632k3 = c0632k5;
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
                case 10:
                    c1361b.a();
                    while (c1361b.n()) {
                        c1361b.b();
                        String strK9 = null;
                        float fZ4 = 0.0f;
                        float fZ5 = 0.0f;
                        while (c1361b.n()) {
                            int iA04 = c1361b.a0(f14489d);
                            if (iA04 != 0) {
                                f9 = fC;
                                if (iA04 == 1) {
                                    i7 = iZ2;
                                    fZ2 = fZ2;
                                    fZ4 = (float) c1361b.z();
                                } else if (iA04 != 2) {
                                    c1361b.b0();
                                    c1361b.c0();
                                } else {
                                    i7 = iZ2;
                                    fZ2 = fZ2;
                                    fZ5 = (float) c1361b.z();
                                }
                                iZ2 = i7;
                            } else {
                                f9 = fC;
                                strK9 = c1361b.K();
                            }
                            fC = f9;
                        }
                        c1361b.e();
                        arrayList2.add(new g3.h(strK9, fZ4, fZ5));
                        fZ2 = fZ2;
                        iZ2 = iZ2;
                        fC = fC;
                    }
                    f = fC;
                    i = iZ2;
                    f8 = fZ2;
                    c1361b.c();
                    f7 = f8;
                    c0632k3 = c0632k5;
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
                default:
                    c1361b.b0();
                    c1361b.c0();
                    f = fC;
                    c0632k3 = c0632k5;
                    i = iZ2;
                    f7 = fZ2;
                    c0632k5 = c0632k3;
                    iZ2 = i;
                    fZ2 = f7;
                    fC = f;
                    break;
            }
        }
        float f12 = fC;
        C0632k c0632k9 = c0632k5;
        Rect rect = new Rect(0, 0, (int) (iZ * f12), (int) (iZ2 * f12));
        float fC2 = n3.i.c();
        c0632k9.f8840k = rect;
        c0632k9.f8841l = fZ2;
        c0632k9.f8842m = fZ;
        c0632k9.f8843n = fZ3;
        c0632k9.j = arrayList;
        c0632k9.i = c1566q;
        c0632k9.f8835c = map;
        c0632k9.f8836d = map2;
        c0632k9.f8837e = fC2;
        c0632k9.f8839h = s6;
        c0632k9.f = map3;
        c0632k9.f8838g = arrayList2;
        return c0632k9;
    }
}
