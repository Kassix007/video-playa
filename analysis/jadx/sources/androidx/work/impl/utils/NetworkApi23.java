package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkApi23 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Network getActiveNetworkCompat(ConnectivityManager connectivityManager) {
        m.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
