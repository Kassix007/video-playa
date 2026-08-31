package O3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f4561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4562r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public R0(C0271b1 c0271b1, boolean z5) {
        this.f4561q = z5;
        Objects.requireNonNull(c0271b1);
        this.f4562r = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            O3.b1 r0 = r9.f4562r
            java.lang.Object r1 = r0.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            boolean r2 = r1.a()
            java.lang.Boolean r3 = r1.f5066O
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1a
            java.lang.Boolean r3 = r1.f5066O
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1a
            r3 = r5
            goto L1b
        L1a:
            r3 = r4
        L1b:
            boolean r6 = r9.f4561q
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r1.f5066O = r7
            if (r3 != r6) goto L35
            O3.X r3 = r1.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4666E
            java.lang.String r7 = "Default data collection state already set to"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r3.c(r8, r7)
        L35:
            boolean r3 = r1.a()
            if (r3 == r2) goto L4e
            boolean r3 = r1.a()
            java.lang.Boolean r7 = r1.f5066O
            if (r7 == 0) goto L4c
            java.lang.Boolean r7 = r1.f5066O
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4c
            r4 = r5
        L4c:
            if (r3 == r4) goto L62
        L4e:
            O3.X r1 = r1.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4663B
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.d(r3, r2, r4)
        L62:
            r0.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.R0.run():void");
    }
}
