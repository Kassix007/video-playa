package O3;

import android.content.BroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0323t0 f4768a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b2(C0323t0 c0323t0) {
        this.f4768a = c0323t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            O3.t0 r4 = r3.f4768a
            if (r5 != 0) goto L11
            O3.X r4 = r4.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4673z
            java.lang.String r5 = "App receiver called with null intent"
            r4.b(r5)
            return
        L11:
            java.lang.String r5 = r5.getAction()
            if (r5 != 0) goto L24
            O3.X r4 = r4.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4673z
            java.lang.String r5 = "App receiver called with null action"
            r4.b(r5)
            return
        L24:
            int r0 = r5.hashCode()
            r1 = -1928239649(0xffffffff8d1165df, float:-4.4804198E-31)
            r2 = 1
            if (r0 == r1) goto L3e
            r1 = 1279883384(0x4c497878, float:5.2814304E7)
            if (r0 == r1) goto L34
            goto L48
        L34:
            java.lang.String r0 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L48
            r5 = r2
            goto L49
        L3e:
            java.lang.String r0 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L48
            r5 = 0
            goto L49
        L48:
            r5 = -1
        L49:
            if (r5 == 0) goto L76
            if (r5 == r2) goto L5a
            O3.X r4 = r4.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4673z
            java.lang.String r5 = "App receiver called with unknown action"
            r4.b(r5)
            return
        L5a:
            O3.X r5 = r4.f5077v
            O3.C0323t0.l(r5)
            O3.V r5 = r5.f4666E
            java.lang.String r0 = "[sgtm] App Receiver notified batches are available"
            r5.b(r0)
            O3.p0 r4 = r4.f5078w
            O3.C0323t0.l(r4)
            A1.b r5 = new A1.b
            r0 = 11
            r5.<init>(r0, r3)
            r4.x(r5)
            return
        L76:
            com.google.android.gms.internal.measurement.Y3.a()
            O3.g r5 = r4.f5075t
            r0 = 0
            O3.E r1 = O3.F.f4394Q0
            boolean r5 = r5.y(r0, r1)
            if (r5 != 0) goto L85
            return
        L85:
            O3.X r5 = r4.f5077v
            O3.C0323t0.l(r5)
            O3.V r5 = r5.f4666E
            java.lang.String r0 = "App receiver notified triggers are available"
            r5.b(r0)
            O3.p0 r5 = r4.f5078w
            O3.C0323t0.l(r5)
            A1.b r0 = new A1.b
            r1 = 12
            r0.<init>(r1, r4)
            r5.x(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.b2.onReceive(android.content.Context, android.content.Intent):void");
    }
}
