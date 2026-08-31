package q2;

import java.util.ArrayList;
import r.C1554e;

/* JADX INFO: renamed from: q2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1511p extends AbstractC1510o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1554e f15992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC1512q f15993b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1511p(ViewTreeObserverOnPreDrawListenerC1512q viewTreeObserverOnPreDrawListenerC1512q, C1554e c1554e) {
        this.f15993b = viewTreeObserverOnPreDrawListenerC1512q;
        this.f15992a = c1554e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void d(AbstractC1509n abstractC1509n) {
        ((ArrayList) this.f15992a.get(this.f15993b.f15995r)).remove(abstractC1509n);
        abstractC1509n.x(this);
    }
}
