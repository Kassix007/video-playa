package M3;

import O3.A;
import O3.B0;
import O3.C0271b1;
import O3.C0295j1;
import O3.C0304m1;
import O3.C0312p0;
import O3.C0323t0;
import O3.T0;
import O3.V1;
import O3.X;
import O3.Y1;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r.C1554e;
import s4.e;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0323t0 f3801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0271b1 f3802b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(C0323t0 c0323t0) {
        AbstractC1887A.g(c0323t0);
        this.f3801a = c0323t0;
        C0271b1 c0271b1 = c0323t0.f5054C;
        C0323t0.k(c0271b1);
        this.f3802b = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zza(String str, String str2, Bundle bundle) {
        C0271b1 c0271b1 = this.f3802b;
        ((C0323t0) c0271b1.f4346r).f5052A.getClass();
        c0271b1.t(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final Map zzd(String str, String str2, boolean z5) {
        C0271b1 c0271b1 = this.f3802b;
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        C0312p0 c0312p0 = c0323t0.f5078w;
        X x6 = c0323t0.f5077v;
        C0323t0.l(c0312p0);
        if (c0312p0.u()) {
            C0323t0.l(x6);
            x6.f4670w.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (e.i()) {
            C0323t0.l(x6);
            x6.f4670w.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C0312p0 c0312p02 = c0323t0.f5078w;
        C0323t0.l(c0312p02);
        c0312p02.y(atomicReference, 5000L, "get user properties", new T0(c0271b1, atomicReference, str, str2, z5));
        List<V1> list = (List) atomicReference.get();
        if (list == null) {
            C0323t0.l(x6);
            x6.f4670w.c(Boolean.valueOf(z5), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C1554e c1554e = new C1554e(list.size());
        for (V1 v12 : list) {
            Object objW = v12.W();
            if (objW != null) {
                c1554e.put(v12.f4647r, objW);
            }
        }
        return c1554e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzh() {
        C0304m1 c0304m1 = ((C0323t0) this.f3802b.f4346r).f5053B;
        C0323t0.k(c0304m1);
        C0295j1 c0295j1 = c0304m1.f4965t;
        if (c0295j1 != null) {
            return c0295j1.f4925a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzi() {
        C0304m1 c0304m1 = ((C0323t0) this.f3802b.f4346r).f5053B;
        C0323t0.k(c0304m1);
        C0295j1 c0295j1 = c0304m1.f4965t;
        if (c0295j1 != null) {
            return c0295j1.f4926b;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzj() {
        return (String) this.f3802b.f4765x.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final String zzk() {
        return (String) this.f3802b.f4765x.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final long zzl() {
        Y1 y12 = this.f3801a.f5080y;
        C0323t0.j(y12);
        return y12.k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzm(String str) {
        C0323t0 c0323t0 = this.f3801a;
        A a7 = c0323t0.f5055D;
        C0323t0.i(a7);
        c0323t0.f5052A.getClass();
        a7.p(str, SystemClock.elapsedRealtime());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzn(String str) {
        C0323t0 c0323t0 = this.f3801a;
        A a7 = c0323t0.f5055D;
        C0323t0.i(a7);
        c0323t0.f5052A.getClass();
        a7.q(str, SystemClock.elapsedRealtime());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzo(Bundle bundle) {
        C0271b1 c0271b1 = this.f3802b;
        ((C0323t0) c0271b1.f4346r).f5052A.getClass();
        c0271b1.B(bundle, System.currentTimeMillis());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final void zzp(String str, String str2, Bundle bundle) {
        C0271b1 c0271b1 = this.f3801a.f5054C;
        C0323t0.k(c0271b1);
        c0271b1.C(str, str2, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final List zzq(String str, String str2) {
        C0271b1 c0271b1 = this.f3802b;
        C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
        C0312p0 c0312p0 = c0323t0.f5078w;
        X x6 = c0323t0.f5077v;
        C0323t0.l(c0312p0);
        if (c0312p0.u()) {
            C0323t0.l(x6);
            x6.f4670w.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (e.i()) {
            C0323t0.l(x6);
            x6.f4670w.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C0312p0 c0312p02 = c0323t0.f5078w;
        C0323t0.l(c0312p02);
        c0312p02.y(atomicReference, 5000L, "get conditional user properties", new B0(c0271b1, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return Y1.d0(list);
        }
        C0323t0.l(x6);
        x6.f4670w.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0274c1
    public final int zzr(String str) {
        C0271b1 c0271b1 = this.f3802b;
        c0271b1.getClass();
        AbstractC1887A.d(str);
        ((C0323t0) c0271b1.f4346r).getClass();
        return 25;
    }
}
