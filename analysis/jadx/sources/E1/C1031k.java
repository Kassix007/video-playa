package e1;

import d1.C0952c;
import d1.C0953d;

/* JADX INFO: renamed from: e1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1031k extends AbstractC1035o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f12529k = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(int[] iArr, int i, int i7, int i8, int i9, float f, int i10) {
        int i11 = i7 - i;
        int i12 = i9 - i8;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f) + 0.5f);
        int i14 = (int) ((i11 / f) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // e1.InterfaceC1024d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e1.InterfaceC1024d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.j
            int r1 = O.c.a(r1)
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L387
            e1.g r1 = r0.f12543e
            boolean r4 = r1.j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            e1.f r7 = r0.f12545h
            e1.f r8 = r0.i
            if (r4 != 0) goto L26
            int r4 = r0.f12542d
            if (r4 != r2) goto L26
            d1.d r4 = r0.f12540b
            int r9 = r4.f11880r
            r10 = 2
            if (r9 == r10) goto L28a
            if (r9 == r2) goto L2a
        L26:
            r24 = r5
            goto L2a4
        L2a:
            int r9 = r4.f11881s
            r10 = -1
            if (r9 == 0) goto L62
            if (r9 != r2) goto L32
            goto L62
        L32:
            int r9 = r4.f11847X
            if (r9 == r10) goto L54
            if (r9 == 0) goto L49
            if (r9 == r6) goto L3c
            r4 = r3
            goto L5e
        L3c:
            e1.m r9 = r4.f11858e
            e1.g r9 = r9.f12543e
            int r9 = r9.f12523g
            float r9 = (float) r9
            float r4 = r4.f11846W
        L45:
            float r9 = r9 * r4
        L46:
            float r9 = r9 + r5
            int r4 = (int) r9
            goto L5e
        L49:
            e1.m r9 = r4.f11858e
            e1.g r9 = r9.f12543e
            int r9 = r9.f12523g
            float r9 = (float) r9
            float r4 = r4.f11846W
            float r9 = r9 / r4
            goto L46
        L54:
            e1.m r9 = r4.f11858e
            e1.g r9 = r9.f12543e
            int r9 = r9.f12523g
            float r9 = (float) r9
            float r4 = r4.f11846W
            goto L45
        L5e:
            r1.d(r4)
            goto L26
        L62:
            e1.m r9 = r4.f11858e
            e1.f r11 = r9.f12545h
            e1.f r9 = r9.i
            d1.c r12 = r4.f11832I
            d1.c r12 = r12.f
            if (r12 == 0) goto L70
            r12 = r6
            goto L71
        L70:
            r12 = r3
        L71:
            d1.c r13 = r4.f11833J
            d1.c r13 = r13.f
            if (r13 == 0) goto L79
            r13 = r6
            goto L7a
        L79:
            r13 = r3
        L7a:
            d1.c r14 = r4.f11834K
            d1.c r14 = r14.f
            if (r14 == 0) goto L82
            r14 = r6
            goto L83
        L82:
            r14 = r3
        L83:
            d1.c r15 = r4.f11835L
            d1.c r15 = r15.f
            if (r15 == 0) goto L8d
            r15 = r6
        L8a:
            r24 = r5
            goto L8f
        L8d:
            r15 = r3
            goto L8a
        L8f:
            int r5 = r4.f11847X
            if (r12 == 0) goto L19d
            if (r13 == 0) goto L19d
            if (r14 == 0) goto L19d
            if (r15 == 0) goto L19d
            float r4 = r4.f11846W
            boolean r10 = r11.j
            java.util.ArrayList r12 = r11.f12526l
            int[] r16 = e1.C1031k.f12529k
            if (r10 == 0) goto Lf1
            boolean r10 = r9.j
            if (r10 == 0) goto Lf1
            boolean r2 = r7.f12520c
            if (r2 == 0) goto L386
            boolean r2 = r8.f12520c
            if (r2 != 0) goto Lb1
            goto L386
        Lb1:
            java.util.ArrayList r2 = r7.f12526l
            java.lang.Object r2 = r2.get(r3)
            e1.f r2 = (e1.C1026f) r2
            int r2 = r2.f12523g
            int r7 = r7.f
            int r17 = r2 + r7
            java.util.ArrayList r2 = r8.f12526l
            java.lang.Object r2 = r2.get(r3)
            e1.f r2 = (e1.C1026f) r2
            int r2 = r2.f12523g
            int r7 = r8.f
            int r18 = r2 - r7
            int r2 = r11.f12523g
            int r7 = r11.f
            int r19 = r2 + r7
            int r2 = r9.f12523g
            int r7 = r9.f
            int r20 = r2 - r7
            r21 = r4
            r22 = r5
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r16[r3]
            r1.d(r2)
            d1.d r1 = r0.f12540b
            e1.m r1 = r1.f11858e
            e1.g r1 = r1.f12543e
            r2 = r16[r6]
            r1.d(r2)
            return
        Lf1:
            r21 = r4
            r22 = r5
            boolean r4 = r7.j
            if (r4 == 0) goto L140
            boolean r4 = r8.j
            if (r4 == 0) goto L140
            boolean r4 = r11.f12520c
            if (r4 == 0) goto L386
            boolean r4 = r9.f12520c
            if (r4 != 0) goto L107
            goto L386
        L107:
            int r4 = r7.f12523g
            int r5 = r7.f
            int r17 = r4 + r5
            int r4 = r8.f12523g
            int r5 = r8.f
            int r18 = r4 - r5
            java.lang.Object r4 = r12.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r4 = r4.f12523g
            int r5 = r11.f
            int r19 = r4 + r5
            java.util.ArrayList r4 = r9.f12526l
            java.lang.Object r4 = r4.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r4 = r4.f12523g
            int r5 = r9.f
            int r20 = r4 - r5
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r3]
            r1.d(r4)
            d1.d r4 = r0.f12540b
            e1.m r4 = r4.f11858e
            e1.g r4 = r4.f12543e
            r5 = r16[r6]
            r4.d(r5)
        L140:
            boolean r4 = r7.f12520c
            if (r4 == 0) goto L386
            boolean r4 = r8.f12520c
            if (r4 == 0) goto L386
            boolean r4 = r11.f12520c
            if (r4 == 0) goto L386
            boolean r4 = r9.f12520c
            if (r4 != 0) goto L152
            goto L386
        L152:
            java.util.ArrayList r4 = r7.f12526l
            java.lang.Object r4 = r4.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r4 = r4.f12523g
            int r5 = r7.f
            int r17 = r4 + r5
            java.util.ArrayList r4 = r8.f12526l
            java.lang.Object r4 = r4.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r4 = r4.f12523g
            int r5 = r8.f
            int r18 = r4 - r5
            java.lang.Object r4 = r12.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r4 = r4.f12523g
            int r5 = r11.f
            int r19 = r4 + r5
            java.util.ArrayList r4 = r9.f12526l
            java.lang.Object r4 = r4.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r4 = r4.f12523g
            int r5 = r9.f
            int r20 = r4 - r5
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r3]
            r1.d(r4)
            d1.d r4 = r0.f12540b
            e1.m r4 = r4.f11858e
            e1.g r4 = r4.f12543e
            r5 = r16[r6]
            r4.d(r5)
            goto L2a4
        L19d:
            if (r12 == 0) goto L215
            if (r14 == 0) goto L215
            boolean r9 = r7.f12520c
            if (r9 == 0) goto L386
            boolean r9 = r8.f12520c
            if (r9 != 0) goto L1ab
            goto L386
        L1ab:
            float r4 = r4.f11846W
            java.util.ArrayList r9 = r7.f12526l
            java.lang.Object r9 = r9.get(r3)
            e1.f r9 = (e1.C1026f) r9
            int r9 = r9.f12523g
            int r11 = r7.f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r8.f12526l
            java.lang.Object r11 = r11.get(r3)
            e1.f r11 = (e1.C1026f) r11
            int r11 = r11.f12523g
            int r12 = r8.f
            int r11 = r11 - r12
            if (r5 == r10) goto L1f2
            if (r5 == 0) goto L1f2
            if (r5 == r6) goto L1cf
            goto L2a4
        L1cf:
            int r11 = r11 - r9
            int r5 = r0.g(r11, r3)
            float r9 = (float) r5
            float r9 = r9 / r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r6)
            if (r9 == r10) goto L1e4
            float r5 = (float) r10
            float r5 = r5 * r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L1e4:
            r1.d(r5)
            d1.d r4 = r0.f12540b
            e1.m r4 = r4.f11858e
            e1.g r4 = r4.f12543e
            r4.d(r10)
            goto L2a4
        L1f2:
            int r11 = r11 - r9
            int r5 = r0.g(r11, r3)
            float r9 = (float) r5
            float r9 = r9 * r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r6)
            if (r9 == r10) goto L207
            float r5 = (float) r10
            float r5 = r5 / r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L207:
            r1.d(r5)
            d1.d r4 = r0.f12540b
            e1.m r4 = r4.f11858e
            e1.g r4 = r4.f12543e
            r4.d(r10)
            goto L2a4
        L215:
            if (r13 == 0) goto L2a4
            if (r15 == 0) goto L2a4
            boolean r12 = r11.f12520c
            if (r12 == 0) goto L386
            boolean r12 = r9.f12520c
            if (r12 != 0) goto L223
            goto L386
        L223:
            float r4 = r4.f11846W
            java.util.ArrayList r12 = r11.f12526l
            java.lang.Object r12 = r12.get(r3)
            e1.f r12 = (e1.C1026f) r12
            int r12 = r12.f12523g
            int r11 = r11.f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f12526l
            java.lang.Object r11 = r11.get(r3)
            e1.f r11 = (e1.C1026f) r11
            int r11 = r11.f12523g
            int r9 = r9.f
            int r11 = r11 - r9
            if (r5 == r10) goto L268
            if (r5 == 0) goto L246
            if (r5 == r6) goto L268
            goto L2a4
        L246:
            int r11 = r11 - r12
            int r5 = r0.g(r11, r6)
            float r9 = (float) r5
            float r9 = r9 * r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r3)
            if (r9 == r10) goto L25b
            float r5 = (float) r10
            float r5 = r5 / r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L25b:
            r1.d(r10)
            d1.d r4 = r0.f12540b
            e1.m r4 = r4.f11858e
            e1.g r4 = r4.f12543e
            r4.d(r5)
            goto L2a4
        L268:
            int r11 = r11 - r12
            int r5 = r0.g(r11, r6)
            float r9 = (float) r5
            float r9 = r9 / r4
            float r9 = r9 + r24
            int r9 = (int) r9
            int r10 = r0.g(r9, r3)
            if (r9 == r10) goto L27d
            float r5 = (float) r10
            float r5 = r5 * r4
            float r5 = r5 + r24
            int r5 = (int) r5
        L27d:
            r1.d(r10)
            d1.d r4 = r0.f12540b
            e1.m r4 = r4.f11858e
            e1.g r4 = r4.f12543e
            r4.d(r5)
            goto L2a4
        L28a:
            r24 = r5
            d1.d r5 = r4.f11843T
            if (r5 == 0) goto L2a4
            e1.k r5 = r5.f11856d
            e1.g r5 = r5.f12543e
            boolean r9 = r5.j
            if (r9 == 0) goto L2a4
            float r4 = r4.f11885w
            int r5 = r5.f12523g
            float r5 = (float) r5
            float r5 = r5 * r4
            float r5 = r5 + r24
            int r4 = (int) r5
            r1.d(r4)
        L2a4:
            boolean r4 = r7.f12520c
            if (r4 == 0) goto L386
            boolean r4 = r8.f12520c
            if (r4 != 0) goto L2ae
            goto L386
        L2ae:
            boolean r4 = r7.j
            if (r4 == 0) goto L2bc
            boolean r4 = r8.j
            if (r4 == 0) goto L2bc
            boolean r4 = r1.j
            if (r4 == 0) goto L2bc
            goto L386
        L2bc:
            boolean r4 = r1.j
            if (r4 != 0) goto L2f6
            int r4 = r0.f12542d
            if (r4 != r2) goto L2f6
            d1.d r4 = r0.f12540b
            int r5 = r4.f11880r
            if (r5 != 0) goto L2f6
            boolean r4 = r4.x()
            if (r4 != 0) goto L2f6
            java.util.ArrayList r2 = r7.f12526l
            java.lang.Object r2 = r2.get(r3)
            e1.f r2 = (e1.C1026f) r2
            java.util.ArrayList r4 = r8.f12526l
            java.lang.Object r3 = r4.get(r3)
            e1.f r3 = (e1.C1026f) r3
            int r2 = r2.f12523g
            int r4 = r7.f
            int r2 = r2 + r4
            int r3 = r3.f12523g
            int r4 = r8.f
            int r3 = r3 + r4
            int r4 = r3 - r2
            r7.d(r2)
            r8.d(r3)
            r1.d(r4)
            return
        L2f6:
            boolean r4 = r1.j
            if (r4 != 0) goto L346
            int r4 = r0.f12542d
            if (r4 != r2) goto L346
            int r2 = r0.f12539a
            if (r2 != r6) goto L346
            java.util.ArrayList r2 = r7.f12526l
            int r2 = r2.size()
            if (r2 <= 0) goto L346
            java.util.ArrayList r2 = r8.f12526l
            int r2 = r2.size()
            if (r2 <= 0) goto L346
            java.util.ArrayList r2 = r7.f12526l
            java.lang.Object r2 = r2.get(r3)
            e1.f r2 = (e1.C1026f) r2
            java.util.ArrayList r4 = r8.f12526l
            java.lang.Object r4 = r4.get(r3)
            e1.f r4 = (e1.C1026f) r4
            int r2 = r2.f12523g
            int r5 = r7.f
            int r2 = r2 + r5
            int r4 = r4.f12523g
            int r5 = r8.f
            int r4 = r4 + r5
            int r4 = r4 - r2
            int r2 = r1.f12527m
            int r2 = java.lang.Math.min(r4, r2)
            d1.d r4 = r0.f12540b
            int r5 = r4.f11884v
            int r4 = r4.f11883u
            int r2 = java.lang.Math.max(r4, r2)
            if (r5 <= 0) goto L343
            int r2 = java.lang.Math.min(r5, r2)
        L343:
            r1.d(r2)
        L346:
            boolean r2 = r1.j
            if (r2 != 0) goto L34b
            goto L386
        L34b:
            java.util.ArrayList r2 = r7.f12526l
            java.lang.Object r2 = r2.get(r3)
            e1.f r2 = (e1.C1026f) r2
            java.util.ArrayList r4 = r8.f12526l
            java.lang.Object r3 = r4.get(r3)
            e1.f r3 = (e1.C1026f) r3
            int r4 = r2.f12523g
            int r5 = r7.f
            int r5 = r5 + r4
            int r6 = r3.f12523g
            int r9 = r8.f
            int r9 = r9 + r6
            d1.d r10 = r0.f12540b
            float r10 = r10.f11857d0
            if (r2 != r3) goto L36e
            r10 = r24
            goto L370
        L36e:
            r4 = r5
            r6 = r9
        L370:
            int r6 = r6 - r4
            int r2 = r1.f12523g
            int r6 = r6 - r2
            float r2 = (float) r4
            float r2 = r2 + r24
            float r3 = (float) r6
            float r3 = r3 * r10
            float r3 = r3 + r2
            int r2 = (int) r3
            r7.d(r2)
            int r2 = r7.f12523g
            int r1 = r1.f12523g
            int r2 = r2 + r1
            r8.d(r2)
        L386:
            return
        L387:
            d1.d r1 = r0.f12540b
            d1.c r2 = r1.f11832I
            d1.c r1 = r1.f11834K
            r0.l(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1031k.a(e1.d):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void d() {
        C0953d c0953d;
        C0953d c0953d2;
        int i;
        C0953d c0953d3;
        C0953d c0953d4;
        int i7;
        C0953d c0953d5 = this.f12540b;
        boolean z5 = c0953d5.f11850a;
        C1027g c1027g = this.f12543e;
        if (z5) {
            c1027g.d(c0953d5.q());
        }
        boolean z6 = c1027g.j;
        C1026f c1026f = this.i;
        C1026f c1026f2 = this.f12545h;
        if (!z6) {
            C0953d c0953d6 = this.f12540b;
            int i8 = c0953d6.f11878p0[0];
            this.f12542d = i8;
            if (i8 != 3) {
                if (i8 == 4 && (c0953d4 = c0953d6.f11843T) != null && ((i7 = c0953d4.f11878p0[0]) == 1 || i7 == 4)) {
                    int iQ = (c0953d4.q() - this.f12540b.f11832I.e()) - this.f12540b.f11834K.e();
                    AbstractC1035o.b(c1026f2, c0953d4.f11856d.f12545h, this.f12540b.f11832I.e());
                    AbstractC1035o.b(c1026f, c0953d4.f11856d.i, -this.f12540b.f11834K.e());
                    c1027g.d(iQ);
                    return;
                }
                if (i8 == 1) {
                    c1027g.d(c0953d6.q());
                }
            }
        } else if (this.f12542d == 4 && (c0953d2 = (c0953d = this.f12540b).f11843T) != null && ((i = c0953d2.f11878p0[0]) == 1 || i == 4)) {
            AbstractC1035o.b(c1026f2, c0953d2.f11856d.f12545h, c0953d.f11832I.e());
            AbstractC1035o.b(c1026f, c0953d2.f11856d.i, -this.f12540b.f11834K.e());
            return;
        }
        if (c1027g.j) {
            C0953d c0953d7 = this.f12540b;
            if (c0953d7.f11850a) {
                C0952c[] c0952cArr = c0953d7.f11840Q;
                C0952c c0952c = c0952cArr[0];
                C0952c c0952c2 = c0952c.f;
                if (c0952c2 != null && c0952cArr[1].f != null) {
                    if (c0953d7.x()) {
                        c1026f2.f = this.f12540b.f11840Q[0].e();
                        c1026f.f = -this.f12540b.f11840Q[1].e();
                        return;
                    }
                    C1026f c1026fH = AbstractC1035o.h(this.f12540b.f11840Q[0]);
                    if (c1026fH != null) {
                        AbstractC1035o.b(c1026f2, c1026fH, this.f12540b.f11840Q[0].e());
                    }
                    C1026f c1026fH2 = AbstractC1035o.h(this.f12540b.f11840Q[1]);
                    if (c1026fH2 != null) {
                        AbstractC1035o.b(c1026f, c1026fH2, -this.f12540b.f11840Q[1].e());
                    }
                    c1026f2.f12519b = true;
                    c1026f.f12519b = true;
                    return;
                }
                if (c0952c2 != null) {
                    C1026f c1026fH3 = AbstractC1035o.h(c0952c);
                    if (c1026fH3 != null) {
                        AbstractC1035o.b(c1026f2, c1026fH3, this.f12540b.f11840Q[0].e());
                        AbstractC1035o.b(c1026f, c1026f2, c1027g.f12523g);
                        return;
                    }
                    return;
                }
                C0952c c0952c3 = c0952cArr[1];
                if (c0952c3.f != null) {
                    C1026f c1026fH4 = AbstractC1035o.h(c0952c3);
                    if (c1026fH4 != null) {
                        AbstractC1035o.b(c1026f, c1026fH4, -this.f12540b.f11840Q[1].e());
                        AbstractC1035o.b(c1026f2, c1026f, -c1027g.f12523g);
                        return;
                    }
                    return;
                }
                if ((c0953d7 instanceof d1.i) || c0953d7.f11843T == null || c0953d7.i(7).f != null) {
                    return;
                }
                C0953d c0953d8 = this.f12540b;
                AbstractC1035o.b(c1026f2, c0953d8.f11843T.f11856d.f12545h, c0953d8.r());
                AbstractC1035o.b(c1026f, c1026f2, c1027g.f12523g);
                return;
            }
        }
        if (this.f12542d == 3) {
            C0953d c0953d9 = this.f12540b;
            int i9 = c0953d9.f11880r;
            if (i9 == 2) {
                C0953d c0953d10 = c0953d9.f11843T;
                if (c0953d10 != null) {
                    C1027g c1027g2 = c0953d10.f11858e.f12543e;
                    c1027g.f12526l.add(c1027g2);
                    c1027g2.f12525k.add(c1027g);
                    c1027g.f12519b = true;
                    c1027g.f12525k.add(c1026f2);
                    c1027g.f12525k.add(c1026f);
                }
            } else if (i9 == 3) {
                if (c0953d9.f11881s == 3) {
                    c1026f2.f12518a = this;
                    c1026f.f12518a = this;
                    C1033m c1033m = c0953d9.f11858e;
                    c1033m.f12545h.f12518a = this;
                    c1033m.i.f12518a = this;
                    c1027g.f12518a = this;
                    if (c0953d9.y()) {
                        c1027g.f12526l.add(this.f12540b.f11858e.f12543e);
                        this.f12540b.f11858e.f12543e.f12525k.add(c1027g);
                        C1033m c1033m2 = this.f12540b.f11858e;
                        c1033m2.f12543e.f12518a = this;
                        c1027g.f12526l.add(c1033m2.f12545h);
                        c1027g.f12526l.add(this.f12540b.f11858e.i);
                        this.f12540b.f11858e.f12545h.f12525k.add(c1027g);
                        this.f12540b.f11858e.i.f12525k.add(c1027g);
                    } else if (this.f12540b.x()) {
                        this.f12540b.f11858e.f12543e.f12526l.add(c1027g);
                        c1027g.f12525k.add(this.f12540b.f11858e.f12543e);
                    } else {
                        this.f12540b.f11858e.f12543e.f12526l.add(c1027g);
                    }
                } else {
                    C1027g c1027g3 = c0953d9.f11858e.f12543e;
                    c1027g.f12526l.add(c1027g3);
                    c1027g3.f12525k.add(c1027g);
                    this.f12540b.f11858e.f12545h.f12525k.add(c1027g);
                    this.f12540b.f11858e.i.f12525k.add(c1027g);
                    c1027g.f12519b = true;
                    c1027g.f12525k.add(c1026f2);
                    c1027g.f12525k.add(c1026f);
                    c1026f2.f12526l.add(c1027g);
                    c1026f.f12526l.add(c1027g);
                }
            }
        }
        C0953d c0953d11 = this.f12540b;
        C0952c[] c0952cArr2 = c0953d11.f11840Q;
        C0952c c0952c4 = c0952cArr2[0];
        C0952c c0952c5 = c0952c4.f;
        if (c0952c5 != null && c0952cArr2[1].f != null) {
            if (c0953d11.x()) {
                c1026f2.f = this.f12540b.f11840Q[0].e();
                c1026f.f = -this.f12540b.f11840Q[1].e();
                return;
            }
            C1026f c1026fH5 = AbstractC1035o.h(this.f12540b.f11840Q[0]);
            C1026f c1026fH6 = AbstractC1035o.h(this.f12540b.f11840Q[1]);
            if (c1026fH5 != null) {
                c1026fH5.b(this);
            }
            if (c1026fH6 != null) {
                c1026fH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (c0952c5 != null) {
            C1026f c1026fH7 = AbstractC1035o.h(c0952c4);
            if (c1026fH7 != null) {
                AbstractC1035o.b(c1026f2, c1026fH7, this.f12540b.f11840Q[0].e());
                c(c1026f, c1026f2, 1, c1027g);
                return;
            }
            return;
        }
        C0952c c0952c6 = c0952cArr2[1];
        if (c0952c6.f != null) {
            C1026f c1026fH8 = AbstractC1035o.h(c0952c6);
            if (c1026fH8 != null) {
                AbstractC1035o.b(c1026f, c1026fH8, -this.f12540b.f11840Q[1].e());
                c(c1026f2, c1026f, -1, c1027g);
                return;
            }
            return;
        }
        if ((c0953d11 instanceof d1.i) || (c0953d3 = c0953d11.f11843T) == null) {
            return;
        }
        AbstractC1035o.b(c1026f2, c0953d3.f11856d.f12545h, c0953d11.r());
        c(c1026f, c1026f2, 1, c1027g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void e() {
        C1026f c1026f = this.f12545h;
        if (c1026f.j) {
            this.f12540b.f11848Y = c1026f.f12523g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void f() {
        this.f12541c = null;
        this.f12545h.c();
        this.i.c();
        this.f12543e.c();
        this.f12544g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final boolean k() {
        return this.f12542d != 3 || this.f12540b.f11880r == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        this.f12544g = false;
        C1026f c1026f = this.f12545h;
        c1026f.c();
        c1026f.j = false;
        C1026f c1026f2 = this.i;
        c1026f2.c();
        c1026f2.j = false;
        this.f12543e.j = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalRun " + this.f12540b.f11864h0;
    }
}
