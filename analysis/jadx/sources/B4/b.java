package b4;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n4.e {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f10005a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f10006b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f10007c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f10008d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f10009e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ArrayList f10010f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Context context) {
        super(context);
        this.f10010f0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f10005a0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f10006b0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f10007c0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f10008d0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int i10 = i8 - i;
        int i11 = i9 - i7;
        int measuredWidth = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                if (getLayoutDirection() == 1) {
                    int i13 = i10 - measuredWidth;
                    childAt.layout(i13 - childAt.getMeasuredWidth(), 0, i13, i11);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i11);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            l.l r0 = r12.getMenu()
            int r13 = android.view.View.MeasureSpec.getSize(r13)
            java.util.ArrayList r0 = r0.l()
            int r0 = r0.size()
            int r1 = r12.getChildCount()
            java.util.ArrayList r2 = r12.f10010f0
            r2.clear()
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r3)
            int r5 = r12.getLabelVisibilityMode()
            r6 = -1
            int r7 = r12.f10007c0
            r8 = 8
            r9 = 0
            r10 = 1
            if (r5 != r6) goto L34
            r5 = 3
            if (r0 <= r5) goto La9
            goto L36
        L34:
            if (r5 != 0) goto La9
        L36:
            boolean r5 = r12.f10009e0
            if (r5 == 0) goto La9
            int r5 = r12.getSelectedItemPosition()
            android.view.View r5 = r12.getChildAt(r5)
            int r6 = r5.getVisibility()
            int r11 = r12.f10008d0
            if (r6 == r8) goto L5b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
            r5.measure(r6, r4)
            int r6 = r5.getMeasuredWidth()
            int r11 = java.lang.Math.max(r11, r6)
        L5b:
            int r5 = r5.getVisibility()
            if (r5 == r8) goto L63
            r5 = r10
            goto L64
        L63:
            r5 = r9
        L64:
            int r0 = r0 - r5
            int r5 = r12.f10006b0
            int r5 = r5 * r0
            int r5 = r13 - r5
            int r6 = java.lang.Math.min(r11, r7)
            int r5 = java.lang.Math.min(r5, r6)
            int r13 = r13 - r5
            if (r0 != 0) goto L76
            goto L77
        L76:
            r10 = r0
        L77:
            int r6 = r13 / r10
            int r7 = r12.f10005a0
            int r6 = java.lang.Math.min(r6, r7)
            int r0 = r0 * r6
            int r13 = r13 - r0
            r0 = r9
        L82:
            if (r0 >= r1) goto Ld6
            android.view.View r7 = r12.getChildAt(r0)
            int r7 = r7.getVisibility()
            if (r7 == r8) goto L9e
            int r7 = r12.getSelectedItemPosition()
            if (r0 != r7) goto L96
            r7 = r5
            goto L97
        L96:
            r7 = r6
        L97:
            if (r13 <= 0) goto L9f
            int r7 = r7 + 1
            int r13 = r13 + (-1)
            goto L9f
        L9e:
            r7 = r9
        L9f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.add(r7)
            int r0 = r0 + 1
            goto L82
        La9:
            if (r0 != 0) goto Lac
            goto Lad
        Lac:
            r10 = r0
        Lad:
            int r5 = r13 / r10
            int r5 = java.lang.Math.min(r5, r7)
            int r0 = r0 * r5
            int r13 = r13 - r0
            r0 = r9
        Lb6:
            if (r0 >= r1) goto Ld6
            android.view.View r6 = r12.getChildAt(r0)
            int r6 = r6.getVisibility()
            if (r6 == r8) goto Lcb
            if (r13 <= 0) goto Lc9
            int r6 = r5 + 1
            int r13 = r13 + (-1)
            goto Lcc
        Lc9:
            r6 = r5
            goto Lcc
        Lcb:
            r6 = r9
        Lcc:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.add(r6)
            int r0 = r0 + 1
            goto Lb6
        Ld6:
            r13 = r9
        Ld7:
            if (r9 >= r1) goto L108
            android.view.View r0 = r12.getChildAt(r9)
            int r5 = r0.getVisibility()
            if (r5 != r8) goto Le4
            goto L105
        Le4:
            java.lang.Object r5 = r2.get(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            r0.measure(r5, r4)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            int r6 = r0.getMeasuredWidth()
            r5.width = r6
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 + r13
            r13 = r0
        L105:
            int r9 = r9 + 1
            goto Ld7
        L108:
            r12.setMeasuredDimension(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.b.onMeasure(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemHorizontalTranslationEnabled(boolean z5) {
        this.f10009e0 = z5;
    }
}
