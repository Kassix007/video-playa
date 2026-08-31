package u4;

import Q2.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import l4.m;
import s4.k;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.AbstractC1862z;

/* JADX INFO: renamed from: u4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1700c extends FrameLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ViewOnTouchListenerC1699b f17204y = new ViewOnTouchListenerC1699b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f17205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f17207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f17208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f17209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f17211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f17212x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1700c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(x4.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, V3.a.f7970C);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1826B.k(this, dimensionPixelSize);
        }
        this.f17206r = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f17205q = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f17207s = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(I1.Z(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(m.i(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f17208t = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f17209u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f17210v = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f17204y);
        setFocusable(true);
        if (getBackground() == null) {
            int I6 = g.I(getBackgroundOverlayColorAlpha(), g.D(this, R.attr.colorSurface), g.D(this, R.attr.colorOnSurface));
            k kVar = this.f17205q;
            if (kVar != null) {
                int i = AbstractC1701d.f17213a;
                s4.g gVar = new s4.g(kVar);
                gVar.k(ColorStateList.valueOf(I6));
                drawable = gVar;
            } else {
                Resources resources = getResources();
                int i7 = AbstractC1701d.f17213a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(I6);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f17211w;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
            setBackground(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getActionTextColorAlpha() {
        return this.f17208t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getAnimationMode() {
        return this.f17206r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getBackgroundOverlayColorAlpha() {
        return this.f17207s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxInlineActionWidth() {
        return this.f17210v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxWidth() {
        return this.f17209u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        int i8 = this.f17209u;
        if (i8 <= 0 || getMeasuredWidth() <= i8) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAnimationMode(int i) {
        this.f17206r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f17211w != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f17211w);
            drawable.setTintMode(this.f17212x);
        }
        super.setBackgroundDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f17211w = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f17212x);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f17212x = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f17204y);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC1701d abstractC1701d) {
    }
}
