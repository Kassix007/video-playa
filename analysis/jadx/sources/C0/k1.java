package C0;

import J1.AbstractComponentCallbacksC0185q;
import J1.C0176h;
import P.C0385v0;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1055q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1057s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k1(J1.w wVar, J1.N n7) {
        this.f1057s = wVar;
        this.f1056r = n7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1055q) {
            case 0:
                break;
            default:
                J1.N n7 = (J1.N) this.f1056r;
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
                n7.k();
                C0176h.f((ViewGroup) abstractComponentCallbacksC0185q.f2703U.getParent(), ((J1.w) this.f1057s).f2744q.D()).e();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1055q) {
            case 0:
                ((View) this.f1056r).removeOnAttachStateChangeListener(this);
                ((C0385v0) this.f1057s).t();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public k1(View view, C0385v0 c0385v0) {
        this.f1056r = view;
        this.f1057s = c0385v0;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
