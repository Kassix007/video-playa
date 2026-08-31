package W1;

import O3.B;
import P5.D;
import P5.G;
import P5.H;
import P5.S;
import T1.A;
import T1.p;
import T1.r;
import T1.u;
import T1.w;
import T1.z;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import m5.C1386y;
import n5.AbstractC1397A;
import n5.q;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f8066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T1.f f8067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f8068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f8069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f8070e;
    public final n5.j f = new n5.j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f8071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S f8072h;
    public final D i;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0660x f8076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public T1.i f8077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f8078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EnumC0653p f8079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f8080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A f8081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f8082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B5.c f8083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f8084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f8085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f8087y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final G f8088z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(u uVar, T1.f fVar) {
        this.f8066a = uVar;
        this.f8067b = fVar;
        s sVar = s.f15299q;
        this.f8071g = H.b(sVar);
        S sB = H.b(sVar);
        this.f8072h = sB;
        this.i = new D(sB);
        this.j = new LinkedHashMap();
        this.f8073k = new LinkedHashMap();
        this.f8074l = new LinkedHashMap();
        this.f8075m = new LinkedHashMap();
        this.f8078p = new ArrayList();
        this.f8079q = EnumC0653p.f9557r;
        this.f8080r = new f(0, this);
        this.f8081s = new A();
        this.f8082t = new LinkedHashMap();
        this.f8085w = new LinkedHashMap();
        this.f8087y = new ArrayList();
        this.f8088z = H.a(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p d(int i, p pVar, p pVar2, boolean z5) {
        if (pVar.f7404r.f8091a == i && (pVar2 == null || (pVar.equals(pVar2) && kotlin.jvm.internal.m.a(pVar.f7405s, pVar2.f7405s)))) {
            return pVar;
        }
        r rVar = pVar instanceof r ? (r) pVar : null;
        if (rVar == null) {
            rVar = pVar.f7405s;
            kotlin.jvm.internal.m.b(rVar);
        }
        return rVar.f7413v.p(i, rVar, pVar2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void n(j jVar, T1.d dVar) {
        jVar.m(dVar, false, new n5.j());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(p pVar, Bundle bundle, T1.d dVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        C3.b bVar = this.f8066a.f7419c;
        p pVar2 = dVar.f7354r;
        boolean z5 = pVar2 instanceof T1.c;
        n5.j jVar = this.f;
        if (!z5) {
            while (!jVar.isEmpty() && (((T1.d) jVar.last()).f7354r instanceof T1.c) && l(((T1.d) jVar.last()).f7354r.f7404r.f8091a, true, false)) {
            }
        }
        n5.j<T1.d> jVar2 = new n5.j();
        Object obj = null;
        if (pVar instanceof r) {
            p pVar3 = pVar2;
            do {
                kotlin.jvm.internal.m.b(pVar3);
                pVar3 = pVar3.f7405s;
                if (pVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (kotlin.jvm.internal.m.a(((T1.d) objPrevious2).f7354r, pVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    T1.d dVarF = (T1.d) objPrevious2;
                    if (dVarF == null) {
                        dVarF = B.f(bVar, pVar3, bundle, h(), this.f8077o);
                    }
                    jVar2.addFirst(dVarF);
                    if (!jVar.isEmpty() && ((T1.d) jVar.last()).f7354r == pVar3) {
                        n(this, (T1.d) jVar.last());
                    }
                }
                if (pVar3 == null) {
                    break;
                }
            } while (pVar3 != pVar);
        }
        p pVar4 = jVar2.isEmpty() ? pVar2 : ((T1.d) jVar2.first()).f7354r;
        while (pVar4 != null && c(pVar4.f7404r.f8091a, pVar4) != pVar4) {
            pVar4 = pVar4.f7405s;
            if (pVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (kotlin.jvm.internal.m.a(((T1.d) objPrevious).f7354r, pVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                T1.d dVarF2 = (T1.d) objPrevious;
                if (dVarF2 == null) {
                    dVarF2 = B.f(bVar, pVar4, pVar4.d(bundle2), h(), this.f8077o);
                }
                jVar2.addFirst(dVarF2);
            }
        }
        if (!jVar2.isEmpty()) {
            pVar2 = ((T1.d) jVar2.first()).f7354r;
        }
        while (!jVar.isEmpty() && (((T1.d) jVar.last()).f7354r instanceof r)) {
            p pVar5 = ((T1.d) jVar.last()).f7354r;
            kotlin.jvm.internal.m.c(pVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((r.S) ((r) pVar5).f7413v.f1291d).c(pVar2.f7404r.f8091a) != null) {
                break;
            } else {
                n(this, (T1.d) jVar.last());
            }
        }
        T1.d dVar2 = (T1.d) jVar.j();
        if (dVar2 == null) {
            dVar2 = (T1.d) jVar2.j();
        }
        if (!kotlin.jvm.internal.m.a(dVar2 != null ? dVar2.f7354r : null, this.f8068c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                p pVar6 = ((T1.d) objPrevious3).f7354r;
                r rVar = this.f8068c;
                kotlin.jvm.internal.m.b(rVar);
                if (kotlin.jvm.internal.m.a(pVar6, rVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            T1.d dVarF3 = (T1.d) obj;
            if (dVarF3 == null) {
                r rVar2 = this.f8068c;
                kotlin.jvm.internal.m.b(rVar2);
                r rVar3 = this.f8068c;
                kotlin.jvm.internal.m.b(rVar3);
                dVarF3 = B.f(bVar, rVar2, rVar3.d(bundle), h(), this.f8077o);
            }
            jVar2.addFirst(dVarF3);
        }
        for (T1.d dVar3 : jVar2) {
            Object obj2 = this.f8082t.get(this.f8081s.b(dVar3.f7354r.f7403q));
            if (obj2 == null) {
                throw new IllegalStateException(k1.i.k(new StringBuilder("NavigatorBackStack for "), pVar.f7403q, " should already be created").toString());
            }
            ((T1.h) obj2).a(dVar3);
        }
        jVar.addAll(jVar2);
        jVar.addLast(dVar);
        ArrayList arrayListV0 = n5.l.v0(jVar2, dVar);
        int size = arrayListV0.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListV0.get(i);
            i++;
            T1.d dVar4 = (T1.d) obj3;
            r rVar4 = dVar4.f7354r.f7405s;
            if (rVar4 != null) {
                j(dVar4, e(rVar4.f7404r.f8091a));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        n5.j jVar;
        while (true) {
            jVar = this.f;
            if (jVar.isEmpty() || !(((T1.d) jVar.last()).f7354r instanceof r)) {
                break;
            }
            n(this, (T1.d) jVar.last());
        }
        T1.d dVar = (T1.d) jVar.l();
        ArrayList arrayList = this.f8087y;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        this.f8086x++;
        r();
        int i = this.f8086x - 1;
        this.f8086x = i;
        if (i == 0) {
            ArrayList arrayListC0 = n5.l.C0(arrayList);
            arrayList.clear();
            int size = arrayListC0.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayListC0.get(i7);
                i7++;
                T1.d dVar2 = (T1.d) obj;
                Iterator it = this.f8078p.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    p pVar = dVar2.f7354r;
                    dVar2.f7360x.a();
                    throw null;
                }
                this.f8088z.n(dVar2);
            }
            ArrayList arrayListC02 = n5.l.C0(jVar);
            S s6 = this.f8071g;
            s6.getClass();
            s6.h(null, arrayListC02);
            ArrayList arrayListO = o();
            S s7 = this.f8072h;
            s7.getClass();
            s7.h(null, arrayListO);
        }
        return dVar != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p c(int i, p pVar) {
        p pVar2;
        r rVar = this.f8068c;
        if (rVar == null) {
            return null;
        }
        if (rVar.f7404r.f8091a == i) {
            if (pVar == null) {
                return rVar;
            }
            if (kotlin.jvm.internal.m.a(rVar, pVar) && pVar.f7405s == null) {
                return this.f8068c;
            }
        }
        T1.d dVar = (T1.d) this.f.l();
        if (dVar == null || (pVar2 = dVar.f7354r) == null) {
            pVar2 = this.f8068c;
            kotlin.jvm.internal.m.b(pVar2);
        }
        return d(i, pVar2, pVar, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T1.d e(int i) {
        Object objPrevious;
        n5.j jVar = this.f;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((T1.d) objPrevious).f7354r.f7404r.f8091a == i) {
                break;
            }
        }
        T1.d dVar = (T1.d) objPrevious;
        if (dVar != null) {
            return dVar;
        }
        StringBuilder sbL = k1.i.l("No destination with ID ", " is on the NavController's back stack. The current destination is ", i);
        sbL.append(f());
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p f() {
        T1.d dVar = (T1.d) this.f.l();
        if (dVar != null) {
            return dVar.f7354r;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r g() {
        r rVar = this.f8068c;
        if (rVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EnumC0653p h() {
        return this.f8076n == null ? EnumC0653p.f9558s : this.f8079q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r i() {
        p pVar;
        T1.d dVar = (T1.d) this.f.l();
        if (dVar == null || (pVar = dVar.f7354r) == null) {
            pVar = this.f8068c;
            kotlin.jvm.internal.m.b(pVar);
        }
        r rVar = pVar instanceof r ? (r) pVar : null;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = pVar.f7405s;
        kotlin.jvm.internal.m.b(rVar2);
        return rVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(T1.d dVar, T1.d dVar2) {
        this.j.put(dVar, dVar2);
        LinkedHashMap linkedHashMap = this.f8073k;
        if (linkedHashMap.get(dVar2) == null) {
            linkedHashMap.put(dVar2, new a());
        }
        Object obj = linkedHashMap.get(dVar2);
        kotlin.jvm.internal.m.b(obj);
        ((a) obj).f8031a.incrementAndGet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(T1.p r22, android.os.Bundle r23, T1.w r24) {
        /*
            r21 = this;
            r2 = r21
            r3 = r22
            r6 = r24
            java.lang.String r0 = "node"
            kotlin.jvm.internal.m.e(r3, r0)
            java.util.LinkedHashMap r0 = r2.f8082t
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            r4 = 1
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            T1.h r1 = (T1.h) r1
            r1.f7370d = r4
            goto L17
        L27:
            kotlin.jvm.internal.u r1 = new kotlin.jvm.internal.u
            r1.<init>()
            r0 = -1
            if (r6 == 0) goto L3d
            int r5 = r6.f7425c
            if (r5 == r0) goto L3d
            boolean r8 = r6.f7426d
            boolean r9 = r6.f7427e
            boolean r5 = r2.l(r5, r8, r9)
            r8 = r5
            goto L3e
        L3d:
            r8 = 0
        L3e:
            android.os.Bundle r5 = r22.d(r23)
            if (r6 == 0) goto L65
            boolean r9 = r6.f7424b
            if (r9 != r4) goto L65
            java.util.LinkedHashMap r9 = r2.f8074l
            W1.l r10 = r3.f7404r
            int r10 = r10.f8091a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L65
            W1.l r0 = r3.f7404r
            int r0 = r0.f8091a
            boolean r0 = r2.p(r0, r5, r6)
            r1.f14264q = r0
            r11 = 0
            goto L242
        L65:
            if (r6 == 0) goto L216
            boolean r10 = r6.f7423a
            if (r10 != r4) goto L216
            n5.j r10 = r2.f
            java.lang.Object r10 = r10.l()
            T1.d r10 = (T1.d) r10
            n5.j r11 = r2.f
            int r12 = r11.d()
            java.util.ListIterator r11 = r11.listIterator(r12)
        L7d:
            boolean r12 = r11.hasPrevious()
            if (r12 == 0) goto L92
            java.lang.Object r12 = r11.previous()
            T1.d r12 = (T1.d) r12
            T1.p r12 = r12.f7354r
            if (r12 != r3) goto L7d
            int r11 = r11.nextIndex()
            goto L93
        L92:
            r11 = r0
        L93:
            if (r11 != r0) goto L97
            goto L216
        L97:
            boolean r12 = r3 instanceof T1.r
            if (r12 == 0) goto L103
            int r10 = T1.r.f7412w
            r10 = r3
            T1.r r10 = (T1.r) r10
            I5.m r12 = new I5.m
            r13 = 15
            r12.<init>(r13)
            I5.i r10 = I5.k.R(r10, r12)
            I5.m r12 = new I5.m
            r13 = 26
            r12.<init>(r13)
            I5.p r13 = new I5.p
            r13.<init>(r10, r12, r4)
            java.util.List r10 = I5.k.S(r13)
            n5.j r12 = r2.f
            int r12 = r12.f15297s
            int r12 = r12 - r11
            int r13 = r10.size()
            if (r12 == r13) goto Lc8
            goto L216
        Lc8:
            n5.j r12 = r2.f
            int r13 = r12.f15297s
            java.util.List r12 = r12.subList(r11, r13)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = n5.m.c0(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        Le1:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto Lfb
            java.lang.Object r14 = r12.next()
            T1.d r14 = (T1.d) r14
            T1.p r14 = r14.f7354r
            W1.l r14 = r14.f7404r
            int r14 = r14.f8091a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            goto Le1
        Lfb:
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L113
            goto L216
        L103:
            if (r10 == 0) goto L216
            T1.p r10 = r10.f7354r
            if (r10 == 0) goto L216
            W1.l r12 = r3.f7404r
            int r12 = r12.f8091a
            W1.l r10 = r10.f7404r
            int r10 = r10.f8091a
            if (r12 != r10) goto L216
        L113:
            n5.j r10 = new n5.j
            r10.<init>()
        L118:
            n5.j r12 = r2.f
            int r12 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r12)
            if (r12 < r11) goto L173
            n5.j r12 = r2.f
            java.lang.Object r12 = n5.q.g0(r12)
            T1.d r12 = (T1.d) r12
            r2.q(r12)
            T1.d r13 = new T1.d
            T1.p r14 = r12.f7354r
            r15 = r23
            android.os.Bundle r16 = r14.d(r15)
            C3.b r14 = r12.f7353q
            T1.p r15 = r12.f7354r
            androidx.lifecycle.p r0 = r12.f7356t
            T1.i r7 = r12.f7357u
            java.lang.String r9 = r12.f7358v
            android.os.Bundle r4 = r12.f7359w
            r17 = r0
            r20 = r4
            r18 = r7
            r19 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            W1.c r0 = r13.f7360x
            androidx.lifecycle.p r4 = r12.f7356t
            r0.getClass()
            java.lang.String r7 = "<set-?>"
            kotlin.jvm.internal.m.e(r4, r7)
            r0.f8036d = r4
            W1.c r0 = r13.f7360x
            W1.c r4 = r12.f7360x
            androidx.lifecycle.p r4 = r4.f8040k
            r0.getClass()
            java.lang.String r7 = "maxState"
            kotlin.jvm.internal.m.e(r4, r7)
            r0.f8040k = r4
            r0.b()
            r10.addFirst(r13)
            r0 = -1
            r4 = 1
            goto L118
        L173:
            java.util.Iterator r0 = r10.iterator()
        L177:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L19a
            java.lang.Object r4 = r0.next()
            T1.d r4 = (T1.d) r4
            T1.p r7 = r4.f7354r
            T1.r r7 = r7.f7405s
            if (r7 == 0) goto L194
            W1.l r7 = r7.f7404r
            int r7 = r7.f8091a
            T1.d r7 = r2.e(r7)
            r2.j(r4, r7)
        L194:
            n5.j r7 = r2.f
            r7.addLast(r4)
            goto L177
        L19a:
            java.util.Iterator r0 = r10.iterator()
        L19e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L214
            java.lang.Object r4 = r0.next()
            T1.d r4 = (T1.d) r4
            T1.A r7 = r2.f8081s
            T1.p r9 = r4.f7354r
            java.lang.String r9 = r9.f7403q
            T1.z r7 = r7.b(r9)
            T1.p r9 = r4.f7354r
            if (r9 == 0) goto L1b9
            goto L1ba
        L1b9:
            r9 = 0
        L1ba:
            if (r9 != 0) goto L1be
            r11 = 1
            goto L19e
        L1be:
            T1.x r10 = new T1.x
            r10.<init>()
            r11 = 1
            r10.f7430b = r11
            r7.c(r9)
            T1.h r7 = r7.b()
            O3.D r9 = r7.f7367a
            monitor-enter(r9)
            P5.D r10 = r7.f7371e     // Catch: java.lang.Throwable -> L201
            P5.S r10 = r10.f6338q     // Catch: java.lang.Throwable -> L201
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L201
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> L201
            java.util.ArrayList r10 = n5.l.C0(r10)     // Catch: java.lang.Throwable -> L201
            int r12 = r10.size()     // Catch: java.lang.Throwable -> L201
            java.util.ListIterator r12 = r10.listIterator(r12)     // Catch: java.lang.Throwable -> L201
        L1e6:
            boolean r13 = r12.hasPrevious()     // Catch: java.lang.Throwable -> L201
            if (r13 == 0) goto L203
            java.lang.Object r13 = r12.previous()     // Catch: java.lang.Throwable -> L201
            T1.d r13 = (T1.d) r13     // Catch: java.lang.Throwable -> L201
            java.lang.String r13 = r13.f7358v     // Catch: java.lang.Throwable -> L201
            java.lang.String r14 = r4.f7358v     // Catch: java.lang.Throwable -> L201
            boolean r13 = kotlin.jvm.internal.m.a(r13, r14)     // Catch: java.lang.Throwable -> L201
            if (r13 == 0) goto L1e6
            int r12 = r12.nextIndex()     // Catch: java.lang.Throwable -> L201
            goto L204
        L201:
            r0 = move-exception
            goto L212
        L203:
            r12 = -1
        L204:
            r10.set(r12, r4)     // Catch: java.lang.Throwable -> L201
            P5.S r4 = r7.f7368b     // Catch: java.lang.Throwable -> L201
            r4.getClass()     // Catch: java.lang.Throwable -> L201
            r7 = 0
            r4.h(r7, r10)     // Catch: java.lang.Throwable -> L201
            monitor-exit(r9)
            goto L19e
        L212:
            monitor-exit(r9)
            throw r0
        L214:
            r11 = 1
            goto L217
        L216:
            r11 = 0
        L217:
            if (r11 != 0) goto L242
            T1.u r0 = r2.f8066a
            C3.b r0 = r0.f7419c
            androidx.lifecycle.p r4 = r2.h()
            T1.i r7 = r2.f8077o
            T1.d r0 = O3.B.f(r0, r3, r5, r4, r7)
            T1.A r4 = r2.f8081s
            java.lang.String r7 = r3.f7403q
            T1.z r7 = r4.b(r7)
            java.util.List r9 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r0)
            W1.e r0 = new W1.e
            r4 = r5
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r2.f8083u = r0
            r7.d(r9, r6)
            r7 = 0
            r2.f8083u = r7
        L242:
            T1.f r0 = r2.f8067b
            r0.invoke()
            java.util.LinkedHashMap r0 = r2.f8082t
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L253:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L263
            java.lang.Object r3 = r0.next()
            T1.h r3 = (T1.h) r3
            r4 = 0
            r3.f7370d = r4
            goto L253
        L263:
            if (r8 != 0) goto L270
            boolean r0 = r1.f14264q
            if (r0 != 0) goto L270
            if (r11 == 0) goto L26c
            goto L270
        L26c:
            r2.r()
            return
        L270:
            r2.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.j.k(T1.p, android.os.Bundle, T1.w):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l(int i, boolean z5, boolean z6) {
        p pVar;
        boolean z7;
        n5.j jVar = this.f;
        final int i7 = 0;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = n5.l.w0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                pVar = null;
                break;
            }
            p pVar2 = ((T1.d) it.next()).f7354r;
            String str = pVar2.f7403q;
            l lVar = pVar2.f7404r;
            z zVarB = this.f8081s.b(str);
            if (z5 || lVar.f8091a != i) {
                arrayList.add(zVarB);
            }
            if (lVar.f8091a == i) {
                pVar = pVar2;
                break;
            }
        }
        if (pVar == null) {
            int i8 = p.f7402u;
            String message = "Ignoring popBackStack to destination " + AbstractC1397A.s(this.f8066a.f7419c, i) + " as it was not found on the current back stack";
            kotlin.jvm.internal.m.e(message, "message");
            Log.i("NavController", message);
            return false;
        }
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        n5.j jVar2 = new n5.j();
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z7 = z6;
                break;
            }
            int i10 = i9 + 1;
            z navigator = (z) arrayList.get(i9);
            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
            T1.d popUpTo = (T1.d) jVar.last();
            z7 = z6;
            g gVar = new g(uVar2, uVar, this, z7, jVar2);
            kotlin.jvm.internal.m.e(navigator, "navigator");
            kotlin.jvm.internal.m.e(popUpTo, "popUpTo");
            this.f8084v = gVar;
            navigator.e(popUpTo, z7);
            this.f8084v = null;
            if (!uVar2.f14264q) {
                break;
            }
            i9 = i10;
        }
        if (z7) {
            LinkedHashMap linkedHashMap = this.f8074l;
            if (!z5) {
                I5.f fVar = new I5.f(new I5.p(I5.k.R(pVar, new I5.m(24)), new B5.c(this) { // from class: W1.h

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ j f8060r;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f8060r = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        p destination = (p) obj;
                        switch (i7) {
                            case 0:
                                kotlin.jvm.internal.m.e(destination, "destination");
                                zContainsKey = this.f8060r.f8074l.containsKey(Integer.valueOf(destination.f7404r.f8091a));
                                break;
                            default:
                                kotlin.jvm.internal.m.e(destination, "destination");
                                zContainsKey = this.f8060r.f8074l.containsKey(Integer.valueOf(destination.f7404r.f8091a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((p) fVar.next()).f7404r.f8091a);
                    T1.e eVar = (T1.e) jVar2.j();
                    linkedHashMap.put(numValueOf, eVar != null ? (String) eVar.f7361a.f8044b : null);
                }
            }
            if (!jVar2.isEmpty()) {
                d dVar = ((T1.e) jVar2.first()).f7361a;
                final int i11 = 1;
                I5.f fVar2 = new I5.f(new I5.p(I5.k.R(c(dVar.f8043a, null), new I5.m(25)), new B5.c(this) { // from class: W1.h

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ j f8060r;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f8060r = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        p destination = (p) obj;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.m.e(destination, "destination");
                                zContainsKey = this.f8060r.f8074l.containsKey(Integer.valueOf(destination.f7404r.f8091a));
                                break;
                            default:
                                kotlin.jvm.internal.m.e(destination, "destination");
                                zContainsKey = this.f8060r.f8074l.containsKey(Integer.valueOf(destination.f7404r.f8091a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((p) fVar2.next()).f7404r.f8091a), (String) dVar.f8044b);
                }
                if (linkedHashMap.values().contains((String) dVar.f8044b)) {
                    this.f8075m.put((String) dVar.f8044b, jVar2);
                }
            }
        }
        this.f8067b.invoke();
        return uVar.f14264q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(T1.d popUpTo, boolean z5, n5.j jVar) {
        T1.i iVar;
        D d5;
        Set set;
        kotlin.jvm.internal.m.e(popUpTo, "popUpTo");
        n5.j jVar2 = this.f;
        T1.d dVar = (T1.d) jVar2.last();
        if (!kotlin.jvm.internal.m.a(dVar, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f7354r + ", which is not the top of the back stack (" + dVar.f7354r + ')').toString());
        }
        q.g0(jVar2);
        T1.h hVar = (T1.h) this.f8082t.get(this.f8081s.b(dVar.f7354r.f7403q));
        boolean z6 = true;
        if ((hVar == null || (d5 = hVar.f) == null || (set = (Set) d5.f6338q.getValue()) == null || !set.contains(dVar)) && !this.f8073k.containsKey(dVar)) {
            z6 = false;
        }
        EnumC0653p enumC0653p = dVar.f7360x.j.f9572d;
        EnumC0653p enumC0653p2 = EnumC0653p.f9558s;
        if (enumC0653p.compareTo(enumC0653p2) >= 0) {
            if (z5) {
                dVar.c(enumC0653p2);
                jVar.addFirst(new T1.e(dVar));
            }
            if (z6) {
                dVar.c(enumC0653p2);
            } else {
                dVar.c(EnumC0653p.f9556q);
                q(dVar);
            }
        }
        if (z5 || z6 || (iVar = this.f8077o) == null) {
            return;
        }
        String backStackEntryId = dVar.f7358v;
        kotlin.jvm.internal.m.e(backStackEntryId, "backStackEntryId");
        k0 k0Var = (k0) iVar.f7374b.remove(backStackEntryId);
        if (k0Var != null) {
            k0Var.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList o() {
        EnumC0653p enumC0653p;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8082t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0653p = EnumC0653p.f9559t;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((T1.h) it.next()).f.f6338q.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                T1.d dVar = (T1.d) obj;
                if (!arrayList.contains(dVar) && dVar.f7360x.f8040k.compareTo(enumC0653p) < 0) {
                    arrayList2.add(obj);
                }
            }
            q.e0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            T1.d dVar2 = (T1.d) obj2;
            if (!arrayList.contains(dVar2) && dVar2.f7360x.f8040k.compareTo(enumC0653p) >= 0) {
                arrayList3.add(obj2);
            }
        }
        q.e0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((T1.d) obj3).f7354r instanceof r)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p(int i, final Bundle bundle, w wVar) {
        p pVarG;
        T1.d dVar;
        p pVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f8074l;
        int i7 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        kotlin.jvm.internal.m.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a((String) it.next(), str)) {
                it.remove();
            }
        }
        n5.j<T1.e> jVar = (n5.j) kotlin.jvm.internal.B.a(this.f8075m).remove(str);
        C3.b context = this.f8066a.f7419c;
        ArrayList arrayList = new ArrayList();
        T1.d dVar2 = (T1.d) this.f.l();
        if (dVar2 == null || (pVarG = dVar2.f7354r) == null) {
            pVarG = g();
        }
        if (jVar != null) {
            for (T1.e eVar : jVar) {
                d dVar3 = eVar.f7361a;
                d dVar4 = eVar.f7361a;
                p pVarD = d(dVar3.f8043a, pVarG, null, true);
                if (pVarD == null) {
                    int i8 = p.f7402u;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC1397A.s(context, dVar4.f8043a) + " cannot be found from the current destination " + pVarG).toString());
                }
                EnumC0653p hostLifecycleState = h();
                T1.i iVar = this.f8077o;
                kotlin.jvm.internal.m.e(context, "context");
                kotlin.jvm.internal.m.e(hostLifecycleState, "hostLifecycleState");
                Bundle bundle3 = (Bundle) dVar4.f8045c;
                if (bundle3 != null) {
                    Context context2 = context.f1185a;
                    bundle3.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String id = (String) dVar4.f8044b;
                Bundle bundle4 = (Bundle) dVar4.f8046d;
                kotlin.jvm.internal.m.e(id, "id");
                arrayList.add(new T1.d(context, pVarD, bundle2, hostLifecycleState, iVar, id, bundle4));
                pVarG = pVarD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (!(((T1.d) obj).f7354r instanceof r)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            T1.d dVar5 = (T1.d) obj2;
            List list = (List) n5.l.s0(arrayList2);
            if (kotlin.jvm.internal.m.a((list == null || (dVar = (T1.d) n5.l.r0(list)) == null || (pVar = dVar.f7354r) == null) ? null : pVar.f7403q, dVar5.f7354r.f7403q)) {
                list.add(dVar5);
            } else {
                arrayList2.add(AbstractC0836n2.C(dVar5));
            }
        }
        final kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        int size3 = arrayList2.size();
        while (i7 < size3) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            List list2 = (List) obj3;
            z zVarB = this.f8081s.b(((T1.d) n5.l.l0(list2)).f7354r.f7403q);
            final kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            final ArrayList arrayList4 = arrayList;
            this.f8083u = new B5.c() { // from class: W1.i
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.c
                public final Object invoke(Object obj4) {
                    List listSubList;
                    T1.d entry = (T1.d) obj4;
                    kotlin.jvm.internal.m.e(entry, "entry");
                    uVar.f14264q = true;
                    ArrayList arrayList5 = arrayList4;
                    int iIndexOf = arrayList5.indexOf(entry);
                    if (iIndexOf != -1) {
                        kotlin.jvm.internal.w wVar3 = wVar2;
                        int i11 = iIndexOf + 1;
                        listSubList = arrayList5.subList(wVar3.f14266q, i11);
                        wVar3.f14266q = i11;
                    } else {
                        listSubList = s.f15299q;
                    }
                    this.a(entry.f7354r, bundle, entry, listSubList);
                    return C1386y.f15098a;
                }
            };
            zVarB.d(list2, wVar);
            this.f8083u = null;
            arrayList = arrayList4;
        }
        return uVar.f14264q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(T1.d child) {
        kotlin.jvm.internal.m.e(child, "child");
        T1.d dVar = (T1.d) this.j.remove(child);
        if (dVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8073k;
        a aVar = (a) linkedHashMap.get(dVar);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f8031a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            T1.h hVar = (T1.h) this.f8082t.get(this.f8081s.b(dVar.f7354r.f7403q));
            if (hVar != null) {
                hVar.c(dVar);
            }
            linkedHashMap.remove(dVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        a aVar;
        D d5;
        Set set;
        ArrayList arrayListC0 = n5.l.C0(this.f);
        if (arrayListC0.isEmpty()) {
            return;
        }
        ArrayList arrayListC = AbstractC0836n2.C(((T1.d) n5.l.r0(arrayListC0)).f7354r);
        ArrayList arrayList = new ArrayList();
        if (n5.l.r0(arrayListC) instanceof T1.c) {
            Iterator it = n5.l.w0(arrayListC0).iterator();
            while (it.hasNext()) {
                p pVar = ((T1.d) it.next()).f7354r;
                arrayList.add(pVar);
                if (!(pVar instanceof T1.c) && !(pVar instanceof r)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (T1.d dVar : n5.l.w0(arrayListC0)) {
            EnumC0653p enumC0653p = dVar.f7360x.f8040k;
            p pVar2 = dVar.f7354r;
            p pVar3 = (p) n5.l.m0(arrayListC);
            EnumC0653p enumC0653p2 = EnumC0653p.f9560u;
            EnumC0653p enumC0653p3 = EnumC0653p.f9559t;
            if (pVar3 != null && pVar3.f7404r.f8091a == pVar2.f7404r.f8091a) {
                if (enumC0653p != enumC0653p2) {
                    T1.h hVar = (T1.h) this.f8082t.get(this.f8081s.b(dVar.f7354r.f7403q));
                    if (kotlin.jvm.internal.m.a((hVar == null || (d5 = hVar.f) == null || (set = (Set) d5.f6338q.getValue()) == null) ? null : Boolean.valueOf(set.contains(dVar)), Boolean.TRUE) || ((aVar = (a) this.f8073k.get(dVar)) != null && aVar.f8031a.get() == 0)) {
                        map.put(dVar, enumC0653p3);
                    } else {
                        map.put(dVar, enumC0653p2);
                    }
                }
                p pVar4 = (p) n5.l.m0(arrayList);
                if (pVar4 != null && pVar4.f7404r.f8091a == pVar2.f7404r.f8091a) {
                    q.f0(arrayList);
                }
                q.f0(arrayListC);
                r rVar = pVar2.f7405s;
                if (rVar != null) {
                    arrayListC.add(rVar);
                }
            } else if (arrayList.isEmpty() || pVar2.f7404r.f8091a != ((p) n5.l.l0(arrayList)).f7404r.f8091a) {
                dVar.c(EnumC0653p.f9558s);
            } else {
                p pVar5 = (p) q.f0(arrayList);
                if (enumC0653p == enumC0653p2) {
                    dVar.c(enumC0653p3);
                } else if (enumC0653p != enumC0653p3) {
                    map.put(dVar, enumC0653p3);
                }
                r rVar2 = pVar5.f7405s;
                if (rVar2 != null && !arrayList.contains(rVar2)) {
                    arrayList.add(rVar2);
                }
            }
        }
        int size = arrayListC0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC0.get(i);
            i++;
            T1.d dVar2 = (T1.d) obj;
            EnumC0653p enumC0653p4 = (EnumC0653p) map.get(dVar2);
            if (enumC0653p4 != null) {
                dVar2.c(enumC0653p4);
            } else {
                dVar2.f7360x.b();
            }
        }
    }
}
