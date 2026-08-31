package n4;

import I2.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import b4.C0699a;
import java.util.HashSet;
import java.util.WeakHashMap;
import k1.AbstractC1175c;
import l.C1211n;
import l.MenuC1209l;
import l.z;
import l4.C1241k;
import q2.C1496a;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ViewGroup implements z {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f15243V = {R.attr.state_checked};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f15244W = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f15245A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ColorStateList f15246B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15247C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15248D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f15249E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f15250F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f15251G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15252H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseArray f15253I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15254J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15255K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15256L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f15257M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f15258N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f15259O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f15260P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public s4.k f15261Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f15262R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ColorStateList f15263S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public g f15264T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public MenuC1209l f15265U;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1496a f15266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.material.datepicker.k f15267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v1.c f15268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseArray f15269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c[] f15271v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15273x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f15274y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15275z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Context context) {
        super(context);
        this.f15268s = new v1.c(5);
        this.f15269t = new SparseArray(5);
        this.f15272w = 0;
        this.f15273x = 0;
        this.f15253I = new SparseArray(5);
        this.f15254J = -1;
        this.f15255K = -1;
        this.f15256L = -1;
        this.f15262R = false;
        this.f15246B = c();
        if (isInEditMode()) {
            this.f15266q = null;
        } else {
            C1496a c1496a = new C1496a();
            this.f15266q = c1496a;
            c1496a.L(0);
            c1496a.A(C3.a.M(getContext(), com.wnapp.smspariaz.R.attr.motionDurationMedium4, getResources().getInteger(com.wnapp.smspariaz.R.integer.material_motion_duration_long_1)));
            c1496a.C(C3.a.N(getContext(), com.wnapp.smspariaz.R.attr.motionEasingStandard, W3.a.f8109b));
            c1496a.I(new C1241k());
        }
        this.f15267r = new com.google.android.material.datepicker.k(4, (b4.b) this);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setImportantForAccessibility(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private c getNewItem() {
        c cVar = (c) this.f15268s.a();
        return cVar == null ? new C0699a(getContext()) : cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setBadgeIfNeeded(c cVar) {
        Y3.a aVar;
        int id = cVar.getId();
        if (id == -1 || (aVar = (Y3.a) this.f15253I.get(id)) == null) {
            return;
        }
        cVar.setBadge(aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.z
    public final void a(MenuC1209l menuC1209l) {
        this.f15265U = menuC1209l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        removeAllViews();
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    this.f15268s.c(cVar);
                    cVar.i(cVar.f15212D);
                    cVar.f15218J = null;
                    cVar.f15224P = 0.0f;
                    cVar.f15231q = false;
                }
            }
        }
        if (this.f15265U.f.size() == 0) {
            this.f15272w = 0;
            this.f15273x = 0;
            this.f15271v = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f15265U.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.f15265U.getItem(i).getItemId()));
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f15253I;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i7);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i7++;
        }
        this.f15271v = new c[this.f15265U.f.size()];
        int i8 = this.f15270u;
        boolean z5 = i8 != -1 ? i8 == 0 : this.f15265U.l().size() > 3;
        for (int i9 = 0; i9 < this.f15265U.f.size(); i9++) {
            this.f15264T.f15279r = true;
            this.f15265U.getItem(i9).setCheckable(true);
            this.f15264T.f15279r = false;
            c newItem = getNewItem();
            this.f15271v[i9] = newItem;
            newItem.setIconTintList(this.f15274y);
            newItem.setIconSize(this.f15275z);
            newItem.setTextColor(this.f15246B);
            newItem.setTextAppearanceInactive(this.f15247C);
            newItem.setTextAppearanceActive(this.f15248D);
            newItem.setTextAppearanceActiveBoldEnabled(this.f15249E);
            newItem.setTextColor(this.f15245A);
            int i10 = this.f15254J;
            if (i10 != -1) {
                newItem.setItemPaddingTop(i10);
            }
            int i11 = this.f15255K;
            if (i11 != -1) {
                newItem.setItemPaddingBottom(i11);
            }
            int i12 = this.f15256L;
            if (i12 != -1) {
                newItem.setActiveIndicatorLabelPadding(i12);
            }
            newItem.setActiveIndicatorWidth(this.f15258N);
            newItem.setActiveIndicatorHeight(this.f15259O);
            newItem.setActiveIndicatorMarginHorizontal(this.f15260P);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f15262R);
            newItem.setActiveIndicatorEnabled(this.f15257M);
            Drawable drawable = this.f15250F;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f15252H);
            }
            newItem.setItemRippleColor(this.f15251G);
            newItem.setShifting(z5);
            newItem.setLabelVisibilityMode(this.f15270u);
            C1211n c1211n = (C1211n) this.f15265U.getItem(i9);
            newItem.b(c1211n);
            newItem.setItemPosition(i9);
            int i13 = c1211n.f14378a;
            newItem.setOnTouchListener((View.OnTouchListener) this.f15269t.get(i13));
            newItem.setOnClickListener(this.f15267r);
            int i14 = this.f15272w;
            if (i14 != 0 && i13 == i14) {
                this.f15273x = i9;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f15265U.f.size() - 1, this.f15273x);
        this.f15273x = iMin;
        this.f15265U.getItem(iMin).setChecked(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = AbstractC1175c.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.wnapp.smspariaz.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f15243V;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f15244W;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s4.g d() {
        if (this.f15261Q == null || this.f15263S == null) {
            return null;
        }
        s4.g gVar = new s4.g(this.f15261Q);
        gVar.k(this.f15263S);
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getActiveIndicatorLabelPadding() {
        return this.f15256L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SparseArray<Y3.a> getBadgeDrawables() {
        return this.f15253I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getIconTintList() {
        return this.f15274y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f15263S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getItemActiveIndicatorEnabled() {
        return this.f15257M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemActiveIndicatorHeight() {
        return this.f15259O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f15260P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s4.k getItemActiveIndicatorShapeAppearance() {
        return this.f15261Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemActiveIndicatorWidth() {
        return this.f15258N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getItemBackground() {
        c[] cVarArr = this.f15271v;
        return (cVarArr == null || cVarArr.length <= 0) ? this.f15250F : cVarArr[0].getBackground();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public int getItemBackgroundRes() {
        return this.f15252H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemIconSize() {
        return this.f15275z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemPaddingBottom() {
        return this.f15255K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemPaddingTop() {
        return this.f15254J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemRippleColor() {
        return this.f15251G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemTextAppearanceActive() {
        return this.f15248D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemTextAppearanceInactive() {
        return this.f15247C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getItemTextColor() {
        return this.f15245A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getLabelVisibilityMode() {
        return this.f15270u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuC1209l getMenu() {
        return this.f15265U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSelectedItemId() {
        return this.f15272w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSelectedItemPosition() {
        return this.f15273x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getWindowAnimations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) l.a(1, this.f15265U.l().size(), 1).f2365a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActiveIndicatorLabelPadding(int i) {
        this.f15256L = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f15274y = colorStateList;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f15263S = colorStateList;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f15257M = z5;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorEnabled(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorHeight(int i) {
        this.f15259O = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorHeight(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f15260P = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorResizeable(boolean z5) {
        this.f15262R = z5;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorResizeable(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorShapeAppearance(s4.k kVar) {
        this.f15261Q = kVar;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemActiveIndicatorWidth(int i) {
        this.f15258N = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorWidth(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemBackground(Drawable drawable) {
        this.f15250F = drawable;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(drawable);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemBackgroundRes(int i) {
        this.f15252H = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemIconSize(int i) {
        this.f15275z = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconSize(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPaddingBottom(int i) {
        this.f15255K = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingBottom(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemPaddingTop(int i) {
        this.f15254J = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingTop(i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15251G = colorStateList;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemRippleColor(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextAppearanceActive(int i) {
        this.f15248D = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f15245A;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.f15249E = z5;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActiveBoldEnabled(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextAppearanceInactive(int i) {
        this.f15247C = i;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f15245A;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemTextColor(ColorStateList colorStateList) {
        this.f15245A = colorStateList;
        c[] cVarArr = this.f15271v;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextColor(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLabelVisibilityMode(int i) {
        this.f15270u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPresenter(g gVar) {
        this.f15264T = gVar;
    }
}
