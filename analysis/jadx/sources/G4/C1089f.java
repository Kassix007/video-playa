package g4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import i1.C1134a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l4.C1240j;
import l4.InterfaceC1239i;
import n1.AbstractC1393a;
import o1.InterfaceC1413a;
import p4.C1483d;
import q4.AbstractC1521a;
import s4.g;
import s4.j;
import s4.k;
import s4.m;

/* JADX INFO: renamed from: g4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1089f extends g implements Drawable.Callback, InterfaceC1239i {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final int[] f13073V0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final ShapeDrawable f13074W0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C1240j f13075A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f13076B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f13077C0;
    public int D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f13078E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f13079F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f13080G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f13081H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f13082I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f13083J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public ColorFilter f13084K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public PorterDuffColorFilter f13085L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ColorStateList f13086M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ColorStateList f13087N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public PorterDuff.Mode f13088N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ColorStateList f13089O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int[] f13090O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f13091P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ColorStateList f13092P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f13093Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public WeakReference f13094Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ColorStateList f13095R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public TextUtils.TruncateAt f13096R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f13097S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f13098S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ColorStateList f13099T;
    public int T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CharSequence f13100U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f13101U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f13102V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Drawable f13103W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ColorStateList f13104X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f13105Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13106Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13107a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Drawable f13108b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public RippleDrawable f13109c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorStateList f13110d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f13111e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SpannableStringBuilder f13112f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13113g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f13114h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Drawable f13115i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f13116j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public W3.b f13117k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public W3.b f13118l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f13119m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f13120n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f13121o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f13122p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f13123q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f13124r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f13125s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f13126t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Context f13127u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Paint f13128v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Paint.FontMetrics f13129w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RectF f13130x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final PointF f13131y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Path f13132z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1089f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wnapp.smspariaz.R.attr.chipStyle, com.wnapp.smspariaz.R.style.Widget_MaterialComponents_Chip_Action);
        this.f13093Q = -1.0f;
        this.f13128v0 = new Paint(1);
        this.f13129w0 = new Paint.FontMetrics();
        this.f13130x0 = new RectF();
        this.f13131y0 = new PointF();
        this.f13132z0 = new Path();
        this.f13083J0 = 255;
        this.f13088N0 = PorterDuff.Mode.SRC_IN;
        this.f13094Q0 = new WeakReference(null);
        i(context);
        this.f13127u0 = context;
        C1240j c1240j = new C1240j(this);
        this.f13075A0 = c1240j;
        this.f13100U = "";
        c1240j.f14571a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f13073V0;
        setState(iArr);
        if (!Arrays.equals(this.f13090O0, iArr)) {
            this.f13090O0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.f13098S0 = true;
        int[] iArr2 = AbstractC1521a.f16014a;
        f13074W0.setTint(-1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(boolean z5) {
        if (this.f13114h0 != z5) {
            boolean zR = R();
            this.f13114h0 = z5;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    o(this.f13115i0);
                } else {
                    U(this.f13115i0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(float f) {
        if (this.f13093Q != f) {
            this.f13093Q = f;
            j jVarE = this.f16505q.f16479a.e();
            jVarE.f16520e = new s4.a(f);
            jVarE.f = new s4.a(f);
            jVarE.f16521g = new s4.a(f);
            jVarE.f16522h = new s4.a(f);
            setShapeAppearanceModel(jVarE.a());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void C(Drawable drawable) {
        ?? r02;
        Object obj = this.f13103W;
        if (obj != null) {
            boolean z5 = obj instanceof InterfaceC1413a;
            r02 = obj;
            if (z5) {
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fQ = q();
            this.f13103W = drawable != null ? drawable.mutate() : null;
            float fQ2 = q();
            U(r02);
            if (S()) {
                o(this.f13103W);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(float f) {
        if (this.f13105Y != f) {
            float fQ = q();
            this.f13105Y = f;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(ColorStateList colorStateList) {
        this.f13106Z = true;
        if (this.f13104X != colorStateList) {
            this.f13104X = colorStateList;
            if (S()) {
                this.f13103W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(boolean z5) {
        if (this.f13102V != z5) {
            boolean zS = S();
            this.f13102V = z5;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    o(this.f13103W);
                } else {
                    U(this.f13103W);
                }
                invalidateSelf();
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(ColorStateList colorStateList) {
        if (this.f13095R != colorStateList) {
            this.f13095R = colorStateList;
            if (this.f13101U0) {
                s4.f fVar = this.f16505q;
                if (fVar.f16482d != colorStateList) {
                    fVar.f16482d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(float f) {
        if (this.f13097S != f) {
            this.f13097S = f;
            this.f13128v0.setStrokeWidth(f);
            if (this.f13101U0) {
                this.f16505q.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void I(Drawable drawable) {
        ?? r02;
        Object obj = this.f13108b0;
        if (obj != null) {
            boolean z5 = obj instanceof InterfaceC1413a;
            r02 = obj;
            if (z5) {
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fR = r();
            this.f13108b0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC1521a.f16014a;
            this.f13109c0 = new RippleDrawable(AbstractC1521a.b(this.f13099T), this.f13108b0, f13074W0);
            float fR2 = r();
            U(r02);
            if (T()) {
                o(this.f13108b0);
            }
            invalidateSelf();
            if (fR != fR2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(float f) {
        if (this.f13125s0 != f) {
            this.f13125s0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(float f) {
        if (this.f13111e0 != f) {
            this.f13111e0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(float f) {
        if (this.f13124r0 != f) {
            this.f13124r0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(ColorStateList colorStateList) {
        if (this.f13110d0 != colorStateList) {
            this.f13110d0 = colorStateList;
            if (T()) {
                this.f13108b0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(boolean z5) {
        if (this.f13107a0 != z5) {
            boolean zT = T();
            this.f13107a0 = z5;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    o(this.f13108b0);
                } else {
                    U(this.f13108b0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O(float f) {
        if (this.f13121o0 != f) {
            float fQ = q();
            this.f13121o0 = f;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P(float f) {
        if (this.f13120n0 != f) {
            float fQ = q();
            this.f13120n0 = f;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(ColorStateList colorStateList) {
        if (this.f13099T != colorStateList) {
            this.f13099T = colorStateList;
            this.f13092P0 = null;
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean R() {
        return this.f13114h0 && this.f13115i0 != null && this.f13081H0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean S() {
        return this.f13102V && this.f13103W != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean T() {
        return this.f13107a0 && this.f13108b0 != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l4.InterfaceC1239i
    public final void a() {
        v();
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i7;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f13083J0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z5 = this.f13101U0;
        Paint paint = this.f13128v0;
        RectF rectF = this.f13130x0;
        if (!z5) {
            paint.setColor(this.f13076B0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (!this.f13101U0) {
            paint.setColor(this.f13077C0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f13084K0;
            if (colorFilter == null) {
                colorFilter = this.f13085L0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (this.f13101U0) {
            super.draw(canvas);
        }
        if (this.f13097S > 0.0f && !this.f13101U0) {
            paint.setColor(this.f13078E0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f13101U0) {
                ColorFilter colorFilter2 = this.f13084K0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f13085L0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f7 = bounds.left;
            float f8 = this.f13097S / 2.0f;
            rectF.set(f7 + f8, bounds.top + f8, bounds.right - f8, bounds.bottom - f8);
            float f9 = this.f13093Q - (this.f13097S / 2.0f);
            canvas2.drawRoundRect(rectF, f9, f9, paint);
        }
        paint.setColor(this.f13079F0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f13101U0) {
            RectF rectF2 = new RectF(bounds);
            s4.f fVar = this.f16505q;
            k kVar = fVar.f16479a;
            float f10 = fVar.i;
            C1134a c1134a = this.f16499G;
            m mVar = this.f16500H;
            Path path = this.f13132z0;
            mVar.a(kVar, f10, rectF2, c1134a, path);
            e(canvas2, paint, path, this.f16505q.f16479a, g());
        } else {
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (S()) {
            p(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f13103W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f13103W.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (R()) {
            p(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f13115i0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f13115i0.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f13098S0 && this.f13100U != null) {
            PointF pointF = this.f13131y0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f13100U;
            C1240j c1240j = this.f13075A0;
            if (charSequence != null) {
                float fQ = q() + this.f13119m0 + this.f13122p0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c1240j.f14571a;
                Paint.FontMetrics fontMetrics = this.f13129w0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f13100U != null) {
                float fQ2 = q() + this.f13119m0 + this.f13122p0;
                float fR = r() + this.f13126t0 + this.f13123q0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fQ2;
                    rectF.right = bounds.right - fR;
                } else {
                    rectF.left = bounds.left + fR;
                    rectF.right = bounds.right - fQ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C1483d c1483d = c1240j.f14576g;
            TextPaint textPaint2 = c1240j.f14571a;
            if (c1483d != null) {
                textPaint2.drawableState = getState();
                c1240j.f14576g.e(this.f13127u0, textPaint2, c1240j.f14572b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f13100U.toString();
            if (c1240j.f14575e) {
                c1240j.a(string);
                f = c1240j.f14573c;
            } else {
                f = c1240j.f14573c;
            }
            boolean z6 = Math.round(f) > Math.round(rectF.width());
            if (z6) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i7 = iSave;
            } else {
                i7 = 0;
            }
            CharSequence charSequenceEllipsize = this.f13100U;
            if (z6 && this.f13096R0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f13096R0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z6) {
                canvas2.restoreToCount(i7);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f15 = this.f13126t0 + this.f13125s0;
                if (getLayoutDirection() == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.f13111e0;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.f13111e0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f18 = this.f13111e0;
                float f19 = fExactCenterY - (f18 / 2.0f);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas2.translate(f20, f21);
            this.f13108b0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC1521a.f16014a;
            this.f13109c0.setBounds(this.f13108b0.getBounds());
            this.f13109c0.jumpToCurrentState();
            this.f13109c0.draw(canvas2);
            canvas2.translate(-f20, -f21);
        }
        if (this.f13083J0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13083J0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f13084K0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f13091P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        float fQ = q() + this.f13119m0 + this.f13122p0;
        String string = this.f13100U.toString();
        C1240j c1240j = this.f13075A0;
        if (c1240j.f14575e) {
            c1240j.a(string);
            f = c1240j.f14573c;
        } else {
            f = c1240j.f14573c;
        }
        return Math.min(Math.round(r() + f + fQ + this.f13123q0 + this.f13126t0), this.T0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f13101U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f13091P, this.f13093Q);
        } else {
            outline.setRoundRect(bounds, this.f13093Q);
            outline2 = outline;
        }
        outline2.setAlpha(this.f13083J0 / 255.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (t(this.f13087N) || t(this.f13089O) || t(this.f13095R)) {
            return true;
        }
        C1483d c1483d = this.f13075A0.f14576g;
        if (c1483d == null || (colorStateList = c1483d.j) == null || !colorStateList.isStateful()) {
            return (this.f13114h0 && this.f13115i0 != null && this.f13113g0) || u(this.f13103W) || u(this.f13115i0) || t(this.f13086M0);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f13108b0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f13090O0);
            }
            drawable.setTintList(this.f13110d0);
            return;
        }
        Drawable drawable2 = this.f13103W;
        if (drawable == drawable2 && this.f13106Z) {
            drawable2.setTintList(this.f13104X);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            zOnLayoutDirectionChanged |= this.f13103W.setLayoutDirection(i);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= this.f13115i0.setLayoutDirection(i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= this.f13108b0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (S()) {
            zOnLevelChange |= this.f13103W.setLevel(i);
        }
        if (R()) {
            zOnLevelChange |= this.f13115i0.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.f13108b0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable, l4.InterfaceC1239i
    public final boolean onStateChange(int[] iArr) {
        if (this.f13101U0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f13090O0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.f13119m0 + this.f13120n0;
            Drawable drawable = this.f13081H0 ? this.f13115i0 : this.f13103W;
            float intrinsicWidth = this.f13105Y;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f7 = rect.left + f;
                rectF.left = f7;
                rectF.right = f7 + intrinsicWidth;
            } else {
                float f8 = rect.right - f;
                rectF.right = f8;
                rectF.left = f8 - intrinsicWidth;
            }
            Drawable drawable2 = this.f13081H0 ? this.f13115i0 : this.f13103W;
            float fCeil = this.f13105Y;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f13127u0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float q() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.f13120n0;
        Drawable drawable = this.f13081H0 ? this.f13115i0 : this.f13103W;
        float intrinsicWidth = this.f13105Y;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f13121o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float r() {
        if (T()) {
            return this.f13124r0 + this.f13111e0 + this.f13125s0;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float s() {
        return this.f13101U0 ? this.f16505q.f16479a.f16529e.a(g()) : this.f13093Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f13083J0 != i) {
            this.f13083J0 = i;
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f13084K0 != colorFilter) {
            this.f13084K0 = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f13086M0 != colorStateList) {
            this.f13086M0 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f13088N0 != mode) {
            this.f13088N0 = mode;
            ColorStateList colorStateList = this.f13086M0;
            this.f13085L0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (S()) {
            visible |= this.f13103W.setVisible(z5, z6);
        }
        if (R()) {
            visible |= this.f13115i0.setVisible(z5, z6);
        }
        if (T()) {
            visible |= this.f13108b0.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        InterfaceC1088e interfaceC1088e = (InterfaceC1088e) this.f13094Q0.get();
        if (interfaceC1088e != null) {
            Chip chip = (Chip) interfaceC1088e;
            chip.b(chip.f11453F);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z5;
        boolean z6;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f13087N;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f13076B0) : 0);
        boolean state = true;
        if (this.f13076B0 != iC) {
            this.f13076B0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f13089O;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f13077C0) : 0);
        if (this.f13077C0 != iC2) {
            this.f13077C0 = iC2;
            zOnStateChange = true;
        }
        int iC3 = AbstractC1393a.c(iC2, iC);
        if ((this.D0 != iC3) | (this.f16505q.f16481c == null)) {
            this.D0 = iC3;
            k(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f13095R;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f13078E0) : 0;
        if (this.f13078E0 != colorForState) {
            this.f13078E0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f13092P0 == null || !AbstractC1521a.c(iArr)) ? 0 : this.f13092P0.getColorForState(iArr, this.f13079F0);
        if (this.f13079F0 != colorForState2) {
            this.f13079F0 = colorForState2;
        }
        C1483d c1483d = this.f13075A0.f14576g;
        int colorForState3 = (c1483d == null || (colorStateList = c1483d.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f13080G0);
        if (this.f13080G0 != colorForState3) {
            this.f13080G0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z5 = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.f13113g0) {
                    z5 = true;
                }
            }
            z5 = false;
        }
        if (this.f13081H0 == z5 || this.f13115i0 == null) {
            z6 = false;
        } else {
            float fQ = q();
            this.f13081H0 = z5;
            if (fQ != q()) {
                zOnStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f13086M0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f13082I0) : 0;
        if (this.f13082I0 != colorForState4) {
            this.f13082I0 = colorForState4;
            ColorStateList colorStateList6 = this.f13086M0;
            PorterDuff.Mode mode = this.f13088N0;
            this.f13085L0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (u(this.f13103W)) {
            state |= this.f13103W.setState(iArr);
        }
        if (u(this.f13115i0)) {
            state |= this.f13115i0.setState(iArr);
        }
        if (u(this.f13108b0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f13108b0.setState(iArr3);
        }
        int[] iArr4 = AbstractC1521a.f16014a;
        if (u(this.f13109c0)) {
            state |= this.f13109c0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z6) {
            v();
        }
        return state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(boolean z5) {
        if (this.f13113g0 != z5) {
            this.f13113g0 = z5;
            float fQ = q();
            if (!z5 && this.f13081H0) {
                this.f13081H0 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(Drawable drawable) {
        if (this.f13115i0 != drawable) {
            float fQ = q();
            this.f13115i0 = drawable;
            float fQ2 = q();
            U(this.f13115i0);
            o(this.f13115i0);
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f13116j0 != colorStateList) {
            this.f13116j0 = colorStateList;
            if (this.f13114h0 && (drawable = this.f13115i0) != null && this.f13113g0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
