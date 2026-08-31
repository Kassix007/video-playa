package C0;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.wnapp.smspariaz.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC1196C;
import l.ViewOnKeyListenerC1203f;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import x1.AccessibilityManagerTouchExplorationStateChangeListenerC1885b;

/* JADX INFO: loaded from: classes.dex */
public final class D implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f809r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ D(int i, Object obj) {
        this.f808q = i;
        this.f809r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f808q;
        Object obj = this.f809r;
        switch (i) {
            case 0:
                I i7 = (I) obj;
                AccessibilityManager accessibilityManager = i7.f856g;
                accessibilityManager.addAccessibilityStateChangeListener(i7.i);
                accessibilityManager.addTouchExplorationStateChangeListener(i7.j);
                break;
            case 1:
            case 2:
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                AbstractC1862z.c(view2);
                break;
            case 4:
            case 5:
                break;
            default:
                v4.m mVar = (v4.m) obj;
                AccessibilityManager accessibilityManager2 = mVar.f17651J;
                if (mVar.f17652K != null && accessibilityManager2 != null) {
                    WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                    if (mVar.isAttachedToWindow()) {
                        accessibilityManager2.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1885b(mVar.f17652K));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z5;
        AccessibilityManager accessibilityManager;
        switch (this.f808q) {
            case 0:
                I i = (I) this.f809r;
                i.f859l.removeCallbacks(i.f851M);
                AccessibilityManager accessibilityManager2 = i.f856g;
                accessibilityManager2.removeAccessibilityStateChangeListener(i.i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(i.j);
                break;
            case 1:
                AbstractC0065a abstractC0065a = (AbstractC0065a) this.f809r;
                Iterator it = I5.k.R(abstractC0065a.getParent(), w1.N.f18156q).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            kotlin.jvm.internal.m.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z5 = true;
                            }
                        }
                    }
                }
                if (!z5) {
                    w1 w1Var = abstractC0065a.f982s;
                    if (w1Var != null) {
                        w1Var.d();
                    }
                    abstractC0065a.f982s = null;
                    abstractC0065a.requestLayout();
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((M5.B) this.f809r).a(null);
                break;
            case 3:
                break;
            case 4:
                ViewOnKeyListenerC1203f viewOnKeyListenerC1203f = (ViewOnKeyListenerC1203f) this.f809r;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1203f.f14325N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1203f.f14325N = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1203f.f14325N.removeGlobalOnLayoutListener(viewOnKeyListenerC1203f.f14335y);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                ViewOnKeyListenerC1196C viewOnKeyListenerC1196C = (ViewOnKeyListenerC1196C) this.f809r;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1196C.f14275E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1196C.f14275E = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1196C.f14275E.removeGlobalOnLayoutListener(viewOnKeyListenerC1196C.f14288y);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                v4.m mVar = (v4.m) this.f809r;
                R4.L0 l02 = mVar.f17652K;
                if (l02 != null && (accessibilityManager = mVar.f17651J) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1885b(l02));
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
