package O3;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4301q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f4302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a2 f4303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4306v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ A0(C0 c02, a2 a2Var, Bundle bundle, K k7, String str) {
        this.f4304t = c02;
        this.f4303s = a2Var;
        this.f4305u = bundle;
        this.f4306v = k7;
        this.f4302r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C0333w1 c0333w1;
        I i;
        Y1 y12;
        I i7;
        switch (this.f4301q) {
            case 0:
                C0 c02 = (C0) this.f4304t;
                a2 a2Var = this.f4303s;
                Bundle bundle = (Bundle) this.f4305u;
                K k7 = (K) this.f4306v;
                String str = this.f4302r;
                T1 t12 = c02.f4330c;
                t12.A();
                try {
                    k7.A(t12.b0(a2Var, bundle));
                    return;
                } catch (RemoteException e7) {
                    t12.b().f4670w.d(str, e7, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f4304t;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0333w1 = (C0333w1) this.f4306v;
                            i = c0333w1.f5109u;
                        } catch (RemoteException e8) {
                            X x6 = ((C0323t0) ((C0333w1) this.f4306v).f4346r).f5077v;
                            C0323t0.l(x6);
                            x6.f4670w.e("(legacy) Failed to get conditional properties; remote exception", null, this.f4302r, e8);
                            ((AtomicReference) this.f4304t).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f4304t;
                        }
                        if (i == null) {
                            X x7 = ((C0323t0) c0333w1.f4346r).f5077v;
                            C0323t0.l(x7);
                            x7.f4670w.e("(legacy) Failed to get conditional properties; not connected to service", null, this.f4302r, (String) this.f4305u);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i.z(this.f4302r, (String) this.f4305u, this.f4303s));
                        } else {
                            atomicReference2.set(i.v(null, this.f4302r, (String) this.f4305u));
                        }
                        c0333w1.B();
                        atomicReference = (AtomicReference) this.f4304t;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.f4304t).notify();
                        throw th;
                    }
                }
            default:
                com.google.android.gms.internal.measurement.L l7 = (com.google.android.gms.internal.measurement.L) this.f4305u;
                String str2 = (String) this.f4304t;
                String str3 = this.f4302r;
                C0333w1 c0333w12 = (C0333w1) this.f4306v;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        i7 = c0333w12.f5109u;
                    } catch (Throwable th2) {
                        Y1 y13 = ((C0323t0) c0333w12.f4346r).f5080y;
                        C0323t0.j(y13);
                        y13.c0(l7, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e9) {
                    X x8 = ((C0323t0) c0333w12.f4346r).f5077v;
                    C0323t0.l(x8);
                    x8.f4670w.e("Failed to get conditional properties; remote exception", str3, str2, e9);
                }
                if (i7 != null) {
                    arrayList = Y1.d0(i7.z(str3, str2, this.f4303s));
                    c0333w12.B();
                    y12 = ((C0323t0) c0333w12.f4346r).f5080y;
                    C0323t0.j(y12);
                    y12.c0(l7, arrayList);
                    return;
                }
                C0323t0 c0323t0 = (C0323t0) c0333w12.f4346r;
                X x9 = c0323t0.f5077v;
                C0323t0.l(x9);
                x9.f4670w.d(str3, str2, "Failed to get conditional properties; not connected to service");
                y12 = c0323t0.f5080y;
                C0323t0.j(y12);
                y12.c0(l7, arrayList);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public A0(C0333w1 c0333w1, String str, String str2, a2 a2Var, com.google.android.gms.internal.measurement.L l7) {
        this.f4302r = str;
        this.f4304t = str2;
        this.f4303s = a2Var;
        this.f4305u = l7;
        this.f4306v = c0333w1;
    }

    public A0(C0333w1 c0333w1, AtomicReference atomicReference, String str, String str2, a2 a2Var) {
        this.f4304t = atomicReference;
        this.f4302r = str;
        this.f4305u = str2;
        this.f4303s = a2Var;
        this.f4306v = c0333w1;
    }
}
