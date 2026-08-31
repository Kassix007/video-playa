package k1;

import B0.G0;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14069a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f14073e;
    public CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f14074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14075h;
    public Z.m j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f14077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f14078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f14079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Notification f14080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f14081p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14070b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14071c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14072d = new ArrayList();
    public final boolean i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14076k = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(Context context, String str) {
        Notification notification = new Notification();
        this.f14080o = notification;
        this.f14069a = context;
        this.f14078m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f14075h = 0;
        this.f14081p = new ArrayList();
        this.f14079n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Notification a() {
        Bundle bundle;
        G0 g02 = new G0(this);
        Notification.Builder builder = (Notification.Builder) g02.f234r;
        h hVar = (h) g02.f235s;
        Z.m mVar = hVar.j;
        if (mVar != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) mVar.f8313s);
        }
        Notification notificationBuild = Build.VERSION.SDK_INT >= 26 ? builder.build() : builder.build();
        if (mVar != null) {
            hVar.j.getClass();
        }
        if (mVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Z.m mVar) {
        if (this.j != mVar) {
            this.j = mVar;
            if (((h) mVar.f8312r) != this) {
                mVar.f8312r = this;
                c(mVar);
            }
        }
    }
}
