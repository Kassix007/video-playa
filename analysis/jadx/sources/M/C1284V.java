package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import g.AbstractC1066a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: m.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1284V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f14714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d6.h f14715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d6.h f14716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d6.h f14717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d6.h f14718e;
    public d6.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d6.h f14719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d6.h f14720h;
    public final C1303e0 i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14721k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f14722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14723m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1284V(TextView textView) {
        this.f14714a = textView;
        this.i = new C1303e0(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d6.h c(Context context, C1328r c1328r, int i) {
        ColorStateList colorStateListF;
        synchronized (c1328r) {
            colorStateListF = c1328r.f14863a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        d6.h hVar = new d6.h();
        hVar.f12338b = true;
        hVar.f12339c = colorStateListF;
        return hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Drawable drawable, d6.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C1328r.e(drawable, hVar, this.f14714a.getDrawableState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        d6.h hVar = this.f14715b;
        TextView textView = this.f14714a;
        if (hVar != null || this.f14716c != null || this.f14717d != null || this.f14718e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f14715b);
            a(compoundDrawables[1], this.f14716c);
            a(compoundDrawables[2], this.f14717d);
            a(compoundDrawables[3], this.f14718e);
        }
        if (this.f == null && this.f14719g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.f14719g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ColorStateList d() {
        d6.h hVar = this.f14720h;
        if (hVar != null) {
            return (ColorStateList) hVar.f12339c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final PorterDuff.Mode e() {
        d6.h hVar = this.f14720h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f12340d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r4 = r26
            r6 = r27
            android.widget.TextView r1 = r0.f14714a
            android.content.Context r7 = r1.getContext()
            m.r r8 = m.C1328r.a()
            int[] r3 = g.AbstractC1066a.f12792h
            B0.G0 r9 = B0.G0.N(r7, r4, r3, r6)
            android.content.Context r2 = r1.getContext()
            java.lang.Object r5 = r9.f235s
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            w1.AbstractC1835K.l(r1, r2, r3, r4, r5, r6)
            r10 = r1
            java.lang.Object r1 = r9.f235s
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r11 = 0
            r12 = -1
            int r2 = r1.getResourceId(r11, r12)
            r13 = 3
            boolean r3 = r1.hasValue(r13)
            if (r3 == 0) goto L3d
            int r3 = r1.getResourceId(r13, r11)
            d6.h r3 = c(r7, r8, r3)
            r0.f14715b = r3
        L3d:
            r14 = 1
            boolean r3 = r1.hasValue(r14)
            if (r3 == 0) goto L4e
            int r3 = r1.getResourceId(r14, r11)
            d6.h r3 = c(r7, r8, r3)
            r0.f14716c = r3
        L4e:
            r15 = 4
            boolean r3 = r1.hasValue(r15)
            if (r3 == 0) goto L5f
            int r3 = r1.getResourceId(r15, r11)
            d6.h r3 = c(r7, r8, r3)
            r0.f14717d = r3
        L5f:
            r3 = 2
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L70
            int r5 = r1.getResourceId(r3, r11)
            d6.h r5 = c(r7, r8, r5)
            r0.f14718e = r5
        L70:
            r5 = 5
            boolean r16 = r1.hasValue(r5)
            if (r16 == 0) goto L81
            int r3 = r1.getResourceId(r5, r11)
            d6.h r3 = c(r7, r8, r3)
            r0.f = r3
        L81:
            r3 = 6
            boolean r17 = r1.hasValue(r3)
            if (r17 == 0) goto L92
            int r1 = r1.getResourceId(r3, r11)
            d6.h r1 = c(r7, r8, r1)
            r0.f14719g = r1
        L92:
            r9.R()
            android.text.method.TransformationMethod r1 = r10.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            int[] r3 = g.AbstractC1066a.f12804v
            r5 = 14
            r13 = 13
            r14 = 15
            if (r2 == r12) goto Le9
            B0.G0 r15 = new B0.G0
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r2, r3)
            r15.<init>(r7, r2)
            if (r1 != 0) goto Lc1
            boolean r21 = r2.hasValue(r5)
            if (r21 == 0) goto Lc1
            boolean r21 = r2.getBoolean(r5, r11)
            r22 = r21
            r21 = 1
            goto Lc5
        Lc1:
            r21 = r11
            r22 = r21
        Lc5:
            r0.m(r7, r15)
            int r12 = android.os.Build.VERSION.SDK_INT
            boolean r23 = r2.hasValue(r14)
            if (r23 == 0) goto Ld5
            java.lang.String r23 = r2.getString(r14)
            goto Ld7
        Ld5:
            r23 = 0
        Ld7:
            if (r12 < r9) goto Le4
            boolean r12 = r2.hasValue(r13)
            if (r12 == 0) goto Le4
            java.lang.String r2 = r2.getString(r13)
            goto Le5
        Le4:
            r2 = 0
        Le5:
            r15.R()
            goto Lf0
        Le9:
            r21 = r11
            r22 = r21
            r2 = 0
            r23 = 0
        Lf0:
            B0.G0 r12 = new B0.G0
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r4, r3, r6, r11)
            r12.<init>(r7, r3)
            if (r1 != 0) goto L107
            boolean r15 = r3.hasValue(r5)
            if (r15 == 0) goto L107
            boolean r22 = r3.getBoolean(r5, r11)
            r21 = 1
        L107:
            r5 = r22
            int r15 = android.os.Build.VERSION.SDK_INT
            boolean r22 = r3.hasValue(r14)
            if (r22 == 0) goto L115
            java.lang.String r23 = r3.getString(r14)
        L115:
            if (r15 < r9) goto L121
            boolean r9 = r3.hasValue(r13)
            if (r9 == 0) goto L121
            java.lang.String r2 = r3.getString(r13)
        L121:
            r9 = 28
            if (r15 < r9) goto L136
            boolean r9 = r3.hasValue(r11)
            if (r9 == 0) goto L136
            r9 = -1
            int r3 = r3.getDimensionPixelSize(r11, r9)
            if (r3 != 0) goto L136
            r3 = 0
            r10.setTextSize(r11, r3)
        L136:
            r0.m(r7, r12)
            r12.R()
            if (r1 != 0) goto L143
            if (r21 == 0) goto L143
            r10.setAllCaps(r5)
        L143:
            android.graphics.Typeface r1 = r0.f14722l
            if (r1 == 0) goto L155
            int r3 = r0.f14721k
            r9 = -1
            if (r3 != r9) goto L152
            int r3 = r0.j
            r10.setTypeface(r1, r3)
            goto L155
        L152:
            r10.setTypeface(r1)
        L155:
            if (r2 == 0) goto L15a
            m.AbstractC1280T.d(r10, r2)
        L15a:
            if (r23 == 0) goto L163
            android.os.LocaleList r1 = m.AbstractC1278S.a(r23)
            m.AbstractC1278S.b(r10, r1)
        L163:
            m.e0 r9 = r0.i
            android.content.Context r12 = r9.j
            int[] r3 = g.AbstractC1066a.i
            android.content.res.TypedArray r5 = r12.obtainStyledAttributes(r4, r3, r6, r11)
            android.widget.TextView r1 = r9.i
            android.content.Context r2 = r1.getContext()
            r14 = 5
            r15 = 2
            w1.AbstractC1835K.l(r1, r2, r3, r4, r5, r6)
            boolean r1 = r5.hasValue(r14)
            if (r1 == 0) goto L184
            int r1 = r5.getInt(r14, r11)
            r9.f14776a = r1
        L184:
            r1 = 4
            boolean r2 = r5.hasValue(r1)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L192
            float r1 = r5.getDimension(r1, r6)
            goto L193
        L192:
            r1 = r6
        L193:
            boolean r2 = r5.hasValue(r15)
            if (r2 == 0) goto L19f
            float r2 = r5.getDimension(r15, r6)
        L19d:
            r14 = 1
            goto L1a1
        L19f:
            r2 = r6
            goto L19d
        L1a1:
            boolean r19 = r5.hasValue(r14)
            if (r19 == 0) goto L1ad
            float r20 = r5.getDimension(r14, r6)
        L1ab:
            r14 = 3
            goto L1b0
        L1ad:
            r20 = r6
            goto L1ab
        L1b0:
            boolean r18 = r5.hasValue(r14)
            r27 = r6
            if (r18 == 0) goto L1e7
            int r6 = r5.getResourceId(r14, r11)
            if (r6 <= 0) goto L1e7
            android.content.res.Resources r14 = r5.getResources()
            android.content.res.TypedArray r6 = r14.obtainTypedArray(r6)
            int r14 = r6.length()
            int[] r13 = new int[r14]
            if (r14 <= 0) goto L1e4
        L1ce:
            if (r11 >= r14) goto L1db
            r15 = -1
            int r24 = r6.getDimensionPixelSize(r11, r15)
            r13[r11] = r24
            int r11 = r11 + 1
            r15 = 2
            goto L1ce
        L1db:
            int[] r11 = m.C1303e0.b(r13)
            r9.f = r11
            r9.i()
        L1e4:
            r6.recycle()
        L1e7:
            r5.recycle()
            boolean r5 = r9.j()
            if (r5 == 0) goto L227
            int r5 = r9.f14776a
            r14 = 1
            if (r5 != r14) goto L22a
            boolean r5 = r9.f14781g
            if (r5 != 0) goto L223
            android.content.res.Resources r5 = r12.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r6 != 0) goto L20d
            r2 = 1094713344(0x41400000, float:12.0)
            r15 = 2
            float r2 = android.util.TypedValue.applyDimension(r15, r2, r5)
            goto L20e
        L20d:
            r15 = 2
        L20e:
            int r6 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r6 != 0) goto L218
            r6 = 1121976320(0x42e00000, float:112.0)
            float r20 = android.util.TypedValue.applyDimension(r15, r6, r5)
        L218:
            r5 = r20
            int r6 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r6 != 0) goto L220
            r1 = 1065353216(0x3f800000, float:1.0)
        L220:
            r9.k(r2, r5, r1)
        L223:
            r9.h()
            goto L22a
        L227:
            r1 = 0
            r9.f14776a = r1
        L22a:
            boolean r1 = m.g1.f14792c
            if (r1 == 0) goto L25b
            int r1 = r9.f14776a
            if (r1 == 0) goto L25b
            int[] r1 = r9.f
            int r2 = r1.length
            if (r2 <= 0) goto L25b
            int r2 = m.AbstractC1280T.a(r10)
            float r2 = (float) r2
            int r2 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r2 == 0) goto L257
            float r1 = r9.f14779d
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.f14780e
            int r2 = java.lang.Math.round(r2)
            float r5 = r9.f14778c
            int r5 = java.lang.Math.round(r5)
            r6 = 0
            m.AbstractC1280T.b(r10, r1, r2, r5, r6)
            goto L25b
        L257:
            r6 = 0
            m.AbstractC1280T.c(r10, r1, r6)
        L25b:
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r4, r3)
            r2 = 8
            r9 = -1
            int r2 = r1.getResourceId(r2, r9)
            if (r2 == r9) goto L26f
            android.graphics.drawable.Drawable r2 = r8.b(r7, r2)
        L26c:
            r3 = 13
            goto L271
        L26f:
            r2 = 0
            goto L26c
        L271:
            int r3 = r1.getResourceId(r3, r9)
            if (r3 == r9) goto L27c
            android.graphics.drawable.Drawable r3 = r8.b(r7, r3)
            goto L27d
        L27c:
            r3 = 0
        L27d:
            r4 = 9
            int r4 = r1.getResourceId(r4, r9)
            if (r4 == r9) goto L28b
            android.graphics.drawable.Drawable r4 = r8.b(r7, r4)
        L289:
            r5 = 6
            goto L28d
        L28b:
            r4 = 0
            goto L289
        L28d:
            int r5 = r1.getResourceId(r5, r9)
            if (r5 == r9) goto L298
            android.graphics.drawable.Drawable r5 = r8.b(r7, r5)
            goto L299
        L298:
            r5 = 0
        L299:
            r6 = 10
            int r6 = r1.getResourceId(r6, r9)
            if (r6 == r9) goto L2a6
            android.graphics.drawable.Drawable r6 = r8.b(r7, r6)
            goto L2a7
        L2a6:
            r6 = 0
        L2a7:
            r11 = 7
            int r11 = r1.getResourceId(r11, r9)
            if (r11 == r9) goto L2b3
            android.graphics.drawable.Drawable r8 = r8.b(r7, r11)
            goto L2b4
        L2b3:
            r8 = 0
        L2b4:
            if (r6 != 0) goto L30b
            if (r8 == 0) goto L2b9
            goto L30b
        L2b9:
            if (r2 != 0) goto L2c1
            if (r3 != 0) goto L2c1
            if (r4 != 0) goto L2c1
            if (r5 == 0) goto L32e
        L2c1:
            android.graphics.drawable.Drawable[] r6 = r10.getCompoundDrawablesRelative()
            r22 = 0
            r8 = r6[r22]
            if (r8 != 0) goto L2d1
            r23 = 2
            r9 = r6[r23]
            if (r9 == 0) goto L2d4
        L2d1:
            r18 = 3
            goto L2f6
        L2d4:
            android.graphics.drawable.Drawable[] r6 = r10.getCompoundDrawables()
            if (r2 == 0) goto L2db
            goto L2dd
        L2db:
            r2 = r6[r22]
        L2dd:
            if (r3 == 0) goto L2e0
            goto L2e4
        L2e0:
            r19 = 1
            r3 = r6[r19]
        L2e4:
            if (r4 == 0) goto L2e7
            goto L2eb
        L2e7:
            r23 = 2
            r4 = r6[r23]
        L2eb:
            if (r5 == 0) goto L2ee
            goto L2f2
        L2ee:
            r18 = 3
            r5 = r6[r18]
        L2f2:
            r10.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r5)
            goto L32e
        L2f6:
            if (r3 == 0) goto L2f9
            goto L2fd
        L2f9:
            r19 = 1
            r3 = r6[r19]
        L2fd:
            if (r5 == 0) goto L302
        L2ff:
            r23 = 2
            goto L305
        L302:
            r5 = r6[r18]
            goto L2ff
        L305:
            r2 = r6[r23]
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r3, r2, r5)
            goto L32e
        L30b:
            android.graphics.drawable.Drawable[] r2 = r10.getCompoundDrawablesRelative()
            if (r6 == 0) goto L312
            goto L316
        L312:
            r22 = 0
            r6 = r2[r22]
        L316:
            if (r3 == 0) goto L319
            goto L31d
        L319:
            r19 = 1
            r3 = r2[r19]
        L31d:
            if (r8 == 0) goto L320
            goto L324
        L320:
            r23 = 2
            r8 = r2[r23]
        L324:
            if (r5 == 0) goto L327
            goto L32b
        L327:
            r18 = 3
            r5 = r2[r18]
        L32b:
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r3, r8, r5)
        L32e:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L351
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L34a
            r6 = 0
            int r3 = r1.getResourceId(r2, r6)
            if (r3 == 0) goto L34a
            android.content.res.ColorStateList r3 = k1.AbstractC1175c.b(r7, r3)
            if (r3 == 0) goto L34a
            goto L34e
        L34a:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L34e:
            r10.setCompoundDrawableTintList(r3)
        L351:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            r9 = -1
            if (r3 == 0) goto L366
            int r2 = r1.getInt(r2, r9)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = m.AbstractC1313j0.b(r2, r3)
            r10.setCompoundDrawableTintMode(r2)
        L366:
            r2 = 15
            int r2 = r1.getDimensionPixelSize(r2, r9)
            r3 = 18
            int r3 = r1.getDimensionPixelSize(r3, r9)
            r4 = 19
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L398
            android.util.TypedValue r5 = r1.peekValue(r4)
            if (r5 == 0) goto L390
            int r6 = r5.type
            r14 = 5
            if (r6 != r14) goto L390
            int r4 = r5.data
            r9 = r4 & 15
            float r4 = android.util.TypedValue.complexToFloat(r4)
            r5 = r9
            r9 = -1
            goto L39c
        L390:
            r9 = -1
            int r4 = r1.getDimensionPixelSize(r4, r9)
            float r4 = (float) r4
        L396:
            r5 = r9
            goto L39c
        L398:
            r9 = -1
            r4 = r27
            goto L396
        L39c:
            r1.recycle()
            if (r2 == r9) goto L3a4
            com.google.android.gms.internal.measurement.P1.S(r10, r2)
        L3a4:
            if (r3 == r9) goto L3a9
            com.google.android.gms.internal.measurement.P1.U(r10, r3)
        L3a9:
            int r1 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r1 == 0) goto L3d1
            if (r5 != r9) goto L3b4
            int r1 = (int) r4
            com.google.android.gms.internal.measurement.P1.V(r10, r1)
            return
        L3b4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L3be
            A1.l.i(r10, r5, r4)
            return
        L3be:
            android.content.res.Resources r1 = r10.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r5, r4, r1)
            int r1 = java.lang.Math.round(r1)
            com.google.android.gms.internal.measurement.P1.V(r10, r1)
        L3d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1284V.f(android.util.AttributeSet, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1066a.f12804v);
        B0.G0 g02 = new B0.G0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f14714a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, g02);
        if (i7 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC1280T.d(textView, string);
        }
        g02.R();
        Typeface typeface = this.f14722l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i, int i7, int i8, int i9) {
        C1303e0 c1303e0 = this.i;
        if (c1303e0.j()) {
            DisplayMetrics displayMetrics = c1303e0.j.getResources().getDisplayMetrics();
            c1303e0.k(TypedValue.applyDimension(i9, i, displayMetrics), TypedValue.applyDimension(i9, i7, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (c1303e0.h()) {
                c1303e0.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int[] iArr, int i) {
        C1303e0 c1303e0 = this.i;
        if (c1303e0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1303e0.j.getResources().getDisplayMetrics();
                    for (int i7 = 0; i7 < length; i7++) {
                        iArrCopyOf[i7] = Math.round(TypedValue.applyDimension(i, iArr[i7], displayMetrics));
                    }
                }
                c1303e0.f = C1303e0.b(iArrCopyOf);
                if (!c1303e0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1303e0.f14781g = false;
            }
            if (c1303e0.h()) {
                c1303e0.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        C1303e0 c1303e0 = this.i;
        if (c1303e0.j()) {
            if (i == 0) {
                c1303e0.f14776a = 0;
                c1303e0.f14779d = -1.0f;
                c1303e0.f14780e = -1.0f;
                c1303e0.f14778c = -1.0f;
                c1303e0.f = new int[0];
                c1303e0.f14777b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(k1.i.i(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1303e0.j.getResources().getDisplayMetrics();
            c1303e0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1303e0.h()) {
                c1303e0.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(ColorStateList colorStateList) {
        if (this.f14720h == null) {
            this.f14720h = new d6.h();
        }
        d6.h hVar = this.f14720h;
        hVar.f12339c = colorStateList;
        hVar.f12338b = colorStateList != null;
        this.f14715b = hVar;
        this.f14716c = hVar;
        this.f14717d = hVar;
        this.f14718e = hVar;
        this.f = hVar;
        this.f14719g = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(PorterDuff.Mode mode) {
        if (this.f14720h == null) {
            this.f14720h = new d6.h();
        }
        d6.h hVar = this.f14720h;
        hVar.f12340d = mode;
        hVar.f12337a = mode != null;
        this.f14715b = hVar;
        this.f14716c = hVar;
        this.f14717d = hVar;
        this.f14718e = hVar;
        this.f = hVar;
        this.f14719g = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(Context context, B0.G0 g02) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) g02.f235s;
        this.j = typedArray.getInt(2, i);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int i8 = typedArray.getInt(11, -1);
            this.f14721k = i8;
            if (i8 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f14723m = false;
                int i9 = typedArray.getInt(1, 1);
                if (i9 == 1) {
                    this.f14722l = Typeface.SANS_SERIF;
                    return;
                } else if (i9 == 2) {
                    this.f14722l = Typeface.SERIF;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f14722l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f14722l = null;
        int i10 = typedArray.hasValue(12) ? 12 : 10;
        int i11 = this.f14721k;
        int i12 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = g02.B(i10, this.j, new C1275Q(this, i11, i12, new WeakReference(this.f14714a)));
                if (typefaceB != null) {
                    if (i7 < 28 || this.f14721k == -1) {
                        this.f14722l = typefaceB;
                    } else {
                        this.f14722l = AbstractC1282U.a(Typeface.create(typefaceB, 0), this.f14721k, (this.j & 2) != 0);
                    }
                }
                this.f14723m = this.f14722l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14722l != null || (string = typedArray.getString(i10)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f14721k == -1) {
            this.f14722l = Typeface.create(string, this.j);
        } else {
            this.f14722l = AbstractC1282U.a(Typeface.create(string, 0), this.f14721k, (this.j & 2) != 0);
        }
    }
}
