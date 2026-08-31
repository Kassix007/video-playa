package L;

import B0.C0054t;
import B0.G0;
import B0.L;
import B0.N;
import C0.A;
import C0.H0;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import O3.D;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.O1;
import i0.C1130b;
import i0.C1133e;
import i1.C1134a;
import i3.C1136a;
import java.io.IOException;
import java.util.ArrayList;
import k6.C1191a;
import l0.C1219b;
import l0.InterfaceC1221d;
import q.AbstractC1485a;
import q.AbstractC1486b;
import q.AbstractC1487c;
import r.C1566q;
import u.A0;
import u.AbstractC1670y;
import u.C1642c;
import u.z0;
import v0.C1743l;
import v0.v;
import y.C1903a;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3065e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: B5.a */
    /* JADX WARN: Multi-variable type inference failed */
    public s(boolean z5, B5.a aVar) {
        this.f3061a = z5;
        this.f3062b = (kotlin.jvm.internal.n) aVar;
        this.f3063c = new C1642c(Float.valueOf(0.0f), A0.f16746a, Float.valueOf(0.01f));
        this.f3064d = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IOException a(boolean z5, boolean z6, IOException iOException) {
        h6.h hVar = (h6.h) this.f3062b;
        if (iOException != null) {
            g(iOException);
        }
        return hVar.h(this, z6, z5, iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Z.m b() {
        Intent intent = (Intent) this.f3062b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3061a);
        ((D) this.f3063c).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.f3065e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String strA = AbstractC1486b.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f3064d) == null) {
                this.f3064d = AbstractC1485a.a();
            }
            AbstractC1487c.a((ActivityOptions) this.f3064d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f3064d;
        return new Z.m(23, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(N n7, float f, long j) {
        C1219b c1219b = n7.f296q;
        float fFloatValue = ((Number) ((C1642c) this.f3063c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = j0.o.b(j, fFloatValue);
            if (!this.f3061a) {
                InterfaceC1221d.V(n7, jB, f, 0L, 124);
                return;
            }
            float fD = C1133e.d(c1219b.d());
            float fB = C1133e.b(c1219b.d());
            G0 g02 = c1219b.f14425r;
            long jE = g02.E();
            g02.t().k();
            try {
                ((G0) ((C1134a) g02.f234r).f13535r).t().g(0.0f, 0.0f, fD, fB, 1);
                InterfaceC1221d.V(n7, jB, f, 0L, 124);
            } finally {
                g02.t().i();
                g02.X(jE);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [B5.a, kotlin.jvm.internal.n] */
    public void d(y.h hVar, InterfaceC0261w interfaceC0261w) {
        ArrayList arrayList = (ArrayList) this.f3064d;
        boolean z5 = hVar instanceof y.f;
        if (z5) {
            arrayList.add(hVar);
        } else if (hVar instanceof y.g) {
            arrayList.remove(((y.g) hVar).f18531a);
        } else if (hVar instanceof y.d) {
            arrayList.add(hVar);
        } else if (hVar instanceof y.e) {
            arrayList.remove(((y.e) hVar).f18530a);
        } else if (hVar instanceof y.b) {
            arrayList.add(hVar);
        } else if (hVar instanceof y.c) {
            arrayList.remove(((y.c) hVar).f18529a);
        } else if (!(hVar instanceof C1903a)) {
            return;
        } else {
            arrayList.remove(((C1903a) hVar).f18528a);
        }
        y.h hVar2 = (y.h) n5.l.s0(arrayList);
        if (kotlin.jvm.internal.m.a((y.h) this.f3065e, hVar2)) {
            return;
        }
        if (hVar2 != null) {
            g gVar = (g) ((kotlin.jvm.internal.n) this.f3062b).invoke();
            float f = z5 ? gVar.f3031c : hVar instanceof y.d ? gVar.f3030b : hVar instanceof y.b ? gVar.f3029a : 0.0f;
            z0 z0Var = l.f3046a;
            if (!(hVar2 instanceof y.f) && ((hVar2 instanceof y.d) || (hVar2 instanceof y.b))) {
                z0Var = new z0(45, AbstractC1670y.f17084b, 2);
            }
            AbstractC0263y.t(interfaceC0261w, null, null, new q(this, f, z0Var, null), 3);
        } else {
            y.h hVar3 = (y.h) this.f3065e;
            z0 z0Var2 = l.f3046a;
            if (!(hVar3 instanceof y.f) && !(hVar3 instanceof y.d) && (hVar3 instanceof y.b)) {
                z0Var2 = new z0(150, AbstractC1670y.f17084b, 2);
            }
            AbstractC0263y.t(interfaceC0261w, null, null, new r(this, z0Var2, null), 3);
        }
        this.f3065e = hVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public int e(Z.m mVar, A a7, boolean z5) {
        Object[] objArr;
        int i;
        H0 h02 = (H0) this.f3063c;
        C0054t c0054t = (C0054t) this.f3065e;
        if (this.f3061a) {
            return 0;
        }
        try {
            this.f3061a = true;
            O1 o1S = ((C1136a) this.f3064d).s(mVar, a7);
            C1566q c1566q = (C1566q) o1S.f10680b;
            int iG = c1566q.g();
            for (int i7 = 0; i7 < iG; i7++) {
                C1743l c1743l = (C1743l) c1566q.h(i7);
                if (!c1743l.f17463d && !c1743l.f17466h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iG2 = c1566q.g();
            for (int i8 = 0; i8 < iG2; i8++) {
                C1743l c1743l2 = (C1743l) c1566q.h(i8);
                if (objArr != false || v.a(c1743l2)) {
                    ((L) this.f3062b).y(c1743l2.f17462c, (C0054t) this.f3065e, c1743l2.i, true);
                    if (!c0054t.f513q.g()) {
                        h02.a(c1743l2.f17460a, c0054t, v.a(c1743l2));
                        c0054t.clear();
                    }
                }
            }
            boolean zC = h02.c(o1S, z5);
            if (o1S.f10679a) {
                i = 0;
            } else {
                int iG3 = c1566q.g();
                for (int i9 = 0; i9 < iG3; i9++) {
                    C1743l c1743l3 = (C1743l) c1566q.h(i9);
                    if (!C1130b.b(v.f(c1743l3, true), 0L) && c1743l3.b()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int i10 = (zC ? 1 : 0) | (i << 1);
            this.f3061a = false;
            return i10;
        } catch (Throwable th) {
            this.f3061a = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d6.t f(boolean z5) throws IOException {
        try {
            d6.t tVarF = ((i6.d) this.f3064d).f(z5);
            if (tVarF == null) {
                return tVarF;
            }
            tVarF.f12427m = this;
            return tVarF;
        } catch (IOException e7) {
            g(e7);
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(IOException iOException) {
        this.f3061a = true;
        ((h6.d) this.f3063c).c(iOException);
        h6.j jVarG = ((i6.d) this.f3064d).g();
        h6.h hVar = (h6.h) this.f3062b;
        synchronized (jVarG) {
            try {
                if (!(iOException instanceof k6.A)) {
                    if (!(jVarG.f13504g != null) || (iOException instanceof C1191a)) {
                        jVarG.j = true;
                        if (jVarG.f13508m == 0) {
                            h6.j.d(hVar.f13489q, jVarG.f13500b, iOException);
                            jVarG.f13507l++;
                        }
                    }
                } else if (((k6.A) iOException).f14132q == 8) {
                    int i = jVarG.f13509n + 1;
                    jVarG.f13509n = i;
                    if (i > 1) {
                        jVarG.j = true;
                        jVarG.f13507l++;
                    }
                } else if (((k6.A) iOException).f14132q != 9 || !hVar.f13486C) {
                    jVarG.j = true;
                    jVarG.f13507l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public s() {
        this.f3062b = new Intent("android.intent.action.VIEW");
        this.f3063c = new D(27);
        this.f3061a = true;
    }
}
