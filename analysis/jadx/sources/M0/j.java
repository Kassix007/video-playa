package M0;

import J5.m;
import L0.l;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f3708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f3709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Layout f3712e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3714h;
    public final float i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f3716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N0.h[] f3718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f3719o = new Rect();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f3720p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, M0.e r35) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            r3 = r25
            r7 = r28
            r1.<init>()
            r4 = r24
            r1.f3708a = r4
            r8 = r26
            r1.f3709b = r8
            r1.f3710c = r7
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r1.f3719o = r5
            int r5 = r2.length()
            android.text.TextDirectionHeuristic r13 = M0.k.a(r27)
            android.text.Layout$Alignment r6 = M0.h.f3705a
            r14 = 1
            if (r3 == 0) goto L46
            if (r3 == r14) goto L43
            r6 = 2
            if (r3 == r6) goto L40
            r6 = 3
            if (r3 == r6) goto L3d
            r6 = 4
            if (r3 == r6) goto L3a
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L38:
            r6 = r3
            goto L49
        L3a:
            android.text.Layout$Alignment r3 = M0.h.f3706b
            goto L38
        L3d:
            android.text.Layout$Alignment r3 = M0.h.f3705a
            goto L38
        L40:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L38
        L43:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L38
        L46:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L38
        L49:
            boolean r3 = r2 instanceof android.text.Spanned
            if (r3 == 0) goto L5b
            r3 = r2
            android.text.Spanned r3 = (android.text.Spanned) r3
            r9 = -1
            java.lang.Class<N0.a> r10 = N0.a.class
            int r3 = r3.nextSpanTransition(r9, r5, r10)
            if (r3 >= r5) goto L5b
            r3 = r14
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.lang.String r5 = "TextLayout:initLayout"
            android.os.Trace.beginSection(r5)
            android.text.BoringLayout$Metrics r9 = r35.a()     // Catch: java.lang.Throwable -> Lb9
            double r10 = (double) r0     // Catch: java.lang.Throwable -> Lb9
            double r14 = java.lang.Math.ceil(r10)     // Catch: java.lang.Throwable -> Lb9
            float r5 = (float) r14     // Catch: java.lang.Throwable -> Lb9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> Lb9
            r14 = 33
            if (r9 == 0) goto Lbc
            float r12 = r35.c()     // Catch: java.lang.Throwable -> Lb9
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 > 0) goto Lbc
            if (r3 != 0) goto Lbc
            r0 = 1
            r1.f3715k = r0     // Catch: java.lang.Throwable -> Lb9
            if (r5 < 0) goto L80
            goto L85
        L80:
            java.lang.String r3 = "negative width"
            Q0.a.a(r3)     // Catch: java.lang.Throwable -> Lb9
        L85:
            if (r5 < 0) goto L88
            goto L8d
        L88:
            java.lang.String r3 = "negative ellipsized width"
            Q0.a.a(r3)     // Catch: java.lang.Throwable -> Lb9
        L8d:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb9
            if (r3 < r14) goto L9c
            r4 = r5
            r5 = r6
            r6 = r9
            r9 = r4
            r3 = r24
            android.text.BoringLayout r3 = M0.a.g(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb9
            goto Lb4
        L9c:
            r4 = r5
            r5 = r6
            r6 = r9
            android.text.BoringLayout r2 = new android.text.BoringLayout     // Catch: java.lang.Throwable -> Lb9
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r12 = r4
            r3 = r22
            r11 = r26
            r10 = r28
            r9 = r6
            r6 = r5
            r5 = r4
            r4 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb9
            r3 = r2
        Lb4:
            r8 = r29
            r6 = r13
            r0 = r14
            goto Le8
        Lb9:
            r0 = move-exception
            goto L2fc
        Lbc:
            r4 = r5
            r5 = r6
            r0 = 1
            r2 = 0
            r1.f3715k = r2     // Catch: java.lang.Throwable -> Lb9
            r6 = r5
            int r5 = r22.length()     // Catch: java.lang.Throwable -> Lb9
            double r7 = java.lang.Math.ceil(r10)     // Catch: java.lang.Throwable -> Lb9
            float r3 = (float) r7     // Catch: java.lang.Throwable -> Lb9
            int r10 = (int) r3     // Catch: java.lang.Throwable -> Lb9
            r2 = r22
            r3 = r24
            r9 = r26
            r12 = r28
            r8 = r29
            r15 = r32
            r16 = r33
            r11 = r34
            r7 = r6
            r6 = r13
            r0 = r14
            r13 = r30
            r14 = r31
            android.text.StaticLayout r3 = M0.g.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lb9
        Le8:
            r1.f3712e = r3     // Catch: java.lang.Throwable -> Lb9
            android.os.Trace.endSection()
            int r2 = r3.getLineCount()
            int r2 = java.lang.Math.min(r2, r8)
            r1.f = r2
            int r4 = r2 + (-1)
            if (r2 >= r8) goto Lfd
        Lfb:
            r14 = 0
            goto L10e
        Lfd:
            int r5 = r3.getEllipsisCount(r4)
            if (r5 > 0) goto L10d
            int r5 = r3.getLineEnd(r4)
            int r7 = r22.length()
            if (r5 == r7) goto Lfb
        L10d:
            r14 = 1
        L10e:
            r1.f3711d = r14
            long r7 = M0.k.f3722b
            r5 = 32
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r28 != 0) goto L18f
            boolean r11 = r1.f3715k
            if (r11 == 0) goto L12d
            r11 = r3
            android.text.BoringLayout r11 = (android.text.BoringLayout) r11
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r0) goto L12b
            boolean r14 = M0.a.p(r11)
            goto L13e
        L12b:
            r14 = 0
            goto L13e
        L12d:
            r11 = r3
            android.text.StaticLayout r11 = (android.text.StaticLayout) r11
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r0) goto L139
            boolean r14 = M0.a.q(r11)
            goto L13e
        L139:
            r11 = 28
            if (r12 < r11) goto L12b
            r14 = 1
        L13e:
            if (r14 == 0) goto L141
            goto L18f
        L141:
            android.text.TextPaint r11 = r3.getPaint()
            java.lang.CharSequence r12 = r3.getText()
            r13 = 0
            int r14 = r3.getLineStart(r13)
            int r15 = r3.getLineEnd(r13)
            android.graphics.Rect r14 = M0.g.b(r11, r12, r14, r15)
            int r15 = r3.getLineAscent(r13)
            int r13 = r14.top
            if (r13 >= r15) goto L161
            int r15 = r15 - r13
        L15f:
            r13 = 1
            goto L166
        L161:
            int r15 = r3.getTopPadding()
            goto L15f
        L166:
            if (r2 != r13) goto L169
            goto L175
        L169:
            int r2 = r3.getLineStart(r4)
            int r13 = r3.getLineEnd(r4)
            android.graphics.Rect r14 = M0.g.b(r11, r12, r2, r13)
        L175:
            int r2 = r3.getLineDescent(r4)
            int r11 = r14.bottom
            if (r11 <= r2) goto L17f
            int r11 = r11 - r2
            goto L183
        L17f:
            int r11 = r3.getBottomPadding()
        L183:
            if (r15 != 0) goto L188
            if (r11 != 0) goto L188
            goto L18f
        L188:
            long r12 = (long) r15
            long r12 = r12 << r5
            long r14 = (long) r11
            long r14 = r14 & r9
            long r11 = r12 | r14
            goto L190
        L18f:
            r11 = r7
        L190:
            java.lang.CharSequence r2 = r3.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            r13 = 0
            if (r2 != 0) goto L19a
            goto L1b7
        L19a:
            java.lang.CharSequence r2 = r3.getText()
            java.lang.String r14 = "null cannot be cast to non-null type android.text.Spanned"
            kotlin.jvm.internal.m.c(r2, r14)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<N0.h> r15 = N0.h.class
            boolean r2 = M0.g.c(r2, r15)
            if (r2 != 0) goto L1b9
            java.lang.CharSequence r2 = r3.getText()
            int r2 = r2.length()
            if (r2 <= 0) goto L1b9
        L1b7:
            r2 = r13
            goto L1d1
        L1b9:
            java.lang.CharSequence r2 = r3.getText()
            kotlin.jvm.internal.m.c(r2, r14)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r3 = r3.getText()
            int r3 = r3.length()
            r14 = 0
            java.lang.Object[] r2 = r2.getSpans(r14, r3, r15)
            N0.h[] r2 = (N0.h[]) r2
        L1d1:
            r1.f3718n = r2
            if (r2 == 0) goto L20f
            int r3 = r2.length
            r7 = 0
            r8 = 0
            r15 = 0
        L1d9:
            if (r15 >= r3) goto L1fe
            r14 = r2[r15]
            r22 = r5
            int r5 = r14.f4007A
            if (r5 >= 0) goto L1ec
            int r5 = java.lang.Math.abs(r5)
            int r5 = java.lang.Math.max(r7, r5)
            r7 = r5
        L1ec:
            int r5 = r14.f4008B
            if (r5 >= 0) goto L1f9
            int r5 = java.lang.Math.abs(r5)
            int r5 = java.lang.Math.max(r7, r5)
            r8 = r5
        L1f9:
            int r15 = r15 + 1
            r5 = r22
            goto L1d9
        L1fe:
            r22 = r5
            if (r7 != 0) goto L208
            if (r8 != 0) goto L208
            long r2 = M0.k.f3722b
        L206:
            r7 = r2
            goto L211
        L208:
            long r2 = (long) r7
            long r2 = r2 << r22
            long r7 = (long) r8
            long r7 = r7 & r9
            long r2 = r2 | r7
            goto L206
        L20f:
            r22 = r5
        L211:
            long r2 = r11 >> r22
            int r2 = (int) r2
            long r14 = r7 >> r22
            int r3 = (int) r14
            int r2 = java.lang.Math.max(r2, r3)
            r1.f3713g = r2
            long r2 = r11 & r9
            int r2 = (int) r2
            long r7 = r7 & r9
            int r3 = (int) r7
            int r2 = java.lang.Math.max(r2, r3)
            r1.f3714h = r2
            android.text.TextPaint r7 = r1.f3708a
            N0.h[] r2 = r1.f3718n
            int r3 = r1.f
            r5 = 1
            int r3 = r3 - r5
            android.text.Layout r5 = r1.f3712e
            int r8 = r5.getLineStart(r3)
            int r5 = r5.getLineEnd(r3)
            if (r8 != r5) goto L241
            if (r2 == 0) goto L241
            int r5 = r2.length
            if (r5 != 0) goto L244
        L241:
            r2 = 0
            goto L2cd
        L244:
            r10 = r6
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r5 = "\u200b"
            r6.<init>(r5)
            int r5 = r2.length
            if (r5 == 0) goto L2c5
            r13 = 0
            r2 = r2[r13]
            int r5 = r6.length()
            if (r3 == 0) goto L25e
            boolean r3 = r2.f4012t
            if (r3 == 0) goto L25e
            r15 = 0
            goto L260
        L25e:
            boolean r15 = r2.f4012t
        L260:
            N0.h r3 = new N0.h
            float r8 = r2.f4009q
            boolean r9 = r2.f4012t
            float r11 = r2.f4013u
            boolean r2 = r2.f4014v
            r32 = r2
            r26 = r3
            r28 = r5
            r27 = r8
            r30 = r9
            r31 = r11
            r29 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r2 = r26
            int r3 = r6.length()
            r13 = 0
            r6.setSpan(r2, r13, r3, r0)
            int r9 = r6.length()
            boolean r0 = r1.f3710c
            android.text.Layout$Alignment r11 = M0.c.f3694a
            r19 = 0
            r20 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 0
            r17 = 0
            r18 = 0
            r16 = r0
            android.text.StaticLayout r0 = M0.g.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Paint$FontMetricsInt r13 = new android.graphics.Paint$FontMetricsInt
            r13.<init>()
            r2 = 0
            int r3 = r0.getLineAscent(r2)
            r13.ascent = r3
            int r3 = r0.getLineDescent(r2)
            r13.descent = r3
            int r3 = r0.getLineTop(r2)
            r13.top = r3
            int r0 = r0.getLineBottom(r2)
            r13.bottom = r0
            goto L2cd
        L2c5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r2 = "Array is empty."
            r0.<init>(r2)
            throw r0
        L2cd:
            if (r13 == 0) goto L2de
            int r0 = r13.bottom
            float r2 = r1.d(r4)
            float r3 = r1.f(r4)
            float r2 = r2 - r3
            int r2 = (int) r2
            int r15 = r0 - r2
            goto L2df
        L2de:
            r15 = r2
        L2df:
            r1.f3717m = r15
            r1.f3716l = r13
            android.text.Layout r0 = r1.f3712e
            android.text.TextPaint r2 = r0.getPaint()
            float r0 = com.google.android.gms.internal.measurement.I1.c0(r0, r4, r2)
            r1.i = r0
            android.text.Layout r0 = r1.f3712e
            android.text.TextPaint r2 = r0.getPaint()
            float r0 = com.google.android.gms.internal.measurement.I1.d0(r0, r4, r2)
            r1.j = r0
            return
        L2fc:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.j.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, M0.e):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        boolean z5 = this.f3711d;
        Layout layout = this.f3712e;
        return (z5 ? layout.getLineBottom(this.f - 1) : layout.getHeight()) + this.f3713g + this.f3714h + this.f3717m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l b() {
        l lVar = this.f3720p;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l();
        lVar2.f3125b = this.f3712e;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iR0 = m.R0(((Layout) lVar2.f3125b).getText(), '\n', length, 4);
            length = iR0 < 0 ? ((Layout) lVar2.f3125b).getText().length() : iR0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) lVar2.f3125b).getText().length());
        lVar2.f3124a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        lVar2.f3126c = arrayList2;
        lVar2.f3127d = new boolean[((ArrayList) lVar2.f3124a).size()];
        ((ArrayList) lVar2.f3124a).size();
        this.f3720p = lVar2;
        return lVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f3713g + ((i != this.f + (-1) || (fontMetricsInt = this.f3716l) == null) ? this.f3712e.getLineBaseline(i) : f(i) - fontMetricsInt.ascent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i7 = this.f;
        int i8 = i7 - 1;
        Layout layout = this.f3712e;
        if (i != i8 || (fontMetricsInt = this.f3716l) == null) {
            return this.f3713g + layout.getLineBottom(i) + (i == i7 + (-1) ? this.f3714h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i) {
        i iVar = k.f3721a;
        Layout layout = this.f3712e;
        return (layout.getEllipsisCount(i) <= 0 || this.f3709b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float f(int i) {
        return this.f3712e.getLineTop(i) + (i == 0 ? 0 : this.f3713g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float g(int i, boolean z5) {
        return (this.f3712e.getLineForOffset(i) == this.f - 1 ? this.i + this.j : 0.0f) + b().k(i, true, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float h(int i, boolean z5) {
        return (this.f3712e.getLineForOffset(i) == this.f + (-1) ? this.i + this.j : 0.0f) + b().k(i, false, z5);
    }
}
