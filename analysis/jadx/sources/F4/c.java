package f4;

import B0.G0;
import Q2.g;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.i;
import l4.m;
import m.C1324p;
import m1.l;
import r2.C1577b;
import r2.C1578c;
import r2.d;
import r2.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C1324p {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f12721O = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int[] f12722P = {R.attr.state_error};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[][] f12723Q = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f12724R = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f12725A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f12726B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f12727C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12728D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f12729E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f12730F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public PorterDuff.Mode f12731G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12732H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int[] f12733I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f12734J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence f12735K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f12736L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final e f12737M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1064a f12738N;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f12739u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f12740v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f12741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12743y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12744z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Context context, AttributeSet attributeSet) {
        super(x4.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f12739u = new LinkedHashSet();
        this.f12740v = new LinkedHashSet();
        Context context2 = getContext();
        e eVar = new e(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = l.f15039a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eVar.f16295q = drawable;
        drawable.setCallback(eVar.f16294v);
        new d(eVar.f16295q.getConstantState());
        this.f12737M = eVar;
        this.f12738N = new C1064a(this);
        Context context3 = getContext();
        this.f12726B = getButtonDrawable();
        this.f12729E = getSuperButtonTintList();
        setSupportButtonTintList(null);
        G0 g0H = m.h(context3, attributeSet, V3.a.f7988q, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) g0H.f235s;
        this.f12727C = g0H.y(2);
        if (this.f12726B != null && AbstractC0597a.N(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f12724R && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f12726B = AbstractC0597a.C(context3, R.drawable.mtrl_checkbox_button);
                this.f12728D = true;
                if (this.f12727C == null) {
                    this.f12727C = AbstractC0597a.C(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f12730F = I1.Y(context3, g0H, 3);
        this.f12731G = m.i(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f12742x = typedArray.getBoolean(10, false);
        this.f12743y = typedArray.getBoolean(6, true);
        this.f12744z = typedArray.getBoolean(9, false);
        this.f12725A = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        g0H.R();
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String getButtonStateDescription() {
        int i = this.f12732H;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12741w == null) {
            int iD = g.D(this, R.attr.colorControlActivated);
            int iD2 = g.D(this, R.attr.colorError);
            int iD3 = g.D(this, R.attr.colorSurface);
            int iD4 = g.D(this, R.attr.colorOnSurface);
            this.f12741w = new ColorStateList(f12723Q, new int[]{g.I(1.0f, iD3, iD2), g.I(1.0f, iD3, iD), g.I(0.54f, iD3, iD4), g.I(0.38f, iD3, iD4), g.I(0.38f, iD3, iD4)});
        }
        return this.f12741w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f12729E;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Z3.a aVar;
        Drawable drawableMutate = this.f12726B;
        ColorStateList colorStateList3 = this.f12729E;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f12726B = drawableMutate;
        Drawable drawableMutate2 = this.f12727C;
        ColorStateList colorStateList4 = this.f12730F;
        PorterDuff.Mode mode = this.f12731G;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f12727C = drawableMutate2;
        if (this.f12728D) {
            e eVar = this.f12737M;
            if (eVar != null) {
                C1578c c1578c = eVar.f16290r;
                Drawable drawable = eVar.f16295q;
                C1064a c1064a = this.f12738N;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c1064a.f12718a == null) {
                        c1064a.f12718a = new C1577b(c1064a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1064a.f12718a);
                }
                ArrayList arrayList = eVar.f16293u;
                if (arrayList != null && c1064a != null) {
                    arrayList.remove(c1064a);
                    if (eVar.f16293u.size() == 0 && (aVar = eVar.f16292t) != null) {
                        c1578c.f16286b.removeListener(aVar);
                        eVar.f16292t = null;
                    }
                }
                Drawable drawable2 = eVar.f16295q;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c1064a.f12718a == null) {
                        c1064a.f12718a = new C1577b(c1064a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1064a.f12718a);
                } else if (c1064a != null) {
                    if (eVar.f16293u == null) {
                        eVar.f16293u = new ArrayList();
                    }
                    if (!eVar.f16293u.contains(c1064a)) {
                        eVar.f16293u.add(c1064a);
                        if (eVar.f16292t == null) {
                            eVar.f16292t = new Z3.a(3, eVar);
                        }
                        c1578c.f16286b.addListener(eVar.f16292t);
                    }
                }
            }
            Drawable drawable3 = this.f12726B;
            if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                ((AnimatedStateListDrawable) this.f12726B).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
            }
        }
        Drawable drawable4 = this.f12726B;
        if (drawable4 != null && (colorStateList2 = this.f12729E) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f12727C;
        if (drawable5 != null && (colorStateList = this.f12730F) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f12726B;
        Drawable drawable7 = this.f12727C;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f12726B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getButtonIconDrawable() {
        return this.f12727C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getButtonIconTintList() {
        return this.f12730F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f12731G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f12729E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCheckedState() {
        return this.f12732H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getErrorAccessibilityLabel() {
        return this.f12725A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f12732H == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12742x && this.f12729E == null && this.f12730F == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12721O);
        }
        if (this.f12744z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12722P);
        }
        int i7 = 0;
        while (true) {
            if (i7 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i8 = iArrOnCreateDrawableState[i7];
            if (i8 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i8 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i7] = 16842912;
                break;
            }
            i7++;
        }
        this.f12733I = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f12743y || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (m.f(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f12744z) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12725A));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f12720q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f12720q = getCheckedState();
        return bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1324p, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0597a.C(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setButtonIconDrawable(Drawable drawable) {
        this.f12727C = drawable;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0597a.C(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f12730F == colorStateList) {
            return;
        }
        this.f12730F = colorStateList;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f12731G == mode) {
            return;
        }
        this.f12731G = mode;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f12729E == colorStateList) {
            return;
        }
        this.f12729E = colorStateList;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCenterIfNoTextEnabled(boolean z5) {
        this.f12743y = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f12732H != i) {
            this.f12732H = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && this.f12735K == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f12734J) {
                return;
            }
            this.f12734J = true;
            LinkedHashSet linkedHashSet = this.f12740v;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw i.h(it);
                }
            }
            if (this.f12732H != 2 && (onCheckedChangeListener = this.f12736L) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i7 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f12734J = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12725A = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorShown(boolean z5) {
        if (this.f12744z == z5) {
            return;
        }
        this.f12744z = z5;
        refreshDrawableState();
        Iterator it = this.f12739u.iterator();
        if (it.hasNext()) {
            throw i.h(it);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12736L = onCheckedChangeListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f12735K = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUseMaterialThemeColors(boolean z5) {
        this.f12742x = z5;
        if (z5) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // m.C1324p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f12726B = drawable;
        this.f12728D = false;
        a();
    }
}
