package Q2;

import android.content.Context;
import android.net.ConnectivityManager;
import k1.AbstractC1175c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.k implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f6537q = new i(1, g.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && AbstractC1175c.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new f(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return e.f6528a;
    }
}
