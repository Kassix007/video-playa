package b2;

import android.content.Context;

/* JADX INFO: renamed from: b2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0695f implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f9993r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0695f(Context context, int i) {
        this.f9992q = i;
        this.f9993r = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f9992q
            switch(r0) {
                case 0: goto L99;
                case 1: goto L8a;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L87
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f9993r
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L87
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L5e
            r.f r0 = h.l.f13307w
            r0.getClass()
            r.a r2 = new r.a
            r2.<init>(r0)
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            h.l r0 = (h.l) r0
            if (r0 == 0) goto L2d
            h.y r0 = (h.y) r0
            android.content.Context r0 = r0.f13342A
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L63
            android.os.LocaleList r0 = h.k.a(r0)
            r1.e r2 = new r1.e
            r1.f r6 = new r1.f
            r6.<init>(r0)
            r2.<init>(r6)
            goto L65
        L5e:
            r1.e r2 = h.l.f13303s
            if (r2 == 0) goto L63
            goto L65
        L63:
            r1.e r2 = r1.e.f16275b
        L65:
            r1.f r0 = r2.f16276a
            android.os.LocaleList r0 = r0.f16277a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L80
            java.lang.String r0 = k1.AbstractC1175c.g(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto L80
            android.os.LocaleList r0 = h.j.a(r0)
            h.k.b(r2, r0)
        L80:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L87:
            h.l.f13306v = r1
            return
        L8a:
            a2.c r0 = new a2.c
            r1 = 0
            r0.<init>(r1)
            O3.B r1 = b2.AbstractC0693d.f9984a
            r2 = 0
            android.content.Context r3 = r11.f9993r
            b2.AbstractC0693d.t(r3, r0, r1, r2)
            return
        L99:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            b2.f r0 = new b2.f
            r1 = 1
            android.content.Context r2 = r11.f9993r
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.RunnableC0695f.run():void");
    }
}
