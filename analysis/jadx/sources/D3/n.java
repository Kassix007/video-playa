package d3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends e {
    public final i3.l i;
    public final Path j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f12250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f12251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f12252m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(List list) {
        super(list);
        this.i = new i3.l();
        this.j = new Path();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    @Override // d3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(o3.C1415a r25, float r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r6 = r26
            java.lang.Object r2 = r1.f15413b
            i3.l r2 = (i3.l) r2
            java.lang.Object r3 = r1.f15414c
            i3.l r3 = (i3.l) r3
            if (r3 != 0) goto L12
            r4 = r2
            goto L13
        L12:
            r4 = r3
        L13:
            i3.l r5 = r0.i
            java.util.ArrayList r7 = r5.f13607a
            android.graphics.PointF r8 = r5.f13608b
            if (r8 != 0) goto L22
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
            r5.f13608b = r8
        L22:
            boolean r8 = r2.f13609c
            java.util.ArrayList r9 = r2.f13607a
            r11 = 1
            if (r8 != 0) goto L30
            boolean r8 = r4.f13609c
            if (r8 == 0) goto L2e
            goto L30
        L2e:
            r8 = 0
            goto L31
        L30:
            r8 = r11
        L31:
            r5.f13609c = r8
            int r8 = r9.size()
            java.util.ArrayList r12 = r4.f13607a
            int r13 = r12.size()
            if (r8 == r13) goto L60
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r13 = "Curves must have the same number of control points. Shape 1: "
            r8.<init>(r13)
            int r13 = r9.size()
            r8.append(r13)
            java.lang.String r13 = "\tShape 2: "
            r8.append(r13)
            int r13 = r12.size()
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            n3.c.b(r8)
        L60:
            int r8 = r9.size()
            int r13 = r12.size()
            int r8 = java.lang.Math.min(r8, r13)
            int r13 = r7.size()
            if (r13 >= r8) goto L83
            int r13 = r7.size()
        L76:
            if (r13 >= r8) goto L9b
            g3.a r14 = new g3.a
            r14.<init>()
            r7.add(r14)
            int r13 = r13 + 1
            goto L76
        L83:
            int r13 = r7.size()
            if (r13 <= r8) goto L9b
            int r13 = r7.size()
            int r13 = r13 - r11
        L8e:
            if (r13 < r8) goto L9b
            int r14 = r7.size()
            int r14 = r14 - r11
            r7.remove(r14)
            int r13 = r13 + (-1)
            goto L8e
        L9b:
            android.graphics.PointF r8 = r2.f13608b
            android.graphics.PointF r4 = r4.f13608b
            float r13 = r8.x
            float r14 = r4.x
            float r13 = n3.g.f(r13, r14, r6)
            float r8 = r8.y
            float r4 = r4.y
            float r4 = n3.g.f(r8, r4, r6)
            r5.a(r13, r4)
            int r4 = r7.size()
            int r4 = r4 - r11
        Lb7:
            if (r4 < 0) goto L137
            java.lang.Object r8 = r9.get(r4)
            g3.a r8 = (g3.C1082a) r8
            java.lang.Object r13 = r12.get(r4)
            g3.a r13 = (g3.C1082a) r13
            android.graphics.PointF r14 = r8.f13038a
            android.graphics.PointF r15 = r8.f13039b
            android.graphics.PointF r8 = r8.f13040c
            r16 = r11
            android.graphics.PointF r11 = r13.f13038a
            android.graphics.PointF r10 = r13.f13039b
            android.graphics.PointF r13 = r13.f13040c
            java.lang.Object r17 = r7.get(r4)
            r18 = r5
            r5 = r17
            g3.a r5 = (g3.C1082a) r5
            r17 = r9
            float r9 = r14.x
            r19 = r12
            float r12 = r11.x
            float r9 = n3.g.f(r9, r12, r6)
            float r12 = r14.y
            float r11 = r11.y
            float r11 = n3.g.f(r12, r11, r6)
            android.graphics.PointF r5 = r5.f13038a
            r5.set(r9, r11)
            java.lang.Object r5 = r7.get(r4)
            g3.a r5 = (g3.C1082a) r5
            float r9 = r15.x
            float r11 = r10.x
            float r9 = n3.g.f(r9, r11, r6)
            float r11 = r15.y
            float r10 = r10.y
            float r10 = n3.g.f(r11, r10, r6)
            android.graphics.PointF r5 = r5.f13039b
            r5.set(r9, r10)
            java.lang.Object r5 = r7.get(r4)
            g3.a r5 = (g3.C1082a) r5
            float r9 = r8.x
            float r10 = r13.x
            float r9 = n3.g.f(r9, r10, r6)
            float r8 = r8.y
            float r10 = r13.y
            float r8 = n3.g.f(r8, r10, r6)
            android.graphics.PointF r5 = r5.f13040c
            r5.set(r9, r8)
            int r4 = r4 + (-1)
            r11 = r16
            r9 = r17
            r5 = r18
            r12 = r19
            goto Lb7
        L137:
            r18 = r5
            r16 = r11
            java.util.ArrayList r4 = r0.f12252m
            if (r4 == 0) goto L3a0
            int r4 = r4.size()
            int r4 = r4 + (-1)
            r5 = r18
        L147:
            java.util.ArrayList r7 = r5.f13607a
            if (r4 < 0) goto L39a
            java.util.ArrayList r8 = r0.f12252m
            java.lang.Object r8 = r8.get(r4)
            c3.r r8 = (c3.r) r8
            r8.getClass()
            int r9 = r7.size()
            r10 = 2
            if (r9 > r10) goto L15e
            goto L16f
        L15e:
            d3.e r9 = r8.f10219b
            java.lang.Object r9 = r9.e()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = 0
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 != 0) goto L176
        L16f:
            r18 = r4
        L171:
            r9 = r2
            r21 = r3
            goto L38f
        L176:
            boolean r11 = r5.f13609c
            int r12 = r7.size()
            int r12 = r12 + (-1)
            r13 = 0
        L17f:
            if (r12 < 0) goto L1d7
            java.lang.Object r14 = r7.get(r12)
            g3.a r14 = (g3.C1082a) r14
            int r15 = r12 + (-1)
            int r10 = r7.size()
            int r10 = c3.r.d(r15, r10)
            java.lang.Object r10 = r7.get(r10)
            g3.a r10 = (g3.C1082a) r10
            if (r12 != 0) goto L19e
            if (r11 != 0) goto L19e
            android.graphics.PointF r15 = r5.f13608b
            goto L1a0
        L19e:
            android.graphics.PointF r15 = r10.f13040c
        L1a0:
            if (r12 != 0) goto L1a6
            if (r11 != 0) goto L1a6
            r10 = r15
            goto L1a8
        L1a6:
            android.graphics.PointF r10 = r10.f13039b
        L1a8:
            android.graphics.PointF r14 = r14.f13038a
            r18 = r4
            boolean r4 = r5.f13609c
            if (r4 != 0) goto L1bd
            if (r12 == 0) goto L1ba
            int r4 = r7.size()
            int r4 = r4 + (-1)
            if (r12 != r4) goto L1bd
        L1ba:
            r4 = r16
            goto L1be
        L1bd:
            r4 = 0
        L1be:
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L1cf
            boolean r10 = r14.equals(r15)
            if (r10 == 0) goto L1cf
            if (r4 != 0) goto L1cf
            int r13 = r13 + 2
            goto L1d1
        L1cf:
            int r13 = r13 + 1
        L1d1:
            int r12 = r12 + (-1)
            r4 = r18
            r10 = 0
            goto L17f
        L1d7:
            r18 = r4
            i3.l r4 = r8.f10220c
            if (r4 == 0) goto L1e8
            java.util.ArrayList r4 = r4.f13607a
            int r4 = r4.size()
            if (r4 == r13) goto L1e6
            goto L1e8
        L1e6:
            r13 = 0
            goto L209
        L1e8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r13)
            r10 = 0
        L1ee:
            if (r10 >= r13) goto L1fb
            g3.a r12 = new g3.a
            r12.<init>()
            r4.add(r12)
            int r10 = r10 + 1
            goto L1ee
        L1fb:
            i3.l r10 = new i3.l
            android.graphics.PointF r12 = new android.graphics.PointF
            r13 = 0
            r12.<init>(r13, r13)
            r13 = 0
            r10.<init>(r12, r13, r4)
            r8.f10220c = r10
        L209:
            i3.l r4 = r8.f10220c
            r4.f13609c = r11
            android.graphics.PointF r8 = r5.f13608b
            float r10 = r8.x
            float r8 = r8.y
            r4.a(r10, r8)
            java.util.ArrayList r8 = r4.f13607a
            boolean r10 = r5.f13609c
            r11 = r13
            r12 = r11
        L21c:
            int r14 = r7.size()
            if (r11 >= r14) goto L38b
            java.lang.Object r14 = r7.get(r11)
            g3.a r14 = (g3.C1082a) r14
            int r15 = r11 + (-1)
            int r13 = r7.size()
            int r13 = c3.r.d(r15, r13)
            java.lang.Object r13 = r7.get(r13)
            g3.a r13 = (g3.C1082a) r13
            int r15 = r11 + (-2)
            int r6 = r7.size()
            int r6 = c3.r.d(r15, r6)
            java.lang.Object r6 = r7.get(r6)
            g3.a r6 = (g3.C1082a) r6
            if (r11 != 0) goto L24f
            if (r10 != 0) goto L24f
            android.graphics.PointF r15 = r5.f13608b
            goto L251
        L24f:
            android.graphics.PointF r15 = r13.f13040c
        L251:
            if (r11 != 0) goto L25b
            if (r10 != 0) goto L25b
            r17 = r7
            r7 = r15
        L258:
            r19 = r9
            goto L260
        L25b:
            r17 = r7
            android.graphics.PointF r7 = r13.f13039b
            goto L258
        L260:
            android.graphics.PointF r9 = r14.f13038a
            android.graphics.PointF r6 = r6.f13040c
            r20 = r10
            android.graphics.PointF r10 = r14.f13040c
            boolean r1 = r5.f13609c
            if (r1 != 0) goto L279
            if (r11 == 0) goto L276
            int r1 = r17.size()
            int r1 = r1 + (-1)
            if (r11 != r1) goto L279
        L276:
            r1 = r16
            goto L27a
        L279:
            r1 = 0
        L27a:
            boolean r7 = r7.equals(r15)
            if (r7 == 0) goto L337
            boolean r7 = r9.equals(r15)
            if (r7 == 0) goto L337
            if (r1 != 0) goto L337
            float r1 = r15.x
            float r7 = r6.x
            float r7 = r1 - r7
            float r9 = r15.y
            float r13 = r6.y
            float r13 = r9 - r13
            float r14 = r10.x
            float r14 = r14 - r1
            float r1 = r10.y
            float r1 = r1 - r9
            r9 = r2
            r21 = r3
            double r2 = (double) r7
            r22 = r4
            r7 = r5
            double r4 = (double) r13
            double r2 = java.lang.Math.hypot(r2, r4)
            float r2 = (float) r2
            double r3 = (double) r14
            double r13 = (double) r1
            double r3 = java.lang.Math.hypot(r3, r13)
            float r1 = (float) r3
            float r2 = r19 / r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = java.lang.Math.min(r2, r3)
            float r1 = r19 / r1
            float r1 = java.lang.Math.min(r1, r3)
            float r3 = r15.x
            float r4 = r6.x
            float r4 = k1.i.a(r4, r3, r2, r3)
            float r5 = r15.y
            float r6 = r6.y
            float r2 = k1.i.a(r6, r5, r2, r5)
            float r6 = r10.x
            float r6 = k1.i.a(r6, r3, r1, r3)
            float r10 = r10.y
            float r1 = k1.i.a(r10, r5, r1, r5)
            float r10 = r4 - r3
            r13 = 1057835346(0x3f0d4952, float:0.5519)
            float r10 = r10 * r13
            float r10 = r4 - r10
            float r14 = r2 - r5
            float r14 = r14 * r13
            float r14 = r2 - r14
            float r3 = r6 - r3
            float r3 = r3 * r13
            float r3 = r6 - r3
            float r5 = r1 - r5
            float r5 = r5 * r13
            float r5 = r1 - r5
            int r13 = r12 + (-1)
            int r15 = r8.size()
            int r13 = c3.r.d(r13, r15)
            java.lang.Object r13 = r8.get(r13)
            g3.a r13 = (g3.C1082a) r13
            java.lang.Object r15 = r8.get(r12)
            g3.a r15 = (g3.C1082a) r15
            r23 = r7
            android.graphics.PointF r7 = r13.f13039b
            r7.set(r4, r2)
            android.graphics.PointF r7 = r13.f13040c
            r7.set(r4, r2)
            r7 = r22
            if (r11 != 0) goto L318
            r7.a(r4, r2)
        L318:
            android.graphics.PointF r2 = r15.f13038a
            r2.set(r10, r14)
            int r2 = r12 + 1
            java.lang.Object r2 = r8.get(r2)
            g3.a r2 = (g3.C1082a) r2
            android.graphics.PointF r4 = r15.f13039b
            r4.set(r3, r5)
            android.graphics.PointF r3 = r15.f13040c
            r3.set(r6, r1)
            android.graphics.PointF r2 = r2.f13038a
            r2.set(r6, r1)
            int r12 = r12 + 2
            goto L376
        L337:
            r9 = r2
            r21 = r3
            r7 = r4
            r23 = r5
            int r1 = r12 + (-1)
            int r2 = r8.size()
            int r1 = c3.r.d(r1, r2)
            java.lang.Object r1 = r8.get(r1)
            g3.a r1 = (g3.C1082a) r1
            java.lang.Object r2 = r8.get(r12)
            g3.a r2 = (g3.C1082a) r2
            android.graphics.PointF r3 = r13.f13039b
            float r4 = r3.x
            float r3 = r3.y
            android.graphics.PointF r5 = r1.f13039b
            r5.set(r4, r3)
            android.graphics.PointF r3 = r13.f13040c
            float r4 = r3.x
            float r3 = r3.y
            android.graphics.PointF r1 = r1.f13040c
            r1.set(r4, r3)
            android.graphics.PointF r1 = r14.f13038a
            float r3 = r1.x
            float r1 = r1.y
            android.graphics.PointF r2 = r2.f13038a
            r2.set(r3, r1)
            int r12 = r12 + 1
        L376:
            int r11 = r11 + 1
            r1 = r25
            r6 = r26
            r4 = r7
            r2 = r9
            r7 = r17
            r9 = r19
            r10 = r20
            r3 = r21
            r5 = r23
            r13 = 0
            goto L21c
        L38b:
            r7 = r4
            r5 = r7
            goto L171
        L38f:
            int r4 = r18 + (-1)
            r1 = r25
            r6 = r26
            r2 = r9
            r3 = r21
            goto L147
        L39a:
            r23 = r5
        L39c:
            r9 = r2
            r21 = r3
            goto L3a3
        L3a0:
            r5 = r18
            goto L39c
        L3a3:
            android.graphics.Path r1 = r0.j
            n3.g.e(r5, r1)
            Z.m r2 = r0.f12234e
            if (r2 == 0) goto L3f5
            android.graphics.Path r1 = r0.f12250k
            if (r1 != 0) goto L3be
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.f12250k = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.f12251l = r1
        L3be:
            android.graphics.Path r1 = r0.f12250k
            n3.g.e(r9, r1)
            if (r21 == 0) goto L3cd
            android.graphics.Path r1 = r0.f12251l
            r3 = r21
            n3.g.e(r3, r1)
            goto L3cf
        L3cd:
            r3 = r21
        L3cf:
            Z.m r1 = r0.f12234e
            r2 = r25
            float r4 = r2.f15417g
            java.lang.Float r2 = r2.f15418h
            float r2 = r2.floatValue()
            r21 = r3
            r3 = r2
            r2 = r4
            android.graphics.Path r4 = r0.f12250k
            if (r21 != 0) goto L3e5
            r5 = r4
            goto L3e7
        L3e5:
            android.graphics.Path r5 = r0.f12251l
        L3e7:
            float r7 = r0.d()
            float r8 = r0.f12233d
            r6 = r26
            java.lang.Object r1 = r1.o(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Path r1 = (android.graphics.Path) r1
        L3f5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.n.f(o3.a, float):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final boolean k() {
        ArrayList arrayList = this.f12252m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
