package androidx.work.impl.utils;

import android.net.NetworkRequest;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class NetworkRequest31 {
    public static final NetworkRequest31 INSTANCE = new NetworkRequest31();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NetworkRequest31() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] capabilities(NetworkRequest request) {
        m.e(request, "request");
        int[] capabilities = request.getCapabilities();
        m.d(capabilities, "request.capabilities");
        return capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] transportTypes(NetworkRequest request) {
        m.e(request, "request");
        int[] transportTypes = request.getTransportTypes();
        m.d(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
