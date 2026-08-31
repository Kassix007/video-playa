package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import kotlin.jvm.internal.m;
import n5.k;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NetworkRequest28() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NetworkRequest createNetworkRequest(int[] capabilities, int[] transports) {
        m.e(capabilities, "capabilities");
        m.e(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : capabilities) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e7) {
                Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring adding capability '" + i + '\'', e7);
            }
        }
        for (int i7 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!k.y0(capabilities, i7)) {
                try {
                    builder.removeCapability(i7);
                } catch (IllegalArgumentException e8) {
                    Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring removing default capability '" + i7 + '\'', e8);
                }
            }
        }
        for (int i8 : transports) {
            builder.addTransportType(i8);
        }
        NetworkRequest networkRequestBuild = builder.build();
        m.d(networkRequestBuild, "networkRequest.build()");
        return networkRequestBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] capabilities, int[] transports) {
        m.e(capabilities, "capabilities");
        m.e(transports, "transports");
        return new NetworkRequestCompat(createNetworkRequest(capabilities, transports));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasCapability$work_runtime_release(NetworkRequest request, int i) {
        m.e(request, "request");
        return request.hasCapability(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasTransport$work_runtime_release(NetworkRequest request, int i) {
        m.e(request, "request");
        return request.hasTransport(i);
    }
}
