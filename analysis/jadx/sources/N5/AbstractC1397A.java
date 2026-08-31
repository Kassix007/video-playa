package n5;

import A.AbstractC0012i;
import A.AbstractC0017n;
import A.C0005b;
import A.InterfaceC0010g;
import A.L;
import B0.C0044i;
import B0.C0045j;
import B0.D;
import B0.InterfaceC0046k;
import B0.j0;
import C.C;
import C.C0062b;
import C0.AbstractC0103t0;
import C0.Z;
import E.C0138v;
import M.AbstractC0217k;
import M.C0213i;
import M.C0214i0;
import M.L0;
import M5.C0256q;
import M5.InterfaceC0261w;
import P.C0345b;
import P.C0348c0;
import P.C0363k;
import P.C0367m;
import P.C0371o;
import P.C0372o0;
import P.C0387x;
import P.InterfaceC0360i0;
import P.S;
import P.W;
import R4.C0458i;
import R4.C0468k1;
import R4.H0;
import R4.N;
import R4.i3;
import R4.l3;
import U4.C0539f;
import U4.C0548o;
import a1.C0608a;
import a1.C0610c;
import a1.C0611d;
import a1.C0615h;
import a1.C0616i;
import a1.DialogC0617j;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import c.AbstractC0707e;
import c.C0710h;
import c.C0711i;
import c.C0712j;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0715c;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.C0796f2;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import j0.AbstractC1145B;
import j5.C1166c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.B;
import m.AbstractC1293Z0;
import m.b1;
import m5.AbstractC1362a;
import m5.C1386y;
import o5.C1423e;
import o5.C1425g;
import org.json.JSONException;
import org.json.JSONObject;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.C1581b;
import r5.C1582c;
import r5.C1583d;
import r5.C1584e;
import u.C1667v;
import v.C1717l;
import v.d0;
import w.C1793l;
import w.I;
import y4.AbstractC1918b;
import z0.InterfaceC1926C;

