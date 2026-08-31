package C0;

/* JADX INFO: renamed from: C0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0089m implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1062r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0089m(int i, Object obj) {
        this.f1061q = i;
        this.f1062r = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: L.k.a(L.k):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:342:0x00d2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0331  */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60, types: [int] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r39 = this;
            r1 = r39
            int r0 = r1.f1061q
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L58b;
                case 1: goto L561;
                case 2: goto L48f;
                case 3: goto L487;
                case 4: goto L47f;
                case 5: goto L46d;
                case 6: goto L465;
                case 7: goto L45d;
                case 8: goto L455;
                case 9: goto L44d;
                case 10: goto L42c;
                case 11: goto L424;
                case 12: goto L415;
                case 13: goto L40d;
                case 14: goto L405;
                case 15: goto L3fd;
                case 16: goto L116;
                case 17: goto L10e;
                case 18: goto L73;
                case 19: goto L5f;
                case 20: goto L50;
                case 21: goto L2c;
                case 22: goto L24;
                case 23: goto L14;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r1.f1062r
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.f11663t
            r0.requestLayout()
            return
        L14:
            java.lang.Object r0 = r1.f1062r
            v4.j r0 = (v4.j) r0
            android.widget.AutoCompleteTextView r2 = r0.f17631h
            boolean r2 = r2.isPopupShowing()
            r0.t(r2)
            r0.f17634m = r2
            return
        L24:
            java.lang.Object r0 = r1.f1062r
            v4.d r0 = (v4.d) r0
            r0.t(r5)
            return
        L2c:
            java.lang.Object r0 = r1.f1062r
            c4.f r0 = (c4.f) r0
            r0.f10250c = r4
            i1.b r2 = r0.f10252e
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            D1.d r4 = r2.i
            if (r4 == 0) goto L46
            boolean r4 = r4.f()
            if (r4 == 0) goto L46
            int r2 = r0.f10249b
            r0.a(r2)
            goto L4f
        L46:
            int r4 = r2.f11581h
            if (r4 != r3) goto L4f
            int r0 = r0.f10249b
            r2.r(r0)
        L4f:
            return
        L50:
            java.lang.Object r0 = r1.f1062r
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r3 = -1
            r2.height = r3
            r0.setLayoutParams(r2)
            return
        L5f:
            java.lang.Object r0 = r1.f1062r
            U4.r r0 = (U4.r) r0
            R4.k1 r2 = r0.f7855b
            android.webkit.WebView r3 = r2.f7084k
            if (r3 == 0) goto L6e
            int r2 = r2.f7066Z
            r3.scrollTo(r4, r2)
        L6e:
            R4.k1 r0 = r0.f7855b
            r0.f7068a0 = r5
            return
        L73:
            java.lang.Object r0 = r1.f1062r
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L10d
            android.os.Handler r3 = k1.AbstractC1174b.f14059g
            java.lang.reflect.Method r0 = k1.AbstractC1174b.f
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 < r7) goto L8d
            r2.recreate()
            goto L10d
        L8d:
            r7 = 26
            r8 = 27
            if (r6 == r7) goto L95
            if (r6 != r8) goto L99
        L95:
            if (r0 != 0) goto L99
            goto L10a
        L99:
            java.lang.reflect.Method r9 = k1.AbstractC1174b.f14058e
            if (r9 != 0) goto La3
            java.lang.reflect.Method r9 = k1.AbstractC1174b.f14057d
            if (r9 != 0) goto La3
            goto L10a
        La3:
            java.lang.reflect.Field r9 = k1.AbstractC1174b.f14056c     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r10 = r9.get(r2)     // Catch: java.lang.Throwable -> L10a
            if (r10 != 0) goto Lad
            goto L10a
        Lad:
            java.lang.reflect.Field r9 = k1.AbstractC1174b.f14055b     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> L10a
            if (r9 != 0) goto Lb6
            goto L10a
        Lb6:
            android.app.Application r11 = r2.getApplication()     // Catch: java.lang.Throwable -> L10a
            k1.a r12 = new k1.a     // Catch: java.lang.Throwable -> L10a
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L10a
            r11.registerActivityLifecycleCallbacks(r12)     // Catch: java.lang.Throwable -> L10a
            I4.a r13 = new I4.a     // Catch: java.lang.Throwable -> L10a
            r14 = 25
            r13.<init>(r14, r12, r10)     // Catch: java.lang.Throwable -> L10a
            r3.post(r13)     // Catch: java.lang.Throwable -> L10a
            if (r6 == r7) goto Ld2
            if (r6 != r8) goto Ld1
            goto Ld2
        Ld1:
            r5 = r4
        Ld2:
            if (r5 == 0) goto Lf3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lef
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lef
            r15 = 0
            r16 = 0
            r4 = r11
            r11 = 0
            r5 = r12
            r12 = 0
            r17 = r14
            r18 = r14
            java.lang.Object[] r6 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16, r17, r18}     // Catch: java.lang.Throwable -> Led
            r0.invoke(r9, r6)     // Catch: java.lang.Throwable -> Led
            goto Lf8
        Led:
            r0 = move-exception
            goto L101
        Lef:
            r0 = move-exception
            r4 = r11
            r5 = r12
            goto L101
        Lf3:
            r4 = r11
            r5 = r12
            r2.recreate()     // Catch: java.lang.Throwable -> Led
        Lf8:
            I4.a r0 = new I4.a     // Catch: java.lang.Throwable -> L10a
            r0.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L10a
            r3.post(r0)     // Catch: java.lang.Throwable -> L10a
            goto L10d
        L101:
            I4.a r6 = new I4.a     // Catch: java.lang.Throwable -> L10a
            r6.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L10a
            r3.post(r6)     // Catch: java.lang.Throwable -> L10a
            throw r0     // Catch: java.lang.Throwable -> L10a
        L10a:
            r2.recreate()
        L10d:
            return
        L10e:
            java.lang.Object r0 = r1.f1062r
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.l0()
            return
        L116:
            java.lang.Object r0 = r1.f1062r
            e0.c r0 = (e0.ViewOnAttachStateChangeListenerC1018c) r0
            boolean r6 = r0.i()
            r.v r7 = r0.f12481B
            C0.A r8 = r0.f12485q
            if (r6 != 0) goto L126
            goto L3fc
        L126:
            r8.z(r5)
            int[] r5 = r7.f16217b
            long[] r6 = r7.f16216a
            int r9 = r6.length
            int r9 = r9 - r3
            r14 = 7
            r15 = 8
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r9 < 0) goto L1b4
            r10 = r4
            r18 = 128(0x80, double:6.32E-322)
            r20 = 255(0xff, double:1.26E-321)
        L13e:
            r12 = r6[r10]
            r22 = r3
            long r2 = ~r12
            long r2 = r2 << r14
            long r2 = r2 & r12
            long r2 = r2 & r16
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L1a4
            int r2 = r10 - r9
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = r4
        L153:
            if (r3 >= r2) goto L19d
            long r23 = r12 & r20
            int r23 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r23 >= 0) goto L190
            int r23 = r10 << 3
            int r23 = r23 + r3
            r11 = r5[r23]
            r23 = r14
            r.k r14 = r0.h()
            boolean r14 = r14.a(r11)
            if (r14 != 0) goto L18d
            java.util.ArrayList r14 = r0.f12488t
            e0.d r24 = new e0.d
            r30 = r5
            long r4 = r0.f12480A
            e0.e r28 = e0.EnumC1020e.f12500r
            r29 = 0
            r26 = r4
            r25 = r11
            r24.<init>(r25, r26, r28, r29)
            r4 = r24
            r14.add(r4)
            O5.e r4 = r0.f12492x
            m5.y r5 = m5.C1386y.f15098a
            r4.j(r5)
            goto L194
        L18d:
            r30 = r5
            goto L194
        L190:
            r30 = r5
            r23 = r14
        L194:
            long r12 = r12 >> r15
            int r3 = r3 + 1
            r14 = r23
            r5 = r30
            r4 = 0
            goto L153
        L19d:
            r30 = r5
            r23 = r14
            if (r2 != r15) goto L1bc
            goto L1a8
        L1a4:
            r30 = r5
            r23 = r14
        L1a8:
            if (r10 == r9) goto L1bc
            int r10 = r10 + 1
            r3 = r22
            r14 = r23
            r5 = r30
            r4 = 0
            goto L13e
        L1b4:
            r22 = r3
            r23 = r14
            r18 = 128(0x80, double:6.32E-322)
            r20 = 255(0xff, double:1.26E-321)
        L1bc:
            I0.n r2 = r8.getSemanticsOwner()
            I0.m r2 = r2.a()
            C0.V0 r3 = r0.f12482C
            r0.k(r2, r3)
            r.k r2 = r0.h()
            int[] r3 = r2.f16217b
            long[] r4 = r2.f16216a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L38a
            r6 = 0
        L1d7:
            r9 = r4[r6]
            long r11 = ~r9
            long r11 = r11 << r23
            long r11 = r11 & r9
            long r11 = r11 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L374
            int r11 = r6 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L1eb:
            if (r12 >= r11) goto L365
            long r13 = r9 & r20
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 >= 0) goto L345
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            java.lang.Object r14 = r7.b(r13)
            C0.V0 r14 = (C0.V0) r14
            java.lang.Object r13 = r2.b(r13)
            C0.W0 r13 = (C0.W0) r13
            if (r13 == 0) goto L209
            I0.m r13 = r13.f941a
            goto L20a
        L209:
            r13 = 0
        L20a:
            if (r13 == 0) goto L33e
            r24 = r15
            int r15 = r13.f2270g
            I0.i r13 = r13.f2268d
            r.G r13 = r13.f2257q
            if (r14 != 0) goto L29a
            java.lang.Object[] r14 = r13.f16134b
            r25 = r2
            long[] r2 = r13.f16133a
            r26 = r3
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L291
            r27 = r2
            r28 = r8
            r30 = r9
            r2 = 0
        L22a:
            r8 = r27[r2]
            r10 = r4
            r29 = r5
            long r4 = ~r8
            long r4 = r4 << r23
            long r4 = r4 & r8
            long r4 = r4 & r16
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L287
            int r4 = r2 - r3
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r5 = 0
        L241:
            if (r5 >= r4) goto L283
            long r32 = r8 & r20
            int r32 = (r32 > r18 ? 1 : (r32 == r18 ? 0 : -1))
            if (r32 >= 0) goto L27a
            int r32 = r2 << 3
            int r32 = r32 + r5
            r32 = r14[r32]
            r33 = r5
            r5 = r32
            I0.s r5 = (I0.s) r5
            r34 = r8
            I0.s r8 = I0.p.f2323y
            boolean r5 = kotlin.jvm.internal.m.a(r5, r8)
            if (r5 == 0) goto L27e
            java.lang.Object r5 = r13.g(r8)
            if (r5 != 0) goto L266
            r5 = 0
        L266:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L271
            java.lang.Object r5 = n5.l.m0(r5)
            L0.d r5 = (L0.C0192d) r5
            goto L272
        L271:
            r5 = 0
        L272:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.l(r15, r5)
            goto L27e
        L27a:
            r33 = r5
            r34 = r8
        L27e:
            long r8 = r34 >> r24
            int r5 = r33 + 1
            goto L241
        L283:
            r5 = r24
            if (r4 != r5) goto L33b
        L287:
            if (r2 == r3) goto L33b
            int r2 = r2 + 1
            r4 = r10
            r5 = r29
            r24 = 8
            goto L22a
        L291:
            r29 = r5
            r28 = r8
            r30 = r9
            r10 = r4
            goto L33b
        L29a:
            r25 = r2
            r26 = r3
            r29 = r5
            r28 = r8
            r30 = r9
            r10 = r4
            java.lang.Object[] r2 = r13.f16134b
            long[] r3 = r13.f16133a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L33b
            r5 = 0
        L2af:
            r8 = r3[r5]
            r27 = r2
            r32 = r3
            long r2 = ~r8
            long r2 = r2 << r23
            long r2 = r2 & r8
            long r2 = r2 & r16
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L331
            int r2 = r5 - r4
            int r2 = ~r2
            int r2 = r2 >>> 31
            r24 = 8
            int r2 = 8 - r2
            r3 = 0
        L2c9:
            if (r3 >= r2) goto L32d
            long r33 = r8 & r20
            int r33 = (r33 > r18 ? 1 : (r33 == r18 ? 0 : -1))
            if (r33 >= 0) goto L321
            int r33 = r5 << 3
            int r33 = r33 + r3
            r33 = r27[r33]
            r34 = r3
            r3 = r33
            I0.s r3 = (I0.s) r3
            r35 = r8
            I0.s r8 = I0.p.f2323y
            boolean r3 = kotlin.jvm.internal.m.a(r3, r8)
            if (r3 == 0) goto L31e
            I0.i r3 = r14.f937a
            r.G r3 = r3.f2257q
            java.lang.Object r3 = r3.g(r8)
            if (r3 != 0) goto L2f2
            r3 = 0
        L2f2:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L2fd
            java.lang.Object r3 = n5.l.m0(r3)
            L0.d r3 = (L0.C0192d) r3
            goto L2fe
        L2fd:
            r3 = 0
        L2fe:
            java.lang.Object r8 = r13.g(r8)
            if (r8 != 0) goto L305
            r8 = 0
        L305:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L310
            java.lang.Object r8 = n5.l.m0(r8)
            L0.d r8 = (L0.C0192d) r8
            goto L311
        L310:
            r8 = 0
        L311:
            boolean r3 = kotlin.jvm.internal.m.a(r3, r8)
            if (r3 != 0) goto L31e
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r0.l(r15, r3)
        L31e:
            r3 = 8
            goto L326
        L321:
            r34 = r3
            r35 = r8
            goto L31e
        L326:
            long r8 = r35 >> r3
            int r24 = r34 + 1
            r3 = r24
            goto L2c9
        L32d:
            r3 = 8
            if (r2 != r3) goto L33b
        L331:
            if (r5 == r4) goto L33b
            int r5 = r5 + 1
            r2 = r27
            r3 = r32
            goto L2af
        L33b:
            r3 = 8
            goto L351
        L33e:
            java.lang.String r0 = "no value for specified key"
            C2.e r0 = C0.S.i(r0)
            throw r0
        L345:
            r25 = r2
            r26 = r3
            r29 = r5
            r28 = r8
            r30 = r9
            r10 = r4
            r3 = r15
        L351:
            long r4 = r30 >> r3
            int r12 = r12 + 1
            r37 = r4
            r4 = r10
            r9 = r37
            r15 = r3
            r2 = r25
            r3 = r26
            r8 = r28
            r5 = r29
            goto L1eb
        L365:
            r25 = r2
            r26 = r3
            r10 = r4
            r29 = r5
            r28 = r8
            r3 = r15
            if (r11 != r3) goto L38c
            r5 = r29
            goto L37b
        L374:
            r25 = r2
            r26 = r3
            r10 = r4
            r28 = r8
        L37b:
            if (r6 == r5) goto L38c
            int r6 = r6 + 1
            r4 = r10
            r2 = r25
            r3 = r26
            r8 = r28
            r15 = 8
            goto L1d7
        L38a:
            r28 = r8
        L38c:
            r7.c()
            r.k r2 = r0.h()
            int[] r3 = r2.f16217b
            java.lang.Object[] r4 = r2.f16218c
            long[] r2 = r2.f16216a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L3e6
            r6 = 0
        L39f:
            r8 = r2[r6]
            long r10 = ~r8
            long r10 = r10 << r23
            long r10 = r10 & r8
            long r10 = r10 & r16
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto L3df
            int r10 = r6 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r24 = 8
            int r15 = 8 - r10
            r10 = 0
        L3b5:
            if (r10 >= r15) goto L3da
            long r11 = r8 & r20
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 >= 0) goto L3d4
            int r11 = r6 << 3
            int r11 = r11 + r10
            r12 = r3[r11]
            r11 = r4[r11]
            C0.W0 r11 = (C0.W0) r11
            C0.V0 r13 = new C0.V0
            I0.m r11 = r11.f941a
            r.k r14 = r0.h()
            r13.<init>(r11, r14)
            r7.h(r12, r13)
        L3d4:
            r11 = 8
            long r8 = r8 >> r11
            int r10 = r10 + 1
            goto L3b5
        L3da:
            r11 = 8
            if (r15 != r11) goto L3e6
            goto L3e1
        L3df:
            r11 = 8
        L3e1:
            if (r6 == r5) goto L3e6
            int r6 = r6 + 1
            goto L39f
        L3e6:
            C0.V0 r2 = new C0.V0
            I0.n r3 = r28.getSemanticsOwner()
            I0.m r3 = r3.a()
            r.k r4 = r0.h()
            r2.<init>(r3, r4)
            r0.f12482C = r2
            r2 = 0
            r0.f12483D = r2
        L3fc:
            return
        L3fd:
            java.lang.Object r0 = r1.f1062r
            com.google.firebase.installations.FirebaseInstallations r0 = (com.google.firebase.installations.FirebaseInstallations) r0
            com.google.firebase.installations.FirebaseInstallations.d(r0)
            return
        L405:
            java.lang.Object r0 = r1.f1062r
            com.google.android.material.timepicker.e r0 = (com.google.android.material.timepicker.e) r0
            r0.l()
            return
        L40d:
            java.lang.Object r0 = r1.f1062r
            b.m r0 = (b.m) r0
            b.m.c(r0)
            return
        L415:
            java.lang.Object r0 = r1.f1062r
            b.h r0 = (b.h) r0
            java.lang.Runnable r2 = r0.f9866r
            if (r2 == 0) goto L423
            r2.run()
            r11 = 0
            r0.f9866r = r11
        L423:
            return
        L424:
            java.lang.Object r0 = r1.f1062r
            M5.b0 r0 = (M5.InterfaceC0241b0) r0
            androidx.work.ListenableFutureKt.e(r0)
            return
        L42c:
            java.lang.Object r0 = r1.f1062r
            androidx.lifecycle.O r0 = (androidx.lifecycle.O) r0
            androidx.lifecycle.z r2 = r0.f9502v
            int r3 = r0.f9498r
            if (r3 != 0) goto L43d
            r0.f9499s = r5
            androidx.lifecycle.o r3 = androidx.lifecycle.EnumC0652o.ON_PAUSE
            r2.f(r3)
        L43d:
            int r3 = r0.f9497q
            if (r3 != 0) goto L44c
            boolean r3 = r0.f9499s
            if (r3 == 0) goto L44c
            androidx.lifecycle.o r3 = androidx.lifecycle.EnumC0652o.ON_STOP
            r2.f(r3)
            r0.f9500t = r5
        L44c:
            return
        L44d:
            java.lang.Object r0 = r1.f1062r
            a5.y r0 = (a5.y) r0
            r0.c(r5)
            return
        L455:
            java.lang.Object r0 = r1.f1062r
            a3.F r0 = (a3.F) r0
            r0.c()
            return
        L45d:
            java.lang.Object r0 = r1.f1062r
            java.io.ByteArrayInputStream r0 = (java.io.ByteArrayInputStream) r0
            n3.i.b(r0)
            return
        L465:
            java.lang.Object r0 = r1.f1062r
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r0.cancel(r5)
            return
        L46d:
            java.lang.Object r0 = r1.f1062r
            R4.s0 r0 = (R4.C0498s0) r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L47b
            r0.d()
            goto L47e
        L47b:
            r0.c()
        L47e:
            return
        L47f:
            java.lang.Object r0 = r1.f1062r
            R4.k r0 = (R4.C0466k) r0
            r2 = 0
            r0.f7038c = r2
            return
        L487:
            java.lang.Object r0 = r1.f1062r
            L.k r0 = (L.k) r0
            L.k.a(r0)
            return
        L48f:
            r22 = r3
            java.lang.Object r0 = r1.f1062r
            r2 = r0
            E1.v r2 = (E1.v) r2
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r3 = r2.f1665d
            monitor-enter(r3)
            l6.d r4 = r2.f1668h     // Catch: java.lang.Throwable -> L4a2
            if (r4 != 0) goto L4a5
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a2
            goto L55c
        L4a2:
            r0 = move-exception
            goto L55f
        L4a5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a2
            s1.h r3 = r2.c()     // Catch: java.lang.Throwable -> L4b8
            int r4 = r3.f16443e     // Catch: java.lang.Throwable -> L4b8
            r5 = r22
            if (r4 != r5) goto L4bb
            java.lang.Object r5 = r2.f1665d     // Catch: java.lang.Throwable -> L4b8
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4b8
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b5
            goto L4bb
        L4b5:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b5
            throw r0     // Catch: java.lang.Throwable -> L4b8
        L4b8:
            r0 = move-exception
            goto L54b
        L4bb:
            if (r4 != 0) goto L534
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r4 = r1.g.f16278a     // Catch: java.lang.Throwable -> L527
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L527
            s4.e r0 = r2.f1664c     // Catch: java.lang.Throwable -> L527
            android.content.Context r4 = r2.f1662a     // Catch: java.lang.Throwable -> L527
            r0.getClass()     // Catch: java.lang.Throwable -> L527
            s1.h[] r0 = new s1.h[]{r3}     // Catch: java.lang.Throwable -> L527
            Q2.g r5 = n1.e.f15132a     // Catch: java.lang.Throwable -> L527
            java.lang.String r5 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r5 = E3.h.O(r5)     // Catch: java.lang.Throwable -> L527
            android.os.Trace.beginSection(r5)     // Catch: java.lang.Throwable -> L527
            Q2.g r5 = n1.e.f15132a     // Catch: java.lang.Throwable -> L529
            r6 = 0
            android.graphics.Typeface r0 = r5.t(r4, r0, r6)     // Catch: java.lang.Throwable -> L529
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L527
            android.content.Context r4 = r2.f1662a     // Catch: java.lang.Throwable -> L527
            android.net.Uri r3 = r3.f16439a     // Catch: java.lang.Throwable -> L527
            java.nio.MappedByteBuffer r3 = a.AbstractC0597a.I(r4, r3)     // Catch: java.lang.Throwable -> L527
            if (r3 == 0) goto L51f
            if (r0 == 0) goto L51f
            java.lang.String r4 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L518
            E.c0 r4 = new E.c0     // Catch: java.lang.Throwable -> L518
            F1.b r3 = y4.AbstractC1918b.y(r3)     // Catch: java.lang.Throwable -> L518
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L518
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L527
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L4b8
            java.lang.Object r3 = r2.f1665d     // Catch: java.lang.Throwable -> L4b8
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L4b8
            l6.d r0 = r2.f1668h     // Catch: java.lang.Throwable -> L50f
            if (r0 == 0) goto L511
            r0.A(r4)     // Catch: java.lang.Throwable -> L50f
            goto L511
        L50f:
            r0 = move-exception
            goto L516
        L511:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50f
            r2.b()     // Catch: java.lang.Throwable -> L4b8
            goto L55c
        L516:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50f
            throw r0     // Catch: java.lang.Throwable -> L4b8
        L518:
            r0 = move-exception
            int r3 = r1.g.f16278a     // Catch: java.lang.Throwable -> L527
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L527
            throw r0     // Catch: java.lang.Throwable -> L527
        L51f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L527
            java.lang.String r3 = "Unable to open file."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L527
            throw r0     // Catch: java.lang.Throwable -> L527
        L527:
            r0 = move-exception
            goto L52e
        L529:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L527
            throw r0     // Catch: java.lang.Throwable -> L527
        L52e:
            int r3 = r1.g.f16278a     // Catch: java.lang.Throwable -> L4b8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L4b8
            throw r0     // Catch: java.lang.Throwable -> L4b8
        L534:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L4b8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b8
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4b8
            r5.append(r4)     // Catch: java.lang.Throwable -> L4b8
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch: java.lang.Throwable -> L4b8
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L4b8
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4b8
            throw r3     // Catch: java.lang.Throwable -> L4b8
        L54b:
            java.lang.Object r4 = r2.f1665d
            monitor-enter(r4)
            l6.d r3 = r2.f1668h     // Catch: java.lang.Throwable -> L556
            if (r3 == 0) goto L558
            r3.z(r0)     // Catch: java.lang.Throwable -> L556
            goto L558
        L556:
            r0 = move-exception
            goto L55d
        L558:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L556
            r2.b()
        L55c:
            return
        L55d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L556
            throw r0
        L55f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a2
            throw r0
        L561:
            java.lang.Object r0 = r1.f1062r
            C0.I r0 = (C0.I) r0
            java.lang.String r2 = "measureAndLayout"
            android.os.Trace.beginSection(r2)
            C0.A r2 = r0.f854d     // Catch: java.lang.Throwable -> L586
            r2.z(r5)     // Catch: java.lang.Throwable -> L586
            android.os.Trace.endSection()
            java.lang.String r2 = "checkForSemanticsChanges"
            android.os.Trace.beginSection(r2)
            r0.n()     // Catch: java.lang.Throwable -> L581
            android.os.Trace.endSection()
            r2 = 0
            r0.f850L = r2
            return
        L581:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L586:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L58b:
            java.lang.Object r0 = r1.f1062r
            C0.A r0 = (C0.A) r0
            r2 = 0
            r0.f727M0 = r2
            android.view.MotionEvent r2 = r0.f715G0
            kotlin.jvm.internal.m.b(r2)
            int r3 = r2.getActionMasked()
            r4 = 10
            if (r3 != r4) goto L5a3
            r0.N(r2)
            return
        L5a3:
            java.lang.String r0 = "The ACTION_HOVER_EXIT event was not cleared."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.RunnableC0089m.run():void");
    }
}
