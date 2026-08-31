package e1;

import d1.C0952c;
import d1.C0953d;
import java.util.ArrayList;

/* JADX INFO: renamed from: e1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1023c extends AbstractC1035o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f12509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12510l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1023c(C0953d c0953d, int i) {
        C0953d c0953d2;
        super(c0953d);
        ArrayList arrayList = new ArrayList();
        this.f12509k = arrayList;
        this.f = i;
        C0953d c0953d3 = this.f12540b;
        C0953d c0953dM = c0953d3.m(i);
        while (true) {
            c0953d2 = c0953d3;
            c0953d3 = c0953dM;
            if (c0953d3 == null) {
                break;
            } else {
                c0953dM = c0953d3.m(this.f);
            }
        }
        this.f12540b = c0953d2;
        int i7 = this.f;
        arrayList.add(i7 == 0 ? c0953d2.f11856d : i7 == 1 ? c0953d2.f11858e : null);
        C0953d c0953dL = c0953d2.l(this.f);
        while (c0953dL != null) {
            int i8 = this.f;
            arrayList.add(i8 == 0 ? c0953dL.f11856d : i8 == 1 ? c0953dL.f11858e : null);
            c0953dL = c0953dL.l(this.f);
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            AbstractC1035o abstractC1035o = (AbstractC1035o) obj;
            int i10 = this.f;
            if (i10 == 0) {
                abstractC1035o.f12540b.f11852b = this;
            } else if (i10 == 1) {
                abstractC1035o.f12540b.f11854c = this;
            }
        }
        if (this.f == 0 && ((d1.e) this.f12540b.f11843T).f11905v0 && arrayList.size() > 1) {
            this.f12540b = ((AbstractC1035o) arrayList.get(arrayList.size() - 1)).f12540b;
        }
        this.f12510l = this.f == 0 ? this.f12540b.f11865i0 : this.f12540b.f11866j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // e1.InterfaceC1024d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e1.InterfaceC1024d r28) {
        /*
            r27 = this;
            r0 = r27
            e1.f r1 = r0.f12545h
            boolean r2 = r1.j
            if (r2 == 0) goto L3b0
            e1.f r2 = r0.i
            boolean r3 = r2.j
            if (r3 != 0) goto L10
            goto L3b0
        L10:
            d1.d r3 = r0.f12540b
            d1.d r3 = r3.f11843T
            boolean r4 = r3 instanceof d1.e
            if (r4 == 0) goto L1d
            d1.e r3 = (d1.e) r3
            boolean r3 = r3.f11905v0
            goto L1e
        L1d:
            r3 = 0
        L1e:
            int r4 = r2.f12523g
            int r6 = r1.f12523g
            int r4 = r4 - r6
            java.util.ArrayList r6 = r0.f12509k
            int r7 = r6.size()
            r8 = 0
        L2a:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L3e
            java.lang.Object r11 = r6.get(r8)
            e1.o r11 = (e1.AbstractC1035o) r11
            d1.d r11 = r11.f12540b
            int r11 = r11.f11862g0
            if (r11 != r10) goto L3f
            int r8 = r8 + 1
            goto L2a
        L3e:
            r8 = r9
        L3f:
            int r11 = r7 + (-1)
            r12 = r11
        L42:
            if (r12 < 0) goto L54
            java.lang.Object r13 = r6.get(r12)
            e1.o r13 = (e1.AbstractC1035o) r13
            d1.d r13 = r13.f12540b
            int r13 = r13.f11862g0
            if (r13 != r10) goto L53
            int r12 = r12 + (-1)
            goto L42
        L53:
            r9 = r12
        L54:
            r12 = 0
        L55:
            r15 = 2
            r28 = 0
            if (r12 >= r15) goto L108
            r19 = r28
            r5 = 0
            r15 = 0
            r17 = 0
            r18 = 0
        L62:
            if (r5 >= r7) goto Lf2
            java.lang.Object r20 = r6.get(r5)
            r13 = r20
            e1.o r13 = (e1.AbstractC1035o) r13
            d1.d r14 = r13.f12540b
            r22 = r3
            int r3 = r14.f11862g0
            if (r3 != r10) goto L78
            r24 = r12
            goto Le8
        L78:
            int r18 = r18 + 1
            if (r5 <= 0) goto L83
            if (r5 < r8) goto L83
            e1.f r3 = r13.f12545h
            int r3 = r3.f
            int r15 = r15 + r3
        L83:
            e1.g r3 = r13.f12543e
            int r10 = r3.f12523g
            r23 = r10
            int r10 = r13.f12542d
            r24 = r12
            r12 = 3
            if (r10 == r12) goto L92
            r10 = 1
            goto L93
        L92:
            r10 = 0
        L93:
            if (r10 == 0) goto Lb3
            int r3 = r0.f
            if (r3 != 0) goto La3
            e1.k r12 = r14.f11856d
            e1.g r12 = r12.f12543e
            boolean r12 = r12.j
            if (r12 != 0) goto La3
            goto L3b0
        La3:
            r12 = 1
            if (r3 != r12) goto Lb0
            e1.m r3 = r14.f11858e
            e1.g r3 = r3.f12543e
            boolean r3 = r3.j
            if (r3 != 0) goto Lb0
            goto L3b0
        Lb0:
            r25 = r10
            goto Lca
        Lb3:
            r25 = r10
            r12 = 1
            int r10 = r13.f12539a
            if (r10 != r12) goto Lc3
            if (r24 != 0) goto Lc3
            int r10 = r3.f12527m
            int r17 = r17 + 1
        Lc0:
            r25 = 1
            goto Lcc
        Lc3:
            boolean r3 = r3.j
            if (r3 == 0) goto Lca
            r10 = r23
            goto Lc0
        Lca:
            r10 = r23
        Lcc:
            if (r25 != 0) goto Ldd
            int r17 = r17 + 1
            float[] r3 = r14.f11868k0
            int r10 = r0.f
            r3 = r3[r10]
            int r10 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r10 < 0) goto Lde
            float r19 = r19 + r3
            goto Lde
        Ldd:
            int r15 = r15 + r10
        Lde:
            if (r5 >= r11) goto Le8
            if (r5 >= r9) goto Le8
            e1.f r3 = r13.i
            int r3 = r3.f
            int r3 = -r3
            int r15 = r15 + r3
        Le8:
            int r5 = r5 + 1
            r3 = r22
            r12 = r24
            r10 = 8
            goto L62
        Lf2:
            r22 = r3
            r24 = r12
            if (r15 < r4) goto L103
            if (r17 != 0) goto Lfb
            goto L103
        Lfb:
            int r12 = r24 + 1
            r3 = r22
            r10 = 8
            goto L55
        L103:
            r3 = r17
            r5 = r18
            goto L10f
        L108:
            r22 = r3
            r19 = r28
            r3 = 0
            r5 = 0
            r15 = 0
        L10f:
            int r1 = r1.f12523g
            if (r22 == 0) goto L115
            int r1 = r2.f12523g
        L115:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r4) goto L12c
            r10 = 1073741824(0x40000000, float:2.0)
            if (r22 == 0) goto L125
            int r12 = r15 - r4
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 + r10
            goto L12c
        L125:
            int r12 = r15 - r4
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 - r10
        L12c:
            if (r3 <= 0) goto L1f8
            int r10 = r4 - r15
            float r10 = (float) r10
            float r12 = (float) r3
            float r12 = r10 / r12
            float r12 = r12 + r2
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L138:
            if (r13 >= r7) goto L1b1
            java.lang.Object r17 = r6.get(r13)
            r18 = r2
            r2 = r17
            e1.o r2 = (e1.AbstractC1035o) r2
            r17 = r1
            d1.d r1 = r2.f12540b
            r23 = r3
            e1.g r3 = r2.f12543e
            r24 = r10
            int r10 = r1.f11862g0
            r25 = r12
            r12 = 8
            if (r10 != r12) goto L159
        L156:
            r26 = r13
            goto L1a4
        L159:
            int r10 = r2.f12542d
            r12 = 3
            if (r10 != r12) goto L156
            boolean r10 = r3.j
            if (r10 != 0) goto L156
            int r10 = (r19 > r28 ? 1 : (r19 == r28 ? 0 : -1))
            if (r10 <= 0) goto L174
            float[] r10 = r1.f11868k0
            int r12 = r0.f
            r10 = r10[r12]
            float r10 = r10 * r24
            float r10 = r10 / r19
            float r10 = r10 + r18
            int r10 = (int) r10
            goto L176
        L174:
            r10 = r25
        L176:
            int r12 = r0.f
            if (r12 != 0) goto L17f
            int r12 = r1.f11884v
            int r1 = r1.f11883u
            goto L183
        L17f:
            int r12 = r1.f11887y
            int r1 = r1.f11886x
        L183:
            int r2 = r2.f12539a
            r26 = r13
            r13 = 1
            if (r2 != r13) goto L191
            int r2 = r3.f12527m
            int r2 = java.lang.Math.min(r10, r2)
            goto L192
        L191:
            r2 = r10
        L192:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L19c
            int r1 = java.lang.Math.min(r12, r1)
        L19c:
            if (r1 == r10) goto L1a1
            int r14 = r14 + 1
            r10 = r1
        L1a1:
            r3.d(r10)
        L1a4:
            int r13 = r26 + 1
            r1 = r17
            r2 = r18
            r3 = r23
            r10 = r24
            r12 = r25
            goto L138
        L1b1:
            r17 = r1
            r18 = r2
            r23 = r3
            if (r14 <= 0) goto L1e9
            int r3 = r23 - r14
            r1 = 0
            r15 = 0
        L1bd:
            if (r1 >= r7) goto L1eb
            java.lang.Object r2 = r6.get(r1)
            e1.o r2 = (e1.AbstractC1035o) r2
            d1.d r10 = r2.f12540b
            int r10 = r10.f11862g0
            r12 = 8
            if (r10 != r12) goto L1ce
            goto L1e6
        L1ce:
            if (r1 <= 0) goto L1d7
            if (r1 < r8) goto L1d7
            e1.f r10 = r2.f12545h
            int r10 = r10.f
            int r15 = r15 + r10
        L1d7:
            e1.g r10 = r2.f12543e
            int r10 = r10.f12523g
            int r15 = r15 + r10
            if (r1 >= r11) goto L1e6
            if (r1 >= r9) goto L1e6
            e1.f r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r15 = r15 + r2
        L1e6:
            int r1 = r1 + 1
            goto L1bd
        L1e9:
            r3 = r23
        L1eb:
            int r1 = r0.f12510l
            r2 = 2
            if (r1 != r2) goto L1f6
            if (r14 != 0) goto L1f6
            r1 = 0
            r0.f12510l = r1
            goto L200
        L1f6:
            r1 = 0
            goto L200
        L1f8:
            r17 = r1
            r18 = r2
            r23 = r3
            r1 = 0
            r2 = 2
        L200:
            if (r15 <= r4) goto L204
            r0.f12510l = r2
        L204:
            if (r5 <= 0) goto L20c
            if (r3 != 0) goto L20c
            if (r8 != r9) goto L20c
            r0.f12510l = r2
        L20c:
            int r2 = r0.f12510l
            r12 = 1
            if (r2 != r12) goto L29a
            if (r5 <= r12) goto L217
            int r4 = r4 - r15
            int r5 = r5 - r12
            int r4 = r4 / r5
            goto L220
        L217:
            if (r5 != r12) goto L21f
            int r4 = r4 - r15
            r16 = 2
            int r4 = r4 / 2
            goto L220
        L21f:
            r4 = r1
        L220:
            if (r3 <= 0) goto L223
            r4 = r1
        L223:
            r5 = r1
            r1 = r17
        L226:
            if (r5 >= r7) goto L3b0
            if (r22 == 0) goto L22f
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L230
        L22f:
            r2 = r5
        L230:
            java.lang.Object r2 = r6.get(r2)
            e1.o r2 = (e1.AbstractC1035o) r2
            d1.d r3 = r2.f12540b
            e1.f r10 = r2.i
            e1.f r12 = r2.f12545h
            int r3 = r3.f11862g0
            r13 = 8
            if (r3 != r13) goto L249
            r12.d(r1)
            r10.d(r1)
            goto L297
        L249:
            if (r5 <= 0) goto L250
            if (r22 == 0) goto L24f
            int r1 = r1 - r4
            goto L250
        L24f:
            int r1 = r1 + r4
        L250:
            if (r5 <= 0) goto L25d
            if (r5 < r8) goto L25d
            if (r22 == 0) goto L25a
            int r3 = r12.f
            int r1 = r1 - r3
            goto L25d
        L25a:
            int r3 = r12.f
            int r1 = r1 + r3
        L25d:
            if (r22 == 0) goto L263
            r10.d(r1)
            goto L266
        L263:
            r12.d(r1)
        L266:
            e1.g r3 = r2.f12543e
            int r13 = r3.f12523g
            int r14 = r2.f12542d
            r15 = 3
            if (r14 != r15) goto L276
            int r14 = r2.f12539a
            r15 = 1
            if (r14 != r15) goto L276
            int r13 = r3.f12527m
        L276:
            if (r22 == 0) goto L27a
            int r1 = r1 - r13
            goto L27b
        L27a:
            int r1 = r1 + r13
        L27b:
            if (r22 == 0) goto L282
            r12.d(r1)
        L280:
            r12 = 1
            goto L286
        L282:
            r10.d(r1)
            goto L280
        L286:
            r2.f12544g = r12
            if (r5 >= r11) goto L297
            if (r5 >= r9) goto L297
            if (r22 == 0) goto L293
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L297
        L293:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L297:
            int r5 = r5 + 1
            goto L226
        L29a:
            if (r2 != 0) goto L31a
            int r4 = r4 - r15
            r21 = 1
            int r5 = r5 + 1
            int r4 = r4 / r5
            if (r3 <= 0) goto L2a5
            r4 = r1
        L2a5:
            r5 = r1
            r1 = r17
        L2a8:
            if (r5 >= r7) goto L3b0
            if (r22 == 0) goto L2b1
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L2b2
        L2b1:
            r2 = r5
        L2b2:
            java.lang.Object r2 = r6.get(r2)
            e1.o r2 = (e1.AbstractC1035o) r2
            d1.d r3 = r2.f12540b
            e1.f r10 = r2.i
            e1.f r12 = r2.f12545h
            int r3 = r3.f11862g0
            r13 = 8
            if (r3 != r13) goto L2cb
            r12.d(r1)
            r10.d(r1)
            goto L317
        L2cb:
            if (r22 == 0) goto L2cf
            int r1 = r1 - r4
            goto L2d0
        L2cf:
            int r1 = r1 + r4
        L2d0:
            if (r5 <= 0) goto L2dd
            if (r5 < r8) goto L2dd
            if (r22 == 0) goto L2da
            int r3 = r12.f
            int r1 = r1 - r3
            goto L2dd
        L2da:
            int r3 = r12.f
            int r1 = r1 + r3
        L2dd:
            if (r22 == 0) goto L2e3
            r10.d(r1)
            goto L2e6
        L2e3:
            r12.d(r1)
        L2e6:
            e1.g r3 = r2.f12543e
            int r13 = r3.f12523g
            int r14 = r2.f12542d
            r15 = 3
            if (r14 != r15) goto L2fa
            int r2 = r2.f12539a
            r15 = 1
            if (r2 != r15) goto L2fa
            int r2 = r3.f12527m
            int r13 = java.lang.Math.min(r13, r2)
        L2fa:
            if (r22 == 0) goto L2fe
            int r1 = r1 - r13
            goto L2ff
        L2fe:
            int r1 = r1 + r13
        L2ff:
            if (r22 == 0) goto L305
            r12.d(r1)
            goto L308
        L305:
            r10.d(r1)
        L308:
            if (r5 >= r11) goto L317
            if (r5 >= r9) goto L317
            if (r22 == 0) goto L313
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L317
        L313:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L317:
            int r5 = r5 + 1
            goto L2a8
        L31a:
            r5 = 2
            if (r2 != r5) goto L3b0
            int r2 = r0.f
            if (r2 != 0) goto L326
            d1.d r2 = r0.f12540b
            float r2 = r2.f11857d0
            goto L32a
        L326:
            d1.d r2 = r0.f12540b
            float r2 = r2.f11859e0
        L32a:
            if (r22 == 0) goto L330
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = r5 - r2
        L330:
            int r4 = r4 - r15
            float r4 = (float) r4
            float r4 = r4 * r2
            float r4 = r4 + r18
            int r2 = (int) r4
            if (r2 < 0) goto L33a
            if (r3 <= 0) goto L33b
        L33a:
            r2 = r1
        L33b:
            if (r22 == 0) goto L340
            int r2 = r17 - r2
            goto L342
        L340:
            int r2 = r17 + r2
        L342:
            r5 = r1
        L343:
            if (r5 >= r7) goto L3b0
            if (r22 == 0) goto L34c
            int r1 = r5 + 1
            int r1 = r7 - r1
            goto L34d
        L34c:
            r1 = r5
        L34d:
            java.lang.Object r1 = r6.get(r1)
            e1.o r1 = (e1.AbstractC1035o) r1
            d1.d r3 = r1.f12540b
            e1.f r4 = r1.i
            e1.f r10 = r1.f12545h
            int r3 = r3.f11862g0
            r12 = 8
            if (r3 != r12) goto L368
            r10.d(r2)
            r4.d(r2)
            r14 = 1
            r15 = 3
            goto L3ad
        L368:
            if (r5 <= 0) goto L375
            if (r5 < r8) goto L375
            if (r22 == 0) goto L372
            int r3 = r10.f
            int r2 = r2 - r3
            goto L375
        L372:
            int r3 = r10.f
            int r2 = r2 + r3
        L375:
            if (r22 == 0) goto L37b
            r4.d(r2)
            goto L37e
        L37b:
            r10.d(r2)
        L37e:
            e1.g r3 = r1.f12543e
            int r13 = r3.f12523g
            int r14 = r1.f12542d
            r15 = 3
            if (r14 != r15) goto L38f
            int r1 = r1.f12539a
            r14 = 1
            if (r1 != r14) goto L390
            int r13 = r3.f12527m
            goto L390
        L38f:
            r14 = 1
        L390:
            if (r22 == 0) goto L394
            int r2 = r2 - r13
            goto L395
        L394:
            int r2 = r2 + r13
        L395:
            if (r22 == 0) goto L39b
            r10.d(r2)
            goto L39e
        L39b:
            r4.d(r2)
        L39e:
            if (r5 >= r11) goto L3ad
            if (r5 >= r9) goto L3ad
            if (r22 == 0) goto L3a9
            int r1 = r4.f
            int r1 = -r1
            int r2 = r2 - r1
            goto L3ad
        L3a9:
            int r1 = r4.f
            int r1 = -r1
            int r2 = r2 + r1
        L3ad:
            int r5 = r5 + 1
            goto L343
        L3b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1023c.a(e1.d):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void d() {
        ArrayList arrayList = this.f12509k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC1035o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C0953d c0953d = ((AbstractC1035o) arrayList.get(0)).f12540b;
        C0953d c0953d2 = ((AbstractC1035o) arrayList.get(size2 - 1)).f12540b;
        int i7 = this.f;
        C1026f c1026f = this.i;
        C1026f c1026f2 = this.f12545h;
        if (i7 == 0) {
            C0952c c0952c = c0953d.f11832I;
            C0952c c0952c2 = c0953d2.f11834K;
            C1026f c1026fI = AbstractC1035o.i(c0952c, 0);
            int iE = c0952c.e();
            C0953d c0953dM = m();
            if (c0953dM != null) {
                iE = c0953dM.f11832I.e();
            }
            if (c1026fI != null) {
                AbstractC1035o.b(c1026f2, c1026fI, iE);
            }
            C1026f c1026fI2 = AbstractC1035o.i(c0952c2, 0);
            int iE2 = c0952c2.e();
            C0953d c0953dN = n();
            if (c0953dN != null) {
                iE2 = c0953dN.f11834K.e();
            }
            if (c1026fI2 != null) {
                AbstractC1035o.b(c1026f, c1026fI2, -iE2);
            }
        } else {
            C0952c c0952c3 = c0953d.f11833J;
            C0952c c0952c4 = c0953d2.f11835L;
            C1026f c1026fI3 = AbstractC1035o.i(c0952c3, 1);
            int iE3 = c0952c3.e();
            C0953d c0953dM2 = m();
            if (c0953dM2 != null) {
                iE3 = c0953dM2.f11833J.e();
            }
            if (c1026fI3 != null) {
                AbstractC1035o.b(c1026f2, c1026fI3, iE3);
            }
            C1026f c1026fI4 = AbstractC1035o.i(c0952c4, 1);
            int iE4 = c0952c4.e();
            C0953d c0953dN2 = n();
            if (c0953dN2 != null) {
                iE4 = c0953dN2.f11835L.e();
            }
            if (c1026fI4 != null) {
                AbstractC1035o.b(c1026f, c1026fI4, -iE4);
            }
        }
        c1026f2.f12518a = this;
        c1026f.f12518a = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12509k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1035o) arrayList.get(i)).e();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void f() {
        this.f12541c = null;
        ArrayList arrayList = this.f12509k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC1035o) obj).f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final long j() {
        ArrayList arrayList = this.f12509k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1035o abstractC1035o = (AbstractC1035o) arrayList.get(i);
            j = ((long) abstractC1035o.i.f) + abstractC1035o.j() + j + ((long) abstractC1035o.f12545h.f);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final boolean k() {
        ArrayList arrayList = this.f12509k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1035o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0953d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12509k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0953d c0953d = ((AbstractC1035o) arrayList.get(i)).f12540b;
            if (c0953d.f11862g0 != 8) {
                return c0953d;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0953d n() {
        ArrayList arrayList = this.f12509k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0953d c0953d = ((AbstractC1035o) arrayList.get(size)).f12540b;
            if (c0953d.f11862g0 != 8) {
                return c0953d;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f12509k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((AbstractC1035o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
