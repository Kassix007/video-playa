package com.google.firebase.analytics;

import O3.InterfaceC0274c1;
import O3.L0;
import O3.M0;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.BinderC0844p0;
import com.google.android.gms.internal.measurement.BinderC0849q0;
import com.google.android.gms.internal.measurement.C0768a0;
import com.google.android.gms.internal.measurement.C0774b0;
import com.google.android.gms.internal.measurement.C0779c0;
import com.google.android.gms.internal.measurement.C0804h0;
import com.google.android.gms.internal.measurement.C0819k0;
import com.google.android.gms.internal.measurement.C0829m0;
import com.google.android.gms.internal.measurement.C0834n0;
import com.google.android.gms.internal.measurement.C0863t0;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
final class zzd implements InterfaceC0274c1 {
    final /* synthetic */ C0863t0 zza;

    public zzd(C0863t0 c0863t0) {
        this.zza = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zza(String str, String str2, Bundle bundle) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        c0863t0.c(new C0834n0(c0863t0, null, str, str2, bundle, true, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void zzb(String str, String str2, Bundle bundle, long j) {
        C0863t0 c0863t0 = this.zza;
        Long lValueOf = Long.valueOf(j);
        c0863t0.getClass();
        c0863t0.c(new C0834n0(c0863t0, lValueOf, str, str2, bundle, true, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final Map zzd(String str, String str2, boolean z5) {
        return this.zza.a(str, str2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void zze(L0 l02) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        BinderC0844p0 binderC0844p0 = new BinderC0844p0(l02);
        if (c0863t0.f != null) {
            try {
                c0863t0.f.setEventInterceptor(binderC0844p0);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        c0863t0.c(new C0779c0(c0863t0, binderC0844p0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void zzf(M0 m02) {
        this.zza.f(m02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void zzg(M0 m02) {
        Pair pair;
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        AbstractC1887A.g(m02);
        ArrayList arrayList = c0863t0.f11038c;
        synchronized (arrayList) {
            int i = 0;
            while (true) {
                try {
                    if (i >= arrayList.size()) {
                        pair = null;
                        break;
                    } else {
                        if (m02.equals(((Pair) arrayList.get(i)).first)) {
                            pair = (Pair) arrayList.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            arrayList.remove(pair);
            BinderC0849q0 binderC0849q0 = (BinderC0849q0) pair.second;
            if (c0863t0.f != null) {
                try {
                    c0863t0.f.unregisterOnMeasurementEventListener(binderC0849q0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c0863t0.c(new C0829m0(c0863t0, binderC0849q0, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzh() {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        G g7 = new G();
        c0863t0.c(new C0804h0(c0863t0, g7, 3));
        return g7.J(500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzi() {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        G g7 = new G();
        c0863t0.c(new C0804h0(c0863t0, g7, 4));
        return g7.J(500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzj() {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        G g7 = new G();
        c0863t0.c(new C0804h0(c0863t0, g7, 1));
        return g7.J(50L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzk() {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        G g7 = new G();
        c0863t0.c(new C0804h0(c0863t0, g7, 0));
        return g7.J(500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final long zzl() {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        G g7 = new G();
        c0863t0.c(new C0804h0(c0863t0, g7, 2));
        Long l7 = (Long) G.L(g7.K(500L), Long.class);
        if (l7 != null) {
            return l7.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = c0863t0.f11039d + 1;
        c0863t0.f11039d = i;
        return jNextLong + ((long) i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzm(String str) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        c0863t0.c(new C0774b0(c0863t0, str, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzn(String str) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        c0863t0.c(new C0774b0(c0863t0, str, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzo(Bundle bundle) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        c0863t0.c(new Z(c0863t0, bundle, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzp(String str, String str2, Bundle bundle) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        c0863t0.c(new C0768a0(c0863t0, str, str2, bundle));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final List zzq(String str, String str2) {
        return this.zza.g(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final int zzr(String str) {
        return this.zza.b(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object zzx(int i) {
        C0863t0 c0863t0 = this.zza;
        c0863t0.getClass();
        G g7 = new G();
        c0863t0.c(new C0819k0(c0863t0, g7, i));
        return G.L(g7.K(15000L), Object.class);
    }
}
