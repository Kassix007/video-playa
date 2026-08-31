package R5;

import C0.S;
import M5.A;
import M5.AbstractC0257s;
import M5.C;
import M5.C0247h;
import M5.J;
import M5.v0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0257s implements C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7242w = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C f7243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0257s f7244r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k f7247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f7248v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: M5.s */
    /* JADX WARN: Multi-variable type inference failed */
    public h(AbstractC0257s abstractC0257s, int i, String str) {
        C c7 = abstractC0257s instanceof C ? (C) abstractC0257s : null;
        this.f7243q = c7 == null ? A.f3804a : c7;
        this.f7244r = abstractC0257s;
        this.f7245s = i;
        this.f7246t = str;
        this.f7247u = new k();
        this.f7248v = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Runnable a0() {
        while (true) {
            Runnable runnable = (Runnable) this.f7247u.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7248v) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7242w;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f7247u.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b0() {
        synchronized (this.f7248v) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7242w;
            if (atomicIntegerFieldUpdater.get(this) >= this.f7245s) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        Runnable runnableA0;
        this.f7247u.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7242w;
        if (atomicIntegerFieldUpdater.get(this) >= this.f7245s || !b0() || (runnableA0 = a0()) == null) {
            return;
        }
        try {
            b.i(this.f7244r, this, new I4.a(18, (Object) this, (Object) runnableA0, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatchYield(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        Runnable runnableA0;
        this.f7247u.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7242w;
        if (atomicIntegerFieldUpdater.get(this) >= this.f7245s || !b0() || (runnableA0 = a0()) == null) {
            return;
        }
        try {
            this.f7244r.dispatchYield(this, new I4.a(18, (Object) this, (Object) runnableA0, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final AbstractC0257s limitedParallelism(int i, String str) {
        b.a(i);
        return i >= this.f7245s ? str != null ? new o(this, str) : this : super.limitedParallelism(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final J n(long j, v0 v0Var, InterfaceC1529h interfaceC1529h) {
        return this.f7243q.n(j, v0Var, interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        String str = this.f7246t;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7244r);
        sb.append(".limitedParallelism(");
        return S.o(sb, this.f7245s, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final void z(long j, C0247h c0247h) {
        this.f7243q.z(j, c0247h);
    }
}
