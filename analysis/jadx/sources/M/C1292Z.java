package m;

import a.AbstractC0597a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.P1;
import i1.C1134a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import u1.AbstractC1677d;
import u1.C1676c;

/* JADX INFO: renamed from: m.Z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1292Z extends TextView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W1.l f14742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1284V f14743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1344z f14744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1334u f14745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1134a f14747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Future f14748w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1292Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1334u getEmojiTextViewHelper() {
        if (this.f14745t == null) {
            this.f14745t = new C1334u(this);
        }
        return this.f14745t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            lVar.a();
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f14792c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            return Math.round(c1284v.i.f14780e);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f14792c) {
            return super.getAutoSizeMinTextSize();
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            return Math.round(c1284v.i.f14779d);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f14792c) {
            return super.getAutoSizeStepGranularity();
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            return Math.round(c1284v.i.f14778c);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f14792c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1284V c1284v = this.f14743r;
        return c1284v != null ? c1284v.i.f : new int[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f14792c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            return c1284v.i.f14776a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P1.e0(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1286W getSuperCaller() {
        if (this.f14747v == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f14747v = new C1290Y(this);
            } else if (i >= 28) {
                this.f14747v = new C1288X(this);
            } else if (i >= 26) {
                this.f14747v = new C1134a(4, this);
            }
        }
        return this.f14747v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14743r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14743r.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f14748w;
        if (future != null) {
            try {
                this.f14748w = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                P1.D(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1344z c1344z;
        if (Build.VERSION.SDK_INT >= 28 || (c1344z = this.f14744s) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1344z.f14915c;
        return textClassifier == null ? AbstractC1273P.a((TextView) c1344z.f14914b) : textClassifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1676c getTextMetricsParamsCompat() {
        return P1.D(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14743r.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i7 >= 30) {
                y1.a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i7 >= 30) {
                    y1.a.a(editorInfo, text);
                } else {
                    int i8 = editorInfo.initialSelStart;
                    int i9 = editorInfo.initialSelEnd;
                    int i10 = i8 > i9 ? i9 : i8;
                    if (i8 <= i9) {
                        i8 = i9;
                    }
                    int length = text.length();
                    if (i10 < 0 || i8 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
                        y1.b.a(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        y1.b.a(editorInfo, text, i10, i8);
                    } else {
                        int i11 = i8 - i10;
                        int i12 = i11 > 1024 ? 0 : i11;
                        int i13 = 2048 - i12;
                        int iMin = Math.min(text.length() - i8, i13 - Math.min(i10, (int) (((double) i13) * 0.8d)));
                        int iMin2 = Math.min(i10, i13 - iMin);
                        int i14 = i10 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i14))) {
                            i14++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i8 + iMin) - 1))) {
                            iMin--;
                        }
                        int i15 = iMin2 + i12;
                        y1.b.a(editorInfo, i12 != i11 ? TextUtils.concat(text.subSequence(i14, i14 + iMin2), text.subSequence(i8, iMin + i8)) : text.subSequence(i14, i15 + iMin + i14), iMin2, i15);
                    }
                }
            }
        }
        l6.d.y(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        C1284V c1284v = this.f14743r;
        if (c1284v == null || g1.f14792c) {
            return;
        }
        c1284v.i.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i7) {
        Future future = this.f14748w;
        if (future != null) {
            try {
                this.f14748w = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                P1.D(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i7, int i8) {
        super.onTextChanged(charSequence, i, i7, i8);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            C1303e0 c1303e0 = c1284v.i;
            if (g1.f14792c || !c1303e0.f()) {
                return;
            }
            c1303e0.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i7, int i8, int i9) {
        if (g1.f14792c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i7, i8, i9);
            return;
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.h(i, i7, i8, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (g1.f14792c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.i(iArr, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (g1.f14792c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.j(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(P1.g0(callback, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6.d) getEmojiTextViewHelper().f14883b.f14120q).o(inputFilterArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            P1.S(this, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            P1.U(this, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        P1.V(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrecomputedText(AbstractC1677d abstractC1677d) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        P1.D(this);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14742q;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1284V c1284v = this.f14743r;
        c1284v.k(colorStateList);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1284V c1284v = this.f14743r;
        c1284v.l(mode);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.g(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1344z c1344z;
        if (Build.VERSION.SDK_INT >= 28 || (c1344z = this.f14744s) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1344z.f14915c = textClassifier;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextFuture(Future<AbstractC1677d> future) {
        this.f14748w = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextMetricsParamsCompat(C1676c c1676c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c1676c.f17125b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c1676c.f17124a);
        setBreakStrategy(c1676c.f17126c);
        setHyphenationFrequency(c1676c.f17127d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z5 = g1.f14792c;
        if (z5) {
            super.setTextSize(i, f);
            return;
        }
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            C1303e0 c1303e0 = c1284v.i;
            if (z5 || c1303e0.f()) {
                return;
            }
            c1303e0.g(i, f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f14746u) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            Q2.g gVar = n1.e.f15132a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f14746u = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f14746u = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1274P0.a(context);
        this.f14746u = false;
        this.f14747v = null;
        AbstractC1272O0.a(this, getContext());
        W1.l lVar = new W1.l(this);
        this.f14742q = lVar;
        lVar.e(attributeSet, i);
        C1284V c1284v = new C1284V(this);
        this.f14743r = c1284v;
        c1284v.f(attributeSet, i);
        c1284v.b();
        C1344z c1344z = new C1344z();
        c1344z.f14914b = this;
        this.f14744s = c1344z;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            getSuperCaller().m(i, f);
        } else if (i7 >= 34) {
            A1.l.i(this, i, f);
        } else {
            P1.V(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0597a.C(context, i) : null, i7 != 0 ? AbstractC0597a.C(context, i7) : null, i8 != 0 ? AbstractC0597a.C(context, i8) : null, i9 != 0 ? AbstractC0597a.C(context, i9) : null);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0597a.C(context, i) : null, i7 != 0 ? AbstractC0597a.C(context, i7) : null, i8 != 0 ? AbstractC0597a.C(context, i8) : null, i9 != 0 ? AbstractC0597a.C(context, i9) : null);
        C1284V c1284v = this.f14743r;
        if (c1284v != null) {
            c1284v.b();
        }
    }
}
