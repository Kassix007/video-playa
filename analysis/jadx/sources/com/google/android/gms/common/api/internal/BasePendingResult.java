package com.google.android.gms.common.api.internal;

import C0.C0072d0;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.P1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import u3.g;
import u3.h;
import v3.d;
import v3.k;
import v3.r;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends h> extends P1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0072d0 f10316g = new C0072d0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10317b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f10318c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10319d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10320e;
    public boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BasePendingResult(g gVar) {
        new AtomicReference();
        this.f = false;
        new d(gVar != null ? ((r) gVar).f17596a.f : Looper.getMainLooper(), 0);
        new WeakReference(gVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0(h hVar) {
        synchronized (this.f10317b) {
            try {
                if (this.f10320e) {
                    return;
                }
                z0();
                AbstractC1887A.i(!z0(), "Results have already been set");
                hVar.z();
                this.f10318c.countDown();
                ArrayList arrayList = this.f10319d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    k kVar = (k) arrayList.get(i);
                    ((Map) kVar.f17577b.f17579r).remove(kVar.f17576a);
                }
                this.f10319d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Status x0(Status status);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0(Status status) {
        synchronized (this.f10317b) {
            try {
                if (!z0()) {
                    A0(x0(status));
                    this.f10320e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z0() {
        return this.f10318c.getCount() == 0;
    }
}
