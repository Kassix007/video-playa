package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9160s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9160s = -1;
        int[] iArr = AbstractC1066a.f12793k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC1835K.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f9158q = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f9158q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setStacked(boolean z5) {
        if (this.f9159r != z5) {
            if (!z5 || this.f9158q) {
                this.f9159r = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        int iMakeMeasureSpec;
        boolean z5;
        int i8;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f9158q) {
            if (size > this.f9160s && this.f9159r) {
                setStacked(false);
            }
            this.f9160s = size;
        }
        if (this.f9159r || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z5 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z5 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i7);
        if (this.f9158q && !this.f9159r && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z5 = true;
        }
        if (z5) {
            super.onMeasure(i, i7);
        }
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            i8 = -1;
            if (i9 >= childCount) {
                i9 = -1;
                break;
            } else if (getChildAt(i9).getVisibility() == 0) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            View childAt = getChildAt(i9);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f9159r) {
                int i10 = i9 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i10 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i10).getVisibility() == 0) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
                paddingBottom = i8 >= 0 ? getChildAt(i8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i7 == 0) {
                super.onMeasure(i, i7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAllowStacking(boolean z5) {
        if (this.f9158q != z5) {
            this.f9158q = z5;
            if (!z5 && this.f9159r) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
