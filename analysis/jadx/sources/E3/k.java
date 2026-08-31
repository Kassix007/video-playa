package E3;

import android.content.Context;
import l3.D;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c, D {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1724q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    @Override // l3.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(m3.AbstractC1360a r21, float r22) {
        /*
            r20 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r21.M()
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L11
            r2 = r3
            goto L12
        L11:
            r2 = r4
        L12:
            if (r2 == 0) goto L17
            r21.a()
        L17:
            boolean r5 = r21.n()
            if (r5 == 0) goto L2a
            double r5 = r21.z()
            float r5 = (float) r5
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.add(r5)
            goto L17
        L2a:
            int r5 = r1.size()
            r6 = 3
            r7 = 2
            r8 = 4
            if (r5 != r8) goto L6f
            java.lang.Object r5 = r1.get(r4)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r9 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L6f
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.set(r4, r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r9)
            r1.add(r5)
            java.lang.Object r5 = r1.get(r3)
            java.lang.Float r5 = (java.lang.Float) r5
            r1.add(r5)
            java.lang.Object r5 = r1.get(r7)
            java.lang.Float r5 = (java.lang.Float) r5
            r1.add(r5)
            java.lang.Object r5 = r1.get(r6)
            java.lang.Float r5 = (java.lang.Float) r5
            r1.add(r5)
            r0.f1724q = r7
        L6f:
            if (r2 == 0) goto L74
            r21.c()
        L74:
            int r2 = r0.f1724q
            r5 = -1
            if (r2 != r5) goto L80
            int r2 = r1.size()
            int r2 = r2 / r8
            r0.f1724q = r2
        L80:
            int r2 = r0.f1724q
            float[] r5 = new float[r2]
            int[] r9 = new int[r2]
            r10 = r4
            r11 = r10
            r12 = r11
        L89:
            int r13 = r0.f1724q
            int r13 = r13 * r8
            if (r10 >= r13) goto Ldc
            int r13 = r10 / 4
            java.lang.Object r14 = r1.get(r10)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            double r14 = (double) r14
            r22 = r4
            int r4 = r10 % 4
            if (r4 == 0) goto Lc1
            r16 = 4643176031446892544(0x406fe00000000000, double:255.0)
            if (r4 == r3) goto Lbd
            if (r4 == r7) goto Lb9
            if (r4 == r6) goto Lad
            goto Ld6
        Lad:
            double r14 = r14 * r16
            int r4 = (int) r14
            r14 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.argb(r14, r11, r12, r4)
            r9[r13] = r4
            goto Ld6
        Lb9:
            double r14 = r14 * r16
            int r12 = (int) r14
            goto Ld6
        Lbd:
            double r14 = r14 * r16
            int r11 = (int) r14
            goto Ld6
        Lc1:
            if (r13 <= 0) goto Ld3
            int r4 = r13 + (-1)
            r4 = r5[r4]
            float r3 = (float) r14
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 < 0) goto Ld3
            r4 = 1008981770(0x3c23d70a, float:0.01)
            float r3 = r3 + r4
            r5[r13] = r3
            goto Ld6
        Ld3:
            float r3 = (float) r14
            r5[r13] = r3
        Ld6:
            int r10 = r10 + 1
            r4 = r22
            r3 = 1
            goto L89
        Ldc:
            r22 = r4
            i3.d r3 = new i3.d
            r3.<init>(r5, r9)
            int r4 = r1.size()
            if (r4 > r13) goto Lea
            return r3
        Lea:
            int r4 = r1.size()
            int r4 = r4 - r13
            int r4 = r4 / r7
            float[] r6 = new float[r4]
            float[] r8 = new float[r4]
            r10 = r22
        Lf6:
            int r11 = r1.size()
            if (r13 >= r11) goto L11e
            int r11 = r13 % 2
            if (r11 != 0) goto L10d
            java.lang.Object r11 = r1.get(r13)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r6[r10] = r11
            goto L11b
        L10d:
            java.lang.Object r11 = r1.get(r13)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r8[r10] = r11
            int r10 = r10 + 1
        L11b:
            int r13 = r13 + 1
            goto Lf6
        L11e:
            float[] r1 = r3.f13568a
            int r3 = r1.length
            if (r3 != 0) goto L125
            r1 = r6
            goto L175
        L125:
            if (r4 != 0) goto L128
            goto L175
        L128:
            int r3 = r1.length
            int r3 = r3 + r4
            float[] r10 = new float[r3]
            r11 = r22
            r12 = r11
            r13 = r12
            r14 = r13
        L131:
            if (r11 >= r3) goto L16c
            int r15 = r1.length
            r17 = 2143289344(0x7fc00000, float:NaN)
            if (r13 >= r15) goto L13b
            r15 = r1[r13]
            goto L13d
        L13b:
            r15 = r17
        L13d:
            if (r14 >= r4) goto L141
            r17 = r6[r14]
        L141:
            boolean r18 = java.lang.Float.isNaN(r17)
            if (r18 != 0) goto L165
            int r18 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r18 >= 0) goto L14c
            goto L165
        L14c:
            boolean r18 = java.lang.Float.isNaN(r15)
            if (r18 != 0) goto L160
            int r18 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r18 >= 0) goto L157
            goto L160
        L157:
            r10[r11] = r15
            int r13 = r13 + 1
            int r14 = r14 + 1
            int r12 = r12 + 1
            goto L169
        L160:
            r10[r11] = r17
            int r14 = r14 + 1
            goto L169
        L165:
            r10[r11] = r15
            int r13 = r13 + 1
        L169:
            int r11 = r11 + 1
            goto L131
        L16c:
            if (r12 != 0) goto L170
            r1 = r10
            goto L175
        L170:
            int r3 = r3 - r12
            float[] r1 = java.util.Arrays.copyOf(r10, r3)
        L175:
            int r3 = r1.length
            int[] r10 = new int[r3]
            r11 = r22
        L17a:
            if (r11 >= r3) goto L26d
            r12 = r1[r11]
            int r13 = java.util.Arrays.binarySearch(r5, r12)
            int r14 = java.util.Arrays.binarySearch(r6, r12)
            java.lang.String r15 = "Unreachable code."
            r17 = 1132396544(0x437f0000, float:255.0)
            if (r13 < 0) goto L1f5
            if (r14 <= 0) goto L18f
            goto L1f5
        L18f:
            r13 = r9[r13]
            if (r4 < r7) goto L1dc
            r14 = r6[r22]
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L19a
            goto L1dc
        L19a:
            r14 = 1
        L19b:
            if (r14 >= r4) goto L1d6
            r18 = r6[r14]
            int r19 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r19 >= 0) goto L1ab
            int r7 = r4 + (-1)
            if (r14 == r7) goto L1ab
            int r14 = r14 + 1
            r7 = 2
            goto L19b
        L1ab:
            if (r19 > 0) goto L1b3
            r7 = r8[r14]
        L1af:
            float r7 = r7 * r17
            int r7 = (int) r7
            goto L1c5
        L1b3:
            int r7 = r14 + (-1)
            r15 = r6[r7]
            float r18 = r18 - r15
            float r12 = r12 - r15
            float r12 = r12 / r18
            r7 = r8[r7]
            r14 = r8[r14]
            float r7 = n3.g.f(r7, r14, r12)
            goto L1af
        L1c5:
            int r12 = android.graphics.Color.red(r13)
            int r14 = android.graphics.Color.green(r13)
            int r13 = android.graphics.Color.blue(r13)
            int r7 = android.graphics.Color.argb(r7, r12, r14, r13)
            goto L1f1
        L1d6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r15)
            throw r1
        L1dc:
            r7 = r8[r22]
            float r7 = r7 * r17
            int r7 = (int) r7
            int r12 = android.graphics.Color.red(r13)
            int r14 = android.graphics.Color.green(r13)
            int r13 = android.graphics.Color.blue(r13)
            int r7 = android.graphics.Color.argb(r7, r12, r14, r13)
        L1f1:
            r10[r11] = r7
            goto L268
        L1f5:
            if (r14 >= 0) goto L1fa
            int r14 = r14 + 1
            int r14 = -r14
        L1fa:
            r7 = r8[r14]
            r13 = 2
            if (r2 < r13) goto L264
            r14 = r5[r22]
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 != 0) goto L206
            goto L264
        L206:
            r14 = 1
        L207:
            if (r14 >= r2) goto L25e
            r18 = r5[r14]
            int r19 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r19 >= 0) goto L217
            int r13 = r2 + (-1)
            if (r14 == r13) goto L217
            int r14 = r14 + 1
            r13 = 2
            goto L207
        L217:
            int r13 = r2 + (-1)
            if (r14 != r13) goto L239
            int r13 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r13 < 0) goto L239
            float r7 = r7 * r17
            int r7 = (int) r7
            r12 = r9[r14]
            int r12 = android.graphics.Color.red(r12)
            r13 = r9[r14]
            int r13 = android.graphics.Color.green(r13)
            r14 = r9[r14]
            int r14 = android.graphics.Color.blue(r14)
            int r7 = android.graphics.Color.argb(r7, r12, r13, r14)
            goto L266
        L239:
            int r13 = r14 + (-1)
            r15 = r5[r13]
            float r18 = r18 - r15
            float r12 = r12 - r15
            float r12 = r12 / r18
            r14 = r9[r14]
            r13 = r9[r13]
            int r12 = com.google.android.gms.internal.measurement.I1.W(r12, r13, r14)
            float r7 = r7 * r17
            int r7 = (int) r7
            int r13 = android.graphics.Color.red(r12)
            int r14 = android.graphics.Color.green(r12)
            int r12 = android.graphics.Color.blue(r12)
            int r7 = android.graphics.Color.argb(r7, r13, r14, r12)
            goto L266
        L25e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r15)
            throw r1
        L264:
            r7 = r9[r22]
        L266:
            r10[r11] = r7
        L268:
            int r11 = r11 + 1
            r7 = 2
            goto L17a
        L26d:
            i3.d r2 = new i3.d
            r2.<init>(r1, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.k.a(m3.a, float):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E3.c
    public int c(Context context, String str) {
        return this.f1724q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E3.c
    public int f(Context context, String str, boolean z5) {
        return 0;
    }
}
