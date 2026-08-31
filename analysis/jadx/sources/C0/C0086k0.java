package C0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: C0.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086k0 extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f1053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f1054r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0086k0(Context context) {
        super(context);
        setClipChildren(false);
        this.f1053q = new HashMap();
        this.f1054r = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashMap<Z0.j, B0.L> getHolderToLayoutNode() {
        return this.f1053q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashMap<B0.L, Z0.j> getLayoutNodeToHolder() {
        return this.f1054r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        for (Z0.j jVar : this.f1053q.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        int i8;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC1904a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i7) == 1073741824)) {
            AbstractC1904a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i7));
        for (Z0.j jVar : this.f1053q.keySet()) {
            int i9 = jVar.f8352K;
            if (i9 != Integer.MIN_VALUE && (i8 = jVar.f8353L) != Integer.MIN_VALUE) {
                jVar.measure(i9, i8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            B0.L l7 = (B0.L) this.f1053q.get(childAt);
            if (childAt.isLayoutRequested() && l7 != null) {
                B0.L.S(l7, false, 7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
