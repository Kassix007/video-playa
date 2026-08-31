package Z0;

import B0.AbstractC0041g;
import C0.A;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC1111d;
import h0.C1108a;
import h0.InterfaceC1114g;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f8383r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i) {
        super(1);
        this.f8382q = i;
        this.f8383r = pVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8382q) {
            case 0:
                C1108a c1108a = (C1108a) obj;
                p pVar = this.f8383r;
                View viewC = l.c(pVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    if (!AbstractC1111d.z(viewC, AbstractC1111d.D(c1108a.f13394a), l.b(((A) AbstractC0041g.v(pVar)).getFocusOwner(), AbstractC0041g.w(pVar), viewC))) {
                        c1108a.f13395b = true;
                    }
                }
                return C1386y.f15098a;
            default:
                C1108a c1108a2 = (C1108a) obj;
                p pVar2 = this.f8383r;
                View viewC2 = l.c(pVar2);
                if (viewC2.hasFocus()) {
                    InterfaceC1114g focusOwner = ((A) AbstractC0041g.v(pVar2)).getFocusOwner();
                    View viewW = AbstractC0041g.w(pVar2);
                    if (viewC2 instanceof ViewGroup) {
                        Rect rectB = l.b(focusOwner, viewW, viewC2);
                        Integer numD = AbstractC1111d.D(c1108a2.f13394a);
                        int iIntValue = numD != null ? numD.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = pVar2.f8384E;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewW, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewW, rectB, iIntValue);
                        if (viewFindNextFocus != null && l.a(viewC2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectB);
                            c1108a2.f13395b = true;
                        } else if (!viewW.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewW.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return C1386y.f15098a;
        }
    }
}
