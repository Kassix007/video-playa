package l4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import m.AbstractC1335u0;

/* JADX INFO: renamed from: l4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1234d extends AbstractC1335u0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f14557F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f14558G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Rect f14559H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f14560I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f14561J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f14562K;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1234d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14558G = new Rect();
        this.f14559H = new Rect();
        this.f14560I = 119;
        this.f14561J = true;
        this.f14562K = false;
        m.a(context, attributeSet, 0, 0);
        int[] iArr = V3.a.j;
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f14560I = typedArrayObtainStyledAttributes.getInt(1, this.f14560I);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f14561J = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f14557F;
        if (drawable != null) {
            if (this.f14562K) {
                this.f14562K = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z5 = this.f14561J;
                Rect rect = this.f14558G;
                if (z5) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f14560I;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f14559H;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f7) {
        super.drawableHotspotChanged(f, f7);
        Drawable drawable = this.f14557F;
        if (drawable != null) {
            drawable.setHotspot(f, f7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14557F;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f14557F.setState(getDrawableState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public Drawable getForeground() {
        return this.f14557F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f14560I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14557F;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        this.f14562K = z5 | this.f14562K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i7, int i8, int i9) {
        super.onSizeChanged(i, i7, i8, i9);
        this.f14562K = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f14557F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f14557F);
            }
            this.f14557F = drawable;
            this.f14562K = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f14560I == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f14560I != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f14560I = i;
            if (i == 119 && this.f14557F != null) {
                this.f14557F.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14557F;
    }
}
