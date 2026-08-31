package v;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1708c extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y.k f17310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1728x f17312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y.i f17314u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708c(C1728x c1728x, long j, y.i iVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17312s = c1728x;
        this.f17313t = j;
        this.f17314u = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1708c(this.f17312s, this.f17313t, this.f17314u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1708c) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x00b9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x007b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x00b0 */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0120, code lost:
    
        if (r16.f17314u.a(r1, r16) == r5) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f17311r
            v.x r2 = r0.f17312s
            r3 = 2
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            y.k r1 = r0.f17310q
            m5.AbstractC1362a.e(r17)
            goto L123
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            m5.AbstractC1362a.e(r17)
            goto L10f
        L24:
            m5.AbstractC1362a.e(r17)
            kotlin.jvm.internal.u r1 = new kotlin.jvm.internal.u
            r1.<init>()
            f0.e r6 = new f0.e
            r6.<init>(r1)
            c0.l r7 = r2.f10100q
            boolean r7 = r7.f10099D
            if (r7 != 0) goto L3c
            java.lang.String r7 = "visitAncestors called on an unattached node"
            y0.AbstractC1904a.b(r7)
        L3c:
            c0.l r7 = r2.f10100q
            c0.l r7 = r7.f10104u
            B0.L r8 = B0.AbstractC0041g.u(r2)
        L44:
            if (r8 == 0) goto Ld8
            B0.g0 r10 = r8.f268U
            c0.l r10 = r10.f433e
            int r10 = r10.f10103t
            r11 = 262144(0x40000, float:3.67342E-40)
            r10 = r10 & r11
            r12 = 0
            if (r10 == 0) goto Lc7
        L52:
            if (r7 == 0) goto Lc7
            int r10 = r7.f10102s
            r10 = r10 & r11
            if (r10 == 0) goto Lc4
            r10 = r7
            r13 = r12
        L5b:
            if (r10 == 0) goto Lc4
            boolean r14 = r10 instanceof B0.E0
            if (r14 == 0) goto L7f
            B0.E0 r10 = (B0.E0) r10
            java.lang.Object r14 = r10.o()
            s.b r15 = w.C1790j0.f18007F
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L7a
            java.lang.Object r10 = r6.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L7b
        L7a:
            r10 = r4
        L7b:
            if (r10 != 0) goto Lbf
            goto Ld8
        L7f:
            int r14 = r10.f10102s
            r14 = r14 & r11
            if (r14 == 0) goto L86
            r14 = r4
            goto L87
        L86:
            r14 = 0
        L87:
            if (r14 == 0) goto Lbf
            boolean r14 = r10 instanceof B0.AbstractC0049n
            if (r14 == 0) goto Lbf
            r14 = r10
            B0.n r14 = (B0.AbstractC0049n) r14
            c0.l r14 = r14.f473F
            r15 = 0
        L93:
            if (r14 == 0) goto Lbc
            int r9 = r14.f10102s
            r9 = r9 & r11
            if (r9 == 0) goto L9c
            r9 = r4
            goto L9d
        L9c:
            r9 = 0
        L9d:
            if (r9 == 0) goto Lb9
            int r15 = r15 + 1
            if (r15 != r4) goto La5
            r10 = r14
            goto Lb9
        La5:
            if (r13 != 0) goto Lb0
            R.e r13 = new R.e
            r9 = 16
            c0.l[] r9 = new c0.AbstractC0724l[r9]
            r13.<init>(r9)
        Lb0:
            if (r10 == 0) goto Lb6
            r13.c(r10)
            r10 = r12
        Lb6:
            r13.c(r14)
        Lb9:
            c0.l r14 = r14.f10105v
            goto L93
        Lbc:
            if (r15 != r4) goto Lbf
            goto L5b
        Lbf:
            c0.l r10 = B0.AbstractC0041g.f(r13)
            goto L5b
        Lc4:
            c0.l r7 = r7.f10104u
            goto L52
        Lc7:
            B0.L r8 = r8.s()
            if (r8 == 0) goto Ld5
            B0.g0 r7 = r8.f268U
            if (r7 == 0) goto Ld5
            B0.B0 r7 = r7.f432d
            goto L44
        Ld5:
            r7 = r12
            goto L44
        Ld8:
            boolean r1 = r1.f14264q
            if (r1 != 0) goto L101
            int r1 = v.AbstractC1729y.f17423b
            android.view.View r1 = B0.AbstractC0041g.w(r2)
            android.view.ViewParent r1 = r1.getParent()
        Le6:
            if (r1 == 0) goto Lfb
            boolean r6 = r1 instanceof android.view.ViewGroup
            if (r6 == 0) goto Lfb
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r6 = r1.shouldDelayChildPressedState()
            if (r6 == 0) goto Lf6
            r1 = r4
            goto Lfc
        Lf6:
            android.view.ViewParent r1 = r1.getParent()
            goto Le6
        Lfb:
            r1 = 0
        Lfc:
            if (r1 == 0) goto Lff
            goto L101
        Lff:
            r9 = 0
            goto L102
        L101:
            r9 = r4
        L102:
            if (r9 == 0) goto L10f
            long r6 = v.AbstractC1729y.f17422a
            r0.f17311r = r4
            java.lang.Object r1 = M5.AbstractC0263y.h(r6, r0)
            if (r1 != r5) goto L10f
            goto L122
        L10f:
            y.k r1 = new y.k
            long r6 = r0.f17313t
            r1.<init>(r6)
            r0.f17310q = r1
            r0.f17311r = r3
            y.i r3 = r0.f17314u
            java.lang.Object r3 = r3.a(r1, r0)
            if (r3 != r5) goto L123
        L122:
            return r5
        L123:
            r2.f17415O = r1
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1708c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
