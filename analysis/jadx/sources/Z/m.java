package Z;

import C0.S;
import E.c0;
import E1.t;
import M.C0231t;
import O3.Q0;
import R4.C0468k1;
import a3.J;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.C0649l;
import androidx.lifecycle.EnumC0653p;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.clearcut.AbstractC0738b;
import com.google.android.gms.internal.clearcut.C0736a;
import com.google.android.gms.internal.clearcut.InterfaceC0744e;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import d2.AbstractC0974V;
import d2.b0;
import d2.e0;
import d2.f0;
import d2.g0;
import g2.C1081a;
import h.y;
import i2.C1135a;
import i3.C1136a;
import j2.InterfaceC1159e;
import j2.InterfaceC1160f;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import k.AbstractC1168a;
import l.MenuC1194A;
import l.MenuC1209l;
import l4.p;
import l4.q;
import m5.C1371j;
import o3.C1416b;
import r.C1566q;
import r.Q;
import r.r;
import u.C1658l;
import u.EnumC1654i;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.InterfaceC1850m;
import w1.O;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public class m implements l, InterfaceC0744e, InterfaceC1160f, InterfaceC1850m, S3.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f8312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8313s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.f8311q = i;
        this.f8312r = obj;
        this.f8313s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m(int i, int i7) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i8++;
            if (i8 == i7) {
                i9++;
                i8 = 0;
            } else if (i8 > i7) {
                i9++;
                i8 = 1;
            }
        }
        return i8 + 1 > i7 ? i9 + 1 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z.m s(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            q6.j[] r0 = new q6.C1541j[r0]     // Catch: java.io.IOException -> L6d
            q6.g r1 = new q6.g     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = m3.AbstractC1360a.f15055u     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.e0(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.794E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.j0(r4, r9, r8)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.i0(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.j0(r4, r9, r7)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.e0(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.f16063r     // Catch: java.io.IOException -> L6d
            q6.j r4 = r1.k(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            Z.m r1 = new Z.m     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            q6.w r0 = com.google.android.gms.internal.measurement.I1.y0(r0)     // Catch: java.io.IOException -> L6d
            r2 = 20
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.m.s(java.lang.String[]):Z.m");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(Bundle bundle) {
        C1135a c1135a = (C1135a) this.f8312r;
        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        Bundle bundle2 = c1135a.f;
        if (bundle2 != null) {
            bundleG.putAll(bundle2);
        }
        synchronized (c1135a.f13556c) {
            for (Map.Entry entry : c1135a.f13557d.entrySet()) {
                P1.H(bundleG, (String) entry.getKey(), ((g2.d) entry.getValue()).a());
            }
        }
        if (bundleG.isEmpty()) {
            return;
        }
        P1.H(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0231t B(AbstractC0974V abstractC0974V, int i) {
        g0 g0Var;
        C0231t c0231t;
        Q q7 = (Q) this.f8312r;
        int iD = q7.d(abstractC0974V);
        if (iD >= 0 && (g0Var = (g0) q7.i(iD)) != null) {
            int i7 = g0Var.f12117a;
            if ((i7 & i) != 0) {
                int i8 = i7 & (~i);
                g0Var.f12117a = i8;
                if (i == 4) {
                    c0231t = g0Var.f12118b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0231t = g0Var.f12119c;
                }
                if ((i8 & 12) == 0) {
                    q7.g(iD);
                    g0Var.f12117a = 0;
                    g0Var.f12118b = null;
                    g0Var.f12119c = null;
                    g0.f12116d.c(g0Var);
                }
                return c0231t;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(String str, g2.d provider) {
        kotlin.jvm.internal.m.e(provider, "provider");
        C1135a c1135a = (C1135a) this.f8312r;
        synchronized (c1135a.f13556c) {
            if (c1135a.f13557d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c1135a.f13557d.put(str, provider);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(AbstractC0974V abstractC0974V) {
        g0 g0Var = (g0) ((Q) this.f8312r).get(abstractC0974V);
        if (g0Var == null) {
            return;
        }
        g0Var.f12117a &= -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void E(AbstractC0974V abstractC0974V) {
        C1566q c1566q = (C1566q) this.f8313s;
        int iG = c1566q.g() - 1;
        while (true) {
            if (iG < 0) {
                break;
            }
            if (abstractC0974V == c1566q.h(iG)) {
                Object[] objArr = c1566q.f16237s;
                Object obj = objArr[iG];
                Object obj2 = r.f16239a;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    c1566q.f16235q = true;
                }
            } else {
                iG--;
            }
        }
        g0 g0Var = (g0) ((Q) this.f8312r).remove(abstractC0974V);
        if (g0Var != null) {
            g0Var.f12117a = 0;
            g0Var.f12118b = null;
            g0Var.f12119c = null;
            g0.f12116d.c(g0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F() {
        if (!((C1135a) this.f8312r).f13560h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1081a c1081a = (C1081a) this.f8313s;
        if (c1081a == null) {
            c1081a = new C1081a(this);
        }
        this.f8313s = c1081a;
        try {
            C0649l.class.getDeclaredConstructor(null);
            C1081a c1081a2 = (C1081a) this.f8313s;
            if (c1081a2 != null) {
                ((LinkedHashSet) c1081a2.f13035b).add(C0649l.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C0649l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean G(Integer num, Integer num2) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f8313s;
        int i = sharedPreferences.getInt("lastShowTimeStamp", -1);
        int i7 = sharedPreferences.getInt("versionCode", -1);
        int i8 = sharedPreferences.getInt("version", 1);
        if ((num2 != null && i8 != num2.intValue()) || i == -1 || i7 == -1) {
            return true;
        }
        if (sharedPreferences.getBoolean("showOnAppUpdate", false) && k() != i7) {
            return true;
        }
        if (num == null || num.intValue() != -1) {
            int iCurrentTimeMillis = ((int) (System.currentTimeMillis() / ((long) 86400000))) - i;
            if (num != null && iCurrentTimeMillis == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0044 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x002e */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC0744e
    public Object a() {
        AbstractC0738b abstractC0738b = (AbstractC0738b) this.f8312r;
        C0736a c0736a = (C0736a) this.f8313s;
        c0736a.getClass();
        Map mapA = AbstractC0738b.d() ? ((Boolean) AbstractC0738b.b(new t("gms:phenotype:phenotype_flag:debug_disable_caching", false))).booleanValue() : false ? c0736a.a() : c0736a.f10480e;
        if (mapA == null) {
            synchronized (c0736a.f10479d) {
                try {
                    HashMap map = c0736a.f10480e;
                    mapA = map;
                    if (map == null) {
                        HashMap mapA2 = c0736a.a();
                        c0736a.f10480e = mapA2;
                        mapA = mapA2;
                    }
                } finally {
                }
            }
        }
        if (mapA == null) {
            mapA = Collections.EMPTY_MAP;
        }
        return (String) mapA.get(abstractC0738b.f10489b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.l
    public Object b(b bVar, Object obj) {
        return ((B5.e) this.f8312r).invoke(bVar, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public o0 c(View view, o0 o0Var) {
        p pVar = (p) this.f8312r;
        q qVar = (q) this.f8313s;
        q qVar2 = new q();
        qVar2.f14582a = qVar.f14582a;
        qVar2.f14583b = qVar.f14583b;
        qVar2.f14584c = qVar.f14584c;
        qVar2.f14585d = qVar.f14585d;
        return pVar.a(view, o0Var, qVar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.l
    public Object d(Object obj) {
        return ((B5.c) this.f8313s).invoke(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1160f
    public String e() {
        return (String) this.f8312r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1160f
    public void f(InterfaceC1159e interfaceC1159e) {
        Q2.g.m(interfaceC1159e, (Object[]) this.f8313s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(AbstractC0974V abstractC0974V, C0231t c0231t) {
        Q q7 = (Q) this.f8312r;
        g0 g0VarA = (g0) q7.get(abstractC0974V);
        if (g0VarA == null) {
            g0VarA = g0.a();
            q7.put(abstractC0974V, g0VarA);
        }
        g0VarA.f12119c = c0231t;
        g0VarA.f12117a |= 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Bundle h(String key) {
        kotlin.jvm.internal.m.e(key, "key");
        C1135a c1135a = (C1135a) this.f8312r;
        if (!c1135a.f13559g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = c1135a.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleK0 = bundle.containsKey(key) ? I1.k0(key, bundle) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            c1135a.f = null;
        }
        return bundleK0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(int i) {
        int[] iArr = (int[]) this.f8312r;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f8312r = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f8312r = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f8312r;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View j(int i, int i7, int i8, int i9) {
        e0 e0Var = (e0) this.f8313s;
        f0 f0Var = (f0) this.f8312r;
        int iN = f0Var.n();
        int iF = f0Var.f();
        int i10 = i7 > i ? 1 : -1;
        View view = null;
        while (i != i7) {
            View viewL = f0Var.l(i);
            int iH = f0Var.h(viewL);
            int iO = f0Var.o(viewL);
            e0Var.f12102b = iN;
            e0Var.f12103c = iF;
            e0Var.f12104d = iH;
            e0Var.f12105e = iO;
            if (i8 != 0) {
                e0Var.f12101a = i8;
                if (e0Var.a()) {
                    return viewL;
                }
            }
            if (i9 != 0) {
                e0Var.f12101a = i9;
                if (e0Var.a()) {
                    view = viewL;
                }
            }
            i += i10;
        }
        return view;
    }

    /* JADX DEBUG: Class process forced to load method for inline: M0.a.b():android.content.pm.PackageManager$PackageInfoFlags */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int k() {
        MainActivity mainActivity = (MainActivity) this.f8312r;
        int i = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i >= 33 ? mainActivity.getPackageManager().getPackageInfo(mainActivity.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : mainActivity.getPackageManager().getPackageInfo(mainActivity.getPackageName(), 0);
        return i >= 28 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g2.d l() {
        g2.d dVar;
        C1135a c1135a = (C1135a) this.f8312r;
        synchronized (c1135a.f13556c) {
            Iterator it = c1135a.f13557d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                g2.d dVar2 = (g2.d) entry.getValue();
                if (kotlin.jvm.internal.m.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object n(C1416b c1416b) {
        return (J) this.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object o(float f, float f7, Object obj, Object obj2, float f8, float f9, float f10) {
        C1416b c1416b = (C1416b) this.f8312r;
        c1416b.f15425a = f;
        c1416b.f15426b = f7;
        c1416b.f = obj;
        c1416b.f15430g = obj2;
        c1416b.f15427c = f8;
        c1416b.f15428d = f9;
        c1416b.f15429e = f10;
        return n(c1416b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.a
    public void onComplete(S3.d dVar) {
        ((Map) ((v3.l) this.f8313s).f17580s).remove((S3.e) this.f8312r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p() {
        ((SparseIntArray) this.f8312r).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean q(View view) {
        e0 e0Var = (e0) this.f8313s;
        f0 f0Var = (f0) this.f8312r;
        int iN = f0Var.n();
        int iF = f0Var.f();
        int iH = f0Var.h(view);
        int iO = f0Var.o(view);
        e0Var.f12102b = iN;
        e0Var.f12103c = iF;
        e0Var.f12104d = iH;
        e0Var.f12105e = iO;
        e0Var.f12101a = 24579;
        return e0Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(String str) {
        C0468k1 c0468k1 = (C0468k1) this.f8312r;
        if (c0468k1.f7053M.b()) {
            if (J5.t.G0(str, "w2n://", false)) {
                C3.a.C(c0468k1, str);
                return;
            }
            WebView webView = c0468k1.f7084k;
            if (webView != null) {
                webView.loadUrl(str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(int i, int i7) {
        int[] iArr = (int[]) this.f8312r;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i8 = i + i7;
        i(i8);
        int[] iArr2 = (int[]) this.f8312r;
        System.arraycopy(iArr2, i, iArr2, i8, (iArr2.length - i) - i7);
        Arrays.fill((int[]) this.f8312r, i, i8, -1);
        ArrayList arrayList = (ArrayList) this.f8313s;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((ArrayList) this.f8313s).get(size);
            int i9 = b0Var.f12066q;
            if (i9 >= i) {
                b0Var.f12066q = i9 + i7;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f8311q) {
            case 2:
                String string = "[ ";
                if (((b1.f) this.f8312r) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbQ = S.q(string);
                        sbQ.append(((b1.f) this.f8312r).f9967x[i]);
                        sbQ.append(" ");
                        string = sbQ.toString();
                    }
                }
                return string + "] " + ((b1.f) this.f8312r);
            case 25:
                return "AnimationResult(endReason=" + ((EnumC1654i) this.f8313s) + ", endState=" + ((C1658l) this.f8312r) + ')';
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(int i, int i7) {
        int[] iArr = (int[]) this.f8312r;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i8 = i + i7;
        i(i8);
        int[] iArr2 = (int[]) this.f8312r;
        System.arraycopy(iArr2, i8, iArr2, i, (iArr2.length - i) - i7);
        int[] iArr3 = (int[]) this.f8312r;
        Arrays.fill(iArr3, iArr3.length - i7, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f8313s;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) ((ArrayList) this.f8313s).get(size);
            int i9 = b0Var.f12066q;
            if (i9 >= i) {
                if (i9 < i8) {
                    ((ArrayList) this.f8313s).remove(size);
                } else {
                    b0Var.f12066q = i9 - i7;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v(AbstractC1168a abstractC1168a) {
        c0 c0Var = (c0) this.f8312r;
        ((ActionMode.Callback) c0Var.f1552q).onDestroyActionMode(c0Var.k(abstractC1168a));
        y yVar = (y) this.f8313s;
        if (yVar.f13354M != null) {
            yVar.f13343B.getDecorView().removeCallbacks(yVar.f13355N);
        }
        if (yVar.f13353L != null) {
            O o6 = yVar.f13356O;
            if (o6 != null) {
                o6.b();
            }
            O oA = AbstractC1835K.a(yVar.f13353L);
            oA.a(0.0f);
            yVar.f13356O = oA;
            oA.d(new h.p(2, this));
        }
        yVar.f13352K = null;
        ViewGroup viewGroup = yVar.f13359R;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(viewGroup);
        yVar.H();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean w(AbstractC1168a abstractC1168a, Menu menu) {
        ViewGroup viewGroup = ((y) this.f8313s).f13359R;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(viewGroup);
        c0 c0Var = (c0) this.f8312r;
        ActionMode.Callback callback = (ActionMode.Callback) c0Var.f1552q;
        k.e eVarK = c0Var.k(abstractC1168a);
        Q q7 = (Q) c0Var.f1555t;
        Menu menuC1194A = (Menu) q7.get(menu);
        if (menuC1194A == null) {
            menuC1194A = new MenuC1194A((Context) c0Var.f1553r, (MenuC1209l) menu);
            q7.put(menu, menuC1194A);
        }
        return callback.onPrepareActionMode(eVarK, menuC1194A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void x(s1.f fVar) {
        Q0 q02 = (Q0) this.f8313s;
        C1136a c1136a = (C1136a) this.f8312r;
        int i = fVar.f16434b;
        if (i != 0) {
            q02.execute(new E1.j(i, 3, c1136a));
        } else {
            q02.execute(new I4.a(28, c1136a, fVar.f16433a));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200 A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TryCatch #2 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:20:0x0062, B:115:0x022f, B:27:0x0074, B:28:0x0082, B:52:0x00bf, B:30:0x0086, B:37:0x0096, B:40:0x00a0, B:43:0x00aa, B:53:0x00cd, B:54:0x00d5, B:91:0x014a, B:92:0x0151, B:93:0x0169, B:95:0x016c, B:96:0x0177, B:97:0x018f, B:99:0x0192, B:100:0x019d, B:101:0x01b5, B:103:0x01b8, B:104:0x01c2, B:105:0x01da, B:107:0x01dd, B:108:0x01e7, B:109:0x01ff, B:110:0x0200, B:111:0x020d, B:112:0x021a, B:113:0x0223, B:56:0x00da, B:59:0x00e5, B:62:0x00f0, B:65:0x00f9, B:68:0x0104, B:71:0x010e, B:74:0x0118, B:77:0x0122, B:80:0x012c, B:83:0x0136, B:114:0x022c), top: B:123:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020d A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TryCatch #2 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:20:0x0062, B:115:0x022f, B:27:0x0074, B:28:0x0082, B:52:0x00bf, B:30:0x0086, B:37:0x0096, B:40:0x00a0, B:43:0x00aa, B:53:0x00cd, B:54:0x00d5, B:91:0x014a, B:92:0x0151, B:93:0x0169, B:95:0x016c, B:96:0x0177, B:97:0x018f, B:99:0x0192, B:100:0x019d, B:101:0x01b5, B:103:0x01b8, B:104:0x01c2, B:105:0x01da, B:107:0x01dd, B:108:0x01e7, B:109:0x01ff, B:110:0x0200, B:111:0x020d, B:112:0x021a, B:113:0x0223, B:56:0x00da, B:59:0x00e5, B:62:0x00f0, B:65:0x00f9, B:68:0x0104, B:71:0x010e, B:74:0x0118, B:77:0x0122, B:80:0x012c, B:83:0x0136, B:114:0x022c), top: B:123:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021a A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TryCatch #2 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:20:0x0062, B:115:0x022f, B:27:0x0074, B:28:0x0082, B:52:0x00bf, B:30:0x0086, B:37:0x0096, B:40:0x00a0, B:43:0x00aa, B:53:0x00cd, B:54:0x00d5, B:91:0x014a, B:92:0x0151, B:93:0x0169, B:95:0x016c, B:96:0x0177, B:97:0x018f, B:99:0x0192, B:100:0x019d, B:101:0x01b5, B:103:0x01b8, B:104:0x01c2, B:105:0x01da, B:107:0x01dd, B:108:0x01e7, B:109:0x01ff, B:110:0x0200, B:111:0x020d, B:112:0x021a, B:113:0x0223, B:56:0x00da, B:59:0x00e5, B:62:0x00f0, B:65:0x00f9, B:68:0x0104, B:71:0x010e, B:74:0x0118, B:77:0x0122, B:80:0x012c, B:83:0x0136, B:114:0x022c), top: B:123:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0223 A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TryCatch #2 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:20:0x0062, B:115:0x022f, B:27:0x0074, B:28:0x0082, B:52:0x00bf, B:30:0x0086, B:37:0x0096, B:40:0x00a0, B:43:0x00aa, B:53:0x00cd, B:54:0x00d5, B:91:0x014a, B:92:0x0151, B:93:0x0169, B:95:0x016c, B:96:0x0177, B:97:0x018f, B:99:0x0192, B:100:0x019d, B:101:0x01b5, B:103:0x01b8, B:104:0x01c2, B:105:0x01da, B:107:0x01dd, B:108:0x01e7, B:109:0x01ff, B:110:0x0200, B:111:0x020d, B:112:0x021a, B:113:0x0223, B:56:0x00da, B:59:0x00e5, B:62:0x00f0, B:65:0x00f9, B:68:0x0104, B:71:0x010e, B:74:0x0118, B:77:0x0122, B:80:0x012c, B:83:0x0136, B:114:0x022c), top: B:123:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            r13 = this;
            g1.n r0 = new g1.n
            r0.<init>()
            int r1 = r15.getAttributeCount()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L248
            java.lang.String r4 = r15.getAttributeName(r3)
            java.lang.String r5 = r15.getAttributeValue(r3)
            if (r4 == 0) goto L244
            if (r5 != 0) goto L1b
            goto L244
        L1b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L244
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L45
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r4
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r14.getResources()
            java.lang.String r8 = r14.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L46
        L45:
            r1 = r3
        L46:
            if (r1 != r3) goto L5e
            int r6 = r5.length()
            if (r6 <= r4) goto L57
            java.lang.String r1 = r5.substring(r4)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L5e
        L57:
            java.lang.String r5 = "ConstraintLayoutStates"
            java.lang.String r6 = "error in parsing id"
            android.util.Log.e(r5, r6)
        L5e:
            java.lang.String r5 = "Error parsing XML resource"
            java.lang.String r6 = "ConstraintSet"
            int r7 = r15.getEventType()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r8 = 0
            r9 = r8
        L68:
            if (r7 == r4) goto L23c
            if (r7 == 0) goto L22c
            r10 = 3
            r11 = 2
            if (r7 == r11) goto Lcd
            if (r7 == r10) goto L74
            goto L22f
        L74:
            java.lang.String r7 = r15.getName()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r7 = r7.toLowerCase(r12)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r12 = r7.hashCode()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            switch(r12) {
                case -2075718416: goto Laa;
                case -190376483: goto La0;
                case 426575017: goto L96;
                case 2146106725: goto L86;
                default: goto L85;
            }     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L85:
            goto Lb4
        L86:
            java.lang.String r12 = "constraintset"
            boolean r7 = r7.equals(r12)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto Lb4
            r7 = r2
            goto Lb5
        L90:
            r14 = move-exception
            goto L235
        L93:
            r14 = move-exception
            goto L239
        L96:
            java.lang.String r12 = "constraintoverride"
            boolean r7 = r7.equals(r12)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto Lb4
            r7 = r11
            goto Lb5
        La0:
            java.lang.String r12 = "constraint"
            boolean r7 = r7.equals(r12)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto Lb4
            r7 = r4
            goto Lb5
        Laa:
            java.lang.String r12 = "guideline"
            boolean r7 = r7.equals(r12)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto Lb4
            r7 = r10
            goto Lb5
        Lb4:
            r7 = r3
        Lb5:
            if (r7 == 0) goto L23c
            if (r7 == r4) goto Lbf
            if (r7 == r11) goto Lbf
            if (r7 == r10) goto Lbf
            goto L22f
        Lbf:
            java.util.HashMap r7 = r0.f13023c     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r10 = r9.f12927a     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.put(r10, r9)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r9 = r8
            goto L22f
        Lcd:
            java.lang.String r7 = r15.getName()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r12 = r7.hashCode()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            switch(r12) {
                case -2025855158: goto L136;
                case -1984451626: goto L12c;
                case -1962203927: goto L122;
                case -1269513683: goto L118;
                case -1238332596: goto L10e;
                case -71750448: goto L104;
                case 366511058: goto Lf9;
                case 1331510167: goto Lf0;
                case 1791837707: goto Le5;
                case 1803088381: goto Lda;
                default: goto Ld8;
            }     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        Ld8:
            goto L140
        Lda:
            java.lang.String r10 = "Constraint"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = r2
            goto L141
        Le5:
            java.lang.String r10 = "CustomAttribute"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = 8
            goto L141
        Lf0:
            java.lang.String r11 = "Barrier"
            boolean r7 = r7.equals(r11)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            goto L141
        Lf9:
            java.lang.String r10 = "CustomMethod"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = 9
            goto L141
        L104:
            java.lang.String r10 = "Guideline"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = r11
            goto L141
        L10e:
            java.lang.String r10 = "Transform"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = 5
            goto L141
        L118:
            java.lang.String r10 = "PropertySet"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = 4
            goto L141
        L122:
            java.lang.String r10 = "ConstraintOverride"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = r4
            goto L141
        L12c:
            java.lang.String r10 = "Motion"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = 7
            goto L141
        L136:
            java.lang.String r10 = "Layout"
            boolean r7 = r7.equals(r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            if (r7 == 0) goto L140
            r10 = 6
            goto L141
        L140:
            r10 = r3
        L141:
            java.lang.String r7 = "XML parser error must be within a Constraint "
            switch(r10) {
                case 0: goto L223;
                case 1: goto L21a;
                case 2: goto L20d;
                case 3: goto L200;
                case 4: goto L1db;
                case 5: goto L1b6;
                case 6: goto L190;
                case 7: goto L16a;
                case 8: goto L148;
                case 9: goto L148;
                default: goto L146;
            }
        L146:
            goto L22f
        L148:
            if (r9 == 0) goto L151
            java.util.HashMap r7 = r9.f     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.C1072b.a(r14, r15, r7)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L151:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.<init>()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r7)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r15 = r15.getLineNumber()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r15 = r2.toString()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r14.<init>(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            throw r14     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L16a:
            if (r9 == 0) goto L177
            g1.k r7 = r9.f12929c     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.a(r14, r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L177:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.<init>()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r7)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r15 = r15.getLineNumber()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r15 = r2.toString()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r14.<init>(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            throw r14     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L190:
            if (r9 == 0) goto L19d
            g1.j r7 = r9.f12930d     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.a(r14, r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L19d:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.<init>()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r7)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r15 = r15.getLineNumber()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r15 = r2.toString()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r14.<init>(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            throw r14     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L1b6:
            if (r9 == 0) goto L1c2
            g1.m r7 = r9.f12931e     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.a(r14, r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L1c2:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.<init>()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r7)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r15 = r15.getLineNumber()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r15 = r2.toString()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r14.<init>(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            throw r14     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L1db:
            if (r9 == 0) goto L1e7
            g1.l r7 = r9.f12928b     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.a(r14, r10)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L1e7:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.<init>()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r7)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            int r15 = r15.getLineNumber()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r2.append(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            java.lang.String r15 = r2.toString()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r14.<init>(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            throw r14     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L200:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.i r9 = g1.n.d(r14, r7, r2)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.j r7 = r9.f12930d     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.f12973h0 = r4     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L20d:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.i r9 = g1.n.d(r14, r7, r2)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.j r7 = r9.f12930d     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            r7.f12959a = r4     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L21a:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.i r9 = g1.n.d(r14, r7, r4)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L223:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            g1.i r9 = g1.n.d(r14, r7, r2)     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L22f
        L22c:
            r15.getName()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
        L22f:
            int r7 = r15.next()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L93
            goto L68
        L235:
            android.util.Log.e(r6, r5, r14)
            goto L23c
        L239:
            android.util.Log.e(r6, r5, r14)
        L23c:
            java.lang.Object r14 = r13.f8313s
            android.util.SparseArray r14 = (android.util.SparseArray) r14
            r14.put(r1, r0)
            return
        L244:
            int r3 = r3 + 1
            goto Lb
        L248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.m.y(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z(Bundle bundle) {
        C1135a c1135a = (C1135a) this.f8312r;
        g2.e eVar = c1135a.f13554a;
        if (!c1135a.f13558e) {
            c1135a.a();
        }
        if (eVar.getLifecycle().b().compareTo(EnumC0653p.f9559t) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.getLifecycle().b()).toString());
        }
        if (c1135a.f13559g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleK0 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleK0 = I1.k0("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c1135a.f = bundleK0;
        c1135a.f13559g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ m(int i, Object obj, Object obj2, boolean z5) {
        this.f8311q = i;
        this.f8313s = obj;
        this.f8312r = obj2;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [androidx.constraintlayout.widget.ConstraintLayout.f(int):void, androidx.recyclerview.widget.StaggeredGridLayoutManager.<init>(android.content.Context, android.util.AttributeSet, int, int):void, com.google.android.gms.common.e.g(android.content.Context, int, android.app.PendingIntent):void] */
    public /* synthetic */ m(int i, boolean z5) {
        this.f8311q = i;
    }

    public m(int i) {
        this.f8311q = i;
        switch (i) {
            case 5:
                this.f8312r = new SparseIntArray();
                this.f8313s = new SparseIntArray();
                break;
            case 8:
                this.f8312r = new Q(0);
                this.f8313s = new C1566q((Object) null);
                break;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                this.f8312r = new C1416b();
                this.f8313s = null;
                break;
            case 22:
                this.f8312r = null;
                this.f8313s = null;
                break;
            default:
                this.f8312r = new ConcurrentHashMap(16, 0.75f, 10);
                this.f8313s = new ReferenceQueue();
                break;
        }
    }

    public m(String str, K1 k12, r6.f fVar) {
        this.f8311q = 27;
        this.f8313s = str;
        this.f8312r = k12;
    }

    public m(MainActivity mainActivity) {
        this.f8311q = 9;
        this.f8312r = mainActivity;
        this.f8313s = mainActivity.getSharedPreferences("onboarding_prefs", 0);
    }

    public m(C1135a c1135a, int i) {
        this.f8311q = i;
        switch (i) {
            case 13:
                this.f8312r = c1135a;
                this.f8313s = new m(c1135a, 12);
                break;
            default:
                this.f8312r = c1135a;
                break;
        }
    }

    public m(String query, Object[] objArr) {
        this.f8311q = 17;
        kotlin.jvm.internal.m.e(query, "query");
        this.f8312r = query;
        this.f8313s = objArr;
    }

    public m(WorkDatabase_Impl workDatabase_Impl) {
        this.f8311q = 1;
        this.f8312r = workDatabase_Impl;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.m.d(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f8313s = setNewSetFromMap;
    }

    public m(J j) {
        this.f8311q = 21;
        this.f8312r = new C1416b();
        this.f8313s = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String query) {
        this(query, (Object[]) null);
        this.f8311q = 17;
        kotlin.jvm.internal.m.e(query, "query");
    }

    public m(b1.e eVar) {
        this.f8311q = 2;
        this.f8313s = eVar;
    }

    public m(C0468k1 c0468k1) {
        this.f8311q = 16;
        this.f8312r = c0468k1;
        this.f8313s = new K2.a(c0468k1);
    }

    public m(f0 f0Var) {
        this.f8311q = 7;
        this.f8312r = f0Var;
        e0 e0Var = new e0();
        e0Var.f12101a = 0;
        this.f8313s = e0Var;
    }
}
