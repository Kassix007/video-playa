package J1;

import android.view.View;

/* JADX INFO: renamed from: J1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0183o extends C3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0185q f2673t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0183o(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        this.f2673t = abstractComponentCallbacksC0185q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final View J(int i) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2673t;
        View view = abstractComponentCallbacksC0185q.f2703U;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0185q + " does not have a view");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final boolean K() {
        return this.f2673t.f2703U != null;
    }
}
