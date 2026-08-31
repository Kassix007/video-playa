package androidx.appcompat.widget;

import I2.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import m.AbstractC1268M0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f9087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f9088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f9089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f9090u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f9091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9094y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new o(1, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12786a);
        boolean z5 = false;
        this.f9089t = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f9090u = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f9094y = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f9092w = true;
            this.f9091v = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f9092w ? !(this.f9089t != null || this.f9090u != null) : this.f9091v == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9089t;
        if (drawable != null && drawable.isStateful()) {
            this.f9089t.setState(getDrawableState());
        }
        Drawable drawable2 = this.f9090u;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9090u.setState(getDrawableState());
        }
        Drawable drawable3 = this.f9091v;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f9091v.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9089t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9090u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f9091v;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9087r = findViewById(R.id.action_bar);
        this.f9088s = findViewById(R.id.action_context_bar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9086q || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        boolean z6 = true;
        if (this.f9092w) {
            Drawable drawable = this.f9091v;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f9089t == null) {
                z6 = false;
            } else if (this.f9087r.getVisibility() == 0) {
                this.f9089t.setBounds(this.f9087r.getLeft(), this.f9087r.getTop(), this.f9087r.getRight(), this.f9087r.getBottom());
            } else {
                View view = this.f9088s;
                if (view == null || view.getVisibility() != 0) {
                    this.f9089t.setBounds(0, 0, 0, 0);
                } else {
                    this.f9089t.setBounds(this.f9088s.getLeft(), this.f9088s.getTop(), this.f9088s.getRight(), this.f9088s.getBottom());
                }
            }
            this.f9093x = false;
        }
        if (z6) {
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        int i8;
        if (this.f9087r == null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE && (i8 = this.f9094y) >= 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i7)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i7);
        if (this.f9087r == null) {
            return;
        }
        View.MeasureSpec.getMode(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f9089t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9089t);
        }
        this.f9089t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f9087r;
            if (view != null) {
                this.f9089t.setBounds(view.getLeft(), this.f9087r.getTop(), this.f9087r.getRight(), this.f9087r.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f9092w ? !(this.f9089t != null || this.f9090u != null) : this.f9091v == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9091v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9091v);
        }
        this.f9091v = drawable;
        boolean z5 = this.f9092w;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f9091v) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f9089t != null || this.f9090u != null) : this.f9091v == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f9090u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9090u);
        }
        this.f9090u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9093x && this.f9090u != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f9092w ? !(this.f9089t != null || this.f9090u != null) : this.f9091v == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTransitioning(boolean z5) {
        this.f9086q = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z5 = i == 0;
        Drawable drawable = this.f9089t;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f9090u;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f9091v;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9089t;
        boolean z5 = this.f9092w;
        if (drawable == drawable2 && !z5) {
            return true;
        }
        if (drawable == this.f9090u && this.f9093x) {
            return true;
        }
        return (drawable == this.f9091v && z5) || super.verifyDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC1268M0 abstractC1268M0) {
    }
}
