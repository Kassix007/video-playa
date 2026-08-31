package C0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h0.AbstractC1111d;
import h0.C1110c;
import h0.C1115h;
import i0.C1131c;
import j0.AbstractC1145B;
import m5.C1386y;

/* JADX INFO: renamed from: C0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110x extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f1149r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0110x(A a7, int i) {
        super(1);
        this.f1148q = i;
        this.f1149r = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        C1110c c1110c;
        switch (this.f1148q) {
            case 0:
                KeyEvent keyEvent = ((t0.b) obj).f16671a;
                A a7 = this.f1149r;
                int[] iArr = a7.f750h0;
                long jD = Q2.g.d(keyEvent.getKeyCode());
                if (t0.a.a(jD, t0.a.f16665g)) {
                    c1110c = new C1110c(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (t0.a.a(jD, t0.a.f16664e)) {
                    c1110c = new C1110c(4);
                } else if (t0.a.a(jD, t0.a.f16663d)) {
                    c1110c = new C1110c(3);
                } else {
                    c1110c = t0.a.a(jD, t0.a.f16661b) ? true : t0.a.a(jD, t0.a.f16667k) ? new C1110c(5) : t0.a.a(jD, t0.a.f16662c) ? true : t0.a.a(jD, t0.a.f16668l) ? new C1110c(6) : t0.a.a(jD, t0.a.f) ? true : t0.a.a(jD, t0.a.i) ? true : t0.a.a(jD, t0.a.f16669m) ? new C1110c(7) : t0.a.a(jD, t0.a.f16660a) ? true : t0.a.a(jD, t0.a.j) ? new C1110c(8) : null;
                }
                if (c1110c != null) {
                    int i = c1110c.f13400a;
                    if (E3.h.C(keyEvent) == 2) {
                        Integer numD = AbstractC1111d.D(i);
                        C1131c c1131cD = a7.D();
                        Boolean boolD = ((C1115h) a7.getFocusOwner()).d(i, c1131cD, new C0108w(c1110c, 1));
                        if (boolD != null ? boolD.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numD != null) {
                            int iIntValue = numD.intValue();
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View viewFindNextFocus = a7;
                            while (true) {
                                if (viewFindNextFocus != null) {
                                    View rootView = a7.getRootView();
                                    kotlin.jvm.internal.m.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                                    if (viewFindNextFocus != null) {
                                        if (!viewFindNextFocus.equals(a7)) {
                                            for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == a7) {
                                                }
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    viewFindNextFocus = null;
                                }
                            }
                            if (kotlin.jvm.internal.m.a(viewFindNextFocus, a7)) {
                                viewFindNextFocus = null;
                            }
                            if (viewFindNextFocus != null) {
                                Rect rectU = c1131cD != null ? AbstractC1145B.u(c1131cD) : null;
                                if (rectU == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                viewFindNextFocus.getLocationInWindow(iArr);
                                int i7 = iArr[0];
                                int i8 = iArr[1];
                                a7.getLocationInWindow(iArr);
                                rectU.offset(iArr[0] - i7, iArr[1] - i8);
                                if (AbstractC1111d.z(viewFindNextFocus, numD, rectU)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((C1115h) a7.getFocusOwner()).b(i, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolD2 = ((C1115h) a7.getFocusOwner()).d(i, null, new C0108w(c1110c, 0));
                        return Boolean.valueOf(boolD2 != null ? boolD2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                B5.a aVar = (B5.a) obj;
                A a8 = this.f1149r;
                Handler handler = a8.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = a8.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0114z(aVar, 0));
                    }
                }
                return C1386y.f15098a;
        }
    }
}
