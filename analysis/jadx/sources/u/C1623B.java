package u;

/* JADX INFO: renamed from: u.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1623B implements InterfaceC1622A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1647e0 f16754b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1623B(float f, float f7) {
        this.f16753a = f7;
        C1647e0 c1647e0 = new C1647e0();
        c1647e0.f16920a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c1647e0.f16921b = dSqrt;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            AbstractC1637P.a("Spring stiffness constant must be positive.");
        }
        c1647e0.f16921b = Math.sqrt(f);
        this.f16754b = c1647e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1622A
    public final float b(long j, float f, float f7, float f8) {
        C1647e0 c1647e0 = this.f16754b;
        c1647e0.f16920a = f7;
        return Float.intBitsToFloat((int) (c1647e0.a(f, f8, j / 1000000) >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1622A
    public final float c(long j, float f, float f7, float f8) {
        C1647e0 c1647e0 = this.f16754b;
        c1647e0.f16920a = f7;
        return Float.intBitsToFloat((int) (c1647e0.a(f, f8, j / 1000000) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b  */
    @Override // u.InterfaceC1622A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r33, float r34, float r35) {
        /*
            r32 = this;
            r0 = r32
            u.e0 r1 = r0.f16754b
            double r1 = r1.f16921b
            double r1 = r1 * r1
            float r1 = (float) r1
            float r2 = r33 - r34
            float r3 = r0.f16753a
            float r2 = r2 / r3
            float r3 = r35 / r3
            double r4 = (double) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r1
            double r8 = (double) r3
            double r1 = (double) r2
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r6 * r10
            double r14 = java.lang.Math.sqrt(r4)
            double r14 = r14 * r12
            double r12 = r14 * r14
            r16 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r4 = r4 * r16
            double r12 = r12 - r4
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2e
            r16 = r3
            goto L32
        L2e:
            double r16 = java.lang.Math.sqrt(r12)
        L32:
            if (r5 >= 0) goto L3d
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.sqrt(r12)
            goto L3e
        L3d:
            r12 = r3
        L3e:
            double r14 = -r14
            double r18 = r14 + r16
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r18 = r18 * r20
            double r12 = r12 * r20
            double r14 = r14 - r16
            double r14 = r14 * r20
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L57
            int r16 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r16 != 0) goto L57
            r1 = 0
            goto L23c
        L57:
            if (r5 >= 0) goto L5a
            double r8 = -r8
        L5a:
            double r1 = java.lang.Math.abs(r1)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r33 = r3
            r20 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r22 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r24 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r5 <= 0) goto L163
            double r10 = r18 * r1
            double r10 = r10 - r8
            double r8 = r18 - r14
            double r10 = r10 / r8
            double r1 = r1 - r10
            double r12 = r6 / r1
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.log(r12)
            double r12 = r12 / r18
            double r16 = r6 / r10
            double r16 = java.lang.Math.abs(r16)
            double r16 = java.lang.Math.log(r16)
            double r4 = r16 / r14
            long r16 = java.lang.Double.doubleToRawLongBits(r12)
            long r16 = r16 & r26
            int r16 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r16 >= 0) goto Laf
            long r16 = java.lang.Double.doubleToRawLongBits(r4)
            long r16 = r16 & r26
            int r16 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r16 >= 0) goto Lb0
            double r12 = java.lang.Math.max(r12, r4)
            goto Lb0
        Laf:
            r12 = r4
        Lb0:
            double r4 = r1 * r18
            r16 = r4
            double r3 = -r10
            double r3 = r3 * r14
            double r4 = r16 / r3
            double r3 = java.lang.Math.log(r4)
            double r24 = r14 - r18
            double r3 = r3 / r24
            boolean r5 = java.lang.Double.isNaN(r3)
            if (r5 != 0) goto L101
            int r5 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r5 > 0) goto Lcb
            goto L101
        Lcb:
            int r5 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r5 <= 0) goto Lf3
            double r24 = r18 * r3
            double r24 = java.lang.Math.exp(r24)
            double r24 = r24 * r1
            double r3 = r3 * r14
            double r3 = java.lang.Math.exp(r3)
            double r3 = r3 * r10
            double r3 = r3 + r24
            double r3 = -r3
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto Lf3
            int r3 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r3 <= 0) goto Lef
            int r3 = (r1 > r33 ? 1 : (r1 == r33 ? 0 : -1))
            if (r3 >= 0) goto Lef
            r3 = r33
            goto Lf0
        Lef:
            r3 = r12
        Lf0:
            double r6 = -r6
            r12 = r3
            goto L102
        Lf3:
            double r3 = r10 * r14
            double r3 = r3 * r14
            double r3 = -r3
            double r12 = r16 * r18
            double r3 = r3 / r12
            double r3 = java.lang.Math.log(r3)
            double r12 = r3 / r8
            goto L102
        L101:
            double r6 = -r6
        L102:
            double r3 = r18 * r12
            double r3 = java.lang.Math.exp(r3)
            double r3 = r3 * r16
            double r8 = r10 * r14
            double r24 = r14 * r12
            double r24 = java.lang.Math.exp(r24)
            double r24 = r24 * r8
            double r24 = r24 + r3
            double r3 = java.lang.Math.abs(r24)
            r24 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r3 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r3 >= 0) goto L125
            goto L235
        L125:
            r4 = 0
        L126:
            int r3 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r3 <= 0) goto L235
            r3 = 100
            if (r4 >= r3) goto L235
            int r4 = r4 + 1
            double r22 = r18 * r12
            double r24 = java.lang.Math.exp(r22)
            double r24 = r24 * r1
            double r26 = r14 * r12
            double r28 = java.lang.Math.exp(r26)
            double r28 = r28 * r10
            double r28 = r28 + r24
            double r28 = r28 + r6
            double r22 = java.lang.Math.exp(r22)
            double r22 = r22 * r16
            double r24 = java.lang.Math.exp(r26)
            double r24 = r24 * r8
            double r24 = r24 + r22
            double r28 = r28 / r24
            double r22 = r12 - r28
            double r12 = r12 - r22
            double r12 = java.lang.Math.abs(r12)
            r30 = r22
            r22 = r12
            r12 = r30
            goto L126
        L163:
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 >= 0) goto L17b
            double r3 = r18 * r1
            double r8 = r8 - r3
            double r8 = r8 / r12
            double r1 = r1 * r1
            double r8 = r8 * r8
            double r8 = r8 + r1
            double r1 = java.lang.Math.sqrt(r8)
            double r6 = r6 / r1
            double r1 = java.lang.Math.log(r6)
            double r12 = r1 / r18
            goto L235
        L17b:
            double r3 = r18 * r1
            double r8 = r8 - r3
            double r12 = r6 / r1
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.log(r12)
            double r12 = r12 / r18
            double r14 = r6 / r8
            double r14 = java.lang.Math.abs(r14)
            double r14 = java.lang.Math.log(r14)
            r28 = r10
            r16 = r14
            r5 = 0
        L199:
            r10 = 6
            if (r5 >= r10) goto L1ab
            double r16 = r16 / r18
            double r10 = java.lang.Math.abs(r16)
            double r10 = java.lang.Math.log(r10)
            double r16 = r14 - r10
            int r5 = r5 + 1
            goto L199
        L1ab:
            double r10 = r16 / r18
            long r14 = java.lang.Double.doubleToRawLongBits(r12)
            long r14 = r14 & r26
            int r5 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r5 >= 0) goto L1c6
            long r14 = java.lang.Double.doubleToRawLongBits(r10)
            long r14 = r14 & r26
            int r5 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r5 >= 0) goto L1c7
            double r12 = java.lang.Math.max(r12, r10)
            goto L1c7
        L1c6:
            r12 = r10
        L1c7:
            double r10 = r3 + r8
            double r10 = -r10
            double r14 = r18 * r8
            double r10 = r10 / r14
            double r14 = r18 * r10
            double r16 = java.lang.Math.exp(r14)
            double r16 = r16 * r1
            double r24 = r8 * r10
            double r14 = java.lang.Math.exp(r14)
            double r14 = r14 * r24
            double r14 = r14 + r16
            boolean r5 = java.lang.Double.isNaN(r10)
            if (r5 != 0) goto L1fd
            int r5 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r5 > 0) goto L1ea
            goto L1fd
        L1ea:
            int r5 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r5 <= 0) goto L1ff
            double r10 = -r14
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 >= 0) goto L1ff
            int r5 = (r8 > r33 ? 1 : (r8 == r33 ? 0 : -1))
            if (r5 >= 0) goto L1fd
            int r5 = (r1 > r33 ? 1 : (r1 == r33 ? 0 : -1))
            if (r5 <= 0) goto L1fd
            r12 = r33
        L1fd:
            double r6 = -r6
            goto L206
        L1ff:
            double r10 = r28 / r18
            double r10 = -r10
            double r12 = r1 / r8
            double r12 = r10 - r12
        L206:
            r5 = 0
        L207:
            int r10 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r10 <= 0) goto L235
            r10 = 100
            if (r5 >= r10) goto L235
            int r5 = r5 + 1
            double r14 = r8 * r12
            double r14 = r14 + r1
            double r16 = r18 * r12
            double r22 = java.lang.Math.exp(r16)
            double r22 = r22 * r14
            double r22 = r22 + r6
            r11 = 1
            double r14 = (double) r11
            double r14 = r16 + r14
            double r14 = r14 * r8
            double r14 = r14 + r3
            double r16 = java.lang.Math.exp(r16)
            double r16 = r16 * r14
            double r22 = r22 / r16
            double r14 = r12 - r22
            double r12 = r12 - r14
            double r22 = java.lang.Math.abs(r12)
            r12 = r14
            goto L207
        L235:
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r12 = r12 * r1
            long r1 = (long) r12
        L23c:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1623B.d(float, float, float):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1622A
    public final float e(float f, float f7, float f8) {
        return 0.0f;
    }
}
