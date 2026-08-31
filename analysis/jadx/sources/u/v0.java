package u;

import P.C0345b;
import P.C0350d0;
import P.C0354f0;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O3.D0 f17069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f17070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0354f0 f17072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0354f0 f17073e;
    public final C0350d0 f = new C0350d0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0350d0 f17074g = new C0350d0(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0354f0 f17075h;
    public final a0.q i;
    public final a0.q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0354f0 f17076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final P.C f17077l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v0(O3.D0 d02, v0 v0Var, String str) {
        this.f17069a = d02;
        this.f17070b = v0Var;
        this.f17071c = str;
        this.f17072d = C0345b.q(d02.j());
        this.f17073e = C0345b.q(new r0(d02.j(), d02.j()));
        Boolean bool = Boolean.FALSE;
        this.f17075h = C0345b.q(bool);
        this.i = new a0.q();
        this.j = new a0.q();
        this.f17076k = C0345b.q(bool);
        this.f17077l = C0345b.m(new t.n(this, 1));
        d02.m(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r11, P.C0371o r12, java.lang.Object r13) {
        /*
            r10 = this;
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            r12.U(r0)
            boolean r0 = r12.g(r13)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r11
            boolean r1 = r12.g(r10)
            r2 = 32
            if (r1 == 0) goto L1a
            r1 = r2
            goto L1c
        L1a:
            r1 = 16
        L1c:
            r0 = r0 | r1
            r1 = r0 & 19
            r3 = 18
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L27
            r1 = r4
            goto L28
        L27:
            r1 = r5
        L28:
            r3 = r0 & 1
            boolean r1 = r12.K(r3, r1)
            if (r1 == 0) goto Lc2
            boolean r1 = r10.g()
            if (r1 != 0) goto Lb8
            r1 = 1822801203(0x6ca5bd33, float:1.6029298E27)
            r12.S(r1)
            r10.p(r13)
            O3.D0 r1 = r10.f17069a
            java.lang.Object r1 = r1.j()
            boolean r1 = kotlin.jvm.internal.m.a(r13, r1)
            if (r1 == 0) goto L77
            P.d0 r1 = r10.f17074g
            P.G0 r3 = r1.f5392r
            a0.w r1 = a0.n.t(r3, r1)
            P.G0 r1 = (P.G0) r1
            long r6 = r1.f5312c
            r8 = -9223372036854775808
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L5e
            goto L77
        L5e:
            P.f0 r1 = r10.f17075h
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6d
            goto L77
        L6d:
            r0 = 1824275067(0x6cbc3a7b, float:1.8204338E27)
            r12.S(r0)
            r12.p(r5)
            goto Lb4
        L77:
            r1 = 1823032494(0x6ca944ae, float:1.6370624E27)
            r12.S(r1)
            java.lang.Object r1 = r12.H()
            P.S r3 = P.C0363k.f5418a
            if (r1 != r3) goto L8c
            M5.w r1 = P.C0345b.k(r12)
            r12.d0(r1)
        L8c:
            M5.w r1 = (M5.InterfaceC0261w) r1
            boolean r6 = r12.i(r1)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r2) goto L97
            goto L98
        L97:
            r4 = r5
        L98:
            r0 = r6 | r4
            java.lang.Object r2 = r12.H()
            if (r0 != 0) goto La2
            if (r2 != r3) goto Lac
        La2:
            A.Y r2 = new A.Y
            r0 = 26
            r2.<init>(r0, r1, r10)
            r12.d0(r2)
        Lac:
            B5.c r2 = (B5.c) r2
            P.C0345b.d(r1, r10, r2, r12)
            r12.p(r5)
        Lb4:
            r12.p(r5)
            goto Lc5
        Lb8:
            r0 = 1824284987(0x6cbc613b, float:1.8218977E27)
            r12.S(r0)
            r12.p(r5)
            goto Lc5
        Lc2:
            r12.N()
        Lc5:
            P.o0 r12 = r12.r()
            if (r12 == 0) goto Ld4
            B0.j0 r0 = new B0.j0
            r1 = 11
            r0.<init>(r11, r1, r10, r13)
            r12.f5482d = r0
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.v0.a(int, P.o, java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        a0.q qVar = this.i;
        int size = qVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            C0350d0 c0350d0 = ((s0) qVar.get(i)).f17036B;
            jMax = Math.max(jMax, ((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c);
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            jMax = Math.max(jMax, ((v0) qVar2.get(i7)).b());
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) qVar.get(i);
            s0Var.f17045v = null;
            s0Var.f17044u = null;
            s0Var.f17048y = false;
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((v0) qVar2.get(i7)).c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            if (((s0) qVar.get(i)).f17044u != null) {
                return true;
            }
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (((v0) qVar2.get(i7)).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long e() {
        v0 v0Var = this.f17070b;
        if (v0Var != null) {
            return v0Var.e();
        }
        C0350d0 c0350d0 = this.f;
        return ((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q0 f() {
        return (q0) this.f17073e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        return ((Boolean) this.f17076k.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z5, long j) {
        C0350d0 c0350d0 = this.f17074g;
        long j7 = ((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c;
        O3.D0 d02 = this.f17069a;
        if (j7 == Long.MIN_VALUE) {
            c0350d0.e(j);
            ((C0354f0) d02.f4346r).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0354f0) d02.f4346r).getValue()).booleanValue()) {
            ((C0354f0) d02.f4346r).setValue(Boolean.TRUE);
        }
        this.f17075h.setValue(Boolean.FALSE);
        a0.q qVar = this.i;
        int size = qVar.size();
        boolean z6 = true;
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) qVar.get(i);
            C0354f0 c0354f0 = s0Var.f17046w;
            C0354f0 c0354f02 = s0Var.f17046w;
            if (!((Boolean) c0354f0.getValue()).booleanValue()) {
                long jC = z5 ? s0Var.b().c() : j;
                s0Var.d(s0Var.b().b(jC));
                s0Var.f17035A = s0Var.b().f(jC);
                if (s0Var.b().g(jC)) {
                    c0354f02.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0354f02.getValue()).booleanValue()) {
                z6 = false;
            }
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            v0 v0Var = (v0) qVar2.get(i7);
            C0354f0 c0354f03 = v0Var.f17072d;
            O3.D0 d03 = v0Var.f17069a;
            if (!kotlin.jvm.internal.m.a(c0354f03.getValue(), d03.j())) {
                v0Var.h(z5, j);
            }
            if (!kotlin.jvm.internal.m.a(v0Var.f17072d.getValue(), d03.j())) {
                z6 = false;
            }
        }
        if (z6) {
            i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        this.f17074g.e(Long.MIN_VALUE);
        O3.D0 d02 = this.f17069a;
        if (d02 instanceof C1632K) {
            d02.l(this.f17072d.getValue());
        }
        n(0L);
        ((C0354f0) d02.f4346r).setValue(Boolean.FALSE);
        a0.q qVar = this.j;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            ((v0) qVar.get(i)).i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(float f) {
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) qVar.get(i);
            s0Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                n0 n0Var = s0Var.f17045v;
                if (n0Var != null) {
                    s0Var.b().h(n0Var.f16999c);
                    s0Var.f17044u = null;
                    s0Var.f17045v = null;
                }
                Object obj = f == -4.0f ? s0Var.b().f17000d : s0Var.b().f16999c;
                s0Var.b().h(obj);
                s0Var.b().i(obj);
                s0Var.d(obj);
                s0Var.f17036B.e(s0Var.b().c());
            } else {
                s0Var.f17047x.f(f);
            }
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((v0) qVar2.get(i7)).j(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(Object obj, Object obj2) {
        this.f17074g.e(Long.MIN_VALUE);
        O3.D0 d02 = this.f17069a;
        ((C0354f0) d02.f4346r).setValue(Boolean.FALSE);
        boolean zG = g();
        C0354f0 c0354f0 = this.f17072d;
        if (!zG || !kotlin.jvm.internal.m.a(d02.j(), obj) || !kotlin.jvm.internal.m.a(c0354f0.getValue(), obj2)) {
            if (!kotlin.jvm.internal.m.a(d02.j(), obj) && (d02 instanceof C1632K)) {
                d02.l(obj);
            }
            c0354f0.setValue(obj2);
            this.f17076k.setValue(Boolean.TRUE);
            this.f17073e.setValue(new r0(obj, obj2));
        }
        a0.q qVar = this.j;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            v0 v0Var = (v0) qVar.get(i);
            kotlin.jvm.internal.m.c(v0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (v0Var.g()) {
                v0Var.k(v0Var.f17069a.j(), v0Var.f17072d.getValue());
            }
        }
        a0.q qVar2 = this.i;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((s0) qVar2.get(i7)).c(0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(long j) {
        C0350d0 c0350d0 = this.f17074g;
        if (((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c == Long.MIN_VALUE) {
            c0350d0.e(j);
        }
        n(j);
        this.f17075h.setValue(Boolean.FALSE);
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            ((s0) qVar.get(i)).c(j);
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            v0 v0Var = (v0) qVar2.get(i7);
            if (!kotlin.jvm.internal.m.a(v0Var.f17072d.getValue(), v0Var.f17069a.j())) {
                v0Var.l(j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(S s6) {
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) qVar.get(i);
            C0354f0 c0354f0 = s0Var.f17049z;
            if (!kotlin.jvm.internal.m.a(s0Var.b().f16999c, s0Var.b().f17000d)) {
                s0Var.f17045v = s0Var.b();
                s0Var.f17044u = s6;
            }
            s0Var.f17043t.setValue(new n0(s0Var.f17038D, s0Var.f17040q, c0354f0.getValue(), c0354f0.getValue(), s0Var.f17035A.c()));
            s0Var.f17036B.e(s0Var.b().c());
            s0Var.f17048y = true;
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((v0) qVar2.get(i7)).m(s6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(long j) {
        if (this.f17070b == null) {
            this.f.e(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        n0 n0Var;
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) qVar.get(i);
            S s6 = s0Var.f17044u;
            if (s6 != null && (n0Var = s0Var.f17045v) != null) {
                long jH = D5.a.H(s6.f16826g * ((double) s6.f16824d));
                Object objB = n0Var.b(jH);
                if (s0Var.f17048y) {
                    s0Var.b().i(objB);
                }
                s0Var.b().h(objB);
                s0Var.f17036B.e(s0Var.b().c());
                if (s0Var.f17047x.e() == -2.0f || s0Var.f17048y) {
                    s0Var.d(objB);
                } else {
                    s0Var.c(s0Var.f17039E.e());
                }
                if (jH >= s6.f16826g) {
                    s0Var.f17044u = null;
                    s0Var.f17045v = null;
                } else {
                    s6.f16823c = false;
                }
            }
        }
        a0.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((v0) qVar2.get(i7)).o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(Object obj) {
        C0354f0 c0354f0 = this.f17072d;
        if (kotlin.jvm.internal.m.a(c0354f0.getValue(), obj)) {
            return;
        }
        this.f17073e.setValue(new r0(c0354f0.getValue(), obj));
        O3.D0 d02 = this.f17069a;
        if (!kotlin.jvm.internal.m.a(d02.j(), c0354f0.getValue())) {
            d02.l(c0354f0.getValue());
        }
        c0354f0.setValue(obj);
        C0350d0 c0350d0 = this.f17074g;
        if (((P.G0) a0.n.t(c0350d0.f5392r, c0350d0)).f5312c == Long.MIN_VALUE) {
            this.f17075h.setValue(Boolean.TRUE);
        }
        a0.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            ((s0) qVar.get(i)).f17047x.f(-2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        a0.q qVar = this.i;
        int size = qVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((s0) qVar.get(i)) + ", ";
        }
        return str;
    }
}