/* JADX INFO: renamed from: n5.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1397A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f15287a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void A(Window window, boolean z5) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            E0.e.e(window, z5);
        } else {
            if (i >= 30) {
                E0.e.d(window, z5);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Set B(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return u.f15301q;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.m.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.I(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void C(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1293Z0.a(view, charSequence);
            return;
        }
        b1 b1Var = b1.f14753A;
        if (b1Var != null && b1Var.f14755q == view) {
            b1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new b1(view, charSequence);
            return;
        }
        b1 b1Var2 = b1.f14754B;
        if (b1Var2 != null && b1Var2.f14755q == view) {
            b1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int D(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List E(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(l.l0(list)) : s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Map F(Map map) {
        int size = map.size();
        if (size == 0) {
            return t.f15300q;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) l.k0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object G(B5.e eVar, Object obj, InterfaceC1524c interfaceC1524c) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        InterfaceC1529h context = interfaceC1524c.getContext();
        Object c1583d = context == C1530i.f16022q ? new C1583d(interfaceC1524c) : new C1584e(interfaceC1524c, context);
        B.b(2, eVar);
        return eVar.invoke(obj, c1583d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SharedPreferences H(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f15287a == null) {
                    f15287a = (SharedPreferences) l6.d.F(new G3.b(0, context));
                }
                sharedPreferences = f15287a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String I(C0796f2 c0796f2) {
        StringBuilder sb = new StringBuilder(c0796f2.h());
        for (int i = 0; i < c0796f2.h(); i++) {
            byte bD = c0796f2.d(i);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(C0468k1 dataObject, C0371o c0371o, int i) {
        C0468k1 c0468k1;
        C0371o c0371o2;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(-203034047);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(Boolean.TRUE);
                c0371o.d0(objH);
            }
            W w3 = (W) objH;
            Object objH2 = c0371o.H();
            if (objH2 == s6) {
                objH2 = new C0348c0(-1);
                c0371o.d0(objH2);
            }
            C0348c0 c0348c0 = (C0348c0) objH2;
            Object objH3 = c0371o.H();
            if (objH3 == s6) {
                objH3 = C0345b.q("#ffffff");
                c0371o.d0(objH3);
            }
            W w6 = (W) objH3;
            C1166c c1166c = dataObject.f7097s;
            J j = c1166c != null ? c1166c.f13864g : null;
            if (j == null) {
                c0371o.S(-1273058254);
            } else {
                c0371o.S(-1842181713);
                MainActivity mainActivity = dataObject.f7069b;
                boolean zI = c0371o.i(dataObject);
                Object objH4 = c0371o.H();
                if (zI || objH4 == s6) {
                    objH4 = new N(new C0539f(dataObject, w3, 1), 6);
                    c0371o.d0(objH4);
                }
                j.e(mainActivity, (K) objH4);
            }
            c0371o.p(false);
            Boolean bool = Boolean.TRUE;
            boolean zI2 = c0371o.i(dataObject);
            Object objH5 = c0371o.H();
            if (zI2 || objH5 == s6) {
                c0468k1 = dataObject;
                objH5 = new W4.c(c0468k1, c0348c0, w3, w6, null);
                c0371o.d0(objH5);
            } else {
                c0468k1 = dataObject;
            }
            C0345b.e((B5.e) objH5, c0371o, bool);
            if (((Boolean) w3.getValue()).booleanValue()) {
                c0371o.S(-1270446317);
                InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f9277a, AbstractC1145B.b(Color.parseColor((String) w6.getValue())), AbstractC1145B.f13658a);
                InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
                int i8 = c0371o.f5454P;
                InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mA);
                InterfaceC0046k.f452a.getClass();
                D d5 = C0045j.f445b;
                c0371o.W();
                if (c0371o.f5453O) {
                    c0371o.l(d5);
                } else {
                    c0371o.g0();
                }
                C0044i c0044i = C0045j.f448e;
                C0345b.u(c0044i, c0371o, interfaceC1926CD);
                C0044i c0044i2 = C0045j.f447d;
                C0345b.u(c0044i2, c0371o, interfaceC0360i0M);
                C0044i c0044i3 = C0045j.f;
                if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i8))) {
                    k1.i.o(i8, c0371o, i8, c0044i3);
                }
                C0044i c0044i4 = C0045j.f446c;
                C0345b.u(c0044i4, c0371o, interfaceC0725mC);
                InterfaceC0725m interfaceC0725mF = androidx.compose.foundation.layout.c.f(C0722j.f10095q, 560);
                InterfaceC1926C interfaceC1926CD2 = AbstractC0017n.d(C0714b.f10076q, false);
                int i9 = c0371o.f5454P;
                InterfaceC0360i0 interfaceC0360i0M2 = c0371o.m();
                InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o, interfaceC0725mF);
                c0371o.W();
                if (c0371o.f5453O) {
                    c0371o.l(d5);
                } else {
                    c0371o.g0();
                }
                C0345b.u(c0044i, c0371o, interfaceC1926CD2);
                C0345b.u(c0044i2, c0371o, interfaceC0360i0M2);
                if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                    k1.i.o(i9, c0371o, i9, c0044i3);
                }
                C0345b.u(c0044i4, c0371o, interfaceC0725mC2);
                boolean zI3 = c0371o.i(c0468k1);
                Object objH6 = c0371o.H();
                if (zI3 || objH6 == s6) {
                    objH6 = new C0548o(c0468k1, 5);
                    c0371o.d0(objH6);
                }
                c0371o2 = c0371o;
                androidx.compose.ui.viewinterop.a.b((B5.c) objH6, null, null, c0371o2, 0, 6);
                c0371o2.p(true);
                c0371o2.p(true);
            } else {
                c0371o2 = c0371o;
                c0371o2.S(-1275026815);
            }
            c0371o2.p(false);
        } else {
            c0468k1 = dataObject;
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 13, c0468k1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(InterfaceC0725m interfaceC0725m, B5.c cVar, C0371o c0371o, int i) {
        c0371o.U(-932836462);
        int i7 = (c0371o.g(interfaceC0725m) ? 4 : 2) | i | (c0371o.i(cVar) ? 32 : 16);
        if (c0371o.K(i7 & 1, (i7 & 19) != 18)) {
            D5.a.h(c0371o, androidx.compose.ui.draw.a.a(interfaceC0725m, cVar));
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new j0(i, 12, interfaceC0725m, cVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(B5.a aVar, C0616i c0616i, X.e eVar, C0371o c0371o, int i) {
        C0371o c0371o2;
        S s6;
        W0.l lVar;
        c0371o.U(-2032877254);
        int i7 = i | (c0371o.i(aVar) ? 4 : 2) | (c0371o.g(c0616i) ? 32 : 16);
        if (c0371o.K(i7 & 1, (i7 & 147) != 146)) {
            View view = (View) c0371o.k(AndroidCompositionLocals_androidKt.f);
            W0.c cVar = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
            W0.l lVar2 = (W0.l) c0371o.k(AbstractC0103t0.f1120n);
            C0367m c0367mS = C0345b.s(c0371o);
            W wT = C0345b.t(eVar, c0371o);
            UUID uuid = (UUID) P1.P(new Object[0], null, C0610c.f8726r, c0371o, 3072, 6);
            boolean zG = c0371o.g(view) | c0371o.g(cVar);
            Object objH = c0371o.H();
            S s7 = C0363k.f5418a;
            if (zG || objH == s7) {
                s6 = s7;
                lVar = lVar2;
                c0371o2 = c0371o;
                DialogC0617j dialogC0617j = new DialogC0617j(aVar, c0616i, view, lVar, cVar, uuid);
                X.e eVar2 = new X.e(488261145, true, new C0214i0(wT, 1));
                C0615h c0615h = dialogC0617j.f8747w;
                c0615h.setParentCompositionContext(c0367mS);
                c0615h.f8738z.setValue(eVar2);
                c0615h.f8736D = true;
                c0615h.d();
                c0371o2.d0(dialogC0617j);
                objH = dialogC0617j;
            } else {
                c0371o2 = c0371o;
                s6 = s7;
                lVar = lVar2;
            }
            DialogC0617j dialogC0617j2 = (DialogC0617j) objH;
            boolean zI = c0371o2.i(dialogC0617j2);
            Object objH2 = c0371o2.H();
            if (zI || objH2 == s6) {
                objH2 = new C0608a(dialogC0617j2, 0);
                c0371o2.d0(objH2);
            }
            C0345b.c(dialogC0617j2, (B5.c) objH2, c0371o2);
            boolean zI2 = c0371o2.i(dialogC0617j2) | ((i7 & 14) == 4) | ((i7 & 112) == 32) | c0371o2.g(lVar);
            Object objH3 = c0371o2.H();
            if (zI2 || objH3 == s6) {
                M.S s8 = new M.S((b.m) dialogC0617j2, aVar, (Object) c0616i, lVar, 2);
                c0371o2.d0(s8);
                objH3 = s8;
            }
            C0345b.g((B5.a) objH3, c0371o2);
        } else {
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(aVar, c0616i, eVar, i, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(InterfaceC0725m interfaceC0725m, C.A a7, L l7, InterfaceC0010g interfaceC0010g, C0715c c0715c, I i, boolean z5, C1717l c1717l, B5.c cVar, C0371o c0371o, int i7) {
        C.A a8;
        L l8;
        InterfaceC0010g interfaceC0010g2;
        C0715c c0715c2;
        I i8;
        boolean z6;
        C1717l c1717l2;
        int i9;
        I i10;
        C1717l c1717lA;
        InterfaceC0010g interfaceC0010g3;
        L l9;
        c0371o.U(53695811);
        int i11 = i7 | 46869904 | (c0371o.i(cVar) ? 536870912 : 268435456);
        boolean z7 = true;
        if (c0371o.K(i11 & 1, (306783379 & i11) != 306783378)) {
            c0371o.P();
            if ((i7 & 1) == 0 || c0371o.w()) {
                C.s sVar = C.D.f583a;
                Object[] objArr = new Object[0];
                Z.m mVar = C.A.f562w;
                boolean zE = c0371o.e(0) | c0371o.e(0);
                Object objH = c0371o.H();
                Object obj = C0363k.f5418a;
                if (zE || objH == obj) {
                    objH = new C(0);
                    c0371o.d0(objH);
                }
                a7 = (C.A) P1.P(objArr, mVar, (B5.a) objH, c0371o, 0, 4);
                float f = 0;
                L l10 = new L(f, f, f, f);
                C0005b c0005b = AbstractC0012i.f108c;
                C0715c c0715c3 = C0714b.f10073B;
                C1667v c1667vA = t.K.a(c0371o);
                boolean zG = c0371o.g(c1667vA);
                Object objH2 = c0371o.H();
                if (zG || objH2 == obj) {
                    objH2 = new C1793l(c1667vA);
                    c0371o.d0(objH2);
                }
                i9 = i11 & (-238608497);
                c0715c2 = c0715c3;
                i10 = (C1793l) objH2;
                c1717lA = d0.a(c0371o);
                interfaceC0010g3 = c0005b;
                l9 = l10;
            } else {
                c0371o.N();
                i9 = i11 & (-238608497);
                l9 = l7;
                interfaceC0010g3 = interfaceC0010g;
                c0715c2 = c0715c;
                i10 = i;
                z7 = z5;
                c1717lA = c1717l;
            }
            C.A a9 = a7;
            c0371o.q();
            AbstractC1918b.a(interfaceC0725m, a9, l9, i10, z7, c1717lA, c0715c2, interfaceC0010g3, cVar, c0371o, 806907270, (i9 >> 18) & 7168);
            z6 = z7;
            c1717l2 = c1717lA;
            interfaceC0010g2 = interfaceC0010g3;
            l8 = l9;
            i8 = i10;
            a8 = a9;
        } else {
            c0371o.N();
            a8 = a7;
            l8 = l7;
            interfaceC0010g2 = interfaceC0010g;
            c0715c2 = c0715c;
            i8 = i;
            z6 = z5;
            c1717l2 = c1717l;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0062b(interfaceC0725m, a8, l8, interfaceC0010g2, c0715c2, i8, z6, c1717l2, cVar, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(C0468k1 dataObject, C0371o c0371o, int i) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(434109381);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        byte b7 = 0;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Context context = (Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b);
            Object[] objArrCopyOf = Arrays.copyOf(new T1.z[0], 0);
            C0256q c0256q = new C0256q(7, b7);
            J5.i iVar = new J5.i(5, context);
            Z.m mVar = Z.n.f8314a;
            Z.m mVar2 = new Z.m(b7, c0256q, iVar);
            boolean zI = c0371o.i(context);
            Object objH = c0371o.H();
            S s6 = C0363k.f5418a;
            if (zI || objH == s6) {
                objH = new I2.d(6, context);
                c0371o.d0(objH);
            }
            T1.u uVar = (T1.u) P1.P(objArrCopyOf, mVar2, (B5.a) objH, c0371o, 0, 4);
            Object objH2 = c0371o.H();
            if (objH2 == s6) {
                C0458i c0458i = dataObject.f7073d;
                objH2 = C0345b.q(c0458i != null ? c0458i.f7000c : null);
                c0371o.d0(objH2);
            }
            dataObject.f7075e = uVar;
            L0.a(null, null, ((C0213i) c0371o.k(AbstractC0217k.f3553a)).f3522n, 0L, 0.0f, 0.0f, X.k.d(1756323616, new U1.s(uVar, dataObject, (W) objH2), c0371o), c0371o, 12582912, 123);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 16, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(boolean z5, B5.e eVar, C0371o c0371o, int i) {
        int i7;
        c0371o.U(-642000585);
        if ((i & 6) == 0) {
            i7 = (c0371o.h(z5) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= c0371o.i(eVar) ? 32 : 16;
        }
        if ((i7 & 19) == 18 && c0371o.x()) {
            c0371o.N();
        } else {
            W wT = C0345b.t(eVar, c0371o);
            Object objH = c0371o.H();
            Object obj = C0363k.f5418a;
            if (objH == obj) {
                Object c0387x = new C0387x(C0345b.k(c0371o));
                c0371o.d0(c0387x);
                objH = c0387x;
            }
            InterfaceC0261w interfaceC0261w = ((C0387x) objH).f5575q;
            Object objH2 = c0371o.H();
            Object obj2 = objH2;
            if (objH2 == obj) {
                B5.e eVar2 = (B5.e) wT.getValue();
                C0710h c0710h = new C0710h(z5);
                c0710h.f10063d = interfaceC0261w;
                c0710h.f10064e = eVar2;
                c0371o.d0(c0710h);
                obj2 = c0710h;
            }
            C0710h c0710h2 = (C0710h) obj2;
            boolean zG = c0371o.g((B5.e) wT.getValue()) | c0371o.g(interfaceC0261w);
            Object objH3 = c0371o.H();
            if (zG || objH3 == obj) {
                c0710h2.f10064e = (B5.e) wT.getValue();
                c0710h2.f10063d = interfaceC0261w;
                c0371o.d0(C1386y.f15098a);
            }
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zI = ((i7 & 14) == 4) | c0371o.i(c0710h2);
            Object objH4 = c0371o.H();
            if (zI || objH4 == obj) {
                objH4 = new C0711i(c0710h2, z5, null);
                c0371o.d0(objH4);
            }
            C0345b.e((B5.e) objH4, c0371o, boolValueOf);
            b.B bA = AbstractC0707e.a(c0371o);
            if (bA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object objA = bA.a();
            Object obj3 = (InterfaceC0660x) c0371o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zI2 = c0371o.i(objA) | c0371o.i(obj3) | c0371o.i(c0710h2);
            Object objH5 = c0371o.H();
            if (zI2 || objH5 == obj) {
                objH5 = new A.J(objA, obj3, c0710h2, 7);
                c0371o.d0(objH5);
            }
            C0345b.d(obj3, objA, (B5.c) objH5, c0371o);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0712j(z5, eVar, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long g(float f, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(InterfaceC0725m interfaceC0725m, B5.e eVar, C0371o c0371o, int i) {
        int i7;
        c0371o.U(-1177876616);
        if ((i & 6) == 0) {
            i7 = (c0371o.g(interfaceC0725m) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= c0371o.i(eVar) ? 32 : 16;
        }
        if (c0371o.K(i7 & 1, (i7 & 19) != 18)) {
            int i8 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725m);
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            int i9 = (((((i7 << 3) & 112) | (((i7 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, C0611d.f8729a);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i8))) {
                k1.i.o(i8, c0371o, i8, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            eVar.invoke(c0371o, Integer.valueOf((i9 >> 6) & 14));
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0138v(i, 4, interfaceC0725m, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int i(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i7 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i7 << 1) | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final L.i j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof L.i) {
                return (L.i) childAt;
            }
        }
        L.i iVar = new L.i(viewGroup.getContext());
        viewGroup.addView(iVar);
        return iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ViewGroup k(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x001d */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: B5.a */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: B5.a */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: B5.a */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: B5.a */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: B5.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(O5.t r4, B5.a r5, s5.c r6) {
        /*
            boolean r0 = r6 instanceof O5.q
            if (r0 == 0) goto L13
            r0 = r6
            O5.q r0 = (O5.q) r0
            int r1 = r0.f5257s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5257s = r1
            goto L18
        L13:
            O5.q r0 = new O5.q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5256r
            int r1 = r0.f5257s
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.jvm.internal.n r4 = r0.f5255q
            r5 = r4
            B5.a r5 = (B5.a) r5
            m5.AbstractC1362a.e(r6)     // Catch: java.lang.Throwable -> L2a
            goto L69
        L2a:
            r4 = move-exception
            goto L6f
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            m5.AbstractC1362a.e(r6)
            q5.h r6 = r0.getContext()
            M5.t r1 = M5.C0258t.f3885r
            q5.f r6 = r6.get(r1)
            if (r6 != r4) goto L73
            r6 = r5
            kotlin.jvm.internal.n r6 = (kotlin.jvm.internal.n) r6     // Catch: java.lang.Throwable -> L2a
            r0.f5255q = r6     // Catch: java.lang.Throwable -> L2a
            r0.f5257s = r2     // Catch: java.lang.Throwable -> L2a
            M5.h r6 = new M5.h     // Catch: java.lang.Throwable -> L2a
            q5.c r0 = v(r0)     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2a
            r6.s()     // Catch: java.lang.Throwable -> L2a
            O5.r r0 = new O5.r     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            O5.s r4 = (O5.s) r4     // Catch: java.lang.Throwable -> L2a
            r4.e0(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L2a
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r4 != r6) goto L69
            return r6
        L69:
            r5.invoke()
            m5.y r4 = m5.C1386y.f15098a
            return r4
        L6f:
            r5.invoke()
            throw r4
        L73:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.AbstractC1397A.l(O5.t, B5.a, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1425g m(C1425g c1425g) {
        C1423e c1423e = c1425g.f15466q;
        c1423e.b();
        return c1423e.f15461y > 0 ? c1425g : C1425g.f15465r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int n(int i, int i7, int i8) {
        return i < i7 ? i7 : i > i8 ? i8 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    C0.S.s(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    AbstractC1362a.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z5 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        executorService.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1524c p(B5.e eVar, InterfaceC1524c interfaceC1524c, InterfaceC1524c interfaceC1524c2) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        if (eVar instanceof s5.a) {
            return ((s5.a) eVar).create(interfaceC1524c, interfaceC1524c2);
        }
        InterfaceC1529h context = interfaceC1524c2.getContext();
        return context == C1530i.f16022q ? new C1581b(eVar, interfaceC1524c2, interfaceC1524c) : new C1582c(interfaceC1524c2, context, eVar, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static d6.y q(String javaName) {
        kotlin.jvm.internal.m.e(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return d6.y.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return d6.y.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return d6.y.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return d6.y.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return d6.y.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long r(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String s(C3.b context, int i) {
        kotlin.jvm.internal.m.e(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context2 = context.f1185a;
            kotlin.jvm.internal.m.b(context2);
            String resourceName = context2.getResources().getResourceName(i);
            kotlin.jvm.internal.m.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Set t() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static I5.i u(T1.p pVar) {
        kotlin.jvm.internal.m.e(pVar, "<this>");
        return I5.k.R(pVar, new I5.m(14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1524c v(InterfaceC1524c interfaceC1524c) {
        InterfaceC1524c<Object> interfaceC1524cIntercepted;
        kotlin.jvm.internal.m.e(interfaceC1524c, "<this>");
        s5.c cVar = interfaceC1524c instanceof s5.c ? (s5.c) interfaceC1524c : null;
        return (cVar == null || (interfaceC1524cIntercepted = cVar.intercepted()) == null) ? interfaceC1524c : interfaceC1524cIntercepted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long w(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : j0.o.b(j, j0.o.d(j) * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinkedHashSet x(Set set, T1.d dVar) {
        kotlin.jvm.internal.m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.I(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(dVar);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void y(HashMap map, B5.c cVar) {
        int i;
        HashMap map2 = new HashMap(androidx.room.w.MAX_BIND_PARAMETER_CNT);
        loop0: while (true) {
            i = 0;
            for (Object key : map.keySet()) {
                kotlin.jvm.internal.m.d(key, "key");
                map2.put(key, map.get(key));
                i++;
                if (i == 999) {
                    break;
                }
            }
            cVar.invoke(map2);
            map2.clear();
        }
        if (i > 0) {
            cVar.invoke(map2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void z(String str, boolean z5, l3 l3Var) throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("addOnName", str);
        if (z5) {
            jSONObject.put("status", "Active");
        } else {
            jSONObject.put("status", "InActive");
        }
        l3Var.getClass();
        try {
            string = jSONObject.toString();
        } catch (Exception unused) {
            string = "{\"type\":\"RESPONSE_EXCEPTION\"}";
        }
        kotlin.jvm.internal.m.b(string);
        l3Var.f7122l.runOnUiThread(new i3(l3Var, string, 2));
        String str2 = "javascript:console.log(" + jSONObject + ");";
        if (l3Var.f7123m != null) {
            l3Var.f7122l.runOnUiThread(new i3(l3Var, str2, 1));
        }
    }
}
