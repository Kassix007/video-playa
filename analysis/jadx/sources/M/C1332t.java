package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.P1;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import w1.AbstractC1835K;
import w1.C1841d;
import w1.C1843f;
import w1.InterfaceC1840c;
import w1.InterfaceC1851n;

/* JADX INFO: renamed from: m.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1332t extends EditText implements InterfaceC1851n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W1.l f14876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1284V f14877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1344z f14878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A1.n f14879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1344z f14880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1330s f14881v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1274P0.a(context);
        AbstractC1272O0.a(this, getContext());
        W1.l lVar = new W1.l(this);
        this.f14876q = lVar;
        lVar.e(attributeSet, R.attr.editTextStyle);
        C1284V c1284v = new C1284V(this);
        this.f14877r = c1284v;
        c1284v.f(attributeSet, R.attr.editTextStyle);
        c1284v.b();
        C1344z c1344z = new C1344z();
        c1344z.f14914b = this;
        this.f14878s = c1344z;
        this.f14879t = new A1.n();
        C1344z c1344z2 = new C1344z(this);
        this.f14880u = c1344z2;
        c1344z2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c1344z2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1330s getSuperCaller() {
        if (this.f14881v == null) {
            this.f14881v = new C1330s(this);
        }
        return this.f14881v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1851n
    public final C1843f a(C1843f c1843f) {
        this.f14879t.getClass();
        return A1.n.a(this, c1843f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            lVar.a();
        }
        C1284V c1284v = this.f14877r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return P1.e0(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14877r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14877r.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1344z c1344z;
        if (Build.VERSION.SDK_INT >= 28 || (c1344z = this.f14878s) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1344z.f14915c;
        return textClassifier == null ? AbstractC1273P.a((TextView) c1344z.f14914b) : textClassifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119 A[PHI: r3
  0x0119: PHI (r3v10 java.lang.String[]) = (r3v5 java.lang.String[]), (r3v11 java.lang.String[]) binds: [B:76:0x012c, B:68:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r18)
            m.V r3 = r0.f14877r
            r3.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 >= r4) goto Ld1
            if (r2 == 0) goto Ld1
            java.lang.CharSequence r5 = r0.getText()
            if (r3 < r4) goto L20
            y1.a.a(r1, r5)
            goto Ld1
        L20:
            r5.getClass()
            if (r3 < r4) goto L2a
            y1.a.a(r1, r5)
            goto Ld1
        L2a:
            int r6 = r1.initialSelStart
            int r7 = r1.initialSelEnd
            if (r6 <= r7) goto L32
            r8 = r7
            goto L33
        L32:
            r8 = r6
        L33:
            if (r6 <= r7) goto L36
            goto L37
        L36:
            r6 = r7
        L37:
            int r7 = r5.length()
            r9 = 0
            r10 = 0
            if (r8 < 0) goto Lce
            if (r6 <= r7) goto L43
            goto Lce
        L43:
            int r11 = r1.inputType
            r11 = r11 & 4095(0xfff, float:5.738E-42)
            r12 = 129(0x81, float:1.81E-43)
            if (r11 == r12) goto Lca
            r12 = 225(0xe1, float:3.15E-43)
            if (r11 == r12) goto Lca
            r12 = 18
            if (r11 != r12) goto L55
            goto Lca
        L55:
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 > r10) goto L5e
            y1.b.a(r1, r5, r8, r6)
            goto Ld1
        L5e:
            int r7 = r6 - r8
            r10 = 1024(0x400, float:1.435E-42)
            if (r7 <= r10) goto L66
            r10 = r9
            goto L67
        L66:
            r10 = r7
        L67:
            int r11 = r5.length()
            int r11 = r11 - r6
            int r12 = 2048 - r10
            r15 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r13 = (double) r12
            double r13 = r13 * r15
            int r13 = (int) r13
            int r13 = java.lang.Math.min(r8, r13)
            int r13 = r12 - r13
            int r11 = java.lang.Math.min(r11, r13)
            int r12 = r12 - r11
            int r12 = java.lang.Math.min(r8, r12)
            int r8 = r8 - r12
            char r13 = r5.charAt(r8)
            boolean r13 = java.lang.Character.isLowSurrogate(r13)
            if (r13 == 0) goto L94
            int r8 = r8 + 1
            int r12 = r12 + (-1)
        L94:
            int r13 = r6 + r11
            r14 = 1
            int r13 = r13 - r14
            char r13 = r5.charAt(r13)
            boolean r13 = java.lang.Character.isHighSurrogate(r13)
            if (r13 == 0) goto La4
            int r11 = r11 + (-1)
        La4:
            int r13 = r12 + r10
            int r15 = r13 + r11
            if (r10 == r7) goto Lc1
            int r7 = r8 + r12
            java.lang.CharSequence r7 = r5.subSequence(r8, r7)
            int r11 = r11 + r6
            java.lang.CharSequence r5 = r5.subSequence(r6, r11)
            r6 = 2
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
            r6[r9] = r7
            r6[r14] = r5
            java.lang.CharSequence r5 = android.text.TextUtils.concat(r6)
            goto Lc6
        Lc1:
            int r15 = r15 + r8
            java.lang.CharSequence r5 = r5.subSequence(r8, r15)
        Lc6:
            y1.b.a(r1, r5, r12, r13)
            goto Ld1
        Lca:
            y1.b.a(r1, r10, r9, r9)
            goto Ld1
        Lce:
            y1.b.a(r1, r10, r9, r9)
        Ld1:
            l6.d.y(r2, r1, r0)
            if (r2 == 0) goto L139
            if (r3 > r4) goto L139
            java.lang.String[] r4 = w1.AbstractC1835K.g(r0)
            if (r4 == 0) goto L139
            java.lang.String r5 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r6 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r7 = 25
            if (r3 < r7) goto Lea
            R4.AbstractC0462j.l(r1, r4)
            goto Lff
        Lea:
            android.os.Bundle r8 = r1.extras
            if (r8 != 0) goto Lf5
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r1.extras = r8
        Lf5:
            android.os.Bundle r8 = r1.extras
            r8.putStringArray(r6, r4)
            android.os.Bundle r8 = r1.extras
            r8.putStringArray(r5, r4)
        Lff:
            R4.L0 r4 = new R4.L0
            r8 = 11
            r4.<init>(r8, r0)
            if (r3 < r7) goto L10f
            y1.c r3 = new y1.c
            r3.<init>(r2, r4)
        L10d:
            r2 = r3
            goto L139
        L10f:
            java.lang.String[] r8 = y1.b.f18536a
            if (r3 < r7) goto L11b
            java.lang.String[] r3 = R4.AbstractC0462j.m(r1)
            if (r3 == 0) goto L12f
        L119:
            r8 = r3
            goto L12f
        L11b:
            android.os.Bundle r3 = r1.extras
            if (r3 != 0) goto L120
            goto L12f
        L120:
            java.lang.String[] r3 = r3.getStringArray(r6)
            if (r3 != 0) goto L12c
            android.os.Bundle r3 = r1.extras
            java.lang.String[] r3 = r3.getStringArray(r5)
        L12c:
            if (r3 == 0) goto L12f
            goto L119
        L12f:
            int r3 = r8.length
            if (r3 != 0) goto L133
            goto L139
        L133:
            y1.d r3 = new y1.d
            r3.<init>(r2, r4)
            goto L10d
        L139:
            m.z r3 = r0.f14880u
            G1.b r1 = r3.c(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1332t.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC1835K.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = AbstractC1247C.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC1840c c1134a;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 || AbstractC1835K.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i7 >= 31) {
                c1134a = new C1134a(primaryClip, 1);
            } else {
                C1841d c1841d = new C1841d();
                c1841d.f18191r = primaryClip;
                c1841d.f18192s = 1;
                c1134a = c1841d;
            }
            c1134a.p(i == 16908322 ? 0 : 1);
            AbstractC1835K.i(this, c1134a.build());
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            lVar.h(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14877r;
        if (c1284v != null) {
            c1284v.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1284V c1284v = this.f14877r;
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
        this.f14880u.d(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14880u.a(keyListener));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            lVar.j(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        W1.l lVar = this.f14876q;
        if (lVar != null) {
            lVar.k(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1284V c1284v = this.f14877r;
        c1284v.k(colorStateList);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1284V c1284v = this.f14877r;
        c1284v.l(mode);
        c1284v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1284V c1284v = this.f14877r;
        if (c1284v != null) {
            c1284v.g(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1344z c1344z;
        if (Build.VERSION.SDK_INT >= 28 || (c1344z = this.f14878s) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1344z.f14915c = textClassifier;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getText()Ljava/lang/CharSequence; */
    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
