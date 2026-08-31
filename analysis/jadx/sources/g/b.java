package G;

import B0.K;
import B0.n0;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f1958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f1959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f1960t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, n0 n0Var, K k7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1958r = eVar;
        this.f1959s = n0Var;
        this.f1960t = k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new b(this.f1958r, this.f1959s, this.f1960t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f1957q
            m5.y r1 = m5.C1386y.f15098a
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            m5.AbstractC1362a.e(r14)
            return r1
        Ld:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L15:
            m5.AbstractC1362a.e(r14)
            G.e r14 = r13.f1958r
            w.j r0 = r14.f1969E
            G.a r3 = new G.a
            B0.n0 r4 = r13.f1959s
            B0.K r5 = r13.f1960t
            r3.<init>(r14, r4, r5)
            r13.f1957q = r2
            r0.getClass()
            java.lang.Object r14 = r3.invoke()
            i0.c r14 = (i0.C1131c) r14
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r14 == 0) goto Lcb
            long r5 = r0.f18005M
            boolean r14 = r0.z0(r14, r5)
            if (r14 != 0) goto Lcb
            M5.h r14 = new M5.h
            q5.c r5 = n5.AbstractC1397A.v(r13)
            r14.<init>(r2, r5)
            r14.s()
            w.g r5 = new w.g
            r5.<init>(r3, r14)
            E.k r6 = r0.f18001I
            R.e r7 = r6.f1572a
            java.lang.Object r3 = r3.invoke()
            i0.c r3 = (i0.C1131c) r3
            if (r3 != 0) goto L5d
            r14.resumeWith(r1)
            goto Lc4
        L5d:
            v.u r8 = new v.u
            r9 = 3
            r8.<init>(r9, r6, r5)
            r14.u(r8)
            int r6 = r7.f6678s
            r8 = 0
            G5.d r6 = D5.a.O(r8, r6)
            int r9 = r6.f2017q
            int r6 = r6.f2018r
            if (r9 > r6) goto Lba
        L73:
            java.lang.Object[] r10 = r7.f6676q
            r10 = r10[r6]
            w.g r10 = (w.C1783g) r10
            G.a r10 = r10.f17969a
            java.lang.Object r10 = r10.invoke()
            i0.c r10 = (i0.C1131c) r10
            if (r10 != 0) goto L84
            goto Lb5
        L84:
            i0.c r11 = r3.c(r10)
            boolean r12 = r11.equals(r3)
            if (r12 == 0) goto L93
            int r6 = r6 + r2
            r7.b(r6, r5)
            goto Lbd
        L93:
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto Lb5
            java.util.concurrent.CancellationException r10 = new java.util.concurrent.CancellationException
            java.lang.String r11 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r10.<init>(r11)
            int r11 = r7.f6678s
            int r11 = r11 - r2
            if (r11 > r6) goto Lb5
        La5:
            java.lang.Object[] r12 = r7.f6676q
            r12 = r12[r6]
            w.g r12 = (w.C1783g) r12
            M5.h r12 = r12.f17970b
            r12.g(r10)
            if (r11 == r6) goto Lb5
            int r11 = r11 + 1
            goto La5
        Lb5:
            if (r6 == r9) goto Lba
            int r6 = r6 + (-1)
            goto L73
        Lba:
            r7.b(r8, r5)
        Lbd:
            boolean r2 = r0.f18006N
            if (r2 != 0) goto Lc4
            r0.A0()
        Lc4:
            java.lang.Object r14 = r14.r()
            if (r14 != r4) goto Lcb
            goto Lcc
        Lcb:
            r14 = r1
        Lcc:
            if (r14 != r4) goto Lcf
            return r4
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
