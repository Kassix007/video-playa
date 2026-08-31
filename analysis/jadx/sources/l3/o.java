package l3;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f14479a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.m f14480b = Z.m.s("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z.m f14481c = Z.m.s("x", "y");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = n3.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = n3.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = n3.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = n3.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        Matrix matrix = n3.i.f15199a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e7) {
            return "The Path cannot loop back on itself.".equals(e7.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o3.C1415a b(m3.AbstractC1360a r25, a3.C0632k r26, float r27, l3.D r28, boolean r29, boolean r30) {
        /*
            r0 = r25
            r1 = r27
            r2 = r28
            Z.m r3 = l3.o.f14480b
            android.view.animation.LinearInterpolator r8 = l3.o.f14479a
            if (r29 == 0) goto L20a
            if (r30 == 0) goto L20a
            r0.b()
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r19 = 0
            r20 = 0
        L1f:
            boolean r21 = r0.n()
            if (r21 == 0) goto L1b0
            int r21 = r0.a0(r3)
            Z.m r7 = l3.o.f14481c
            r22 = r8
            switch(r21) {
                case 0: goto L1a0;
                case 1: goto L195;
                case 2: goto L188;
                case 3: goto Lf4;
                case 4: goto L4b;
                case 5: goto L40;
                case 6: goto L3b;
                case 7: goto L36;
                default: goto L30;
            }
        L30:
            r0.c0()
        L33:
            r8 = r22
            goto L1f
        L36:
            android.graphics.PointF r6 = l3.n.b(r0, r1)
            goto L33
        L3b:
            android.graphics.PointF r5 = l3.n.b(r0, r1)
            goto L33
        L40:
            int r7 = r0.G()
            r8 = 1
            if (r7 != r8) goto L49
            r9 = 1
            goto L33
        L49:
            r9 = 0
            goto L33
        L4b:
            int r8 = r0.M()
            r21 = r9
            r9 = 3
            if (r8 != r9) goto Lea
            r0.b()
            r4 = 0
            r8 = 0
            r9 = 0
            r15 = 0
        L5b:
            boolean r23 = r0.n()
            if (r23 == 0) goto Lcf
            r23 = r13
            int r13 = r0.a0(r7)
            if (r13 == 0) goto La3
            r24 = r3
            r3 = 1
            if (r13 == r3) goto L76
            r0.c0()
        L71:
            r13 = r23
            r3 = r24
            goto L5b
        L76:
            int r3 = r0.M()
            r13 = 7
            if (r3 != r13) goto L86
            r3 = r14
            double r13 = r0.z()
            float r15 = (float) r13
            r14 = r3
            r8 = r15
            goto L71
        L86:
            r3 = r14
            r0.a()
            double r13 = r0.z()
            float r8 = (float) r13
            int r13 = r0.M()
            r14 = 7
            if (r13 != r14) goto L9d
            double r14 = r0.z()
            float r13 = (float) r14
            r15 = r13
            goto L9e
        L9d:
            r15 = r8
        L9e:
            r0.c()
        La1:
            r14 = r3
            goto L71
        La3:
            r24 = r3
            r3 = r14
            int r4 = r0.M()
            r13 = 7
            if (r4 != r13) goto Lb5
            double r13 = r0.z()
            float r9 = (float) r13
            r14 = r3
            r4 = r9
            goto L71
        Lb5:
            r0.a()
            double r13 = r0.z()
            float r4 = (float) r13
            int r9 = r0.M()
            r13 = 7
            if (r9 != r13) goto Lca
            double r13 = r0.z()
            float r9 = (float) r13
            goto Lcb
        Lca:
            r9 = r4
        Lcb:
            r0.c()
            goto La1
        Lcf:
            r24 = r3
            r23 = r13
            r3 = r14
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r4, r8)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r15)
            r0.e()
            r15 = r7
        Le2:
            r9 = r21
        Le4:
            r8 = r22
        Le6:
            r3 = r24
            goto L1f
        Lea:
            r24 = r3
            r23 = r13
            r3 = r14
            android.graphics.PointF r11 = l3.n.b(r0, r1)
            goto Le2
        Lf4:
            r24 = r3
            r21 = r9
            r23 = r13
            r3 = r14
            int r8 = r0.M()
            r9 = 3
            if (r8 != r9) goto L182
            r0.b()
            r3 = 0
            r8 = 0
            r9 = 0
            r12 = 0
        L109:
            boolean r13 = r0.n()
            if (r13 == 0) goto L16c
            int r13 = r0.a0(r7)
            if (r13 == 0) goto L144
            r14 = 1
            if (r13 == r14) goto L11c
            r0.c0()
            goto L109
        L11c:
            int r8 = r0.M()
            r13 = 7
            if (r8 != r13) goto L12a
            double r13 = r0.z()
            float r12 = (float) r13
            r8 = r12
            goto L109
        L12a:
            r0.a()
            double r12 = r0.z()
            float r8 = (float) r12
            int r12 = r0.M()
            r13 = 7
            if (r12 != r13) goto L13f
            double r13 = r0.z()
            float r12 = (float) r13
            goto L140
        L13f:
            r12 = r8
        L140:
            r0.c()
            goto L109
        L144:
            int r3 = r0.M()
            r13 = 7
            if (r3 != r13) goto L152
            double r13 = r0.z()
            float r9 = (float) r13
            r3 = r9
            goto L109
        L152:
            r0.a()
            double r13 = r0.z()
            float r3 = (float) r13
            int r9 = r0.M()
            r13 = 7
            if (r9 != r13) goto L167
            double r13 = r0.z()
            float r9 = (float) r13
            goto L168
        L167:
            r9 = r3
        L168:
            r0.c()
            goto L109
        L16c:
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r3, r8)
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r9, r12)
            r0.e()
            r12 = r7
        L17a:
            r9 = r21
            r8 = r22
            r13 = r23
            goto Le6
        L182:
            android.graphics.PointF r10 = l3.n.b(r0, r1)
            r14 = r3
            goto L17a
        L188:
            r24 = r3
            r21 = r9
            r23 = r13
            r3 = r14
            java.lang.Object r20 = r2.a(r0, r1)
            goto Le4
        L195:
            r24 = r3
            r21 = r9
            r3 = r14
            java.lang.Object r13 = r2.a(r0, r1)
            goto Le4
        L1a0:
            r24 = r3
            r21 = r9
            r23 = r13
            r3 = r14
            double r7 = r0.z()
            float r7 = (float) r7
            r19 = r7
            goto Le4
        L1b0:
            r22 = r8
            r21 = r9
            r23 = r13
            r3 = r14
            r0.e()
            if (r21 == 0) goto L1c2
            r14 = r23
        L1be:
            r15 = 0
            r16 = 0
            goto L1e6
        L1c2:
            if (r10 == 0) goto L1cf
            if (r11 == 0) goto L1cf
            android.view.animation.BaseInterpolator r0 = a(r10, r11)
            r22 = r0
        L1cc:
            r14 = r20
            goto L1be
        L1cf:
            if (r12 == 0) goto L1cc
            if (r3 == 0) goto L1cc
            if (r15 == 0) goto L1cc
            if (r4 == 0) goto L1cc
            android.view.animation.BaseInterpolator r0 = a(r12, r15)
            android.view.animation.BaseInterpolator r1 = a(r3, r4)
            r15 = r0
            r16 = r1
            r14 = r20
            r22 = 0
        L1e6:
            if (r15 == 0) goto L1f6
            if (r16 == 0) goto L1f6
            o3.a r11 = new o3.a
            r12 = r26
            r17 = r19
            r13 = r23
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L205
        L1f6:
            r16 = r19
            r13 = r23
            o3.a r11 = new o3.a
            r17 = 0
            r12 = r26
            r15 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L205:
            r11.f15423o = r5
            r11.f15424p = r6
            return r11
        L20a:
            r24 = r3
            r22 = r8
            if (r29 == 0) goto L293
            r0.b()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r14 = 0
            r17 = 0
            r18 = 0
        L21d:
            boolean r8 = r0.n()
            if (r8 == 0) goto L26c
            r8 = r24
            int r9 = r0.a0(r8)
            r10 = 1065353216(0x3f800000, float:1.0)
            switch(r9) {
                case 0: goto L261;
                case 1: goto L25b;
                case 2: goto L255;
                case 3: goto L24f;
                case 4: goto L249;
                case 5: goto L23e;
                case 6: goto L239;
                case 7: goto L234;
                default: goto L22e;
            }
        L22e:
            r0.c0()
        L231:
            r24 = r8
            goto L21d
        L234:
            android.graphics.PointF r5 = l3.n.b(r0, r1)
            goto L231
        L239:
            android.graphics.PointF r4 = l3.n.b(r0, r1)
            goto L231
        L23e:
            int r7 = r0.G()
            r9 = 1
            if (r7 != r9) goto L247
            r7 = r9
            goto L231
        L247:
            r7 = 0
            goto L231
        L249:
            r9 = 1
            android.graphics.PointF r3 = l3.n.b(r0, r10)
            goto L231
        L24f:
            r9 = 1
            android.graphics.PointF r6 = l3.n.b(r0, r10)
            goto L231
        L255:
            r9 = 1
            java.lang.Object r18 = r2.a(r0, r1)
            goto L231
        L25b:
            r9 = 1
            java.lang.Object r14 = r2.a(r0, r1)
            goto L231
        L261:
            r9 = 1
            double r10 = r0.z()
            float r10 = (float) r10
            r24 = r8
            r17 = r10
            goto L21d
        L26c:
            r0.e()
            if (r7 == 0) goto L275
            r15 = r14
        L272:
            r16 = r22
            goto L285
        L275:
            if (r6 == 0) goto L282
            if (r3 == 0) goto L282
            android.view.animation.BaseInterpolator r8 = a(r6, r3)
            r16 = r8
            r15 = r18
            goto L285
        L282:
            r15 = r18
            goto L272
        L285:
            o3.a r12 = new o3.a
            r18 = 0
            r13 = r26
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r12.f15423o = r4
            r12.f15424p = r5
            return r12
        L293:
            java.lang.Object r0 = r2.a(r0, r1)
            o3.a r1 = new o3.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.o.b(m3.a, a3.k, float, l3.D, boolean, boolean):o3.a");
    }
}
