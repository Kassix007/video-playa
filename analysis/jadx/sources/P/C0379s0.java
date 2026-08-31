package P;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0379s0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public R4.L0 f5503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0385v0 f5506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0383u0 f5507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ T f5508v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379s0(C0385v0 c0385v0, C0383u0 c0383u0, T t6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f5506t = c0385v0;
        this.f5507u = c0383u0;
        this.f5508v = t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0379s0 c0379s0 = new C0379s0(this.f5506t, this.f5507u, this.f5508v, interfaceC1524c);
        c0379s0.f5505s = obj;
        return c0379s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0379s0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            r5.a r0 = r5.EnumC1580a.f16356q
            int r1 = r13.f5504r
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 != r3) goto L18
            R4.L0 r0 = r13.f5503q
            java.lang.Object r1 = r13.f5505s
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            m5.AbstractC1362a.e(r14)     // Catch: java.lang.Throwable -> L15
            goto L115
        L15:
            r14 = move-exception
            goto L13b
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L20:
            m5.AbstractC1362a.e(r14)
            java.lang.Object r14 = r13.f5505s
            M5.w r14 = (M5.InterfaceC0261w) r14
            q5.h r14 = r14.d()
            M5.b0 r1 = M5.AbstractC0263y.n(r14)
            P.v0 r14 = r13.f5506t
            java.lang.Object r4 = r14.f5555b
            monitor-enter(r4)
            java.lang.Throwable r5 = r14.f5557d     // Catch: java.lang.Throwable -> L15f
            if (r5 != 0) goto L171
            P5.S r5 = r14.f5570t     // Catch: java.lang.Throwable -> L15f
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L15f
            P.p0 r5 = (P.EnumC0374p0) r5     // Catch: java.lang.Throwable -> L15f
            P.p0 r6 = P.EnumC0374p0.f5491r     // Catch: java.lang.Throwable -> L15f
            int r5 = r5.compareTo(r6)     // Catch: java.lang.Throwable -> L15f
            if (r5 <= 0) goto L169
            M5.b0 r5 = r14.f5556c     // Catch: java.lang.Throwable -> L15f
            if (r5 != 0) goto L161
            r14.f5556c = r1     // Catch: java.lang.Throwable -> L15f
            r14.u()     // Catch: java.lang.Throwable -> L15f
            monitor-exit(r4)
            A.e0 r14 = new A.e0
            P.v0 r4 = r13.f5506t
            r5 = 9
            r14.<init>(r5, r4)
            B0.G0 r4 = a0.n.f8679a
            a0.a r4 = a0.C0599a.f8645s
            a0.n.f(r4)
            java.lang.Object r4 = a0.n.f8680b
            monitor-enter(r4)
            java.lang.Object r6 = a0.n.f8684g     // Catch: java.lang.Throwable -> L15c
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L15c
            java.util.ArrayList r6 = n5.l.v0(r6, r14)     // Catch: java.lang.Throwable -> L15c
            a0.n.f8684g = r6     // Catch: java.lang.Throwable -> L15c
            monitor-exit(r4)
            R4.L0 r4 = new R4.L0
            r4.<init>(r5, r14)
            P5.S r14 = P.C0385v0.f5552x
            P.v0 r14 = r13.f5506t
            P.S r14 = r14.f5573w
        L7b:
            P5.S r5 = P.C0385v0.f5552x
            java.lang.Object r6 = r5.getValue()
            S.b r6 = (S.b) r6
            r7 = r6
            V.b r7 = (V.b) r7
            W.b r8 = W.b.f8006a
            U.c r9 = r7.f7917s
            boolean r10 = r9.containsKey(r14)
            if (r10 == 0) goto L91
            goto Lce
        L91:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto La7
            V.a r7 = new V.a
            r7.<init>(r8, r8)
            U.c r7 = r9.a(r14, r7)
            V.b r8 = new V.b
            r8.<init>(r14, r14, r7)
            r7 = r8
            goto Lce
        La7:
            java.lang.Object r10 = r7.f7916r
            java.lang.Object r11 = r9.get(r10)
            kotlin.jvm.internal.m.b(r11)
            V.a r11 = (V.a) r11
            V.a r12 = new V.a
            java.lang.Object r11 = r11.f7912a
            r12.<init>(r11, r14)
            U.c r9 = r9.a(r10, r12)
            V.a r11 = new V.a
            r11.<init>(r10, r8)
            U.c r8 = r9.a(r14, r11)
            V.b r9 = new V.b
            java.lang.Object r7 = r7.f7915q
            r9.<init>(r7, r14, r8)
            r7 = r9
        Lce:
            if (r6 == r7) goto Ldb
            E4.f r8 = Q5.AbstractC0423c.f6604b
            if (r6 != 0) goto Ld5
            r6 = r8
        Ld5:
            boolean r5 = r5.h(r6, r7)
            if (r5 == 0) goto L7b
        Ldb:
            P.v0 r14 = r13.f5506t     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r5 = r14.f5555b     // Catch: java.lang.Throwable -> Lfb
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lfb
            java.util.List r14 = r14.x()     // Catch: java.lang.Throwable -> L138
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lfb
            r5 = r14
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> Lfb
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lfb
            r6 = 0
        Led:
            if (r6 >= r5) goto Lfe
            java.lang.Object r7 = r14.get(r6)     // Catch: java.lang.Throwable -> Lfb
            P.u r7 = (P.C0382u) r7     // Catch: java.lang.Throwable -> Lfb
            r7.r()     // Catch: java.lang.Throwable -> Lfb
            int r6 = r6 + 1
            goto Led
        Lfb:
            r14 = move-exception
            r0 = r4
            goto L13b
        Lfe:
            P.r0 r14 = new P.r0     // Catch: java.lang.Throwable -> Lfb
            P.u0 r5 = r13.f5507u     // Catch: java.lang.Throwable -> Lfb
            P.T r6 = r13.f5508v     // Catch: java.lang.Throwable -> Lfb
            r14.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> Lfb
            r13.f5505s = r1     // Catch: java.lang.Throwable -> Lfb
            r13.f5503q = r4     // Catch: java.lang.Throwable -> Lfb
            r13.f5504r = r3     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r14 = M5.AbstractC0263y.g(r14, r13)     // Catch: java.lang.Throwable -> Lfb
            if (r14 != r0) goto L114
            return r0
        L114:
            r0 = r4
        L115:
            r0.e()
            P.v0 r14 = r13.f5506t
            java.lang.Object r0 = r14.f5555b
            monitor-enter(r0)
            M5.b0 r3 = r14.f5556c     // Catch: java.lang.Throwable -> L124
            if (r3 != r1) goto L126
            r14.f5556c = r2     // Catch: java.lang.Throwable -> L124
            goto L126
        L124:
            r14 = move-exception
            goto L136
        L126:
            r14.u()     // Catch: java.lang.Throwable -> L124
            monitor-exit(r0)
            P5.S r14 = P.C0385v0.f5552x
            P.v0 r14 = r13.f5506t
            P.S r14 = r14.f5573w
            P.S.b(r14)
            m5.y r14 = m5.C1386y.f15098a
            return r14
        L136:
            monitor-exit(r0)
            throw r14
        L138:
            r14 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lfb
            throw r14     // Catch: java.lang.Throwable -> Lfb
        L13b:
            r0.e()
            P.v0 r0 = r13.f5506t
            java.lang.Object r3 = r0.f5555b
            monitor-enter(r3)
            M5.b0 r4 = r0.f5556c     // Catch: java.lang.Throwable -> L14a
            if (r4 != r1) goto L14c
            r0.f5556c = r2     // Catch: java.lang.Throwable -> L14a
            goto L14c
        L14a:
            r14 = move-exception
            goto L15a
        L14c:
            r0.u()     // Catch: java.lang.Throwable -> L14a
            monitor-exit(r3)
            P5.S r0 = P.C0385v0.f5552x
            P.v0 r0 = r13.f5506t
            P.S r0 = r0.f5573w
            P.S.b(r0)
            throw r14
        L15a:
            monitor-exit(r3)
            throw r14
        L15c:
            r14 = move-exception
            monitor-exit(r4)
            throw r14
        L15f:
            r14 = move-exception
            goto L172
        L161:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15f
            java.lang.String r0 = "Recomposer already running"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L15f
            throw r14     // Catch: java.lang.Throwable -> L15f
        L169:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15f
            java.lang.String r0 = "Recomposer shut down"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L15f
            throw r14     // Catch: java.lang.Throwable -> L15f
        L171:
            throw r5     // Catch: java.lang.Throwable -> L15f
        L172:
            monitor-exit(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0379s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
