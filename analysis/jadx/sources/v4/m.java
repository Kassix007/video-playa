package v4;

import B0.G0;
import C0.D;
import R4.L0;
import a.AbstractC0597a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.wnapp.smspariaz.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C1292Z;
import p3.J;
import w1.AbstractC1835K;
import x1.AccessibilityManagerTouchExplorationStateChangeListenerC1885b;

/* JADX INFO: loaded from: classes.dex */
public final class m extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f17642A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PorterDuff.Mode f17643B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f17644C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView.ScaleType f17645D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View.OnLongClickListener f17646E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f17647F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1292Z f17648G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f17649H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public EditText f17650I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final AccessibilityManager f17651J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public L0 f17652K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final k f17653L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextInputLayout f17654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FrameLayout f17655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CheckableImageButton f17656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f17657t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f17658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View.OnLongClickListener f17659v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CheckableImageButton f17660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final J f17661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17662y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f17663z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(TextInputLayout textInputLayout, G0 g02) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f17662y = 0;
        this.f17663z = new LinkedHashSet();
        this.f17653L = new k(this);
        l lVar = new l(this);
        this.f17651J = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f17654q = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f17655r = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f17656s = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f17660w = checkableImageButtonA2;
        J j = new J();
        j.f15670c = new SparseArray();
        j.f15671d = this;
        TypedArray typedArray = (TypedArray) g02.f235s;
        j.f15668a = typedArray.getResourceId(28, 0);
        j.f15669b = typedArray.getResourceId(52, 0);
        this.f17661x = j;
        C1292Z c1292z = new C1292Z(getContext(), null);
        this.f17648G = c1292z;
        TypedArray typedArray2 = (TypedArray) g02.f235s;
        if (typedArray2.hasValue(38)) {
            this.f17657t = I1.Y(getContext(), g02, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f17658u = l4.m.i(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(g02.y(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f17642A = I1.Y(getContext(), g02, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f17643B = l4.m.i(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f17642A = I1.Y(getContext(), g02, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f17643B = l4.m.i(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f17644C) {
            this.f17644C = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeM = K1.m(typedArray2.getInt(31, -1));
            this.f17645D = scaleTypeM;
            checkableImageButtonA2.setScaleType(scaleTypeM);
            checkableImageButtonA.setScaleType(scaleTypeM);
        }
        c1292z.setVisibility(8);
        c1292z.setId(R.id.textinput_suffix_text);
        c1292z.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1292z.setAccessibilityLiveRegion(1);
        c1292z.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c1292z.setTextColor(g02.w(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f17647F = TextUtils.isEmpty(text3) ? null : text3;
        c1292z.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(c1292z);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f11666u0.add(lVar);
        if (textInputLayout.f11663t != null) {
            lVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new D(6, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (I1.s0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n b() {
        n eVar;
        int i = this.f17662y;
        J j = this.f17661x;
        SparseArray sparseArray = (SparseArray) j.f15670c;
        n nVar = (n) sparseArray.get(i);
        if (nVar != null) {
            return nVar;
        }
        m mVar = (m) j.f15671d;
        if (i == -1) {
            eVar = new e(mVar, 0);
        } else if (i == 0) {
            eVar = new e(mVar, 1);
        } else if (i == 1) {
            eVar = new t(mVar, j.f15669b);
        } else if (i == 2) {
            eVar = new d(mVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(k1.i.i(i, "Invalid end icon mode: "));
            }
            eVar = new j(mVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f17660w;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        return this.f17648G.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return this.f17655r.getVisibility() == 0 && this.f17660w.getVisibility() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return this.f17656s.getVisibility() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z5) {
        boolean z6;
        boolean zIsActivated;
        boolean z7;
        n nVarB = b();
        boolean zK = nVarB.k();
        CheckableImageButton checkableImageButton = this.f17660w;
        boolean z8 = true;
        if (!zK || (z7 = checkableImageButton.f11559t) == nVarB.l()) {
            z6 = false;
        } else {
            checkableImageButton.setChecked(!z7);
            z6 = true;
        }
        if (!(nVarB instanceof j) || (zIsActivated = checkableImageButton.isActivated()) == nVarB.j()) {
            z8 = z6;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z5 || z8) {
            K1.J(this.f17654q, checkableImageButton, this.f17642A);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        if (this.f17662y == i) {
            return;
        }
        n nVarB = b();
        L0 l02 = this.f17652K;
        AccessibilityManager accessibilityManager = this.f17651J;
        if (l02 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1885b(l02));
        }
        this.f17652K = null;
        nVarB.s();
        this.f17662y = i;
        Iterator it = this.f17663z.iterator();
        if (it.hasNext()) {
            throw k1.i.h(it);
        }
        h(i != 0);
        n nVarB2 = b();
        int iD = this.f17661x.f15668a;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawableC = iD != 0 ? AbstractC0597a.C(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f17660w;
        checkableImageButton.setImageDrawable(drawableC);
        TextInputLayout textInputLayout = this.f17654q;
        if (drawableC != null) {
            K1.e(textInputLayout, checkableImageButton, this.f17642A, this.f17643B);
            K1.J(textInputLayout, checkableImageButton, this.f17642A);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.k());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        nVarB2.r();
        L0 l0H = nVarB2.h();
        this.f17652K = l0H;
        if (l0H != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1885b(this.f17652K));
            }
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f17646E;
        checkableImageButton.setOnClickListener(onClickListenerF);
        K1.L(checkableImageButton, onLongClickListener);
        EditText editText = this.f17650I;
        if (editText != null) {
            nVarB2.m(editText);
            j(nVarB2);
        }
        K1.e(textInputLayout, checkableImageButton, this.f17642A, this.f17643B);
        f(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z5) {
        if (d() != z5) {
            this.f17660w.setVisibility(z5 ? 0 : 8);
            k();
            m();
            this.f17654q.q();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f17656s;
        checkableImageButton.setImageDrawable(drawable);
        l();
        K1.e(this.f17654q, checkableImageButton, this.f17657t, this.f17658u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(n nVar) {
        if (this.f17650I == null) {
            return;
        }
        if (nVar.e() != null) {
            this.f17650I.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f17660w.setOnFocusChangeListener(nVar.g());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        this.f17655r.setVisibility((this.f17660w.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f17647F == null || this.f17649H) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        CheckableImageButton checkableImageButton = this.f17656s;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f17654q;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f11675z.f17689q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f17662y != 0) {
            return;
        }
        textInputLayout.q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f17654q;
        if (textInputLayout.f11663t == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f11663t;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f11663t.getPaddingTop();
        int paddingBottom = textInputLayout.f11663t.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
        this.f17648G.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        C1292Z c1292z = this.f17648G;
        int visibility = c1292z.getVisibility();
        int i = (this.f17647F == null || this.f17649H) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c1292z.setVisibility(i);
        this.f17654q.q();
    }
}
