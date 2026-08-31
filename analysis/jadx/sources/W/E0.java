package w;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f17768a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E0(H0 h02) {
        this.f17768a = h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(int r24, long r25) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = r25
            w.H0 r4 = r1.f17768a
            r4.i = r0
            v.l r5 = r4.f17791b
            if (r5 == 0) goto L38e
            w.A0 r6 = r4.f17790a
            boolean r6 = r6.c()
            if (r6 != 0) goto L1e
            w.A0 r6 = r4.f17790a
            boolean r6 = r6.a()
            if (r6 == 0) goto L38e
        L1e:
            int r0 = r4.i
            m0.a r4 = r4.f17798l
            v.E r6 = r5.f17356c
            long r7 = r5.f17359g
            boolean r7 = i0.C1133e.e(r7)
            if (r7 == 0) goto L43
            r4.getClass()
            java.lang.Object r0 = r4.f14918r
            w.H0 r0 = (w.H0) r0
            w.i0 r4 = r0.j
            int r5 = r0.i
            long r2 = w.H0.a(r0, r4, r2, r5)
            i0.b r0 = new i0.b
            r0.<init>(r2)
            long r2 = r0.f13520a
            return r2
        L43:
            boolean r7 = r5.f
            r8 = 0
            r10 = 1
            if (r7 != 0) goto L78
            android.widget.EdgeEffect r7 = r6.f
            boolean r7 = v.E.g(r7)
            if (r7 == 0) goto L55
            r5.f(r8)
        L55:
            android.widget.EdgeEffect r7 = r6.f17232g
            boolean r7 = v.E.g(r7)
            if (r7 == 0) goto L60
            r5.g(r8)
        L60:
            android.widget.EdgeEffect r7 = r6.f17230d
            boolean r7 = v.E.g(r7)
            if (r7 == 0) goto L6b
            r5.h(r8)
        L6b:
            android.widget.EdgeEffect r7 = r6.f17231e
            boolean r7 = v.E.g(r7)
            if (r7 == 0) goto L76
            r5.e(r8)
        L76:
            r5.f = r10
        L78:
            int r7 = v.AbstractC1719n.f17365a
            r7 = 2
            if (r0 != r7) goto L80
            r7 = 1082130432(0x40800000, float:4.0)
            goto L82
        L80:
            r7 = 1065353216(0x3f800000, float:1.0)
        L82:
            long r11 = i0.C1130b.f(r2, r7)
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r2 & r15
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            r17 = 0
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto La0
            r20 = r11
            r18 = r15
        L9c:
            r8 = r17
            goto L116
        La0:
            android.widget.EdgeEffect r14 = r6.f17230d
            boolean r14 = v.E.g(r14)
            if (r14 == 0) goto Lda
            float r14 = java.lang.Float.intBitsToFloat(r13)
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto Lda
            float r14 = r5.h(r11)
            r18 = r15
            android.widget.EdgeEffect r15 = r6.f17230d
            boolean r15 = v.E.g(r15)
            if (r15 != 0) goto Lc5
            android.widget.EdgeEffect r15 = r6.e()
            r15.finish()
        Lc5:
            long r8 = r11 & r18
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r8 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r8 != 0) goto Ld7
            float r8 = java.lang.Float.intBitsToFloat(r13)
        Ld4:
            r20 = r11
            goto L116
        Ld7:
            float r8 = r14 / r7
            goto Ld4
        Lda:
            r18 = r15
            android.widget.EdgeEffect r8 = r6.f17231e
            boolean r8 = v.E.g(r8)
            if (r8 == 0) goto L113
            float r8 = java.lang.Float.intBitsToFloat(r13)
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L113
            float r8 = r5.e(r11)
            android.widget.EdgeEffect r9 = r6.f17231e
            boolean r9 = v.E.g(r9)
            if (r9 != 0) goto Lff
            android.widget.EdgeEffect r9 = r6.b()
            r9.finish()
        Lff:
            r20 = r11
            long r10 = r20 & r18
            int r9 = (int) r10
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L111
            float r8 = java.lang.Float.intBitsToFloat(r13)
            goto L116
        L111:
            float r8 = r8 / r7
            goto L116
        L113:
            r20 = r11
            goto L9c
        L116:
            r9 = 32
            long r10 = r2 >> r9
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 != 0) goto L129
            r20 = r9
        L125:
            r7 = r17
            goto L19c
        L129:
            android.widget.EdgeEffect r11 = r6.f
            boolean r11 = v.E.g(r11)
            if (r11 == 0) goto L163
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 >= 0) goto L163
            r11 = r20
            float r14 = r5.f(r11)
            r20 = r9
            android.widget.EdgeEffect r9 = r6.f
            boolean r9 = v.E.g(r9)
            if (r9 != 0) goto L150
            android.widget.EdgeEffect r9 = r6.c()
            r9.finish()
        L150:
            long r11 = r11 >> r20
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 != 0) goto L160
            float r7 = java.lang.Float.intBitsToFloat(r10)
            goto L19c
        L160:
            float r7 = r14 / r7
            goto L19c
        L163:
            r11 = r20
            r20 = r9
            android.widget.EdgeEffect r9 = r6.f17232g
            boolean r9 = v.E.g(r9)
            if (r9 == 0) goto L125
            float r9 = java.lang.Float.intBitsToFloat(r10)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 <= 0) goto L125
            float r9 = r5.g(r11)
            android.widget.EdgeEffect r14 = r6.f17232g
            boolean r14 = v.E.g(r14)
            if (r14 != 0) goto L18a
            android.widget.EdgeEffect r14 = r6.d()
            r14.finish()
        L18a:
            long r11 = r11 >> r20
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 != 0) goto L19a
            float r7 = java.lang.Float.intBitsToFloat(r10)
            goto L19c
        L19a:
            float r7 = r9 / r7
        L19c:
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r11 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r11 = r11 << r20
            long r7 = r7 & r18
            long r7 = r7 | r11
            r11 = 0
            boolean r9 = i0.C1130b.b(r7, r11)
            if (r9 != 0) goto L1b6
            r5.d()
        L1b6:
            long r2 = i0.C1130b.d(r2, r7)
            r4.getClass()
            java.lang.Object r4 = r4.f14918r
            w.H0 r4 = (w.H0) r4
            w.i0 r9 = r4.j
            int r11 = r4.i
            long r11 = w.H0.a(r4, r9, r2, r11)
            i0.b r4 = new i0.b
            r4.<init>(r11)
            long r11 = r4.f13520a
            r4 = r10
            long r9 = i0.C1130b.d(r2, r11)
            r21 = r13
            long r13 = r2 >> r20
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L1ee
            long r13 = r2 & r18
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L1ee
            goto L228
        L1ee:
            long r13 = r11 >> r20
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L205
            long r13 = r11 & r18
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L205
            goto L228
        L205:
            android.widget.EdgeEffect r13 = r6.f
            boolean r13 = v.E.g(r13)
            if (r13 != 0) goto L225
            android.widget.EdgeEffect r13 = r6.f17230d
            boolean r13 = v.E.g(r13)
            if (r13 != 0) goto L225
            android.widget.EdgeEffect r13 = r6.f17232g
            boolean r13 = v.E.g(r13)
            if (r13 != 0) goto L225
            android.widget.EdgeEffect r13 = r6.f17231e
            boolean r13 = v.E.g(r13)
            if (r13 == 0) goto L228
        L225:
            r5.a()
        L228:
            r14 = 1
            if (r0 != r14) goto L271
            long r13 = r9 >> r20
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            r20 = 1056964608(0x3f000000, float:0.5)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            r22 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r14 <= 0) goto L23f
            r5.f(r9)
        L23d:
            r13 = 1
            goto L24c
        L23f:
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 >= 0) goto L24b
            r5.g(r9)
            goto L23d
        L24b:
            r13 = 0
        L24c:
            long r0 = r9 & r18
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 <= 0) goto L25c
            r5.h(r9)
        L25a:
            r0 = 1
            goto L269
        L25c:
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 >= 0) goto L268
            r5.e(r9)
            goto L25a
        L268:
            r0 = 0
        L269:
            if (r13 != 0) goto L26d
            if (r0 == 0) goto L271
        L26d:
            r0 = 1
        L26e:
            r9 = 0
            goto L273
        L271:
            r0 = 0
            goto L26e
        L273:
            boolean r1 = i0.C1130b.b(r2, r9)
            if (r1 != 0) goto L384
            android.widget.EdgeEffect r1 = r6.f
            boolean r1 = v.E.f(r1)
            if (r1 == 0) goto L2b4
            float r1 = java.lang.Float.intBitsToFloat(r4)
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 >= 0) goto L2b4
            android.widget.EdgeEffect r1 = r6.c()
            float r2 = java.lang.Float.intBitsToFloat(r4)
            boolean r3 = r1 instanceof v.K
            if (r3 == 0) goto L2aa
            v.K r1 = (v.K) r1
            float r3 = r1.f17254b
            float r3 = r3 + r2
            r1.f17254b = r3
            float r2 = java.lang.Math.abs(r3)
            float r3 = r1.f17253a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L2ad
            r1.onRelease()
            goto L2ad
        L2aa:
            r1.onRelease()
        L2ad:
            android.widget.EdgeEffect r1 = r6.f
            boolean r1 = v.E.f(r1)
            goto L2b5
        L2b4:
            r1 = 0
        L2b5:
            android.widget.EdgeEffect r2 = r6.f17232g
            boolean r2 = v.E.f(r2)
            if (r2 == 0) goto L2f7
            float r2 = java.lang.Float.intBitsToFloat(r4)
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L2f7
            android.widget.EdgeEffect r2 = r6.d()
            float r3 = java.lang.Float.intBitsToFloat(r4)
            boolean r4 = r2 instanceof v.K
            if (r4 == 0) goto L2e6
            v.K r2 = (v.K) r2
            float r4 = r2.f17254b
            float r4 = r4 + r3
            r2.f17254b = r4
            float r3 = java.lang.Math.abs(r4)
            float r4 = r2.f17253a
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L2e9
            r2.onRelease()
            goto L2e9
        L2e6:
            r2.onRelease()
        L2e9:
            if (r1 != 0) goto L2f6
            android.widget.EdgeEffect r1 = r6.f17232g
            boolean r1 = v.E.f(r1)
            if (r1 == 0) goto L2f4
            goto L2f6
        L2f4:
            r1 = 0
            goto L2f7
        L2f6:
            r1 = 1
        L2f7:
            android.widget.EdgeEffect r2 = r6.f17230d
            boolean r2 = v.E.f(r2)
            if (r2 == 0) goto L339
            float r2 = java.lang.Float.intBitsToFloat(r21)
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 >= 0) goto L339
            android.widget.EdgeEffect r2 = r6.e()
            float r3 = java.lang.Float.intBitsToFloat(r21)
            boolean r4 = r2 instanceof v.K
            if (r4 == 0) goto L328
            v.K r2 = (v.K) r2
            float r4 = r2.f17254b
            float r4 = r4 + r3
            r2.f17254b = r4
            float r3 = java.lang.Math.abs(r4)
            float r4 = r2.f17253a
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L32b
            r2.onRelease()
            goto L32b
        L328:
            r2.onRelease()
        L32b:
            if (r1 != 0) goto L338
            android.widget.EdgeEffect r1 = r6.f17230d
            boolean r1 = v.E.f(r1)
            if (r1 == 0) goto L336
            goto L338
        L336:
            r1 = 0
            goto L339
        L338:
            r1 = 1
        L339:
            android.widget.EdgeEffect r2 = r6.f17231e
            boolean r2 = v.E.f(r2)
            if (r2 == 0) goto L37b
            float r2 = java.lang.Float.intBitsToFloat(r21)
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L37b
            android.widget.EdgeEffect r2 = r6.b()
            float r3 = java.lang.Float.intBitsToFloat(r21)
            boolean r4 = r2 instanceof v.K
            if (r4 == 0) goto L36a
            v.K r2 = (v.K) r2
            float r4 = r2.f17254b
            float r4 = r4 + r3
            r2.f17254b = r4
            float r3 = java.lang.Math.abs(r4)
            float r4 = r2.f17253a
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L36d
            r2.onRelease()
            goto L36d
        L36a:
            r2.onRelease()
        L36d:
            if (r1 != 0) goto L37a
            android.widget.EdgeEffect r1 = r6.f17231e
            boolean r1 = v.E.f(r1)
            if (r1 == 0) goto L378
            goto L37a
        L378:
            r1 = 0
            goto L37b
        L37a:
            r1 = 1
        L37b:
            if (r1 != 0) goto L382
            if (r0 == 0) goto L380
            goto L382
        L380:
            r10 = 0
            goto L383
        L382:
            r10 = 1
        L383:
            r0 = r10
        L384:
            if (r0 == 0) goto L389
            r5.d()
        L389:
            long r0 = i0.C1130b.e(r7, r11)
            return r0
        L38e:
            w.i0 r1 = r4.j
            long r0 = w.H0.a(r4, r1, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.E0.a(int, long):long");
    }
}
