package C2;

import B0.G0;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f1181a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(G0 g02) {
        this.f1181a = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        G0.g(this.f1181a, network, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        G0.g(this.f1181a, network, false);
    }
}
