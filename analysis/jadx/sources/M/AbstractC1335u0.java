package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import g.AbstractC1066a;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: m.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1335u0 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f14884A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14885B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f14886C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14887D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14888E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f14897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f14898z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1335u0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f14889q = true;
        this.f14890r = -1;
        this.f14891s = 0;
        this.f14893u = 8388659;
        int[] iArr = AbstractC1066a.f12796n;
        B0.G0 g0N = B0.G0.N(context, attributeSet, iArr, 0);
        AbstractC1835K.l(this, context, iArr, attributeSet, (TypedArray) g0N.f235s, 0);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        int i7 = typedArray.getInt(1, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i8 = typedArray.getInt(0, -1);
        if (i8 >= 0) {
            setGravity(i8);
        }
        boolean z5 = typedArray.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.f14895w = typedArray.getFloat(4, -1.0f);
        this.f14890r = typedArray.getInt(3, -1);
        this.f14896x = typedArray.getBoolean(7, false);
        setDividerDrawable(g0N.y(5));
        this.f14887D = typedArray.getInt(8, 0);
        this.f14888E = typedArray.getDimensionPixelSize(6, 0);
        g0N.R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1333t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Canvas canvas, int i) {
        this.f14884A.setBounds(getPaddingLeft() + this.f14888E, i, (getWidth() - getPaddingRight()) - this.f14888E, this.f14886C + i);
        this.f14884A.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Canvas canvas, int i) {
        this.f14884A.setBounds(i, getPaddingTop() + this.f14888E, this.f14885B + i, (getHeight() - getPaddingBottom()) - this.f14888E);
        this.f14884A.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1333t0 generateDefaultLayoutParams() {
        int i = this.f14892t;
        if (i == 0) {
            return new C1333t0(-2, -2);
        }
        if (i == 1) {
            return new C1333t0(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1333t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1333t0(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f14890r < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i7 = this.f14890r;
        if (childCount <= i7) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i7);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14890r == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14891s;
        if (this.f14892t == 1 && (i = this.f14893u & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14894v) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14894v;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1333t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBaselineAlignedChildIndex() {
        return this.f14890r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getDividerDrawable() {
        return this.f14884A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getDividerPadding() {
        return this.f14888E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getDividerWidth() {
        return this.f14885B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getGravity() {
        return this.f14893u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOrientation() {
        return this.f14892t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getShowDividers() {
        return this.f14887D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getWeightSum() {
        return this.f14895w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1333t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1333t0 ? new C1333t0((C1333t0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1333t0((ViewGroup.MarginLayoutParams) layoutParams) : new C1333t0(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(int i) {
        if (i == 0) {
            return (this.f14887D & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f14887D & 4) != 0;
        }
        if ((this.f14887D & 2) != 0) {
            for (int i7 = i - 1; i7 >= 0; i7--) {
                if (getChildAt(i7).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f14884A == null) {
            return;
        }
        int i7 = 0;
        if (this.f14892t == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i7 < virtualChildCount) {
                View childAt = getChildAt(i7);
                if (childAt != null && childAt.getVisibility() != 8 && i(i7)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1333t0) childAt.getLayoutParams())).topMargin) - this.f14886C);
                }
                i7++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f14886C : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1333t0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z5 = g1.f14790a;
        boolean z6 = getLayoutDirection() == 1;
        while (i7 < virtualChildCount2) {
            View childAt3 = getChildAt(i7);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i7)) {
                C1333t0 c1333t0 = (C1333t0) childAt3.getLayoutParams();
                e(canvas, z6 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1333t0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1333t0).leftMargin) - this.f14885B);
            }
            i7++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1333t0 c1333t02 = (C1333t0) childAt4.getLayoutParams();
                if (z6) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1333t02).leftMargin;
                    i = this.f14885B;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1333t02).rightMargin;
                }
            } else if (z6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f14885B;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.f14892t
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 16
            r7 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 != r9) goto Lb5
            int r1 = r0.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r0.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r0.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r0.getVirtualChildCount()
            int r13 = r0.f14893u
            r14 = r13 & 112(0x70, float:1.57E-43)
            r7 = r7 & r13
            if (r14 == r6) goto L42
            if (r14 == r5) goto L36
            int r5 = r0.getPaddingTop()
            goto L4d
        L36:
            int r5 = r0.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r6 = r0.f14894v
            int r5 = r5 - r6
            goto L4d
        L42:
            int r5 = r0.getPaddingTop()
            int r6 = r27 - r25
            int r13 = r0.f14894v
            int r6 = r6 - r13
            int r6 = r6 / r8
            int r5 = r5 + r6
        L4d:
            r4 = 0
        L4e:
            if (r4 >= r12) goto L1cc
            android.view.View r6 = r0.getChildAt(r4)
            if (r6 != 0) goto L59
        L56:
            r23 = r8
            goto Lae
        L59:
            int r13 = r6.getVisibility()
            if (r13 == r3) goto L56
            int r13 = r6.getMeasuredWidth()
            int r14 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r6.getLayoutParams()
            m.t0 r15 = (m.C1333t0) r15
            r23 = r8
            int r8 = r15.gravity
            if (r8 >= 0) goto L74
            r8 = r7
        L74:
            int r3 = r0.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r8, r3)
            r3 = r3 & 7
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L86
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L97
        L86:
            int r3 = r11 - r13
            int r8 = r15.rightMargin
        L8a:
            int r3 = r3 - r8
            goto L97
        L8c:
            int r3 = r10 - r13
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r8 = r15.leftMargin
            int r3 = r3 + r8
            int r8 = r15.rightMargin
            goto L8a
        L97:
            boolean r8 = r0.i(r4)
            if (r8 == 0) goto La0
            int r8 = r0.f14886C
            int r5 = r5 + r8
        La0:
            int r8 = r15.topMargin
            int r5 = r5 + r8
            int r13 = r13 + r3
            int r8 = r5 + r14
            r6.layout(r3, r5, r13, r8)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        Lae:
            int r4 = r4 + 1
            r8 = r23
            r3 = 8
            goto L4e
        Lb5:
            r23 = r8
            boolean r1 = m.g1.f14790a
            int r1 = r0.getLayoutDirection()
            if (r1 != r9) goto Lc1
            r1 = r9
            goto Lc2
        Lc1:
            r1 = 0
        Lc2:
            int r3 = r0.getPaddingTop()
            int r8 = r27 - r25
            int r10 = r0.getPaddingBottom()
            int r10 = r8 - r10
            int r8 = r8 - r3
            int r11 = r0.getPaddingBottom()
            int r8 = r8 - r11
            int r11 = r0.getVirtualChildCount()
            int r12 = r0.f14893u
            r7 = r7 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f14889q
            int[] r14 = r0.f14897y
            int[] r15 = r0.f14898z
            int r4 = r0.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r7, r4)
            if (r4 == r9) goto L100
            if (r4 == r2) goto Lf4
            int r2 = r0.getPaddingLeft()
            goto L10c
        Lf4:
            int r2 = r0.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.f14894v
            int r2 = r2 - r4
            goto L10c
        L100:
            int r2 = r0.getPaddingLeft()
            int r4 = r26 - r24
            int r7 = r0.f14894v
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r2 = r2 + r4
        L10c:
            if (r1 == 0) goto L112
            int r1 = r11 + (-1)
            r7 = -1
            goto L114
        L112:
            r7 = r9
            r1 = 0
        L114:
            r17 = r9
            r9 = 0
        L117:
            if (r9 >= r11) goto L1cc
            int r18 = r7 * r9
            int r5 = r18 + r1
            android.view.View r6 = r0.getChildAt(r5)
            if (r6 != 0) goto L129
            r25 = r1
        L125:
            r19 = r3
            goto L1c0
        L129:
            int r4 = r6.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L1bc
            int r4 = r6.getMeasuredWidth()
            int r16 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r6.getLayoutParams()
            r1 = r19
            m.t0 r1 = (m.C1333t0) r1
            r27 = r2
            if (r13 == 0) goto L153
            int r2 = r1.height
            r19 = r3
            r3 = -1
            if (r2 == r3) goto L155
            int r3 = r6.getBaseline()
            goto L156
        L153:
            r19 = r3
        L155:
            r3 = -1
        L156:
            int r2 = r1.gravity
            if (r2 >= 0) goto L15b
            r2 = r12
        L15b:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r20 = r4
            r4 = 16
            if (r2 == r4) goto L191
            r4 = 48
            if (r2 == r4) goto L183
            r4 = 80
            if (r2 == r4) goto L16f
            r2 = r19
            r4 = -1
            goto L19e
        L16f:
            int r2 = r10 - r16
            int r4 = r1.bottomMargin
            int r2 = r2 - r4
            r4 = -1
            if (r3 == r4) goto L19e
            int r21 = r6.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = r15[r23]
            int r3 = r3 - r21
        L181:
            int r2 = r2 - r3
            goto L19e
        L183:
            r4 = -1
            int r2 = r1.topMargin
            int r2 = r19 + r2
            if (r3 == r4) goto L19e
            r21 = r14[r17]
            int r21 = r21 - r3
            int r2 = r21 + r2
            goto L19e
        L191:
            r4 = -1
            int r2 = r8 - r16
            int r2 = r2 / 2
            int r2 = r2 + r19
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r3 = r1.bottomMargin
            goto L181
        L19e:
            boolean r3 = r0.i(r5)
            if (r3 == 0) goto L1a9
            int r3 = r0.f14885B
            int r3 = r27 + r3
            goto L1ab
        L1a9:
            r3 = r27
        L1ab:
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r3 + r20
            int r4 = r2 + r16
            r6.layout(r3, r2, r5, r4)
            int r1 = r1.rightMargin
            int r4 = r20 + r1
            int r4 = r4 + r3
            r2 = r4
            goto L1c0
        L1bc:
            r27 = r2
            goto L125
        L1c0:
            int r9 = r9 + 1
            r1 = r25
            r3 = r19
            r5 = 80
            r6 = 16
            goto L117
        L1cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.AbstractC1335u0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            int r1 = r0.f14892t
            r7 = -2
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            r14 = 1
            if (r1 != r14) goto L34f
            r0.f14894v = r9
            int r15 = r0.getVirtualChildCount()
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = r0.f14890r
            boolean r4 = r0.f14896x
            r5 = r9
            r6 = r5
            r8 = r6
            r19 = r8
            r22 = r19
            r23 = r22
            r20 = r14
            r24 = r20
            r16 = 0
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r14 = r23
        L35:
            if (r5 >= r15) goto L161
            r25 = r1
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 != 0) goto L51
            int r1 = r0.f14894v
            r0.f14894v = r1
        L43:
            r29 = r2
            r7 = r3
            r28 = r4
            r13 = r5
            r12 = r25
            r2 = r39
            r4 = r40
            goto L152
        L51:
            int r12 = r1.getVisibility()
            if (r12 != r11) goto L58
            goto L43
        L58:
            boolean r12 = r0.i(r5)
            if (r12 == 0) goto L65
            int r12 = r0.f14894v
            int r11 = r0.f14886C
            int r12 = r12 + r11
            r0.f14894v = r12
        L65:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            m.t0 r11 = (m.C1333t0) r11
            float r12 = r11.weight
            float r16 = r16 + r12
            if (r2 != r10) goto L98
            int r10 = r11.height
            if (r10 != 0) goto L98
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto L98
            int r10 = r0.f14894v
            int r12 = r11.topMargin
            int r12 = r12 + r10
            int r13 = r11.bottomMargin
            int r12 = r12 + r13
            int r10 = java.lang.Math.max(r10, r12)
            r0.f14894v = r10
            r30 = r1
            r29 = r2
            r7 = r3
            r28 = r4
            r13 = r5
            r19 = r20
            r12 = r25
            r2 = r39
            r4 = r40
            goto Le6
        L98:
            int r10 = r11.height
            if (r10 != 0) goto La4
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto La4
            r11.height = r7
            r10 = 0
            goto La6
        La4:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        La6:
            int r12 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r12 != 0) goto Lb1
            int r12 = r0.f14894v
            r13 = r12
            r12 = r5
            r5 = r13
        Laf:
            r13 = r3
            goto Lb4
        Lb1:
            r12 = r5
            r5 = 0
            goto Laf
        Lb4:
            r3 = 0
            r29 = r2
            r28 = r4
            r7 = r13
            r2 = r39
            r4 = r40
            r13 = r12
            r12 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto Lca
            r11.height = r10
        Lca:
            int r3 = r1.getMeasuredHeight()
            int r5 = r0.f14894v
            int r10 = r5 + r3
            r30 = r1
            int r1 = r11.topMargin
            int r10 = r10 + r1
            int r1 = r11.bottomMargin
            int r10 = r10 + r1
            int r1 = java.lang.Math.max(r5, r10)
            r0.f14894v = r1
            if (r28 == 0) goto Le6
            int r14 = java.lang.Math.max(r3, r14)
        Le6:
            if (r7 < 0) goto Lf0
            int r5 = r13 + 1
            if (r7 != r5) goto Lf0
            int r1 = r0.f14894v
            r0.f14891s = r1
        Lf0:
            if (r13 >= r7) goto Lf8
            float r1 = r11.weight
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 > 0) goto Lfb
        Lf8:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L103
        Lfb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r1.<init>(r2)
            throw r1
        L103:
            if (r12 == r1) goto L10f
            int r1 = r11.width
            r3 = -1
            if (r1 != r3) goto L10f
            r1 = r20
            r23 = r1
            goto L110
        L10f:
            r1 = 0
        L110:
            int r3 = r11.leftMargin
            int r5 = r11.rightMargin
            int r3 = r3 + r5
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 + r3
            int r9 = java.lang.Math.max(r9, r5)
            int r10 = r30.getMeasuredState()
            r30 = r1
            r1 = r22
            int r1 = android.view.View.combineMeasuredStates(r1, r10)
            if (r24 == 0) goto L136
            int r10 = r11.width
            r22 = r1
            r1 = -1
            if (r10 != r1) goto L138
            r1 = r20
            goto L139
        L136:
            r22 = r1
        L138:
            r1 = 0
        L139:
            float r10 = r11.weight
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 <= 0) goto L148
            if (r30 == 0) goto L142
            goto L143
        L142:
            r3 = r5
        L143:
            int r8 = java.lang.Math.max(r8, r3)
            goto L150
        L148:
            if (r30 == 0) goto L14b
            goto L14c
        L14b:
            r3 = r5
        L14c:
            int r6 = java.lang.Math.max(r6, r3)
        L150:
            r24 = r1
        L152:
            int r5 = r13 + 1
            r3 = r7
            r1 = r12
            r4 = r28
            r2 = r29
            r7 = -2
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            goto L35
        L161:
            r12 = r1
            r29 = r2
            r28 = r4
            r1 = r22
            r2 = r39
            r4 = r40
            int r3 = r0.f14894v
            if (r3 <= 0) goto L17d
            boolean r3 = r0.i(r15)
            if (r3 == 0) goto L17d
            int r3 = r0.f14894v
            int r5 = r0.f14886C
            int r3 = r3 + r5
            r0.f14894v = r3
        L17d:
            r3 = r29
            if (r28 == 0) goto L1ba
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L187
            if (r3 != 0) goto L1ba
        L187:
            r5 = 0
            r0.f14894v = r5
            r5 = 0
        L18b:
            if (r5 >= r15) goto L1ba
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L198
            int r7 = r0.f14894v
            r0.f14894v = r7
            goto L1b7
        L198:
            int r10 = r7.getVisibility()
            r11 = 8
            if (r10 != r11) goto L1a1
            goto L1b7
        L1a1:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            m.t0 r7 = (m.C1333t0) r7
            int r10 = r0.f14894v
            int r11 = r10 + r14
            int r13 = r7.topMargin
            int r11 = r11 + r13
            int r7 = r7.bottomMargin
            int r11 = r11 + r7
            int r7 = java.lang.Math.max(r10, r11)
            r0.f14894v = r7
        L1b7:
            int r5 = r5 + 1
            goto L18b
        L1ba:
            int r5 = r0.f14894v
            int r7 = r0.getPaddingTop()
            int r10 = r0.getPaddingBottom()
            int r10 = r10 + r7
            int r10 = r10 + r5
            r0.f14894v = r10
            int r5 = r0.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r10, r5)
            r7 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r4, r7)
            r7 = r5 & r17
            int r10 = r0.f14894v
            int r7 = r7 - r10
            if (r19 != 0) goto L21f
            if (r7 == 0) goto L1e3
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 <= 0) goto L1e3
            goto L21f
        L1e3:
            int r6 = java.lang.Math.max(r6, r8)
            if (r28 == 0) goto L2f3
            r7 = 1073741824(0x40000000, float:2.0)
            if (r3 == r7) goto L2f3
            r3 = 0
        L1ee:
            if (r3 >= r15) goto L2f3
            android.view.View r7 = r0.getChildAt(r3)
            if (r7 == 0) goto L21c
            int r8 = r7.getVisibility()
            r11 = 8
            if (r8 != r11) goto L1ff
            goto L21c
        L1ff:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            m.t0 r8 = (m.C1333t0) r8
            float r8 = r8.weight
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L21c
            int r8 = r7.getMeasuredWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r10)
            r7.measure(r8, r11)
        L21c:
            int r3 = r3 + 1
            goto L1ee
        L21f:
            float r8 = r0.f14895w
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L227
            r16 = r8
        L227:
            r8 = 0
            r0.f14894v = r8
            r8 = r1
            r1 = 0
        L22c:
            if (r1 >= r15) goto L2e4
            android.view.View r10 = r0.getChildAt(r1)
            int r11 = r10.getVisibility()
            r13 = 8
            if (r11 != r13) goto L23e
            r17 = r1
            goto L2e0
        L23e:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            m.t0 r11 = (m.C1333t0) r11
            float r13 = r11.weight
            int r14 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r14 <= 0) goto L29e
            float r14 = (float) r7
            float r14 = r14 * r13
            float r14 = r14 / r16
            int r14 = (int) r14
            float r16 = r16 - r13
            int r7 = r7 - r14
            int r13 = r0.getPaddingLeft()
            int r17 = r0.getPaddingRight()
            int r17 = r17 + r13
            int r13 = r11.leftMargin
            int r17 = r17 + r13
            int r13 = r11.rightMargin
            int r13 = r17 + r13
            r17 = r1
            int r1 = r11.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r13, r1)
            int r13 = r11.height
            if (r13 != 0) goto L281
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 == r13) goto L275
            goto L283
        L275:
            if (r14 <= 0) goto L278
            goto L279
        L278:
            r14 = 0
        L279:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r10.measure(r1, r14)
            goto L293
        L281:
            r13 = 1073741824(0x40000000, float:2.0)
        L283:
            int r19 = r10.getMeasuredHeight()
            int r14 = r19 + r14
            if (r14 >= 0) goto L28c
            r14 = 0
        L28c:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r10.measure(r1, r14)
        L293:
            int r1 = r10.getMeasuredState()
            r1 = r1 & (-256(0xffffffffffffff00, float:NaN))
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            goto L2a0
        L29e:
            r17 = r1
        L2a0:
            int r1 = r11.leftMargin
            int r13 = r11.rightMargin
            int r1 = r1 + r13
            int r13 = r10.getMeasuredWidth()
            int r13 = r13 + r1
            int r9 = java.lang.Math.max(r9, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r12 == r14) goto L2bc
            int r14 = r11.width
            r19 = r1
            r1 = -1
            if (r14 != r1) goto L2bd
            r13 = r19
            goto L2bd
        L2bc:
            r1 = -1
        L2bd:
            int r6 = java.lang.Math.max(r6, r13)
            if (r24 == 0) goto L2ca
            int r13 = r11.width
            if (r13 != r1) goto L2ca
            r1 = r20
            goto L2cb
        L2ca:
            r1 = 0
        L2cb:
            int r13 = r0.f14894v
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r13
            int r14 = r11.topMargin
            int r10 = r10 + r14
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            int r10 = java.lang.Math.max(r13, r10)
            r0.f14894v = r10
            r24 = r1
        L2e0:
            int r1 = r17 + 1
            goto L22c
        L2e4:
            int r1 = r0.f14894v
            int r3 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r7 = r7 + r3
            int r7 = r7 + r1
            r0.f14894v = r7
            r1 = r8
        L2f3:
            if (r24 != 0) goto L2fa
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 == r13) goto L2fa
            goto L2fb
        L2fa:
            r6 = r9
        L2fb:
            int r3 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r3
            int r7 = r7 + r6
            int r3 = r0.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r7, r3)
            int r1 = android.view.View.resolveSizeAndState(r3, r2, r1)
            r0.setMeasuredDimension(r1, r5)
            if (r23 == 0) goto L865
            int r1 = r0.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = 0
        L321:
            if (r9 >= r15) goto L865
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L34a
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r6 = r3
            m.t0 r6 = (m.C1333t0) r6
            int r3 = r6.width
            r5 = -1
            if (r3 != r5) goto L34a
            int r7 = r6.height
            int r3 = r1.getMeasuredHeight()
            r6.height = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r6.height = r7
        L34a:
            int r9 = r9 + 1
            r4 = r40
            goto L321
        L34f:
            r2 = r39
            r5 = r9
            r20 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r0.f14894v = r5
            int r6 = r0.getVirtualChildCount()
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.f14897y
            r9 = 4
            if (r1 == 0) goto L370
            int[] r1 = r0.f14898z
            if (r1 != 0) goto L378
        L370:
            int[] r1 = new int[r9]
            r0.f14897y = r1
            int[] r1 = new int[r9]
            r0.f14898z = r1
        L378:
            int[] r10 = r0.f14897y
            int[] r11 = r0.f14898z
            r12 = 3
            r26 = -1
            r10[r12] = r26
            r13 = 2
            r10[r13] = r26
            r10[r20] = r26
            r21 = 0
            r10[r21] = r26
            r11[r12] = r26
            r11[r13] = r26
            r11[r20] = r26
            r11[r21] = r26
            boolean r14 = r0.f14889q
            boolean r15 = r0.f14896x
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L39d
            r16 = r20
            goto L39f
        L39d:
            r16 = 0
        L39f:
            r23 = r9
            r24 = r12
            r28 = r18
            r29 = r20
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r12 = 0
            r19 = 0
            r22 = 0
        L3b1:
            if (r1 >= r6) goto L567
            r30 = r13
            android.view.View r13 = r0.getChildAt(r1)
            if (r13 != 0) goto L3ce
            int r13 = r0.f14894v
            r0.f14894v = r13
            r33 = r1
            r1 = r4
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r4 = r40
            goto L557
        L3ce:
            int r2 = r13.getVisibility()
            r31 = r3
            r3 = 8
            if (r2 != r3) goto L3eb
            r2 = r39
            r33 = r1
            r1 = r4
            r32 = r11
            r34 = r14
            r35 = r15
            r3 = r31
            r4 = r40
            r31 = r10
            goto L557
        L3eb:
            boolean r2 = r0.i(r1)
            if (r2 == 0) goto L3f8
            int r2 = r0.f14894v
            int r3 = r0.f14885B
            int r2 = r2 + r3
            r0.f14894v = r2
        L3f8:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            m.t0 r2 = (m.C1333t0) r2
            float r3 = r2.weight
            float r28 = r28 + r3
            r32 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L46d
            int r1 = r2.width
            if (r1 != 0) goto L46d
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L46d
            if (r16 == 0) goto L420
            int r1 = r0.f14894v
            int r3 = r2.leftMargin
            r33 = r1
            int r1 = r2.rightMargin
            int r3 = r3 + r1
            int r3 = r3 + r33
            r0.f14894v = r3
            goto L431
        L420:
            int r1 = r0.f14894v
            int r3 = r2.leftMargin
            int r3 = r3 + r1
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r1 = java.lang.Math.max(r1, r3)
            r0.f14894v = r1
        L431:
            if (r14 == 0) goto L452
            r1 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r13.measure(r3, r3)
            r36 = r13
            r34 = r14
            r35 = r15
            r13 = r31
            r33 = r32
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L4d5
        L452:
            r36 = r13
            r34 = r14
            r35 = r15
            r22 = r20
            r13 = r31
            r33 = r32
            r1 = 1073741824(0x40000000, float:2.0)
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L4d7
        L46d:
            int r1 = r2.width
            if (r1 != 0) goto L47a
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L47a
            r1 = -2
            r2.width = r1
            r1 = 0
            goto L47c
        L47a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L47c:
            int r3 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r3 != 0) goto L485
            int r3 = r0.f14894v
        L482:
            r33 = r5
            goto L487
        L485:
            r3 = 0
            goto L482
        L487:
            r5 = 0
            r34 = r32
            r32 = r11
            r11 = r33
            r33 = r34
            r34 = r14
            r35 = r15
            r15 = r1
            r14 = r2
            r1 = r13
            r13 = r31
            r2 = r39
            r31 = r10
            r10 = r4
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r3) goto L4a9
            r14.width = r15
        L4a9:
            int r3 = r1.getMeasuredWidth()
            if (r16 == 0) goto L4bd
            int r5 = r0.f14894v
            int r15 = r14.leftMargin
            int r15 = r15 + r3
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r15 = r15 + r5
            r0.f14894v = r15
            goto L4cf
        L4bd:
            r36 = r1
            int r1 = r0.f14894v
            int r5 = r1 + r3
            int r15 = r14.leftMargin
            int r5 = r5 + r15
            int r15 = r14.rightMargin
            int r5 = r5 + r15
            int r1 = java.lang.Math.max(r1, r5)
            r0.f14894v = r1
        L4cf:
            if (r35 == 0) goto L4d5
            int r9 = java.lang.Math.max(r3, r9)
        L4d5:
            r1 = 1073741824(0x40000000, float:2.0)
        L4d7:
            if (r8 == r1) goto L4e3
            int r1 = r14.height
            r3 = -1
            if (r1 != r3) goto L4e3
            r1 = r20
            r19 = r1
            goto L4e4
        L4e3:
            r1 = 0
        L4e4:
            int r3 = r14.topMargin
            int r5 = r14.bottomMargin
            int r3 = r3 + r5
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r3
            int r15 = r36.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r15)
            if (r34 == 0) goto L526
            int r15 = r36.getBaseline()
            r36 = r1
            r1 = -1
            if (r15 == r1) goto L528
            int r1 = r14.gravity
            if (r1 >= 0) goto L507
            int r1 = r0.f14893u
        L507:
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r1 = r1 >> 4
            r25 = -2
            r1 = r1 & (-2)
            int r1 = r1 >> 1
            r37 = r1
            r1 = r31[r37]
            int r1 = java.lang.Math.max(r1, r15)
            r31[r37] = r1
            r1 = r32[r37]
            int r15 = r5 - r15
            int r1 = java.lang.Math.max(r1, r15)
            r32[r37] = r1
            goto L528
        L526:
            r36 = r1
        L528:
            int r1 = java.lang.Math.max(r13, r5)
            if (r29 == 0) goto L536
            int r13 = r14.height
            r15 = -1
            if (r13 != r15) goto L536
            r13 = r20
            goto L537
        L536:
            r13 = 0
        L537:
            float r14 = r14.weight
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 <= 0) goto L547
            if (r36 == 0) goto L540
            goto L541
        L540:
            r3 = r5
        L541:
            int r5 = java.lang.Math.max(r11, r3)
            r3 = r10
            goto L550
        L547:
            if (r36 == 0) goto L54a
            goto L54b
        L54a:
            r3 = r5
        L54b:
            int r3 = java.lang.Math.max(r10, r3)
            r5 = r11
        L550:
            r29 = r3
            r3 = r1
            r1 = r29
            r29 = r13
        L557:
            int r10 = r33 + 1
            r4 = r1
            r1 = r10
            r13 = r30
            r10 = r31
            r11 = r32
            r14 = r34
            r15 = r35
            goto L3b1
        L567:
            r31 = r10
            r32 = r11
            r30 = r13
            r34 = r14
            r35 = r15
            r13 = r3
            r10 = r4
            r11 = r5
            r4 = r40
            int r1 = r0.f14894v
            if (r1 <= 0) goto L587
            boolean r1 = r0.i(r6)
            if (r1 == 0) goto L587
            int r1 = r0.f14894v
            int r3 = r0.f14885B
            int r1 = r1 + r3
            r0.f14894v = r1
        L587:
            r1 = r31[r20]
            r3 = -1
            if (r1 != r3) goto L59d
            r21 = 0
            r5 = r31[r21]
            if (r5 != r3) goto L59d
            r5 = r31[r30]
            if (r5 != r3) goto L59d
            r5 = r31[r24]
            if (r5 == r3) goto L59b
            goto L59d
        L59b:
            r3 = r13
            goto L5ca
        L59d:
            r3 = r31[r24]
            r21 = 0
            r5 = r31[r21]
            r14 = r31[r30]
            int r1 = java.lang.Math.max(r1, r14)
            int r1 = java.lang.Math.max(r5, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r32[r24]
            r5 = r32[r21]
            r14 = r32[r20]
            r15 = r32[r30]
            int r14 = java.lang.Math.max(r14, r15)
            int r5 = java.lang.Math.max(r5, r14)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = r3 + r1
            int r3 = java.lang.Math.max(r13, r3)
        L5ca:
            if (r35 == 0) goto L613
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r5) goto L5d2
            if (r7 != 0) goto L613
        L5d2:
            r5 = 0
            r0.f14894v = r5
            r1 = 0
        L5d6:
            if (r1 >= r6) goto L613
            android.view.View r5 = r0.getChildAt(r1)
            if (r5 != 0) goto L5e3
            int r5 = r0.f14894v
            r0.f14894v = r5
            goto L610
        L5e3:
            int r13 = r5.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5ec
            goto L610
        L5ec:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            m.t0 r5 = (m.C1333t0) r5
            if (r16 == 0) goto L600
            int r13 = r0.f14894v
            int r14 = r5.leftMargin
            int r14 = r14 + r9
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r14 = r14 + r13
            r0.f14894v = r14
            goto L610
        L600:
            int r13 = r0.f14894v
            int r14 = r13 + r9
            int r15 = r5.leftMargin
            int r14 = r14 + r15
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r13, r14)
            r0.f14894v = r5
        L610:
            int r1 = r1 + 1
            goto L5d6
        L613:
            int r1 = r0.f14894v
            int r5 = r0.getPaddingLeft()
            int r13 = r0.getPaddingRight()
            int r13 = r13 + r5
            int r13 = r13 + r1
            r0.f14894v = r13
            int r1 = r0.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r13, r1)
            r5 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r5)
            r5 = r1 & r17
            int r13 = r0.f14894v
            int r5 = r5 - r13
            if (r22 != 0) goto L680
            if (r5 == 0) goto L63c
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r14 <= 0) goto L63c
            goto L680
        L63c:
            int r5 = java.lang.Math.max(r10, r11)
            if (r35 == 0) goto L678
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L678
            r7 = 0
        L647:
            if (r7 >= r6) goto L678
            android.view.View r10 = r0.getChildAt(r7)
            if (r10 == 0) goto L675
            int r11 = r10.getVisibility()
            r14 = 8
            if (r11 != r14) goto L658
            goto L675
        L658:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            m.t0 r11 = (m.C1333t0) r11
            float r11 = r11.weight
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L675
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            int r15 = r10.getMeasuredHeight()
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r10.measure(r11, r15)
        L675:
            int r7 = r7 + 1
            goto L647
        L678:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            goto L7ff
        L680:
            float r3 = r0.f14895w
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto L688
            r28 = r3
        L688:
            r26 = -1
            r31[r24] = r26
            r31[r30] = r26
            r31[r20] = r26
            r3 = 0
            r31[r3] = r26
            r32[r24] = r26
            r32[r30] = r26
            r32[r20] = r26
            r32[r3] = r26
            r0.f14894v = r3
            r3 = -1
            r9 = 0
        L69f:
            if (r9 >= r6) goto L7a7
            android.view.View r11 = r0.getChildAt(r9)
            if (r11 == 0) goto L6af
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L6b7
        L6af:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = -2
            goto L7a1
        L6b7:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            m.t0 r14 = (m.C1333t0) r14
            float r15 = r14.weight
            int r17 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r17 <= 0) goto L719
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float r13 = (float) r5
            float r13 = r13 * r15
            float r13 = r13 / r28
            int r13 = (int) r13
            float r28 = r28 - r15
            int r5 = r5 - r13
            int r15 = r0.getPaddingTop()
            int r22 = r0.getPaddingBottom()
            int r22 = r22 + r15
            int r15 = r14.topMargin
            int r22 = r22 + r15
            int r15 = r14.bottomMargin
            int r15 = r22 + r15
            r22 = r1
            int r1 = r14.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r14.width
            if (r15 != 0) goto L6fc
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L6f0
            goto L6fe
        L6f0:
            if (r13 <= 0) goto L6f3
            goto L6f4
        L6f3:
            r13 = 0
        L6f4:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
            goto L70e
        L6fc:
            r15 = 1073741824(0x40000000, float:2.0)
        L6fe:
            int r27 = r11.getMeasuredWidth()
            int r13 = r27 + r13
            if (r13 >= 0) goto L707
            r13 = 0
        L707:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
        L70e:
            int r1 = r11.getMeasuredState()
            r1 = r1 & r17
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            goto L71d
        L719:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L71d:
            if (r16 == 0) goto L731
            int r1 = r0.f14894v
            int r13 = r11.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r13 = r13 + r1
            r0.f14894v = r13
        L72e:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L745
        L731:
            int r1 = r0.f14894v
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r1
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r1 = java.lang.Math.max(r1, r13)
            r0.f14894v = r1
            goto L72e
        L745:
            if (r8 == r1) goto L74f
            int r1 = r14.height
            r15 = -1
            if (r1 != r15) goto L74f
            r1 = r20
            goto L750
        L74f:
            r1 = 0
        L750:
            int r13 = r14.topMargin
            int r15 = r14.bottomMargin
            int r13 = r13 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            if (r1 == 0) goto L761
            goto L762
        L761:
            r13 = r15
        L762:
            int r1 = java.lang.Math.max(r10, r13)
            if (r29 == 0) goto L770
            int r10 = r14.height
            r13 = -1
            if (r10 != r13) goto L771
            r10 = r20
            goto L772
        L770:
            r13 = -1
        L771:
            r10 = 0
        L772:
            if (r34 == 0) goto L79c
            int r11 = r11.getBaseline()
            if (r11 == r13) goto L79c
            int r13 = r14.gravity
            if (r13 >= 0) goto L780
            int r13 = r0.f14893u
        L780:
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> 4
            r25 = -2
            r13 = r13 & (-2)
            int r13 = r13 >> 1
            r14 = r31[r13]
            int r14 = java.lang.Math.max(r14, r11)
            r31[r13] = r14
            r14 = r32[r13]
            int r15 = r15 - r11
            int r11 = java.lang.Math.max(r14, r15)
            r32[r13] = r11
            goto L79e
        L79c:
            r25 = -2
        L79e:
            r29 = r10
            r10 = r1
        L7a1:
            int r9 = r9 + 1
            r1 = r22
            goto L69f
        L7a7:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r0.f14894v
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.f14894v = r7
            r1 = r31[r20]
            r15 = -1
            if (r1 != r15) goto L7d0
            r21 = 0
            r5 = r31[r21]
            if (r5 != r15) goto L7d0
            r5 = r31[r30]
            if (r5 != r15) goto L7d0
            r5 = r31[r24]
            if (r5 == r15) goto L7cd
            goto L7d0
        L7cd:
            r21 = 0
            goto L7fe
        L7d0:
            r5 = r31[r24]
            r21 = 0
            r7 = r31[r21]
            r9 = r31[r30]
            int r1 = java.lang.Math.max(r1, r9)
            int r1 = java.lang.Math.max(r7, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r32[r24]
            r7 = r32[r21]
            r9 = r32[r20]
            r11 = r32[r30]
            int r9 = java.lang.Math.max(r9, r11)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r3, r5)
            r3 = r1
        L7fe:
            r5 = r10
        L7ff:
            if (r29 != 0) goto L806
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == r1) goto L806
            r3 = r5
        L806:
            int r1 = r0.getPaddingTop()
            int r5 = r0.getPaddingBottom()
            int r5 = r5 + r1
            int r5 = r5 + r3
            int r1 = r0.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r5, r1)
            r3 = r12 & r17
            r3 = r22 | r3
            int r5 = r12 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r5)
            r0.setMeasuredDimension(r3, r1)
            if (r19 == 0) goto L865
            int r1 = r0.getMeasuredHeight()
            r13 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = r21
        L833:
            if (r9 >= r6) goto L865
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L85d
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r7 = r3
            m.t0 r7 = (m.C1333t0) r7
            int r3 = r7.height
            r15 = -1
            if (r3 != r15) goto L85e
            int r8 = r7.width
            int r3 = r1.getMeasuredWidth()
            r7.width = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r7.width = r8
            goto L85e
        L85d:
            r15 = -1
        L85e:
            int r9 = r9 + 1
            r0 = r38
            r2 = r39
            goto L833
        L865:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.AbstractC1335u0.onMeasure(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBaselineAligned(boolean z5) {
        this.f14889q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f14890r = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14884A) {
            return;
        }
        this.f14884A = drawable;
        if (drawable != null) {
            this.f14885B = drawable.getIntrinsicWidth();
            this.f14886C = drawable.getIntrinsicHeight();
        } else {
            this.f14885B = 0;
            this.f14886C = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDividerPadding(int i) {
        this.f14888E = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGravity(int i) {
        if (this.f14893u != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f14893u = i;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalGravity(int i) {
        int i7 = i & 8388615;
        int i8 = this.f14893u;
        if ((8388615 & i8) != i7) {
            this.f14893u = i7 | ((-8388616) & i8);
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.f14896x = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOrientation(int i) {
        if (this.f14892t != i) {
            this.f14892t = i;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowDividers(int i) {
        if (i != this.f14887D) {
            requestLayout();
        }
        this.f14887D = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVerticalGravity(int i) {
        int i7 = i & 112;
        int i8 = this.f14893u;
        if ((i8 & 112) != i7) {
            this.f14893u = i7 | (i8 & (-113));
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setWeightSum(float f) {
        this.f14895w = Math.max(0.0f, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
