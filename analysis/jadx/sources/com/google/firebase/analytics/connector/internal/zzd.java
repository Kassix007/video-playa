package com.google.firebase.analytics.connector.internal;

import O3.K0;
import O3.M0;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzd implements M0 {
    final /* synthetic */ zze zza;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzd(zze zzeVar) {
        Objects.requireNonNull(zzeVar);
        this.zza = zzeVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.M0
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        zze zzeVar = this.zza;
        if (zzeVar.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = zzc.zza;
            String strG = K0.g(str2, K0.f4504c, K0.f4502a);
            if (strG != null) {
                str2 = strG;
            }
            bundle2.putString("events", str2);
            zzeVar.zzd().onMessageTriggered(2, bundle2);
        }
    }
}
