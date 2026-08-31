package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.work.impl.WorkDatabaseVersions;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";
    static boolean zza = false;
    private static boolean zzb = false;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException e7) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws g {
        f fVar = f.f10343b;
        int iC = fVar.c(context, i);
        if (iC != 0) {
            Intent intentA = fVar.a(context, iC, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iC);
            if (intentA != null) {
                throw new g("Google Play Services not available");
            }
            throw new g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static int getClientVersion(Context context) {
        PackageInfo packageInfoA;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfoA = C3.c.a(context).a(128, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoA = null;
        }
        if (packageInfoA == null || (applicationInfo = packageInfoA.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return f.f10343b.a(null, i, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zza) {
                try {
                    PackageInfo packageInfoA = C3.c.a(context).a(64, "com.google.android.gms");
                    i.a(context);
                    if (packageInfoA == null || i.d(packageInfoA, false) || !i.d(packageInfoA, true)) {
                        zzb = false;
                    } else {
                        zzb = true;
                    }
                    zza = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    zza = true;
                }
            }
            return zzb || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            zza = true;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch: java.lang.Throwable -> Lb
            r1 = 2131820602(0x7f11003a, float:1.9273924E38)
            r0.getString(r1)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L12:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L9b
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.h.zzc
            boolean r0 = r0.get()
            if (r0 == 0) goto L29
            goto L9b
        L29:
            java.lang.Object r0 = x3.AbstractC1887A.f18381a
            monitor-enter(r0)
            boolean r2 = x3.AbstractC1887A.f18382b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            goto L67
        L32:
            r9 = move-exception
            goto L99
        L34:
            x3.AbstractC1887A.f18382b = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r9.getPackageName()     // Catch: java.lang.Throwable -> L32
            C3.b r3 = C3.c.a(r9)     // Catch: java.lang.Throwable -> L32
            android.content.Context r3 = r3.f1185a     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            android.os.Bundle r2 = r2.metaData     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            if (r2 != 0) goto L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            goto L67
        L50:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            x3.AbstractC1887A.f18383c = r2     // Catch: java.lang.Throwable -> L32 android.content.pm.PackageManager.NameNotFoundException -> L5e
            goto L66
        L5e:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch: java.lang.Throwable -> L32
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
        L67:
            int r0 = x3.AbstractC1887A.f18383c
            if (r0 == 0) goto L93
            int r2 = com.google.android.gms.common.h.GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r2) goto L70
            goto L9b
        L70:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            int r10 = com.google.android.gms.common.f.f10342a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = " but found "
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r9.<init>(r10)
            throw r9
        L93:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r9
        L9b:
            boolean r0 = B3.b.d(r9)
            r2 = 0
            if (r0 != 0) goto Ld1
            java.lang.Boolean r0 = B3.b.f556e
            if (r0 != 0) goto Lc7
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto Lbe
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto Lc0
        Lbe:
            r0 = r1
            goto Lc1
        Lc0:
            r0 = r2
        Lc1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            B3.b.f556e = r0
        Lc7:
            java.lang.Boolean r0 = B3.b.f556e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ld1
            r0 = r1
            goto Ld2
        Ld1:
            r0 = r2
        Ld2:
            if (r10 < 0) goto Ld6
            r3 = r1
            goto Ld7
        Ld6:
            r3 = r2
        Ld7:
            x3.AbstractC1887A.a(r3)
            java.lang.String r3 = r9.getPackageName()
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L101
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lef
            goto L102
        Lef:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r0, r9)
        Lfe:
            r1 = r5
            goto L1c7
        L101:
            r6 = 0
        L102:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b8
            com.google.android.gms.common.i.a(r9)
            boolean r9 = com.google.android.gms.common.i.d(r7, r1)
            if (r9 != 0) goto L123
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r0, r9)
            goto Lfe
        L123:
            if (r0 == 0) goto L13e
            x3.AbstractC1887A.g(r6)
            boolean r9 = com.google.android.gms.common.i.d(r6, r1)
            if (r9 != 0) goto L13e
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r0, r9)
            goto Lfe
        L13e:
            if (r0 == 0) goto L160
            if (r6 == 0) goto L160
            android.content.pm.Signature[] r9 = r6.signatures
            r9 = r9[r2]
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r2]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L160
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r0, r9)
            goto Lfe
        L160:
            int r9 = r7.versionCode
            r0 = -1
            if (r9 != r0) goto L167
            r5 = r0
            goto L169
        L167:
            int r5 = r9 / 1000
        L169:
            if (r10 != r0) goto L16c
            goto L16e
        L16c:
            int r0 = r10 / 1000
        L16e:
            if (r5 >= r0) goto L195
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Google Play services out of date for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "GooglePlayServicesUtil"
            android.util.Log.w(r10, r9)
            r1 = 2
            goto L1c7
        L195:
            android.content.pm.ApplicationInfo r9 = r7.applicationInfo
            if (r9 != 0) goto L1b1
            java.lang.String r9 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r9 = r4.getApplicationInfo(r9, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a0
            goto L1b1
        L1a0:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.wtf(r2, r10, r9)
            goto L1c7
        L1b1:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L1b7
            r1 = 3
            goto L1c7
        L1b7:
            return r2
        L1b8:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r0, r9)
        L1c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.h.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return B3.b.c(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @TargetApi(WorkDatabaseVersions.VERSION_18)
    public static boolean isRestrictedUserProfile(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC1887A.g(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        if (B3.b.f555d == null) {
            B3.b.f555d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return B3.b.f555d.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @TargetApi(WorkDatabaseVersions.VERSION_19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return B3.b.e(context, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @TargetApi(WorkDatabaseVersions.VERSION_21)
    public static boolean zza(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }
}
