package X3;

import android.view.View;
import w1.InterfaceC1850m;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC1850m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f8170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8171s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(View view) {
        this.f8170r = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public o0 c(View view, o0 o0Var) {
        int i = o0Var.f18232a.g(519).f15126b;
        int i7 = this.f8169q;
        View view2 = this.f8170r;
        if (i7 >= 0) {
            view2.getLayoutParams().height = i7 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f8171s + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return o0Var;
    }

    public b(View view, int i, int i7) {
        this.f8169q = i;
        this.f8170r = view;
        this.f8171s = i7;
    }
}
