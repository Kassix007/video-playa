package com.google.android.material.appbar;

import I2.A;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.MenuC1209l;
import l4.m;
import s4.g;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f11343p0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Integer f11344k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f11345l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f11346m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ImageView.ScaleType f11347n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Boolean f11348o0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, V3.a.f7993v, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayG.hasValue(2)) {
            setNavigationIconTint(typedArrayG.getColor(2, -1));
        }
        this.f11345l0 = typedArrayG.getBoolean(4, false);
        this.f11346m0 = typedArrayG.getBoolean(3, false);
        int i = typedArrayG.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f11343p0;
            if (i < scaleTypeArr.length) {
                this.f11347n0 = scaleTypeArr[i];
            }
        }
        if (typedArrayG.hasValue(0)) {
            this.f11348o0 = Boolean.valueOf(typedArrayG.getBoolean(0, false));
        }
        typedArrayG.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0597a.A(background);
        if (colorStateListValueOf != null) {
            g gVar = new g();
            gVar.k(colorStateListValueOf);
            gVar.i(context2);
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            gVar.j(AbstractC1826B.e(this));
            setBackground(gVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ImageView.ScaleType getLogoScaleType() {
        return this.f11347n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Integer getNavigationIconTint() {
        return this.f11344k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z5 = menu instanceof MenuC1209l;
        if (z5) {
            ((MenuC1209l) menu).w();
        }
        super.m(i);
        if (z5) {
            ((MenuC1209l) menu).v();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            C3.a.Q(this, (g) background);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z5, i, i7, i8, i9);
        A a7 = m.f14579c;
        int i10 = 0;
        ImageView imageView2 = null;
        if (this.f11345l0 || this.f11346m0) {
            ArrayList arrayListE = m.e(this, getTitle());
            TextView textView = arrayListE.isEmpty() ? null : (TextView) Collections.min(arrayListE, a7);
            ArrayList arrayListE2 = m.e(this, getSubtitle());
            TextView textView2 = arrayListE2.isEmpty() ? null : (TextView) Collections.max(arrayListE2, a7);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f11345l0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f11346m0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i10++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f11348o0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f11347n0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).j(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.f11348o0;
        if (bool == null || bool.booleanValue() != z5) {
            this.f11348o0 = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f11347n0 != scaleType) {
            this.f11347n0 = scaleType;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f11344k0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f11344k0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationIconTint(int i) {
        this.f11344k0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitleCentered(boolean z5) {
        if (this.f11346m0 != z5) {
            this.f11346m0 = z5;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleCentered(boolean z5) {
        if (this.f11345l0 != z5) {
            this.f11345l0 = z5;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i7 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i7 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i7 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i7 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i7, textView.getBottom());
    }
}
