package T1;

import O3.B;
import O3.D;
import P5.H;
import P5.S;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f7367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f7368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f7369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P5.D f7371e;
    public final P5.D f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f7372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f7373h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(u uVar, z navigator) {
        kotlin.jvm.internal.m.e(navigator, "navigator");
        this.f7373h = uVar;
        this.f7367a = new D(11);
        S sB = H.b(n5.s.f15299q);
        this.f7368b = sB;
        S sB2 = H.b(n5.u.f15301q);
        this.f7369c = sB2;
        this.f7371e = new P5.D(sB);
        this.f = new P5.D(sB2);
        this.f7372g = navigator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(d backStackEntry) {
        kotlin.jvm.internal.m.e(backStackEntry, "backStackEntry");
        synchronized (this.f7367a) {
            S s6 = this.f7368b;
            ArrayList arrayListV0 = n5.l.v0((Collection) s6.getValue(), backStackEntry);
            s6.getClass();
            s6.h(null, arrayListV0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d b(p pVar, Bundle bundle) {
        W1.j jVar = this.f7373h.f7418b;
        jVar.getClass();
        return B.f(jVar.f8066a.f7419c, pVar, bundle, jVar.h(), jVar.f8077o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(T1.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.m.e(r9, r0)
            T1.u r0 = r8.f7373h
            W1.j r0 = r0.f7418b
            T1.g r1 = new T1.g
            r1.<init>(r8, r9)
            P5.S r2 = r0.f8072h
            java.lang.String r3 = r9.f7358v
            java.util.LinkedHashMap r4 = r0.f8085w
            java.lang.Object r5 = r4.get(r9)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.m.a(r5, r6)
            r1.invoke()
            r4.remove(r9)
            n5.j r1 = r0.f
            boolean r4 = r1.contains(r9)
            r6 = 0
            if (r4 != 0) goto L89
            r0.q(r9)
            W1.c r4 = r9.f7360x
            androidx.lifecycle.z r4 = r4.j
            androidx.lifecycle.p r4 = r4.f9572d
            androidx.lifecycle.p r7 = androidx.lifecycle.EnumC0653p.f9558s
            int r4 = r4.compareTo(r7)
            if (r4 < 0) goto L43
            androidx.lifecycle.p r4 = androidx.lifecycle.EnumC0653p.f9556q
            r9.c(r4)
        L43:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L4a
            goto L63
        L4a:
            java.util.Iterator r9 = r1.iterator()
        L4e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r9.next()
            T1.d r1 = (T1.d) r1
            java.lang.String r1 = r1.f7358v
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            if (r1 == 0) goto L4e
            goto L7b
        L63:
            if (r5 != 0) goto L7b
            T1.i r9 = r0.f8077o
            if (r9 == 0) goto L7b
            java.lang.String r1 = "backStackEntryId"
            kotlin.jvm.internal.m.e(r3, r1)
            java.util.LinkedHashMap r9 = r9.f7374b
            java.lang.Object r9 = r9.remove(r3)
            androidx.lifecycle.k0 r9 = (androidx.lifecycle.k0) r9
            if (r9 == 0) goto L7b
            r9.a()
        L7b:
            r0.r()
            java.util.ArrayList r9 = r0.o()
            r2.getClass()
            r2.h(r6, r9)
            return
        L89:
            boolean r9 = r8.f7370d
            if (r9 != 0) goto La6
            r0.r()
            P5.S r9 = r0.f8071g
            java.util.ArrayList r1 = n5.l.C0(r1)
            r9.getClass()
            r9.h(r6, r1)
            java.util.ArrayList r9 = r0.o()
            r2.getClass()
            r2.h(r6, r9)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.h.c(T1.d):void");
    }

    /* JADX DEBUG: Class process forced to load method for inline: W1.j.n(W1.j, T1.d):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(d dVar, boolean z5) {
        W1.j jVar = this.f7373h.f7418b;
        g gVar = new g(this, dVar, z5);
        jVar.getClass();
        z zVarB = jVar.f8081s.b(dVar.f7354r.f7403q);
        jVar.f8085w.put(dVar, Boolean.valueOf(z5));
        if (!zVarB.equals(this.f7372g)) {
            Object obj = jVar.f8082t.get(zVarB);
            kotlin.jvm.internal.m.b(obj);
            ((h) obj).d(dVar, z5);
            return;
        }
        W1.g gVar2 = jVar.f8084v;
        if (gVar2 != null) {
            gVar2.invoke(dVar);
            gVar.invoke();
            return;
        }
        n5.j jVar2 = jVar.f;
        int iIndexOf = jVar2.indexOf(dVar);
        if (iIndexOf < 0) {
            String message = "Ignoring pop of " + dVar + " as it was not found on the current back stack";
            kotlin.jvm.internal.m.e(message, "message");
            Log.i("NavController", message);
            return;
        }
        int i = iIndexOf + 1;
        if (i != jVar2.f15297s) {
            jVar.l(((d) jVar2.get(i)).f7354r.f7404r.f8091a, true, false);
        }
        W1.j.n(jVar, dVar);
        gVar.invoke();
        jVar.f8067b.invoke();
        jVar.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(d dVar, boolean z5) {
        Object objPrevious;
        S s6 = this.f7369c;
        Iterable iterable = (Iterable) s6.getValue();
        boolean z6 = iterable instanceof Collection;
        P5.D d5 = this.f7371e;
        if (!z6 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d) it.next()) == dVar) {
                    Iterable iterable2 = (Iterable) d5.f6338q.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((d) it2.next()) == dVar) {
                        }
                    }
                    return;
                }
            }
        }
        s6.h(null, AbstractC1397A.x((Set) s6.getValue(), dVar));
        S s7 = d5.f6338q;
        S s8 = d5.f6338q;
        List list = (List) s7.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            d dVar2 = (d) objPrevious;
            if (!kotlin.jvm.internal.m.a(dVar2, dVar) && ((List) s8.getValue()).lastIndexOf(dVar2) < ((List) s8.getValue()).lastIndexOf(dVar)) {
                break;
            }
        }
        d dVar3 = (d) objPrevious;
        if (dVar3 != null) {
            s6.h(null, AbstractC1397A.x((Set) s6.getValue(), dVar3));
        }
        d(dVar, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(d backStackEntry) {
        kotlin.jvm.internal.m.e(backStackEntry, "backStackEntry");
        W1.j jVar = this.f7373h.f7418b;
        jVar.getClass();
        z zVarB = jVar.f8081s.b(backStackEntry.f7354r.f7403q);
        if (!zVarB.equals(this.f7372g)) {
            Object obj = jVar.f8082t.get(zVarB);
            if (obj == null) {
                throw new IllegalStateException(k1.i.k(new StringBuilder("NavigatorBackStack for "), backStackEntry.f7354r.f7403q, " should already be created").toString());
            }
            ((h) obj).f(backStackEntry);
            return;
        }
        B5.c cVar = jVar.f8083u;
        if (cVar != null) {
            cVar.invoke(backStackEntry);
            a(backStackEntry);
            return;
        }
        String message = "Ignoring add of destination " + backStackEntry.f7354r + " outside of the call to navigate(). ";
        kotlin.jvm.internal.m.e(message, "message");
        Log.i("NavController", message);
    }
}
