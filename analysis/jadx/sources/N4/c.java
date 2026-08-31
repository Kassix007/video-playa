package n4;

import O3.D;
import a4.ViewOnLayoutChangeListenerC0633a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b4.C0699a;
import java.util.WeakHashMap;
import l.C1211n;
import l.y;
import n5.AbstractC1397A;
import q4.AbstractC1521a;
import w1.AbstractC1828D;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout implements y {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f15206W = {R.attr.state_checked};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final D f15207a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final b f15208b0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f15209A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final FrameLayout f15210B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f15211C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView f15212D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ViewGroup f15213E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final TextView f15214F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final TextView f15215G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15216H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15217I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1211n f15218J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f15219K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Drawable f15220L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Drawable f15221M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ValueAnimator f15222N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public D f15223O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f15224P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f15225Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f15226R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f15227S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f15228T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f15229U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Y3.a f15230V;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f15232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f15233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f15239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15240z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 25;
        f15207a0 = new D(i);
        f15208b0 = new b(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Context context) {
        super(context);
        this.f15231q = false;
        this.f15216H = -1;
        this.f15217I = 0;
        this.f15223O = f15207a0;
        this.f15224P = 0.0f;
        this.f15225Q = false;
        this.f15226R = 0;
        this.f15227S = 0;
        this.f15228T = false;
        this.f15229U = 0;
        int i = 1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f15210B = (FrameLayout) findViewById(com.wnapp.smspariaz.R.id.navigation_bar_item_icon_container);
        this.f15211C = findViewById(com.wnapp.smspariaz.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.wnapp.smspariaz.R.id.navigation_bar_item_icon_view);
        this.f15212D = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.wnapp.smspariaz.R.id.navigation_bar_item_labels_group);
        this.f15213E = viewGroup;
        TextView textView = (TextView) findViewById(com.wnapp.smspariaz.R.id.navigation_bar_item_small_label_view);
        this.f15214F = textView;
        TextView textView2 = (TextView) findViewById(com.wnapp.smspariaz.R.id.navigation_bar_item_large_label_view);
        this.f15215G = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f15234t = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f15235u = viewGroup.getPaddingBottom();
        this.f15236v = getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0633a(i, (C0699a) this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lb
            goto L1f
        Lb:
            int[] r2 = V3.a.f7971D
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
        L1f:
            r5 = r1
            goto L4c
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c.f(android.widget.TextView, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(View view, float f, float f7, int i) {
        view.setScaleX(f);
        view.setScaleY(f7);
        view.setVisibility(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f15210B;
        return frameLayout != null ? frameLayout : this.f15212D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i7 = 0; i7 < iIndexOfChild; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof c) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getSuggestedIconWidth() {
        Y3.a aVar = this.f15230V;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f15230V.f8224u.f8261b.f8242M.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f15212D.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(View view, int i, int i7) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i7;
        view.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f, float f7) {
        this.f15237w = f - f7;
        this.f15238x = (f7 * 1.0f) / f;
        this.f15239y = (f * 1.0f) / f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public final void b(C1211n c1211n) {
        this.f15218J = c1211n;
        setCheckable(c1211n.isCheckable());
        setChecked(c1211n.isChecked());
        setEnabled(c1211n.isEnabled());
        setIcon(c1211n.getIcon());
        setTitle(c1211n.f14382e);
        setId(c1211n.f14378a);
        if (!TextUtils.isEmpty(c1211n.f14391q)) {
            setContentDescription(c1211n.f14391q);
        }
        AbstractC1397A.C(this, !TextUtils.isEmpty(c1211n.f14392r) ? c1211n.f14392r : c1211n.f14382e);
        setVisibility(c1211n.isVisible() ? 0 : 8);
        this.f15231q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        C1211n c1211n = this.f15218J;
        if (c1211n != null) {
            setChecked(c1211n.isChecked());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        Drawable rippleDrawable = this.f15233s;
        ColorStateList colorStateList = this.f15232r;
        FrameLayout frameLayout = this.f15210B;
        RippleDrawable rippleDrawable2 = null;
        boolean z5 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f15225Q && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(AbstractC1521a.b(this.f15232r), null, activeIndicatorDrawable);
                z5 = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList2 = this.f15232r;
                int[] iArr = AbstractC1521a.f16017d;
                int iA = AbstractC1521a.a(colorStateList2, AbstractC1521a.f16016c);
                int[] iArr2 = AbstractC1521a.f16015b;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, AbstractC1521a.a(colorStateList2, iArr2), AbstractC1521a.a(colorStateList2, AbstractC1521a.f16014a)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f15210B;
        if (frameLayout != null && this.f15225Q) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(float f, float f7) {
        View view = this.f15211C;
        if (view != null) {
            D d5 = this.f15223O;
            d5.getClass();
            view.setScaleX(W3.a.a(0.4f, 1.0f, f));
            view.setScaleY(d5.n(f, f7));
            view.setAlpha(W3.a.b(0.0f, 1.0f, f7 == 0.0f ? 0.8f : 0.0f, f7 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f15224P = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f15211C;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y3.a getBadge() {
        return this.f15230V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemBackgroundResId() {
        return com.wnapp.smspariaz.R.drawable.mtrl_navigation_bar_item_background;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public C1211n getItemData() {
        return this.f15218J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemDefaultMarginResId() {
        return com.wnapp.smspariaz.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemPosition() {
        return this.f15216H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f15213E;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f15236v : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f15213E;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(View view) {
        if (this.f15230V != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                Y3.a aVar = this.f15230V;
                if (aVar != null) {
                    if (aVar.c() != null) {
                        aVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
            }
            this.f15230V = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        View view = this.f15211C;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.f15226R, i - (this.f15229U * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f15228T && this.f15240z == 2) ? iMin : this.f15227S;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1211n c1211n = this.f15218J;
        if (c1211n != null && c1211n.isCheckable() && this.f15218J.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15206W);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r8 = this;
            super.onInitializeAccessibilityNodeInfo(r9)
            Y3.a r0 = r8.f15230V
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La9
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto La9
            l.n r0 = r8.f15218J
            java.lang.CharSequence r3 = r0.f14382e
            java.lang.CharSequence r0 = r0.f14391q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1f
            l.n r0 = r8.f15218J
            java.lang.CharSequence r3 = r0.f14391q
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            Y3.a r3 = r8.f15230V
            Y3.c r4 = r3.f8224u
            boolean r5 = r3.isVisible()
            r6 = 0
            if (r5 != 0) goto L39
            goto L9f
        L39:
            Y3.b r4 = r4.f8261b
            java.lang.String r5 = r4.f8259z
            if (r5 == 0) goto L41
            r5 = r2
            goto L42
        L41:
            r5 = r1
        L42:
            if (r5 == 0) goto L50
            java.lang.CharSequence r6 = r4.f8234E
            if (r6 == 0) goto L49
            goto L9f
        L49:
            Y3.c r3 = r3.f8224u
            Y3.b r3 = r3.f8261b
            java.lang.String r6 = r3.f8259z
            goto L9f
        L50:
            boolean r5 = r3.f()
            if (r5 == 0) goto L9d
            int r5 = r4.f8236G
            if (r5 == 0) goto L9f
            java.lang.ref.WeakReference r5 = r3.f8220q
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 != 0) goto L65
            goto L9f
        L65:
            int r6 = r3.f8227x
            r7 = -2
            if (r6 == r7) goto L82
            int r6 = r3.d()
            int r7 = r3.f8227x
            if (r6 > r7) goto L73
            goto L82
        L73:
            int r3 = r4.f8237H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = r5.getString(r3, r4)
            goto L9f
        L82:
            android.content.res.Resources r5 = r5.getResources()
            int r4 = r4.f8236G
            int r6 = r3.d()
            int r3 = r3.d()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = r5.getQuantityString(r4, r6, r3)
            goto L9f
        L9d:
            java.lang.CharSequence r6 = r4.f8235F
        L9f:
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r9.setContentDescription(r0)
        La9:
            int r0 = r8.getItemVisiblePosition()
            boolean r3 = r8.isSelected()
            E0.a r0 = E0.a.a(r3, r1, r2, r0, r2)
            java.lang.Object r0 = r0.f1611a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            r9.setCollectionItemInfo(r0)
            boolean r0 = r8.isSelected()
            if (r0 == 0) goto Lce
            r9.setClickable(r1)
            x1.d r0 = x1.d.f18331e
            java.lang.Object r0 = r0.f18340a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r9.removeAction(r0)
        Lce:
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131820645(0x7f110065, float:1.927401E38)
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r9 = r9.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            r9.putCharSequence(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i7, int i8, int i9) {
        super.onSizeChanged(i, i7, i8, i9);
        post(new E1.j(i, 2, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f15211C;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorEnabled(boolean z5) {
        this.f15225Q = z5;
        d();
        View view = this.f15211C;
        if (view != null) {
            view.setVisibility(z5 ? 0 : 8);
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorHeight(int i) {
        this.f15227S = i;
        j(getWidth());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f15236v != i) {
            this.f15236v = i;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f15229U = i;
        j(getWidth());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorResizeable(boolean z5) {
        this.f15228T = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorWidth(int i) {
        this.f15226R = i;
        j(getWidth());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBadge(Y3.a aVar) {
        Y3.a aVar2 = this.f15230V;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.f15212D;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            i(imageView);
        }
        this.f15230V = aVar;
        if (imageView == null || aVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        Y3.a aVar3 = this.f15230V;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar3.setBounds(rect);
        aVar3.h(imageView, null);
        if (aVar3.c() != null) {
            aVar3.c().setForeground(aVar3);
        } else {
            imageView.getOverlay().add(aVar3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z5) {
        refreshDrawableState();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            r12 = this;
            android.widget.TextView r0 = r12.f15215G
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r1 = r12.f15214F
            int r3 = r1.getWidth()
            int r3 = r3 / r2
            float r3 = (float) r3
            r1.setPivotX(r3)
            int r3 = r1.getBaseline()
            float r3 = (float) r3
            r1.setPivotY(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L2d
            r4 = r3
            goto L2e
        L2d:
            r4 = 0
        L2e:
            boolean r5 = r12.f15225Q
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L95
            boolean r5 = r12.f15231q
            if (r5 == 0) goto L95
            java.util.WeakHashMap r5 = w1.AbstractC1835K.f18149a
            boolean r5 = r12.isAttachedToWindow()
            if (r5 != 0) goto L41
            goto L95
        L41:
            android.animation.ValueAnimator r5 = r12.f15222N
            if (r5 == 0) goto L4b
            r5.cancel()
            r5 = 0
            r12.f15222N = r5
        L4b:
            float r5 = r12.f15224P
            float[] r8 = new float[r2]
            r8[r7] = r5
            r8[r6] = r4
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r8)
            r12.f15222N = r5
            n4.a r8 = new n4.a
            r8.<init>(r12, r4)
            r5.addUpdateListener(r8)
            android.animation.ValueAnimator r4 = r12.f15222N
            android.content.Context r5 = r12.getContext()
            r8 = 2130903927(0x7f030377, float:1.7414686E38)
            L1.a r9 = W3.a.f8109b
            android.animation.TimeInterpolator r5 = C3.a.N(r5, r8, r9)
            r4.setInterpolator(r5)
            android.animation.ValueAnimator r4 = r12.f15222N
            android.content.Context r5 = r12.getContext()
            android.content.res.Resources r8 = r12.getResources()
            r9 = 2131361833(0x7f0a0029, float:1.834343E38)
            int r8 = r8.getInteger(r9)
            r9 = 2130903911(0x7f030367, float:1.7414653E38)
            int r5 = C3.a.M(r5, r9, r8)
            long r8 = (long) r5
            r4.setDuration(r8)
            android.animation.ValueAnimator r4 = r12.f15222N
            r4.start()
            goto L98
        L95:
            r12.e(r4, r4)
        L98:
            int r4 = r12.f15240z
            r5 = -1
            r8 = 17
            r9 = 49
            android.view.ViewGroup r10 = r12.f15213E
            r11 = 4
            if (r4 == r5) goto L118
            if (r4 == 0) goto Lf1
            if (r4 == r6) goto Lbf
            if (r4 == r2) goto Lac
            goto L172
        Lac:
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f15234t
            h(r2, r3, r8)
            r2 = 8
            r0.setVisibility(r2)
            r1.setVisibility(r2)
            goto L172
        Lbf:
            int r2 = r12.f15235u
            k(r10, r2)
            if (r13 == 0) goto Lde
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f15234t
            float r4 = (float) r4
            float r5 = r12.f15237w
            float r4 = r4 + r5
            int r4 = (int) r4
            h(r2, r4, r9)
            g(r0, r3, r3, r7)
            float r0 = r12.f15238x
            g(r1, r0, r0, r11)
            goto L172
        Lde:
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f15234t
            h(r2, r4, r9)
            float r2 = r12.f15239y
            g(r0, r2, r2, r11)
            g(r1, r3, r3, r7)
            goto L172
        Lf1:
            if (r13 == 0) goto L105
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f15234t
            h(r2, r3, r9)
            int r2 = r12.f15235u
            k(r10, r2)
            r0.setVisibility(r7)
            goto L114
        L105:
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f15234t
            h(r2, r3, r8)
            k(r10, r7)
            r0.setVisibility(r11)
        L114:
            r1.setVisibility(r11)
            goto L172
        L118:
            boolean r2 = r12.f15209A
            if (r2 == 0) goto L143
            if (r13 == 0) goto L130
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f15234t
            h(r2, r3, r9)
            int r2 = r12.f15235u
            k(r10, r2)
            r0.setVisibility(r7)
            goto L13f
        L130:
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f15234t
            h(r2, r3, r8)
            k(r10, r7)
            r0.setVisibility(r11)
        L13f:
            r1.setVisibility(r11)
            goto L172
        L143:
            int r2 = r12.f15235u
            k(r10, r2)
            if (r13 == 0) goto L161
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f15234t
            float r4 = (float) r4
            float r5 = r12.f15237w
            float r4 = r4 + r5
            int r4 = (int) r4
            h(r2, r4, r9)
            g(r0, r3, r3, r7)
            float r0 = r12.f15238x
            g(r1, r0, r0, r11)
            goto L172
        L161:
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f15234t
            h(r2, r4, r9)
            float r2 = r12.f15239y
            g(r0, r2, r2, r11)
            g(r1, r3, r3, r7)
        L172:
            r12.refreshDrawableState()
            r12.setSelected(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c.setChecked(boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        this.f15214F.setEnabled(z5);
        this.f15215G.setEnabled(z5);
        this.f15212D.setEnabled(z5);
        if (z5) {
            AbstractC1828D.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
        } else {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1828D.a(this, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        if (drawable == this.f15220L) {
            return;
        }
        this.f15220L = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f15221M = drawable;
            ColorStateList colorStateList = this.f15219K;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f15212D.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconSize(int i) {
        ImageView imageView = this.f15212D;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f15219K = colorStateList;
        if (this.f15218J == null || (drawable = this.f15221M) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f15221M.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPaddingBottom(int i) {
        if (this.f15235u != i) {
            this.f15235u = i;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPaddingTop(int i) {
        if (this.f15234t != i) {
            this.f15234t = i;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPosition(int i) {
        this.f15216H = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15232r = colorStateList;
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLabelVisibilityMode(int i) {
        if (this.f15240z != i) {
            this.f15240z = i;
            if (this.f15228T && i == 2) {
                this.f15223O = f15208b0;
            } else {
                this.f15223O = f15207a0;
            }
            j(getWidth());
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShifting(boolean z5) {
        if (this.f15209A != z5) {
            this.f15209A = z5;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearanceActive(int i) {
        this.f15217I = i;
        TextView textView = this.f15215G;
        f(textView, i);
        a(this.f15214F.getTextSize(), textView.getTextSize());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearanceActiveBoldEnabled(boolean z5) {
        setTextAppearanceActive(this.f15217I);
        TextView textView = this.f15215G;
        textView.setTypeface(textView.getTypeface(), z5 ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f15214F;
        f(textView, i);
        a(textView.getTextSize(), this.f15215G.getTextSize());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f15214F.setTextColor(colorStateList);
            this.f15215G.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        this.f15214F.setText(charSequence);
        this.f15215G.setText(charSequence);
        C1211n c1211n = this.f15218J;
        if (c1211n == null || TextUtils.isEmpty(c1211n.f14391q)) {
            setContentDescription(charSequence);
        }
        C1211n c1211n2 = this.f15218J;
        if (c1211n2 != null && !TextUtils.isEmpty(c1211n2.f14392r)) {
            charSequence = this.f15218J.f14392r;
        }
        AbstractC1397A.C(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f15233s = drawable;
        d();
    }
}
