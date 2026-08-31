package U1;

import M5.InterfaceC0261w;
import P.S0;
import m5.C1386y;
import q5.InterfaceC1524c;
import r.C1542A;
import u.v0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v0 f7537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T1.u f7538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1542A f7539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S0 f7540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f7541u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(v0 v0Var, T1.u uVar, C1542A c1542a, S0 s02, i iVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7537q = v0Var;
        this.f7538r = uVar;
        this.f7539s = c1542a;
        this.f7540t = s02;
        this.f7541u = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C(this.f7537q, this.f7538r, this.f7539s, this.f7540t, this.f7541u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C c7 = (C) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c7.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            m5.AbstractC1362a.e(r22)
            u.v0 r1 = r0.f7537q
            O3.D0 r2 = r1.f17069a
            java.lang.Object r2 = r2.j()
            P.f0 r1 = r1.f17072d
            java.lang.Object r3 = r1.getValue()
            boolean r2 = kotlin.jvm.internal.m.a(r2, r3)
            if (r2 == 0) goto Led
            T1.u r2 = r0.f7538r
            W1.j r3 = r2.f7418b
            n5.j r3 = r3.f
            java.lang.Object r3 = r3.l()
            T1.d r3 = (T1.d) r3
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r1.getValue()
            W1.j r2 = r2.f7418b
            n5.j r2 = r2.f
            java.lang.Object r2 = r2.l()
            T1.d r2 = (T1.d) r2
            boolean r2 = kotlin.jvm.internal.m.a(r3, r2)
            if (r2 == 0) goto Led
        L3b:
            P.S0 r2 = r0.f7540t
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L49:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            T1.d r3 = (T1.d) r3
            U1.i r4 = r0.f7541u
            T1.h r4 = r4.b()
            r4.c(r3)
            goto L49
        L5f:
            r.A r2 = r0.f7539s
            long[] r3 = r2.f16104a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto Led
            r6 = 0
        L69:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto Le7
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r12 = 0
        L83:
            if (r12 >= r9) goto Le5
            r13 = 255(0xff, double:1.26E-321)
            long r15 = r7 & r13
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto Ldd
            int r15 = r6 << 3
            int r15 = r15 + r12
            java.lang.Object[] r5 = r2.f16105b
            r5 = r5[r15]
            r16 = r11
            float[] r11 = r2.f16106c
            r11 = r11[r15]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r11 = r1.getValue()
            T1.d r11 = (T1.d) r11
            java.lang.String r11 = r11.f7358v
            boolean r5 = kotlin.jvm.internal.m.a(r5, r11)
            if (r5 != 0) goto Ldf
            int r5 = r2.f16108e
            int r5 = r5 + (-1)
            r2.f16108e = r5
            long[] r5 = r2.f16104a
            int r11 = r2.f16107d
            int r17 = r15 >> 3
            r18 = r15 & 7
            int r18 = r18 << 3
            r19 = r5[r17]
            long r13 = r13 << r18
            long r13 = ~r13
            long r13 = r19 & r13
            r19 = 254(0xfe, double:1.255E-321)
            long r18 = r19 << r18
            long r13 = r13 | r18
            r5[r17] = r13
            int r17 = r15 + (-7)
            r17 = r17 & r11
            r11 = r11 & 7
            int r17 = r17 + r11
            int r11 = r17 >> 3
            r5[r11] = r13
            java.lang.Object[] r5 = r2.f16105b
            r11 = 0
            r5[r15] = r11
            goto Ldf
        Ldd:
            r16 = r11
        Ldf:
            long r7 = r7 >> r10
            int r12 = r12 + 1
            r11 = r16
            goto L83
        Le5:
            if (r9 != r10) goto Led
        Le7:
            if (r6 == r4) goto Led
            int r6 = r6 + 1
            goto L69
        Led:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
