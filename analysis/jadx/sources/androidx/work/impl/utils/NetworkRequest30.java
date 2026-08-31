package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkRequest30 {
    public static final NetworkRequest30 INSTANCE = new NetworkRequest30();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NetworkRequest30() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest request) {
        m.e(request, "request");
        return request.getNetworkSpecifier();
    }
}
