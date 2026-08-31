package U4;

import A.AbstractC0012i;
import A.AbstractC0017n;
import A.C0022t;
import A.C0023u;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import M.AbstractC0210g0;
import M.I0;
import M.J0;
import M.N0;
import M.q0;
import M.s0;
import M5.AbstractC0263y;
import M5.C0256q;
import M5.InterfaceC0261w;
import O3.C0279e0;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import P.S0;
import P.T0;
import R4.C0448f1;
import R4.C0458i;
import R4.C0464j1;
import R4.C0466k;
import R4.C0468k1;
import R4.F1;
import R4.H0;
import R4.O1;
import a.AbstractC0597a;
import a3.C0632k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.Scheduler;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0717e;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import e.C1014g;
import e3.C1038a;
import e3.C1044g;
import g5.C1092c;
import h5.AbstractC1127b;
import j0.AbstractC1145B;
import j5.C1165b;
import j5.C1167d;
import java.util.Arrays;
import k1.AbstractC1175c;
import m5.C1386y;
import q5.InterfaceC1529h;
import y4.AbstractC1918b;
import z0.C1949i;
import z0.InterfaceC1926C;

/* JADX INFO: renamed from: U4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0534a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X.e f7788a = new X.e(385490479, false, new C0256q(8, (byte) 0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X.e f7789b = new X.e(-1868505512, false, new C0256q(9, (byte) 0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X.e f7790c = new X.e(-815468745, false, new C0256q(10, (byte) 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X.e f7791d = new X.e(-318002838, false, new C0256q(11, (byte) 0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f7792e = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m A(InterfaceC0725m interfaceC0725m, boolean z5) {
        kotlin.jvm.internal.m.e(interfaceC0725m, "<this>");
        int i = Build.VERSION.SDK_INT;
        int i7 = 3;
        return i >= 35 ? !z5 ? AbstractC0727o.a(E3.h.J(interfaceC0725m), new A.d0(i7, 2)) : interfaceC0725m : (i <= 29 || z5) ? interfaceC0725m : AbstractC0727o.a(E3.h.J(interfaceC0725m), new A.d0(i7, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void B(C0468k1 dataObject, long j) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        MainActivity mainActivity = dataObject.f7071c;
        if (dataObject.f7096r == null) {
            AbstractC0263y.t(androidx.lifecycle.X.f(mainActivity), null, null, new h0(j, mainActivity, dataObject, null), 3);
            return;
        }
        T1.u uVar = dataObject.f7075e;
        if (uVar != null) {
            T1.u.b(uVar, "mainScreen");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void C(C0468k1 dataObject) {
        boolean z5;
        boolean z6;
        O1 o12;
        O1 o13;
        O1 o14;
        O1 o15;
        O1 o16;
        O1 o17;
        O1 o18;
        O1 o19;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        C0279e0 c0279e0 = dataObject.f7053M;
        Z.m mVar = new Z.m(dataObject.f7071c);
        C0458i c0458i = dataObject.f7073d;
        boolean z7 = true;
        if ((c0458i != null ? c0458i.f6998a : null) == null) {
            z5 = false;
        } else {
            if (!((c0458i == null || (o19 = c0458i.f6998a) == null) ? false : Boolean.TRUE.equals(o19.f6823e))) {
                if (!mVar.G((c0458i == null || (o18 = c0458i.f6998a) == null) ? null : o18.i, (c0458i == null || (o17 = c0458i.f6998a) == null) ? null : o17.f6824g)) {
                    if ((c0458i == null || (o16 = c0458i.f6998a) == null) ? false : Boolean.TRUE.equals(o16.f6825h)) {
                        if (mVar.G((c0458i == null || (o15 = c0458i.f6998a) == null) ? null : o15.i, (c0458i == null || (o14 = c0458i.f6998a) == null) ? null : o14.f6824g)) {
                        }
                    }
                    z5 = false;
                }
            }
            z5 = true;
        }
        if (z5) {
            Boolean bool = (c0458i == null || (o13 = c0458i.f6998a) == null) ? null : o13.f6825h;
            Integer num = (c0458i == null || (o12 = c0458i.f6998a) == null) ? null : o12.f6824g;
            ((SharedPreferences) mVar.f8313s).edit().putBoolean("showOnAppUpdate", bool != null ? bool.booleanValue() : false).putInt("versionCode", mVar.k()).putInt("version", num != null ? num.intValue() : 1).putInt("lastShowTimeStamp", (int) (System.currentTimeMillis() / ((long) 86400000))).apply();
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            T1.u uVar = dataObject.f7075e;
            kotlin.jvm.internal.m.b(uVar);
            T1.u.b(uVar, "onboardingScreen");
            return;
        }
        if (AbstractC1918b.g(dataObject)) {
            if (dataObject.f7054N != null) {
                return;
            }
            kotlin.jvm.internal.m.k("inAppPurchaseUtil");
            throw null;
        }
        if (c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6994S, Boolean.TRUE) : false) {
            new Handler(Looper.getMainLooper()).postDelayed(new G(dataObject, 1), 0L);
        }
        T1.u uVar2 = dataObject.f7075e;
        kotlin.jvm.internal.m.b(uVar2);
        T1.u.b(uVar2, "mainScreen");
        String str = c0279e0.f4842c;
        if (str != null && str.length() != 0) {
            z7 = false;
        }
        if (z7) {
            return;
        }
        dataObject.f7053M.f4842c = c0279e0.f4842c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(int i, final C0468k1 dataObject, C0371o c0371o, int i7) {
        int i8;
        boolean z5;
        C0448f1 c0448f1;
        Object objA;
        C0448f1 c0448f12;
        C0448f1 c0448f13;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        C0458i c0458i = dataObject.f7073d;
        c0371o.U(-532391213);
        if ((i7 & 6) == 0) {
            i8 = (c0371o.e(i) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0371o.i(dataObject) ? 32 : 16;
        }
        if (c0371o.K(i8 & 1, (i8 & 19) != 18)) {
            C1167d c1167d = dataObject.f7098t;
            String str = null;
            P5.D d5 = c1167d != null ? c1167d.f13875g : null;
            kotlin.jvm.internal.m.b(d5);
            if (((Boolean) C0345b.j(d5, c0371o).getValue()).booleanValue()) {
                z5 = false;
                c0371o.S(842453135);
            } else {
                c0371o.S(847928758);
                Object objH = c0371o.H();
                P.S s6 = C0363k.f5418a;
                if (objH == s6) {
                    String str2 = (c0458i == null || (c0448f13 = c0458i.f) == null) ? null : c0448f13.f6949b;
                    kotlin.jvm.internal.m.b(str2);
                    objH = C0345b.q(str2);
                    c0371o.d0(objH);
                }
                P.W w3 = (P.W) objH;
                Object objH2 = c0371o.H();
                if (objH2 == s6) {
                    if (c0458i != null && (c0448f12 = c0458i.f) != null) {
                        str = c0448f12.f6948a;
                    }
                    kotlin.jvm.internal.m.b(str);
                    objH2 = C0345b.q(str);
                    c0371o.d0(objH2);
                }
                P.W w6 = (P.W) objH2;
                Object objH3 = c0371o.H();
                InterfaceC0725m interfaceC0725mN = C0722j.f10095q;
                if (objH3 == s6) {
                    if (kotlin.jvm.internal.m.a((String) w6.getValue(), "FULL")) {
                        objA = androidx.compose.foundation.layout.c.f9279c;
                    } else if (kotlin.jvm.internal.m.a((String) w6.getValue(), "LARGE")) {
                        float f = 300;
                        objA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(interfaceC0725mN, f), f);
                    } else if (kotlin.jvm.internal.m.a((String) w6.getValue(), "MEDIUM") && kotlin.jvm.internal.m.a((String) w3.getValue(), "RECTANGLE")) {
                        float f7 = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                        objA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(interfaceC0725mN, f7), f7);
                    } else if (kotlin.jvm.internal.m.a((String) w6.getValue(), "MEDIUM") && kotlin.jvm.internal.m.a((String) w3.getValue(), "CIRCULAR")) {
                        float f8 = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                        objA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(interfaceC0725mN, f8), f8);
                    } else if (kotlin.jvm.internal.m.a((String) w6.getValue(), "SMALL") && kotlin.jvm.internal.m.a((String) w3.getValue(), "RECTANGLE")) {
                        float f9 = 120;
                        objA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(interfaceC0725mN, f9), f9);
                    } else if (kotlin.jvm.internal.m.a((String) w6.getValue(), "SMALL") && kotlin.jvm.internal.m.a((String) w3.getValue(), "CIRCULAR")) {
                        float f10 = 120;
                        objA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(interfaceC0725mN, f10), f10);
                    } else {
                        float f11 = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                        objA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(interfaceC0725mN, f11), f11);
                    }
                    objH3 = C0345b.q(objA);
                    c0371o.d0(objH3);
                }
                final P.W w7 = (P.W) objH3;
                if (i < 100) {
                    c0371o.S(849027119);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9279c;
                    InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
                    int i9 = c0371o.f5454P;
                    int i10 = i8;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, fillElement);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d7 = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(d7);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                        k1.i.o(i9, c0371o, i9, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    if ((c0458i == null || (c0448f1 = c0458i.f) == null) ? false : kotlin.jvm.internal.m.a(c0448f1.f6954h, Boolean.TRUE)) {
                        c0371o.S(178694323);
                        s0.b((InterfaceC0725m) w7.getValue(), (kotlin.jvm.internal.m.a((String) w6.getValue(), "FULL") || kotlin.jvm.internal.m.a((String) w6.getValue(), "LARGE")) ? kotlin.jvm.internal.m.a((String) w6.getValue(), "LARGE") ? H.e.a(10) : AbstractC1145B.f13658a : kotlin.jvm.internal.m.a((String) w3.getValue(), "CIRCULAR") ? H.e.f2031a : H.e.a(10), null, s0.e(62, 6), X.k.d(2062748453, new B5.f() { // from class: U4.U
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // B5.f
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                C0023u ElevatedCard = (C0023u) obj;
                                C0371o c0371o2 = (C0371o) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                kotlin.jvm.internal.m.e(ElevatedCard, "$this$ElevatedCard");
                                if (c0371o2.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    AbstractC0534a.b(dataObject, (InterfaceC0725m) w7.getValue(), c0371o2, 0);
                                } else {
                                    c0371o2.N();
                                }
                                return C1386y.f15098a;
                            }
                        }, c0371o), c0371o, 24576);
                        z5 = false;
                        c0371o.p(false);
                    } else {
                        c0371o.S(179365938);
                        InterfaceC0725m interfaceC0725m = (InterfaceC0725m) w7.getValue();
                        if (!kotlin.jvm.internal.m.a((String) w6.getValue(), "FULL") && !kotlin.jvm.internal.m.a((String) w6.getValue(), "LARGE")) {
                            interfaceC0725mN = AbstractC0597a.n(interfaceC0725mN, kotlin.jvm.internal.m.a((String) w3.getValue(), "CIRCULAR") ? H.e.f2031a : H.e.a(10));
                        } else if (kotlin.jvm.internal.m.a((String) w6.getValue(), "LARGE")) {
                            interfaceC0725mN = AbstractC0597a.n(interfaceC0725mN, H.e.a(10));
                        }
                        b(dataObject, interfaceC0725m.d(interfaceC0725mN), c0371o, (i10 >> 3) & 14);
                        z5 = false;
                        c0371o.p(false);
                    }
                    c0371o.p(true);
                } else {
                    z5 = false;
                    c0371o.S(842453135);
                }
                c0371o.p(z5);
            }
            c0371o.p(z5);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new V(i, dataObject, i7, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(C0468k1 dataObject, InterfaceC0725m modifier, C0371o c0371o, int i) {
        C0448f1 c0448f1;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        kotlin.jvm.internal.m.e(modifier, "modifier");
        c0371o.U(-1996240328);
        int i7 = (i & 6) == 0 ? (c0371o.i(dataObject) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= c0371o.g(modifier) ? 32 : 16;
        }
        int i8 = 0;
        if (c0371o.K(i7 & 1, (i7 & 19) != 18)) {
            C0458i c0458i = dataObject.f7073d;
            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(modifier, AbstractC1145B.b(Color.parseColor((c0458i == null || (c0448f1 = c0458i.f) == null) ? null : c0448f1.f6950c)), AbstractC1145B.f13658a);
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
            int i9 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mA);
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                k1.i.o(i9, c0371o, i9, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            e3.p pVar = new e3.p(R.raw.loader_animation);
            c0371o.T(-1248473602);
            e3.u uVar = new e3.u(3, null, 0);
            T0 t02 = AndroidCompositionLocals_androidKt.f9341b;
            Context context = (Context) c0371o.k(t02);
            c0371o.T(1388713953);
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(new e3.o());
                c0371o.d0(objH);
            }
            P.W w3 = (P.W) objH;
            c0371o.p(false);
            c0371o.T(1388714244);
            boolean zG = c0371o.g("__LottieInternalDefaultCacheKey__");
            Object objH2 = c0371o.H();
            if (zG || objH2 == s6) {
                objH2 = E3.h.H(context, pVar, "__LottieInternalDefaultCacheKey__");
                c0371o.d0(objH2);
            }
            c0371o.p(false);
            C0345b.f(pVar, "__LottieInternalDefaultCacheKey__", new e3.v(uVar, context, pVar, w3, null), c0371o);
            e3.o oVar = (e3.o) w3.getValue();
            c0371o.p(false);
            C0632k c0632k = (C0632k) oVar.getValue();
            Boolean bool = Boolean.TRUE;
            c0371o.T(683659508);
            if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
                throw new IllegalArgumentException("Speed must be a finite number. It is 1.0.".toString());
            }
            c0371o.T(2024497114);
            c0371o.T(-610207850);
            Object objH3 = c0371o.H();
            if (objH3 == s6) {
                objH3 = new C1044g();
                c0371o.d0(objH3);
            }
            C1044g c1044g = (C1044g) objH3;
            c0371o.p(false);
            c0371o.p(false);
            c0371o.T(-180606964);
            Object objH4 = c0371o.H();
            if (objH4 == s6) {
                objH4 = C0345b.q(bool);
                c0371o.d0(objH4);
            }
            P.W w6 = (P.W) objH4;
            c0371o.p(false);
            c0371o.T(-180606834);
            Context context2 = (Context) c0371o.k(t02);
            Matrix matrix = n3.i.f15199a;
            float f = 1.0f / Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f);
            c0371o.p(false);
            Object[] objArr = {c0632k, bool, null, Float.valueOf(f), Integer.MAX_VALUE};
            C1038a c1038a = new C1038a(c1044g, c0632k, f, w6, null);
            InterfaceC1529h interfaceC1529hH = c0371o.f5457b.h();
            boolean zG2 = false;
            for (Object obj : Arrays.copyOf(objArr, 5)) {
                zG2 |= c0371o.g(obj);
            }
            Object objH5 = c0371o.H();
            if (zG2 || objH5 == s6) {
                c0371o.d0(new P.P(interfaceC1529hH, c1038a));
            }
            c0371o.p(false);
            D5.a.e((C0632k) oVar.getValue(), ((Number) c1044g.getValue()).floatValue(), androidx.compose.foundation.layout.c.f9279c, c0371o, 384);
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new X(i, i8, dataObject, modifier);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(C0468k1 dataObject, C0371o c0371o, int i) {
        C0371o c0371o2;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(-1607706214);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            P.W wJ = C0345b.j(dataObject.f7098t.f13886t, c0371o);
            FillElement fillElement = androidx.compose.foundation.layout.c.f9277a;
            boolean zI = c0371o.i(dataObject) | c0371o.g(wJ);
            Object objH = c0371o.H();
            if (zI || objH == C0363k.f5418a) {
                objH = new N5.d(6, dataObject, wJ);
                c0371o.d0(objH);
            }
            c0371o2 = c0371o;
            androidx.compose.ui.viewinterop.a.b((B5.c) objH, fillElement, null, c0371o2, 48, 4);
        } else {
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 4, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(C0468k1 dataObject, C0371o c0371o, int i) {
        int i7;
        C0448f1 c0448f1;
        C0448f1 c0448f12;
        C0448f1 c0448f13;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        C0458i c0458i = dataObject.f7073d;
        c0371o.U(1594406390);
        if ((i & 6) == 0) {
            i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            C0722j c0722j = C0722j.f10095q;
            String str = null;
            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.c(c0722j, 50), H.e.f2031a), AbstractC1145B.b(Color.parseColor((c0458i == null || (c0448f13 = c0458i.f) == null) ? null : c0448f13.f6953g)), AbstractC1145B.f13658a);
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
            int i8 = c0371o.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mA);
            InterfaceC0046k.f452a.getClass();
            B0.D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i8))) {
                k1.i.o(i8, c0371o, i8, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            float f = 25;
            InterfaceC0725m interfaceC0725mA2 = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.e(c0722j, f), f);
            float f7 = 3;
            long jB = AbstractC1145B.b(Color.parseColor((c0458i == null || (c0448f12 = c0458i.f) == null) ? null : c0448f12.f));
            if (c0458i != null && (c0448f1 = c0458i.f) != null) {
                str = c0448f1.f6953g;
            }
            q0.a(interfaceC0725mA2, jB, f7, AbstractC1145B.b(Color.parseColor(str)), 1, c0371o, 390);
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(dataObject, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(int i, C0468k1 dataObject, C0371o c0371o, int i7) {
        int i8;
        C0371o c0371o2;
        C0448f1 c0448f1;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(-315194060);
        if ((i7 & 6) == 0) {
            i8 = (c0371o.e(i) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0371o.i(dataObject) ? 32 : 16;
        }
        if (c0371o.K(i8 & 1, (i8 & 19) != 18)) {
            C1167d c1167d = dataObject.f7098t;
            P5.D d5 = c1167d != null ? c1167d.f13875g : null;
            kotlin.jvm.internal.m.b(d5);
            P.W wJ = C0345b.j(d5, c0371o);
            Configuration configuration = (Configuration) c0371o.k(AndroidCompositionLocals_androidKt.f9340a);
            if (((Boolean) wJ.getValue()).booleanValue()) {
                c0371o2 = c0371o;
                c0371o2.S(-1150758002);
            } else {
                c0371o.S(-1147401818);
                if (i < 100) {
                    c0371o.S(-1147355876);
                    InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9279c, 0.0f, configuration.orientation == 1 ? Scheduler.MAX_GREEDY_SCHEDULER_LIMIT : 100, 0.0f, 0.0f, 13);
                    InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10077r, false);
                    int i9 = c0371o.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d7 = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(d7);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                        k1.i.o(i9, c0371o, i9, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    C0458i c0458i = dataObject.f7073d;
                    if ((c0458i == null || (c0448f1 = c0458i.f) == null) ? false : kotlin.jvm.internal.m.a(c0448f1.f6954h, Boolean.TRUE)) {
                        c0371o.S(-1816605532);
                        c0371o2 = c0371o;
                        s0.b(androidx.compose.foundation.layout.c.c(C0722j.f10095q, 50), H.e.f2031a, null, s0.e(62, 6), X.k.d(-2015021690, new W(dataObject, 0), c0371o), c0371o2, 24582);
                        c0371o2.p(false);
                    } else {
                        c0371o2 = c0371o;
                        c0371o2.S(495598741);
                        d(dataObject, c0371o2, (i8 >> 3) & 14);
                        c0371o2.p(false);
                    }
                    c0371o2.p(true);
                } else {
                    c0371o2 = c0371o;
                    c0371o2.S(-1150758002);
                }
                c0371o2.p(false);
            }
            c0371o2.p(false);
        } else {
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new V(i, dataObject, i7, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(C0468k1 dataObject, C0371o c0371o, int i) {
        R4.G g7;
        R4.D d5;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(1136920906);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            Object obj = C0363k.f5418a;
            if (objH == obj) {
                objH = C0345b.q(Boolean.FALSE);
                c0371o.d0(objH);
            }
            P.W w3 = (P.W) objH;
            Object objH2 = c0371o.H();
            if (objH2 == obj) {
                objH2 = C0345b.q(null);
                c0371o.d0(objH2);
            }
            P.W w6 = (P.W) objH2;
            Object objH3 = c0371o.H();
            if (objH3 == obj) {
                C0458i c0458i = dataObject.f7073d;
                objH3 = C0345b.q((c0458i == null || (g7 = c0458i.f7007m) == null || (d5 = g7.f6759b) == null) ? null : d5.f6744d);
                c0371o.d0(objH3);
            }
            P.W w7 = (P.W) objH3;
            C1167d c1167d = dataObject.f7098t;
            P5.S s6 = c1167d != null ? c1167d.f13879m : null;
            kotlin.jvm.internal.m.b(s6);
            P.W wJ = C0345b.j(s6, c0371o);
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(dataObject);
            Object objH4 = c0371o.H();
            if (zI || objH4 == obj) {
                objH4 = new C0540g(dataObject, w3, w6, null);
                c0371o.d0(objH4);
            }
            C0345b.e((B5.e) objH4, c0371o, bool);
            if (((C0717e) w6.getValue()) == null || !(kotlin.jvm.internal.m.a((C0717e) w6.getValue(), C0714b.f10084y) || kotlin.jvm.internal.m.a((C0717e) w6.getValue(), C0714b.f10082w))) {
                c0371o.S(-102835912);
            } else {
                c0371o.S(-99694713);
                Boolean bool2 = (Boolean) wJ.getValue();
                bool2.getClass();
                boolean zG = c0371o.g(wJ);
                Object objH5 = c0371o.H();
                if (zG || objH5 == obj) {
                    objH5 = new C0541h(wJ, w3, null);
                    c0371o.d0(objH5);
                }
                C0345b.e((B5.e) objH5, c0371o, bool2);
            }
            c0371o.p(false);
            if (!((Boolean) w3.getValue()).booleanValue() || ((C0717e) w6.getValue()) == null) {
                c0371o.S(-102835912);
            } else {
                c0371o.S(-99458648);
                float f = 7;
                InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9279c, f, 0.0f, f, 10, 2);
                C0717e c0717e = (C0717e) w6.getValue();
                kotlin.jvm.internal.m.b(c0717e);
                InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(c0717e, false);
                int i8 = c0371o.f5454P;
                InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD);
                InterfaceC0046k.f452a.getClass();
                B5.a aVar = C0045j.f445b;
                c0371o.W();
                if (c0371o.f5453O) {
                    c0371o.l(aVar);
                } else {
                    c0371o.g0();
                }
                C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                C0044i c0044i = C0045j.f;
                if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i8))) {
                    k1.i.o(i8, c0371o, i8, c0044i);
                }
                C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                boolean zI2 = c0371o.i(dataObject);
                Object objH6 = c0371o.H();
                if (zI2 || objH6 == obj) {
                    objH6 = new C0464j1(dataObject, 1);
                    c0371o.d0(objH6);
                }
                s0.c((B5.a) objH6, AbstractC0597a.n(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.c(androidx.compose.ui.layout.a.b(), 56), j0.o.f, AbstractC1145B.f13658a), H.e.a(3)), false, null, X.k.d(-956096587, new C0538e(w7, dataObject), c0371o), c0371o, 196608, 28);
                c0371o.p(true);
            }
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 1, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(C0468k1 dataObject, C0371o c0371o, int i) {
        boolean z5;
        C0371o c0371o2 = c0371o;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o2.U(-1106707780);
        int i7 = i | (c0371o2.i(dataObject) ? 4 : 2);
        if (c0371o2.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o2.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(new C1092c(dataObject));
                c0371o2.d0(objH);
            }
            P.W w3 = (P.W) objH;
            Object objH2 = c0371o2.H();
            if (objH2 == s6) {
                objH2 = C0345b.q("");
                c0371o2.d0(objH2);
            }
            P.W w6 = (P.W) objH2;
            Object objH3 = c0371o2.H();
            if (objH3 == s6) {
                objH3 = C0345b.q(Boolean.FALSE);
                c0371o2.d0(objH3);
            }
            P.W w7 = (P.W) objH3;
            Boolean bool = Boolean.TRUE;
            Object objH4 = c0371o2.H();
            if (objH4 == s6) {
                objH4 = new C0544k(w3, w6, w7, null);
                c0371o2.d0(objH4);
            }
            C0345b.e((B5.e) objH4, c0371o2, bool);
            if (((Boolean) w7.getValue()).booleanValue()) {
                c0371o2.S(-1761746290);
                InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.f9279c, 0.0f, 0.0f, 0.0f, 15, 7);
                InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10083x, false);
                int i8 = c0371o2.f5454P;
                InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
                InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mD);
                InterfaceC0046k.f452a.getClass();
                B0.D d5 = C0045j.f445b;
                c0371o2.W();
                if (c0371o2.f5453O) {
                    c0371o2.l(d5);
                } else {
                    c0371o2.g0();
                }
                C0044i c0044i = C0045j.f448e;
                C0345b.u(c0044i, c0371o2, interfaceC1926CD);
                C0044i c0044i2 = C0045j.f447d;
                C0345b.u(c0044i2, c0371o2, interfaceC0360i0M);
                C0044i c0044i3 = C0045j.f;
                if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i8))) {
                    k1.i.o(i8, c0371o2, i8, c0044i3);
                }
                C0044i c0044i4 = C0045j.f446c;
                C0345b.u(c0044i4, c0371o2, interfaceC0725mC);
                C0722j c0722j = C0722j.f10095q;
                InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.a(c0722j, 35), H.e.a(60)), j0.o.f13719c, AbstractC1145B.f13658a);
                InterfaceC1926C interfaceC1926CD2 = AbstractC0017n.d(C0714b.f10080u, false);
                int i9 = c0371o2.f5454P;
                InterfaceC0360i0 interfaceC0360i0M2 = c0371o2.m();
                InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o2, interfaceC0725mA);
                c0371o2.W();
                if (c0371o2.f5453O) {
                    c0371o2.l(d5);
                } else {
                    c0371o2.g0();
                }
                C0345b.u(c0044i, c0371o2, interfaceC1926CD2);
                C0345b.u(c0044i2, c0371o2, interfaceC0360i0M2);
                if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i9))) {
                    k1.i.o(i9, c0371o2, i9, c0044i3);
                }
                C0345b.u(c0044i4, c0371o2, interfaceC0725mC2);
                float f = 20;
                InterfaceC0725m interfaceC0725mD2 = androidx.compose.foundation.layout.b.d(c0722j, f, 0.0f, f, 0.0f, 10);
                A.Q qA = A.O.a(AbstractC0012i.f106a, C0714b.f10085z, c0371o2, 0);
                int i10 = c0371o2.f5454P;
                InterfaceC0360i0 interfaceC0360i0M3 = c0371o2.m();
                InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o2, interfaceC0725mD2);
                c0371o2.W();
                if (c0371o2.f5453O) {
                    c0371o2.l(d5);
                } else {
                    c0371o2.g0();
                }
                C0345b.u(c0044i, c0371o2, qA);
                C0345b.u(c0044i2, c0371o2, interfaceC0360i0M3);
                if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i10))) {
                    k1.i.o(i10, c0371o2, i10, c0044i3);
                }
                C0345b.u(c0044i4, c0371o2, interfaceC0725mC3);
                N0.b((String) w6.getValue(), androidx.compose.foundation.layout.c.h(), 0L, 0L, null, 0L, new V0.k(3), 0L, 0, false, 0, 0, null, c0371o, 48, 0, 130556);
                long j = j0.o.f13721e;
                InterfaceC0725m interfaceC0725mD3 = androidx.compose.foundation.layout.b.d(c0722j, 5, 0.0f, 0.0f, 0.0f, 14);
                Object objH5 = c0371o.H();
                if (objH5 == s6) {
                    objH5 = new C0545l(0, w3, w7);
                    c0371o.d0(objH5);
                }
                N0.b("Open", v0.u.a(interfaceC0725mD3, C1386y.f15098a, (PointerInputEventHandler) objH5), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 390, 0, 131064);
                c0371o2 = c0371o;
                c0371o2.p(true);
                c0371o2.p(true);
                c0371o2.p(true);
                z5 = false;
            } else {
                z5 = false;
                c0371o2.S(-1763859002);
            }
            c0371o2.p(z5);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 2, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(R4.C0468k1 r19, P.C0371o r20, int r21) {
        /*
            r1 = r19
            r7 = r20
            r8 = r21
            java.lang.String r0 = "dataObject"
            kotlin.jvm.internal.m.e(r1, r0)
            com.web2native.MainActivity r9 = r1.f7067a
            r0 = -1227066668(0xffffffffb6dc72d4, float:-6.5698787E-6)
            r7.U(r0)
            boolean r0 = r7.i(r1)
            r2 = 2
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r0 = r0 | r8
            r3 = r0 & 3
            r10 = 1
            r11 = 0
            if (r3 == r2) goto L26
            r2 = r10
            goto L27
        L26:
            r2 = r11
        L27:
            r0 = r0 & r10
            boolean r0 = r7.K(r0, r2)
            if (r0 == 0) goto L25e
            j5.d r0 = r1.f7098t
            P5.S r0 = r0.f13881o
            P.C0345b.j(r0, r7)
            java.lang.Object r0 = r7.H()
            r2 = 0
            P.S r12 = P.C0363k.f5418a
            if (r0 != r12) goto L45
            P.f0 r0 = P.C0345b.q(r2)
            r7.d0(r0)
        L45:
            r3 = r0
            P.W r3 = (P.W) r3
            P.T0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9341b
            java.lang.Object r0 = r7.k(r0)
            r4 = r0
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r7.H()
            if (r0 != r12) goto L69
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            r5 = 2131492910(0x7f0c002e, float:1.8609285E38)
            android.view.View r0 = r0.inflate(r5, r2)
            P.f0 r0 = P.C0345b.q(r0)
            r7.d0(r0)
        L69:
            P.W r0 = (P.W) r0
            java.lang.Object r5 = r7.H()
            if (r5 != r12) goto L7a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            P.f0 r5 = P.C0345b.q(r5)
            r7.d0(r5)
        L7a:
            P.W r5 = (P.W) r5
            java.lang.Object r6 = r7.H()
            if (r6 != r12) goto L96
            int r6 = android.os.Build.VERSION.SDK_INT
            r13 = 35
            if (r6 < r13) goto L8a
            r6 = r10
            goto L8b
        L8a:
            r6 = r11
        L8b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            P.f0 r6 = P.C0345b.q(r6)
            r7.d0(r6)
        L96:
            r13 = r6
            P.W r13 = (P.W) r13
            P.T0 r6 = C0.AbstractC0103t0.f1116h
            java.lang.Object r6 = r7.k(r6)
            W0.c r6 = (W0.c) r6
            r6 = -1075670389(0xffffffffbfe2928b, float:-1.7700971)
            r7.S(r6)
            r7.p(r11)
            P.T0 r6 = C0.AbstractC0103t0.f1120n
            java.lang.Object r6 = r7.k(r6)
            W0.l r6 = (W0.l) r6
            r6 = -1075473973(0xffffffffbfe591cb, float:-1.7935117)
            r7.S(r6)
            r7.p(r11)
            r6 = -1075332117(0xffffffffbfe7bbeb, float:-1.8104223)
            r7.S(r6)
            r7.p(r11)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r14 = r7.i(r1)
            java.lang.Object r15 = r7.H()
            if (r14 != 0) goto Ld2
            if (r15 != r12) goto Lda
        Ld2:
            U4.p r15 = new U4.p
            r15.<init>(r1, r2)
            r7.d0(r15)
        Lda:
            B5.e r15 = (B5.e) r15
            P.C0345b.e(r15, r7, r6)
            boolean r2 = r7.i(r1)
            boolean r6 = r7.i(r4)
            r2 = r2 | r6
            java.lang.Object r6 = r7.H()
            if (r2 != 0) goto Lf0
            if (r6 != r12) goto Lf2
        Lf0:
            r2 = r0
            goto Lf7
        Lf2:
            r2 = r0
            r14 = r3
            r0 = r6
            r6 = r1
            goto L102
        Lf7:
            U4.s r0 = new U4.s
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = r1
            r14 = r3
            r7.d0(r0)
        L102:
            B5.e r0 = (B5.e) r0
            m5.y r1 = m5.C1386y.f15098a
            P.C0345b.e(r0, r7, r1)
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L255
            r0 = -1069215195(0xffffffffc0451225, float:-3.0792325)
            r7.S(r0)
            androidx.compose.foundation.layout.FillElement r1 = androidx.compose.foundation.layout.c.f9279c
            c0.e r0 = c0.C0714b.f10076q
            z0.C r0 = A.AbstractC0017n.d(r0, r11)
            int r3 = r7.f5454P
            P.i0 r4 = r7.m()
            c0.m r5 = c0.AbstractC0727o.c(r7, r1)
            B0.j r15 = B0.InterfaceC0046k.f452a
            r15.getClass()
            B0.D r15 = B0.C0045j.f445b
            r7.W()
            boolean r11 = r7.f5453O
            if (r11 == 0) goto L13f
            r7.l(r15)
            goto L142
        L13f:
            r7.g0()
        L142:
            B0.i r11 = B0.C0045j.f448e
            P.C0345b.u(r11, r7, r0)
            B0.i r0 = B0.C0045j.f447d
            P.C0345b.u(r0, r7, r4)
            B0.i r4 = B0.C0045j.f
            boolean r10 = r7.f5453O
            if (r10 != 0) goto L163
            java.lang.Object r10 = r7.H()
            r16 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = kotlin.jvm.internal.m.a(r10, r1)
            if (r1 != 0) goto L168
            goto L165
        L163:
            r16 = r1
        L165:
            k1.i.o(r3, r7, r3, r4)
        L168:
            B0.i r1 = B0.C0045j.f446c
            P.C0345b.u(r1, r7, r5)
            c0.j r3 = c0.C0722j.f10095q
            r5 = 1
            c0.m r3 = A(r3, r5)
            A.b r5 = A.AbstractC0012i.f108c
            c0.c r10 = c0.C0714b.f10073B
            r17 = r9
            r9 = 0
            A.t r5 = A.r.a(r5, r10, r7, r9)
            int r9 = r7.f5454P
            P.i0 r10 = r7.m()
            c0.m r3 = c0.AbstractC0727o.c(r7, r3)
            r7.W()
            r18 = r13
            boolean r13 = r7.f5453O
            if (r13 == 0) goto L196
            r7.l(r15)
            goto L199
        L196:
            r7.g0()
        L199:
            P.C0345b.u(r11, r7, r5)
            P.C0345b.u(r0, r7, r10)
            boolean r0 = r7.f5453O
            if (r0 != 0) goto L1b1
            java.lang.Object r0 = r7.H()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r5)
            if (r0 != 0) goto L1b4
        L1b1:
            k1.i.o(r9, r7, r9, r4)
        L1b4:
            P.C0345b.u(r1, r7, r3)
            java.lang.Object r0 = r7.H()
            if (r0 != r12) goto L1c6
            U4.m r0 = new U4.m
            r1 = 0
            r0.<init>(r2, r1)
            r7.d0(r0)
        L1c6:
            B5.c r0 = (B5.c) r0
            r4 = 54
            r5 = 4
            r2 = 0
            r3 = r7
            r1 = r16
            androidx.compose.ui.viewinterop.a.b(r0, r1, r2, r3, r4, r5)
            r5 = 1
            r3.p(r5)
            java.lang.Object r0 = r18.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22b
            r0 = -1420809328(0xffffffffab502b90, float:-7.39569E-13)
            r3.S(r0)
            r4 = 0
            r5 = 7
            r0 = 0
            r1 = 0
            r2 = 0
            t(r0, r1, r2, r3, r4, r5)
            r9 = 0
            float r0 = (float) r9
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r0 / r1
            java.lang.String r2 = "BOTTOM"
            r4 = 3126(0xc36, float:4.38E-42)
            l(r9, r2, r1, r3, r4)
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r0 / r1
            java.lang.String r2 = "START"
            l(r9, r2, r1, r3, r4)
            android.content.res.Resources r1 = r17.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 / r1
            java.lang.String r1 = "END"
            l(r9, r1, r0, r3, r4)
        L226:
            r3.p(r9)
            r5 = 1
            goto L233
        L22b:
            r9 = 0
            r0 = -1430251153(0xffffffffaac0196f, float:-3.41237E-13)
            r3.S(r0)
            goto L226
        L233:
            r3.p(r5)
            boolean r0 = r3.i(r6)
            java.lang.Object r1 = r3.H()
            if (r0 != 0) goto L242
            if (r1 != r12) goto L24b
        L242:
            U4.n r1 = new U4.n
            r0 = 0
            r1.<init>(r14, r6, r0)
            r3.d0(r1)
        L24b:
            B5.a r1 = (B5.a) r1
            r9 = 0
            l6.d.d(r9, r1, r3, r9)
        L251:
            r3.p(r9)
            goto L263
        L255:
            r3 = r7
            r9 = r11
            r0 = -1078323026(0xffffffffbfba18ae, float:-1.4538782)
            r3.S(r0)
            goto L251
        L25e:
            r6 = r1
            r3 = r7
            r3.N()
        L263:
            P.o0 r0 = r3.r()
            if (r0 == 0) goto L271
            R4.H0 r1 = new R4.H0
            r2 = 3
            r1.<init>(r8, r2, r6)
            r0.f5482d = r1
        L271:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.AbstractC0534a.h(R4.k1, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(final C0468k1 dataObject, final C1165b viewModel, C0371o c0371o, int i) {
        boolean z5;
        C0371o c0371o2 = c0371o;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        kotlin.jvm.internal.m.e(viewModel, "viewModel");
        c0371o2.U(-1363450033);
        int i7 = i | (c0371o2.i(dataObject) ? 4 : 2) | (c0371o2.i(viewModel) ? 32 : 16);
        if (c0371o2.K(i7 & 1, (i7 & 19) != 18)) {
            P.W wJ = C0345b.j(viewModel.f, c0371o2);
            final P.W wJ2 = C0345b.j(viewModel.f13858g, c0371o2);
            final P.W wJ3 = C0345b.j(viewModel.f13859h, c0371o2);
            final P.W wJ4 = C0345b.j(viewModel.i, c0371o2);
            Object objH = c0371o2.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(Boolean.FALSE);
                c0371o2.d0(objH);
            }
            final P.W w3 = (P.W) objH;
            final I0 i0F = s0.f(((Boolean) wJ.getValue()).booleanValue() ? J0.f3324r : J0.f3323q, c0371o2);
            Object objH2 = c0371o2.H();
            if (objH2 == s6) {
                objH2 = C0345b.k(c0371o2);
                c0371o2.d0(objH2);
            }
            final InterfaceC0261w interfaceC0261w = (InterfaceC0261w) objH2;
            if (((Boolean) wJ.getValue()).booleanValue()) {
                c0371o2.S(-1033185443);
                Boolean bool = Boolean.TRUE;
                boolean zI = c0371o2.i(interfaceC0261w) | c0371o2.g(i0F);
                Object objH3 = c0371o2.H();
                if (zI || objH3 == s6) {
                    objH3 = new C0557y(interfaceC0261w, i0F, null);
                    c0371o2.d0(objH3);
                }
                C0345b.e((B5.e) objH3, c0371o2, bool);
                boolean zI2 = c0371o2.i(viewModel) | c0371o2.i(dataObject);
                Object objH4 = c0371o2.H();
                if (zI2 || objH4 == s6) {
                    objH4 = new B5.a() { // from class: U4.t
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // B5.a
                        public final Object invoke() {
                            ValueCallback valueCallback;
                            viewModel.d();
                            boolean zBooleanValue = ((Boolean) w3.getValue()).booleanValue();
                            C0468k1 c0468k1 = dataObject;
                            if (!zBooleanValue && (valueCallback = c0468k1.f7059S.f13162q) != null) {
                                valueCallback.onReceiveValue(null);
                            }
                            c0468k1.f7059S.f13162q = null;
                            return C1386y.f15098a;
                        }
                    };
                    c0371o2.d0(objH4);
                }
                AbstractC0210g0.a((B5.a) objH4, null, i0F, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, X.k.d(-1385183161, new B5.f() { // from class: U4.u
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        B0.D d5;
                        C0044i c0044i;
                        C0468k1 c0468k1;
                        final InterfaceC0261w interfaceC0261w2;
                        I0 i02;
                        P.S s7;
                        C0722j c0722j;
                        S0 s02;
                        C0717e c0717e;
                        boolean z6;
                        C1165b c1165b;
                        boolean z7;
                        int i8;
                        C0468k1 c0468k12;
                        C0553u c0553u;
                        S0 s03;
                        final C1165b c1165b2;
                        InterfaceC0261w interfaceC0261w3;
                        I0 i03;
                        P.S s8;
                        C0722j c0722j2;
                        boolean z8;
                        boolean z9;
                        C0717e c0717e2;
                        boolean z10;
                        C0468k1 c0468k13;
                        final InterfaceC0261w interfaceC0261w4;
                        I0 i04;
                        P.S s9;
                        C0722j c0722j3;
                        boolean z11;
                        boolean z12;
                        P.S s10;
                        final C0468k1 c0468k14;
                        final I0 i05;
                        P.S s11;
                        final I0 i06;
                        final InterfaceC0261w interfaceC0261w5;
                        C0468k1 c0468k15;
                        P.S s12;
                        final C0468k1 c0468k16;
                        final I0 i07;
                        C0023u ModalBottomSheet = (C0023u) obj;
                        C0371o c0371o3 = (C0371o) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        C0717e c0717e3 = C0714b.f10080u;
                        kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                        if (c0371o3.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                            FillElement fillElement = androidx.compose.foundation.layout.c.f9277a;
                            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.a(fillElement, Scheduler.MAX_GREEDY_SCHEDULER_LIMIT), 16);
                            C0022t c0022tA = A.r.a(AbstractC0012i.f108c, C0714b.f10073B, c0371o3, 0);
                            int i9 = c0371o3.f5454P;
                            InterfaceC0360i0 interfaceC0360i0M = c0371o3.m();
                            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o3, interfaceC0725mA);
                            InterfaceC0046k.f452a.getClass();
                            B0.D d7 = C0045j.f445b;
                            c0371o3.W();
                            if (c0371o3.f5453O) {
                                c0371o3.l(d7);
                            } else {
                                c0371o3.g0();
                            }
                            C0044i c0044i2 = C0045j.f448e;
                            C0345b.u(c0044i2, c0371o3, c0022tA);
                            C0044i c0044i3 = C0045j.f447d;
                            C0345b.u(c0044i3, c0371o3, interfaceC0360i0M);
                            C0044i c0044i4 = C0045j.f;
                            if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i9))) {
                                k1.i.o(i9, c0371o3, i9, c0044i4);
                            }
                            C0044i c0044i5 = C0045j.f446c;
                            C0345b.u(c0044i5, c0371o3, interfaceC0725mC);
                            N0.b("Choose an action", androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.b.d(fillElement, 10, 0.0f, 0.0f, 0.0f, 14), 41), j0.o.f13718b, AbstractC0836n2.y(20), null, 0L, null, 0L, 0, false, 0, 0, null, c0371o3, 3510, 0, 131056);
                            InterfaceC0725m interfaceC0725mA2 = androidx.compose.foundation.layout.c.a(fillElement, 70);
                            A.Q qA = A.O.a(AbstractC0012i.f106a, C0714b.f10085z, c0371o3, 0);
                            int i10 = c0371o3.f5454P;
                            InterfaceC0360i0 interfaceC0360i0M2 = c0371o3.m();
                            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o3, interfaceC0725mA2);
                            c0371o3.W();
                            if (c0371o3.f5453O) {
                                d5 = d7;
                                c0371o3.l(d5);
                            } else {
                                d5 = d7;
                                c0371o3.g0();
                            }
                            C0345b.u(c0044i2, c0371o3, qA);
                            C0345b.u(c0044i3, c0371o3, interfaceC0360i0M2);
                            if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i10))) {
                                c0044i = c0044i4;
                                k1.i.o(i10, c0371o3, i10, c0044i);
                            } else {
                                c0044i = c0044i4;
                            }
                            C0345b.u(c0044i5, c0371o3, interfaceC0725mC2);
                            S0 s04 = wJ2;
                            boolean zBooleanValue = ((Boolean) s04.getValue()).booleanValue();
                            final C1165b c1165b3 = viewModel;
                            C0468k1 c0468k17 = dataObject;
                            InterfaceC0261w interfaceC0261w6 = interfaceC0261w;
                            I0 i08 = i0F;
                            final P.W w6 = w3;
                            P.S s13 = C0363k.f5418a;
                            C0722j c0722j4 = C0722j.f10095q;
                            if (zBooleanValue) {
                                c0371o3.S(-771289231);
                                s02 = s04;
                                InterfaceC0725m interfaceC0725mD = A.S.a().d(androidx.compose.foundation.layout.c.f9278b);
                                InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(c0717e3, false);
                                int i11 = c0371o3.f5454P;
                                c0717e = c0717e3;
                                InterfaceC0360i0 interfaceC0360i0M3 = c0371o3.m();
                                InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o3, interfaceC0725mD);
                                c0371o3.W();
                                if (c0371o3.f5453O) {
                                    c0371o3.l(d5);
                                } else {
                                    c0371o3.g0();
                                }
                                C0345b.u(c0044i2, c0371o3, interfaceC1926CD);
                                C0345b.u(c0044i3, c0371o3, interfaceC0360i0M3);
                                if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i11))) {
                                    k1.i.o(i11, c0371o3, i11, c0044i);
                                }
                                C0345b.u(c0044i5, c0371o3, interfaceC0725mC3);
                                InterfaceC0725m interfaceC0725mC4 = androidx.compose.foundation.layout.c.c(c0722j4, 50);
                                boolean zI3 = c0371o3.i(c1165b3) | c0371o3.i(c0468k17) | c0371o3.i(interfaceC0261w6) | c0371o3.g(i08);
                                Object objH5 = c0371o3.H();
                                if (zI3) {
                                    s12 = s13;
                                } else {
                                    s12 = s13;
                                    if (objH5 != s12) {
                                        c1165b = c1165b3;
                                        c0468k16 = c0468k17;
                                        interfaceC0261w2 = interfaceC0261w6;
                                        i07 = i08;
                                    }
                                    s7 = s12;
                                    c0722j = c0722j4;
                                    i02 = i07;
                                    i8 = -775480555;
                                    c0468k1 = c0468k16;
                                    s0.c((B5.a) objH5, interfaceC0725mC4, false, null, AbstractC0534a.f7788a, c0371o3, 196656, 28);
                                    z6 = true;
                                    c0371o3.p(true);
                                    z7 = false;
                                }
                                final int i12 = 0;
                                c0468k16 = c0468k17;
                                interfaceC0261w2 = interfaceC0261w6;
                                i07 = i08;
                                objH5 = new B5.a() { // from class: U4.v
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // B5.a
                                    public final Object invoke() {
                                        switch (i12) {
                                            case 0:
                                                C1165b c1165b4 = c1165b3;
                                                c1165b4.d();
                                                P.W w7 = w6;
                                                AbstractC0534a.j(w7, true);
                                                C0468k1 c0468k18 = c0468k16;
                                                WebView webView = c0468k18.f7084k;
                                                kotlin.jvm.internal.m.b(webView);
                                                boolean z13 = AbstractC1175c.a(webView.getContext(), "android.permission.CAMERA") == 0;
                                                g5.h hVar = c0468k18.f7059S;
                                                if (z13) {
                                                    hVar.f13155h.u("image");
                                                } else {
                                                    hVar.f13157l.u("android.permission.CAMERA");
                                                }
                                                AbstractC0263y.t(interfaceC0261w2, null, null, new C0558z(i07, c0468k18, w7, null), 3);
                                                c1165b4.d();
                                                c1165b4.g();
                                                c1165b4.f();
                                                break;
                                            case 1:
                                                C1165b c1165b5 = c1165b3;
                                                c1165b5.d();
                                                P.W w8 = w6;
                                                AbstractC0534a.j(w8, true);
                                                C0468k1 c0468k19 = c0468k16;
                                                WebView webView2 = c0468k19.f7084k;
                                                kotlin.jvm.internal.m.b(webView2);
                                                boolean z14 = AbstractC1175c.a(webView2.getContext(), "android.permission.CAMERA") == 0;
                                                g5.h hVar2 = c0468k19.f7059S;
                                                if (z14) {
                                                    hVar2.f13155h.u("video");
                                                } else {
                                                    hVar2.f13157l.u("android.permission.CAMERA");
                                                }
                                                AbstractC0263y.t(interfaceC0261w2, null, null, new A(i07, c0468k19, w8, null), 3);
                                                c1165b5.d();
                                                c1165b5.g();
                                                c1165b5.f();
                                                break;
                                            default:
                                                C1165b c1165b6 = c1165b3;
                                                c1165b6.d();
                                                P.W w9 = w6;
                                                AbstractC0534a.j(w9, true);
                                                C0468k1 c0468k110 = c0468k16;
                                                WebView webView3 = c0468k110.f7084k;
                                                g5.h hVar3 = c0468k110.f7059S;
                                                kotlin.jvm.internal.m.b(webView3);
                                                if (AbstractC1175c.a(webView3.getContext(), "android.permission.RECORD_AUDIO") == 0) {
                                                    try {
                                                        hVar3.i.u("audio");
                                                    } catch (Exception unused) {
                                                        ValueCallback valueCallback = hVar3.f13162q;
                                                        if (valueCallback != null) {
                                                            valueCallback.onReceiveValue(null);
                                                        }
                                                        Toast.makeText(c0468k110.f7071c, "No voice recorder application found on device.", 1).show();
                                                    }
                                                } else {
                                                    C1014g c1014g = hVar3.f13160o;
                                                    if (c1014g != null) {
                                                        c1014g.u("android.permission.RECORD_AUDIO");
                                                    }
                                                }
                                                AbstractC0263y.t(interfaceC0261w2, null, null, new B(i07, c0468k110, w9, null), 3);
                                                c1165b6.d();
                                                P5.S s14 = c1165b6.f13857e;
                                                Boolean bool2 = Boolean.TRUE;
                                                s14.getClass();
                                                s14.h(null, bool2);
                                                break;
                                        }
                                        return C1386y.f15098a;
                                    }
                                };
                                c1165b = c1165b3;
                                c0371o3.d0(objH5);
                                s7 = s12;
                                c0722j = c0722j4;
                                i02 = i07;
                                i8 = -775480555;
                                c0468k1 = c0468k16;
                                s0.c((B5.a) objH5, interfaceC0725mC4, false, null, AbstractC0534a.f7788a, c0371o3, 196656, 28);
                                z6 = true;
                                c0371o3.p(true);
                                z7 = false;
                            } else {
                                c0468k1 = c0468k17;
                                interfaceC0261w2 = interfaceC0261w6;
                                i02 = i08;
                                s7 = s13;
                                c0722j = c0722j4;
                                s02 = s04;
                                c0717e = c0717e3;
                                z6 = true;
                                c1165b = c1165b3;
                                z7 = false;
                                i8 = -775480555;
                                c0371o3.S(-775480555);
                            }
                            c0371o3.p(z7);
                            S0 s05 = wJ3;
                            if (((Boolean) s05.getValue()).booleanValue()) {
                                c0371o3.S(-769348786);
                                InterfaceC0725m interfaceC0725mD2 = A.S.a().d(androidx.compose.foundation.layout.c.f9278b);
                                C0717e c0717e4 = c0717e;
                                InterfaceC1926C interfaceC1926CD2 = AbstractC0017n.d(c0717e4, false);
                                int i13 = c0371o3.f5454P;
                                InterfaceC0360i0 interfaceC0360i0M4 = c0371o3.m();
                                InterfaceC0725m interfaceC0725mC5 = AbstractC0727o.c(c0371o3, interfaceC0725mD2);
                                c0371o3.W();
                                if (c0371o3.f5453O) {
                                    c0371o3.l(d5);
                                } else {
                                    c0371o3.g0();
                                }
                                C0345b.u(c0044i2, c0371o3, interfaceC1926CD2);
                                C0345b.u(c0044i3, c0371o3, interfaceC0360i0M4);
                                if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i13))) {
                                    k1.i.o(i13, c0371o3, i13, c0044i);
                                }
                                C0345b.u(c0044i5, c0371o3, interfaceC0725mC5);
                                C0722j c0722j5 = c0722j;
                                InterfaceC0725m interfaceC0725mC6 = androidx.compose.foundation.layout.c.c(c0722j5, 63);
                                InterfaceC0261w interfaceC0261w7 = interfaceC0261w2;
                                I0 i09 = i02;
                                boolean zI4 = c0371o3.i(c1165b) | c0371o3.i(c0468k1) | c0371o3.i(interfaceC0261w7) | c0371o3.g(i09);
                                final C0468k1 c0468k18 = c0468k1;
                                Object objH6 = c0371o3.H();
                                if (zI4) {
                                    s11 = s7;
                                } else {
                                    s11 = s7;
                                    if (objH6 != s11) {
                                        i06 = i09;
                                        interfaceC0261w5 = interfaceC0261w7;
                                        c0468k15 = c0468k18;
                                    }
                                    c0553u = this;
                                    c0468k12 = c0468k15;
                                    c1165b2 = c1165b;
                                    s03 = s05;
                                    interfaceC0261w3 = interfaceC0261w5;
                                    i03 = i06;
                                    c0717e2 = c0717e4;
                                    s8 = s11;
                                    c0722j2 = c0722j5;
                                    z9 = true;
                                    s0.c((B5.a) objH6, interfaceC0725mC6, false, null, AbstractC0534a.f7789b, c0371o3, 196656, 28);
                                    c0371o3.p(true);
                                    z8 = false;
                                }
                                final int i14 = 1;
                                i06 = i09;
                                interfaceC0261w5 = interfaceC0261w7;
                                final C1165b c1165b4 = c1165b;
                                objH6 = new B5.a() { // from class: U4.v
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // B5.a
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                C1165b c1165b42 = c1165b4;
                                                c1165b42.d();
                                                P.W w7 = w6;
                                                AbstractC0534a.j(w7, true);
                                                C0468k1 c0468k182 = c0468k18;
                                                WebView webView = c0468k182.f7084k;
                                                kotlin.jvm.internal.m.b(webView);
                                                boolean z13 = AbstractC1175c.a(webView.getContext(), "android.permission.CAMERA") == 0;
                                                g5.h hVar = c0468k182.f7059S;
                                                if (z13) {
                                                    hVar.f13155h.u("image");
                                                } else {
                                                    hVar.f13157l.u("android.permission.CAMERA");
                                                }
                                                AbstractC0263y.t(interfaceC0261w5, null, null, new C0558z(i06, c0468k182, w7, null), 3);
                                                c1165b42.d();
                                                c1165b42.g();
                                                c1165b42.f();
                                                break;
                                            case 1:
                                                C1165b c1165b5 = c1165b4;
                                                c1165b5.d();
                                                P.W w8 = w6;
                                                AbstractC0534a.j(w8, true);
                                                C0468k1 c0468k19 = c0468k18;
                                                WebView webView2 = c0468k19.f7084k;
                                                kotlin.jvm.internal.m.b(webView2);
                                                boolean z14 = AbstractC1175c.a(webView2.getContext(), "android.permission.CAMERA") == 0;
                                                g5.h hVar2 = c0468k19.f7059S;
                                                if (z14) {
                                                    hVar2.f13155h.u("video");
                                                } else {
                                                    hVar2.f13157l.u("android.permission.CAMERA");
                                                }
                                                AbstractC0263y.t(interfaceC0261w5, null, null, new A(i06, c0468k19, w8, null), 3);
                                                c1165b5.d();
                                                c1165b5.g();
                                                c1165b5.f();
                                                break;
                                            default:
                                                C1165b c1165b6 = c1165b4;
                                                c1165b6.d();
                                                P.W w9 = w6;
                                                AbstractC0534a.j(w9, true);
                                                C0468k1 c0468k110 = c0468k18;
                                                WebView webView3 = c0468k110.f7084k;
                                                g5.h hVar3 = c0468k110.f7059S;
                                                kotlin.jvm.internal.m.b(webView3);
                                                if (AbstractC1175c.a(webView3.getContext(), "android.permission.RECORD_AUDIO") == 0) {
                                                    try {
                                                        hVar3.i.u("audio");
                                                    } catch (Exception unused) {
                                                        ValueCallback valueCallback = hVar3.f13162q;
                                                        if (valueCallback != null) {
                                                            valueCallback.onReceiveValue(null);
                                                        }
                                                        Toast.makeText(c0468k110.f7071c, "No voice recorder application found on device.", 1).show();
                                                    }
                                                } else {
                                                    C1014g c1014g = hVar3.f13160o;
                                                    if (c1014g != null) {
                                                        c1014g.u("android.permission.RECORD_AUDIO");
                                                    }
                                                }
                                                AbstractC0263y.t(interfaceC0261w5, null, null, new B(i06, c0468k110, w9, null), 3);
                                                c1165b6.d();
                                                P5.S s14 = c1165b6.f13857e;
                                                Boolean bool2 = Boolean.TRUE;
                                                s14.getClass();
                                                s14.h(null, bool2);
                                                break;
                                        }
                                        return C1386y.f15098a;
                                    }
                                };
                                c0468k15 = c0468k18;
                                c0371o3.d0(objH6);
                                c0553u = this;
                                c0468k12 = c0468k15;
                                c1165b2 = c1165b;
                                s03 = s05;
                                interfaceC0261w3 = interfaceC0261w5;
                                i03 = i06;
                                c0717e2 = c0717e4;
                                s8 = s11;
                                c0722j2 = c0722j5;
                                z9 = true;
                                s0.c((B5.a) objH6, interfaceC0725mC6, false, null, AbstractC0534a.f7789b, c0371o3, 196656, 28);
                                c0371o3.p(true);
                                z8 = false;
                            } else {
                                c0468k12 = c0468k1;
                                c0553u = this;
                                s03 = s05;
                                c1165b2 = c1165b;
                                interfaceC0261w3 = interfaceC0261w2;
                                i03 = i02;
                                s8 = s7;
                                c0722j2 = c0722j;
                                z8 = false;
                                z9 = z6;
                                int i15 = i8;
                                c0717e2 = c0717e;
                                c0371o3.S(i15);
                            }
                            c0371o3.p(z8);
                            if (((Boolean) wJ4.getValue()).booleanValue()) {
                                c0371o3.S(-767405582);
                                InterfaceC0725m interfaceC0725mD3 = A.S.a().d(androidx.compose.foundation.layout.c.f9278b);
                                InterfaceC1926C interfaceC1926CD3 = AbstractC0017n.d(c0717e2, false);
                                int i16 = c0371o3.f5454P;
                                InterfaceC0360i0 interfaceC0360i0M5 = c0371o3.m();
                                InterfaceC0725m interfaceC0725mC7 = AbstractC0727o.c(c0371o3, interfaceC0725mD3);
                                c0371o3.W();
                                if (c0371o3.f5453O) {
                                    c0371o3.l(d5);
                                } else {
                                    c0371o3.g0();
                                }
                                C0345b.u(c0044i2, c0371o3, interfaceC1926CD3);
                                C0345b.u(c0044i3, c0371o3, interfaceC0360i0M5);
                                if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i16))) {
                                    k1.i.o(i16, c0371o3, i16, c0044i);
                                }
                                C0345b.u(c0044i5, c0371o3, interfaceC0725mC7);
                                C0722j c0722j6 = c0722j2;
                                InterfaceC0725m interfaceC0725mC8 = androidx.compose.foundation.layout.c.c(c0722j6, 63);
                                C1165b c1165b5 = c1165b2;
                                C0468k1 c0468k19 = c0468k12;
                                InterfaceC0261w interfaceC0261w8 = interfaceC0261w3;
                                I0 i010 = i03;
                                boolean zI5 = c0371o3.i(c1165b5) | c0371o3.i(c0468k19) | c0371o3.i(interfaceC0261w8) | c0371o3.g(i010);
                                Object objH7 = c0371o3.H();
                                if (zI5) {
                                    s10 = s8;
                                } else {
                                    s10 = s8;
                                    if (objH7 != s10) {
                                        c1165b2 = c1165b5;
                                        c0468k14 = c0468k19;
                                        i05 = i010;
                                        interfaceC0261w4 = interfaceC0261w8;
                                    }
                                    c0722j3 = c0722j6;
                                    c0468k13 = c0468k14;
                                    i04 = i05;
                                    s9 = s10;
                                    s0.c((B5.a) objH7, interfaceC0725mC8, false, null, AbstractC0534a.f7790c, c0371o3, 196656, 28);
                                    z10 = true;
                                    c0371o3.p(true);
                                    z11 = false;
                                }
                                final int i17 = 2;
                                c1165b2 = c1165b5;
                                c0468k14 = c0468k19;
                                i05 = i010;
                                interfaceC0261w4 = interfaceC0261w8;
                                objH7 = new B5.a() { // from class: U4.v
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // B5.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                C1165b c1165b42 = c1165b2;
                                                c1165b42.d();
                                                P.W w7 = w6;
                                                AbstractC0534a.j(w7, true);
                                                C0468k1 c0468k182 = c0468k14;
                                                WebView webView = c0468k182.f7084k;
                                                kotlin.jvm.internal.m.b(webView);
                                                boolean z13 = AbstractC1175c.a(webView.getContext(), "android.permission.CAMERA") == 0;
                                                g5.h hVar = c0468k182.f7059S;
                                                if (z13) {
                                                    hVar.f13155h.u("image");
                                                } else {
                                                    hVar.f13157l.u("android.permission.CAMERA");
                                                }
                                                AbstractC0263y.t(interfaceC0261w4, null, null, new C0558z(i05, c0468k182, w7, null), 3);
                                                c1165b42.d();
                                                c1165b42.g();
                                                c1165b42.f();
                                                break;
                                            case 1:
                                                C1165b c1165b52 = c1165b2;
                                                c1165b52.d();
                                                P.W w8 = w6;
                                                AbstractC0534a.j(w8, true);
                                                C0468k1 c0468k192 = c0468k14;
                                                WebView webView2 = c0468k192.f7084k;
                                                kotlin.jvm.internal.m.b(webView2);
                                                boolean z14 = AbstractC1175c.a(webView2.getContext(), "android.permission.CAMERA") == 0;
                                                g5.h hVar2 = c0468k192.f7059S;
                                                if (z14) {
                                                    hVar2.f13155h.u("video");
                                                } else {
                                                    hVar2.f13157l.u("android.permission.CAMERA");
                                                }
                                                AbstractC0263y.t(interfaceC0261w4, null, null, new A(i05, c0468k192, w8, null), 3);
                                                c1165b52.d();
                                                c1165b52.g();
                                                c1165b52.f();
                                                break;
                                            default:
                                                C1165b c1165b6 = c1165b2;
                                                c1165b6.d();
                                                P.W w9 = w6;
                                                AbstractC0534a.j(w9, true);
                                                C0468k1 c0468k110 = c0468k14;
                                                WebView webView3 = c0468k110.f7084k;
                                                g5.h hVar3 = c0468k110.f7059S;
                                                kotlin.jvm.internal.m.b(webView3);
                                                if (AbstractC1175c.a(webView3.getContext(), "android.permission.RECORD_AUDIO") == 0) {
                                                    try {
                                                        hVar3.i.u("audio");
                                                    } catch (Exception unused) {
                                                        ValueCallback valueCallback = hVar3.f13162q;
                                                        if (valueCallback != null) {
                                                            valueCallback.onReceiveValue(null);
                                                        }
                                                        Toast.makeText(c0468k110.f7071c, "No voice recorder application found on device.", 1).show();
                                                    }
                                                } else {
                                                    C1014g c1014g = hVar3.f13160o;
                                                    if (c1014g != null) {
                                                        c1014g.u("android.permission.RECORD_AUDIO");
                                                    }
                                                }
                                                AbstractC0263y.t(interfaceC0261w4, null, null, new B(i05, c0468k110, w9, null), 3);
                                                c1165b6.d();
                                                P5.S s14 = c1165b6.f13857e;
                                                Boolean bool2 = Boolean.TRUE;
                                                s14.getClass();
                                                s14.h(null, bool2);
                                                break;
                                        }
                                        return C1386y.f15098a;
                                    }
                                };
                                c0371o3.d0(objH7);
                                c0722j3 = c0722j6;
                                c0468k13 = c0468k14;
                                i04 = i05;
                                s9 = s10;
                                s0.c((B5.a) objH7, interfaceC0725mC8, false, null, AbstractC0534a.f7790c, c0371o3, 196656, 28);
                                z10 = true;
                                c0371o3.p(true);
                                z11 = false;
                            } else {
                                z10 = z9;
                                c0468k13 = c0468k12;
                                interfaceC0261w4 = interfaceC0261w3;
                                i04 = i03;
                                s9 = s8;
                                c0722j3 = c0722j2;
                                z11 = false;
                                c0371o3.S(-775480555);
                            }
                            c0371o3.p(z11);
                            InterfaceC0725m interfaceC0725mD4 = A.S.a().d(androidx.compose.foundation.layout.c.f9278b);
                            InterfaceC1926C interfaceC1926CD4 = AbstractC0017n.d(c0717e2, z11);
                            int i18 = c0371o3.f5454P;
                            InterfaceC0360i0 interfaceC0360i0M6 = c0371o3.m();
                            InterfaceC0725m interfaceC0725mC9 = AbstractC0727o.c(c0371o3, interfaceC0725mD4);
                            c0371o3.W();
                            if (c0371o3.f5453O) {
                                c0371o3.l(d5);
                            } else {
                                c0371o3.g0();
                            }
                            C0345b.u(c0044i2, c0371o3, interfaceC1926CD4);
                            C0345b.u(c0044i3, c0371o3, interfaceC0360i0M6);
                            if (c0371o3.f5453O || !kotlin.jvm.internal.m.a(c0371o3.H(), Integer.valueOf(i18))) {
                                k1.i.o(i18, c0371o3, i18, c0044i);
                            }
                            C0345b.u(c0044i5, c0371o3, interfaceC0725mC9);
                            InterfaceC0725m interfaceC0725mC10 = androidx.compose.foundation.layout.c.c(c0722j3, 60);
                            final S0 s06 = s03;
                            final S0 s07 = s02;
                            final InterfaceC0261w interfaceC0261w9 = interfaceC0261w4;
                            final I0 i011 = i04;
                            final C1165b c1165b6 = c1165b2;
                            boolean zG = c0371o3.g(s06) | c0371o3.g(s07) | c0371o3.i(c0468k13) | c0371o3.i(interfaceC0261w9) | c0371o3.g(i011) | c0371o3.i(c1165b6);
                            Object objH8 = c0371o3.H();
                            if (zG || objH8 == s9) {
                                final C0468k1 c0468k110 = c0468k13;
                                z12 = z10;
                                B5.a aVar = new B5.a() { // from class: U4.w
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // B5.a
                                    public final Object invoke() {
                                        P.W w7 = w6;
                                        AbstractC0534a.j(w7, true);
                                        S0 s08 = s06;
                                        boolean zBooleanValue2 = ((Boolean) s08.getValue()).booleanValue();
                                        C0468k1 c0468k111 = c0468k110;
                                        S0 s09 = s07;
                                        if (zBooleanValue2 && !((Boolean) s09.getValue()).booleanValue()) {
                                            c0468k111.f7059S.f13156k.u("video/*");
                                        } else if (((Boolean) s08.getValue()).booleanValue() || !((Boolean) s09.getValue()).booleanValue()) {
                                            c0468k111.f7059S.j.u("*/*");
                                        } else {
                                            c0468k111.f7059S.f13156k.u("image/*");
                                        }
                                        AbstractC0263y.t(interfaceC0261w9, null, null, new C(i011, c0468k111, w7, null), 3);
                                        C1165b c1165b7 = c1165b6;
                                        c1165b7.d();
                                        c1165b7.g();
                                        c1165b7.f();
                                        return C1386y.f15098a;
                                    }
                                };
                                c0371o3.d0(aVar);
                                objH8 = aVar;
                            } else {
                                z12 = z10;
                            }
                            s0.c((B5.a) objH8, interfaceC0725mC10, false, null, AbstractC0534a.f7791d, c0371o3, 196656, 28);
                            c0371o3.p(z12);
                            c0371o3.p(z12);
                            c0371o3.p(z12);
                        } else {
                            c0371o3.N();
                        }
                        return C1386y.f15098a;
                    }
                }, c0371o2), c0371o, 0, 4090);
                c0371o2 = c0371o;
                z5 = false;
            } else {
                z5 = false;
                c0371o2.S(-1036290093);
            }
            c0371o2.p(z5);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new R4.Z(i, 4, dataObject, viewModel);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(P.W w3, boolean z5) {
        w3.setValue(Boolean.valueOf(z5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(C0468k1 dataObject, C0371o c0371o, int i) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(-1799535160);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                MainActivity mainActivity = dataObject.f7071c;
                WebView webView = dataObject.f7084k;
                kotlin.jvm.internal.m.b(webView);
                objH = C0345b.q(new C0466k(mainActivity, webView));
                c0371o.d0(objH);
            }
            P.W w3 = (P.W) objH;
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(dataObject);
            Object objH2 = c0371o.H();
            if (zI || objH2 == s6) {
                objH2 = new H(dataObject, null);
                c0371o.d0(objH2);
            }
            C0345b.e((B5.e) objH2, c0371o, bool);
            boolean zI2 = c0371o.i(dataObject);
            Object objH3 = c0371o.H();
            if (zI2 || objH3 == s6) {
                objH3 = new I(dataObject, null);
                c0371o.d0(objH3);
            }
            C0345b.e((B5.e) objH3, c0371o, bool);
            AbstractC1127b.a(X.k.d(839720353, new C0538e(dataObject, w3), c0371o), c0371o, 384, 3);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 6, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(final boolean z5, final String str, final float f, C0371o c0371o, final int i) {
        c0371o.U(1821267451);
        int i7 = i | 384 | (c0371o.d(f) ? 16384 : 8192);
        if (c0371o.K(i7 & 1, (i7 & 9363) != 9362)) {
            c0371o.S(-945825593);
            c0371o.p(false);
            z5 = true;
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(z5, str, f, i) { // from class: U4.b

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ boolean f7796q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f7797r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ float f7798s;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(3127);
                    AbstractC0534a.l(this.f7796q, this.f7797r, this.f7798s, (C0371o) obj, iW);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(final String str, final boolean z5, C0371o c0371o, final int i, final int i7) {
        int i8;
        c0371o.U(1890013106);
        int i9 = i7 & 1;
        if (i9 != 0) {
            i8 = i | 6;
        } else {
            i8 = (c0371o.g(str) ? 4 : 2) | i;
        }
        int i10 = i8 | 48;
        if (c0371o.K(i10 & 1, (i10 & 19) != 18)) {
            if (i9 != 0) {
                str = "#000000";
            }
            c0371o.S(-1642976240);
            c0371o.p(false);
            z5 = true;
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(i, i7, str, z5) { // from class: U4.d

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ String f7806q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ boolean f7807r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ int f7808s;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f7806q = str;
                    this.f7807r = z5;
                    this.f7808s = i7;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(1);
                    AbstractC0534a.m(this.f7806q, this.f7807r, (C0371o) obj, iW, this.f7808s);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(final C0468k1 dataObject, final F1 f12, MainActivity mainActivity, final B5.c onClick, C0371o c0371o, int i) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        c0371o.U(-2062367208);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i | (c0371o.i(f12) ? 32 : 16) | (c0371o.i(onClick) ? 2048 : 1024);
        if (c0371o.K(i7 & 1, (i7 & 1043) != 1042)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                MainActivity mainActivity2 = dataObject.f7071c;
                WebView webView = dataObject.f7084k;
                kotlin.jvm.internal.m.b(webView);
                objH = C0345b.q(new C0466k(mainActivity2, webView));
                c0371o.d0(objH);
            }
            final P.W w3 = (P.W) objH;
            boolean z5 = ((Configuration) c0371o.k(AndroidCompositionLocals_androidKt.f9340a)).orientation == 1;
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(dataObject) | c0371o.i(f12);
            Object objH2 = c0371o.H();
            if (zI || objH2 == s6) {
                objH2 = new T(dataObject, f12, null);
                c0371o.d0(objH2);
            }
            C0345b.e((B5.e) objH2, c0371o, bool);
            final boolean z6 = z5;
            AbstractC1127b.a(X.k.d(1523370545, new B5.e() { // from class: U4.P
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
                @Override // B5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
                    /*
                        r28 = this;
                        r0 = r28
                        R4.F1 r1 = r1
                        java.lang.String r3 = r1.f6755a
                        r5 = r29
                        P.o r5 = (P.C0371o) r5
                        r2 = r30
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        int r2 = r2.intValue()
                        r4 = r2 & 3
                        r6 = 2
                        r8 = 1
                        r9 = 0
                        if (r4 == r6) goto L1b
                        r4 = r8
                        goto L1c
                    L1b:
                        r4 = r9
                    L1c:
                        r2 = r2 & r8
                        boolean r2 = r5.K(r2, r4)
                        if (r2 == 0) goto L294
                        androidx.compose.foundation.layout.FillElement r10 = androidx.compose.foundation.layout.c.f9279c
                        java.util.List r11 = r1.f6756b
                        int r2 = android.graphics.Color.parseColor(r3)
                        long r6 = j0.AbstractC1145B.b(r2)
                        O3.D r2 = j0.AbstractC1145B.f13658a
                        c0.m r2 = androidx.compose.foundation.a.a(r10, r6, r2)
                        c0.m r2 = U4.AbstractC0534a.A(r2, r8)
                        A.c r4 = A.AbstractC0012i.f110e
                        c0.c r6 = c0.C0714b.f10074C
                        r7 = 54
                        A.t r4 = A.r.a(r4, r6, r5, r7)
                        int r6 = r5.f5454P
                        P.i0 r7 = r5.m()
                        c0.m r2 = c0.AbstractC0727o.c(r5, r2)
                        B0.j r12 = B0.InterfaceC0046k.f452a
                        r12.getClass()
                        B0.D r12 = B0.C0045j.f445b
                        r5.W()
                        boolean r13 = r5.f5453O
                        if (r13 == 0) goto L5f
                        r5.l(r12)
                        goto L62
                    L5f:
                        r5.g0()
                    L62:
                        B0.i r13 = B0.C0045j.f448e
                        P.C0345b.u(r13, r5, r4)
                        B0.i r14 = B0.C0045j.f447d
                        P.C0345b.u(r14, r5, r7)
                        B0.i r15 = B0.C0045j.f
                        boolean r4 = r5.f5453O
                        if (r4 != 0) goto L80
                        java.lang.Object r4 = r5.H()
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                        boolean r4 = kotlin.jvm.internal.m.a(r4, r7)
                        if (r4 != 0) goto L83
                    L80:
                        k1.i.o(r6, r5, r6, r15)
                    L83:
                        B0.i r4 = B0.C0045j.f446c
                        P.C0345b.u(r4, r5, r2)
                        kotlin.jvm.internal.m.b(r3)
                        r6 = 0
                        r7 = 5
                        r2 = 0
                        r16 = r4
                        r4 = 0
                        r8 = r16
                        U4.AbstractC0534a.t(r2, r3, r4, r5, r6, r7)
                        c0.m r2 = A.C0023u.a(r10)
                        A.b r3 = A.AbstractC0012i.f108c
                        c0.c r4 = c0.C0714b.f10073B
                        A.t r3 = A.r.a(r3, r4, r5, r9)
                        int r4 = r5.f5454P
                        P.i0 r6 = r5.m()
                        c0.m r2 = c0.AbstractC0727o.c(r5, r2)
                        r5.W()
                        boolean r7 = r5.f5453O
                        if (r7 == 0) goto Lb7
                        r5.l(r12)
                        goto Lba
                    Lb7:
                        r5.g0()
                    Lba:
                        P.C0345b.u(r13, r5, r3)
                        P.C0345b.u(r14, r5, r6)
                        boolean r3 = r5.f5453O
                        if (r3 != 0) goto Ld2
                        java.lang.Object r3 = r5.H()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
                        boolean r3 = kotlin.jvm.internal.m.a(r3, r6)
                        if (r3 != 0) goto Ld5
                    Ld2:
                        k1.i.o(r4, r5, r4, r15)
                    Ld5:
                        P.C0345b.u(r8, r5, r2)
                        if (r11 == 0) goto Lef
                        java.lang.Object r2 = n5.l.l0(r11)
                        R4.R1 r2 = (R4.R1) r2
                        if (r2 == 0) goto Lef
                        java.util.List r2 = r2.f6841a
                        if (r2 == 0) goto Lef
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.List r2 = (java.util.List) r2
                        java.util.ArrayList r2 = n5.l.j0(r2)
                        goto Lf1
                    Lef:
                        n5.s r2 = n5.s.f15299q
                    Lf1:
                        r3 = 0
                        if (r11 == 0) goto Lff
                        java.lang.Object r4 = n5.l.l0(r11)
                        R4.R1 r4 = (R4.R1) r4
                        if (r4 == 0) goto Lff
                        java.lang.Integer r4 = r4.f6843c
                        goto L100
                    Lff:
                        r4 = r3
                    L100:
                        U4.AbstractC0534a.o(r2, r4, r5, r9)
                        r2 = 1
                        r5.p(r2)
                        R4.k1 r2 = r2
                        R4.i r4 = r2.f7073d
                        r6 = 50
                        if (r4 == 0) goto L118
                        R4.Y r7 = r4.f7020z
                        if (r7 == 0) goto L118
                        boolean r7 = r7.f6885b
                        if (r7 != 0) goto L118
                        goto L126
                    L118:
                        if (r4 == 0) goto L124
                        R4.Y r7 = r4.f7020z
                        if (r7 == 0) goto L124
                        boolean r3 = r7.f6885b
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    L124:
                        if (r3 != 0) goto L12a
                    L126:
                        float r3 = (float) r6
                    L127:
                        r20 = r3
                        goto L12c
                    L12a:
                        float r3 = (float) r9
                        goto L127
                    L12c:
                        r21 = 7
                        c0.j r16 = c0.C0722j.f10095q
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        c0.m r3 = androidx.compose.foundation.layout.b.d(r16, r17, r18, r19, r20, r21)
                        c0.e r7 = c0.C0714b.f10076q
                        z0.C r10 = A.AbstractC0017n.d(r7, r9)
                        int r11 = r5.f5454P
                        P.i0 r6 = r5.m()
                        c0.m r3 = c0.AbstractC0727o.c(r5, r3)
                        r5.W()
                        boolean r9 = r5.f5453O
                        if (r9 == 0) goto L155
                        r5.l(r12)
                        goto L158
                    L155:
                        r5.g0()
                    L158:
                        P.C0345b.u(r13, r5, r10)
                        P.C0345b.u(r14, r5, r6)
                        boolean r6 = r5.f5453O
                        if (r6 != 0) goto L170
                        java.lang.Object r6 = r5.H()
                        java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
                        boolean r6 = kotlin.jvm.internal.m.a(r6, r9)
                        if (r6 != 0) goto L173
                    L170:
                        k1.i.o(r11, r5, r11, r15)
                    L173:
                        P.C0345b.u(r8, r5, r3)
                        java.util.List r1 = r1.f6757c
                        if (r1 != 0) goto L186
                        r1 = 2073370340(0x7b951ee4, float:1.5485575E36)
                        r5.S(r1)
                        r3 = 0
                    L181:
                        r5.p(r3)
                        r1 = 1
                        goto L193
                    L186:
                        r3 = 0
                        r6 = 2073370341(0x7b951ee5, float:1.5485577E36)
                        r5.S(r6)
                        B5.c r6 = r4
                        E3.h.a(r1, r6, r5, r3)
                        goto L181
                    L193:
                        r5.p(r1)
                        P.S r3 = P.C0363k.f5418a
                        if (r4 == 0) goto L26b
                        R4.Y r4 = r4.f7020z
                        if (r4 == 0) goto L26b
                        boolean r6 = r4.f6885b
                        if (r6 != r1) goto L26b
                        java.lang.Boolean r1 = r4.f6884a
                        java.lang.Boolean r6 = java.lang.Boolean.TRUE
                        boolean r1 = kotlin.jvm.internal.m.a(r1, r6)
                        if (r1 == 0) goto L26b
                        r1 = -210472894(0xfffffffff3747042, float:-1.9366414E31)
                        r5.S(r1)
                        R4.x r18 = new R4.x
                        java.lang.String r1 = r4.f6889g
                        java.lang.Integer r6 = r4.f6890h
                        java.lang.String r9 = r4.f
                        java.lang.Integer r10 = r4.j
                        java.lang.String r11 = r4.i
                        r19 = r1
                        java.lang.String r1 = r4.f6891k
                        r24 = r1
                        java.lang.String r1 = r4.f6886c
                        r20 = r6
                        java.lang.String r6 = r4.f6887d
                        java.lang.String r4 = r4.f6888e
                        r21 = r9
                        java.lang.String r9 = "&titleBarBgColor="
                        r22 = r10
                        java.lang.String r10 = "&titleBarContentColor="
                        r23 = r11
                        java.lang.String r11 = "w2n://download-screen?title="
                        java.lang.StringBuilder r1 = C0.S.r(r11, r1, r9, r6, r10)
                        r1.append(r4)
                        java.lang.String r25 = r1.toString()
                        r18.<init>(r19, r20, r21, r22, r23, r24, r25)
                        r1 = r18
                        boolean r4 = r3
                        if (r4 == 0) goto L1f2
                        r4 = 50
                    L1ee:
                        float r4 = (float) r4
                        r26 = r4
                        goto L1f5
                    L1f2:
                        r4 = 25
                        goto L1ee
                    L1f5:
                        r27 = 7
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r22 = r16
                        c0.m r4 = androidx.compose.foundation.layout.b.d(r22, r23, r24, r25, r26, r27)
                        r6 = 0
                        z0.C r7 = A.AbstractC0017n.d(r7, r6)
                        int r6 = r5.f5454P
                        P.i0 r9 = r5.m()
                        c0.m r4 = c0.AbstractC0727o.c(r5, r4)
                        r5.W()
                        boolean r10 = r5.f5453O
                        if (r10 == 0) goto L21d
                        r5.l(r12)
                        goto L220
                    L21d:
                        r5.g0()
                    L220:
                        P.C0345b.u(r13, r5, r7)
                        P.C0345b.u(r14, r5, r9)
                        boolean r7 = r5.f5453O
                        if (r7 != 0) goto L238
                        java.lang.Object r7 = r5.H()
                        java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                        boolean r7 = kotlin.jvm.internal.m.a(r7, r9)
                        if (r7 != 0) goto L23b
                    L238:
                        k1.i.o(r6, r5, r6, r15)
                    L23b:
                        P.C0345b.u(r8, r5, r4)
                        java.util.List r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r1)
                        boolean r6 = r5.g(r1)
                        boolean r7 = r5.i(r2)
                        r6 = r6 | r7
                        java.lang.Object r7 = r5.H()
                        if (r6 != 0) goto L253
                        if (r7 != r3) goto L25c
                    L253:
                        N5.d r7 = new N5.d
                        r6 = 7
                        r7.<init>(r6, r1, r2)
                        r5.d0(r7)
                    L25c:
                        B5.c r7 = (B5.c) r7
                        r6 = 0
                        E3.h.a(r4, r7, r5, r6)
                        r1 = 1
                        r5.p(r1)
                    L266:
                        r5.p(r6)
                        r1 = 1
                        goto L273
                    L26b:
                        r6 = 0
                        r1 = -215827493(0xfffffffff322bbdb, float:-1.2893101E31)
                        r5.S(r1)
                        goto L266
                    L273:
                        r5.p(r1)
                        boolean r1 = r5.i(r2)
                        java.lang.Object r4 = r5.H()
                        if (r1 != 0) goto L282
                        if (r4 != r3) goto L28d
                    L282:
                        U4.n r4 = new U4.n
                        r1 = 2
                        P.W r3 = r5
                        r4.<init>(r2, r3, r1)
                        r5.d0(r4)
                    L28d:
                        B5.a r4 = (B5.a) r4
                        r6 = 0
                        l6.d.d(r6, r4, r5, r6)
                        goto L297
                    L294:
                        r5.N()
                    L297:
                        m5.y r1 = m5.C1386y.f15098a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: U4.P.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, c0371o), c0371o, 384, 3);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Q(dataObject, f12, mainActivity, onClick, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(java.util.List r34, java.lang.Integer r35, P.C0371o r36, int r37) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = -1992054370(0xffffffff8943a99e, float:-2.3552025E-33)
            r2.U(r3)
            boolean r3 = r2.i(r0)
            if (r3 == 0) goto L14
            r3 = 4
            goto L15
        L14:
            r3 = 2
        L15:
            r3 = r37 | r3
            boolean r5 = r2.g(r1)
            r23 = 16
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = r23
        L24:
            r3 = r3 | r5
            r5 = r3 & 19
            r6 = 18
            r7 = 1
            r8 = 0
            if (r5 == r6) goto L2f
            r5 = r7
            goto L30
        L2f:
            r5 = r8
        L30:
            r3 = r3 & r7
            boolean r3 = r2.K(r3, r5)
            if (r3 == 0) goto L250
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            float r3 = (float) r3
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 / r5
            int r3 = (int) r3
            if (r1 == 0) goto L58
            int r5 = r1.intValue()
            int r5 = r5 * r3
            int r5 = r5 / 100
            goto L59
        L58:
            r5 = r8
        L59:
            float r11 = (float) r5
            r13 = 0
            r14 = 13
            c0.j r9 = c0.C0722j.f10095q
            r10 = 0
            r12 = 0
            c0.m r3 = androidx.compose.foundation.layout.b.d(r9, r10, r11, r12, r13, r14)
            r5 = r9
            androidx.compose.foundation.layout.FillElement r6 = androidx.compose.foundation.layout.c.f9279c
            c0.m r3 = r3.d(r6)
            c0.c r6 = c0.C0714b.f10074C
            A.b r9 = A.AbstractC0012i.f108c
            r10 = 54
            A.t r6 = A.r.a(r9, r6, r2, r10)
            int r9 = r2.f5454P
            P.i0 r10 = r2.m()
            c0.m r3 = c0.AbstractC0727o.c(r2, r3)
            B0.j r11 = B0.InterfaceC0046k.f452a
            r11.getClass()
            B0.D r11 = B0.C0045j.f445b
            r2.W()
            boolean r12 = r2.f5453O
            if (r12 == 0) goto L92
            r2.l(r11)
            goto L95
        L92:
            r2.g0()
        L95:
            B0.i r11 = B0.C0045j.f448e
            P.C0345b.u(r11, r2, r6)
            B0.i r6 = B0.C0045j.f447d
            P.C0345b.u(r6, r2, r10)
            B0.i r6 = B0.C0045j.f
            boolean r10 = r2.f5453O
            if (r10 != 0) goto Lb3
            java.lang.Object r10 = r2.H()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.m.a(r10, r11)
            if (r10 != 0) goto Lb6
        Lb3:
            k1.i.o(r9, r2, r9, r6)
        Lb6:
            B0.i r6 = B0.C0045j.f446c
            P.C0345b.u(r6, r2, r3)
            r3 = 2072851673(0x7b8d34d9, float:1.4663715E36)
            r2.S(r3)
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r24 = r3.iterator()
        Lc8:
            boolean r3 = r24.hasNext()
            if (r3 == 0) goto L247
            java.lang.Object r3 = r24.next()
            R4.c0 r3 = (R4.C0435c0) r3
            java.lang.String r6 = r3.f6925d
            java.lang.String r9 = r3.f6926e
            java.lang.String r10 = "text"
            boolean r6 = kotlin.jvm.internal.m.a(r6, r10)
            r10 = 10
            r11 = -955801527(0xffffffffc707a049, float:-34720.285)
            if (r6 == 0) goto L185
            r6 = -948160895(0xffffffffc77c3681, float:-64566.504)
            r2.S(r6)
            java.lang.String r6 = r3.f
            if (r6 == 0) goto L174
            r6 = -948118084(0xffffffffc77cddbc, float:-64733.734)
            r2.S(r6)
            java.lang.String r2 = r3.f
            java.lang.Integer r6 = r3.f6922a
            if (r6 == 0) goto L105
            int r6 = r6.intValue()
            long r12 = com.google.android.gms.internal.measurement.AbstractC0836n2.y(r6)
        L103:
            r6 = r8
            goto L10a
        L105:
            long r12 = com.google.android.gms.internal.measurement.AbstractC0836n2.y(r23)
            goto L103
        L10a:
            O0.j r8 = new O0.j
            java.lang.Integer r14 = r3.f6923b
            if (r14 == 0) goto L115
            int r14 = r14.intValue()
            goto L117
        L115:
            r14 = 400(0x190, float:5.6E-43)
        L117:
            r8.<init>(r14)
            java.lang.String r14 = r3.f6924c
            if (r14 != 0) goto L120
            java.lang.String r14 = "#111111"
        L120:
            int r14 = android.graphics.Color.parseColor(r14)
            long r14 = j0.AbstractC1145B.b(r14)
            float r4 = (float) r10
            c0.m r4 = androidx.compose.foundation.layout.b.a(r5, r4)
            r17 = r11
            V0.k r11 = new V0.k
            r6 = 3
            r11.<init>(r6)
            r21 = 0
            r22 = 130512(0x1fdd0, float:1.82886E-40)
            r6 = r9
            r19 = r10
            r9 = 0
            r20 = r6
            r25 = r7
            r6 = r12
            r12 = 0
            r26 = r5
            r32 = r14
            r15 = r3
            r3 = r4
            r4 = r32
            r14 = 0
            r27 = r15
            r15 = 0
            r28 = 2
            r16 = 0
            r29 = r17
            r17 = 0
            r30 = 0
            r18 = 0
            r31 = r20
            r20 = 48
            r19 = r36
            r0 = r27
            r1 = r30
            M.N0.b(r2, r3, r4, r6, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = r19
            r2.p(r1)
            r3 = -955801527(0xffffffffc707a049, float:-34720.285)
            goto L181
        L174:
            r0 = r3
            r26 = r5
            r1 = r8
            r31 = r9
            r3 = r11
            r2.S(r3)
            r2.p(r1)
        L181:
            r2.p(r1)
            goto L190
        L185:
            r0 = r3
            r26 = r5
            r1 = r8
            r31 = r9
            r3 = r11
            r2.S(r3)
            goto L181
        L190:
            java.lang.String r0 = r0.f6925d
            java.lang.String r3 = "image"
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            if (r0 == 0) goto L234
            r0 = -947382051(0xffffffffc78818dd, float:-69681.73)
            r2.S(r0)
            if (r31 == 0) goto L227
            boolean r0 = J5.m.U0(r31)
            if (r0 == 0) goto L1aa
            goto L227
        L1aa:
            java.lang.String r0 = ""
            r6 = r31
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L227
            r0 = -947302722(0xffffffffc7894ebe, float:-70301.484)
            r2.S(r0)
            c0.m r0 = A.C0023u.a(r26)
            c0.e r3 = c0.C0714b.f10076q
            z0.C r3 = A.AbstractC0017n.d(r3, r1)
            int r4 = r2.f5454P
            P.i0 r5 = r2.m()
            c0.m r0 = c0.AbstractC0727o.c(r2, r0)
            B0.j r7 = B0.InterfaceC0046k.f452a
            r7.getClass()
            B0.D r7 = B0.C0045j.f445b
            r2.W()
            boolean r8 = r2.f5453O
            if (r8 == 0) goto L1e0
            r2.l(r7)
            goto L1e3
        L1e0:
            r2.g0()
        L1e3:
            B0.i r7 = B0.C0045j.f448e
            P.C0345b.u(r7, r2, r3)
            B0.i r3 = B0.C0045j.f447d
            P.C0345b.u(r3, r2, r5)
            B0.i r3 = B0.C0045j.f
            boolean r5 = r2.f5453O
            if (r5 != 0) goto L201
            java.lang.Object r5 = r2.H()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.m.a(r5, r7)
            if (r5 != 0) goto L204
        L201:
            k1.i.o(r4, r2, r4, r3)
        L204:
            B0.i r3 = B0.C0045j.f446c
            P.C0345b.u(r3, r2, r0)
            java.lang.String r0 = "file:///android_asset/"
            java.lang.String r0 = r0.concat(r6)
            androidx.compose.foundation.layout.FillElement r3 = androidx.compose.foundation.layout.c.f9277a
            r4 = 10
            float r4 = (float) r4
            r5 = 0
            r6 = 2
            c0.m r3 = androidx.compose.foundation.layout.b.c(r3, r4, r5, r6)
            java.lang.String r4 = "no internet image"
            u2.u.b(r0, r4, r3, r2)
            r0 = 1
            r2.p(r0)
        L223:
            r2.p(r1)
            goto L230
        L227:
            r0 = 1
            r6 = 2
            r3 = -955801527(0xffffffffc707a049, float:-34720.285)
            r2.S(r3)
            goto L223
        L230:
            r2.p(r1)
            goto L23d
        L234:
            r0 = 1
            r3 = -955801527(0xffffffffc707a049, float:-34720.285)
            r6 = 2
            r2.S(r3)
            goto L230
        L23d:
            r7 = r0
            r8 = r1
            r5 = r26
            r0 = r34
            r1 = r35
            goto Lc8
        L247:
            r0 = r7
            r1 = r8
            r2.p(r1)
            r2.p(r0)
            goto L253
        L250:
            r2.N()
        L253:
            P.o0 r0 = r2.r()
            if (r0 == 0) goto L267
            R4.Z r1 = new R4.Z
            r2 = 5
            r3 = r34
            r4 = r35
            r5 = r37
            r1.<init>(r5, r2, r3, r4)
            r0.f5482d = r1
        L267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.AbstractC0534a.o(java.util.List, java.lang.Integer, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(C0468k1 dataObject, C0371o c0371o, int i) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(1505869517);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(new WebView(dataObject.f7071c));
                c0371o.d0(objH);
            }
            P.W w3 = (P.W) objH;
            Object objH2 = c0371o.H();
            if (objH2 == s6) {
                objH2 = C0345b.q(Boolean.FALSE);
                c0371o.d0(objH2);
            }
            P.W w6 = (P.W) objH2;
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(dataObject);
            Object objH3 = c0371o.H();
            if (zI || objH3 == s6) {
                objH3 = new a0(dataObject, w3, w6, null);
                c0371o.d0(objH3);
            }
            C0345b.e((B5.e) objH3, c0371o, bool);
            if (((Boolean) w6.getValue()).booleanValue()) {
                c0371o.S(425738820);
                AbstractC1127b.a(X.k.d(-1268027153, new J5.u(10, w3), c0371o), c0371o, 384, 3);
            } else {
                c0371o.S(424329653);
            }
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 8, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(final int i, C0468k1 dataObject, C0371o c0371o, int i7) {
        C0448f1 c0448f1;
        C0448f1 c0448f12;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        C0458i c0458i = dataObject.f7073d;
        c0371o.U(-757986989);
        int i8 = (c0371o.e(i) ? 4 : 2) | i7 | (c0371o.i(dataObject) ? 32 : 16);
        if (c0371o.K(i8 & 1, (i8 & 19) != 18)) {
            C1167d c1167d = dataObject.f7098t;
            String str = null;
            P5.D d5 = c1167d != null ? c1167d.f13875g : null;
            kotlin.jvm.internal.m.b(d5);
            if (((Boolean) C0345b.j(d5, c0371o).getValue()).booleanValue()) {
                c0371o.S(1745787119);
            } else {
                c0371o.S(1747917501);
                if (i < 100) {
                    c0371o.S(1747963443);
                    InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.f9277a, 3);
                    InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
                    int i9 = c0371o.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mA);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d7 = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(d7);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                        k1.i.o(i9, c0371o, i9, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    InterfaceC0725m interfaceC0725mA2 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f9279c, j0.o.f13718b, AbstractC1145B.f13658a);
                    long jB = AbstractC1145B.b(Color.parseColor((c0458i == null || (c0448f12 = c0458i.f) == null) ? null : c0448f12.f));
                    if (c0458i != null && (c0448f1 = c0458i.f) != null) {
                        str = c0448f1.f6953g;
                    }
                    long jB2 = AbstractC1145B.b(Color.parseColor(str));
                    boolean z5 = (i8 & 14) == 4;
                    Object objH = c0371o.H();
                    if (z5 || objH == C0363k.f5418a) {
                        objH = new B5.a() { // from class: U4.Y
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // B5.a
                            public final Object invoke() {
                                return Float.valueOf(i / 100.0f);
                            }
                        };
                        c0371o.d0(objH);
                    }
                    q0.b((B5.a) objH, interfaceC0725mA2, jB, jB2, 1, 0.0f, null, c0371o, 48);
                    c0371o.p(true);
                } else {
                    c0371o.S(1745787119);
                }
                c0371o.p(false);
            }
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(i, i7, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r(C0468k1 c0468k1, int i, InterfaceC0725m interfaceC0725m, C0371o c0371o, int i7) {
        InterfaceC0725m interfaceC0725m2;
        C0371o c0371o2;
        c0371o.U(-1609814206);
        int i8 = (c0371o.i(c0468k1) ? 4 : 2) | i7 | (c0371o.e(i) ? 32 : 16);
        if (c0371o.K(i8 & 1, (i8 & 147) != 146)) {
            Boolean bool = Boolean.TRUE;
            boolean zI = c0371o.i(c0468k1);
            Object objH = c0371o.H();
            if (zI || objH == C0363k.f5418a) {
                objH = new b0(c0468k1, null);
                c0371o.d0(objH);
            }
            C0345b.e((B5.e) objH, c0371o, bool);
            interfaceC0725m2 = interfaceC0725m;
            c0371o2 = c0371o;
            D5.a.c(AbstractC0836n2.F(i, c0371o, (i8 >> 3) & 14), null, interfaceC0725m2, null, C1949i.f18697d, 0.0f, null, c0371o2, 25008, 104);
        } else {
            interfaceC0725m2 = interfaceC0725m;
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new X(c0468k1, i, interfaceC0725m2, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s(C0468k1 mainScreenObjects, C0371o c0371o, int i) {
        kotlin.jvm.internal.m.e(mainScreenObjects, "mainScreenObjects");
        c0371o.U(-1106270840);
        int i7 = (c0371o.i(mainScreenObjects) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            AbstractC1127b.a(X.k.d(-41031455, new H0(mainScreenObjects, 9), c0371o), c0371o, 384, 3);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 10, mainScreenObjects);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void t(int i, String str, boolean z5, C0371o c0371o, final int i7, final int i8) {
        int i9;
        int i10;
        String str2;
        int i11;
        final boolean z6;
        final int i12;
        final String str3;
        c0371o.U(2070399501);
        int i13 = i8 & 1;
        if (i13 != 0) {
            i10 = i7 | 6;
            i9 = i;
        } else {
            i9 = i;
            i10 = i7 | (c0371o.e(i9) ? 4 : 2);
        }
        int i14 = i8 & 2;
        if (i14 != 0) {
            i11 = i10 | 48;
            str2 = str;
        } else {
            str2 = str;
            i11 = i10 | (c0371o.g(str2) ? 32 : 16);
        }
        int i15 = i11 | 384;
        if (c0371o.K(i15 & 1, (i15 & 147) != 146)) {
            int i16 = i13 != 0 ? -1 : i9;
            String str4 = i14 != 0 ? "#ffffff" : str2;
            c0371o.S(-755315371);
            c0371o.p(false);
            i12 = i16;
            str3 = str4;
            z6 = true;
        } else {
            c0371o.N();
            z6 = z5;
            i12 = i9;
            str3 = str2;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(i12, str3, z6, i7, i8) { // from class: U4.c

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ int f7800q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f7801r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ boolean f7802s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f7803t;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f7803t = i8;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(1);
                    AbstractC0534a.t(this.f7800q, this.f7801r, this.f7802s, (C0371o) obj, iW, this.f7803t);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(C0468k1 dataObject, C0371o c0371o, int i) {
        C0371o c0371o2;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        c0371o.U(-358613940);
        int i7 = (c0371o.i(dataObject) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            boolean zI = c0371o.i(dataObject);
            Object objH = c0371o.H();
            if (zI || objH == C0363k.f5418a) {
                objH = new C0548o(dataObject, 1);
                c0371o.d0(objH);
            }
            c0371o2 = c0371o;
            androidx.compose.ui.viewinterop.a.b((B5.c) objH, null, null, c0371o2, 0, 6);
        } else {
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new H0(i, 5, dataObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final R4.C0468k1 r45, P.C0371o r46, int r47) {
        /*
            r1 = r45
            r0 = r46
            java.lang.String r2 = "dataObject"
            kotlin.jvm.internal.m.e(r1, r2)
            j5.a r2 = r1.f7090n
            com.web2native.MainActivity r3 = r1.f7067a
            com.web2native.MainActivity r4 = r1.f7071c
            j5.d r5 = r1.f7098t
            r6 = 1811553195(0x6bfa1bab, float:6.0472423E26)
            r0.U(r6)
            boolean r6 = r0.i(r1)
            r7 = 2
            if (r6 == 0) goto L20
            r6 = 4
            goto L21
        L20:
            r6 = r7
        L21:
            r18 = r47 | r6
            r6 = r18 & 3
            r9 = 0
            if (r6 == r7) goto L2a
            r6 = 1
            goto L2b
        L2a:
            r6 = r9
        L2b:
            r7 = r18 & 1
            boolean r6 = r0.K(r7, r6)
            if (r6 == 0) goto L590
            P5.S r6 = r5.f13879m
            P.C0345b.j(r6, r0)
            P5.S r6 = r5.f13881o
            P.W r6 = P.C0345b.j(r6, r0)
            P5.D r7 = r5.f13872c
            P.W r12 = P.C0345b.j(r7, r0)
            P5.S r7 = r5.f13886t
            P.W r17 = P.C0345b.j(r7, r0)
            java.lang.Object r7 = r0.H()
            P.S r11 = P.C0363k.f5418a
            if (r7 != r11) goto L65
            R4.i r7 = r1.f7073d
            if (r7 == 0) goto L5d
            R4.f1 r7 = r7.f
            if (r7 == 0) goto L5d
            java.lang.String r7 = r7.f6951d
            goto L5e
        L5d:
            r7 = 0
        L5e:
            P.f0 r7 = P.C0345b.q(r7)
            r0.d0(r7)
        L65:
            r13 = r7
            P.W r13 = (P.W) r13
            k5.b r7 = r1.f7086l
            kotlin.jvm.internal.m.b(r7)
            androidx.lifecycle.J r7 = r7.f14129c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r15 = 48
            P.W r14 = com.google.android.gms.internal.measurement.K1.z(r7, r14, r0, r15)
            P5.S r7 = r2.f13851c
            P.W r19 = P.C0345b.j(r7, r0)
            P5.S r2 = r2.f13853e
            P.W r2 = P.C0345b.j(r2, r0)
            k5.b r7 = r1.f7086l
            if (r7 == 0) goto L8c
            P5.D r7 = r7.f14131e
            goto L8d
        L8c:
            r7 = 0
        L8d:
            kotlin.jvm.internal.m.b(r7)
            P.W r7 = P.C0345b.j(r7, r0)
            P5.S r15 = r5.f13877k
            P.W r15 = P.C0345b.j(r15, r0)
            B0.o r10 = r1.f7051K
            if (r10 == 0) goto La7
            java.lang.Object r10 = r10.f500r
            a5.y r10 = (a5.y) r10
            if (r10 == 0) goto La7
            P5.D r10 = r10.f9009c
            goto La8
        La7:
            r10 = 0
        La8:
            if (r10 != 0) goto Lb5
            r10 = 1718299302(0x666b2aa6, float:2.7763571E23)
            r0.S(r10)
            r0.p(r9)
            r8 = 0
            goto Lc2
        Lb5:
            r8 = 1440902331(0x55e26cbb, float:3.11195777E13)
            r0.S(r8)
            P.W r8 = P.C0345b.j(r10, r0)
            r0.p(r9)
        Lc2:
            P.T0 r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9341b
            java.lang.Object r10 = r0.k(r10)
            android.content.Context r10 = (android.content.Context) r10
            android.content.res.Resources r21 = r10.getResources()
            android.content.res.Configuration r9 = r21.getConfiguration()
            int r9 = r9.orientation
            r21 = r2
            P5.S r2 = r5.f13889w
            P.W r2 = P.C0345b.j(r2, r0)
            r23 = r2
            P5.S r2 = r5.f13891y
            P.W r2 = P.C0345b.j(r2, r0)
            r24 = r2
            r2 = 1
            if (r9 != r2) goto Leb
            r9 = r2
            goto Lec
        Leb:
            r9 = 0
        Lec:
            P5.S r2 = r5.f13866A
            P.W r2 = P.C0345b.j(r2, r0)
            r25 = r2
            P5.S r2 = r5.f13867B
            P.W r2 = P.C0345b.j(r2, r0)
            java.lang.Object r26 = r15.getValue()
            r27 = r2
            r2 = r26
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            r26 = r3
            android.webkit.WebView r3 = r1.f7084k
            if (r3 == 0) goto L112
            java.lang.String r3 = r3.getUrl()
            goto L113
        L112:
            r3 = 0
        L113:
            boolean r28 = r0.i(r1)
            boolean r29 = r0.g(r15)
            r28 = r28 | r29
            r29 = r7
            java.lang.Object r7 = r0.H()
            if (r28 != 0) goto L12b
            if (r7 != r11) goto L128
            goto L12b
        L128:
            r28 = r8
            goto L136
        L12b:
            U4.J r7 = new U4.J
            r28 = r8
            r8 = 0
            r7.<init>(r1, r15, r8)
            r0.d0(r7)
        L136:
            B5.e r7 = (B5.e) r7
            P.C0345b.f(r2, r3, r7, r0)
            java.lang.Object r2 = r29.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.i(r1)
            java.lang.Object r7 = r0.H()
            if (r3 != 0) goto L14d
            if (r7 != r11) goto L156
        L14d:
            U4.K r7 = new U4.K
            r8 = 0
            r7.<init>(r1, r8)
            r0.d0(r7)
        L156:
            B5.e r7 = (B5.e) r7
            P.C0345b.e(r7, r0, r2)
            java.lang.Object r2 = r0.H()
            if (r2 != r11) goto L170
            int r2 = w(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            P.f0 r2 = P.C0345b.q(r2)
            r0.d0(r2)
        L170:
            P.W r2 = (P.W) r2
            int r3 = w(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r7 = r0.g(r6)
            boolean r8 = r0.i(r1)
            r7 = r7 | r8
            java.lang.Object r8 = r0.H()
            if (r7 != 0) goto L18b
            if (r8 != r11) goto L194
        L18b:
            U4.M r8 = new U4.M
            r7 = 0
            r8.<init>(r1, r6, r2, r7)
            r0.d0(r8)
        L194:
            B5.e r8 = (B5.e) r8
            P.C0345b.e(r8, r0, r3)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r3 = r0.i(r1)
            java.lang.Object r7 = r0.H()
            if (r3 != 0) goto L1a7
            if (r7 != r11) goto L1b0
        L1a7:
            U4.N r7 = new U4.N
            r8 = 0
            r7.<init>(r1, r8)
            r0.d0(r7)
        L1b0:
            B5.e r7 = (B5.e) r7
            P.C0345b.e(r7, r0, r2)
            java.lang.Object r3 = r0.H()
            r7 = 1072064102(0x3fe66666, float:1.8)
            if (r3 != r11) goto L1e2
            java.lang.Object r3 = r6.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            P.c0 r8 = r5.f13883q
            int r8 = r8.e()
            float r8 = (float) r8
            float r8 = r8 * r7
            float r3 = r3 - r8
            float r3 = z(r3, r4)
            W0.f r8 = new W0.f
            r8.<init>(r3)
            P.f0 r3 = P.C0345b.q(r8)
            r0.d0(r3)
        L1e2:
            P.W r3 = (P.W) r3
            java.lang.Object r8 = r6.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            P.c0 r15 = r5.f13883q
            int r15 = r15.e()
            float r15 = (float) r15
            float r15 = r15 * r7
            float r8 = r8 - r15
            float r7 = z(r8, r4)
            W0.f r8 = new W0.f
            r8.<init>(r7)
            boolean r7 = r0.g(r6)
            boolean r15 = r0.i(r1)
            r7 = r7 | r15
            java.lang.Object r15 = r0.H()
            if (r7 != 0) goto L215
            if (r15 != r11) goto L213
            goto L215
        L213:
            r7 = 0
            goto L21e
        L215:
            U4.O r15 = new U4.O
            r7 = 0
            r15.<init>(r1, r6, r3, r7)
            r0.d0(r15)
        L21e:
            B5.e r15 = (B5.e) r15
            P.C0345b.e(r15, r0, r8)
            java.lang.Object r3 = r0.H()
            if (r3 != r11) goto L230
            P.f0 r3 = P.C0345b.q(r2)
            r0.d0(r3)
        L230:
            r29 = r3
            P.W r29 = (P.W) r29
            r3 = 1711584951(0x6604b6b7, float:1.5668072E23)
            r0.S(r3)
            r3 = 0
            r0.p(r3)
            R4.V r8 = r1.f7095q
            if (r8 == 0) goto L24b
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r22 = r8.equals(r2)
            r2 = r22
            goto L24c
        L24b:
            r2 = r3
        L24c:
            R4.V r8 = r1.f7095q
            if (r8 == 0) goto L252
            r8 = 0
            goto L253
        L252:
            float r8 = (float) r3
        L253:
            androidx.lifecycle.J r15 = r5.f13887u
            java.lang.Object r7 = r15.d()
            P.W r15 = com.google.android.gms.internal.measurement.K1.z(r15, r7, r0, r3)
            r7 = r2
            kotlin.jvm.internal.v r2 = new kotlin.jvm.internal.v
            r2.<init>()
            r30 = r6
            float r6 = (float) r3
            r2.f14265q = r6
            P.T0 r3 = C0.AbstractC0103t0.f1116h
            java.lang.Object r3 = r0.k(r3)
            W0.c r3 = (W0.c) r3
            r3 = 1722595188(0x66acb774, float:4.0781557E23)
            r0.S(r3)
            r3 = 0
            r0.p(r3)
            P5.S r3 = r5.f13868C
            P.W r31 = P.C0345b.j(r3, r0)
            P.T0 r3 = C0.AbstractC0103t0.f1120n
            java.lang.Object r3 = r0.k(r3)
            W0.l r3 = (W0.l) r3
            r3 = 1722889812(0x66b13654, float:4.1843052E23)
            r0.S(r3)
            r3 = 0
            r0.p(r3)
            r32 = r2
            r2 = 1723031668(0x66b36074, float:4.2354142E23)
            r0.S(r2)
            r0.p(r3)
            R4.V r2 = r1.f7058R
            if (r2 == 0) goto L2c6
            java.lang.Object r2 = r23.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            android.content.res.Resources r2 = r10.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            java.lang.Object r2 = r21.getValue()
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L2c6
            java.lang.Object r2 = r24.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
        L2c6:
            java.lang.Object r2 = r0.H()
            if (r2 != r11) goto L2e0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r2 < r3) goto L2d4
            r3 = 1
            goto L2d5
        L2d4:
            r3 = 0
        L2d5:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            P.f0 r2 = P.C0345b.q(r2)
            r0.d0(r2)
        L2e0:
            r23 = r2
            P.W r23 = (P.W) r23
            java.lang.Object r2 = r0.H()
            if (r2 != r11) goto L316
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 >= r3) goto L307
            android.content.res.Resources r2 = r4.getResources()
            java.lang.String r3 = "dimen"
            java.lang.String r9 = "android"
            r24 = r6
            java.lang.String r6 = "navigation_bar_height"
            int r3 = r2.getIdentifier(r6, r3, r9)
            if (r3 <= 0) goto L309
            int r3 = r2.getDimensionPixelSize(r3)
            goto L30a
        L307:
            r24 = r6
        L309:
            r3 = 0
        L30a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            P.f0 r2 = P.C0345b.q(r2)
            r0.d0(r2)
            goto L318
        L316:
            r24 = r6
        L318:
            P.W r2 = (P.W) r2
            java.lang.Object r3 = r30.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r3 = r3 - r24
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            float r3 = r3 - r2
            float r3 = z(r3, r4)
            P.c0 r2 = r5.f13884r
            R4.V r4 = r1.f7093o0
            if (r4 == 0) goto L342
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r16 = r4
            goto L344
        L342:
            r16 = 0
        L344:
            int r2 = r2.e()
            float r2 = (float) r2
            float r2 = z(r2, r10)
            P5.S r4 = r5.f13870E
            P.W r4 = P.C0345b.j(r4, r0)
            androidx.compose.foundation.layout.FillElement r5 = androidx.compose.foundation.layout.c.f9279c
            c0.e r6 = c0.C0714b.f10076q
            r9 = 0
            z0.C r10 = A.AbstractC0017n.d(r6, r9)
            int r9 = r0.f5454P
            P.i0 r1 = r0.m()
            r30 = r2
            c0.m r2 = c0.AbstractC0727o.c(r0, r5)
            B0.j r33 = B0.InterfaceC0046k.f452a
            r33.getClass()
            r33 = r3
            B0.D r3 = B0.C0045j.f445b
            r0.W()
            r34 = r4
            boolean r4 = r0.f5453O
            if (r4 == 0) goto L37e
            r0.l(r3)
            goto L381
        L37e:
            r0.g0()
        L381:
            B0.i r4 = B0.C0045j.f448e
            P.C0345b.u(r4, r0, r10)
            B0.i r10 = B0.C0045j.f447d
            P.C0345b.u(r10, r0, r1)
            B0.i r1 = B0.C0045j.f
            r35 = r3
            boolean r3 = r0.f5453O
            if (r3 != 0) goto L3a4
            java.lang.Object r3 = r0.H()
            r36 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            boolean r3 = kotlin.jvm.internal.m.a(r3, r4)
            if (r3 != 0) goto L3a9
            goto L3a6
        L3a4:
            r36 = r4
        L3a6:
            k1.i.o(r9, r0, r9, r1)
        L3a9:
            B0.i r3 = B0.C0045j.f446c
            P.C0345b.u(r3, r0, r2)
            java.lang.Object r2 = r29.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            c0.j r4 = c0.C0722j.f10095q
            c0.m r37 = A(r4, r2)
            U4.F r0 = new U4.F
            r42 = r1
            r43 = r3
            r20 = r5
            r38 = r6
            r4 = r7
            r5 = r8
            r41 = r10
            r44 = r11
            r10 = r16
            r9 = r21
            r16 = r25
            r7 = r27
            r6 = r28
            r11 = r30
            r2 = r32
            r3 = r33
            r8 = r34
            r39 = r35
            r40 = r36
            r1 = r45
            r0.<init>()
            r15 = r1
            r16 = r13
            r17 = r14
            r1 = -91924298(0xfffffffffa8558b6, float:-3.4618738E35)
            r3 = r46
            X.e r11 = X.k.d(r1, r0, r3)
            r13 = 805306368(0x30000000, float:4.656613E-10)
            r14 = 510(0x1fe, float:7.15E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = r46
            r22 = r21
            r0 = r37
            M.z0.a(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
            r3 = r12
            java.lang.Object r0 = r19.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = -2095344515(0xffffffff831b947d, float:-4.5720862E-37)
            if (r0 == 0) goto L456
            java.lang.Object r0 = r22.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L456
            r0 = -2076408723(0xffffffff843c846d, float:-2.21601E-36)
            r3.S(r0)
            r9 = r22
            boolean r0 = r3.g(r9)
            java.lang.Object r1 = r3.H()
            if (r0 != 0) goto L43c
            r0 = r44
            if (r1 != r0) goto L445
        L43c:
            U4.m r1 = new U4.m
            r0 = 1
            r1.<init>(r9, r0)
            r3.d0(r1)
        L445:
            r0 = r1
            B5.c r0 = (B5.c) r0
            r4 = 48
            r5 = 4
            r2 = 0
            r1 = r20
            androidx.compose.ui.viewinterop.a.b(r0, r1, r2, r3, r4, r5)
            r7 = 0
        L452:
            r3.p(r7)
            goto L45f
        L456:
            r1 = r20
            r9 = r22
            r7 = 0
            r3.S(r6)
            goto L452
        L45f:
            java.lang.Object r0 = r29.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            c0.m r0 = A(r1, r0)
            r1 = r38
            z0.C r1 = A.AbstractC0017n.d(r1, r7)
            int r2 = r3.f5454P
            P.i0 r4 = r3.m()
            c0.m r0 = c0.AbstractC0727o.c(r3, r0)
            r3.W()
            boolean r5 = r3.f5453O
            if (r5 == 0) goto L48c
            r5 = r39
            r3.l(r5)
        L489:
            r5 = r40
            goto L490
        L48c:
            r3.g0()
            goto L489
        L490:
            P.C0345b.u(r5, r3, r1)
            r1 = r41
            P.C0345b.u(r1, r3, r4)
            boolean r1 = r3.f5453O
            if (r1 != 0) goto L4aa
            java.lang.Object r1 = r3.H()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r1 = kotlin.jvm.internal.m.a(r1, r4)
            if (r1 != 0) goto L4ad
        L4aa:
            r1 = r42
            goto L4b0
        L4ad:
            r1 = r43
            goto L4b4
        L4b0:
            k1.i.o(r2, r3, r2, r1)
            goto L4ad
        L4b4:
            P.C0345b.u(r1, r3, r0)
            java.lang.Object r0 = r16.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4e9
            java.lang.Object r0 = r16.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "CircularLoader"
            boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
            if (r0 == 0) goto L4e9
            r0 = -858291139(0xffffffffccd7843d, float:-1.12992744E8)
            r3.S(r0)
            java.lang.Object r0 = r17.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r18 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            e(r0, r15, r3, r1)
            r3.p(r7)
        L4e7:
            r8 = 1
            goto L521
        L4e9:
            java.lang.Object r0 = r16.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L51a
            java.lang.Object r0 = r16.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "LottieAnimation"
            boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
            if (r0 == 0) goto L51a
            r0 = -858285667(0xffffffffccd7999d, float:-1.1303652E8)
            r3.S(r0)
            java.lang.Object r0 = r17.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r18 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            a(r0, r15, r3, r1)
        L516:
            r3.p(r7)
            goto L4e7
        L51a:
            r0 = -856572413(0xffffffffccf1be03, float:-1.26742552E8)
            r3.S(r0)
            goto L516
        L521:
            r3.p(r8)
            java.lang.Object r0 = r23.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L588
            java.lang.Object r0 = r9.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L588
            r0 = -2075642713(0xffffffff844834a7, float:-2.3534064E-36)
            r3.S(r0)
            java.lang.Object r0 = r31.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = 0
            r5 = 6
            r1 = 0
            r2 = 0
            t(r0, r1, r2, r3, r4, r5)
            android.content.res.Resources r0 = r26.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r24 / r0
            java.lang.String r0 = "BOTTOM"
            r1 = 3126(0xc36, float:4.38E-42)
            l(r7, r0, r6, r3, r1)
            android.content.res.Resources r0 = r26.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r24 / r0
            java.lang.String r0 = "START"
            l(r7, r0, r6, r3, r1)
            android.content.res.Resources r0 = r26.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r24 / r0
            java.lang.String r0 = "END"
            l(r7, r0, r6, r3, r1)
        L584:
            r3.p(r7)
            goto L58c
        L588:
            r3.S(r6)
            goto L584
        L58c:
            r3.p(r8)
            goto L595
        L590:
            r3 = r0
            r15 = r1
            r3.N()
        L595:
            P.o0 r0 = r3.r()
            if (r0 == 0) goto L5a5
            R4.H0 r1 = new R4.H0
            r2 = 7
            r3 = r47
            r1.<init>(r3, r2, r15)
            r0.f5482d = r1
        L5a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.AbstractC0534a.v(R4.k1, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int w(P.W w3) {
        return ((Number) w3.getValue()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void x(C0468k1 c0468k1) {
        try {
            AbstractC0263y.t(androidx.lifecycle.X.f(c0468k1.f7071c), null, null, new g0(c0468k1, null), 3);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void y(C0468k1 c0468k1) {
        WebView webView = c0468k1.f7084k;
        if ((webView != null ? webView.getUrl() : null) != null) {
            if (webView != null) {
                webView.loadUrl(String.valueOf(webView.getUrl()));
            }
        } else if (webView != null) {
            webView.loadUrl(c0468k1.j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float z(float f, Context context) {
        float f7 = f / (context.getResources().getDisplayMetrics().densityDpi / 160);
        if (f7 < 0.0f) {
            return 0.0f;
        }
        return f7;
    }
}
