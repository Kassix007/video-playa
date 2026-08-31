package O5;

import M5.AbstractC0238a;
import M5.AbstractC0263y;
import M5.c0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0238a implements t, i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f5260t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(InterfaceC1529h interfaceC1529h, e eVar) {
        super(interfaceC1529h, true);
        this.f5260t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0, M5.InterfaceC0241b0
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new c0(w(), null, this);
        }
        t(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0238a
    public final void b0(boolean z5, Throwable th) {
        if (this.f5260t.g(false, th) || z5) {
            return;
        }
        AbstractC0263y.p(th, this.f3835s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0238a
    public final void c0(Object obj) {
        this.f5260t.f(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(r rVar) {
        e eVar = this.f5260t;
        eVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f5227z;
        while (!atomicReferenceFieldUpdater.compareAndSet(eVar, null, rVar)) {
            if (atomicReferenceFieldUpdater.get(eVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(eVar);
                    E4.f fVar = g.f5243q;
                    if (obj != fVar) {
                        if (obj == g.f5244r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    E4.f fVar2 = g.f5244r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, fVar, fVar2)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != fVar) {
                            break;
                        }
                    }
                    rVar.invoke(eVar.q());
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final Object h(s5.i iVar) {
        return this.f5260t.h(iVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final Object i() {
        return this.f5260t.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final b iterator() {
        e eVar = this.f5260t;
        eVar.getClass();
        return new b(eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.w
    public final Object j(Object obj) {
        return this.f5260t.j(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.w
    public final Object k(Object obj, InterfaceC1524c interfaceC1524c) {
        return this.f5260t.k(obj, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O5.v
    public final Object l(Q5.t tVar) {
        e eVar = this.f5260t;
        eVar.getClass();
        return e.C(eVar, tVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final void t(CancellationException cancellationException) {
        this.f5260t.g(true, cancellationException);
        s(cancellationException);
    }
}
