package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.C0804h0;
import com.google.android.gms.internal.measurement.C0863t0;
import com.google.android.gms.internal.measurement.G;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzc implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzc(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.zza = firebaseAnalytics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0863t0 c0863t0Zza = this.zza.zza();
        c0863t0Zza.getClass();
        G g7 = new G();
        c0863t0Zza.c(new C0804h0(c0863t0Zza, g7, 6, false));
        return (Long) G.L(g7.K(120000L), Long.class);
    }
}
