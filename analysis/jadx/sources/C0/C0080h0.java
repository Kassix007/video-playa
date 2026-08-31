package C0;

import android.view.Choreographer;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: C0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0080h0 implements P.T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f1042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1043s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0080h0(Choreographer choreographer, C0076f0 c0076f0) {
        this.f1041q = 0;
        this.f1042r = choreographer;
        this.f1043s = c0076f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // P.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(B5.c r7, s5.c r8) {
        /*
            r6 = this;
            int r0 = r6.f1041q
            switch(r0) {
                case 0: goto L9e;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof P.C0356g0
            if (r0 == 0) goto L18
            r0 = r8
            P.g0 r0 = (P.C0356g0) r0
            int r1 = r0.f5409u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f5409u = r1
            goto L1d
        L18:
            P.g0 r0 = new P.g0
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f5407s
            r5.a r1 = r5.EnumC1580a.f16356q
            int r2 = r0.f5409u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            m5.AbstractC1362a.e(r8)
            goto L97
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            B5.c r7 = r0.f5406r
            C0.h0 r2 = r0.f5405q
            m5.AbstractC1362a.e(r8)
            goto L85
        L3f:
            m5.AbstractC1362a.e(r8)
            java.lang.Object r8 = r6.f1043s
            K2.a r8 = (K2.a) r8
            r0.f5405q = r6
            r0.f5406r = r7
            r0.f5409u = r4
            java.lang.Object r2 = r8.f2860c
            monitor-enter(r2)
            boolean r5 = r8.f2859b     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r2)
            if (r5 == 0) goto L57
            m5.y r8 = m5.C1386y.f15098a
            goto L81
        L57:
            M5.h r2 = new M5.h
            q5.c r5 = n5.AbstractC1397A.v(r0)
            r2.<init>(r4, r5)
            r2.s()
            java.lang.Object r4 = r8.f2860c
            monitor-enter(r4)
            java.io.Serializable r5 = r8.f2861d     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L98
            r5.add(r2)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r4)
            A.Y r4 = new A.Y
            r5 = 17
            r4.<init>(r5, r8, r2)
            r2.u(r4)
            java.lang.Object r8 = r2.r()
            if (r8 != r1) goto L7f
            goto L81
        L7f:
            m5.y r8 = m5.C1386y.f15098a
        L81:
            if (r8 != r1) goto L84
            goto L96
        L84:
            r2 = r6
        L85:
            java.lang.Object r8 = r2.f1042r
            P.T r8 = (P.T) r8
            r2 = 0
            r0.f5405q = r2
            r0.f5406r = r2
            r0.f5409u = r3
            java.lang.Object r8 = r8.e(r7, r0)
            if (r8 != r1) goto L97
        L96:
            r8 = r1
        L97:
            return r8
        L98:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L9b:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L9e:
            java.lang.Object r0 = r6.f1043s
            C0.f0 r0 = (C0.C0076f0) r0
            M5.h r1 = new M5.h
            q5.c r8 = n5.AbstractC1397A.v(r8)
            r2 = 1
            r1.<init>(r2, r8)
            r1.s()
            C0.g0 r8 = new C0.g0
            r8.<init>(r1, r6, r7)
            android.view.Choreographer r7 = r0.f1028q
            java.lang.Object r3 = r6.f1042r
            android.view.Choreographer r3 = (android.view.Choreographer) r3
            boolean r7 = kotlin.jvm.internal.m.a(r7, r3)
            if (r7 == 0) goto Le5
            java.lang.Object r7 = r0.f1030s
            monitor-enter(r7)
            java.util.ArrayList r3 = r0.f1032u     // Catch: java.lang.Throwable -> Ld6
            r3.add(r8)     // Catch: java.lang.Throwable -> Ld6
            boolean r3 = r0.f1035x     // Catch: java.lang.Throwable -> Ld6
            if (r3 != 0) goto Ld8
            r0.f1035x = r2     // Catch: java.lang.Throwable -> Ld6
            android.view.Choreographer r2 = r0.f1028q     // Catch: java.lang.Throwable -> Ld6
            C0.e0 r3 = r0.f1036y     // Catch: java.lang.Throwable -> Ld6
            r2.postFrameCallback(r3)     // Catch: java.lang.Throwable -> Ld6
            goto Ld8
        Ld6:
            r8 = move-exception
            goto Le3
        Ld8:
            monitor-exit(r7)
            A.Y r7 = new A.Y
            r2 = 3
            r7.<init>(r2, r0, r8)
            r1.u(r7)
            goto Lf5
        Le3:
            monitor-exit(r7)
            throw r8
        Le5:
            java.lang.Object r7 = r6.f1042r
            android.view.Choreographer r7 = (android.view.Choreographer) r7
            r7.postFrameCallback(r8)
            A.Y r7 = new A.Y
            r0 = 4
            r7.<init>(r0, r6, r8)
            r1.u(r7)
        Lf5:
            java.lang.Object r7 = r1.r()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0080h0.e(B5.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        switch (this.f1041q) {
        }
        return eVar.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g interfaceC1528g) {
        switch (this.f1041q) {
        }
        return E3.h.A(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g interfaceC1528g) {
        switch (this.f1041q) {
        }
        return E3.h.I(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h interfaceC1529h) {
        switch (this.f1041q) {
        }
        return E3.h.L(this, interfaceC1529h);
    }

    public C0080h0(P.T t6) {
        this.f1041q = 1;
        this.f1042r = t6;
        this.f1043s = new K2.a();
    }
}
