package C0;

import android.view.accessibility.AccessibilityEvent;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f830r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(I i, int i7) {
        super(1);
        this.f829q = i7;
        this.f830r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f829q) {
            case 0:
                I i = this.f830r;
                return Boolean.valueOf(i.f854d.getParent().requestSendAccessibilityEvent(i.f854d, (AccessibilityEvent) obj));
            default:
                U0 u02 = (U0) obj;
                if (u02.f931r.contains(u02)) {
                    I i7 = this.f830r;
                    i7.f854d.getSnapshotObserver().a(u02, i7.f853O, new B0.K(6, u02, i7));
                }
                return C1386y.f15098a;
        }
    }
}
