package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f10344c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f10346b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(Context context) {
        this.f10345a = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i a(Context context) {
        AbstractC1887A.g(context);
        synchronized (i.class) {
            if (f10344c == null) {
                m mVar = q.f10360a;
                synchronized (q.class) {
                    if (q.f10364e == null) {
                        q.f10364e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f10344c = new i(context);
            }
        }
        return f10344c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final n c(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < nVarArr.length; i++) {
                if (nVarArr[i].equals(oVar)) {
                    return nVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(PackageInfo packageInfo, boolean z5) {
        PackageInfo packageInfo2;
        if (!z5) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z5 ? c(packageInfo2, p.f10359a) : c(packageInfo2, p.f10359a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = r1.f10345a
            android.content.Context r0 = (android.content.Context) r0
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = r18
            java.lang.String[] r2 = r0.getPackagesForUid(r2)
            r3 = 3
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L1e4
            int r6 = r2.length
            if (r6 != 0) goto L1a
            goto L1e4
        L1a:
            r0 = r4
            r7 = r5
        L1c:
            if (r7 >= r6) goto L1e0
            r8 = r2[r7]
            java.lang.String r9 = "Failed to get Google certificates from remote"
            java.lang.String r10 = "GoogleCertificates"
            java.lang.String r11 = "null pkg"
            if (r8 != 0) goto L2f
            com.google.android.gms.common.t r0 = new com.google.android.gms.common.t
            r0.<init>(r5, r11, r4)
            goto L1d5
        L2f:
            java.lang.Object r0 = r1.f10346b
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1d3
            com.google.android.gms.common.m r0 = com.google.android.gms.common.q.f10360a
            android.os.StrictMode$ThreadPolicy r12 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.q.b()     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4e E3.b -> L50
            x3.z r0 = com.google.android.gms.common.q.f10362c     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4e E3.b -> L50
            x3.x r0 = (x3.x) r0     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4e E3.b -> L50
            boolean r0 = r0.N()     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4e E3.b -> L50
            goto L55
        L4b:
            r0 = move-exception
            goto L1cf
        L4e:
            r0 = move-exception
            goto L51
        L50:
            r0 = move-exception
        L51:
            android.util.Log.e(r10, r9, r0)     // Catch: java.lang.Throwable -> L4b
            r0 = r5
        L55:
            android.os.StrictMode.setThreadPolicy(r12)
            r12 = 2
            r13 = 1
            if (r0 == 0) goto L139
            java.lang.Object r0 = r1.f10345a
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.google.android.gms.common.h.honorsDebugCertificates(r0)
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r14 = com.google.android.gms.common.q.f10364e     // Catch: java.lang.Throwable -> Lef
            x3.AbstractC1887A.g(r14)     // Catch: java.lang.Throwable -> Lef
            com.google.android.gms.common.q.b()     // Catch: java.lang.Throwable -> Lef E3.b -> L117
            android.content.Context r14 = com.google.android.gms.common.q.f10364e     // Catch: java.lang.Throwable -> Lef
            D3.b r15 = new D3.b     // Catch: java.lang.Throwable -> Lef
            r15.<init>(r14)     // Catch: java.lang.Throwable -> Lef
            D3.a r14 = D3.b.J(r15)     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r14 = D3.b.K(r14)     // Catch: java.lang.Throwable -> Lef
            android.content.Context r14 = (android.content.Context) r14     // Catch: java.lang.Throwable -> Lef
            x3.z r15 = com.google.android.gms.common.q.f10362c     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            x3.x r15 = (x3.x) r15     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            android.os.Parcel r4 = r15.K()     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            int r16 = J3.a.f2805a     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r4.writeInt(r13)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.Y(r4, r5)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            com.google.android.gms.internal.measurement.AbstractC0836n2.V(r4, r13, r8)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r13 = 4
            com.google.android.gms.internal.measurement.AbstractC0836n2.b0(r4, r12, r13)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r4.writeInt(r0)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            com.google.android.gms.internal.measurement.AbstractC0836n2.b0(r4, r3, r13)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r12 = 0
            r4.writeInt(r12)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            D3.b r0 = new D3.b     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r0.<init>(r14)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            com.google.android.gms.internal.measurement.AbstractC0836n2.S(r4, r13, r0)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r0 = 5
            com.google.android.gms.internal.measurement.AbstractC0836n2.b0(r4, r0, r13)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r4.writeInt(r12)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r0 = 6
            com.google.android.gms.internal.measurement.AbstractC0836n2.b0(r4, r0, r13)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r12 = 1
            r4.writeInt(r12)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            com.google.android.gms.internal.measurement.AbstractC0836n2.a0(r4, r5)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            android.os.Parcel r0 = r15.I(r4, r0)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            android.os.Parcelable$Creator<com.google.android.gms.common.r> r4 = com.google.android.gms.common.r.CREATOR     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            android.os.Parcelable r4 = J3.a.a(r0, r4)     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            com.google.android.gms.common.r r4 = (com.google.android.gms.common.r) r4     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            r0.recycle()     // Catch: java.lang.Throwable -> Lef android.os.RemoteException -> L109
            boolean r0 = r4.f10365q     // Catch: java.lang.Throwable -> Lef
            if (r0 == 0) goto Ldf
            int r0 = r4.f10368t     // Catch: java.lang.Throwable -> Lef
            D5.a.P(r0)     // Catch: java.lang.Throwable -> Lef
            com.google.android.gms.common.t r0 = new com.google.android.gms.common.t     // Catch: java.lang.Throwable -> Lef
            r4 = 0
            r12 = 1
            r0.<init>(r12, r4, r4)     // Catch: java.lang.Throwable -> Lef
            goto L130
        Ldf:
            java.lang.String r0 = r4.f10366r     // Catch: java.lang.Throwable -> Lef
            int r5 = r4.f10367s     // Catch: java.lang.Throwable -> Lef
            int r5 = E3.h.Q(r5)     // Catch: java.lang.Throwable -> Lef
            if (r5 != r13) goto Lf1
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Lef
            r5.<init>()     // Catch: java.lang.Throwable -> Lef
            goto Lf2
        Lef:
            r0 = move-exception
            goto L135
        Lf1:
            r5 = 0
        Lf2:
            java.lang.String r9 = "error checking package certificate"
            if (r0 != 0) goto Lf7
            r0 = r9
        Lf7:
            int r9 = r4.f10368t     // Catch: java.lang.Throwable -> Lef
            D5.a.P(r9)     // Catch: java.lang.Throwable -> Lef
            int r4 = r4.f10367s     // Catch: java.lang.Throwable -> Lef
            E3.h.Q(r4)     // Catch: java.lang.Throwable -> Lef
            com.google.android.gms.common.t r4 = new com.google.android.gms.common.t     // Catch: java.lang.Throwable -> Lef
            r12 = 0
            r4.<init>(r12, r0, r5)     // Catch: java.lang.Throwable -> Lef
            r0 = r4
            goto L130
        L109:
            r0 = move-exception
            android.util.Log.e(r10, r9, r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r4 = "module call"
            com.google.android.gms.common.t r5 = new com.google.android.gms.common.t     // Catch: java.lang.Throwable -> Lef
            r12 = 0
            r5.<init>(r12, r4, r0)     // Catch: java.lang.Throwable -> Lef
        L115:
            r0 = r5
            goto L130
        L117:
            r0 = move-exception
            android.util.Log.e(r10, r9, r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r5 = "module init: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> Lef
            com.google.android.gms.common.t r5 = new com.google.android.gms.common.t     // Catch: java.lang.Throwable -> Lef
            r12 = 0
            r5.<init>(r12, r4, r0)     // Catch: java.lang.Throwable -> Lef
            goto L115
        L130:
            android.os.StrictMode.setThreadPolicy(r11)
            goto L1b9
        L135:
            android.os.StrictMode.setThreadPolicy(r11)
            throw r0
        L139:
            java.lang.Object r0 = r1.f10345a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c0
            android.content.Context r0 = (android.content.Context) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c0
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c0
            r4 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c0
            java.lang.Object r4 = r1.f10345a
            android.content.Context r4 = (android.content.Context) r4
            boolean r4 = com.google.android.gms.common.h.honorsDebugCertificates(r4)
            if (r0 != 0) goto L159
            com.google.android.gms.common.t r0 = new com.google.android.gms.common.t
            r4 = 0
            r5 = 0
            r0.<init>(r5, r11, r4)
            goto L1b9
        L159:
            r5 = 0
            android.content.pm.Signature[] r9 = r0.signatures
            if (r9 == 0) goto L1b0
            int r9 = r9.length
            r10 = 1
            if (r9 == r10) goto L163
            goto L1b0
        L163:
            com.google.android.gms.common.o r9 = new com.google.android.gms.common.o
            android.content.pm.Signature[] r10 = r0.signatures
            r10 = r10[r5]
            byte[] r10 = r10.toByteArray()
            r9.<init>(r10)
            java.lang.String r10 = r0.packageName
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.t r4 = com.google.android.gms.common.q.a(r10, r9, r4, r5)     // Catch: java.lang.Throwable -> L1ab
            android.os.StrictMode.setThreadPolicy(r11)
            boolean r5 = r4.f10371a
            if (r5 == 0) goto L1a9
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L1a9
            int r0 = r0.flags
            r0 = r0 & r12
            if (r0 == 0) goto L1a9
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            r11 = 0
            r12 = 1
            com.google.android.gms.common.t r0 = com.google.android.gms.common.q.a(r10, r9, r11, r12)     // Catch: java.lang.Throwable -> L1a4
            android.os.StrictMode.setThreadPolicy(r5)
            boolean r0 = r0.f10371a
            if (r0 == 0) goto L1a9
            com.google.android.gms.common.t r0 = new com.google.android.gms.common.t
            java.lang.String r4 = "debuggable release cert app rejected"
            r5 = 0
            r0.<init>(r11, r4, r5)
            goto L1b9
        L1a4:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r5)
            throw r0
        L1a9:
            r0 = r4
            goto L1b9
        L1ab:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r11)
            throw r0
        L1b0:
            com.google.android.gms.common.t r0 = new com.google.android.gms.common.t
            java.lang.String r4 = "single cert required"
            r5 = 0
            r12 = 0
            r0.<init>(r12, r4, r5)
        L1b9:
            boolean r4 = r0.f10371a
            if (r4 == 0) goto L1d5
            r1.f10346b = r8
            goto L1d5
        L1c0:
            r0 = move-exception
            java.lang.String r4 = "no pkg "
            java.lang.String r4 = r4.concat(r8)
            com.google.android.gms.common.t r5 = new com.google.android.gms.common.t
            r12 = 0
            r5.<init>(r12, r4, r0)
            r0 = r5
            goto L1d5
        L1cf:
            android.os.StrictMode.setThreadPolicy(r12)
            throw r0
        L1d3:
            com.google.android.gms.common.t r0 = com.google.android.gms.common.t.f10370d
        L1d5:
            boolean r4 = r0.f10371a
            if (r4 == 0) goto L1da
            goto L1ed
        L1da:
            int r7 = r7 + 1
            r4 = 0
            r5 = 0
            goto L1c
        L1e0:
            x3.AbstractC1887A.g(r0)
            goto L1ed
        L1e4:
            com.google.android.gms.common.t r0 = new com.google.android.gms.common.t
            java.lang.String r2 = "no pkgs"
            r4 = 0
            r12 = 0
            r0.<init>(r12, r2, r4)
        L1ed:
            java.lang.Throwable r2 = r0.f10373c
            boolean r4 = r0.f10371a
            if (r4 != 0) goto L20c
            java.lang.String r4 = "GoogleCertificatesRslt"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20c
            if (r2 == 0) goto L205
            java.lang.String r3 = r0.a()
            android.util.Log.d(r4, r3, r2)
            goto L20c
        L205:
            java.lang.String r2 = r0.a()
            android.util.Log.d(r4, r2)
        L20c:
            boolean r0 = r0.f10371a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.i.b(int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public i() {
        this.f10345a = new CopyOnWriteArraySet();
    }
}
