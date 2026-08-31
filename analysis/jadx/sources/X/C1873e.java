package x;

import M5.InterfaceC0261w;
import kotlin.jvm.internal.v;
import m5.C1386y;
import q5.InterfaceC1524c;
import w.InterfaceC1788i0;

/* JADX INFO: renamed from: x.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1873e extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f18292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1876h f18294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f18295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B5.c f18296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1788i0 f18297v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1873e(C1876h c1876h, float f, B5.c cVar, InterfaceC1788i0 interfaceC1788i0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18294s = c1876h;
        this.f18295t = f;
        this.f18296u = cVar;
        this.f18297v = interfaceC1788i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1873e(this.f18294s, this.f18295t, this.f18296u, this.f18297v, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1873e) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0238 A[RETURN] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r5 = r23
            x.h r0 = r5.f18294s
            v3.l r6 = r0.f18304a
            int r1 = r5.f18293r
            r7 = 0
            r8 = 2
            B5.c r9 = r5.f18296u
            r10 = 0
            r2 = 1
            r5.a r11 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L22
            if (r1 != r8) goto L1a
            m5.AbstractC1362a.e(r24)
            return r24
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L22:
            kotlin.jvm.internal.v r1 = r5.f18292q
            m5.AbstractC1362a.e(r24)
            r16 = r10
            r10 = r1
            r1 = r24
            goto L10b
        L2e:
            m5.AbstractC1362a.e(r24)
            u.v r1 = r0.f18305b
            Z.m r3 = u.A0.f16746a
            E.c0 r3 = new E.c0
            i3.a r1 = r1.f17068a
            r3.<init>(r1)
            u.m r1 = new u.m
            r1.<init>(r10)
            u.m r4 = new u.m
            float r12 = r5.f18295t
            r4.<init>(r12)
            u.q r1 = r3.t(r1, r4)
            u.m r1 = (u.C1659m) r1
            float r1 = r1.f16972a
            java.lang.Object r3 = r6.f17579r
            F.e r3 = (F.C0151e) r3
            int r4 = r3.m()
            P.f0 r13 = r3.f1830p
            java.lang.Object r13 = r13.getValue()
            F.B r13 = (F.B) r13
            int r13 = r13.f1762c
            int r13 = r13 + r4
            if (r13 != 0) goto L6b
            r1 = r10
            r16 = r1
            r17 = r11
            goto Lce
        L6b:
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 >= 0) goto L73
            int r4 = r3.f1822e
            int r4 = r4 + r2
            goto L75
        L73:
            int r4 = r3.f1822e
        L75:
            float r14 = (float) r13
            float r1 = r1 / r14
            int r1 = (int) r1
            int r1 = r1 + r4
            int r14 = r3.l()
            int r1 = D5.a.q(r1, r7, r14)
            r3.m()
            P.f0 r14 = r3.f1830p
            java.lang.Object r14 = r14.getValue()
            F.B r14 = (F.B) r14
            int r14 = r14.f1762c
            long r14 = (long) r4
            r16 = r10
            r17 = r11
            long r10 = (long) r2
            long r18 = r14 - r10
            r20 = 0
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            r24 = r3
            if (r22 >= 0) goto La1
            r2 = r20
            goto La3
        La1:
            r2 = r18
        La3:
            int r2 = (int) r2
            long r14 = r14 + r10
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 <= 0) goto Lad
            r14 = r10
        Lad:
            int r3 = (int) r14
            int r1 = D5.a.q(r1, r2, r3)
            int r2 = r24.l()
            int r1 = D5.a.q(r1, r7, r2)
            int r1 = r1 - r4
            int r1 = r1 * r13
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 - r13
            if (r1 >= 0) goto Lc4
            r1 = r7
        Lc4:
            if (r1 != 0) goto Lc8
            float r1 = (float) r1
            goto Lce
        Lc8:
            float r1 = (float) r1
            float r2 = java.lang.Math.signum(r12)
            float r1 = r1 * r2
        Lce:
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 == 0) goto Ld9
            java.lang.String r2 = "calculateApproachOffset returned NaN. Please use a valid value."
            z.AbstractC1923a.c(r2)
        Ld9:
            kotlin.jvm.internal.v r10 = new kotlin.jvm.internal.v
            r10.<init>()
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.signum(r12)
            float r2 = r2 * r1
            r10.f14265q = r2
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r9.invoke(r1)
            float r2 = r10.f14265q
            x.d r4 = new x.d
            r1 = 1
            r4.<init>(r10, r9, r1)
            r5.f18292q = r10
            r5.f18293r = r1
            w.i0 r1 = r5.f18297v
            float r3 = r5.f18295t
            java.lang.Object r1 = x.C1876h.b(r0, r1, r2, r3, r4, r5)
            r11 = r17
            if (r1 != r11) goto L10b
            goto L237
        L10b:
            u.l r1 = (u.C1658l) r1
            java.lang.Object r2 = r1.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Object r3 = r6.f17579r
            F.e r3 = (F.C0151e) r3
            F.B r4 = r3.k()
            x.m r4 = r4.f1769m
            F.B r12 = r3.k()
            java.util.List r12 = r12.f1760a
            r13 = r12
            java.util.Collection r13 = (java.util.Collection) r13
            int r13 = r13.size()
            r14 = r7
            r24 = -8388608(0xffffffffff800000, float:-Infinity)
            r17 = -8388608(0xffffffffff800000, float:-Infinity)
            r18 = 2139095040(0x7f800000, float:Infinity)
        L135:
            if (r14 >= r13) goto L17d
            java.lang.Object r19 = r12.get(r14)
            r20 = 2139095040(0x7f800000, float:Infinity)
            r15 = r19
            F.l r15 = (F.C0158l) r15
            F.B r19 = r3.k()
            Q2.g.F(r19)
            F.B r8 = r3.k()
            int r8 = r8.f
            F.B r8 = r3.k()
            int r8 = r8.f1763d
            F.B r8 = r3.k()
            int r8 = r8.f1761b
            int r8 = r15.f1896l
            r3.l()
            r4.getClass()
            float r15 = (float) r7
            float r8 = (float) r8
            float r8 = r8 - r15
            int r15 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r15 > 0) goto L16f
            int r15 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r15 <= 0) goto L16f
            r17 = r8
        L16f:
            int r15 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r15 < 0) goto L179
            int r15 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r15 >= 0) goto L179
            r18 = r8
        L179:
            int r14 = r14 + 1
            r8 = 2
            goto L135
        L17d:
            r20 = 2139095040(0x7f800000, float:Infinity)
            int r4 = (r17 > r24 ? 1 : (r17 == r24 ? 0 : -1))
            if (r4 != 0) goto L185
            r17 = r18
        L185:
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 != 0) goto L18b
            r18 = r17
        L18b:
            boolean r4 = r3.c()
            if (r4 != 0) goto L19e
            boolean r4 = E3.h.F(r3, r2)
            if (r4 == 0) goto L19c
            r17 = r16
            r18 = r17
            goto L19e
        L19c:
            r18 = r16
        L19e:
            boolean r4 = r3.a()
            if (r4 != 0) goto L1b3
            boolean r3 = E3.h.F(r3, r2)
            if (r3 != 0) goto L1ae
            r3 = r16
            r4 = r3
            goto L1b6
        L1ae:
            r3 = r16
        L1b0:
            r4 = r18
            goto L1b6
        L1b3:
            r3 = r17
            goto L1b0
        L1b6:
            java.lang.Object r6 = r6.f17580s
            F.p r6 = (F.C0162p) r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            java.lang.Float r12 = java.lang.Float.valueOf(r4)
            java.lang.Object r2 = r6.invoke(r2, r8, r12)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 != 0) goto L1d5
            goto L1fd
        L1d5:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1da
            goto L1fd
        L1da:
            int r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r6 != 0) goto L1df
            goto L1fd
        L1df:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Final Snapping Offset Should Be one of "
            r6.<init>(r8)
            r6.append(r3)
            java.lang.String r3 = ", "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = " or 0.0"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            z.AbstractC1923a.c(r3)
        L1fd:
            int r3 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r3 != 0) goto L202
            goto L206
        L202:
            int r3 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r3 != 0) goto L208
        L206:
            r2 = r16
        L208:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L213
            java.lang.String r3 = "calculateSnapOffset returned NaN. Please use a valid value."
            z.AbstractC1923a.c(r3)
        L213:
            r10.f14265q = r2
            r3 = 30
            r4 = r16
            u.l r3 = u.AbstractC1644d.k(r1, r4, r4, r3)
            u.f0 r4 = r0.f18306c
            x.d r0 = new x.d
            r0.<init>(r10, r9, r7)
            r1 = 0
            r5.f18292q = r1
            r1 = 2
            r5.f18293r = r1
            r1 = r0
            w.i0 r0 = r5.f18297v
            r5 = r1
            r1 = r2
            r6 = r23
            java.lang.Object r0 = x.AbstractC1880l.c(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r11) goto L238
        L237:
            return r11
        L238:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1873e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
