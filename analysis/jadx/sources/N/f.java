package N;

import P5.InterfaceC0398i;
import Q5.E;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f3931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3933t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.f3930q = i;
        this.f3931r = obj;
        this.f3932s = obj2;
        this.f3933t = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    @Override // P5.InterfaceC0398i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, q5.InterfaceC1524c r9) {
        /*
            r7 = this;
            int r0 = r7.f3930q
            switch(r0) {
                case 0: goto L109;
                case 1: goto L7f;
                case 2: goto L69;
                case 3: goto L41;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.Object r9 = r7.f3932s
            u.v0 r9 = (u.v0) r9
            java.lang.Object r0 = r7.f3931r
            P.k0 r0 = (P.C0364k0) r0
            if (r8 == 0) goto L36
            java.lang.Object r8 = r7.f3933t
            P.W r8 = (P.W) r8
            java.lang.Object r8 = r8.getValue()
            B5.e r8 = (B5.e) r8
            O3.D0 r1 = r9.f17069a
            java.lang.Object r1 = r1.j()
            P.f0 r9 = r9.f17072d
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r8 = r8.invoke(r1, r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L37
        L36:
            r8 = 0
        L37:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.setValue(r8)
            m5.y r8 = m5.C1386y.f15098a
            return r8
        L41:
            b.a r8 = (b.C0684a) r8
            java.lang.Object r9 = r7.f3931r
            P.W r9 = (P.W) r9
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            r0 = 1
            if (r9 <= r0) goto L66
            java.lang.Object r9 = r7.f3932s
            P.W r9 = (P.W) r9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.setValue(r0)
            java.lang.Object r9 = r7.f3933t
            P.b0 r9 = (P.C0346b0) r9
            float r8 = r8.f9856c
            r9.f(r8)
        L66:
            m5.y r8 = m5.C1386y.f15098a
            return r8
        L69:
            java.lang.Object r0 = r7.f3931r
            q5.h r0 = (q5.InterfaceC1529h) r0
            java.lang.Object r1 = r7.f3933t
            Q5.E r1 = (Q5.E) r1
            java.lang.Object r2 = r7.f3932s
            java.lang.Object r8 = Q5.AbstractC0423c.b(r0, r8, r2, r1, r9)
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r8 != r9) goto L7c
            goto L7e
        L7c:
            m5.y r8 = m5.C1386y.f15098a
        L7e:
            return r8
        L7f:
            boolean r0 = r9 instanceof P5.C0407s
            if (r0 == 0) goto L92
            r0 = r9
            P5.s r0 = (P5.C0407s) r0
            int r1 = r0.f6441u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L92
            int r1 = r1 - r2
            r0.f6441u = r1
            goto L97
        L92:
            P5.s r0 = new P5.s
            r0.<init>(r7, r9)
        L97:
            java.lang.Object r9 = r0.f6439s
            int r1 = r0.f6441u
            r2 = 3
            r3 = 2
            m5.y r4 = m5.C1386y.f15098a
            r5 = 1
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto Lbe
            if (r1 == r5) goto Laa
            if (r1 == r3) goto Lb6
            if (r1 != r2) goto Lae
        Laa:
            m5.AbstractC1362a.e(r9)
            goto L108
        Lae:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        Lb6:
            java.lang.Object r8 = r0.f6438r
            N.f r1 = r0.f6437q
            m5.AbstractC1362a.e(r9)
            goto Le8
        Lbe:
            m5.AbstractC1362a.e(r9)
            java.lang.Object r9 = r7.f3931r
            kotlin.jvm.internal.u r9 = (kotlin.jvm.internal.u) r9
            boolean r9 = r9.f14264q
            if (r9 == 0) goto Ld6
            java.lang.Object r9 = r7.f3932s
            P5.i r9 = (P5.InterfaceC0398i) r9
            r0.f6441u = r5
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r6) goto L108
            goto L107
        Ld6:
            java.lang.Object r9 = r7.f3933t
            P5.N r9 = (P5.N) r9
            r0.f6437q = r7
            r0.f6438r = r8
            r0.f6441u = r3
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r6) goto Le7
            goto L107
        Le7:
            r1 = r7
        Le8:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L108
            java.lang.Object r9 = r1.f3931r
            kotlin.jvm.internal.u r9 = (kotlin.jvm.internal.u) r9
            r9.f14264q = r5
            java.lang.Object r9 = r1.f3932s
            P5.i r9 = (P5.InterfaceC0398i) r9
            r1 = 0
            r0.f6437q = r1
            r0.f6438r = r1
            r0.f6441u = r2
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r6) goto L108
        L107:
            r4 = r6
        L108:
            return r4
        L109:
            boolean r0 = r9 instanceof N.e
            if (r0 == 0) goto L11c
            r0 = r9
            N.e r0 = (N.e) r0
            int r1 = r0.f3929u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L11c
            int r1 = r1 - r2
            r0.f3929u = r1
            goto L121
        L11c:
            N.e r0 = new N.e
            r0.<init>(r7, r9)
        L121:
            java.lang.Object r9 = r0.f3927s
            int r1 = r0.f3929u
            r2 = 1
            if (r1 == 0) goto L13a
            if (r1 != r2) goto L132
            java.lang.Object r8 = r0.f3926r
            N.f r0 = r0.f3925q
            m5.AbstractC1362a.e(r9)
            goto L15f
        L132:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L13a:
            m5.AbstractC1362a.e(r9)
            java.lang.Object r9 = r7.f3931r
            kotlin.jvm.internal.y r9 = (kotlin.jvm.internal.y) r9
            java.lang.Object r9 = r9.f14268q
            M5.b0 r9 = (M5.InterfaceC0241b0) r9
            if (r9 == 0) goto L15e
            N.a r1 = new N.a
            r1.<init>()
            r9.a(r1)
            r0.f3925q = r7
            r0.f3926r = r8
            r0.f3929u = r2
            java.lang.Object r9 = r9.f(r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r9 != r0) goto L15e
            goto L17b
        L15e:
            r0 = r7
        L15f:
            java.lang.Object r9 = r0.f3931r
            kotlin.jvm.internal.y r9 = (kotlin.jvm.internal.y) r9
            java.lang.Object r1 = r0.f3932s
            M5.w r1 = (M5.InterfaceC0261w) r1
            N.d r3 = new N.d
            java.lang.Object r0 = r0.f3933t
            B5.e r0 = (B5.e) r0
            r4 = 0
            r3.<init>(r0, r8, r1, r4)
            M5.x r8 = M5.EnumC0262x.f3898t
            M5.B r8 = M5.AbstractC0263y.t(r1, r4, r8, r3, r2)
            r9.f14268q = r8
            m5.y r0 = m5.C1386y.f15098a
        L17b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N.f.emit(java.lang.Object, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public f(InterfaceC0398i interfaceC0398i, InterfaceC1529h interfaceC1529h) {
        this.f3930q = 2;
        this.f3931r = interfaceC1529h;
        this.f3932s = R5.b.m(interfaceC1529h);
        this.f3933t = new E(interfaceC0398i, null);
    }
}
