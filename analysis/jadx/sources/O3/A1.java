package O3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class A1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f4308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E1 f4309s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A1(E1 e12, long j, int i) {
        this.f4307q = i;
        switch (i) {
            case 1:
                this.f4308r = j;
                Objects.requireNonNull(e12);
                this.f4309s = e12;
                break;
            default:
                this.f4308r = j;
                Objects.requireNonNull(e12);
                this.f4309s = e12;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f4307q
            switch(r0) {
                case 0: goto L56;
                default: goto L5;
            }
        L5:
            O3.E1 r0 = r10.f4309s
            r0.o()
            r0.s()
            java.lang.Object r1 = r0.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.X r2 = r1.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4666E
            java.lang.String r3 = "Activity paused, time"
            long r8 = r10.f4308r
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r2.c(r4, r3)
            B0.o r5 = r0.f4361x
            O3.B1 r4 = new O3.B1
            java.lang.Object r2 = r5.f500r
            O3.E1 r2 = (O3.E1) r2
            java.lang.Object r3 = r2.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            B3.a r3 = r3.f5052A
            r3.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            r4.<init>(r5, r6, r8)
            r5.f499q = r4
            I3.e r2 = r2.f4357t
            r5 = 2000(0x7d0, double:9.88E-321)
            r2.postDelayed(r4, r5)
            O3.g r1 = r1.f5075t
            boolean r1 = r1.C()
            if (r1 == 0) goto L55
            O3.D1 r0 = r0.f4360w
            java.lang.Object r0 = r0.f4349c
            O3.C1 r0 = (O3.C1) r0
            r0.c()
        L55:
            return
        L56:
            O3.E1 r0 = r10.f4309s
            O3.D1 r1 = r0.f4360w
            r0.o()
            r0.s()
            java.lang.Object r2 = r0.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.X r3 = r2.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4666E
            java.lang.String r4 = "Activity resumed, time"
            long r5 = r10.f4308r
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r3.c(r7, r4)
            O3.g r3 = r2.f5075t
            O3.E r4 = O3.F.f4401U0
            r7 = 0
            boolean r4 = r3.y(r7, r4)
            if (r4 == 0) goto L9e
            boolean r2 = r3.C()
            if (r2 != 0) goto L8b
            boolean r2 = r0.f4358u
            if (r2 == 0) goto Lc3
        L8b:
            java.lang.Object r2 = r1.f4350d
            O3.E1 r2 = (O3.E1) r2
            r2.o()
            java.lang.Object r2 = r1.f4349c
            O3.C1 r2 = (O3.C1) r2
            r2.c()
            r1.f4347a = r5
            r1.f4348b = r5
            goto Lc3
        L9e:
            boolean r3 = r3.C()
            if (r3 != 0) goto Lb1
            O3.h0 r2 = r2.f5076u
            O3.C0323t0.j(r2)
            O3.e0 r2 = r2.f4886J
            boolean r2 = r2.d()
            if (r2 == 0) goto Lc3
        Lb1:
            java.lang.Object r2 = r1.f4350d
            O3.E1 r2 = (O3.E1) r2
            r2.o()
            java.lang.Object r2 = r1.f4349c
            O3.C1 r2 = (O3.C1) r2
            r2.c()
            r1.f4347a = r5
            r1.f4348b = r5
        Lc3:
            B0.o r1 = r0.f4361x
            java.lang.Object r2 = r1.f500r
            O3.E1 r2 = (O3.E1) r2
            r2.o()
            java.lang.Object r3 = r2.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            java.lang.Object r1 = r1.f499q
            O3.B1 r1 = (O3.B1) r1
            if (r1 == 0) goto Ldb
            I3.e r4 = r2.f4357t
            r4.removeCallbacks(r1)
        Ldb:
            O3.h0 r1 = r3.f5076u
            O3.b1 r4 = r3.f5054C
            O3.C0323t0.j(r1)
            O3.e0 r1 = r1.f4886J
            r5 = 0
            r1.e(r5)
            r2.o()
            r2.f4358u = r5
            O3.g r1 = r3.f5075t
            O3.E r2 = O3.F.T0
            boolean r1 = r1.y(r7, r2)
            if (r1 == 0) goto L110
            O3.C0323t0.k(r4)
            boolean r1 = r4.f4751E
            if (r1 == 0) goto L110
            O3.X r1 = r3.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4666E
            java.lang.String r2 = "Retrying trigger URI registration in foreground"
            r1.b(r2)
            O3.C0323t0.k(r4)
            r4.M()
        L110:
            k3.c r0 = r0.f4359v
            java.lang.Object r1 = r0.f14120q
            O3.E1 r1 = (O3.E1) r1
            r1.o()
            java.lang.Object r1 = r1.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L124
            goto L130
        L124:
            B3.a r1 = r1.f5052A
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r0.u(r1)
        L130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.A1.run():void");
    }
}
