package androidx.appcompat.widget;

import C.C0061a;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.k;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import k.AbstractC1168a;
import l.MenuC1209l;
import l.z;
import m.C1302e;
import m.C1312j;
import m.g1;
import w1.AbstractC1835K;
import w1.O;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f9095A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f9096B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f9097C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LinearLayout f9098D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f9099E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f9100F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f9101G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f9102H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9103I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f9104J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0061a f9105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f9106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ActionMenuView f9107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1312j f9108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public O f9110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f9113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f9114z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        C0061a c0061a = new C0061a();
        c0061a.f586c = this;
        c0061a.f585b = false;
        this.f9105q = c0061a;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f9106r = context;
        } else {
            this.f9106r = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12789d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0597a.C(context, resourceId));
        this.f9101G = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f9102H = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f9109u = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f9104J = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(View view, int i, int i7) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i7);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(View view, int i, int i7, int i8, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = ((i8 - measuredHeight) / 2) + i7;
        if (z5) {
            view.layout(i - measuredWidth, i9, i, measuredHeight + i9);
        } else {
            view.layout(i, i9, i + measuredWidth, measuredHeight + i9);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(AbstractC1168a abstractC1168a) {
        View view = this.f9095A;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f9104J, (ViewGroup) this, false);
            this.f9095A = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f9095A);
        }
        View viewFindViewById = this.f9095A.findViewById(R.id.action_mode_close_button);
        this.f9096B = viewFindViewById;
        viewFindViewById.setOnClickListener(new k(2, abstractC1168a));
        MenuC1209l menuC1209lC = abstractC1168a.c();
        C1312j c1312j = this.f9108t;
        if (c1312j != null) {
            c1312j.c();
            C1302e c1302e = c1312j.f14805K;
            if (c1302e != null && c1302e.b()) {
                c1302e.i.dismiss();
            }
        }
        C1312j c1312j2 = new C1312j(getContext());
        this.f9108t = c1312j2;
        c1312j2.f14797C = true;
        c1312j2.f14798D = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC1209lC.b(this.f9108t, this.f9106r);
        C1312j c1312j3 = this.f9108t;
        z zVar = c1312j3.f14817x;
        if (zVar == null) {
            z zVar2 = (z) c1312j3.f14813t.inflate(c1312j3.f14815v, (ViewGroup) this, false);
            c1312j3.f14817x = zVar2;
            zVar2.a(c1312j3.f14812s);
            c1312j3.h(true);
        }
        z zVar3 = c1312j3.f14817x;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c1312j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f9107s = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f9107s, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.f9098D == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f9098D = linearLayout;
            this.f9099E = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f9100F = (TextView) this.f9098D.findViewById(R.id.action_bar_subtitle);
            int i = this.f9101G;
            if (i != 0) {
                this.f9099E.setTextAppearance(getContext(), i);
            }
            int i7 = this.f9102H;
            if (i7 != 0) {
                this.f9100F.setTextAppearance(getContext(), i7);
            }
        }
        this.f9099E.setText(this.f9113y);
        this.f9100F.setText(this.f9114z);
        boolean zIsEmpty = TextUtils.isEmpty(this.f9113y);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f9114z);
        this.f9100F.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f9098D.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f9098D.getParent() == null) {
            addView(this.f9098D);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        removeAllViews();
        this.f9097C = null;
        this.f9107s = null;
        this.f9108t = null;
        View view = this.f9096B;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getAnimatedVisibility() {
        return this.f9110v != null ? this.f9105q.f584a : getVisibility();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentHeight() {
        return this.f9109u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getSubtitle() {
        return this.f9114z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getTitle() {
        return this.f9113y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setVisibility(I)V */
    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            O o6 = this.f9110v;
            if (o6 != null) {
                o6.b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final O i(int i, long j) {
        O o6 = this.f9110v;
        if (o6 != null) {
            o6.b();
        }
        C0061a c0061a = this.f9105q;
        if (i != 0) {
            O oA = AbstractC1835K.a(this);
            oA.a(0.0f);
            oA.c(j);
            ((ActionBarContextView) c0061a.f586c).f9110v = oA;
            c0061a.f584a = i;
            oA.d(c0061a);
            return oA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        O oA2 = AbstractC1835K.a(this);
        oA2.a(1.0f);
        oA2.c(j);
        ((ActionBarContextView) c0061a.f586c).f9110v = oA2;
        c0061a.f584a = i;
        oA2.d(c0061a);
        return oA2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1066a.f12786a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1312j c1312j = this.f9108t;
        if (c1312j != null) {
            Configuration configuration2 = c1312j.f14811r.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i7 = configuration2.screenHeightDp;
            c1312j.f14801G = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i7 > 720) || (i > 720 && i7 > 960)) ? 5 : (i >= 500 || (i > 640 && i7 > 480) || (i > 480 && i7 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC1209l menuC1209l = c1312j.f14812s;
            if (menuC1209l != null) {
                menuC1209l.p(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1312j c1312j = this.f9108t;
        if (c1312j != null) {
            c1312j.c();
            C1302e c1302e = this.f9108t.f14805K;
            if (c1302e == null || !c1302e.b()) {
                return;
            }
            c1302e.i.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9112x = false;
        }
        if (!this.f9112x) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f9112x = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9112x = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        boolean z6 = g1.f14790a;
        boolean z7 = getLayoutDirection() == 1;
        int paddingRight = z7 ? (i8 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
        View view = this.f9095A;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9095A.getLayoutParams();
            int i10 = z7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = z7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i12 = z7 ? paddingRight - i10 : paddingRight + i10;
            int iG = g(this.f9095A, i12, paddingTop, paddingTop2, z7) + i12;
            paddingRight = z7 ? iG - i11 : iG + i11;
        }
        LinearLayout linearLayout = this.f9098D;
        if (linearLayout != null && this.f9097C == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f9098D, paddingRight, paddingTop, paddingTop2, z7);
        }
        View view2 = this.f9097C;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z7);
        }
        int paddingLeft = z7 ? getPaddingLeft() : (i8 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f9107s;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i7) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f9109u;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i7);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f9095A;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9095A.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f9107s;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f9107s, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f9098D;
        if (linearLayout != null && this.f9097C == null) {
            if (this.f9103I) {
                this.f9098D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f9098D.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f9098D.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f9097C;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                iMin = Math.min(i10, iMin);
            }
            this.f9097C.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(iMin, i11));
        }
        if (this.f9109u > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9111w = false;
        }
        if (!this.f9111w) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f9111w = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9111w = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setContentHeight(int i) {
        this.f9109u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f9097C;
        if (view2 != null) {
            removeView(view2);
        }
        this.f9097C = view;
        if (view != null && (linearLayout = this.f9098D) != null) {
            removeView(linearLayout);
            this.f9098D = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(CharSequence charSequence) {
        this.f9114z = charSequence;
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        this.f9113y = charSequence;
        d();
        AbstractC1835K.n(this, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleOptional(boolean z5) {
        if (z5 != this.f9103I) {
            requestLayout();
        }
        this.f9103I = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
