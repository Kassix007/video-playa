package O3;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: O3.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0307n1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4989q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f4990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f4991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a2 f4992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f4993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0333w1 f4994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4995w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0307n1(C0333w1 c0333w1, String str, String str2, a2 a2Var, boolean z5, com.google.android.gms.internal.measurement.L l7) {
        this.f4990r = str;
        this.f4991s = str2;
        this.f4992t = a2Var;
        this.f4993u = z5;
        this.f4995w = l7;
        this.f4994v = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Y1 y12;
        I i;
        C0323t0 c0323t0;
        AtomicReference atomicReference;
        C0333w1 c0333w1;
        I i7;
        switch (this.f4989q) {
            case 0:
                String str = this.f4991s;
                String str2 = this.f4990r;
                com.google.android.gms.internal.measurement.L l7 = (com.google.android.gms.internal.measurement.L) this.f4995w;
                C0333w1 c0333w12 = this.f4994v;
                Bundle bundle = new Bundle();
                try {
                    try {
                        i = c0333w12.f5109u;
                        c0323t0 = (C0323t0) c0333w12.f4346r;
                    } catch (RemoteException e7) {
                        e = e7;
                    }
                    if (i == null) {
                        X x6 = c0323t0.f5077v;
                        C0323t0.l(x6);
                        x6.f4670w.d(str2, str, "Failed to get user properties; not connected to service");
                        y12 = c0323t0.f5080y;
                        C0323t0.j(y12);
                        y12.b0(l7, bundle);
                        return;
                    }
                    List<V1> listT = i.t(str2, str, this.f4993u, this.f4992t);
                    Bundle bundle2 = new Bundle();
                    if (listT != null) {
                        for (V1 v12 : listT) {
                            String str3 = v12.f4650u;
                            String str4 = v12.f4647r;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l8 = v12.f4649t;
                                if (l8 != null) {
                                    bundle2.putLong(str4, l8.longValue());
                                } else {
                                    Double d5 = v12.f4652w;
                                    if (d5 != null) {
                                        bundle2.putDouble(str4, d5.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        c0333w12.B();
                        Y1 y13 = c0323t0.f5080y;
                        C0323t0.j(y13);
                        y13.b0(l7, bundle2);
                        return;
                    } catch (RemoteException e8) {
                        e = e8;
                        bundle = bundle2;
                        X x7 = ((C0323t0) c0333w12.f4346r).f5077v;
                        C0323t0.l(x7);
                        x7.f4670w.d(str2, e, "Failed to get user properties; remote exception");
                        y12 = ((C0323t0) c0333w12.f4346r).f5080y;
                        C0323t0.j(y12);
                        y12.b0(l7, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        Y1 y14 = ((C0323t0) c0333w12.f4346r).f5080y;
                        C0323t0.j(y14);
                        y14.b0(l7, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f4995w;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0333w1 = this.f4994v;
                            i7 = c0333w1.f5109u;
                        } catch (RemoteException e9) {
                            X x8 = ((C0323t0) this.f4994v.f4346r).f5077v;
                            C0323t0.l(x8);
                            x8.f4670w.e("(legacy) Failed to get user properties; remote exception", null, this.f4990r, e9);
                            ((AtomicReference) this.f4995w).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f4995w;
                        }
                        if (i7 == null) {
                            X x9 = ((C0323t0) c0333w1.f4346r).f5077v;
                            C0323t0.l(x9);
                            x9.f4670w.e("(legacy) Failed to get user properties; not connected to service", null, this.f4990r, this.f4991s);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i7.t(this.f4990r, this.f4991s, this.f4993u, this.f4992t));
                        } else {
                            atomicReference2.set(i7.i(null, this.f4990r, this.f4991s, this.f4993u));
                        }
                        c0333w1.B();
                        atomicReference = (AtomicReference) this.f4995w;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f4995w).notify();
                        throw th3;
                    }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0307n1(C0333w1 c0333w1, AtomicReference atomicReference, String str, String str2, a2 a2Var, boolean z5) {
        this.f4995w = atomicReference;
        this.f4990r = str;
        this.f4991s = str2;
        this.f4992t = a2Var;
        this.f4993u = z5;
        this.f4994v = c0333w1;
    }
}
