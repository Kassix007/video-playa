package T1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0648k;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0660x, l0, InterfaceC0648k, g2.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C3.b f7353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f7354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f7355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EnumC0653p f7356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f7357u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7358v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bundle f7359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final W1.c f7360x = new W1.c(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(C3.b bVar, p pVar, Bundle bundle, EnumC0653p enumC0653p, i iVar, String str, Bundle bundle2) {
        this.f7353q = bVar;
        this.f7354r = pVar;
        this.f7355s = bundle;
        this.f7356t = enumC0653p;
        this.f7357u = iVar;
        this.f7358v = str;
        this.f7359w = bundle2;
        AbstractC1362a.d(new I2.d(5, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.e
    public final Z.m b() {
        return (Z.m) this.f7360x.f8039h.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(EnumC0653p enumC0653p) {
        W1.c cVar = this.f7360x;
        cVar.getClass();
        cVar.f8040k = enumC0653p;
        cVar.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final h0 d() {
        return this.f7360x.f8041l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // androidx.lifecycle.InterfaceC0648k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P1.e e() {
        /*
            r5 = this;
            W1.c r0 = r5.f7360x
            r0.getClass()
            P1.e r1 = new P1.e
            r2 = 0
            r1.<init>(r2)
            T1.d r2 = r0.f8033a
            java.util.LinkedHashMap r3 = r1.f5610a
            O3.D r4 = androidx.lifecycle.X.f9512a
            r3.put(r4, r2)
            O3.B r4 = androidx.lifecycle.X.f9513b
            r3.put(r4, r2)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L24
            O3.D r2 = androidx.lifecycle.X.f9514c
            r3.put(r2, r0)
        L24:
            r0 = 0
            C3.b r2 = r5.f7353q
            if (r2 == 0) goto L3a
            android.content.Context r2 = r2.f1185a
            if (r2 == 0) goto L32
            android.content.Context r2 = r2.getApplicationContext()
            goto L33
        L32:
            r2 = r0
        L33:
            boolean r4 = r2 instanceof android.app.Application
            if (r4 == 0) goto L3a
            android.app.Application r2 = (android.app.Application) r2
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto L3e
            r0 = r2
        L3e:
            if (r0 == 0) goto L45
            O3.B r2 = androidx.lifecycle.g0.f9546d
            r3.put(r2, r0)
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.d.e():P1.e");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            Bundle bundle = dVar.f7355s;
            if (kotlin.jvm.internal.m.a(this.f7358v, dVar.f7358v) && kotlin.jvm.internal.m.a(this.f7354r, dVar.f7354r) && kotlin.jvm.internal.m.a(this.f7360x.j, dVar.f7360x.j) && kotlin.jvm.internal.m.a(b(), dVar.b())) {
                Bundle bundle2 = this.f7355s;
                if (kotlin.jvm.internal.m.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.m.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.l0
    public final k0 f() {
        W1.c cVar = this.f7360x;
        if (!cVar.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.j.f9572d == EnumC0653p.f9556q) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        i iVar = cVar.f8037e;
        if (iVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = cVar.f;
        kotlin.jvm.internal.m.e(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = iVar.f7374b;
        k0 k0Var = (k0) linkedHashMap.get(backStackEntryId);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0();
        linkedHashMap.put(backStackEntryId, k0Var2);
        return k0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        return this.f7360x.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f7354r.hashCode() + (this.f7358v.hashCode() * 31);
        Bundle bundle = this.f7355s;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.f7360x.j.hashCode() + (iHashCode * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f7360x.toString();
    }
}
