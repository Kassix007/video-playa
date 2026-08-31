package l3;

/* JADX INFO: renamed from: l3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1229c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14449a = Z.m.s("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.m f14450b = Z.m.s("k");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h3.C1125d a(m3.C1361b r26, a3.C0632k r27) {
        /*
            r0 = r26
            r2 = r27
            r8 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
            int r1 = r0.M()
            r4 = 3
            r9 = 0
            if (r1 != r4) goto L14
            r1 = 1
            r10 = r1
            goto L15
        L14:
            r10 = r9
        L15:
            if (r10 == 0) goto L1a
            r0.b()
        L1a:
            r1 = 0
            r4 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L26:
            boolean r5 = r0.n()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto Le3
            Z.m r5 = l3.AbstractC1229c.f14449a
            int r5 = r0.a0(r5)
            switch(r5) {
                case 0: goto Lc1;
                case 1: goto Lbb;
                case 2: goto Lac;
                case 3: goto L57;
                case 4: goto L5c;
                case 5: goto L52;
                case 6: goto L4d;
                case 7: goto L48;
                case 8: goto L43;
                case 9: goto L3e;
                default: goto L37;
            }
        L37:
            r0.b0()
            r0.c0()
            goto L26
        L3e:
            h3.b r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r2, r9)
            goto L26
        L43:
            h3.b r15 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r2, r9)
            goto L26
        L48:
            h3.b r23 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r2, r9)
            goto L26
        L4d:
            h3.b r22 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r2, r9)
            goto L26
        L52:
            h3.a r21 = com.google.android.gms.internal.measurement.AbstractC0836n2.J(r26, r27)
            goto L26
        L57:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r2.a(r1)
        L5c:
            h3.b r1 = com.google.android.gms.internal.measurement.AbstractC0836n2.H(r0, r2, r9)
            java.lang.Object r5 = r1.f4346r
            java.util.List r5 = (java.util.List) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L87
            r6 = r1
            o3.a r1 = new o3.a
            float r7 = r2.f8842m
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r16 = r5
            r5 = 0
            r17 = r6
            r6 = 0
            r18 = r4
            r4 = r3
            r8 = r16
            r11 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.add(r1)
            goto La6
        L87:
            r17 = r1
            r11 = r4
            r8 = r5
            java.lang.Object r1 = r8.get(r9)
            o3.a r1 = (o3.C1415a) r1
            java.lang.Object r1 = r1.f15413b
            if (r1 != 0) goto La6
            o3.a r1 = new o3.a
            float r4 = r2.f8842m
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r5 = 0
            r6 = 0
            r4 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.set(r9, r1)
        La6:
            r4 = r11
            r1 = r17
        La9:
            r8 = 0
            goto L26
        Lac:
            r11 = r4
            h3.a r14 = new h3.a
            l3.f r4 = l3.f.f14459w
            java.util.ArrayList r4 = l3.p.a(r0, r2, r6, r4, r9)
            r5 = 4
            r14.<init>(r5, r4)
        Lb9:
            r4 = r11
            goto La9
        Lbb:
            r11 = r4
            h3.e r13 = l3.AbstractC1227a.b(r26, r27)
            goto La9
        Lc1:
            r11 = r4
            r0.b()
        Lc5:
            boolean r4 = r0.n()
            if (r4 == 0) goto Ldf
            Z.m r4 = l3.AbstractC1229c.f14450b
            int r4 = r0.a0(r4)
            if (r4 == 0) goto Lda
            r0.b0()
            r0.c0()
            goto Lc5
        Lda:
            F3.c r12 = l3.AbstractC1227a.a(r26, r27)
            goto Lc5
        Ldf:
            r0.e()
            goto Lb9
        Le3:
            r11 = r4
            if (r10 == 0) goto Le9
            r0.e()
        Le9:
            if (r12 == 0) goto L108
            boolean r0 = r12.i()
            if (r0 == 0) goto L105
            java.util.ArrayList r0 = r12.f1948r
            java.lang.Object r0 = r0.get(r9)
            o3.a r0 = (o3.C1415a) r0
            java.lang.Object r0 = r0.f15413b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            r2 = 0
            boolean r0 = r0.equals(r2, r2)
            if (r0 == 0) goto L105
            goto L108
        L105:
            r17 = r12
            goto L10a
        L108:
            r17 = 0
        L10a:
            if (r13 == 0) goto L12b
            boolean r0 = r13 instanceof h3.C1124c
            if (r0 != 0) goto L12c
            boolean r0 = r13.i()
            if (r0 == 0) goto L12c
            java.util.List r0 = r13.h()
            java.lang.Object r0 = r0.get(r9)
            o3.a r0 = (o3.C1415a) r0
            java.lang.Object r0 = r0.f15413b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            r2 = 0
            boolean r0 = r0.equals(r2, r2)
            if (r0 == 0) goto L12c
        L12b:
            r13 = 0
        L12c:
            if (r1 == 0) goto L150
            boolean r0 = r1.i()
            if (r0 == 0) goto L14d
            java.lang.Object r0 = r1.f4346r
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            o3.a r0 = (o3.C1415a) r0
            java.lang.Object r0 = r0.f15413b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r18 = 0
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L14d
            goto L150
        L14d:
            r20 = r1
            goto L152
        L150:
            r20 = 0
        L152:
            if (r14 == 0) goto L178
            boolean r0 = r14.i()
            if (r0 == 0) goto L175
            java.lang.Object r0 = r14.f4346r
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            o3.a r0 = (o3.C1415a) r0
            java.lang.Object r0 = r0.f15413b
            o3.c r0 = (o3.C1417c) r0
            float r1 = r0.f15431a
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L175
            float r0 = r0.f15432b
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L175
            goto L178
        L175:
            r19 = r14
            goto L17a
        L178:
            r19 = 0
        L17a:
            if (r15 == 0) goto L19e
            boolean r0 = r15.i()
            if (r0 == 0) goto L19b
            java.lang.Object r0 = r15.f4346r
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            o3.a r0 = (o3.C1415a) r0
            java.lang.Object r0 = r0.f15413b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r18 = 0
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L19b
            goto L19e
        L19b:
            r24 = r15
            goto L1a0
        L19e:
            r24 = 0
        L1a0:
            if (r11 == 0) goto L1c4
            boolean r0 = r11.i()
            if (r0 == 0) goto L1c1
            java.lang.Object r0 = r11.f4346r
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            o3.a r0 = (o3.C1415a) r0
            java.lang.Object r0 = r0.f15413b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r18 = 0
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L1c1
            goto L1c4
        L1c1:
            r25 = r11
            goto L1c6
        L1c4:
            r25 = 0
        L1c6:
            h3.d r16 = new h3.d
            r18 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC1229c.a(m3.b, a3.k):h3.d");
    }
}
