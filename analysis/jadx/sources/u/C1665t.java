package u;

import j0.AbstractC1145B;

/* JADX INFO: renamed from: u.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1665t implements InterfaceC1669x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f17050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f17051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f17052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f17053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f17054u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1665t(float f, float f7, float f8) {
        int iZ;
        this.f17050q = f;
        this.f17051r = f7;
        this.f17052s = f8;
        if (Float.isNaN(f) || Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(1.0f)) {
            AbstractC1637P.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f7 + ", " + f8 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f9 = (f7 - 0.0f) * 3.0f;
        float f10 = (1.0f - f7) * 3.0f;
        double d5 = f9;
        double d7 = f10;
        double d8 = 0.0f;
        double d9 = d7 * 2.0d;
        double d10 = (d5 - d9) + d8;
        if (d10 == 0.0d) {
            iZ = d7 == d8 ? 0 : AbstractC1145B.z((float) ((d9 - d8) / (d9 - (d8 * 2.0d))), fArr, 0);
        } else {
            double d11 = -Math.sqrt((d7 * d7) - (d8 * d5));
            double d12 = (-d5) + d7;
            int iZ2 = AbstractC1145B.z((float) ((-(d11 + d12)) / d10), fArr, 0);
            iZ = AbstractC1145B.z((float) ((d11 - d12) / d10), fArr, iZ2) + iZ2;
            if (iZ > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    iZ--;
                }
            }
        }
        float f13 = (f10 - f9) * 2.0f;
        int iZ3 = AbstractC1145B.z((-f13) / (((0.0f - f10) * 2.0f) - f13), fArr, iZ) + iZ;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iZ3; i++) {
            float f14 = fArr[i];
            float f15 = (((((((((f7 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f14) + (((1.0f - (f7 * 2.0f)) + 0.0f) * 3.0f)) * f14) + f9) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f17053t = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f17054u = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[PHI: r16
  0x008f: PHI (r16v13 float) = (r16v2 float), (r16v6 float), (r16v10 float), (r16v15 float), (r16v19 float) binds: [B:123:0x0228, B:113:0x01fb, B:89:0x01b3, B:45:0x00e0, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[PHI: r12
  0x015d: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:66:0x015b, B:79:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // u.InterfaceC1669x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(float r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L27c
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L27c
            r4 = 872415232(0x34000000, float:1.1920929E-7)
            float r4 = java.lang.Math.max(r1, r4)
            float r5 = r2 - r4
            float r6 = r0.f17050q
            float r7 = r6 - r4
            float r8 = r0.f17052s
            float r9 = r8 - r4
            float r4 = r3 - r4
            double r10 = (double) r5
            double r12 = (double) r7
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r14
            double r12 = r10 - r12
            r16 = r2
            r17 = r3
            double r2 = (double) r9
            double r12 = r12 + r2
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r12 = r12 * r2
            r18 = r2
            float r2 = r7 - r5
            double r2 = (double) r2
            double r2 = r2 * r18
            float r5 = -r5
            r20 = r14
            double r14 = (double) r5
            float r7 = r7 - r9
            r22 = r12
            double r12 = (double) r7
            double r12 = r12 * r18
            double r12 = r12 + r14
            double r4 = (double) r4
            double r12 = r12 + r4
            r4 = 0
            double r14 = r12 - r4
            double r14 = java.lang.Math.abs(r14)
            r24 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r7 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            r9 = 1073741824(0x40000000, float:2.0)
            r14 = 898428346(0x358cedba, float:1.05E-6)
            r15 = 2143289344(0x7fc00000, float:NaN)
            if (r7 >= 0) goto Le4
            double r12 = r22 - r4
            double r12 = java.lang.Math.abs(r12)
            int r7 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r7 >= 0) goto L93
            double r4 = r2 - r4
            double r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r4 >= 0) goto L73
            goto L22a
        L73:
            double r4 = -r10
            double r4 = r4 / r2
            float r2 = (float) r4
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L7b
            goto L7d
        L7b:
            r16 = r2
        L7d:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L83
            r16 = r17
        L83:
            float r2 = r16 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L8f
            goto L22a
        L8f:
            r15 = r16
            goto L22a
        L93:
            double r4 = r2 * r2
            r12 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r12 = r12 * r22
            double r12 = r12 * r10
            double r4 = r4 - r12
            double r4 = java.lang.Math.sqrt(r4)
            double r12 = r22 * r20
            double r10 = r4 - r2
            double r10 = r10 / r12
            float r7 = (float) r10
            int r10 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r10 >= 0) goto Lac
            r10 = r16
            goto Lad
        Lac:
            r10 = r7
        Lad:
            int r11 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r11 <= 0) goto Lb3
            r10 = r17
        Lb3:
            float r7 = r10 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 <= 0) goto Lbe
            r10 = r15
        Lbe:
            boolean r7 = java.lang.Float.isNaN(r10)
            if (r7 != 0) goto Lc7
            r15 = r10
            goto L22a
        Lc7:
            double r2 = -r2
            double r2 = r2 - r4
            double r2 = r2 / r12
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto Ld0
            goto Ld2
        Ld0:
            r16 = r2
        Ld2:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto Ld8
            r16 = r17
        Ld8:
            float r2 = r16 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L8f
            goto L22a
        Le4:
            double r22 = r22 / r12
            double r2 = r2 / r12
            double r10 = r10 / r12
            double r12 = r2 * r18
            double r24 = r22 * r22
            double r12 = r12 - r24
            r24 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r12 = r12 / r24
            double r20 = r20 * r22
            double r20 = r20 * r22
            double r20 = r20 * r22
            double r24 = r24 * r22
            double r24 = r24 * r2
            double r20 = r20 - r24
            r2 = 4628293042053316608(0x403b000000000000, double:27.0)
            double r10 = r10 * r2
            double r10 = r10 + r20
            r2 = 4632796641680687104(0x404b000000000000, double:54.0)
            double r10 = r10 / r2
            double r2 = r10 * r10
            double r20 = r12 * r12
            double r12 = r12 * r20
            double r2 = r2 + r12
            r20 = r4
            double r4 = r22 / r18
            int r7 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r7 >= 0) goto L1b7
            double r2 = -r12
            double r2 = java.lang.Math.sqrt(r2)
            double r10 = -r10
            double r10 = r10 / r2
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L123
            r10 = r12
        L123:
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L12a
            r10 = r12
        L12a:
            double r10 = java.lang.Math.acos(r10)
            float r2 = (float) r2
            float r2 = com.google.android.gms.internal.measurement.P1.z(r2)
            float r2 = r2 * r9
            double r2 = (double) r2
            double r12 = r10 / r18
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r2
            double r12 = r12 - r4
            float r7 = (float) r12
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 >= 0) goto L145
            r12 = r16
            goto L146
        L145:
            r12 = r7
        L146:
            int r13 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r13 <= 0) goto L14c
            r12 = r17
        L14c:
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 <= 0) goto L157
            r12 = r15
        L157:
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 != 0) goto L160
        L15d:
            r15 = r12
            goto L22a
        L160:
            r12 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r12 = r12 + r10
            double r12 = r12 / r18
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r2
            double r12 = r12 - r4
            float r7 = (float) r12
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 >= 0) goto L176
            r12 = r16
            goto L177
        L176:
            r12 = r7
        L177:
            int r13 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r13 <= 0) goto L17d
            r12 = r17
        L17d:
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 <= 0) goto L188
            r12 = r15
        L188:
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 != 0) goto L18f
            goto L15d
        L18f:
            r12 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r10 = r10 + r12
            double r10 = r10 / r18
            double r10 = java.lang.Math.cos(r10)
            double r10 = r10 * r2
            double r10 = r10 - r4
            float r2 = (float) r10
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L1a3
            goto L1a5
        L1a3:
            r16 = r2
        L1a5:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L1ab
            r16 = r17
        L1ab:
            float r2 = r16 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L8f
            goto L22a
        L1b7:
            if (r7 != 0) goto L1fe
            float r2 = (float) r10
            float r2 = com.google.android.gms.internal.measurement.P1.z(r2)
            float r2 = -r2
            float r3 = r2 * r9
            float r4 = (float) r4
            float r3 = r3 - r4
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 >= 0) goto L1ca
            r5 = r16
            goto L1cb
        L1ca:
            r5 = r3
        L1cb:
            int r7 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r7 <= 0) goto L1d1
            r5 = r17
        L1d1:
            float r3 = r5 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 <= 0) goto L1dc
            r5 = r15
        L1dc:
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 != 0) goto L1e4
            r15 = r5
            goto L22a
        L1e4:
            float r2 = -r2
            float r2 = r2 - r4
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L1eb
            goto L1ed
        L1eb:
            r16 = r2
        L1ed:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L1f3
            r16 = r17
        L1f3:
            float r2 = r16 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L8f
            goto L22a
        L1fe:
            double r2 = java.lang.Math.sqrt(r2)
            double r12 = -r10
            double r12 = r12 + r2
            float r7 = (float) r12
            float r7 = com.google.android.gms.internal.measurement.P1.z(r7)
            double r10 = r10 + r2
            float r2 = (float) r10
            float r2 = com.google.android.gms.internal.measurement.P1.z(r2)
            float r7 = r7 - r2
            double r2 = (double) r7
            double r2 = r2 - r4
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L218
            goto L21a
        L218:
            r16 = r2
        L21a:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L220
            r16 = r17
        L220:
            float r2 = r16 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L8f
        L22a:
            boolean r2 = java.lang.Float.isNaN(r15)
            float r3 = r0.f17051r
            if (r2 != 0) goto L252
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r2 = r3 - r17
            float r2 = r2 + r1
            float r9 = r9 * r3
            float r1 = r17 - r9
            float r2 = r2 * r15
            float r2 = r2 + r1
            float r2 = r2 * r15
            float r2 = r2 + r3
            r1 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 * r1
            float r2 = r2 * r15
            float r1 = r0.f17053t
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L24a
            r2 = r1
        L24a:
            float r1 = r0.f17054u
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L251
            return r1
        L251:
            return r2
        L252:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The cubic curve with parameters ("
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = ", "
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            r4.append(r8)
            java.lang.String r3 = ", 1.0) has no solution at "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L27c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1665t.c(float):float");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1665t)) {
            return false;
        }
        C1665t c1665t = (C1665t) obj;
        return this.f17050q == c1665t.f17050q && this.f17051r == c1665t.f17051r && this.f17052s == c1665t.f17052s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.0f) + k1.i.b(this.f17052s, k1.i.b(this.f17051r, Float.hashCode(this.f17050q) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CubicBezierEasing(a=" + this.f17050q + ", b=" + this.f17051r + ", c=" + this.f17052s + ", d=1.0)";
    }
}
