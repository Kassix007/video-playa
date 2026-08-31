package p3;

import C.C0061a;
import M5.AbstractC0263y;
import P.C0345b;
import P.C0354f0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.util.Log;
import com.wnapp.smspariaz.R;
import i0.C1129a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import k1.AbstractC1175c;
import m.AbstractC1272O0;
import m.C1262J0;
import m.C1328r;
import m5.C1386y;
import n1.AbstractC1393a;
import r5.EnumC1580a;
import w.C1797n;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements w.A0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HashSet f15874g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15879e;
    public Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z0(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f15875a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f15877c = str;
        this.f15878d = str2;
        this.f15879e = Q3.a.f6587a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw k1.i.h(it);
        }
        this.f15876b = Collections.unmodifiableSet(hashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LayerDrawable E(C1262J0 c1262j0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = c1262j0.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = c1262j0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean G(S s6, long j) {
        return (s6.f15724q & j) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Path J(M m4) {
        Path path = new Path();
        float[] fArr = m4.f15687o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = m4.f15687o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (m4 instanceof N) {
            path.close();
        }
        if (m4.f15741h == null) {
            m4.f15741h = i(path);
        }
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void W(x0 x0Var, boolean z5, AbstractC1448b0 abstractC1448b0) {
        int i;
        S s6 = x0Var.f15861a;
        float fFloatValue = (z5 ? s6.f15726s : s6.f15728u).floatValue();
        if (abstractC1448b0 instanceof C1473t) {
            i = ((C1473t) abstractC1448b0).f15843q;
        } else if (!(abstractC1448b0 instanceof C1474u)) {
            return;
        } else {
            i = x0Var.f15861a.f15695A.f15843q;
        }
        int iO = o(i, fFloatValue);
        if (z5) {
            x0Var.f15864d.setColor(iO);
        } else {
            x0Var.f15865e.setColor(iO);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void X(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1328r.f14861b;
        }
        drawableMutate.setColorFilter(C1328r.c(i, mode));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(float f, float f7, float f8, float f9, float f10, boolean z5, boolean z6, float f11, float f12, K k7) {
        if (f == f11 && f7 == f12) {
            return;
        }
        if (f8 == 0.0f || f9 == 0.0f) {
            k7.e(f11, f12);
            return;
        }
        float fAbs = Math.abs(f8);
        float fAbs2 = Math.abs(f9);
        double radians = Math.toRadians(((double) f10) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d5 = ((double) (f - f11)) / 2.0d;
        double d7 = ((double) (f7 - f12)) / 2.0d;
        double d8 = (dSin * d7) + (dCos * d5);
        double d9 = (dCos * d7) + ((-dSin) * d5);
        double d10 = fAbs * fAbs;
        double d11 = fAbs2 * fAbs2;
        double d12 = d8 * d8;
        double d13 = d9 * d9;
        double d14 = (d13 / d11) + (d12 / d10);
        if (d14 > 0.99999d) {
            double dSqrt = Math.sqrt(d14) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d10 = fAbs * fAbs;
            d11 = fAbs2 * fAbs2;
        }
        double d15 = z5 == z6 ? -1.0d : 1.0d;
        double d16 = d10 * d11;
        double d17 = d10 * d13;
        double d18 = d11 * d12;
        double d19 = ((d16 - d17) - d18) / (d17 + d18);
        if (d19 < 0.0d) {
            d19 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d19) * d15;
        double d20 = fAbs;
        double d21 = fAbs2;
        double d22 = ((d20 * d9) / d21) * dSqrt2;
        double d23 = dSqrt2 * (-((d21 * d8) / d20));
        double d24 = ((dCos * d22) - (dSin * d23)) + (((double) (f + f11)) / 2.0d);
        double d25 = (dCos * d23) + (dSin * d22) + (((double) (f7 + f12)) / 2.0d);
        double d26 = (d8 - d22) / d20;
        double d27 = (d9 - d23) / d21;
        double d28 = ((-d8) - d22) / d20;
        double d29 = ((-d9) - d23) / d21;
        double d30 = (d27 * d27) + (d26 * d26);
        double dAcos = Math.acos(d26 / Math.sqrt(d30)) * (d27 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d27 * d29) + (d26 * d28)) / Math.sqrt(((d29 * d29) + (d28 * d28)) * d30);
        double dAcos2 = ((d26 * d29) - (d27 * d28) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z6 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z6 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d31 = dAcos2 % 6.283185307179586d;
        double d32 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d31) * 2.0d) / 3.141592653589793d);
        double d33 = d31 / ((double) iCeil);
        double d34 = d33 / 2.0d;
        double dSin2 = (Math.sin(d34) * 1.3333333333333333d) / (Math.cos(d34) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i7 = 0;
        int i8 = 0;
        while (i7 < iCeil) {
            double d35 = d32;
            double d36 = (((double) i7) * d33) + d35;
            double dCos2 = Math.cos(d36);
            double dSin3 = Math.sin(d36);
            int i9 = i7;
            int i10 = i8;
            fArr[i10] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i8 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d37 = d36 + d33;
            double dCos3 = Math.cos(d37);
            double dSin4 = Math.sin(d37);
            fArr[i10 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i10 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i10 + 4] = (float) dCos3;
            i8 = i10 + 6;
            fArr[i10 + 5] = (float) dSin4;
            i7 = i9 + 1;
            d32 = d35;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f10);
        matrix.postTranslate((float) d24, (float) d25);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f11;
        fArr[i - 1] = f12;
        for (int i11 = 0; i11 < i; i11 += 6) {
            k7.b(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(int[] iArr, int i) {
        for (int i7 : iArr) {
            if (i7 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1129a i(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C1129a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[PHI: r5
  0x007d: PHI (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:32:0x006f, B:35:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix k(i0.C1129a r9, i0.C1129a r10, p3.C1471q r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            p3.p r1 = r11.f15823a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.f13518d
            float r3 = r10.f13518d
            float r2 = r2 / r3
            float r3 = r9.f13519e
            float r4 = r10.f13519e
            float r3 = r3 / r4
            float r4 = r10.f13516b
            float r4 = -r4
            float r5 = r10.f13517c
            float r5 = -r5
            p3.q r6 = p3.C1471q.f15821c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f13516b
            float r9 = r9.f13517c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.f15824b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.f13518d
            float r2 = r2 / r11
            float r3 = r9.f13519e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.f13518d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.f13518d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.f13519e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.f13519e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.f13516b
            float r9 = r9.f13517c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.z0.k(i0.a, i0.a, p3.q):android.graphics.Matrix");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface n(String str, Integer num, int i) {
        int i7;
        boolean z5 = i == 2;
        i7 = num.intValue() > 500 ? z5 ? 3 : 1 : z5 ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i7);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i7);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i7);
            case "serif":
                return Typeface.create(Typeface.SERIF, i7);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i7);
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int o(int i, float f) {
        int i7 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i7 = 0;
        } else if (iRound <= 255) {
            i7 = iRound;
        }
        return (i & 16777215) | (i7 << 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ColorStateList p(Context context, int i) {
        int iC = AbstractC1272O0.c(context, R.attr.colorControlHighlight);
        int iB = AbstractC1272O0.b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC1272O0.f14699b;
        int[] iArr2 = AbstractC1272O0.f14701d;
        int iC2 = AbstractC1393a.c(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC1272O0.f14700c, AbstractC1272O0.f}, new int[]{iB, iC2, AbstractC1393a.c(iC, i), i});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void v(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void x(AbstractC1477x abstractC1477x, String str) {
        Y yS = abstractC1477x.f15750a.S(str);
        if (yS == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(yS instanceof AbstractC1477x)) {
            v("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (yS == abstractC1477x) {
            v("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        AbstractC1477x abstractC1477x2 = (AbstractC1477x) yS;
        if (abstractC1477x.i == null) {
            abstractC1477x.i = abstractC1477x2.i;
        }
        if (abstractC1477x.j == null) {
            abstractC1477x.j = abstractC1477x2.j;
        }
        if (abstractC1477x.f15859k == 0) {
            abstractC1477x.f15859k = abstractC1477x2.f15859k;
        }
        if (abstractC1477x.f15858h.isEmpty()) {
            abstractC1477x.f15858h = abstractC1477x2.f15858h;
        }
        try {
            if (abstractC1477x instanceof Z) {
                Z z5 = (Z) abstractC1477x;
                Z z6 = (Z) yS;
                if (z5.f15746m == null) {
                    z5.f15746m = z6.f15746m;
                }
                if (z5.f15747n == null) {
                    z5.f15747n = z6.f15747n;
                }
                if (z5.f15748o == null) {
                    z5.f15748o = z6.f15748o;
                }
                if (z5.f15749p == null) {
                    z5.f15749p = z6.f15749p;
                }
            } else {
                y((C1452d0) abstractC1477x, (C1452d0) yS);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC1477x2.f15860l;
        if (str2 != null) {
            x(abstractC1477x, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(C1452d0 c1452d0, C1452d0 c1452d02) {
        if (c1452d0.f15759m == null) {
            c1452d0.f15759m = c1452d02.f15759m;
        }
        if (c1452d0.f15760n == null) {
            c1452d0.f15760n = c1452d02.f15760n;
        }
        if (c1452d0.f15761o == null) {
            c1452d0.f15761o = c1452d02.f15761o;
        }
        if (c1452d0.f15762p == null) {
            c1452d0.f15762p = c1452d02.f15762p;
        }
        if (c1452d0.f15763q == null) {
            c1452d0.f15763q = c1452d02.f15763q;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(L l7, String str) {
        Y yS = l7.f15750a.S(str);
        if (yS == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(yS instanceof L)) {
            v("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (yS == l7) {
            v("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        L l8 = (L) yS;
        if (l7.f15679p == null) {
            l7.f15679p = l8.f15679p;
        }
        if (l7.f15680q == null) {
            l7.f15680q = l8.f15680q;
        }
        if (l7.f15681r == null) {
            l7.f15681r = l8.f15681r;
        }
        if (l7.f15682s == null) {
            l7.f15682s = l8.f15682s;
        }
        if (l7.f15683t == null) {
            l7.f15683t = l8.f15683t;
        }
        if (l7.f15684u == null) {
            l7.f15684u = l8.f15684u;
        }
        if (l7.f15685v == null) {
            l7.f15685v = l8.f15685v;
        }
        if (l7.i.isEmpty()) {
            l7.i = l8.i;
        }
        if (l7.f15764o == null) {
            l7.f15764o = l8.f15764o;
        }
        if (l7.f15755n == null) {
            l7.f15755n = l8.f15755n;
        }
        String str2 = l8.f15686w;
        if (str2 != null) {
            z(l7, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x0 A(Y y6) {
        x0 x0Var = new x0();
        c0(x0Var, S.a());
        B(y6, x0Var);
        return x0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(AbstractC1446a0 abstractC1446a0, x0 x0Var) {
        int i;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i = 0;
            if (abstractC1446a0 instanceof Y) {
                arrayList.add(0, (Y) abstractC1446a0);
            }
            Object obj = abstractC1446a0.f15751b;
            if (obj == null) {
                break;
            } else {
                abstractC1446a0 = (AbstractC1446a0) obj;
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            d0(x0Var, (Y) obj2);
        }
        x0 x0Var2 = (x0) this.f15877c;
        x0Var.f15866g = x0Var2.f15866g;
        x0Var.f = x0Var2.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int C() {
        int i;
        S s6 = ((x0) this.f15877c).f15861a;
        return (s6.f15719Y == 1 || (i = s6.f15720Z) == 2) ? s6.f15720Z : i == 1 ? 3 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path.FillType D() {
        int i = ((x0) this.f15877c).f15861a.f15721a0;
        return (i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList F(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC1175c.b(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1175c.b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return p(context, AbstractC1272O0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return p(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return p(context, AbstractC1272O0.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1175c.b(context, R.color.abc_tint_spinner);
            }
            if (g((int[]) this.f15876b, i)) {
                return AbstractC1272O0.d(context, R.attr.colorControlNormal);
            }
            if (g((int[]) this.f15879e, i)) {
                return AbstractC1175c.b(context, R.color.abc_tint_default);
            }
            if (g((int[]) this.f, i)) {
                return AbstractC1175c.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1175c.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = AbstractC1272O0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = AbstractC1272O0.f14699b;
            iArr2[0] = AbstractC1272O0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1272O0.f14702e;
            iArr2[1] = AbstractC1272O0.c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1272O0.f;
            iArr2[2] = AbstractC1272O0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1272O0.f14699b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1272O0.f14702e;
            iArr2[1] = AbstractC1272O0.c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1272O0.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path H(r rVar) {
        C c7 = rVar.f15825o;
        float fD = c7 != null ? c7.d(this) : 0.0f;
        C c8 = rVar.f15826p;
        float fE = c8 != null ? c8.e(this) : 0.0f;
        float fA = rVar.f15827q.a(this);
        float f = fD - fA;
        float f7 = fE - fA;
        float f8 = fD + fA;
        float f9 = fE + fA;
        if (rVar.f15741h == null) {
            float f10 = 2.0f * fA;
            rVar.f15741h = new C1129a(f, f7, f10, f10);
        }
        float f11 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f7);
        float f12 = fD + f11;
        float f13 = fE - f11;
        path.cubicTo(f12, f7, f8, f13, f8, fE);
        float f14 = fE + f11;
        path.cubicTo(f8, f14, f12, f9, fD, f9);
        float f15 = fD - f11;
        path.cubicTo(f15, f9, f, f14, f, fE);
        path.cubicTo(f, f13, f15, f7, fD, f7);
        path.close();
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path I(C1476w c1476w) {
        C c7 = c1476w.f15851o;
        float fD = c7 != null ? c7.d(this) : 0.0f;
        C c8 = c1476w.f15852p;
        float fE = c8 != null ? c8.e(this) : 0.0f;
        float fD2 = c1476w.f15853q.d(this);
        float fE2 = c1476w.f15854r.e(this);
        float f = fD - fD2;
        float f7 = fE - fE2;
        float f8 = fD + fD2;
        float f9 = fE + fE2;
        if (c1476w.f15741h == null) {
            c1476w.f15741h = new C1129a(f, f7, fD2 * 2.0f, 2.0f * fE2);
        }
        float f10 = fD2 * 0.5522848f;
        float f11 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f7);
        float f12 = fD + f10;
        float f13 = fE - f11;
        path.cubicTo(f12, f7, f8, f13, f8, fE);
        float f14 = fE + f11;
        path.cubicTo(f8, f14, f12, f9, fD, f9);
        float f15 = fD - f10;
        path.cubicTo(f15, f9, f, f14, f, fE);
        path.cubicTo(f, f13, f15, f7, fD, f7);
        path.close();
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Path K(p3.O r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            p3.C r2 = r1.f15692s
            r3 = 0
            if (r2 != 0) goto L10
            p3.C r4 = r1.f15693t
            if (r4 != 0) goto L10
            r2 = r3
        Le:
            r4 = r2
            goto L2c
        L10:
            if (r2 != 0) goto L19
            p3.C r2 = r1.f15693t
            float r2 = r2.e(r0)
            goto Le
        L19:
            p3.C r4 = r1.f15693t
            if (r4 != 0) goto L22
            float r2 = r2.d(r0)
            goto Le
        L22:
            float r2 = r2.d(r0)
            p3.C r4 = r1.f15693t
            float r4 = r4.e(r0)
        L2c:
            p3.C r5 = r1.f15690q
            float r5 = r5.d(r0)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r2 = java.lang.Math.min(r2, r5)
            p3.C r5 = r1.f15691r
            float r5 = r5.e(r0)
            float r5 = r5 / r6
            float r4 = java.lang.Math.min(r4, r5)
            p3.C r5 = r1.f15688o
            if (r5 == 0) goto L4e
            float r5 = r5.d(r0)
            r7 = r5
            goto L4f
        L4e:
            r7 = r3
        L4f:
            p3.C r5 = r1.f15689p
            if (r5 == 0) goto L59
            float r5 = r5.e(r0)
            r10 = r5
            goto L5a
        L59:
            r10 = r3
        L5a:
            p3.C r5 = r1.f15690q
            float r5 = r5.d(r0)
            p3.C r6 = r1.f15691r
            float r6 = r6.e(r0)
            i0.a r8 = r1.f15741h
            if (r8 != 0) goto L71
            i0.a r8 = new i0.a
            r8.<init>(r7, r10, r5, r6)
            r1.f15741h = r8
        L71:
            float r5 = r5 + r7
            float r15 = r10 + r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 == 0) goto L81
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 != 0) goto L83
        L81:
            r11 = r5
            goto Lcd
        L83:
            r1 = 1057841801(0x3f0d6289, float:0.5522848)
            float r3 = r2 * r1
            float r1 = r1 * r4
            float r14 = r10 + r4
            r6.moveTo(r7, r14)
            float r8 = r14 - r1
            float r11 = r7 + r2
            float r9 = r11 - r3
            r12 = r10
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r18 = r9
            float r2 = r5 - r2
            r6.lineTo(r2, r10)
            float r9 = r2 + r3
            r13 = r5
            r12 = r8
            r3 = r11
            r11 = r5
            r8 = r6
            r8.cubicTo(r9, r10, r11, r12, r13, r14)
            r5 = r14
            r14 = r9
            float r4 = r15 - r4
            r6.lineTo(r11, r4)
            float r10 = r4 + r1
            r17 = r15
            r16 = r2
            r13 = r10
            r12 = r11
            r11 = r6
            r11.cubicTo(r12, r13, r14, r15, r16, r17)
            r6.lineTo(r3, r15)
            r11 = r7
            r12 = r4
            r9 = r7
            r8 = r15
            r7 = r18
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r7 = r9
            r6.lineTo(r7, r5)
            goto Ldc
        Lcd:
            r6.moveTo(r7, r10)
            r6.lineTo(r11, r10)
            r6.lineTo(r11, r15)
            r6.lineTo(r7, r15)
            r6.lineTo(r7, r10)
        Ldc:
            r6.close()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.z0.K(p3.O):android.graphics.Path");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1129a L(C c7, C c8, C c9, C c10) {
        float fD = c7 != null ? c7.d(this) : 0.0f;
        float fE = c8 != null ? c8.e(this) : 0.0f;
        x0 x0Var = (x0) this.f15877c;
        C1129a c1129a = x0Var.f15866g;
        if (c1129a == null) {
            c1129a = x0Var.f;
        }
        return new C1129a(fD, fE, c9 != null ? c9.d(this) : c1129a.f13518d, c10 != null ? c10.e(this) : c1129a.f13519e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path M(X x6, boolean z5) {
        Path pathK;
        Path pathH;
        ((Stack) this.f15878d).push((x0) this.f15877c);
        x0 x0Var = new x0((x0) this.f15877c);
        this.f15877c = x0Var;
        d0(x0Var, x6);
        if (!r() || !f0()) {
            this.f15877c = (x0) ((Stack) this.f15878d).pop();
            return null;
        }
        if (x6 instanceof p0) {
            if (!z5) {
                v("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            p0 p0Var = (p0) x6;
            Y yS = x6.f15750a.S(p0Var.f15816o);
            if (yS == null) {
                v("Use reference '%s' not found", p0Var.f15816o);
                this.f15877c = (x0) ((Stack) this.f15878d).pop();
                return null;
            }
            if (!(yS instanceof X)) {
                this.f15877c = (x0) ((Stack) this.f15878d).pop();
                return null;
            }
            pathK = M((X) yS, false);
            if (pathK != null) {
                if (p0Var.f15741h == null) {
                    p0Var.f15741h = i(pathK);
                }
                Matrix matrix = p0Var.f15873n;
                if (matrix != null) {
                    pathK.transform(matrix);
                }
                if (((x0) this.f15877c).f15861a.f15708N != null && (pathH = h(x6, x6.f15741h)) != null) {
                    pathK.op(pathH, Path.Op.INTERSECT);
                }
                this.f15877c = (x0) ((Stack) this.f15878d).pop();
                return pathK;
            }
            return null;
        }
        if (x6 instanceof AbstractC1478y) {
            AbstractC1478y abstractC1478y = (AbstractC1478y) x6;
            if (x6 instanceof I) {
                t0 t0Var = new t0(((I) x6).f15666o);
                C1129a c1129a = x6.f15741h;
                Path path = t0Var.f15844a;
                if (c1129a == null) {
                    x6.f15741h = i(path);
                }
                pathK = path;
            } else {
                pathK = x6 instanceof O ? K((O) x6) : x6 instanceof r ? H((r) x6) : x6 instanceof C1476w ? I((C1476w) x6) : x6 instanceof M ? J((M) x6) : null;
            }
            if (pathK != null) {
                if (abstractC1478y.f15741h == null) {
                    abstractC1478y.f15741h = i(pathK);
                }
                Matrix matrix2 = abstractC1478y.f15871n;
                if (matrix2 != null) {
                    pathK.transform(matrix2);
                }
                pathK.setFillType(D());
            }
            return null;
        }
        if (!(x6 instanceof C1464j0)) {
            v("Invalid %s element found in clipPath definition", x6.o());
            return null;
        }
        C1464j0 c1464j0 = (C1464j0) x6;
        ArrayList arrayList = c1464j0.f15797n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C) c1464j0.f15797n.get(0)).d(this);
        ArrayList arrayList2 = c1464j0.f15798o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C) c1464j0.f15798o.get(0)).e(this);
        ArrayList arrayList3 = c1464j0.f15799p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C) c1464j0.f15799p.get(0)).d(this);
        ArrayList arrayList4 = c1464j0.f15800q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((C) c1464j0.f15800q.get(0)).e(this);
        }
        if (((x0) this.f15877c).f15861a.f15720Z != 1) {
            float fJ = j(c1464j0);
            if (((x0) this.f15877c).f15861a.f15720Z == 2) {
                fJ /= 2.0f;
            }
            fD -= fJ;
        }
        if (c1464j0.f15741h == null) {
            w0 w0Var = new w0(this, fD, fE2);
            u(c1464j0, w0Var);
            RectF rectF = (RectF) w0Var.i;
            c1464j0.f15741h = new C1129a(rectF.left, rectF.top, rectF.width(), ((RectF) w0Var.i).height());
        }
        Path path2 = new Path();
        u(c1464j0, new w0(this, fD + fD2, fE2 + fE, path2));
        Matrix matrix3 = c1464j0.f15782r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        path2.setFillType(D());
        pathK = path2;
        if (((x0) this.f15877c).f15861a.f15708N != null) {
            pathK.op(pathH, Path.Op.INTERSECT);
        }
        this.f15877c = (x0) ((Stack) this.f15878d).pop();
        return pathK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void N(C1129a c1129a) {
        Canvas canvas = (Canvas) this.f15875a;
        if (((x0) this.f15877c).f15861a.f15709O != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            F f = (F) ((B0.G0) this.f15876b).S(((x0) this.f15877c).f15861a.f15709O);
            U(f, c1129a);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            U(f, c1129a);
            canvas.restore();
            canvas.restore();
        }
        Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean O() {
        Y yS;
        int i = 0;
        if (((x0) this.f15877c).f15861a.f15733z.floatValue() >= 1.0f && ((x0) this.f15877c).f15861a.f15709O == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f15875a;
        int iFloatValue = (int) (((x0) this.f15877c).f15861a.f15733z.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.f15878d).push((x0) this.f15877c);
        x0 x0Var = new x0((x0) this.f15877c);
        this.f15877c = x0Var;
        String str = x0Var.f15861a.f15709O;
        if (str != null && ((yS = ((B0.G0) this.f15876b).S(str)) == null || !(yS instanceof F))) {
            v("Mask reference '%s' not found", ((x0) this.f15877c).f15861a.f15709O);
            ((x0) this.f15877c).f15861a.f15709O = null;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void P(T t6, C1129a c1129a, C1129a c1129a2, C1471q c1471q) {
        Canvas canvas = (Canvas) this.f15875a;
        if (c1129a.f13518d == 0.0f || c1129a.f13519e == 0.0f) {
            return;
        }
        if (c1471q == null && (c1471q = t6.f15755n) == null) {
            c1471q = C1471q.f15822d;
        }
        d0((x0) this.f15877c, t6);
        if (r()) {
            x0 x0Var = (x0) this.f15877c;
            x0Var.f = c1129a;
            if (!x0Var.f15861a.f15699E.booleanValue()) {
                C1129a c1129a3 = ((x0) this.f15877c).f;
                V(c1129a3.f13516b, c1129a3.f13517c, c1129a3.f13518d, c1129a3.f13519e);
            }
            l(t6, ((x0) this.f15877c).f);
            if (c1129a2 != null) {
                canvas.concat(k(((x0) this.f15877c).f, c1129a2, c1471q));
                ((x0) this.f15877c).f15866g = t6.f15764o;
            } else {
                C1129a c1129a4 = ((x0) this.f15877c).f;
                canvas.translate(c1129a4.f13516b, c1129a4.f13517c);
            }
            boolean zO = O();
            e0();
            R(t6, true);
            if (zO) {
                N(t6.f15741h);
            }
            b0(t6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: p3.a0 */
    /* JADX WARN: Multi-variable type inference failed */
    public void Q(AbstractC1446a0 abstractC1446a0) {
        C c7;
        String str;
        int iIndexOf;
        Set setH;
        C c8;
        Boolean bool;
        if (abstractC1446a0 instanceof G) {
            return;
        }
        Z();
        if ((abstractC1446a0 instanceof Y) && (bool = ((Y) abstractC1446a0).f15743d) != null) {
            ((x0) this.f15877c).f15867h = bool.booleanValue();
        }
        if (abstractC1446a0 instanceof T) {
            T t6 = (T) abstractC1446a0;
            P(t6, L(t6.f15734p, t6.f15735q, t6.f15736r, t6.f15737s), t6.f15764o, t6.f15755n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            if (abstractC1446a0 instanceof p0) {
                p0 p0Var = (p0) abstractC1446a0;
                Canvas canvas = (Canvas) this.f15875a;
                C c9 = p0Var.f15819r;
                if ((c9 == null || !c9.g()) && ((c8 = p0Var.f15820s) == null || !c8.g())) {
                    d0((x0) this.f15877c, p0Var);
                    if (r()) {
                        AbstractC1446a0 abstractC1446a0S = p0Var.f15750a.S(p0Var.f15816o);
                        if (abstractC1446a0S == null) {
                            v("Use reference '%s' not found", p0Var.f15816o);
                        } else {
                            Matrix matrix = p0Var.f15873n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            C c10 = p0Var.f15817p;
                            float fD = c10 != null ? c10.d(this) : 0.0f;
                            C c11 = p0Var.f15818q;
                            canvas.translate(fD, c11 != null ? c11.e(this) : 0.0f);
                            l(p0Var, p0Var.f15741h);
                            boolean zO = O();
                            ((Stack) this.f15879e).push(p0Var);
                            ((Stack) this.f).push(((Canvas) this.f15875a).getMatrix());
                            if (abstractC1446a0S instanceof T) {
                                T t7 = (T) abstractC1446a0S;
                                C1129a c1129aL = L(null, null, p0Var.f15819r, p0Var.f15820s);
                                Z();
                                P(t7, c1129aL, t7.f15764o, t7.f15755n);
                                Y();
                            } else if (abstractC1446a0S instanceof C1458g0) {
                                C c12 = p0Var.f15819r;
                                if (c12 == null) {
                                    c12 = new C(9, 100.0f);
                                }
                                C c13 = p0Var.f15820s;
                                if (c13 == null) {
                                    c13 = new C(9, 100.0f);
                                }
                                C1129a c1129aL2 = L(null, null, c12, c13);
                                Z();
                                C1458g0 c1458g0 = (C1458g0) abstractC1446a0S;
                                if (c1129aL2.f13518d != 0.0f && c1129aL2.f13519e != 0.0f) {
                                    C1471q c1471q = c1458g0.f15755n;
                                    if (c1471q == null) {
                                        c1471q = C1471q.f15822d;
                                    }
                                    d0((x0) this.f15877c, c1458g0);
                                    x0 x0Var = (x0) this.f15877c;
                                    x0Var.f = c1129aL2;
                                    if (!x0Var.f15861a.f15699E.booleanValue()) {
                                        C1129a c1129a = ((x0) this.f15877c).f;
                                        V(c1129a.f13516b, c1129a.f13517c, c1129a.f13518d, c1129a.f13519e);
                                    }
                                    C1129a c1129a2 = c1458g0.f15764o;
                                    if (c1129a2 != null) {
                                        canvas.concat(k(((x0) this.f15877c).f, c1129a2, c1471q));
                                        ((x0) this.f15877c).f15866g = c1458g0.f15764o;
                                    } else {
                                        C1129a c1129a3 = ((x0) this.f15877c).f;
                                        canvas.translate(c1129a3.f13516b, c1129a3.f13517c);
                                    }
                                    boolean zO2 = O();
                                    R(c1458g0, true);
                                    if (zO2) {
                                        N(c1458g0.f15741h);
                                    }
                                    b0(c1458g0);
                                }
                                Y();
                            } else {
                                Q(abstractC1446a0S);
                            }
                            ((Stack) this.f15879e).pop();
                            ((Stack) this.f).pop();
                            if (zO) {
                                N(p0Var.f15741h);
                            }
                            b0(p0Var);
                        }
                    }
                }
            } else if (abstractC1446a0 instanceof C1456f0) {
                C1456f0 c1456f0 = (C1456f0) abstractC1446a0;
                d0((x0) this.f15877c, c1456f0);
                if (r()) {
                    Matrix matrix2 = c1456f0.f15873n;
                    if (matrix2 != null) {
                        ((Canvas) this.f15875a).concat(matrix2);
                    }
                    l(c1456f0, c1456f0.f15741h);
                    boolean zO3 = O();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = c1456f0.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC1446a0 abstractC1446a02 = (AbstractC1446a0) it.next();
                        if (abstractC1446a02 instanceof U) {
                            U u6 = (U) abstractC1446a02;
                            if (u6.i() == null && ((setH = u6.h()) == null || (!setH.isEmpty() && setH.contains(language)))) {
                                Set setA = u6.a();
                                if (setA != null) {
                                    if (f15874g == null) {
                                        synchronized (z0.class) {
                                            HashSet hashSet = new HashSet();
                                            f15874g = hashSet;
                                            hashSet.add("Structure");
                                            f15874g.add("BasicStructure");
                                            f15874g.add("ConditionalProcessing");
                                            f15874g.add("Image");
                                            f15874g.add("Style");
                                            f15874g.add("ViewportAttribute");
                                            f15874g.add("Shape");
                                            f15874g.add("BasicText");
                                            f15874g.add("PaintAttribute");
                                            f15874g.add("BasicPaintAttribute");
                                            f15874g.add("OpacityAttribute");
                                            f15874g.add("BasicGraphicsAttribute");
                                            f15874g.add("Marker");
                                            f15874g.add("Gradient");
                                            f15874g.add("Pattern");
                                            f15874g.add("Clip");
                                            f15874g.add("BasicClip");
                                            f15874g.add("Mask");
                                            f15874g.add("View");
                                        }
                                    }
                                    if (setA.isEmpty() || !f15874g.containsAll(setA)) {
                                    }
                                }
                                Set setM = u6.m();
                                if (setM == null) {
                                    Set setN = u6.n();
                                    if (setN == null) {
                                        Q(abstractC1446a02);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setM.isEmpty();
                                }
                            }
                        }
                    }
                    if (zO3) {
                        N(c1456f0.f15741h);
                    }
                    b0(c1456f0);
                }
            } else if (abstractC1446a0 instanceof C1479z) {
                C1479z c1479z = (C1479z) abstractC1446a0;
                d0((x0) this.f15877c, c1479z);
                if (r()) {
                    Matrix matrix3 = c1479z.f15873n;
                    if (matrix3 != null) {
                        ((Canvas) this.f15875a).concat(matrix3);
                    }
                    l(c1479z, c1479z.f15741h);
                    boolean zO4 = O();
                    R(c1479z, true);
                    if (zO4) {
                        N(c1479z.f15741h);
                    }
                    b0(c1479z);
                }
            } else {
                if (abstractC1446a0 instanceof B) {
                    B b7 = (B) abstractC1446a0;
                    Canvas canvas2 = (Canvas) this.f15875a;
                    C c14 = b7.f15628r;
                    if (c14 != null && !c14.g() && (c7 = b7.f15629s) != null && !c7.g() && (str = b7.f15625o) != null) {
                        C1471q c1471q2 = b7.f15755n;
                        if (c1471q2 == null) {
                            c1471q2 = C1471q.f15822d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e7) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e7);
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            C1129a c1129a4 = new C1129a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            d0((x0) this.f15877c, b7);
                            if (r() && f0()) {
                                Matrix matrix4 = b7.f15630t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                C c15 = b7.f15626p;
                                float fD2 = c15 != null ? c15.d(this) : 0.0f;
                                C c16 = b7.f15627q;
                                float fE = c16 != null ? c16.e(this) : 0.0f;
                                float fD3 = b7.f15628r.d(this);
                                float fD4 = b7.f15629s.d(this);
                                x0 x0Var2 = (x0) this.f15877c;
                                x0Var2.f = new C1129a(fD2, fE, fD3, fD4);
                                if (!x0Var2.f15861a.f15699E.booleanValue()) {
                                    C1129a c1129a5 = ((x0) this.f15877c).f;
                                    V(c1129a5.f13516b, c1129a5.f13517c, c1129a5.f13518d, c1129a5.f13519e);
                                }
                                b7.f15741h = ((x0) this.f15877c).f;
                                b0(b7);
                                l(b7, b7.f15741h);
                                boolean zO5 = O();
                                e0();
                                canvas2.save();
                                canvas2.concat(k(((x0) this.f15877c).f, c1129a4, c1471q2));
                                canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((x0) this.f15877c).f15861a.f15723c0 != 3 ? 2 : 0));
                                canvas2.restore();
                                if (zO5) {
                                    N(b7.f15741h);
                                }
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof I) {
                    I i = (I) abstractC1446a0;
                    if (i.f15666o != null) {
                        d0((x0) this.f15877c, i);
                        if (r() && f0()) {
                            x0 x0Var3 = (x0) this.f15877c;
                            if (x0Var3.f15863c || x0Var3.f15862b) {
                                Matrix matrix5 = i.f15871n;
                                if (matrix5 != null) {
                                    ((Canvas) this.f15875a).concat(matrix5);
                                }
                                Path path = new t0(i.f15666o).f15844a;
                                if (i.f15741h == null) {
                                    i.f15741h = i(path);
                                }
                                b0(i);
                                m(i);
                                l(i, i.f15741h);
                                boolean zO6 = O();
                                x0 x0Var4 = (x0) this.f15877c;
                                if (x0Var4.f15862b) {
                                    int i7 = x0Var4.f15861a.f15714T;
                                    path.setFillType((i7 == 0 || i7 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    s(i, path);
                                }
                                if (((x0) this.f15877c).f15863c) {
                                    t(path);
                                }
                                T(i);
                                if (zO6) {
                                    N(i.f15741h);
                                }
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof O) {
                    O o6 = (O) abstractC1446a0;
                    C c17 = o6.f15690q;
                    if (c17 != null && o6.f15691r != null && !c17.g() && !o6.f15691r.g()) {
                        d0((x0) this.f15877c, o6);
                        if (r() && f0()) {
                            Matrix matrix6 = o6.f15871n;
                            if (matrix6 != null) {
                                ((Canvas) this.f15875a).concat(matrix6);
                            }
                            Path pathK = K(o6);
                            b0(o6);
                            m(o6);
                            l(o6, o6.f15741h);
                            boolean zO7 = O();
                            if (((x0) this.f15877c).f15862b) {
                                s(o6, pathK);
                            }
                            if (((x0) this.f15877c).f15863c) {
                                t(pathK);
                            }
                            if (zO7) {
                                N(o6.f15741h);
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof r) {
                    r rVar = (r) abstractC1446a0;
                    C c18 = rVar.f15827q;
                    if (c18 != null && !c18.g()) {
                        d0((x0) this.f15877c, rVar);
                        if (r() && f0()) {
                            Matrix matrix7 = rVar.f15871n;
                            if (matrix7 != null) {
                                ((Canvas) this.f15875a).concat(matrix7);
                            }
                            Path pathH = H(rVar);
                            b0(rVar);
                            m(rVar);
                            l(rVar, rVar.f15741h);
                            boolean zO8 = O();
                            if (((x0) this.f15877c).f15862b) {
                                s(rVar, pathH);
                            }
                            if (((x0) this.f15877c).f15863c) {
                                t(pathH);
                            }
                            if (zO8) {
                                N(rVar.f15741h);
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof C1476w) {
                    C1476w c1476w = (C1476w) abstractC1446a0;
                    C c19 = c1476w.f15853q;
                    if (c19 != null && c1476w.f15854r != null && !c19.g() && !c1476w.f15854r.g()) {
                        d0((x0) this.f15877c, c1476w);
                        if (r() && f0()) {
                            Matrix matrix8 = c1476w.f15871n;
                            if (matrix8 != null) {
                                ((Canvas) this.f15875a).concat(matrix8);
                            }
                            Path pathI = I(c1476w);
                            b0(c1476w);
                            m(c1476w);
                            l(c1476w, c1476w.f15741h);
                            boolean zO9 = O();
                            if (((x0) this.f15877c).f15862b) {
                                s(c1476w, pathI);
                            }
                            if (((x0) this.f15877c).f15863c) {
                                t(pathI);
                            }
                            if (zO9) {
                                N(c1476w.f15741h);
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof D) {
                    D d5 = (D) abstractC1446a0;
                    d0((x0) this.f15877c, d5);
                    if (r() && f0() && ((x0) this.f15877c).f15863c) {
                        Matrix matrix9 = d5.f15871n;
                        if (matrix9 != null) {
                            ((Canvas) this.f15875a).concat(matrix9);
                        }
                        C c20 = d5.f15635o;
                        float fD5 = c20 == null ? 0.0f : c20.d(this);
                        C c21 = d5.f15636p;
                        float fE2 = c21 == null ? 0.0f : c21.e(this);
                        C c22 = d5.f15637q;
                        float fD6 = c22 == null ? 0.0f : c22.d(this);
                        C c23 = d5.f15638r;
                        fE = c23 != null ? c23.e(this) : 0.0f;
                        if (d5.f15741h == null) {
                            d5.f15741h = new C1129a(Math.min(fD5, fD6), Math.min(fE2, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE2));
                        }
                        Path path2 = new Path();
                        path2.moveTo(fD5, fE2);
                        path2.lineTo(fD6, fE);
                        b0(d5);
                        m(d5);
                        l(d5, d5.f15741h);
                        boolean zO10 = O();
                        t(path2);
                        T(d5);
                        if (zO10) {
                            N(d5.f15741h);
                        }
                    }
                } else if (abstractC1446a0 instanceof N) {
                    N n7 = (N) abstractC1446a0;
                    d0((x0) this.f15877c, n7);
                    if (r() && f0()) {
                        x0 x0Var5 = (x0) this.f15877c;
                        if (x0Var5.f15863c || x0Var5.f15862b) {
                            Matrix matrix10 = n7.f15871n;
                            if (matrix10 != null) {
                                ((Canvas) this.f15875a).concat(matrix10);
                            }
                            if (n7.f15687o.length >= 2) {
                                Path pathJ = J(n7);
                                b0(n7);
                                m(n7);
                                l(n7, n7.f15741h);
                                boolean zO11 = O();
                                if (((x0) this.f15877c).f15862b) {
                                    s(n7, pathJ);
                                }
                                if (((x0) this.f15877c).f15863c) {
                                    t(pathJ);
                                }
                                T(n7);
                                if (zO11) {
                                    N(n7.f15741h);
                                }
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof M) {
                    M m4 = (M) abstractC1446a0;
                    d0((x0) this.f15877c, m4);
                    if (r() && f0()) {
                        x0 x0Var6 = (x0) this.f15877c;
                        if (x0Var6.f15863c || x0Var6.f15862b) {
                            Matrix matrix11 = m4.f15871n;
                            if (matrix11 != null) {
                                ((Canvas) this.f15875a).concat(matrix11);
                            }
                            if (m4.f15687o.length >= 2) {
                                Path pathJ2 = J(m4);
                                b0(m4);
                                int i8 = ((x0) this.f15877c).f15861a.f15714T;
                                pathJ2.setFillType((i8 == 0 || i8 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m(m4);
                                l(m4, m4.f15741h);
                                boolean zO12 = O();
                                if (((x0) this.f15877c).f15862b) {
                                    s(m4, pathJ2);
                                }
                                if (((x0) this.f15877c).f15863c) {
                                    t(pathJ2);
                                }
                                T(m4);
                                if (zO12) {
                                    N(m4.f15741h);
                                }
                            }
                        }
                    }
                } else if (abstractC1446a0 instanceof C1464j0) {
                    C1464j0 c1464j0 = (C1464j0) abstractC1446a0;
                    d0((x0) this.f15877c, c1464j0);
                    if (r()) {
                        Matrix matrix12 = c1464j0.f15782r;
                        if (matrix12 != null) {
                            ((Canvas) this.f15875a).concat(matrix12);
                        }
                        ArrayList arrayList = c1464j0.f15797n;
                        float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C) c1464j0.f15797n.get(0)).d(this);
                        ArrayList arrayList2 = c1464j0.f15798o;
                        float fE3 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C) c1464j0.f15798o.get(0)).e(this);
                        ArrayList arrayList3 = c1464j0.f15799p;
                        float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C) c1464j0.f15799p.get(0)).d(this);
                        ArrayList arrayList4 = c1464j0.f15800q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            fE = ((C) c1464j0.f15800q.get(0)).e(this);
                        }
                        int iC = C();
                        if (iC != 1) {
                            float fJ = j(c1464j0);
                            if (iC == 2) {
                                fJ /= 2.0f;
                            }
                            fD7 -= fJ;
                        }
                        if (c1464j0.f15741h == null) {
                            w0 w0Var = new w0(this, fD7, fE3);
                            u(c1464j0, w0Var);
                            RectF rectF = (RectF) w0Var.i;
                            c1464j0.f15741h = new C1129a(rectF.left, rectF.top, rectF.width(), ((RectF) w0Var.i).height());
                        }
                        b0(c1464j0);
                        m(c1464j0);
                        l(c1464j0, c1464j0.f15741h);
                        boolean zO13 = O();
                        u(c1464j0, new v0(this, fD7 + fD8, fE3 + fE));
                        if (zO13) {
                            N(c1464j0.f15741h);
                        }
                    }
                }
            }
        }
        Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void R(V v6, boolean z5) {
        if (z5) {
            ((Stack) this.f15879e).push(v6);
            ((Stack) this.f).push(((Canvas) this.f15875a).getMatrix());
        }
        Iterator it = v6.i.iterator();
        while (it.hasNext()) {
            Q((AbstractC1446a0) it.next());
        }
        if (z5) {
            ((Stack) this.f15879e).pop();
            ((Stack) this.f).pop();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[PHI: r2
  0x00ff: PHI (r2v1 float) = (r2v0 float), (r2v2 float) binds: [B:63:0x00f3, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(p3.E r13, p3.s0 r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f15875a
            android.graphics.Canvas r0 = (android.graphics.Canvas) r0
            r12.Z()
            java.lang.Float r1 = r13.f15645u
            r2 = 0
            if (r1 == 0) goto L37
            float r1 = r1.floatValue()
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L30
            float r1 = r14.f15838c
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto L22
            float r3 = r14.f15839d
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L37
        L22:
            float r3 = r14.f15839d
            double r3 = (double) r3
            double r5 = (double) r1
            double r3 = java.lang.Math.atan2(r3, r5)
            double r3 = java.lang.Math.toDegrees(r3)
            float r1 = (float) r3
            goto L38
        L30:
            java.lang.Float r1 = r13.f15645u
            float r1 = r1.floatValue()
            goto L38
        L37:
            r1 = r2
        L38:
            boolean r3 = r13.f15640p
            if (r3 == 0) goto L3f
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L4b
        L3f:
            java.lang.Object r3 = r12.f15877c
            p3.x0 r3 = (p3.x0) r3
            p3.S r3 = r3.f15861a
            p3.C r3 = r3.f15729v
            float r3 = r3.c()
        L4b:
            p3.x0 r4 = r12.A(r13)
            r12.f15877c = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            float r5 = r14.f15836a
            float r14 = r14.f15837b
            r4.preTranslate(r5, r14)
            r4.preRotate(r1)
            r4.preScale(r3, r3)
            p3.C r14 = r13.f15641q
            if (r14 == 0) goto L6c
            float r14 = r14.d(r12)
            goto L6d
        L6c:
            r14 = r2
        L6d:
            p3.C r1 = r13.f15642r
            if (r1 == 0) goto L76
            float r1 = r1.e(r12)
            goto L77
        L76:
            r1 = r2
        L77:
            p3.C r3 = r13.f15643s
            r5 = 1077936128(0x40400000, float:3.0)
            if (r3 == 0) goto L82
            float r3 = r3.d(r12)
            goto L83
        L82:
            r3 = r5
        L83:
            p3.C r6 = r13.f15644t
            if (r6 == 0) goto L8b
            float r5 = r6.e(r12)
        L8b:
            i0.a r6 = r13.f15764o
            if (r6 == 0) goto L11a
            float r7 = r6.f13518d
            float r7 = r3 / r7
            float r6 = r6.f13519e
            float r6 = r5 / r6
            p3.q r8 = r13.f15755n
            if (r8 == 0) goto L9c
            goto L9e
        L9c:
            p3.q r8 = p3.C1471q.f15822d
        L9e:
            p3.q r9 = p3.C1471q.f15821c
            boolean r9 = r8.equals(r9)
            p3.p r10 = r8.f15823a
            r11 = 2
            if (r9 != 0) goto Lb9
            int r8 = r8.f15824b
            if (r8 != r11) goto Lb3
            float r6 = java.lang.Math.max(r7, r6)
        Lb1:
            r7 = r6
            goto Lb8
        Lb3:
            float r6 = java.lang.Math.min(r7, r6)
            goto Lb1
        Lb8:
            r6 = r7
        Lb9:
            float r14 = -r14
            float r14 = r14 * r7
            float r1 = -r1
            float r1 = r1 * r6
            r4.preTranslate(r14, r1)
            r0.concat(r4)
            i0.a r14 = r13.f15764o
            float r1 = r14.f13518d
            float r1 = r1 * r7
            float r14 = r14.f13519e
            float r14 = r14 * r6
            int r8 = r10.ordinal()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 == r11) goto Leb
            r11 = 3
            if (r8 == r11) goto Le6
            r11 = 5
            if (r8 == r11) goto Leb
            r11 = 6
            if (r8 == r11) goto Le6
            r11 = 8
            if (r8 == r11) goto Leb
            r11 = 9
            if (r8 == r11) goto Le6
            r1 = r2
            goto Lef
        Le6:
            float r1 = r3 - r1
        Le8:
            float r1 = r2 - r1
            goto Lef
        Leb:
            float r1 = r3 - r1
            float r1 = r1 / r9
            goto Le8
        Lef:
            int r8 = r10.ordinal()
            switch(r8) {
                case 4: goto Lfb;
                case 5: goto Lfb;
                case 6: goto Lfb;
                case 7: goto Lf7;
                case 8: goto Lf7;
                case 9: goto Lf7;
                default: goto Lf6;
            }
        Lf6:
            goto Lff
        Lf7:
            float r14 = r5 - r14
        Lf9:
            float r2 = r2 - r14
            goto Lff
        Lfb:
            float r14 = r5 - r14
            float r14 = r14 / r9
            goto Lf9
        Lff:
            java.lang.Object r14 = r12.f15877c
            p3.x0 r14 = (p3.x0) r14
            p3.S r14 = r14.f15861a
            java.lang.Boolean r14 = r14.f15699E
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L110
            r12.V(r1, r2, r3, r5)
        L110:
            r4.reset()
            r4.preScale(r7, r6)
            r0.concat(r4)
            goto L133
        L11a:
            float r14 = -r14
            float r1 = -r1
            r4.preTranslate(r14, r1)
            r0.concat(r4)
            java.lang.Object r14 = r12.f15877c
            p3.x0 r14 = (p3.x0) r14
            p3.S r14 = r14.f15861a
            java.lang.Boolean r14 = r14.f15699E
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L133
            r12.V(r2, r2, r3, r5)
        L133:
            boolean r14 = r12.O()
            r0 = 0
            r12.R(r13, r0)
            if (r14 == 0) goto L142
            i0.a r13 = r13.f15741h
            r12.N(r13)
        L142:
            r12.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.z0.S(p3.E, p3.s0):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void T(AbstractC1478y abstractC1478y) {
        E e7;
        E e8;
        E e9;
        int i;
        float f;
        float f7;
        float f8;
        ArrayList arrayList;
        int size;
        S s6 = ((x0) this.f15877c).f15861a;
        String str = s6.f15701G;
        if (str == null && s6.f15702H == null && s6.f15703I == null) {
            return;
        }
        if (str == null) {
            e7 = null;
        } else {
            Y yS = abstractC1478y.f15750a.S(str);
            if (yS != null) {
                e7 = (E) yS;
            } else {
                v("Marker reference '%s' not found", ((x0) this.f15877c).f15861a.f15701G);
                e7 = null;
            }
        }
        String str2 = ((x0) this.f15877c).f15861a.f15702H;
        if (str2 == null) {
            e8 = null;
        } else {
            Y yS2 = abstractC1478y.f15750a.S(str2);
            if (yS2 != null) {
                e8 = (E) yS2;
            } else {
                v("Marker reference '%s' not found", ((x0) this.f15877c).f15861a.f15702H);
                e8 = null;
            }
        }
        String str3 = ((x0) this.f15877c).f15861a.f15703I;
        if (str3 == null) {
            e9 = null;
        } else {
            Y yS3 = abstractC1478y.f15750a.S(str3);
            if (yS3 != null) {
                e9 = (E) yS3;
            } else {
                v("Marker reference '%s' not found", ((x0) this.f15877c).f15861a.f15703I);
                e9 = null;
            }
        }
        float f9 = 0.0f;
        if (abstractC1478y instanceof I) {
            arrayList = new r0(this, ((I) abstractC1478y).f15666o).f15828a;
            f7 = 0.0f;
            i = 1;
        } else if (abstractC1478y instanceof D) {
            D d5 = (D) abstractC1478y;
            C c7 = d5.f15635o;
            float fD = c7 != null ? c7.d(this) : 0.0f;
            C c8 = d5.f15636p;
            float fE = c8 != null ? c8.e(this) : 0.0f;
            C c9 = d5.f15637q;
            float fD2 = c9 != null ? c9.d(this) : 0.0f;
            C c10 = d5.f15638r;
            float fE2 = c10 != null ? c10.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f10 = fD2 - fD;
            i = 1;
            float f11 = fE2 - fE;
            arrayList2.add(new s0(fD, fE, f10, f11));
            arrayList2.add(new s0(fD2, fE2, f10, f11));
            f7 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            M m4 = (M) abstractC1478y;
            int length = m4.f15687o.length;
            if (length < 2) {
                arrayList = null;
                f7 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = m4.f15687o;
                s0 s0Var = new s0(fArr[0], fArr[1], 0.0f, 0.0f);
                int i7 = 2;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (true) {
                    f = s0Var.f15837b;
                    f7 = f9;
                    f8 = s0Var.f15836a;
                    if (i7 >= length) {
                        break;
                    }
                    float[] fArr2 = m4.f15687o;
                    float f14 = fArr2[i7];
                    float f15 = fArr2[i7 + 1];
                    s0Var.a(f14, f15);
                    arrayList3.add(s0Var);
                    s0Var = new s0(f14, f15, f14 - f8, f15 - f);
                    i7 += 2;
                    f13 = f15;
                    f12 = f14;
                    f9 = f7;
                }
                if (m4 instanceof N) {
                    float[] fArr3 = m4.f15687o;
                    float f16 = fArr3[0];
                    if (f12 != f16) {
                        float f17 = fArr3[1];
                        if (f13 != f17) {
                            s0Var.a(f16, f17);
                            arrayList3.add(s0Var);
                            s0 s0Var2 = new s0(f16, f17, f16 - f8, f17 - f);
                            s0Var2.b((s0) arrayList3.get(0));
                            arrayList3.add(s0Var2);
                            arrayList3.set(0, s0Var2);
                        }
                    }
                } else {
                    arrayList3.add(s0Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        S s7 = ((x0) this.f15877c).f15861a;
        s7.f15703I = null;
        s7.f15702H = null;
        s7.f15701G = null;
        if (e7 != null) {
            S(e7, (s0) arrayList.get(0));
        }
        if (e8 != null && arrayList.size() > 2) {
            s0 s0Var3 = (s0) arrayList.get(0);
            s0 s0Var4 = (s0) arrayList.get(i);
            int i8 = 1;
            while (i8 < size - 1) {
                i8++;
                s0 s0Var5 = (s0) arrayList.get(i8);
                if (s0Var4.f15840e) {
                    float f18 = s0Var4.f15838c;
                    float f19 = s0Var4.f15839d;
                    float f20 = s0Var4.f15836a;
                    float f21 = f20 - s0Var3.f15836a;
                    float f22 = s0Var4.f15837b;
                    float f23 = ((f22 - s0Var3.f15837b) * f19) + (f21 * f18);
                    if (f23 == f7) {
                        f23 = ((s0Var5.f15836a - f20) * f18) + ((s0Var5.f15837b - f22) * f19);
                    }
                    if (f23 <= f7 && (f23 != f7 || (f18 <= f7 && f19 < f7))) {
                        s0Var4.f15838c = -f18;
                        s0Var4.f15839d = -f19;
                    }
                }
                S(e8, s0Var4);
                s0Var3 = s0Var4;
                s0Var4 = s0Var5;
            }
        }
        if (e9 != null) {
            S(e9, (s0) arrayList.get(size - 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void U(F f, C1129a c1129a) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.f15875a;
        Boolean bool = f.f15647n;
        if (bool == null || !bool.booleanValue()) {
            C c7 = f.f15649p;
            float fB = c7 != null ? c7.b(this, 1.0f) : 1.2f;
            C c8 = f.f15650q;
            float fB2 = c8 != null ? c8.b(this, 1.0f) : 1.2f;
            fD = fB * c1129a.f13518d;
            fE = fB2 * c1129a.f13519e;
        } else {
            C c9 = f.f15649p;
            fD = c9 != null ? c9.d(this) : c1129a.f13518d;
            C c10 = f.f15650q;
            fE = c10 != null ? c10.e(this) : c1129a.f13519e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        Z();
        x0 x0VarA = A(f);
        this.f15877c = x0VarA;
        x0VarA.f15861a.f15733z = Float.valueOf(1.0f);
        boolean zO = O();
        canvas.save();
        Boolean bool2 = f.f15648o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c1129a.f13516b, c1129a.f13517c);
            canvas.scale(c1129a.f13518d, c1129a.f13519e);
        }
        R(f, false);
        canvas.restore();
        if (zO) {
            N(c1129a);
        }
        Y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void V(float f, float f7, float f8, float f9) {
        float fD = f8 + f;
        float fE = f9 + f7;
        E.c0 c0Var = ((x0) this.f15877c).f15861a.f15700F;
        if (c0Var != null) {
            f += ((C) c0Var.f1555t).d(this);
            f7 += ((C) ((x0) this.f15877c).f15861a.f15700F.f1552q).e(this);
            fD -= ((C) ((x0) this.f15877c).f15861a.f15700F.f1553r).d(this);
            fE -= ((C) ((x0) this.f15877c).f15861a.f15700F.f1554s).e(this);
        }
        ((Canvas) this.f15875a).clipRect(f, f7, fD, fE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Y() {
        ((Canvas) this.f15875a).restore();
        this.f15877c = (x0) ((Stack) this.f15878d).pop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Z() {
        ((Canvas) this.f15875a).save();
        ((Stack) this.f15878d).push((x0) this.f15877c);
        this.f15877c = new x0((x0) this.f15877c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String a0(String str, boolean z5, boolean z6) {
        if (((x0) this.f15877c).f15867h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z5) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z6) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public boolean b() {
        return ((Boolean) ((C0354f0) this.f15878d).getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b0(X x6) {
        if (x6.f15751b == null || x6.f15741h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            C1129a c1129a = x6.f15741h;
            float f = c1129a.f13516b;
            float f7 = c1129a.f13517c;
            float fC = c1129a.c();
            C1129a c1129a2 = x6.f15741h;
            float f8 = c1129a2.f13517c;
            float fC2 = c1129a2.c();
            float fD = x6.f15741h.d();
            C1129a c1129a3 = x6.f15741h;
            float[] fArr = {f, f7, fC, f8, fC2, fD, c1129a3.f13516b, c1129a3.d()};
            matrix.preConcat(((Canvas) this.f15875a).getMatrix());
            matrix.mapPoints(fArr);
            float f9 = fArr[0];
            float f10 = fArr[1];
            RectF rectF = new RectF(f9, f10, f9, f10);
            for (int i = 2; i <= 6; i += 2) {
                float f11 = fArr[i];
                if (f11 < rectF.left) {
                    rectF.left = f11;
                }
                if (f11 > rectF.right) {
                    rectF.right = f11;
                }
                float f12 = fArr[i + 1];
                if (f12 < rectF.top) {
                    rectF.top = f12;
                }
                if (f12 > rectF.bottom) {
                    rectF.bottom = f12;
                }
            }
            X x7 = (X) ((Stack) this.f15879e).peek();
            C1129a c1129a4 = x7.f15741h;
            if (c1129a4 == null) {
                float f13 = rectF.left;
                float f14 = rectF.top;
                x7.f15741h = new C1129a(f13, f14, rectF.right - f13, rectF.bottom - f14);
                return;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            float f17 = rectF.right - f15;
            float f18 = rectF.bottom - f16;
            if (f15 < c1129a4.f13516b) {
                c1129a4.f13516b = f15;
            }
            if (f16 < c1129a4.f13517c) {
                c1129a4.f13517c = f16;
            }
            if (f15 + f17 > c1129a4.c()) {
                c1129a4.f13518d = (f15 + f17) - c1129a4.f13516b;
            }
            if (f16 + f18 > c1129a4.d()) {
                c1129a4.f13519e = (f16 + f18) - c1129a4.f13517c;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c0(x0 x0Var, S s6) {
        if (G(s6, 4096L)) {
            x0Var.f15861a.f15695A = s6.f15695A;
        }
        if (G(s6, 2048L)) {
            x0Var.f15861a.f15733z = s6.f15733z;
        }
        boolean zG = G(s6, 1L);
        C1473t c1473t = C1473t.f15842s;
        if (zG) {
            x0Var.f15861a.f15725r = s6.f15725r;
            AbstractC1448b0 abstractC1448b0 = s6.f15725r;
            x0Var.f15862b = (abstractC1448b0 == null || abstractC1448b0 == c1473t) ? false : true;
        }
        if (G(s6, 4L)) {
            x0Var.f15861a.f15726s = s6.f15726s;
        }
        if (G(s6, 6149L)) {
            W(x0Var, true, x0Var.f15861a.f15725r);
        }
        if (G(s6, 2L)) {
            x0Var.f15861a.f15714T = s6.f15714T;
        }
        if (G(s6, 8L)) {
            x0Var.f15861a.f15727t = s6.f15727t;
            AbstractC1448b0 abstractC1448b02 = s6.f15727t;
            x0Var.f15863c = (abstractC1448b02 == null || abstractC1448b02 == c1473t) ? false : true;
        }
        if (G(s6, 16L)) {
            x0Var.f15861a.f15728u = s6.f15728u;
        }
        if (G(s6, 6168L)) {
            W(x0Var, false, x0Var.f15861a.f15727t);
        }
        if (G(s6, 34359738368L)) {
            x0Var.f15861a.f15722b0 = s6.f15722b0;
        }
        if (G(s6, 32L)) {
            S s7 = x0Var.f15861a;
            C c7 = s6.f15729v;
            s7.f15729v = c7;
            x0Var.f15865e.setStrokeWidth(c7.a(this));
        }
        if (G(s6, 64L)) {
            S s8 = x0Var.f15861a;
            Paint paint = x0Var.f15865e;
            s8.f15715U = s6.f15715U;
            int iA = O.c.a(s6.f15715U);
            if (iA == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iA == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iA == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (G(s6, 128L)) {
            S s9 = x0Var.f15861a;
            Paint paint2 = x0Var.f15865e;
            s9.f15716V = s6.f15716V;
            int iA2 = O.c.a(s6.f15716V);
            if (iA2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iA2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iA2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (G(s6, 256L)) {
            x0Var.f15861a.f15730w = s6.f15730w;
            x0Var.f15865e.setStrokeMiter(s6.f15730w.floatValue());
        }
        if (G(s6, 512L)) {
            x0Var.f15861a.f15731x = s6.f15731x;
        }
        if (G(s6, 1024L)) {
            x0Var.f15861a.f15732y = s6.f15732y;
        }
        Typeface typefaceN = null;
        if (G(s6, 1536L)) {
            S s10 = x0Var.f15861a;
            Paint paint3 = x0Var.f15865e;
            C[] cArr = s10.f15731x;
            if (cArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = cArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i7 = 0; i7 < i; i7++) {
                    float fA = s10.f15731x[i7 % length].a(this);
                    fArr[i7] = fA;
                    f += fA;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = s10.f15732y.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (G(s6, 16384L)) {
            float textSize = ((x0) this.f15877c).f15864d.getTextSize();
            x0Var.f15861a.f15697C = s6.f15697C;
            x0Var.f15864d.setTextSize(s6.f15697C.b(this, textSize));
            x0Var.f15865e.setTextSize(s6.f15697C.b(this, textSize));
        }
        if (G(s6, 8192L)) {
            x0Var.f15861a.f15696B = s6.f15696B;
        }
        if (G(s6, 32768L)) {
            if (s6.f15698D.intValue() == -1 && x0Var.f15861a.f15698D.intValue() > 100) {
                S s11 = x0Var.f15861a;
                s11.f15698D = Integer.valueOf(s11.f15698D.intValue() - 100);
            } else if (s6.f15698D.intValue() != 1 || x0Var.f15861a.f15698D.intValue() >= 900) {
                x0Var.f15861a.f15698D = s6.f15698D;
            } else {
                S s12 = x0Var.f15861a;
                s12.f15698D = Integer.valueOf(s12.f15698D.intValue() + 100);
            }
        }
        if (G(s6, 65536L)) {
            x0Var.f15861a.f15717W = s6.f15717W;
        }
        if (G(s6, 106496L)) {
            S s13 = x0Var.f15861a;
            ArrayList arrayList = s13.f15696B;
            if (arrayList != null && ((B0.G0) this.f15876b) != null) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    typefaceN = n((String) obj, s13.f15698D, s13.f15717W);
                    if (typefaceN != null) {
                        break;
                    }
                }
            }
            if (typefaceN == null) {
                typefaceN = n("serif", s13.f15698D, s13.f15717W);
            }
            x0Var.f15864d.setTypeface(typefaceN);
            x0Var.f15865e.setTypeface(typefaceN);
        }
        if (G(s6, 131072L)) {
            S s14 = x0Var.f15861a;
            Paint paint4 = x0Var.f15865e;
            Paint paint5 = x0Var.f15864d;
            s14.f15718X = s6.f15718X;
            paint5.setStrikeThruText(s6.f15718X == 4);
            paint5.setUnderlineText(s6.f15718X == 2);
            paint4.setStrikeThruText(s6.f15718X == 4);
            paint4.setUnderlineText(s6.f15718X == 2);
        }
        if (G(s6, 68719476736L)) {
            x0Var.f15861a.f15719Y = s6.f15719Y;
        }
        if (G(s6, 262144L)) {
            x0Var.f15861a.f15720Z = s6.f15720Z;
        }
        if (G(s6, 524288L)) {
            x0Var.f15861a.f15699E = s6.f15699E;
        }
        if (G(s6, 2097152L)) {
            x0Var.f15861a.f15701G = s6.f15701G;
        }
        if (G(s6, 4194304L)) {
            x0Var.f15861a.f15702H = s6.f15702H;
        }
        if (G(s6, 8388608L)) {
            x0Var.f15861a.f15703I = s6.f15703I;
        }
        if (G(s6, 16777216L)) {
            x0Var.f15861a.f15704J = s6.f15704J;
        }
        if (G(s6, 33554432L)) {
            x0Var.f15861a.f15705K = s6.f15705K;
        }
        if (G(s6, 1048576L)) {
            x0Var.f15861a.f15700F = s6.f15700F;
        }
        if (G(s6, 268435456L)) {
            x0Var.f15861a.f15708N = s6.f15708N;
        }
        if (G(s6, 536870912L)) {
            x0Var.f15861a.f15721a0 = s6.f15721a0;
        }
        if (G(s6, 1073741824L)) {
            x0Var.f15861a.f15709O = s6.f15709O;
        }
        if (G(s6, 67108864L)) {
            x0Var.f15861a.f15706L = s6.f15706L;
        }
        if (G(s6, 134217728L)) {
            x0Var.f15861a.f15707M = s6.f15707M;
        }
        if (G(s6, 8589934592L)) {
            x0Var.f15861a.f15712R = s6.f15712R;
        }
        if (G(s6, 17179869184L)) {
            x0Var.f15861a.f15713S = s6.f15713S;
        }
        if (G(s6, 137438953472L)) {
            x0Var.f15861a.f15723c0 = s6.f15723c0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // w.A0
    public float d(float f) {
        return ((Number) ((kotlin.jvm.internal.n) this.f15875a).invoke(Float.valueOf(f))).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d0(x0 x0Var, Y y6) {
        int i = 0;
        boolean z5 = y6.f15751b == null;
        S s6 = x0Var.f15861a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        s6.f15704J = bool;
        if (!z5) {
            bool = Boolean.FALSE;
        }
        s6.f15699E = bool;
        s6.f15700F = null;
        s6.f15708N = null;
        s6.f15733z = fValueOf;
        s6.f15706L = C1473t.f15841r;
        s6.f15707M = fValueOf;
        s6.f15709O = null;
        s6.f15710P = null;
        s6.f15711Q = fValueOf;
        s6.f15712R = null;
        s6.f15713S = fValueOf;
        s6.f15722b0 = 1;
        S s7 = y6.f15744e;
        if (s7 != null) {
            c0(x0Var, s7);
        }
        ArrayList arrayList = ((F3.c) ((B0.G0) this.f15876b).f235s).f1948r;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = ((F3.c) ((B0.G0) this.f15876b).f235s).f1948r;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                C1466l c1466l = (C1466l) obj;
                if (C0061a.j(c1466l.f15785a, y6)) {
                    c0(x0Var, c1466l.f15786b);
                }
            }
        }
        S s8 = y6.f;
        if (s8 != null) {
            c0(x0Var, s8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public Object e(v.W w3, B5.e eVar, s5.c cVar) {
        Object objG = AbstractC0263y.g(new C1797n(this, w3, eVar, null), cVar);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e0() {
        int iO;
        S s6 = ((x0) this.f15877c).f15861a;
        AbstractC1448b0 abstractC1448b0 = s6.f15712R;
        if (abstractC1448b0 instanceof C1473t) {
            iO = ((C1473t) abstractC1448b0).f15843q;
        } else if (!(abstractC1448b0 instanceof C1474u)) {
            return;
        } else {
            iO = s6.f15695A.f15843q;
        }
        Float f = s6.f15713S;
        if (f != null) {
            iO = o(iO, f.floatValue());
        }
        ((Canvas) this.f15875a).drawColor(iO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f0() {
        Boolean bool = ((x0) this.f15877c).f15861a.f15705K;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path h(X x6, C1129a c1129a) {
        Path pathM;
        Y yS = x6.f15750a.S(((x0) this.f15877c).f15861a.f15708N);
        if (yS == null) {
            v("ClipPath reference '%s' not found", ((x0) this.f15877c).f15861a.f15708N);
            return null;
        }
        C1472s c1472s = (C1472s) yS;
        ((Stack) this.f15878d).push((x0) this.f15877c);
        this.f15877c = A(c1472s);
        Boolean bool = c1472s.f15835o;
        boolean z5 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z5) {
            matrix.preTranslate(c1129a.f13516b, c1129a.f13517c);
            matrix.preScale(c1129a.f13518d, c1129a.f13519e);
        }
        Matrix matrix2 = c1472s.f15873n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (AbstractC1446a0 abstractC1446a0 : c1472s.i) {
            if ((abstractC1446a0 instanceof X) && (pathM = M((X) abstractC1446a0, true)) != null) {
                path.op(pathM, Path.Op.UNION);
            }
        }
        if (((x0) this.f15877c).f15861a.f15708N != null) {
            if (c1472s.f15741h == null) {
                c1472s.f15741h = i(path);
            }
            Path pathH = h(c1472s, c1472s.f15741h);
            if (pathH != null) {
                path.op(pathH, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f15877c = (x0) ((Stack) this.f15878d).pop();
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float j(l0 l0Var) {
        y0 y0Var = new y0(this);
        u(l0Var, y0Var);
        return y0Var.f15872e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(X x6, C1129a c1129a) {
        Path pathH;
        if (((x0) this.f15877c).f15861a.f15708N == null || (pathH = h(x6, c1129a)) == null) {
            return;
        }
        ((Canvas) this.f15875a).clipPath(pathH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(X x6) {
        AbstractC1448b0 abstractC1448b0 = ((x0) this.f15877c).f15861a.f15725r;
        if (abstractC1448b0 instanceof H) {
            q(true, x6.f15741h, (H) abstractC1448b0);
        }
        AbstractC1448b0 abstractC1448b02 = ((x0) this.f15877c).f15861a.f15727t;
        if (abstractC1448b02 instanceof H) {
            q(false, x6.f15741h, (H) abstractC1448b02);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(boolean z5, C1129a c1129a, H h4) {
        float fB;
        float f;
        float fB2;
        float f7;
        float f8;
        float fB3;
        float f9;
        float fB4;
        float f10;
        Y yS = ((B0.G0) this.f15876b).S(h4.f15658q);
        if (yS == null) {
            v("%s reference '%s' not found", z5 ? "Fill" : "Stroke", h4.f15658q);
            AbstractC1448b0 abstractC1448b0 = h4.f15659r;
            if (abstractC1448b0 != null) {
                W((x0) this.f15877c, z5, abstractC1448b0);
                return;
            } else if (z5) {
                ((x0) this.f15877c).f15862b = false;
                return;
            } else {
                ((x0) this.f15877c).f15863c = false;
                return;
            }
        }
        boolean z6 = yS instanceof Z;
        C1473t c1473t = C1473t.f15841r;
        if (z6) {
            Z z7 = (Z) yS;
            String str = z7.f15860l;
            if (str != null) {
                x(z7, str);
            }
            Boolean bool = z7.i;
            boolean z8 = bool != null && bool.booleanValue();
            x0 x0Var = (x0) this.f15877c;
            Paint paint = z5 ? x0Var.f15864d : x0Var.f15865e;
            if (z8) {
                x0 x0Var2 = (x0) this.f15877c;
                f7 = 256.0f;
                C1129a c1129a2 = x0Var2.f15866g;
                if (c1129a2 == null) {
                    c1129a2 = x0Var2.f;
                }
                C c7 = z7.f15746m;
                float fD = c7 != null ? c7.d(this) : 0.0f;
                C c8 = z7.f15747n;
                fB3 = c8 != null ? c8.e(this) : 0.0f;
                f8 = 0.0f;
                C c9 = z7.f15748o;
                float fD2 = c9 != null ? c9.d(this) : c1129a2.f13518d;
                C c10 = z7.f15749p;
                f10 = fD2;
                fB4 = c10 != null ? c10.e(this) : 0.0f;
                f9 = fD;
            } else {
                f7 = 256.0f;
                f8 = 0.0f;
                C c11 = z7.f15746m;
                float fB5 = c11 != null ? c11.b(this, 1.0f) : 0.0f;
                C c12 = z7.f15747n;
                fB3 = c12 != null ? c12.b(this, 1.0f) : 0.0f;
                C c13 = z7.f15748o;
                float fB6 = c13 != null ? c13.b(this, 1.0f) : 1.0f;
                C c14 = z7.f15749p;
                f9 = fB5;
                fB4 = c14 != null ? c14.b(this, 1.0f) : 0.0f;
                f10 = fB6;
            }
            float f11 = fB3;
            Z();
            this.f15877c = A(z7);
            Matrix matrix = new Matrix();
            if (!z8) {
                matrix.preTranslate(c1129a.f13516b, c1129a.f13517c);
                matrix.preScale(c1129a.f13518d, c1129a.f13519e);
            }
            Matrix matrix2 = z7.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = z7.f15858h.size();
            if (size == 0) {
                Y();
                if (z5) {
                    ((x0) this.f15877c).f15862b = false;
                    return;
                } else {
                    ((x0) this.f15877c).f15863c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = z7.f15858h.iterator();
            int i = 0;
            float f12 = -1.0f;
            while (it.hasNext()) {
                Q q7 = (Q) ((AbstractC1446a0) it.next());
                Float f13 = q7.f15694h;
                float fFloatValue = f13 != null ? f13.floatValue() : f8;
                if (i == 0 || fFloatValue >= f12) {
                    fArr[i] = fFloatValue;
                    f12 = fFloatValue;
                } else {
                    fArr[i] = f12;
                }
                Z();
                d0((x0) this.f15877c, q7);
                S s6 = ((x0) this.f15877c).f15861a;
                C1473t c1473t2 = (C1473t) s6.f15706L;
                if (c1473t2 == null) {
                    c1473t2 = c1473t;
                }
                iArr[i] = o(c1473t2.f15843q, s6.f15707M.floatValue());
                i++;
                Y();
            }
            if ((f9 == f10 && f11 == fB4) || size == 1) {
                Y();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i7 = z7.f15859k;
            if (i7 != 0) {
                if (i7 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i7 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            Y();
            LinearGradient linearGradient = new LinearGradient(f9, f11, f10, fB4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((x0) this.f15877c).f15861a.f15726s.floatValue() * f7);
            paint.setAlpha(iFloatValue < 0 ? 0 : iFloatValue > 255 ? 255 : iFloatValue);
            return;
        }
        if (!(yS instanceof C1452d0)) {
            if (yS instanceof P) {
                P p7 = (P) yS;
                if (z5) {
                    if (G(p7.f15744e, 2147483648L)) {
                        x0 x0Var3 = (x0) this.f15877c;
                        S s7 = x0Var3.f15861a;
                        AbstractC1448b0 abstractC1448b02 = p7.f15744e.f15710P;
                        s7.f15725r = abstractC1448b02;
                        x0Var3.f15862b = abstractC1448b02 != null;
                    }
                    if (G(p7.f15744e, 4294967296L)) {
                        ((x0) this.f15877c).f15861a.f15726s = p7.f15744e.f15711Q;
                    }
                    if (G(p7.f15744e, 6442450944L)) {
                        x0 x0Var4 = (x0) this.f15877c;
                        W(x0Var4, z5, x0Var4.f15861a.f15725r);
                        return;
                    }
                    return;
                }
                if (G(p7.f15744e, 2147483648L)) {
                    x0 x0Var5 = (x0) this.f15877c;
                    S s8 = x0Var5.f15861a;
                    AbstractC1448b0 abstractC1448b03 = p7.f15744e.f15710P;
                    s8.f15727t = abstractC1448b03;
                    x0Var5.f15863c = abstractC1448b03 != null;
                }
                if (G(p7.f15744e, 4294967296L)) {
                    ((x0) this.f15877c).f15861a.f15728u = p7.f15744e.f15711Q;
                }
                if (G(p7.f15744e, 6442450944L)) {
                    x0 x0Var6 = (x0) this.f15877c;
                    W(x0Var6, z5, x0Var6.f15861a.f15727t);
                    return;
                }
                return;
            }
            return;
        }
        C1452d0 c1452d0 = (C1452d0) yS;
        String str2 = c1452d0.f15860l;
        if (str2 != null) {
            x(c1452d0, str2);
        }
        Boolean bool2 = c1452d0.i;
        boolean z9 = bool2 != null && bool2.booleanValue();
        x0 x0Var7 = (x0) this.f15877c;
        Paint paint2 = z5 ? x0Var7.f15864d : x0Var7.f15865e;
        if (z9) {
            C c15 = new C(9, 50.0f);
            C c16 = c1452d0.f15759m;
            float fD3 = c16 != null ? c16.d(this) : c15.d(this);
            C c17 = c1452d0.f15760n;
            fB = c17 != null ? c17.e(this) : c15.e(this);
            C c18 = c1452d0.f15761o;
            fB2 = c18 != null ? c18.a(this) : c15.a(this);
            f = fD3;
        } else {
            C c19 = c1452d0.f15759m;
            float fB7 = c19 != null ? c19.b(this, 1.0f) : 0.5f;
            C c20 = c1452d0.f15760n;
            fB = c20 != null ? c20.b(this, 1.0f) : 0.5f;
            C c21 = c1452d0.f15761o;
            f = fB7;
            fB2 = c21 != null ? c21.b(this, 1.0f) : 0.5f;
        }
        float f14 = fB;
        Z();
        this.f15877c = A(c1452d0);
        Matrix matrix3 = new Matrix();
        if (!z9) {
            matrix3.preTranslate(c1129a.f13516b, c1129a.f13517c);
            matrix3.preScale(c1129a.f13518d, c1129a.f13519e);
        }
        Matrix matrix4 = c1452d0.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c1452d0.f15858h.size();
        if (size2 == 0) {
            Y();
            if (z5) {
                ((x0) this.f15877c).f15862b = false;
                return;
            } else {
                ((x0) this.f15877c).f15863c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c1452d0.f15858h.iterator();
        int i8 = 0;
        float f15 = -1.0f;
        while (it2.hasNext()) {
            Q q8 = (Q) ((AbstractC1446a0) it2.next());
            Float f16 = q8.f15694h;
            float fFloatValue2 = f16 != null ? f16.floatValue() : 0.0f;
            if (i8 == 0 || fFloatValue2 >= f15) {
                fArr2[i8] = fFloatValue2;
                f15 = fFloatValue2;
            } else {
                fArr2[i8] = f15;
            }
            Z();
            d0((x0) this.f15877c, q8);
            S s9 = ((x0) this.f15877c).f15861a;
            C1473t c1473t3 = (C1473t) s9.f15706L;
            if (c1473t3 == null) {
                c1473t3 = c1473t;
            }
            iArr2[i8] = o(c1473t3.f15843q, s9.f15707M.floatValue());
            i8++;
            Y();
        }
        if (fB2 == 0.0f || size2 == 1) {
            Y();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i9 = c1452d0.f15859k;
        if (i9 != 0) {
            if (i9 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i9 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        Y();
        RadialGradient radialGradient = new RadialGradient(f, f14, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((x0) this.f15877c).f15861a.f15726s.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean r() {
        Boolean bool = ((x0) this.f15877c).f15861a.f15704J;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(p3.X r23, android.graphics.Path r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.Object r3 = r0.f15875a
            android.graphics.Canvas r3 = (android.graphics.Canvas) r3
            java.lang.Object r4 = r0.f15877c
            p3.x0 r4 = (p3.x0) r4
            p3.S r4 = r4.f15861a
            p3.b0 r4 = r4.f15725r
            boolean r5 = r4 instanceof p3.H
            if (r5 == 0) goto L236
            java.lang.Object r5 = r0.f15876b
            B0.G0 r5 = (B0.G0) r5
            p3.H r4 = (p3.H) r4
            java.lang.String r4 = r4.f15658q
            p3.Y r4 = r5.S(r4)
            boolean r5 = r4 instanceof p3.L
            if (r5 == 0) goto L236
            p3.L r4 = (p3.L) r4
            java.lang.Boolean r5 = r4.f15679p
            if (r5 == 0) goto L34
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            java.lang.String r8 = r4.f15686w
            if (r8 == 0) goto L3c
            z(r4, r8)
        L3c:
            r8 = 0
            if (r5 == 0) goto L68
            p3.C r5 = r4.f15682s
            if (r5 == 0) goto L48
            float r5 = r5.d(r0)
            goto L49
        L48:
            r5 = r8
        L49:
            p3.C r9 = r4.f15683t
            if (r9 == 0) goto L52
            float r9 = r9.e(r0)
            goto L53
        L52:
            r9 = r8
        L53:
            p3.C r10 = r4.f15684u
            if (r10 == 0) goto L5c
            float r10 = r10.d(r0)
            goto L5d
        L5c:
            r10 = r8
        L5d:
            p3.C r11 = r4.f15685v
            if (r11 == 0) goto L66
            float r11 = r11.e(r0)
            goto La8
        L66:
            r11 = r8
            goto La8
        L68:
            p3.C r5 = r4.f15682s
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L73
            float r5 = r5.b(r0, r9)
            goto L74
        L73:
            r5 = r8
        L74:
            p3.C r10 = r4.f15683t
            if (r10 == 0) goto L7d
            float r10 = r10.b(r0, r9)
            goto L7e
        L7d:
            r10 = r8
        L7e:
            p3.C r11 = r4.f15684u
            if (r11 == 0) goto L87
            float r11 = r11.b(r0, r9)
            goto L88
        L87:
            r11 = r8
        L88:
            p3.C r12 = r4.f15685v
            if (r12 == 0) goto L91
            float r9 = r12.b(r0, r9)
            goto L92
        L91:
            r9 = r8
        L92:
            i0.a r12 = r1.f15741h
            float r13 = r12.f13516b
            float r14 = r12.f13518d
            float r5 = r5 * r14
            float r5 = r5 + r13
            float r13 = r12.f13517c
            float r12 = r12.f13519e
            float r10 = r10 * r12
            float r10 = r10 + r13
            float r11 = r11 * r14
            float r9 = r9 * r12
            r21 = r11
            r11 = r9
            r9 = r10
            r10 = r21
        La8:
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L235
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 != 0) goto Lb2
            goto L235
        Lb2:
            p3.q r12 = r4.f15755n
            if (r12 == 0) goto Lb7
            goto Lb9
        Lb7:
            p3.q r12 = p3.C1471q.f15822d
        Lb9:
            r0.Z()
            r3.clipPath(r2)
            p3.x0 r2 = new p3.x0
            r2.<init>()
            p3.S r13 = p3.S.a()
            r0.c0(r2, r13)
            p3.S r13 = r2.f15861a
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r13.f15699E = r14
            r0.B(r4, r2)
            r0.f15877c = r2
            i0.a r2 = r1.f15741h
            android.graphics.Matrix r13 = r4.f15681r
            if (r13 == 0) goto L177
            r3.concat(r13)
            android.graphics.Matrix r13 = new android.graphics.Matrix
            r13.<init>()
            android.graphics.Matrix r14 = r4.f15681r
            boolean r14 = r14.invert(r13)
            if (r14 == 0) goto L177
            i0.a r2 = r1.f15741h
            float r14 = r2.f13516b
            float r15 = r2.f13517c
            float r2 = r2.c()
            r16 = 1
            i0.a r6 = r1.f15741h
            r17 = 0
            float r7 = r6.f13517c
            float r6 = r6.c()
            i0.a r8 = r1.f15741h
            float r8 = r8.d()
            r24 = r2
            i0.a r2 = r1.f15741h
            r19 = r5
            float r5 = r2.f13516b
            float r2 = r2.d()
            r20 = r2
            r2 = 8
            float[] r2 = new float[r2]
            r2[r17] = r14
            r2[r16] = r15
            r14 = 2
            r2[r14] = r24
            r15 = 3
            r2[r15] = r7
            r7 = 4
            r2[r7] = r6
            r6 = 5
            r2[r6] = r8
            r6 = 6
            r2[r6] = r5
            r5 = 7
            r2[r5] = r20
            r13.mapPoints(r2)
            android.graphics.RectF r5 = new android.graphics.RectF
            r7 = r2[r17]
            r8 = r2[r16]
            r5.<init>(r7, r8, r7, r8)
        L13c:
            if (r14 > r6) goto L167
            r7 = r2[r14]
            float r8 = r5.left
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto L148
            r5.left = r7
        L148:
            float r8 = r5.right
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L150
            r5.right = r7
        L150:
            int r7 = r14 + 1
            r7 = r2[r7]
            float r8 = r5.top
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto L15c
            r5.top = r7
        L15c:
            float r8 = r5.bottom
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L164
            r5.bottom = r7
        L164:
            int r14 = r14 + 2
            goto L13c
        L167:
            i0.a r2 = new i0.a
            float r6 = r5.left
            float r7 = r5.top
            float r8 = r5.right
            float r8 = r8 - r6
            float r5 = r5.bottom
            float r5 = r5 - r7
            r2.<init>(r6, r7, r8, r5)
            goto L17d
        L177:
            r19 = r5
            r16 = 1
            r17 = 0
        L17d:
            float r5 = r2.f13516b
            float r5 = r5 - r19
            float r5 = r5 / r10
            double r5 = (double) r5
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            float r5 = r5 * r10
            float r5 = r5 + r19
            float r6 = r2.f13517c
            float r6 = r6 - r9
            float r6 = r6 / r11
            double r6 = (double) r6
            double r6 = java.lang.Math.floor(r6)
            float r6 = (float) r6
            float r6 = r6 * r11
            float r6 = r6 + r9
            float r7 = r2.c()
            float r2 = r2.d()
            i0.a r8 = new i0.a
            r9 = 0
            r8.<init>(r9, r9, r10, r11)
            boolean r9 = r0.O()
        L1a9:
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 >= 0) goto L22b
            r13 = r5
        L1ae:
            int r14 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r14 >= 0) goto L224
            r8.f13516b = r13
            r8.f13517c = r6
            r0.Z()
            java.lang.Object r14 = r0.f15877c
            p3.x0 r14 = (p3.x0) r14
            p3.S r14 = r14.f15861a
            java.lang.Boolean r14 = r14.f15699E
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L1d7
            float r14 = r8.f13516b
            float r15 = r8.f13517c
            r24 = r2
            float r2 = r8.f13518d
            r18 = r5
            float r5 = r8.f13519e
            r0.V(r14, r15, r2, r5)
            goto L1db
        L1d7:
            r24 = r2
            r18 = r5
        L1db:
            i0.a r2 = r4.f15764o
            if (r2 == 0) goto L1e7
            android.graphics.Matrix r2 = k(r8, r2, r12)
            r3.concat(r2)
            goto L205
        L1e7:
            java.lang.Boolean r2 = r4.f15680q
            if (r2 == 0) goto L1f5
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f2
            goto L1f5
        L1f2:
            r2 = r17
            goto L1f7
        L1f5:
            r2 = r16
        L1f7:
            r3.translate(r13, r6)
            if (r2 != 0) goto L205
            i0.a r2 = r1.f15741h
            float r5 = r2.f13518d
            float r2 = r2.f13519e
            r3.scale(r5, r2)
        L205:
            java.util.List r2 = r4.i
            java.util.Iterator r2 = r2.iterator()
        L20b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L21b
            java.lang.Object r5 = r2.next()
            p3.a0 r5 = (p3.AbstractC1446a0) r5
            r0.Q(r5)
            goto L20b
        L21b:
            r0.Y()
            float r13 = r13 + r10
            r2 = r24
            r5 = r18
            goto L1ae
        L224:
            r24 = r2
            r18 = r5
            float r6 = r6 + r11
            goto L1a9
        L22b:
            if (r9 == 0) goto L232
            i0.a r1 = r4.f15741h
            r0.N(r1)
        L232:
            r0.Y()
        L235:
            return
        L236:
            java.lang.Object r1 = r0.f15877c
            p3.x0 r1 = (p3.x0) r1
            android.graphics.Paint r1 = r1.f15864d
            r3.drawPath(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.z0.s(p3.X, android.graphics.Path):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(Path path) {
        Canvas canvas = (Canvas) this.f15875a;
        x0 x0Var = (x0) this.f15877c;
        if (x0Var.f15861a.f15722b0 != 2) {
            canvas.drawPath(path, x0Var.f15865e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((x0) this.f15877c).f15865e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((x0) this.f15877c).f15865e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(l0 l0Var, Q2.g gVar) {
        float f;
        float fE;
        float fD;
        int iC;
        if (r()) {
            Iterator it = l0Var.i.iterator();
            boolean z5 = true;
            while (it.hasNext()) {
                AbstractC1446a0 abstractC1446a0 = (AbstractC1446a0) it.next();
                if (abstractC1446a0 instanceof o0) {
                    gVar.K(a0(((o0) abstractC1446a0).f15804c, z5, !it.hasNext()));
                } else if (gVar.x((l0) abstractC1446a0)) {
                    if (abstractC1446a0 instanceof m0) {
                        Z();
                        m0 m0Var = (m0) abstractC1446a0;
                        d0((x0) this.f15877c, m0Var);
                        if (r() && f0()) {
                            Y yS = m0Var.f15750a.S(m0Var.f15790n);
                            if (yS == null) {
                                v("TextPath reference '%s' not found", m0Var.f15790n);
                            } else {
                                I i = (I) yS;
                                t0 t0Var = new t0(i.f15666o);
                                Matrix matrix = i.f15871n;
                                Path path = t0Var.f15844a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C c7 = m0Var.f15791o;
                                fE = c7 != null ? c7.b(this, pathMeasure.getLength()) : 0.0f;
                                int iC2 = C();
                                if (iC2 != 1) {
                                    float fJ = j(m0Var);
                                    if (iC2 == 2) {
                                        fJ /= 2.0f;
                                    }
                                    fE -= fJ;
                                }
                                m(m0Var.f15792p);
                                boolean zO = O();
                                u(m0Var, new u0(this, path, fE));
                                if (zO) {
                                    N(m0Var.f15741h);
                                }
                            }
                        }
                        Y();
                    } else if (abstractC1446a0 instanceof C1462i0) {
                        Z();
                        C1462i0 c1462i0 = (C1462i0) abstractC1446a0;
                        d0((x0) this.f15877c, c1462i0);
                        if (r()) {
                            ArrayList arrayList = c1462i0.f15797n;
                            boolean z6 = arrayList != null && arrayList.size() > 0;
                            boolean z7 = gVar instanceof v0;
                            if (z7) {
                                float fD2 = !z6 ? ((v0) gVar).f15849e : ((C) c1462i0.f15797n.get(0)).d(this);
                                ArrayList arrayList2 = c1462i0.f15798o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((v0) gVar).f : ((C) c1462i0.f15798o.get(0)).e(this);
                                ArrayList arrayList3 = c1462i0.f15799p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C) c1462i0.f15799p.get(0)).d(this);
                                ArrayList arrayList4 = c1462i0.f15800q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE = ((C) c1462i0.f15800q.get(0)).e(this);
                                }
                                float f7 = fD2;
                                f = fE;
                                fE = f7;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z6 && (iC = C()) != 1) {
                                float fJ2 = j(c1462i0);
                                if (iC == 2) {
                                    fJ2 /= 2.0f;
                                }
                                fE -= fJ2;
                            }
                            m(c1462i0.f15780r);
                            if (z7) {
                                v0 v0Var = (v0) gVar;
                                v0Var.f15849e = fE + fD;
                                v0Var.f = fE + f;
                            }
                            boolean zO2 = O();
                            u(c1462i0, gVar);
                            if (zO2) {
                                N(c1462i0.f15741h);
                            }
                        }
                        Y();
                    } else if (abstractC1446a0 instanceof C1460h0) {
                        Z();
                        C1460h0 c1460h0 = (C1460h0) abstractC1446a0;
                        d0((x0) this.f15877c, c1460h0);
                        if (r()) {
                            m(c1460h0.f15778o);
                            Y yS2 = abstractC1446a0.f15750a.S(c1460h0.f15777n);
                            if (yS2 == null || !(yS2 instanceof l0)) {
                                v("Tref reference '%s' not found", c1460h0.f15777n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                w((l0) yS2, sb);
                                if (sb.length() > 0) {
                                    gVar.K(sb.toString());
                                }
                            }
                        }
                        Y();
                    }
                }
                z5 = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(l0 l0Var, StringBuilder sb) {
        Iterator it = l0Var.i.iterator();
        boolean z5 = true;
        while (it.hasNext()) {
            AbstractC1446a0 abstractC1446a0 = (AbstractC1446a0) it.next();
            if (abstractC1446a0 instanceof l0) {
                w((l0) abstractC1446a0, sb);
            } else if (abstractC1446a0 instanceof o0) {
                sb.append(a0(((o0) abstractC1446a0).f15804c, z5, !it.hasNext()));
            }
            z5 = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(B5.c cVar) {
        this.f15875a = (kotlin.jvm.internal.n) cVar;
        this.f15876b = new F.E(this);
        this.f15877c = new v.a0();
        Boolean bool = Boolean.FALSE;
        this.f15878d = C0345b.q(bool);
        this.f15879e = C0345b.q(bool);
        this.f = C0345b.q(bool);
    }
}
