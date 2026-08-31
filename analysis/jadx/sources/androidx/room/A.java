package androidx.room;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B f9691r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ A(B b7, int i) {
        this.f9690q = i;
        this.f9691r = b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        switch (this.f9690q) {
            case 0:
                B b7 = this.f9691r;
                AtomicBoolean atomicBoolean = b7.f9697q;
                AtomicBoolean atomicBoolean2 = b7.f9698r;
                if (b7.f9699s.compareAndSet(false, true)) {
                    q invalidationTracker = b7.f9692l.getInvalidationTracker();
                    C0666d observer = b7.f9696p;
                    invalidationTracker.getClass();
                    kotlin.jvm.internal.m.e(observer, "observer");
                    invalidationTracker.a(new p(invalidationTracker, observer));
                }
                do {
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        Object objCall = null;
                        z5 = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = b7.f9695o.call();
                                    z5 = true;
                                } catch (Exception e7) {
                                    throw new RuntimeException("Exception while computing database live data.", e7);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z5) {
                            b7.i(objCall);
                        }
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                B b8 = this.f9691r;
                boolean z6 = b8.f9487c > 0;
                if (b8.f9697q.compareAndSet(false, true) && z6) {
                    WorkDatabase_Impl workDatabase_Impl = b8.f9692l;
                    (b8.f9694n ? workDatabase_Impl.getTransactionExecutor() : workDatabase_Impl.getQueryExecutor()).execute(b8.f9700t);
                    return;
                }
                return;
        }
    }
}
