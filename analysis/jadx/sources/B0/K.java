package B0;

import c0.AbstractC0724l;

/* JADX INFO: loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f244s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj, Object obj2) {
        super(0);
        this.f242q = i;
        this.f243r = obj;
        this.f244s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x0447 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:222:0x0456 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:225:0x03f2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:227:0x03f2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:230:0x0450 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // B5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.f242q
            switch(r0) {
                case 0: goto L3d3;
                case 1: goto L3b8;
                case 2: goto L2b2;
                case 3: goto L2a1;
                case 4: goto L290;
                case 5: goto L263;
                case 6: goto L19a;
                case 7: goto L177;
                case 8: goto L167;
                case 9: goto L142;
                case 10: goto L114;
                case 11: goto Led;
                case 12: goto Lc0;
                case 13: goto L72;
                case 14: goto L62;
                case 15: goto L51;
                case 16: goto L43;
                case 17: goto L26;
                case 18: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r15.f243r
            C0.H0 r0 = (C0.H0) r0
            java.lang.Object r1 = r15.f244s
            c0.l r1 = (c0.AbstractC0724l) r1
            r0.f(r1)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L13:
            java.lang.Object r0 = r15.f244s
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            java.lang.Object r1 = r15.f243r
            v.I r1 = (v.I) r1
            P.z r2 = z0.AbstractC1931H.f18662a
            java.lang.Object r1 = B0.AbstractC0041g.i(r1, r2)
            r0.f14268q = r1
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L26:
            java.lang.Object r0 = r15.f243r
            v.p r0 = (v.C1721p) r0
            j0.E r1 = r0.f17367F
            java.lang.Object r2 = r15.f244s
            B0.N r2 = (B0.N) r2
            l0.b r3 = r2.f296q
            long r3 = r3.d()
            W0.l r5 = r2.getLayoutDirection()
            j0.B r1 = r1.e(r3, r5, r2)
            r0.f17372K = r1
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L43:
            java.lang.Object r0 = r15.f243r
            O5.i r0 = (O5.i) r0
            java.lang.Object r1 = r15.f244s
            java.lang.Float r1 = (java.lang.Float) r1
            r0.j(r1)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L51:
            java.lang.Object r0 = r15.f244s
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            java.lang.Object r1 = r15.f243r
            h0.o r1 = (h0.o) r1
            h0.k r1 = r1.y0()
            r0.f14268q = r1
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L62:
            java.lang.Object r0 = r15.f243r
            g0.b r0 = (g0.C1068b) r0
            m0.a r0 = r0.f12811G
            java.lang.Object r1 = r15.f244s
            g0.c r1 = (g0.C1069c) r1
            r0.invoke(r1)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L72:
            java.lang.Object r0 = r15.f243r
            r.H r0 = (r.C1549H) r0
            java.lang.Object r1 = r15.f244s
            P.u r1 = (P.C0382u) r1
            java.lang.Object[] r2 = r0.f16139b
            long[] r0 = r0.f16138a
            int r3 = r0.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto Lbd
            r4 = 0
            r5 = r4
        L85:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto Lb8
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L9f:
            if (r10 >= r8) goto Lb6
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto Lb2
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            r1.y(r11)
        Lb2:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L9f
        Lb6:
            if (r8 != r9) goto Lbd
        Lb8:
            if (r5 == r3) goto Lbd
            int r5 = r5 + 1
            goto L85
        Lbd:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        Lc0:
            java.lang.Object r0 = r15.f243r
            N.r r0 = (N.r) r0
            N.o r1 = r0.f3978n
            N.y r2 = r0.d()
            java.lang.Object r3 = r15.f244s
            float r2 = r2.d(r3)
            boolean r4 = java.lang.Float.isNaN(r2)
            if (r4 != 0) goto Le7
            N.r r1 = r1.f3963a
            P.b0 r4 = r1.j
            r4.f(r2)
            P.b0 r1 = r1.f3975k
            r2 = 0
            r1.f(r2)
            r1 = 0
            r0.h(r1)
        Le7:
            r0.g(r3)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        Led:
            java.lang.Object r0 = r15.f243r
            M.I0 r0 = (M.I0) r0
            N.r r1 = r0.f3322c
            B5.c r1 = r1.f3971d
            M.J0 r2 = M.J0.f3325s
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L111
            java.lang.Object r1 = r15.f244s
            M5.w r1 = (M5.InterfaceC0261w) r1
            M.c0 r2 = new M.c0
            r3 = 0
            r2.<init>(r0, r3)
            r0 = 3
            M5.AbstractC0263y.t(r1, r3, r3, r2, r0)
        L111:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L114:
            java.lang.Object r0 = r15.f243r
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto L122
            java.lang.Object r0 = r0.invoke()
            i0.c r0 = (i0.C1131c) r0
            if (r0 != 0) goto L141
        L122:
            java.lang.Object r0 = r15.f244s
            B0.n0 r0 = (B0.n0) r0
            c0.l r1 = r0.B0()
            boolean r1 = r1.f10099D
            r2 = 0
            if (r1 == 0) goto L130
            goto L131
        L130:
            r0 = r2
        L131:
            if (r0 == 0) goto L140
            long r0 = r0.f18666s
            long r0 = com.google.android.gms.internal.measurement.P1.d0(r0)
            r2 = 0
            i0.c r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.c(r2, r0)
            goto L141
        L140:
            r0 = r2
        L141:
            return r0
        L142:
            java.lang.Object r0 = r15.f243r
            P.C r0 = (P.C) r0
            java.lang.Object r0 = r0.getValue()
            F.w r0 = (F.w) r0
            E.Y r1 = new E.Y
            java.lang.Object r2 = r15.f244s
            F.e r2 = (F.C0151e) r2
            F.D r3 = r2.f1821d
            java.lang.Object r3 = r3.f1781v
            E.F r3 = (E.F) r3
            java.lang.Object r3 = r3.getValue()
            G5.d r3 = (G5.d) r3
            r1.<init>(r3, r0)
            F.x r3 = new F.x
            r3.<init>(r2, r0, r1)
            return r3
        L167:
            E.W r0 = new E.W
            java.lang.Object r1 = r15.f243r
            Z.i r1 = (Z.i) r1
            java.lang.Object r2 = r15.f244s
            Z.c r2 = (Z.c) r2
            n5.t r3 = n5.t.f15300q
            r0.<init>(r1, r3, r2)
            return r0
        L177:
            java.lang.Object r0 = r15.f243r
            P.C r0 = (P.C) r0
            java.lang.Object r0 = r0.getValue()
            D.h r0 = (D.h) r0
            E.Y r1 = new E.Y
            java.lang.Object r2 = r15.f244s
            D.y r2 = (D.y) r2
            C.u r3 = r2.f1308d
            E.F r3 = r3.f
            java.lang.Object r3 = r3.getValue()
            G5.d r3 = (G5.d) r3
            r1.<init>(r3, r0)
            D.i r3 = new D.i
            r3.<init>(r2, r0, r1)
            return r3
        L19a:
            java.lang.Object r0 = r15.f244s
            C0.I r0 = (C0.I) r0
            java.lang.Object r1 = r15.f243r
            C0.U0 r1 = (C0.U0) r1
            I0.g r2 = r1.f934u
            I0.g r3 = r1.f935v
            java.lang.Float r4 = r1.f932s
            java.lang.Float r5 = r1.f933t
            r6 = 0
            if (r2 == 0) goto L1c1
            if (r4 == 0) goto L1c1
            E.Q r7 = r2.f2231a
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r4 = r4.floatValue()
            float r7 = r7 - r4
            goto L1c2
        L1c1:
            r7 = r6
        L1c2:
            if (r3 == 0) goto L1d8
            if (r5 == 0) goto L1d8
            E.Q r4 = r3.f2231a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r5 = r5.floatValue()
            float r4 = r4 - r5
            goto L1d9
        L1d8:
            r4 = r6
        L1d9:
            int r5 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r5 != 0) goto L1e2
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L1e2
            goto L248
        L1e2:
            int r4 = r1.f930q
            int r4 = r0.z(r4)
            r.k r5 = r0.s()
            int r6 = r0.f861n
            java.lang.Object r5 = r5.b(r6)
            C0.W0 r5 = (C0.W0) r5
            if (r5 == 0) goto L203
            x1.e r6 = r0.f863p     // Catch: java.lang.IllegalStateException -> L203
            if (r6 == 0) goto L203
            android.graphics.Rect r5 = r0.k(r5)     // Catch: java.lang.IllegalStateException -> L203
            android.view.accessibility.AccessibilityNodeInfo r6 = r6.f18345a     // Catch: java.lang.IllegalStateException -> L203
            r6.setBoundsInScreen(r5)     // Catch: java.lang.IllegalStateException -> L203
        L203:
            r.k r5 = r0.s()
            int r6 = r0.f862o
            java.lang.Object r5 = r5.b(r6)
            C0.W0 r5 = (C0.W0) r5
            if (r5 == 0) goto L21e
            x1.e r6 = r0.f864q     // Catch: java.lang.IllegalStateException -> L21e
            if (r6 == 0) goto L21e
            android.graphics.Rect r5 = r0.k(r5)     // Catch: java.lang.IllegalStateException -> L21e
            android.view.accessibility.AccessibilityNodeInfo r6 = r6.f18345a     // Catch: java.lang.IllegalStateException -> L21e
            r6.setBoundsInScreen(r5)     // Catch: java.lang.IllegalStateException -> L21e
        L21e:
            C0.A r5 = r0.f854d
            r5.invalidate()
            r.k r5 = r0.s()
            java.lang.Object r5 = r5.b(r4)
            C0.W0 r5 = (C0.W0) r5
            if (r5 == 0) goto L248
            I0.m r5 = r5.f941a
            if (r5 == 0) goto L248
            B0.L r5 = r5.f2267c
            if (r5 == 0) goto L248
            if (r2 == 0) goto L23e
            r.v r6 = r0.f866s
            r6.h(r4, r2)
        L23e:
            if (r3 == 0) goto L245
            r.v r6 = r0.f867t
            r6.h(r4, r3)
        L245:
            r0.v(r5)
        L248:
            if (r2 == 0) goto L254
            E.Q r0 = r2.f2231a
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r1.f932s = r0
        L254:
            if (r3 == 0) goto L260
            E.Q r0 = r3.f2231a
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r1.f933t = r0
        L260:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L263:
            java.lang.Object r0 = r15.f243r
            C0.A r0 = (C0.A) r0
            C0.k0 r1 = r0.getAndroidViewsHandler$ui_release()
            java.lang.Object r2 = r15.f244s
            Z0.r r2 = (Z0.r) r2
            r1.removeViewInLayout(r2)
            C0.k0 r1 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r1 = r1.getLayoutNodeToHolder()
            C0.k0 r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getHolderToLayoutNode()
            java.lang.Object r0 = r0.remove(r2)
            r1.remove(r0)
            r0 = 0
            r2.setImportantForAccessibility(r0)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L290:
            java.lang.Object r0 = r15.f243r
            C0.A r0 = (C0.A) r0
            java.lang.Object r1 = r15.f244s
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r0 = C0.A.h(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2a1:
            java.lang.Object r0 = r15.f243r
            C0.A r0 = (C0.A) r0
            java.lang.Object r1 = r15.f244s
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            boolean r0 = C0.A.i(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2b2:
            java.lang.Object r0 = r15.f243r
            B0.Y r0 = (B0.Y) r0
            B0.P r1 = r0.f353v
            r2 = 0
            r1.f305h = r2
            B0.L r3 = r1.f299a
            R.e r3 = r3.w()
            java.lang.Object[] r4 = r3.f6676q
            int r3 = r3.f6678s
            r5 = r2
        L2c6:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 >= r3) goto L2e9
            r7 = r4[r5]
            B0.L r7 = (B0.L) r7
            B0.P r7 = r7.f269V
            B0.Y r7 = r7.f312q
            kotlin.jvm.internal.m.b(r7)
            int r8 = r7.f356y
            r7.f355x = r8
            r7.f356y = r6
            B0.I r6 = r7.f357z
            B0.I r8 = B0.I.f238r
            if (r6 != r8) goto L2e6
            B0.I r6 = B0.I.f239s
            r7.f357z = r6
        L2e6:
            int r5 = r5 + 1
            goto L2c6
        L2e9:
            B0.L r3 = r1.f299a
            B0.L r1 = r1.f299a
            R.e r3 = r3.w()
            java.lang.Object[] r4 = r3.f6676q
            int r3 = r3.f6678s
            r5 = r2
        L2f6:
            if (r5 >= r3) goto L30b
            r7 = r4[r5]
            B0.L r7 = (B0.L) r7
            B0.P r7 = r7.f269V
            B0.Y r7 = r7.f312q
            kotlin.jvm.internal.m.b(r7)
            B0.M r7 = r7.f346G
            r7.getClass()
            int r5 = r5 + 1
            goto L2f6
        L30b:
            B0.v r3 = r0.n()
            B0.u r3 = r3.f518b0
            if (r3 == 0) goto L339
            boolean r3 = r3.f322x
            java.util.List r4 = r1.n()
            int r5 = r4.size()
            r7 = r2
        L31e:
            if (r7 >= r5) goto L339
            r8 = r4
            R.b r8 = (R.b) r8
            java.lang.Object r8 = r8.get(r7)
            B0.L r8 = (B0.L) r8
            B0.g0 r8 = r8.f268U
            B0.n0 r8 = r8.f431c
            B0.U r8 = r8.z0()
            if (r8 != 0) goto L334
            goto L336
        L334:
            r8.f322x = r3
        L336:
            int r7 = r7 + 1
            goto L31e
        L339:
            java.lang.Object r3 = r15.f244s
            B0.U r3 = (B0.U) r3
            z0.D r3 = r3.j0()
            r3.d()
            B0.v r0 = r0.n()
            B0.u r0 = r0.f518b0
            if (r0 == 0) goto L370
            java.util.List r0 = r1.n()
            int r3 = r0.size()
            r4 = r2
        L355:
            if (r4 >= r3) goto L370
            r5 = r0
            R.b r5 = (R.b) r5
            java.lang.Object r5 = r5.get(r4)
            B0.L r5 = (B0.L) r5
            B0.g0 r5 = r5.f268U
            B0.n0 r5 = r5.f431c
            B0.U r5 = r5.z0()
            if (r5 != 0) goto L36b
            goto L36d
        L36b:
            r5.f322x = r2
        L36d:
            int r4 = r4 + 1
            goto L355
        L370:
            R.e r0 = r1.w()
            java.lang.Object[] r3 = r0.f6676q
            int r0 = r0.f6678s
            r4 = r2
        L379:
            if (r4 >= r0) goto L395
            r5 = r3[r4]
            B0.L r5 = (B0.L) r5
            B0.P r5 = r5.f269V
            B0.Y r5 = r5.f312q
            kotlin.jvm.internal.m.b(r5)
            int r7 = r5.f355x
            int r8 = r5.f356y
            if (r7 == r8) goto L392
            if (r8 != r6) goto L392
            r7 = 1
            r5.Y(r7)
        L392:
            int r4 = r4 + 1
            goto L379
        L395:
            R.e r0 = r1.w()
            java.lang.Object[] r1 = r0.f6676q
            int r0 = r0.f6678s
            r3 = r2
        L39e:
            if (r3 >= r0) goto L3b5
            r4 = r1[r3]
            B0.L r4 = (B0.L) r4
            B0.P r4 = r4.f269V
            B0.Y r4 = r4.f312q
            kotlin.jvm.internal.m.b(r4)
            B0.M r4 = r4.f346G
            r4.getClass()
            r4.f291c = r2
            int r3 = r3 + 1
            goto L39e
        L3b5:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L3b8:
            java.lang.Object r0 = r15.f243r
            B0.x0 r0 = (B0.x0) r0
            z0.D r0 = r0.f532q
            B5.c r0 = r0.e()
            if (r0 == 0) goto L3d0
            java.lang.Object r1 = r15.f244s
            B0.T r1 = (B0.T) r1
            B0.S r2 = new B0.S
            r2.<init>(r1)
            r0.invoke(r2)
        L3d0:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L3d3:
            java.lang.Object r0 = r15.f243r
            B0.L r0 = (B0.L) r0
            B0.g0 r0 = r0.f268U
            java.lang.Object r1 = r15.f244s
            kotlin.jvm.internal.y r1 = (kotlin.jvm.internal.y) r1
            c0.l r2 = r0.f433e
            int r2 = r2.f10103t
            r2 = r2 & 8
            if (r2 == 0) goto L45e
            B0.B0 r0 = r0.f432d
        L3e7:
            if (r0 == 0) goto L45e
            int r2 = r0.f10102s
            r2 = r2 & 8
            if (r2 == 0) goto L45b
            r2 = 0
            r3 = r0
            r4 = r2
        L3f2:
            if (r3 == 0) goto L45b
            boolean r5 = r3 instanceof B0.A0
            r6 = 1
            if (r5 == 0) goto L41e
            B0.A0 r3 = (B0.A0) r3
            boolean r5 = r3.W()
            if (r5 == 0) goto L40a
            I0.i r5 = new I0.i
            r5.<init>()
            r1.f14268q = r5
            r5.f2260t = r6
        L40a:
            boolean r5 = r3.Z()
            if (r5 == 0) goto L416
            java.lang.Object r5 = r1.f14268q
            I0.i r5 = (I0.i) r5
            r5.f2259s = r6
        L416:
            java.lang.Object r5 = r1.f14268q
            I0.i r5 = (I0.i) r5
            r3.A(r5)
            goto L456
        L41e:
            int r5 = r3.f10102s
            r5 = r5 & 8
            if (r5 == 0) goto L456
            boolean r5 = r3 instanceof B0.AbstractC0049n
            if (r5 == 0) goto L456
            r5 = r3
            B0.n r5 = (B0.AbstractC0049n) r5
            c0.l r5 = r5.f473F
            r7 = 0
        L42e:
            if (r5 == 0) goto L453
            int r8 = r5.f10102s
            r8 = r8 & 8
            if (r8 == 0) goto L450
            int r7 = r7 + 1
            if (r7 != r6) goto L43c
            r3 = r5
            goto L450
        L43c:
            if (r4 != 0) goto L447
            R.e r4 = new R.e
            r8 = 16
            c0.l[] r8 = new c0.AbstractC0724l[r8]
            r4.<init>(r8)
        L447:
            if (r3 == 0) goto L44d
            r4.c(r3)
            r3 = r2
        L44d:
            r4.c(r5)
        L450:
            c0.l r5 = r5.f10105v
            goto L42e
        L453:
            if (r7 != r6) goto L456
            goto L3f2
        L456:
            c0.l r3 = B0.AbstractC0041g.f(r4)
            goto L3f2
        L45b:
            c0.l r0 = r0.f10104u
            goto L3e7
        L45e:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.K.invoke():java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(kotlin.jvm.internal.y yVar, AbstractC0724l abstractC0724l, int i) {
        super(0);
        this.f242q = i;
        this.f244s = yVar;
        this.f243r = abstractC0724l;
    }
}
