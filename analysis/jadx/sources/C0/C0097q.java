package C0;

/* JADX INFO: renamed from: C0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0097q extends kotlin.jvm.internal.k implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1093q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0097q(int i, Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(i, i7, cls, obj, str, str2);
        this.f1093q = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    @Override // B5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f1093q
            switch(r1) {
                case 0: goto L184;
                case 1: goto L15a;
                case 2: goto L151;
                case 3: goto L147;
                case 4: goto L13d;
                case 5: goto L21;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.receiver
            h0.h r1 = (h0.C1115h) r1
            h0.o r2 = r1.j
            if (r2 == 0) goto L19
            h0.o r2 = r1.f13411d
            h0.n r2 = r2.z0()
            h0.n r3 = h0.n.f13433t
            if (r2 != r3) goto L1e
        L19:
            C0.q r1 = r1.f13409b
            r1.invoke()
        L1e:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L21:
            java.lang.Object r1 = r0.receiver
            h0.e r1 = (h0.C1112e) r1
            r.H r2 = r1.f13405d
            r.H r3 = r1.f13406e
            C0.u r4 = r1.f13404c
            java.lang.Object r4 = r4.get()
            h0.o r4 = (h0.o) r4
            r12 = 0
            r13 = 8
            r14 = 0
            if (r4 != 0) goto L7e
            java.lang.Object[] r4 = r3.f16139b
            long[] r15 = r3.f16138a
            r16 = 128(0x80, double:6.32E-322)
            int r5 = r15.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L12d
            r6 = r14
            r18 = 255(0xff, double:1.26E-321)
        L45:
            r7 = r15[r6]
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = ~r7
            long r9 = r9 << r20
            long r9 = r9 & r7
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L79
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r14
        L60:
            if (r10 >= r9) goto L77
            long r23 = r7 & r18
            int r11 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r11 < 0) goto L6c
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto L60
        L6c:
            int r1 = r6 << 3
            int r1 = r1 + r10
            r1 = r4[r1]
            B0.d r1 = (B0.C0035d) r1
            r1.y0()
            throw r12
        L77:
            if (r9 != r13) goto L12d
        L79:
            if (r6 == r5) goto L12d
            int r6 = r6 + 1
            goto L45
        L7e:
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            boolean r5 = r4.f10099D
            if (r5 == 0) goto L12d
            boolean r5 = r2.c(r4)
            if (r5 == 0) goto L96
            r4.A0()
        L96:
            r4.z0()
            c0.l r5 = r4.f10100q
            boolean r5 = r5.f10099D
            if (r5 != 0) goto La4
            java.lang.String r5 = "visitAncestors called on an unattached node"
            y0.AbstractC1904a.b(r5)
        La4:
            c0.l r5 = r4.f10100q
            B0.L r4 = B0.AbstractC0041g.u(r4)
            r6 = r14
        Lab:
            if (r4 == 0) goto Lf1
            B0.g0 r7 = r4.f268U
            c0.l r7 = r7.f433e
            int r7 = r7.f10103t
            r7 = r7 & 5120(0x1400, float:7.175E-42)
            if (r7 == 0) goto Le2
        Lb7:
            if (r5 == 0) goto Le2
            int r7 = r5.f10102s
            r8 = r7 & 5120(0x1400, float:7.175E-42)
            if (r8 == 0) goto Ldf
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto Lc5
            int r6 = r6 + 1
        Lc5:
            boolean r7 = r5 instanceof B0.C0035d
            if (r7 == 0) goto Ldf
            boolean r7 = r3.c(r5)
            if (r7 != 0) goto Ld0
            goto Ldf
        Ld0:
            r1 = 1
            if (r6 > r1) goto Ld9
            B0.d r5 = (B0.C0035d) r5
            r5.y0()
            throw r12
        Ld9:
            B0.d r5 = (B0.C0035d) r5
            r5.y0()
            throw r12
        Ldf:
            c0.l r5 = r5.f10104u
            goto Lb7
        Le2:
            B0.L r4 = r4.s()
            if (r4 == 0) goto Lef
            B0.g0 r5 = r4.f268U
            if (r5 == 0) goto Lef
            B0.B0 r5 = r5.f432d
            goto Lab
        Lef:
            r5 = r12
            goto Lab
        Lf1:
            java.lang.Object[] r4 = r3.f16139b
            long[] r5 = r3.f16138a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L12d
            r7 = r14
        Lfb:
            r8 = r5[r7]
            long r10 = ~r8
            long r10 = r10 << r20
            long r10 = r10 & r8
            long r10 = r10 & r21
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 == 0) goto L128
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = r14
        L10f:
            if (r11 >= r10) goto L126
            long r23 = r8 & r18
            int r15 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r15 < 0) goto L11b
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L10f
        L11b:
            int r1 = r7 << 3
            int r1 = r1 + r11
            r1 = r4[r1]
            B0.d r1 = (B0.C0035d) r1
            r1.y0()
            throw r12
        L126:
            if (r10 != r13) goto L12d
        L128:
            if (r7 == r6) goto L12d
            int r7 = r7 + 1
            goto Lfb
        L12d:
            C0.q r4 = r1.f13403b
            r4.invoke()
            r2.b()
            r3.b()
            r1.f = r14
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L13d:
            java.lang.Object r1 = r0.receiver
            b.A r1 = (b.C0683A) r1
            r1.e()
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L147:
            java.lang.Object r1 = r0.receiver
            b.A r1 = (b.C0683A) r1
            r1.e()
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L151:
            java.lang.Object r1 = r0.receiver
            C0.A r1 = (C0.A) r1
            i0.c r1 = r1.D()
            return r1
        L15a:
            java.lang.Object r1 = r0.receiver
            C0.A r1 = (C0.A) r1
            boolean r2 = r1.isFocused()
            if (r2 != 0) goto L17e
            boolean r2 = r1.hasFocus()
            if (r2 == 0) goto L16b
            goto L17e
        L16b:
            boolean r2 = r1.hasFocus()
            if (r2 == 0) goto L181
            android.view.View r2 = r1.findFocus()
            if (r2 == 0) goto L17a
            r2.clearFocus()
        L17a:
            r1.clearFocus()
            goto L181
        L17e:
            r1.clearFocus()
        L181:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        L184:
            java.lang.Object r1 = r0.receiver
            android.view.View r1 = (android.view.View) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L191
            E0.e.f(r1)
        L191:
            r3 = 29
            if (r2 < r3) goto L1a2
            android.view.contentcapture.ContentCaptureSession r2 = E0.b.a(r1)
            if (r2 != 0) goto L19c
            goto L1a2
        L19c:
            E0.c r3 = new E0.c
            r3.<init>(r2, r1)
            goto L1a3
        L1a2:
            r3 = 0
        L1a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0097q.invoke():java.lang.Object");
    }
}
