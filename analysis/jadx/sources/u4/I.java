package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class I extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7743q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7743q = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new I(this.f7743q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        I i = (I) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        i.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            m5.AbstractC1362a.e(r7)
            R4.k1 r7 = r6.f7743q
            android.os.Bundle r0 = r7.f7096r
            com.web2native.MainActivity r1 = r7.f7069b
            r2 = 0
            if (r0 == 0) goto L28
            O3.e0 r0 = r7.f7053M
            boolean r0 = r0.b()
            if (r0 == 0) goto L28
            R4.i r0 = r7.f7073d
            if (r0 == 0) goto L21
            java.lang.Boolean r0 = r0.f6978C
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 != 0) goto L28
            U4.AbstractC0534a.y(r7)
            goto L39
        L28:
            O3.e0 r0 = r7.f7053M
            boolean r0 = r0.b()
            if (r0 == 0) goto L39
            boolean r0 = r7.f7078g
            if (r0 == 0) goto L39
            U4.AbstractC0534a.y(r7)
            r7.f7078g = r2
        L39:
            R4.i r0 = r7.f7073d
            if (r0 == 0) goto L46
            java.lang.Boolean r0 = r0.f6980E
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            goto L47
        L46:
            r0 = r2
        L47:
            java.lang.String r3 = "#ffffff"
            java.lang.String r4 = "#000000"
            if (r0 != 0) goto L59
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L59
            r0 = 8
            com.google.android.gms.internal.measurement.P1.Y(r4, r3, r1, r0)
            goto L5f
        L59:
            com.web2native.MainActivity r0 = r7.f7067a
            r5 = 1
            com.google.android.gms.internal.measurement.P1.Z(r0, r3, r4, r5)
        L5f:
            j5.c r0 = r7.f7097s
            if (r0 == 0) goto L76
            androidx.lifecycle.J r0 = r0.f13864g
            if (r0 == 0) goto L76
            U4.o r3 = new U4.o
            r4 = 3
            r3.<init>(r7, r4)
            R4.J0 r4 = new R4.J0
            r5 = 3
            r4.<init>(r3, r5)
            r0.e(r1, r4)
        L76:
            R4.O r0 = new R4.O
            r0.<init>(r7)
            R4.V r0 = new R4.V
            r0.<init>()
            r7.f7044D = r0
            R4.i r0 = r7.f7073d
            if (r0 == 0) goto L93
            R4.I1 r1 = r0.f6997V
            if (r1 == 0) goto L93
            java.lang.Boolean r1 = r1.f6774a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            goto L94
        L93:
            r1 = r2
        L94:
            if (r1 == 0) goto L9b
            g5.h r1 = r7.f7059S
            r1.getClass()
        L9b:
            B0.o r1 = new B0.o
            r3 = 25
            r1.<init>(r7, r3)
            r7.f7049I = r1
            if (r0 == 0) goto Lb3
            R4.c1 r1 = r0.f7017w
            if (r1 == 0) goto Lb3
            java.lang.Boolean r1 = r1.f6927a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            goto Lb4
        Lb3:
            r1 = r2
        Lb4:
            if (r1 == 0) goto Lce
            if (r0 == 0) goto Lbf
            R4.c1 r1 = r0.f7017w
            if (r1 == 0) goto Lbf
            java.lang.Boolean r1 = r1.f6927a
            goto Lc0
        Lbf:
            r1 = 0
        Lc0:
            if (r1 == 0) goto Lce
            R4.V r1 = new R4.V     // Catch: java.lang.Exception -> Lca
            r1.<init>()     // Catch: java.lang.Exception -> Lca
            r7.f7058R = r1     // Catch: java.lang.Exception -> Lca
            goto Lce
        Lca:
            r1 = move-exception
            r1.printStackTrace()
        Lce:
            if (r0 == 0) goto Ldd
            R4.u r1 = r0.f6976A
            if (r1 == 0) goto Ldd
            java.lang.Boolean r1 = r1.f7193a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            goto Lde
        Ldd:
            r1 = r2
        Lde:
            if (r1 == 0) goto Le7
            R4.V r1 = new R4.V
            r1.<init>()
            r7.f7082i0 = r1
        Le7:
            if (r0 == 0) goto Lf5
            R4.G r1 = r0.f7007m
            if (r1 == 0) goto Lf5
            java.lang.Boolean r1 = r1.f6758a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.m.a(r1, r2)
        Lf5:
            if (r2 != 0) goto L108
            R4.V r7 = r7.f7044D
            if (r7 != 0) goto L108
            if (r0 == 0) goto L108
            R4.n r7 = r0.f6986K
            if (r7 == 0) goto L108
            java.lang.Boolean r7 = r7.f7132a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            kotlin.jvm.internal.m.a(r7, r0)
        L108:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
