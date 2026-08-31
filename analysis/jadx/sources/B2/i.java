package b2;

import O3.D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f9998a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9999b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static D f10000c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0696g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D b() {
        D d5 = new D(17);
        f10000c = d5;
        f9998a.set(d5);
        return f10000c;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            if (r20 != 0) goto L8
            O3.D r0 = b2.i.f10000c
            if (r0 == 0) goto L8
            goto L105
        L8:
            java.lang.Object r1 = b2.i.f9999b
            monitor-enter(r1)
            if (r20 != 0) goto L16
            O3.D r0 = b2.i.f10000c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto L106
        L16:
            r2 = 0
            r4 = 1
            r5 = 0
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
            java.lang.String r6 = "dexopt/baseline.prof"
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r6)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L33
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r0 = r4
            goto L2f
        L2e:
            r0 = r5
        L2f:
            r6.close()     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
            goto L41
        L33:
            r0 = move-exception
            r7 = r0
            if (r6 == 0) goto L3f
            r6.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
        L3f:
            throw r7     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
        L40:
            r0 = r5
        L41:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r7 = 28
            if (r6 < r7) goto L101
            r7 = 30
            if (r6 != r7) goto L4d
            goto L101
        L4d:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = "/data/misc/profiles/ref/"
            java.lang.String r9 = r19.getPackageName()     // Catch: java.lang.Throwable -> L13
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = "primary.prof"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L13
            long r7 = r6.length()     // Catch: java.lang.Throwable -> L13
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L6f
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 <= 0) goto L6f
            r6 = r4
            goto L70
        L6f:
            r6 = r5
        L70:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = "/data/misc/profiles/cur/0/"
            java.lang.String r12 = r19.getPackageName()     // Catch: java.lang.Throwable -> L13
            r10.<init>(r11, r12)     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = "primary.prof"
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L13
            long r17 = r9.length()     // Catch: java.lang.Throwable -> L13
            boolean r9 = r9.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto L92
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 <= 0) goto L92
            r2 = r4
            goto L93
        L92:
            r2 = r5
        L93:
            long r15 = a(r19)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Lfc
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = r19.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "profileInstalled"
            r3.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r3.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lb2
            b2.h r9 = b2.C0697h.a(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lad
            goto Lb3
        Lad:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L105
        Lb2:
            r9 = 0
        Lb3:
            r10 = 2
            if (r9 == 0) goto Lc3
            long r11 = r9.f9996c     // Catch: java.lang.Throwable -> L13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto Lc3
            int r11 = r9.f9995b     // Catch: java.lang.Throwable -> L13
            if (r11 != r10) goto Lc1
            goto Lc3
        Lc1:
            r5 = r11
            goto Lcf
        Lc3:
            if (r0 != 0) goto Lc8
            r5 = 327680(0x50000, float:4.59177E-40)
            goto Lcf
        Lc8:
            if (r6 == 0) goto Lcc
            r5 = r4
            goto Lcf
        Lcc:
            if (r2 == 0) goto Lcf
            r5 = r10
        Lcf:
            if (r20 == 0) goto Ld6
            if (r2 == 0) goto Ld6
            if (r5 == r4) goto Ld6
            r5 = r10
        Ld6:
            if (r9 == 0) goto Le5
            int r0 = r9.f9995b     // Catch: java.lang.Throwable -> L13
            if (r0 != r10) goto Le5
            if (r5 != r4) goto Le5
            long r10 = r9.f9997d     // Catch: java.lang.Throwable -> L13
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto Le5
            r5 = 3
        Le5:
            r14 = r5
            b2.h r12 = new b2.h     // Catch: java.lang.Throwable -> L13
            r13 = 1
            r12.<init>(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lf4
            boolean r0 = r9.equals(r12)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lf7
        Lf4:
            r12.b(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lf7
        Lf7:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L105
        Lfc:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L105
        L101:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        L105:
            return
        L106:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.i.c(android.content.Context, boolean):void");
    }
}
