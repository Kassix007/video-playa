package androidx.work.impl.constraints;

import B5.a;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.u;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class IndividualNetworkCallback$Companion$addCallback$1 extends n implements a {
    final /* synthetic */ u $callbackRegistered;
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ IndividualNetworkCallback $networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualNetworkCallback$Companion$addCallback$1(u uVar, ConnectivityManager connectivityManager, IndividualNetworkCallback individualNetworkCallback) {
        super(0);
        this.$callbackRegistered = uVar;
        this.$connManager = connectivityManager;
        this.$networkCallback = individualNetworkCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m10invoke();
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m10invoke() {
        if (this.$callbackRegistered.f14264q) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
            this.$connManager.unregisterNetworkCallback(this.$networkCallback);
        }
    }
}
