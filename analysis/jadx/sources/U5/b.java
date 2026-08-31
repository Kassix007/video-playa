package U5;

import M5.A0;
import M5.C0246g;
import M5.C0247h;
import M5.InterfaceC0245f;
import R5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.C1386y;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0245f, A0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0247h f7894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f7895r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(c cVar, C0247h c0247h) {
        this.f7895r = cVar;
        this.f7894q = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.A0
    public final void a(s sVar, int i) {
        this.f7894q.a(sVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final boolean g(Throwable th) {
        return this.f7894q.g(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f7894q.f3858u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final void n(Object obj, B5.f fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f7896h;
        c cVar = this.f7895r;
        atomicReferenceFieldUpdater.set(cVar, null);
        J5.i iVar = new J5.i(6, cVar, this);
        C0247h c0247h = this.f7894q;
        c0247h.B(C1386y.f15098a, c0247h.f3809s, new C0246g(0, iVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final E4.f o(Object obj, B5.f fVar) {
        c cVar = this.f7895r;
        C0246g c0246g = new C0246g(cVar, this);
        E4.f fVarO = this.f7894q.o((C1386y) obj, c0246g);
        if (fVarO != null) {
            c.f7896h.set(cVar, null);
        }
        return fVarO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0245f
    public final void q(Object obj) {
        this.f7894q.q(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        this.f7894q.resumeWith(obj);
    }
}
