package y4;

import E1.t;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import z4.C1976j;

/* JADX INFO: renamed from: y4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1919c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f18626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f18627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f18628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f18629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1976j f18630e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1919c(Context context) {
        t tVar = new t("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f18629d = new HashSet();
        this.f18630e = null;
        this.f18626a = tVar;
        this.f18627b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f18628c = applicationContext != null ? applicationContext : context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        C1976j c1976j;
        HashSet hashSet = this.f18629d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f18628c;
        if (!zIsEmpty && this.f18630e == null) {
            C1976j c1976j2 = new C1976j(this);
            this.f18630e = c1976j2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f18627b;
            if (i >= 33) {
                context.registerReceiver(c1976j2, intentFilter, 2);
            } else {
                context.registerReceiver(c1976j2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (c1976j = this.f18630e) == null) {
            return;
        }
        context.unregisterReceiver(c1976j);
        this.f18630e = null;
    }
}
