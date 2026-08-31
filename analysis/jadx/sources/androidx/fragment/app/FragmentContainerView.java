package androidx.fragment.app;

import C0.S;
import I1.a;
import J1.AbstractComponentCallbacksC0185q;
import J1.B;
import J1.C0169a;
import J1.C0188u;
import J1.H;
import J1.N;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.wnapp.smspariaz.R;
import h.AbstractActivityC1106h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f9471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f9472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f9473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9474t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        m.e(context, "context");
        this.f9471q = new ArrayList();
        this.f9472r = new ArrayList();
        this.f9474t = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2331b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(View view) {
        if (this.f9472r.contains(view)) {
            this.f9471q.add(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        m.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0185q ? (AbstractComponentCallbacksC0185q) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        o0 o0VarG;
        m.e(insets, "insets");
        o0 o0VarG2 = o0.g(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f9473s;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            m.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            o0VarG = o0.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            WindowInsets windowInsetsF = o0VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = AbstractC1862z.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    o0VarG2 = o0.g(this, windowInsetsB);
                }
            }
            o0VarG = o0VarG2;
        }
        if (!o0VarG.f18232a.o()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC1835K.b(getChildAt(i), o0VarG);
            }
        }
        return insets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        if (this.f9474t) {
            ArrayList arrayList = this.f9471q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        m.e(canvas, "canvas");
        m.e(child, "child");
        if (this.f9474t) {
            ArrayList arrayList = this.f9471q;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        m.e(view, "view");
        this.f9472r.remove(view);
        if (this.f9471q.remove(view)) {
            this.f9474t = true;
        }
        super.endViewTransition(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <F extends AbstractComponentCallbacksC0185q> F getFragment() {
        AbstractActivityC1106h abstractActivityC1106h;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q;
        H h4;
        View view = this;
        while (true) {
            abstractActivityC1106h = null;
            if (view == null) {
                abstractComponentCallbacksC0185q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0185q = tag instanceof AbstractComponentCallbacksC0185q ? (AbstractComponentCallbacksC0185q) tag : null;
            if (abstractComponentCallbacksC0185q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0185q == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC1106h) {
                    abstractActivityC1106h = (AbstractActivityC1106h) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC1106h == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            h4 = ((C0188u) abstractActivityC1106h.f13295K.f14122r).f2737w;
        } else {
            if (abstractComponentCallbacksC0185q.f2691I == null || !abstractComponentCallbacksC0185q.f2683A) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0185q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            h4 = abstractComponentCallbacksC0185q.h();
        }
        return (F) h4.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        m.e(insets, "insets");
        return insets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                m.d(view, "view");
                a(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m.e(view, "view");
        a(view);
        super.removeView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        m.d(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i7) {
        int i8 = i + i7;
        for (int i9 = i; i9 < i8; i9++) {
            View view = getChildAt(i9);
            m.d(view, "view");
            a(view);
        }
        super.removeViews(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i7) {
        int i8 = i + i7;
        for (int i9 = i; i9 < i8; i9++) {
            View view = getChildAt(i9);
            m.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDrawDisappearingViewsLast(boolean z5) {
        this.f9474t = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        m.e(listener, "listener");
        this.f9473s = listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        m.e(view, "view");
        if (view.getParent() == this) {
            this.f9472r.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, H h4) {
        View view;
        super(context, attrs);
        m.e(context, "context");
        m.e(attrs, "attrs");
        this.f9471q = new ArrayList();
        this.f9472r = new ArrayList();
        this.f9474t = true;
        String classAttribute = attrs.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, a.f2331b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qA = h4.A(id);
        if (classAttribute != null && abstractComponentCallbacksC0185qA == null) {
            if (id == -1) {
                throw new IllegalStateException(S.n("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            B bC = h4.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qA2 = bC.a(classAttribute);
            m.d(abstractComponentCallbacksC0185qA2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0185qA2.f2701S = true;
            C0188u c0188u = abstractComponentCallbacksC0185qA2.f2691I;
            if ((c0188u == null ? null : c0188u.f2734t) != null) {
                abstractComponentCallbacksC0185qA2.f2701S = true;
            }
            C0169a c0169a = new C0169a(h4);
            c0169a.f2616o = true;
            abstractComponentCallbacksC0185qA2.f2702T = this;
            c0169a.e(getId(), abstractComponentCallbacksC0185qA2, string, 1);
            if (!c0169a.f2610g) {
                H h7 = c0169a.f2617p;
                if (h7.f2541t != null && !h7.f2518G) {
                    h7.x(true);
                    c0169a.a(h7.f2520I, h7.f2521J);
                    h7.f2526b = true;
                    try {
                        h7.Q(h7.f2520I, h7.f2521J);
                        h7.d();
                        h7.b0();
                        h7.u();
                        ((HashMap) h7.f2527c.f1553r).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        h7.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListO = h4.f2527c.o();
        int size = arrayListO.size();
        while (i < size) {
            Object obj = arrayListO.get(i);
            i++;
            N n7 = (N) obj;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
            if (abstractComponentCallbacksC0185q.f2695M == getId() && (view = abstractComponentCallbacksC0185q.f2703U) != null && view.getParent() == null) {
                abstractComponentCallbacksC0185q.f2702T = this;
                n7.b();
            }
        }
    }
}
