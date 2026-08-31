package l4;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p4.C1480a;
import u1.AbstractC1679f;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: l4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1232b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f14500A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f14501B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14502C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Bitmap f14504E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f14505F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f14506G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f14507H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f14508I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f14509J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f14510K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f14511L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f14512M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final TextPaint f14513N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextPaint f14514O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TimeInterpolator f14515P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public TimeInterpolator f14516Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f14517R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f14518S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f14519T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f14520U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f14521V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f14522W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f14523X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public StaticLayout f14524Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f14525Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f14526a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f14527a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14528b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f14529b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f14530c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f14531c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f14532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f14534e;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f14539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f14544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f14546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f14547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f14548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f14549u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f14550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f14551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f14552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1480a f14553y;
    public int f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14537g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14538h = 15.0f;
    public float i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f14554z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f14503D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f14533d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f14535e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f14536f0 = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1232b(TextInputLayout textInputLayout) {
        this.f14526a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f14513N = textPaint;
        this.f14514O = new TextPaint(textPaint);
        this.f14532d = new Rect();
        this.f14530c = new Rect();
        this.f14534e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(float f, int i, int i7) {
        float f7 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i7) * f) + (Color.alpha(i) * f7)), Math.round((Color.red(i7) * f) + (Color.red(i) * f7)), Math.round((Color.green(i7) * f) + (Color.green(i) * f7)), Math.round((Color.blue(i7) * f) + (Color.blue(i) * f7)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float f(float f, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        return W3.a.a(f, f7, f8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        boolean z5 = this.f14526a.getLayoutDirection() == 1;
        if (this.f14503D) {
            return (z5 ? AbstractC1679f.f17132d : AbstractC1679f.f17131c).c(charSequence, charSequence.length());
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(float f, boolean z5) {
        float f7;
        float f8;
        Typeface typeface;
        boolean z6;
        Layout.Alignment alignment;
        if (this.f14500A == null) {
            return;
        }
        float fWidth = this.f14532d.width();
        float fWidth2 = this.f14530c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f7 = this.i;
            f8 = this.f14521V;
            this.f14505F = 1.0f;
            typeface = this.f14546r;
        } else {
            float f9 = this.f14538h;
            float f10 = this.f14522W;
            Typeface typeface2 = this.f14549u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f14505F = 1.0f;
            } else {
                this.f14505F = f(this.f14538h, this.i, f, this.f14516Q) / this.f14538h;
            }
            float f11 = this.i / this.f14538h;
            fWidth = (z5 || fWidth2 * f11 <= fWidth) ? fWidth2 : Math.min(fWidth / f11, fWidth2);
            f7 = f9;
            f8 = f10;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f14513N;
        if (fWidth > 0.0f) {
            boolean z7 = this.f14506G != f7;
            boolean z8 = this.f14523X != f8;
            boolean z9 = this.f14552x != typeface;
            StaticLayout staticLayout = this.f14524Y;
            boolean z10 = z7 || z8 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z9 || this.f14512M;
            this.f14506G = f7;
            this.f14523X = f8;
            this.f14552x = typeface;
            this.f14512M = false;
            textPaint.setLinearText(this.f14505F != 1.0f);
            z6 = z10;
        } else {
            z6 = false;
        }
        if (this.f14501B == null || z6) {
            textPaint.setTextSize(this.f14506G);
            textPaint.setTypeface(this.f14552x);
            textPaint.setLetterSpacing(this.f14523X);
            boolean zB = b(this.f14500A);
            this.f14502C = zB;
            int i = this.f14533d0;
            if (i <= 1 || zB) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f14502C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f14502C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C1238h c1238h = new C1238h(this.f14500A, textPaint, (int) fWidth);
            c1238h.f14570k = this.f14554z;
            c1238h.j = zB;
            c1238h.f14567e = alignment;
            c1238h.i = false;
            c1238h.f = i;
            c1238h.f14568g = this.f14535e0;
            c1238h.f14569h = this.f14536f0;
            StaticLayout staticLayoutA = c1238h.a();
            staticLayoutA.getClass();
            this.f14524Y = staticLayoutA;
            this.f14501B = staticLayoutA.getText();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d() {
        float f = this.i;
        TextPaint textPaint = this.f14514O;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f14546r);
        textPaint.setLetterSpacing(this.f14521V);
        return -textPaint.ascent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f14511L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f14548t;
            if (typeface != null) {
                this.f14547s = P1.E(configuration, typeface);
            }
            Typeface typeface2 = this.f14551w;
            if (typeface2 != null) {
                this.f14550v = P1.E(configuration, typeface2);
            }
            Typeface typeface3 = this.f14547s;
            if (typeface3 == null) {
                typeface3 = this.f14548t;
            }
            this.f14546r = typeface3;
            Typeface typeface4 = this.f14550v;
            if (typeface4 == null) {
                typeface4 = this.f14551w;
            }
            this.f14549u = typeface4;
            h(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z5) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f14526a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z5) {
            return;
        }
        c(1.0f, z5);
        CharSequence charSequence = this.f14501B;
        TextPaint textPaint = this.f14513N;
        if (charSequence != null && (staticLayout = this.f14524Y) != null) {
            this.f14531c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f14554z);
        }
        CharSequence charSequence2 = this.f14531c0;
        if (charSequence2 != null) {
            this.f14525Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f14525Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f14537g, this.f14502C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f14532d;
        if (i == 48) {
            this.f14541m = rect.top;
        } else if (i != 80) {
            this.f14541m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f14541m = textPaint.ascent() + rect.bottom;
        }
        int i7 = absoluteGravity & 8388615;
        if (i7 == 1) {
            this.f14543o = rect.centerX() - (this.f14525Z / 2.0f);
        } else if (i7 != 5) {
            this.f14543o = rect.left;
        } else {
            this.f14543o = rect.right - this.f14525Z;
        }
        c(0.0f, z5);
        float height = this.f14524Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f14524Y;
        if (staticLayout2 == null || this.f14533d0 <= 1) {
            CharSequence charSequence3 = this.f14501B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f14524Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.f14502C ? 1 : 0);
        int i8 = absoluteGravity2 & 112;
        Rect rect2 = this.f14530c;
        if (i8 == 48) {
            this.f14540l = rect2.top;
        } else if (i8 != 80) {
            this.f14540l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f14540l = textPaint.descent() + (rect2.bottom - height);
        }
        int i9 = absoluteGravity2 & 8388615;
        if (i9 == 1) {
            this.f14542n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i9 != 5) {
            this.f14542n = rect2.left;
        } else {
            this.f14542n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f14504E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f14504E = null;
        }
        l(this.f14528b);
        float f = this.f14528b;
        float f7 = f(rect2.left, rect.left, f, this.f14515P);
        RectF rectF = this.f14534e;
        rectF.left = f7;
        rectF.top = f(this.f14540l, this.f14541m, f, this.f14515P);
        rectF.right = f(rect2.right, rect.right, f, this.f14515P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f, this.f14515P);
        this.f14544p = f(this.f14542n, this.f14543o, f, this.f14515P);
        this.f14545q = f(this.f14540l, this.f14541m, f, this.f14515P);
        l(f);
        L1.a aVar = W3.a.f8109b;
        this.f14527a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, aVar);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        textInputLayout.postInvalidateOnAnimation();
        this.f14529b0 = f(1.0f, 0.0f, f, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f14539k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, e(colorStateList2), e(this.f14539k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f8 = this.f14521V;
        float f9 = this.f14522W;
        if (f8 != f9) {
            textPaint.setLetterSpacing(f(f9, f8, f, aVar));
        } else {
            textPaint.setLetterSpacing(f8);
        }
        this.f14507H = W3.a.a(0.0f, this.f14517R, f);
        this.f14508I = W3.a.a(0.0f, this.f14518S, f);
        this.f14509J = W3.a.a(0.0f, this.f14519T, f);
        int iA = a(f, 0, e(this.f14520U));
        this.f14510K = iA;
        textPaint.setShadowLayer(this.f14507H, this.f14508I, this.f14509J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(ColorStateList colorStateList) {
        if (this.f14539k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f14539k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(Typeface typeface) {
        C1480a c1480a = this.f14553y;
        if (c1480a != null) {
            c1480a.f15882e = true;
        }
        if (this.f14548t == typeface) {
            return false;
        }
        this.f14548t = typeface;
        Typeface typefaceE = P1.E(this.f14526a.getContext().getResources().getConfiguration(), typeface);
        this.f14547s = typefaceE;
        if (typefaceE == null) {
            typefaceE = this.f14548t;
        }
        this.f14546r = typefaceE;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f14528b) {
            this.f14528b = f;
            float f7 = this.f14530c.left;
            Rect rect = this.f14532d;
            float f8 = f(f7, rect.left, f, this.f14515P);
            RectF rectF = this.f14534e;
            rectF.left = f8;
            rectF.top = f(this.f14540l, this.f14541m, f, this.f14515P);
            rectF.right = f(r1.right, rect.right, f, this.f14515P);
            rectF.bottom = f(r1.bottom, rect.bottom, f, this.f14515P);
            this.f14544p = f(this.f14542n, this.f14543o, f, this.f14515P);
            this.f14545q = f(this.f14540l, this.f14541m, f, this.f14515P);
            l(f);
            L1.a aVar = W3.a.f8109b;
            this.f14527a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, aVar);
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            TextInputLayout textInputLayout = this.f14526a;
            textInputLayout.postInvalidateOnAnimation();
            this.f14529b0 = f(1.0f, 0.0f, f, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f14539k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f14513N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f, e(colorStateList2), e(this.f14539k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f9 = this.f14521V;
            float f10 = this.f14522W;
            if (f9 != f10) {
                textPaint.setLetterSpacing(f(f10, f9, f, aVar));
            } else {
                textPaint.setLetterSpacing(f9);
            }
            this.f14507H = W3.a.a(0.0f, this.f14517R, f);
            this.f14508I = W3.a.a(0.0f, this.f14518S, f);
            this.f14509J = W3.a.a(0.0f, this.f14519T, f);
            int iA = a(f, 0, e(this.f14520U));
            this.f14510K = iA;
            textPaint.setShadowLayer(this.f14507H, this.f14508I, this.f14509J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(float f) {
        c(f, false);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        this.f14526a.postInvalidateOnAnimation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(Typeface typeface) {
        boolean z5;
        boolean zJ = j(typeface);
        if (this.f14551w != typeface) {
            this.f14551w = typeface;
            Typeface typefaceE = P1.E(this.f14526a.getContext().getResources().getConfiguration(), typeface);
            this.f14550v = typefaceE;
            if (typefaceE == null) {
                typefaceE = this.f14551w;
            }
            this.f14549u = typefaceE;
            z5 = true;
        } else {
            z5 = false;
        }
        if (zJ || z5) {
            h(false);
        }
    }
}
