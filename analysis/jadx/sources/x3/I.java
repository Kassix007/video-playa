package x3;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f18397d = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18400c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(String str, boolean z5) {
        AbstractC1887A.d(str);
        this.f18398a = str;
        AbstractC1887A.d("com.google.android.gms");
        this.f18399b = "com.google.android.gms";
        this.f18400c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent a(android.content.Context r6) throws x3.C1888B {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 0
            java.lang.String r2 = r5.f18398a
            if (r2 == 0) goto La3
            boolean r3 = r5.f18400c
            if (r3 == 0) goto L94
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "serviceActionBundleKey"
            r3.putString(r4, r2)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            android.net.Uri r4 = x3.I.f18397d     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            if (r6 == 0) goto L38
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r3 = r6.call(r4, r1, r3)     // Catch: java.lang.Throwable -> L2f
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2b android.os.RemoteException -> L2d
            goto L4e
        L2b:
            r6 = move-exception
            goto L41
        L2d:
            r6 = move-exception
            goto L41
        L2f:
            r3 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            throw r3     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
        L34:
            r6 = move-exception
            goto L40
        L36:
            r6 = move-exception
            goto L40
        L38:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            java.lang.String r3 = "Failed to acquire ContentProviderClient"
            r6.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            throw r6     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
        L40:
            r3 = r1
        L41:
            java.lang.String r4 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r4.concat(r6)
            android.util.Log.w(r0, r6)
        L4e:
            if (r3 == 0) goto L89
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r3.getParcelable(r6)
            r1 = r6
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L89
            java.lang.String r6 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r6 = r3.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L66
            goto L89
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " but has possible resolution"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            x3.B r0 = new x3.B
            com.google.android.gms.common.b r1 = new com.google.android.gms.common.b
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        L89:
            if (r1 != 0) goto L94
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r6.concat(r2)
            android.util.Log.w(r0, r6)
        L94:
            if (r1 != 0) goto La2
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r2)
            java.lang.String r0 = r5.f18399b
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        La2:
            return r1
        La3:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Intent r6 = r6.setComponent(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.I.a(android.content.Context):android.content.Intent");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        return AbstractC1887A.j(this.f18398a, i.f18398a) && AbstractC1887A.j(this.f18399b, i.f18399b) && AbstractC1887A.j(null, null) && this.f18400c == i.f18400c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18398a, this.f18399b, null, 4225, Boolean.valueOf(this.f18400c)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f18398a;
        if (str != null) {
            return str;
        }
        AbstractC1887A.g(null);
        throw null;
    }
}
