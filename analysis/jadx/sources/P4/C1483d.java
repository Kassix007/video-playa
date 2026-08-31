package p4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import m1.l;

/* JADX INFO: renamed from: p4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1483d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f15887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15891e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15893h;
    public final float i;
    public final ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f15895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15896m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f15897n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1483d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, V3.a.f7971D);
        this.f15894k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = I1.Z(context, typedArrayObtainStyledAttributes, 3);
        I1.Z(context, typedArrayObtainStyledAttributes, 4);
        I1.Z(context, typedArrayObtainStyledAttributes, 5);
        this.f15889c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f15890d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i7 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f15895l = typedArrayObtainStyledAttributes.getResourceId(i7, 0);
        this.f15888b = typedArrayObtainStyledAttributes.getString(i7);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f15887a = I1.Z(context, typedArrayObtainStyledAttributes, 6);
        this.f15891e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f15892g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, V3.a.f7991t);
        this.f15893h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        String str;
        Typeface typeface = this.f15897n;
        int i = this.f15889c;
        if (typeface == null && (str = this.f15888b) != null) {
            this.f15897n = Typeface.create(str, i);
        }
        if (this.f15897n == null) {
            int i7 = this.f15890d;
            if (i7 == 1) {
                this.f15897n = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.f15897n = Typeface.SERIF;
            } else if (i7 != 3) {
                this.f15897n = Typeface.DEFAULT;
            } else {
                this.f15897n = Typeface.MONOSPACE;
            }
            this.f15897n = Typeface.create(this.f15897n, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Typeface b(Context context) {
        if (this.f15896m) {
            return this.f15897n;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.f15895l;
                ThreadLocal threadLocal = l.f15039a;
                Typeface typefaceA = context.isRestricted() ? null : l.a(context, i, new TypedValue(), 0, null, false, false);
                this.f15897n = typefaceA;
                if (typefaceA != null) {
                    this.f15897n = Typeface.create(typefaceA, this.f15889c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e7) {
                Log.d("TextAppearance", "Error loading font " + this.f15888b, e7);
            }
        }
        a();
        this.f15896m = true;
        return this.f15897n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Context context, K1 k12) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f15895l;
        if (i == 0) {
            this.f15896m = true;
        }
        if (this.f15896m) {
            k12.B(this.f15897n, true);
            return;
        }
        try {
            C1481b c1481b = new C1481b(this, k12);
            ThreadLocal threadLocal = l.f15039a;
            if (context.isRestricted()) {
                c1481b.a(-4);
            } else {
                l.a(context, i, new TypedValue(), 0, c1481b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f15896m = true;
            k12.A(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f15888b, e7);
            this.f15896m = true;
            k12.A(-3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Context context) {
        Typeface typefaceA = null;
        int i = this.f15895l;
        if (i != 0) {
            ThreadLocal threadLocal = l.f15039a;
            if (!context.isRestricted()) {
                typefaceA = l.a(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceA != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Context context, TextPaint textPaint, K1 k12) {
        f(context, textPaint, k12);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f15887a;
        textPaint.setShadowLayer(this.f15892g, this.f15891e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Context context, TextPaint textPaint, K1 k12) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f15897n);
        c(context, new C1482c(this, context, textPaint, k12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceE = P1.E(context.getResources().getConfiguration(), typeface);
        if (typefaceE != null) {
            typeface = typefaceE;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f15889c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f15894k);
        if (this.f15893h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
