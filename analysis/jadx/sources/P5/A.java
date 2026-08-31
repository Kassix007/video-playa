package P5;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O f6329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h f6330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f6331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Float f6332u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o6, InterfaceC0397h interfaceC0397h, S s6, Float f, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6329r = o6;
        this.f6330s = interfaceC0397h;
        this.f6331t = s6;
        this.f6332u = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new A(this.f6329r, this.f6330s, this.f6331t, this.f6332u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[RETURN] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f6328q
            m5.y r2 = m5.C1386y.f15098a
            r3 = 4
            r4 = 3
            r5 = 1
            P5.h r6 = r0.f6330s
            r7 = 2
            P5.S r8 = r0.f6331t
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2e
            if (r1 == r7) goto L2a
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            m5.AbstractC1362a.e(r22)
            return r2
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            m5.AbstractC1362a.e(r22)
            return r2
        L2a:
            m5.AbstractC1362a.e(r22)
            goto L5c
        L2e:
            m5.AbstractC1362a.e(r22)
            return r2
        L32:
            m5.AbstractC1362a.e(r22)
            P5.L r1 = P5.K.f6362a
            P5.O r10 = r0.f6329r
            if (r10 != r1) goto L45
            r0.f6328q = r5
            java.lang.Object r1 = r6.collect(r8, r0)
            if (r1 != r9) goto Lc0
            goto Lbf
        L45:
            P5.L r1 = P5.K.f6363b
            r11 = 0
            if (r10 != r1) goto L65
            Q5.D r1 = r8.f()
            P5.y r3 = new P5.y
            r3.<init>(r7, r11)
            r0.f6328q = r7
            java.lang.Object r1 = P5.H.i(r1, r3, r0)
            if (r1 != r9) goto L5c
            goto Lbf
        L5c:
            r0.f6328q = r4
            java.lang.Object r1 = r6.collect(r8, r0)
            if (r1 != r9) goto Lc0
            goto Lbf
        L65:
            Q5.D r14 = r8.f()
            P5.M r13 = new P5.M
            r13.<init>(r10, r11)
            int r1 = P5.AbstractC0409u.f6446a
            Q5.o r12 = new Q5.o
            q5.i r15 = q5.C1530i.f16022q
            r16 = -2
            O5.a r17 = O5.a.f5206q
            r12.<init>(r13, r14, r15, r16, r17)
            P5.N r1 = new P5.N
            r1.<init>(r7, r11)
            P5.r r4 = new P5.r
            r4.<init>(r12, r1, r5)
            P5.h r1 = P5.H.g(r4)
            P5.h r1 = P5.H.g(r1)
            P5.z r4 = new P5.z
            java.lang.Float r5 = r0.f6332u
            r4.<init>(r6, r8, r5, r11)
            r0.f6328q = r3
            P5.t r3 = new P5.t
            r3.<init>(r4, r11)
            r18 = r15
            Q5.o r15 = new Q5.o
            r19 = -2
            r16 = r3
            r20 = r17
            r17 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r1 = 0
            P5.h r1 = P5.H.e(r15, r1)
            Q5.x r3 = Q5.x.f6662q
            java.lang.Object r1 = r1.collect(r3, r0)
            if (r1 != r9) goto Lb8
            goto Lb9
        Lb8:
            r1 = r2
        Lb9:
            if (r1 != r9) goto Lbc
            goto Lbd
        Lbc:
            r1 = r2
        Lbd:
            if (r1 != r9) goto Lc0
        Lbf:
            return r9
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
