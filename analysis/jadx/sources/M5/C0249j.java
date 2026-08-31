package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.C1386y;

/* JADX INFO: renamed from: M5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249j extends e0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0247h f3867v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0249j(C0247h c0247h, int i) {
        this.f3866u = i;
        this.f3867v = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final boolean k() {
        switch (this.f3866u) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final void l(Throwable th) {
        switch (this.f3866u) {
            case 0:
                i0 i0VarJ = j();
                C0247h c0247h = this.f3867v;
                Throwable thP = c0247h.p(i0VarJ);
                if (c0247h.x()) {
                    R5.g gVar = (R5.g) c0247h.f3857t;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R5.g.f7237x;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        E4.f fVar = R5.b.f7228c;
                        if (kotlin.jvm.internal.m.a(obj, fVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, thP)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != fVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                }
                            }
                        }
                    }
                }
                c0247h.g(thP);
                if (!c0247h.x()) {
                    c0247h.l();
                }
                break;
            default:
                this.f3867v.resumeWith(C1386y.f15098a);
                break;
        }
    }
}
