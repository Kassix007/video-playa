package androidx.work.impl.constraints;

import B5.a;
import B5.c;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();
    private static final Map<c, NetworkRequest> requests = new LinkedHashMap();

    /* JADX INFO: renamed from: androidx.work.impl.constraints.SharedNetworkCallback$addCallback$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements a {
        final /* synthetic */ ConnectivityManager $connManager;
        final /* synthetic */ c $onConstraintState;
        final /* synthetic */ SharedNetworkCallback this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, ConnectivityManager connectivityManager, SharedNetworkCallback sharedNetworkCallback) {
            super(0);
            this.$onConstraintState = cVar;
            this.$connManager = connectivityManager;
            this.this$0 = sharedNetworkCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
            Object obj = SharedNetworkCallback.requestsLock;
            c cVar = this.$onConstraintState;
            ConnectivityManager connectivityManager = this.$connManager;
            SharedNetworkCallback sharedNetworkCallback = this.this$0;
            synchronized (obj) {
                SharedNetworkCallback.requests.remove(cVar);
                if (SharedNetworkCallback.requests.isEmpty()) {
                    Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                    connectivityManager.unregisterNetworkCallback(sharedNetworkCallback);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private SharedNetworkCallback() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a addCallback(ConnectivityManager connManager, NetworkRequest networkRequest, c onConstraintState) {
        m.e(connManager, "connManager");
        m.e(networkRequest, "networkRequest");
        m.e(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            Map<c, NetworkRequest> map = requests;
            boolean zIsEmpty = map.isEmpty();
            map.put(onConstraintState, networkRequest);
            if (zIsEmpty) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register shared callback");
                connManager.registerDefaultNetworkCallback(this);
            }
        }
        return new AnonymousClass2(onConstraintState, connManager, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listB0;
        m.e(network, "network");
        m.e(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            listB0 = l.B0(requests.entrySet());
        }
        for (Map.Entry entry : listB0) {
            ((c) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        List listB0;
        m.e(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            listB0 = l.B0(requests.keySet());
        }
        Iterator it = listB0.iterator();
        while (it.hasNext()) {
            ((c) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
        }
    }
}
