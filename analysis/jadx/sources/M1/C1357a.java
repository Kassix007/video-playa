package m1;

import android.graphics.Color;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1357a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15012e;
    public final float f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1357a(float f, float f7, float f8, float f9, float f10, float f11) {
        this.f15008a = f;
        this.f15009b = f7;
        this.f15010c = f8;
        this.f15011d = f9;
        this.f15012e = f10;
        this.f = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1357a a(int i) {
        m mVar = m.f15042k;
        float f = b.f(Color.red(i));
        float f7 = b.f(Color.green(i));
        float f8 = b.f(Color.blue(i));
        float[][] fArr = b.f15016d;
        float[] fArr2 = fArr[0];
        float f9 = (fArr2[2] * f8) + (fArr2[1] * f7) + (fArr2[0] * f);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * f8) + (fArr3[1] * f7) + (fArr3[0] * f);
        float[] fArr4 = fArr[2];
        float f11 = (f8 * fArr4[2]) + (f7 * fArr4[1]) + (f * fArr4[0]);
        float[][] fArr5 = b.f15013a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f9);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f9);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f9 * fArr8[0]);
        float[] fArr9 = mVar.f15048g;
        float f15 = mVar.i;
        float f16 = mVar.f15046d;
        float f17 = mVar.f15043a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = mVar.f15049h;
        float fPow = (float) Math.pow(((double) (Math.abs(f18) * f21)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f19) * f21)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f20) * f21)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f22 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f23 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f24 = fSignum2 * 20.0f;
        float f25 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f24)) / 20.0f;
        float f26 = (((fSignum * 40.0f) + f24) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f27 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f26 * mVar.f15044b) / f17, mVar.j * f16)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f28 = f17 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f15047e) * mVar.f15045c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f16) / f28);
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f15 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f27;
        return new C1357a(fAtan2, fPow5, fPow4, f29, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1357a b(float f, float f7, float f8) {
        m mVar = m.f15042k;
        float f9 = mVar.f15046d;
        Math.sqrt(((double) f) / 100.0d);
        float f10 = mVar.f15043a + 4.0f;
        float f11 = mVar.i * f7;
        Math.sqrt(((f7 / ((float) Math.sqrt(r1))) * mVar.f15046d) / f10);
        float f12 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f11) * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f8) / 180.0f;
        return new C1357a(f8, f7, f, f12, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(m1.m r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            float r2 = r0.f15009b
            double r3 = (double) r2
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            float r4 = r0.f15010c
            if (r3 == 0) goto L1f
            double r9 = (double) r4
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 != 0) goto L17
            goto L1f
        L17:
            double r9 = r9 / r7
            double r9 = java.lang.Math.sqrt(r9)
            float r3 = (float) r9
            float r2 = r2 / r3
            goto L20
        L1f:
            r2 = 0
        L20:
            double r2 = (double) r2
            float r9 = r1.f
            float r10 = r1.f15049h
            double r11 = (double) r9
            r13 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r11 = java.lang.Math.pow(r13, r11)
            r13 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r13 = r13 - r11
            r11 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r11 = java.lang.Math.pow(r13, r11)
            double r2 = r2 / r11
            r11 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r2 = java.lang.Math.pow(r2, r11)
            float r2 = (float) r2
            float r3 = r0.f15008a
            r9 = 1078530011(0x40490fdb, float:3.1415927)
            float r3 = r3 * r9
            r9 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 / r9
            double r11 = (double) r3
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r13 + r11
            double r13 = java.lang.Math.cos(r13)
            r15 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r13 = r13 + r15
            float r3 = (float) r13
            r9 = 1048576000(0x3e800000, float:0.25)
            float r3 = r3 * r9
            float r9 = r1.f15043a
            double r13 = (double) r4
            double r13 = r13 / r7
            float r4 = r1.f15046d
            double r7 = (double) r4
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 / r7
            float r4 = r1.j
            double r7 = (double) r4
            double r7 = r15 / r7
            double r7 = java.lang.Math.pow(r13, r7)
            float r4 = (float) r7
            float r9 = r9 * r4
            r4 = 1164993142(0x45706276, float:3846.1538)
            float r3 = r3 * r4
            float r4 = r1.f15047e
            float r3 = r3 * r4
            float r4 = r1.f15045c
            float r3 = r3 * r4
            float r4 = r1.f15044b
            float r9 = r9 / r4
            double r7 = java.lang.Math.sin(r11)
            float r4 = (float) r7
            double r7 = java.lang.Math.cos(r11)
            float r7 = (float) r7
            r8 = 1050421494(0x3e9c28f6, float:0.305)
            float r8 = r8 + r9
            r11 = 1102577664(0x41b80000, float:23.0)
            float r8 = r8 * r11
            float r8 = r8 * r2
            float r3 = r3 * r11
            r11 = 1093664768(0x41300000, float:11.0)
            float r11 = r11 * r2
            float r11 = r11 * r7
            float r11 = r11 + r3
            r3 = 1121452032(0x42d80000, float:108.0)
            float r2 = r2 * r3
            float r2 = r2 * r4
            float r2 = r2 + r11
            float r8 = r8 / r2
            float r7 = r7 * r8
            float r8 = r8 * r4
            r2 = 1139146752(0x43e60000, float:460.0)
            float r9 = r9 * r2
            r2 = 1138851840(0x43e18000, float:451.0)
            float r2 = r2 * r7
            float r2 = r2 + r9
            r3 = 1133510656(0x43900000, float:288.0)
            float r3 = r3 * r8
            float r3 = r3 + r2
            r2 = 1152344064(0x44af6000, float:1403.0)
            float r3 = r3 / r2
            r4 = 1147060224(0x445ec000, float:891.0)
            float r4 = r4 * r7
            float r4 = r9 - r4
            r11 = 1132625920(0x43828000, float:261.0)
            float r11 = r11 * r8
            float r4 = r4 - r11
            float r4 = r4 / r2
            r11 = 1130102784(0x435c0000, float:220.0)
            float r7 = r7 * r11
            float r9 = r9 - r7
            r7 = 1170530304(0x45c4e000, float:6300.0)
            float r8 = r8 * r7
            float r9 = r9 - r8
            float r9 = r9 / r2
            float r2 = java.lang.Math.abs(r3)
            double r7 = (double) r2
            r11 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r7 = r7 * r11
            float r2 = java.lang.Math.abs(r3)
            double r13 = (double) r2
            r15 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r13 = r15 - r13
            double r7 = r7 / r13
            double r7 = java.lang.Math.max(r5, r7)
            float r2 = (float) r7
            float r3 = java.lang.Math.signum(r3)
            r7 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r10
            float r3 = r3 * r7
            double r13 = (double) r2
            r17 = r11
            r11 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r13 = java.lang.Math.pow(r13, r11)
            float r2 = (float) r13
            float r3 = r3 * r2
            float r2 = java.lang.Math.abs(r4)
            double r13 = (double) r2
            double r13 = r13 * r17
            float r2 = java.lang.Math.abs(r4)
            double r11 = (double) r2
            double r10 = r15 - r11
            double r13 = r13 / r10
            double r10 = java.lang.Math.max(r5, r13)
            float r2 = (float) r10
            float r4 = java.lang.Math.signum(r4)
            float r4 = r4 * r7
            double r10 = (double) r2
            r12 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r10 = java.lang.Math.pow(r10, r12)
            float r2 = (float) r10
            float r4 = r4 * r2
            float r2 = java.lang.Math.abs(r9)
            double r10 = (double) r2
            double r10 = r10 * r17
            float r2 = java.lang.Math.abs(r9)
            double r12 = (double) r2
            double r15 = r15 - r12
            double r10 = r10 / r15
            double r5 = java.lang.Math.max(r5, r10)
            float r2 = (float) r5
            float r5 = java.lang.Math.signum(r9)
            float r5 = r5 * r7
            double r6 = (double) r2
            r12 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r6 = java.lang.Math.pow(r6, r12)
            float r2 = (float) r6
            float r5 = r5 * r2
            float[] r1 = r1.f15048g
            r2 = 0
            r6 = r1[r2]
            float r3 = r3 / r6
            r6 = 1
            r7 = r1[r6]
            float r4 = r4 / r7
            r7 = 2
            r1 = r1[r7]
            float r5 = r5 / r1
            float[][] r1 = m1.b.f15014b
            r8 = r1[r2]
            r9 = r8[r2]
            float r9 = r9 * r3
            r10 = r8[r6]
            float r10 = r10 * r4
            float r10 = r10 + r9
            r8 = r8[r7]
            float r8 = r8 * r5
            float r8 = r8 + r10
            r9 = r1[r6]
            r10 = r9[r2]
            float r10 = r10 * r3
            r11 = r9[r6]
            float r11 = r11 * r4
            float r11 = r11 + r10
            r9 = r9[r7]
            float r9 = r9 * r5
            float r9 = r9 + r11
            r1 = r1[r7]
            r2 = r1[r2]
            float r3 = r3 * r2
            r2 = r1[r6]
            float r4 = r4 * r2
            float r4 = r4 + r3
            r1 = r1[r7]
            float r5 = r5 * r1
            float r5 = r5 + r4
            double r10 = (double) r8
            double r12 = (double) r9
            double r14 = (double) r5
            int r1 = n1.AbstractC1393a.a(r10, r12, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C1357a.c(m1.m):int");
    }
}
