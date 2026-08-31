package L0;

import android.graphics.Canvas;
import android.text.TextUtils;
import j0.AbstractC1148c;

/* JADX INFO: renamed from: L0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0.d f3096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M0.j f3099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f3100e;
    public final Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0189a(S0.d r21, int r22, int r23, long r24) {
        /*
            r20 = this;
            r0 = r20
            r10 = r21
            r4 = r22
            r11 = r23
            r0.<init>()
            r0.f3096a = r10
            r0.f3097b = r4
            r12 = r24
            r0.f3098c = r12
            int r1 = W0.a.i(r12)
            if (r1 != 0) goto L20
            int r1 = W0.a.j(r12)
            if (r1 != 0) goto L20
            goto L25
        L20:
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            Q0.a.a(r1)
        L25:
            r14 = 1
            if (r4 < r14) goto L29
            goto L2e
        L29:
            java.lang.String r1 = "maxLines should be greater than 0"
            Q0.a.a(r1)
        L2e:
            L0.F r1 = r10.f7282b
            java.lang.CharSequence r2 = r10.f7287h
            r3 = 5
            r5 = 4
            r6 = 2
            if (r11 != r6) goto L98
            L0.y r8 = r1.f3091a
            long r8 = r8.f3233h
            r17 = 0
            long r6 = com.google.android.gms.internal.measurement.AbstractC0836n2.y(r17)
            boolean r6 = W0.n.a(r8, r6)
            if (r6 != 0) goto L96
            L0.y r6 = r1.f3091a
            long r6 = r6.f3233h
            long r8 = W0.n.f8027c
            boolean r6 = W0.n.a(r6, r8)
            if (r6 != 0) goto L96
            L0.q r6 = r1.f3092b
            int r6 = r6.f3166a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r7) goto L5c
            goto L96
        L5c:
            if (r6 != r3) goto L5f
            goto L96
        L5f:
            if (r6 != r5) goto L62
            goto L96
        L62:
            int r6 = r2.length()
            if (r6 != 0) goto L69
            goto L96
        L69:
            boolean r6 = r2 instanceof android.text.Spannable
            if (r6 == 0) goto L71
            r6 = r2
            android.text.Spannable r6 = (android.text.Spannable) r6
            goto L72
        L71:
            r6 = 0
        L72:
            if (r6 != 0) goto L79
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r2)
        L79:
            r2 = r6
            java.lang.Class<N0.c> r6 = N0.c.class
            boolean r6 = M0.g.c(r2, r6)
            if (r6 != 0) goto L96
            N0.c r6 = new N0.c
            r6.<init>()
            int r7 = r2.length()
            int r7 = r7 - r14
            int r8 = r2.length()
            int r8 = r8 - r14
            r9 = 33
            r2.setSpan(r6, r7, r8, r9)
        L96:
            r9 = r2
            goto L9b
        L98:
            r17 = 0
            goto L96
        L9b:
            r0.f3100e = r9
            L0.q r2 = r1.f3092b
            L0.y r1 = r1.f3091a
            int r6 = r2.f3166a
            r7 = 3
            if (r6 != r14) goto La8
            r8 = r7
            goto Lbb
        La8:
            r8 = 2
            if (r6 != r8) goto Lad
            r8 = r5
            goto Lbb
        Lad:
            if (r6 != r7) goto Lb1
            r8 = 2
            goto Lbb
        Lb1:
            if (r6 != r3) goto Lb4
            goto Lb9
        Lb4:
            r8 = 6
            if (r6 != r8) goto Lb9
            r8 = r14
            goto Lbb
        Lb9:
            r8 = r17
        Lbb:
            if (r6 != r5) goto Lbf
            r6 = r14
            goto Lc1
        Lbf:
            r6 = r17
        Lc1:
            int r15 = r2.f3172h
            r3 = 32
            r5 = 2
            if (r15 != r5) goto Ld0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 > r3) goto Lce
            r15 = r5
            goto Ld2
        Lce:
            r15 = 4
            goto Ld2
        Ld0:
            r15 = r17
        Ld2:
            int r2 = r2.f3171g
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 != r14) goto Ld9
            goto Le5
        Ld9:
            if (r3 != r5) goto Ldf
            r3 = r2
            r2 = r6
            r6 = r14
            goto Le9
        Ldf:
            if (r3 != r7) goto Le5
            r3 = r2
            r2 = r6
            r6 = 2
            goto Le9
        Le5:
            r3 = r2
            r2 = r6
            r6 = r17
        Le9:
            int r5 = r3 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != r14) goto Lf0
            goto L100
        Lf0:
            r14 = 2
            if (r5 != r14) goto Lf6
            r5 = r7
            r7 = 1
            goto L103
        Lf6:
            if (r5 != r7) goto Lfb
            r5 = r7
            r7 = 2
            goto L103
        Lfb:
            r14 = 4
            if (r5 != r14) goto L100
            r5 = r7
            goto L103
        L100:
            r5 = r7
            r7 = r17
        L103:
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            r14 = 1
            if (r3 != r14) goto L10c
            r14 = 2
            goto L113
        L10c:
            r14 = 2
            if (r3 != r14) goto L113
            r3 = r1
            r1 = r8
            r8 = 1
            goto L117
        L113:
            r3 = r1
            r1 = r8
            r8 = r17
        L117:
            if (r11 != r14) goto L122
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
        L11b:
            r5 = r15
            r18 = 32
            r15 = r3
            r3 = r16
            goto L133
        L122:
            r5 = 5
            if (r11 != r5) goto L128
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L11b
        L128:
            r5 = 4
            if (r11 != r5) goto L12e
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.START
            goto L11b
        L12e:
            r5 = r15
            r18 = 32
            r15 = r3
            r3 = 0
        L133:
            M0.j r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.Layout r0 = r14.f3712e
            int r4 = android.os.Build.VERSION.SDK_INT
            r16 = r1
            r1 = 35
            if (r4 >= r1) goto L14c
            S0.e r1 = r10.f7286g
            float r1 = r1.getLetterSpacing()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L154
        L14c:
            r0 = r20
            r4 = r22
            r1 = r16
            r10 = 2
            goto L194
        L154:
            r1 = 4
            if (r11 != r1) goto L159
        L157:
            r1 = 0
            goto L15d
        L159:
            r1 = 5
            if (r11 != r1) goto L14c
            goto L157
        L15d:
            int r4 = r0.getEllipsisCount(r1)
            if (r4 <= 0) goto L14c
            int r4 = r0.getEllipsisStart(r1)
            int r0 = r0.getEllipsisCount(r1)
            int r0 = r0 + r4
            java.lang.CharSequence r4 = r9.subSequence(r1, r4)
            int r10 = r9.length()
            java.lang.CharSequence r0 = r9.subSequence(r0, r10)
            r9 = 3
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r9]
            r9[r1] = r4
            java.lang.String r1 = "…"
            r19 = 1
            r9[r19] = r1
            r10 = 2
            r9[r10] = r0
            java.lang.CharSequence r9 = android.text.TextUtils.concat(r9)
            r0 = r20
            r4 = r22
            r1 = r16
            M0.j r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L194:
            int r9 = r14.f
            if (r11 != r10) goto L1cf
            int r10 = r14.a()
            int r11 = W0.a.g(r12)
            if (r10 <= r11) goto L1cf
            r10 = 1
            if (r4 <= r10) goto L1cf
            int r4 = W0.a.g(r12)
            r10 = 0
        L1aa:
            if (r10 >= r9) goto L1b9
            float r11 = r14.d(r10)
            float r12 = (float) r4
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L1b6
            goto L1ba
        L1b6:
            int r10 = r10 + 1
            goto L1aa
        L1b9:
            r10 = r9
        L1ba:
            if (r10 < 0) goto L1cc
            int r4 = r0.f3097b
            if (r10 == r4) goto L1cc
            r4 = 1
            if (r10 >= r4) goto L1c5
            r4 = 1
            goto L1c6
        L1c5:
            r4 = r10
        L1c6:
            java.lang.CharSequence r9 = r0.f3100e
            M0.j r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L1cc:
            r0.f3099d = r14
            goto L1d1
        L1cf:
            r0.f3099d = r14
        L1d1:
            S0.d r1 = r0.f3096a
            S0.e r1 = r1.f7286g
            V0.p r2 = r15.f3227a
            j0.B r2 = r2.b()
            float r3 = r0.c()
            float r4 = r0.b()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r5 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r5 = r5 << r18
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r7
            long r3 = r3 | r5
            V0.p r5 = r15.f3227a
            float r5 = r5.c()
            r1.c(r2, r3, r5)
            M0.j r1 = r0.f3099d
            android.text.Layout r1 = r1.f3712e
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L20d
        L20b:
            r1 = 0
            goto L241
        L20d:
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r3 = "null cannot be cast to non-null type android.text.Spanned"
            kotlin.jvm.internal.m.c(r2, r3)
            android.text.Spanned r2 = (android.text.Spanned) r2
            r4 = -1
            int r5 = r2.length()
            java.lang.Class<U0.b> r6 = U0.b.class
            int r4 = r2.nextSpanTransition(r4, r5, r6)
            int r2 = r2.length()
            if (r4 == r2) goto L20b
            java.lang.CharSequence r2 = r1.getText()
            kotlin.jvm.internal.m.c(r2, r3)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            r3 = 0
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r6)
            U0.b[] r1 = (U0.b[]) r1
        L241:
            if (r1 == 0) goto L274
            kotlin.jvm.internal.b r1 = kotlin.jvm.internal.m.h(r1)
        L247:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L274
            java.lang.Object r2 = r1.next()
            U0.b r2 = (U0.b) r2
            float r3 = r0.c()
            float r4 = r0.b()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r5 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r5 = r5 << r18
            long r3 = r3 & r7
            long r3 = r3 | r5
            P.f0 r2 = r2.f7525s
            i0.e r5 = new i0.e
            r5.<init>(r3)
            r2.setValue(r5)
            goto L247
        L274:
            java.lang.CharSequence r1 = r0.f3100e
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L27e
            n5.s r1 = n5.s.f15299q
            goto L344
        L27e:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<N0.i> r3 = N0.i.class
            r4 = 0
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r7 = 0
        L294:
            if (r7 >= r4) goto L343
            r5 = r1[r7]
            N0.i r5 = (N0.i) r5
            int r6 = r2.getSpanStart(r5)
            int r8 = r2.getSpanEnd(r5)
            M0.j r9 = r0.f3099d
            android.text.Layout r9 = r9.f3712e
            int r9 = r9.getLineForOffset(r6)
            int r10 = r0.f3097b
            if (r9 < r10) goto L2b0
            r10 = 1
            goto L2b1
        L2b0:
            r10 = 0
        L2b1:
            M0.j r11 = r0.f3099d
            android.text.Layout r11 = r11.f3712e
            int r11 = r11.getEllipsisCount(r9)
            if (r11 <= 0) goto L2c7
            M0.j r11 = r0.f3099d
            android.text.Layout r11 = r11.f3712e
            int r11 = r11.getEllipsisStart(r9)
            if (r8 <= r11) goto L2c7
            r11 = 1
            goto L2c8
        L2c7:
            r11 = 0
        L2c8:
            M0.j r12 = r0.f3099d
            int r12 = r12.e(r9)
            if (r8 <= r12) goto L2d2
            r8 = 1
            goto L2d3
        L2d2:
            r8 = 0
        L2d3:
            if (r11 != 0) goto L2d9
            if (r8 != 0) goto L2d9
            if (r10 == 0) goto L2dc
        L2d9:
            r11 = 0
            r14 = 1
            goto L33b
        L2dc:
            M0.j r8 = r0.f3099d
            android.text.Layout r8 = r8.f3712e
            boolean r8 = r8.isRtlCharAt(r6)
            if (r8 == 0) goto L2e9
            V0.j r8 = V0.j.f7934r
            goto L2eb
        L2e9:
            V0.j r8 = V0.j.f7933q
        L2eb:
            int r8 = r8.ordinal()
            java.lang.String r10 = "PlaceholderSpan is not laid out yet."
            if (r8 == 0) goto L310
            r14 = 1
            if (r8 != r14) goto L30a
            M0.j r8 = r0.f3099d
            r11 = 0
            float r6 = r8.g(r6, r11)
            boolean r8 = r5.f4022t
            if (r8 != 0) goto L304
            Q0.a.b(r10)
        L304:
            int r8 = r5.f4020r
            float r8 = (float) r8
            float r6 = r6 - r8
            r11 = 0
            goto L318
        L30a:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        L310:
            r14 = 1
            M0.j r8 = r0.f3099d
            r11 = 0
            float r6 = r8.g(r6, r11)
        L318:
            boolean r8 = r5.f4022t
            if (r8 != 0) goto L31f
            Q0.a.b(r10)
        L31f:
            int r8 = r5.f4020r
            float r8 = (float) r8
            float r8 = r8 + r6
            M0.j r10 = r0.f3099d
            float r9 = r10.c(r9)
            int r10 = r5.b()
            float r10 = (float) r10
            float r9 = r9 - r10
            int r5 = r5.b()
            float r5 = (float) r5
            float r5 = r5 + r9
            i0.c r10 = new i0.c
            r10.<init>(r6, r9, r8, r5)
            goto L33c
        L33b:
            r10 = 0
        L33c:
            r3.add(r10)
            int r7 = r7 + 1
            goto L294
        L343:
            r1 = r3
        L344:
            r0.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0189a.<init>(S0.d, int, int, long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final M0.j a(int i, int i7, TextUtils.TruncateAt truncateAt, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence) {
        s sVar;
        float fC = c();
        S0.d dVar = this.f3096a;
        S0.e eVar = dVar.f7286g;
        int i13 = dVar.f7289l;
        M0.e eVar2 = dVar.i;
        F f = dVar.f7282b;
        S0.a aVar = S0.b.f7278a;
        t tVar = f.f3093c;
        return new M0.j(charSequence, fC, eVar, i, truncateAt, i13, (tVar == null || (sVar = tVar.f3176a) == null) ? false : sVar.f3175a, i8, i10, i11, i12, i9, i7, eVar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        return this.f3099d.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c() {
        return W0.a.h(this.f3098c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(j0.m mVar) {
        Canvas canvasA = AbstractC1148c.a(mVar);
        M0.j jVar = this.f3099d;
        if (jVar.f3711d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), b());
        }
        int i = jVar.f3713g;
        if (canvasA.getClipBounds(jVar.f3719o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            M0.i iVar = M0.k.f3721a;
            iVar.f3707a = canvasA;
            jVar.f3712e.draw(iVar);
            if (i != 0) {
                canvasA.translate(0.0f, (-1) * i);
            }
        }
        if (jVar.f3711d) {
            canvasA.restore();
        }
    }
}
