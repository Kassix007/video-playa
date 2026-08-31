package j0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import i0.C1129a;
import i0.C1131c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: j0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O3.D f13658a = new O3.D(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f13659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f13660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13661d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r21, float r22, float r23, float r24, k0.c r25) {
        /*
            r0 = r25
            boolean r1 = r0.c()
            r2 = 16
            r3 = 32
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r1 == 0) goto L61
            int r0 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r0 >= 0) goto L17
            r0 = r6
            goto L19
        L17:
            r0 = r24
        L19:
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 <= 0) goto L1e
            r0 = r5
        L1e:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            float r0 = r0 + r4
            int r0 = (int) r0
            int r0 = r0 << 24
            int r7 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r7 >= 0) goto L2b
            r7 = r6
            goto L2d
        L2b:
            r7 = r21
        L2d:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 <= 0) goto L32
            r7 = r5
        L32:
            float r7 = r7 * r1
            float r7 = r7 + r4
            int r7 = (int) r7
            int r2 = r7 << 16
            r0 = r0 | r2
            int r2 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r2 >= 0) goto L3e
            r2 = r6
            goto L40
        L3e:
            r2 = r22
        L40:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L45
            r2 = r5
        L45:
            float r2 = r2 * r1
            float r2 = r2 + r4
            int r2 = (int) r2
            int r2 = r2 << 8
            r0 = r0 | r2
            int r2 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r2 >= 0) goto L50
            goto L52
        L50:
            r6 = r23
        L52:
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L57
            goto L58
        L57:
            r5 = r6
        L58:
            float r5 = r5 * r1
            float r5 = r5 + r4
            int r1 = (int) r5
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r0 << r3
            int r2 = j0.o.f13723h
            return r0
        L61:
            long r7 = r0.f13980b
            int r1 = k0.b.f13978e
            long r7 = r7 >> r3
            int r1 = (int) r7
            r7 = 3
            if (r1 != r7) goto L6b
            goto L70
        L6b:
            java.lang.String r1 = "Color only works with ColorSpaces with 3 components"
            j0.w.a(r1)
        L70:
            int r1 = r0.f13981c
            r7 = -1
            if (r1 == r7) goto L76
            goto L7b
        L76:
            java.lang.String r7 = "Unknown color space, please use a color space in ColorSpaces"
            j0.w.a(r7)
        L7b:
            r7 = 0
            float r8 = r0.b(r7)
            float r9 = r0.a(r7)
            int r10 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r10 >= 0) goto L89
            goto L8b
        L89:
            r8 = r21
        L8b:
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L90
            goto L91
        L90:
            r9 = r8
        L91:
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            int r9 = r8 >>> 31
            int r10 = r8 >>> 23
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            r12 = 8388607(0x7fffff, float:1.1754942E-38)
            r13 = r8 & r12
            r14 = 8388608(0x800000, float:1.17549435E-38)
            r15 = -10
            r16 = 49
            r17 = 512(0x200, float:7.175E-43)
            r18 = r2
            r2 = 31
            r19 = r3
            r3 = 1
            if (r10 != r11) goto Lba
            if (r13 == 0) goto Lb7
            r8 = r17
            goto Lb8
        Lb7:
            r8 = r7
        Lb8:
            r10 = r2
            goto Le8
        Lba:
            int r10 = r10 + (-112)
            if (r10 < r2) goto Lc2
            r8 = r7
            r10 = r16
            goto Le8
        Lc2:
            if (r10 > 0) goto Ld8
            if (r10 < r15) goto Ld5
            r8 = r13 | r14
            int r10 = 1 - r10
            int r8 = r8 >> r10
            r10 = r8 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto Ld1
            int r8 = r8 + 8192
        Ld1:
            int r8 = r8 >> 13
            r10 = r7
            goto Le8
        Ld5:
            r8 = r7
            r10 = r8
            goto Le8
        Ld8:
            int r13 = r13 >> 13
            r8 = r8 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto Le7
            int r8 = r10 << 10
            r8 = r8 | r13
            int r8 = r8 + r3
            int r9 = r9 << 15
            r8 = r8 | r9
        Le5:
            short r8 = (short) r8
            goto Lef
        Le7:
            r8 = r13
        Le8:
            int r9 = r9 << 15
            int r10 = r10 << 10
            r9 = r9 | r10
            r8 = r8 | r9
            goto Le5
        Lef:
            float r9 = r0.b(r3)
            float r10 = r0.a(r3)
            int r13 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r13 >= 0) goto Lfc
            goto Lfe
        Lfc:
            r9 = r22
        Lfe:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 <= 0) goto L103
            goto L104
        L103:
            r10 = r9
        L104:
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            int r10 = r9 >>> 31
            int r13 = r9 >>> 23
            r13 = r13 & r11
            r20 = r9 & r12
            if (r13 != r11) goto L119
            if (r20 == 0) goto L116
            r9 = r17
            goto L117
        L116:
            r9 = r7
        L117:
            r13 = r2
            goto L149
        L119:
            int r13 = r13 + (-112)
            if (r13 < r2) goto L121
            r9 = r7
            r13 = r16
            goto L149
        L121:
            if (r13 > 0) goto L137
            if (r13 < r15) goto L134
            r9 = r20 | r14
            int r13 = 1 - r13
            int r9 = r9 >> r13
            r13 = r9 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L130
            int r9 = r9 + 8192
        L130:
            int r9 = r9 >> 13
            r13 = r7
            goto L149
        L134:
            r9 = r7
            r13 = r9
            goto L149
        L137:
            int r20 = r20 >> 13
            r9 = r9 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L147
            int r9 = r13 << 10
            r9 = r9 | r20
            int r9 = r9 + r3
            int r10 = r10 << 15
            r9 = r9 | r10
        L145:
            short r9 = (short) r9
            goto L150
        L147:
            r9 = r20
        L149:
            int r10 = r10 << 15
            int r13 = r13 << 10
            r10 = r10 | r13
            r9 = r9 | r10
            goto L145
        L150:
            r10 = 2
            float r13 = r0.b(r10)
            float r0 = r0.a(r10)
            int r10 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r10 >= 0) goto L15e
            goto L160
        L15e:
            r13 = r23
        L160:
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 <= 0) goto L165
            goto L166
        L165:
            r0 = r13
        L166:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r10 = r0 >>> 31
            int r13 = r0 >>> 23
            r13 = r13 & r11
            r12 = r12 & r0
            if (r13 != r11) goto L179
            if (r12 == 0) goto L176
            r7 = r17
        L176:
            r0 = r7
            r7 = r2
            goto L1a6
        L179:
            int r13 = r13 + (-112)
            if (r13 < r2) goto L181
            r0 = r7
            r7 = r16
            goto L1a6
        L181:
            if (r13 > 0) goto L195
            if (r13 < r15) goto L193
            r0 = r12 | r14
            int r2 = 1 - r13
            int r0 = r0 >> r2
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L190
            int r0 = r0 + 8192
        L190:
            int r0 = r0 >> 13
            goto L1a6
        L193:
            r0 = r7
            goto L1a6
        L195:
            int r7 = r12 >> 13
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1a4
            int r0 = r13 << 10
            r0 = r0 | r7
            int r0 = r0 + r3
            int r2 = r10 << 15
            r0 = r0 | r2
        L1a2:
            short r0 = (short) r0
            goto L1ad
        L1a4:
            r0 = r7
            r7 = r13
        L1a6:
            int r2 = r10 << 15
            int r3 = r7 << 10
            r2 = r2 | r3
            r0 = r0 | r2
            goto L1a2
        L1ad:
            int r2 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r2 >= 0) goto L1b2
            goto L1b4
        L1b2:
            r6 = r24
        L1b4:
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1b9
            goto L1ba
        L1b9:
            r5 = r6
        L1ba:
            r2 = 1149222912(0x447fc000, float:1023.0)
            float r5 = r5 * r2
            float r5 = r5 + r4
            int r2 = (int) r5
            long r3 = (long) r8
            r5 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r5
            r7 = 48
            long r3 = r3 << r7
            long r7 = (long) r9
            long r7 = r7 & r5
            long r7 = r7 << r19
            long r3 = r3 | r7
            long r7 = (long) r0
            long r5 = r5 & r7
            long r5 = r5 << r18
            long r3 = r3 | r5
            long r5 = (long) r2
            r7 = 1023(0x3ff, double:5.054E-321)
            long r5 = r5 & r7
            r0 = 6
            long r5 = r5 << r0
            long r2 = r3 | r5
            long r0 = (long) r1
            r4 = 63
            long r0 = r0 & r4
            long r0 = r0 | r2
            int r2 = j0.o.f13723h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC1145B.a(float, float, float, float, k0.c):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i7 = o.f13723h;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(long j) {
        long j7 = j << 32;
        int i = o.f13723h;
        return j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long d(int i, int i7, int i8) {
        return b(((i & 255) << 16) | (-16777216) | ((i7 & 255) << 8) | (i8 & 255));
    }

    /* JADX DEBUG: Class process forced to load method for inline: d0.l.e(int, int, android.graphics.Bitmap$Config, android.graphics.ColorSpace):android.graphics.Bitmap */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1150e e(int i, int i7, int i8) {
        Bitmap bitmapCreateBitmap;
        k0.q qVar = k0.d.f13986e;
        Bitmap.Config configW = w(i8);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i7, w(i8), true, r.a(qVar));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i7, configW);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C1150e(bitmapCreateBitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final W1.d f() {
        return new W1.d(new Paint(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long g(float f, float f7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = H.f13694c;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(long r19, long r21) {
        /*
            k0.c r0 = j0.o.f(r21)
            r1 = r19
            long r0 = j0.o.a(r1, r0)
            float r2 = j0.o.d(r21)
            float r3 = j0.o.d(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r4 - r3
            float r6 = r2 * r5
            float r6 = r6 + r3
            float r7 = j0.o.h(r0)
            float r8 = j0.o.h(r21)
            r9 = 0
            int r10 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r10 != 0) goto L28
            r8 = r9
            goto L2d
        L28:
            float r7 = r7 * r3
            float r8 = r8 * r2
            float r8 = r8 * r5
            float r8 = r8 + r7
            float r8 = r8 / r6
        L2d:
            float r7 = j0.o.g(r0)
            float r11 = j0.o.g(r21)
            if (r10 != 0) goto L39
            r11 = r9
            goto L3e
        L39:
            float r7 = r7 * r3
            float r11 = r11 * r2
            float r11 = r11 * r5
            float r11 = r11 + r7
            float r11 = r11 / r6
        L3e:
            float r0 = j0.o.e(r0)
            float r1 = j0.o.e(r21)
            if (r10 != 0) goto L4a
            r1 = r9
            goto L4f
        L4a:
            float r0 = r0 * r3
            float r1 = r1 * r2
            float r1 = r1 * r5
            float r1 = r1 + r0
            float r1 = r1 / r6
        L4f:
            k0.c r0 = j0.o.f(r21)
            boolean r2 = r0.c()
            r3 = 32
            r5 = 16
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L78
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r0
            float r6 = r6 + r7
            int r2 = (int) r6
            int r2 = r2 << 24
            float r8 = r8 * r0
            float r8 = r8 + r7
            int r4 = (int) r8
            int r4 = r4 << r5
            r2 = r2 | r4
            float r11 = r11 * r0
            float r11 = r11 + r7
            int r4 = (int) r11
            int r4 = r4 << 8
            r2 = r2 | r4
            float r1 = r1 * r0
            float r1 = r1 + r7
            int r0 = (int) r1
            r0 = r0 | r2
            long r0 = (long) r0
            long r0 = r0 << r3
            return r0
        L78:
            int r2 = java.lang.Float.floatToRawIntBits(r8)
            int r8 = r2 >>> 31
            int r10 = r2 >>> 23
            r12 = 255(0xff, float:3.57E-43)
            r10 = r10 & r12
            r13 = 8388607(0x7fffff, float:1.1754942E-38)
            r14 = r2 & r13
            r15 = 8388608(0x800000, float:1.17549435E-38)
            r19 = r3
            r3 = -10
            r16 = 49
            r17 = 512(0x200, float:7.175E-43)
            r18 = 0
            r20 = r5
            r5 = 31
            if (r10 != r12) goto La3
            if (r14 == 0) goto L9f
            r2 = r17
            goto La1
        L9f:
            r2 = r18
        La1:
            r10 = r5
            goto Ld5
        La3:
            int r10 = r10 + (-112)
            if (r10 < r5) goto Lac
            r10 = r16
            r2 = r18
            goto Ld5
        Lac:
            if (r10 > 0) goto Lc4
            if (r10 < r3) goto Lc0
            r2 = r14 | r15
            int r10 = 1 - r10
            int r2 = r2 >> r10
            r10 = r2 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto Lbb
            int r2 = r2 + 8192
        Lbb:
            int r2 = r2 >> 13
            r10 = r18
            goto Ld5
        Lc0:
            r2 = r18
            r10 = r2
            goto Ld5
        Lc4:
            int r14 = r14 >> 13
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto Ld4
            int r2 = r10 << 10
            r2 = r2 | r14
            int r2 = r2 + 1
            int r8 = r8 << 15
            r2 = r2 | r8
        Ld2:
            short r2 = (short) r2
            goto Ldc
        Ld4:
            r2 = r14
        Ld5:
            int r8 = r8 << 15
            int r10 = r10 << 10
            r8 = r8 | r10
            r2 = r2 | r8
            goto Ld2
        Ldc:
            int r8 = java.lang.Float.floatToRawIntBits(r11)
            int r10 = r8 >>> 31
            int r11 = r8 >>> 23
            r11 = r11 & r12
            r14 = r8 & r13
            if (r11 != r12) goto Lf2
            if (r14 == 0) goto Lee
            r8 = r17
            goto Lf0
        Lee:
            r8 = r18
        Lf0:
            r11 = r5
            goto L124
        Lf2:
            int r11 = r11 + (-112)
            if (r11 < r5) goto Lfb
            r11 = r16
            r8 = r18
            goto L124
        Lfb:
            if (r11 > 0) goto L113
            if (r11 < r3) goto L10f
            r8 = r14 | r15
            int r11 = 1 - r11
            int r8 = r8 >> r11
            r11 = r8 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L10a
            int r8 = r8 + 8192
        L10a:
            int r8 = r8 >> 13
            r11 = r18
            goto L124
        L10f:
            r8 = r18
            r11 = r8
            goto L124
        L113:
            int r14 = r14 >> 13
            r8 = r8 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L123
            int r8 = r11 << 10
            r8 = r8 | r14
            int r8 = r8 + 1
            int r10 = r10 << 15
            r8 = r8 | r10
        L121:
            short r8 = (short) r8
            goto L12b
        L123:
            r8 = r14
        L124:
            int r10 = r10 << 15
            int r11 = r11 << 10
            r10 = r10 | r11
            r8 = r8 | r10
            goto L121
        L12b:
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            int r10 = r1 >>> 31
            int r11 = r1 >>> 23
            r11 = r11 & r12
            r13 = r13 & r1
            if (r11 != r12) goto L141
            if (r13 == 0) goto L13a
            goto L13c
        L13a:
            r17 = r18
        L13c:
            r16 = r5
            r18 = r17
            goto L172
        L141:
            int r11 = r11 + (-112)
            if (r11 < r5) goto L146
            goto L172
        L146:
            if (r11 > 0) goto L15f
            if (r11 < r3) goto L15c
            r1 = r13 | r15
            int r3 = 1 - r11
            int r1 = r1 >> r3
            r3 = r1 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L155
            int r1 = r1 + 8192
        L155:
            int r1 = r1 >> 13
            r16 = r18
            r18 = r1
            goto L172
        L15c:
            r16 = r18
            goto L172
        L15f:
            int r18 = r13 >> 13
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L170
            int r1 = r11 << 10
            r1 = r1 | r18
            int r1 = r1 + 1
            int r3 = r10 << 15
            r1 = r1 | r3
        L16e:
            short r1 = (short) r1
            goto L17a
        L170:
            r16 = r11
        L172:
            int r1 = r10 << 15
            int r3 = r16 << 10
            r1 = r1 | r3
            r1 = r1 | r18
            goto L16e
        L17a:
            float r3 = java.lang.Math.min(r6, r4)
            float r3 = java.lang.Math.max(r9, r3)
            r4 = 1149222912(0x447fc000, float:1023.0)
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            int r0 = r0.f13981c
            long r4 = (long) r2
            r6 = 65535(0xffff, double:3.23786E-319)
            long r4 = r4 & r6
            r2 = 48
            long r4 = r4 << r2
            long r8 = (long) r8
            long r8 = r8 & r6
            long r8 = r8 << r19
            long r4 = r4 | r8
            long r1 = (long) r1
            long r1 = r1 & r6
            long r1 = r1 << r20
            long r1 = r1 | r4
            long r3 = (long) r3
            r5 = 1023(0x3ff, double:5.054E-321)
            long r3 = r3 & r5
            r5 = 6
            long r3 = r3 << r5
            long r1 = r1 | r3
            long r3 = (long) r0
            r5 = 63
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC1145B.i(long, long):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float[] j() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX DEBUG: Class process forced to load method for inline: j0.a.i(android.graphics.Canvas):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(Canvas canvas, boolean z5) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z5) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f13661d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f13659b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f13660c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f13659b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f13660c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f13659b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f13660c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f13661d = true;
        }
        if (z5) {
            try {
                Method method4 = f13659b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z5 || (method = f13660c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean m(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float n(long j) {
        k0.c cVarF = o.f(j);
        if (!k0.b.a(cVarF.f13980b, k0.b.f13974a)) {
            w.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) k0.b.b(cVarF.f13980b)));
        }
        k0.m mVar = ((k0.q) cVarF).f14038p;
        double d5 = mVar.d(o.h(j));
        float fD = (float) ((mVar.d(o.e(j)) * 0.0722d) + (mVar.d(o.g(j)) * 0.7152d) + (d5 * 0.2126d));
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long o(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f15 = 1 / (((f11 * fIntBitsToFloat2) + (f8 * fIntBitsToFloat)) + f14);
        if ((Float.floatToRawIntBits(f15) & Integer.MAX_VALUE) >= 2139095040) {
            f15 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f9 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f12) * f15)) << 32) | (((long) Float.floatToRawIntBits(((f10 * fIntBitsToFloat2) + (f7 * fIntBitsToFloat) + f13) * f15)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(float[] fArr, C1129a c1129a) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float f15 = c1129a.f13516b;
        float f16 = c1129a.f13517c;
        float f17 = c1129a.f13518d;
        float f18 = c1129a.f13519e;
        float f19 = f8 * f15;
        float f20 = f11 * f16;
        float f21 = 1.0f / ((f19 + f20) + f14);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f * f15;
        float f23 = f9 * f16;
        float f24 = (f22 + f23 + f12) * f21;
        float f25 = f15 * f7;
        float f26 = f16 * f10;
        float f27 = (f25 + f26 + f13) * f21;
        float f28 = f11 * f18;
        float f29 = 1.0f / ((f19 + f28) + f14);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f9 * f18;
        float f31 = (f22 + f30 + f12) * f29;
        float f32 = f10 * f18;
        float f33 = (f25 + f32 + f13) * f29;
        float f34 = f8 * f17;
        float f35 = 1.0f / ((f20 + f34) + f14);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f * f17;
        float f37 = (f36 + f23 + f12) * f35;
        float f38 = f17 * f7;
        float f39 = (f26 + f38 + f13) * f35;
        float f40 = 1.0f / ((f34 + f28) + f14);
        float f41 = (Float.floatToRawIntBits(f40) & Integer.MAX_VALUE) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f12) * f41;
        float f43 = (f38 + f32 + f13) * f41;
        c1129a.f13516b = Math.min(f24, Math.min(f31, Math.min(f37, f42)));
        c1129a.f13517c = Math.min(f27, Math.min(f33, Math.min(f39, f43)));
        c1129a.f13518d = Math.max(f24, Math.max(f31, Math.max(f37, f42)));
        c1129a.f13519e = Math.max(f27, Math.max(f33, Math.max(f39, f43)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        fArr[0] = f;
        fArr[1] = f9;
        fArr[2] = 0.0f;
        fArr[3] = f12;
        fArr[4] = f7;
        fArr[5] = f10;
        fArr[6] = 0.0f;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f8;
        fArr[13] = f11;
        fArr[14] = 0.0f;
        fArr[15] = f14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BlendMode s(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Rect t(W0.j jVar) {
        return new Rect(jVar.f8017a, jVar.f8018b, jVar.f8019c, jVar.f8020d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Rect u(C1131c c1131c) {
        return new Rect((int) c1131c.f13522a, (int) c1131c.f13523b, (int) c1131c.f13524c, (int) c1131c.f13525d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int v(long j) {
        float[] fArr = k0.d.f13982a;
        return (int) (o.a(j, k0.d.f13986e) >>> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bitmap.Config w(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i != 3) ? (i7 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final PorterDuff.Mode x(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(float[] fArr, float f, float f7) {
        if (fArr.length < 16) {
            return;
        }
        float f8 = (fArr[8] * 0.0f) + (fArr[4] * f7) + (fArr[0] * f) + fArr[12];
        float f9 = (fArr[9] * 0.0f) + (fArr[5] * f7) + (fArr[1] * f) + fArr[13];
        float f10 = (fArr[10] * 0.0f) + (fArr[6] * f7) + (fArr[2] * f) + fArr[14];
        float f11 = (fArr[11] * 0.0f) + (fArr[7] * f7) + (fArr[3] * f) + fArr[15];
        fArr[12] = f8;
        fArr[13] = f9;
        fArr[14] = f10;
        fArr[15] = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int z(float f, float[] fArr, int i) {
        float f7 = f >= 0.0f ? f : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f) > 1.05E-6f) {
            f7 = Float.NaN;
        }
        fArr[i] = f7;
        return !Float.isNaN(f7) ? 1 : 0;
    }

    public abstract void h(float f, long j, W1.d dVar);

    public abstract C1131c l();
}
