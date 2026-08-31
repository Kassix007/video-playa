package B0;

import c0.AbstractC0724l;
import c0.InterfaceC0723k;
import java.util.HashSet;
import r.C1543B;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: B0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0056v f430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B0 f432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC0724l f433e;
    public R.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public R.e f434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0040f0 f435h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0042g0(L l7) {
        this.f429a = l7;
        C0056v c0056v = new C0056v(l7);
        this.f430b = c0056v;
        this.f431c = c0056v;
        B0 b02 = c0056v.f517a0;
        this.f432d = b02;
        this.f433e = b02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(C0042g0 c0042g0, AbstractC0724l abstractC0724l, n0 n0Var) {
        for (AbstractC0724l abstractC0724l2 = abstractC0724l.f10104u; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10104u) {
            if (abstractC0724l2 == i0.f443a) {
                L lS = c0042g0.f429a.s();
                n0Var.f480D = lS != null ? lS.f268U.f430b : null;
                c0042g0.f431c = n0Var;
                return;
            } else {
                if ((abstractC0724l2.f10102s & 2) != 0) {
                    return;
                }
                abstractC0724l2.w0(n0Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0724l b(InterfaceC0723k interfaceC0723k, AbstractC0724l abstractC0724l) {
        AbstractC0724l abstractC0724lF;
        if (interfaceC0723k instanceof AbstractC0036d0) {
            abstractC0724lF = ((AbstractC0036d0) interfaceC0723k).f();
            abstractC0724lF.f10102s = o0.f(abstractC0724lF);
        } else {
            C0035d c0035d = new C0035d();
            c0035d.f10102s = o0.d(interfaceC0723k);
            c0035d.f405E = interfaceC0723k;
            c0035d.f407G = new HashSet();
            abstractC0724lF = c0035d;
        }
        if (abstractC0724lF.f10099D) {
            AbstractC1904a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC0724lF.f10108y = true;
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v;
        if (abstractC0724l2 != null) {
            abstractC0724l2.f10104u = abstractC0724lF;
            abstractC0724lF.f10105v = abstractC0724l2;
        }
        abstractC0724l.f10105v = abstractC0724lF;
        abstractC0724lF.f10104u = abstractC0724l;
        return abstractC0724lF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0724l c(AbstractC0724l abstractC0724l) {
        boolean z5 = abstractC0724l.f10099D;
        if (z5) {
            C1543B c1543b = o0.f501a;
            if (!z5) {
                AbstractC1904a.b("autoInvalidateRemovedNode called on unattached node");
            }
            o0.a(abstractC0724l, -1, 2);
            abstractC0724l.u0();
            abstractC0724l.o0();
        }
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v;
        AbstractC0724l abstractC0724l3 = abstractC0724l.f10104u;
        if (abstractC0724l2 != null) {
            abstractC0724l2.f10104u = abstractC0724l3;
            abstractC0724l.f10105v = null;
        }
        if (abstractC0724l3 != null) {
            abstractC0724l3.f10105v = abstractC0724l2;
            abstractC0724l.f10104u = null;
        }
        kotlin.jvm.internal.m.b(abstractC0724l3);
        return abstractC0724l3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(InterfaceC0723k interfaceC0723k, InterfaceC0723k interfaceC0723k2, AbstractC0724l abstractC0724l) {
        if ((interfaceC0723k instanceof AbstractC0036d0) && (interfaceC0723k2 instanceof AbstractC0036d0)) {
            h0 h0Var = i0.f443a;
            kotlin.jvm.internal.m.c(abstractC0724l, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0036d0) interfaceC0723k2).g(abstractC0724l);
            if (abstractC0724l.f10099D) {
                o0.c(abstractC0724l);
                return;
            } else {
                abstractC0724l.f10109z = true;
                return;
            }
        }
        if (!(abstractC0724l instanceof C0035d)) {
            AbstractC1904a.b("Unknown Modifier.Node type");
            return;
        }
        C0035d c0035d = (C0035d) abstractC0724l;
        if (c0035d.f10099D) {
            c0035d.z0();
        }
        c0035d.f405E = interfaceC0723k2;
        c0035d.f10102s = o0.d(interfaceC0723k2);
        if (c0035d.f10099D) {
            c0035d.x0(false);
        }
        if (abstractC0724l.f10099D) {
            o0.c(abstractC0724l);
        } else {
            abstractC0724l.f10109z = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(int i) {
        return (i & this.f433e.f10103t) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        C0056v c0056v;
        n0 n0Var = this.f431c;
        while (true) {
            c0056v = this.f430b;
            if (n0Var == c0056v) {
                break;
            }
            n0Var.L0();
            n0Var = n0Var.f479C;
            kotlin.jvm.internal.m.b(n0Var);
        }
        c0056v.L0();
        for (AbstractC0724l abstractC0724l = this.f433e; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.t0();
            if (abstractC0724l.f10108y) {
                C1543B c1543b = o0.f501a;
                if (!abstractC0724l.f10099D) {
                    AbstractC1904a.b("autoInvalidateInsertedNode called on unattached node");
                }
                o0.a(abstractC0724l, -1, 1);
            }
            if (abstractC0724l.f10109z) {
                o0.c(abstractC0724l);
            }
            abstractC0724l.f10108y = false;
            abstractC0724l.f10109z = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        for (AbstractC0724l abstractC0724l = this.f432d; abstractC0724l != null; abstractC0724l = abstractC0724l.f10104u) {
            if (abstractC0724l.f10099D) {
                abstractC0724l.u0();
            }
        }
        n0 n0Var = this.f431c;
        n0 n0Var2 = this.f430b;
        while (n0Var2 != n0Var) {
            s0 s0Var = n0Var2.f498V;
            if (s0Var != null) {
                s0Var.destroy();
            }
            n0Var2.f498V = null;
            n0Var2 = n0Var2.f480D;
            kotlin.jvm.internal.m.b(n0Var2);
        }
        s0 s0Var2 = n0Var.f498V;
        if (s0Var2 != null) {
            s0Var2.destroy();
        }
        n0Var.f498V = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r13 > r3) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
    
        if (r14 <= r7) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
    
        if (r11 <= r15) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r24 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (r11 < r12) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        if (r11 > r3) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r32, R.e r33, R.e r34, c0.AbstractC0724l r35, boolean r36) {
        /*
            r31 = this;
            r1 = r31
            B0.f0 r0 = r1.f435h
            if (r0 != 0) goto L18
            B0.f0 r0 = new B0.f0
            r3 = r32
            r4 = r33
            r5 = r34
            r2 = r35
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1.f435h = r0
            goto L2c
        L18:
            r3 = r32
            r4 = r33
            r5 = r34
            r2 = r35
            r0.f424c = r2
            r0.f422a = r3
            r0.f425d = r4
            r0.f426e = r5
            r6 = r36
            r0.f423b = r6
        L2c:
            java.lang.Object r2 = r0.f
            B0.g0 r2 = (B0.C0042g0) r2
            int r4 = r4.f6678s
            int r4 = r4 - r3
            int r5 = r5.f6678s
            int r5 = r5 - r3
            int r3 = r4 + r5
            r6 = 1
            int r3 = r3 + r6
            r7 = 2
            int r3 = r3 / r7
            B0.w r8 = new B0.w
            int r9 = r3 * 3
            r8.<init>(r9)
            B0.w r9 = new B0.w
            int r10 = r3 * 4
            r9.<init>(r10)
            r10 = 0
            r9.e(r10, r4, r10, r5)
            int r3 = r3 * r7
            int r3 = r3 + r6
            int[] r11 = new int[r3]
            int[] r12 = new int[r3]
            r13 = 5
            int[] r13 = new int[r13]
        L57:
            int r14 = r9.f527b
            if (r14 == 0) goto L27d
            r32 = r7
            int[] r7 = r9.f526a
            r33 = r10
            int r10 = r14 + (-1)
            r9.f527b = r10
            r10 = r7[r10]
            r34 = 3
            int r15 = r14 + (-2)
            r9.f527b = r15
            r15 = r7[r15]
            int r6 = r14 + (-3)
            r9.f527b = r6
            r6 = r7[r6]
            int r14 = r14 + (-4)
            r9.f527b = r14
            r7 = r7[r14]
            int r14 = r6 - r7
            r36 = r3
            int r3 = r10 - r15
            r16 = r11
            r11 = 1
            if (r14 < r11) goto L278
            if (r3 >= r11) goto L8a
            goto L278
        L8a:
            int r17 = r14 + r3
            int r17 = r17 + 1
            r35 = r11
            int r11 = r17 / 2
            int r17 = r36 / 2
            int r18 = r17 + 1
            r16[r18] = r7
            r12[r18] = r6
            r18 = r3
            r3 = r33
        L9e:
            if (r3 >= r11) goto L278
            int r19 = r14 - r18
            int r20 = java.lang.Math.abs(r19)
            r21 = r11
            r11 = r20 & 1
            r20 = r12
            r12 = r35
            if (r11 != r12) goto Lb2
            r11 = 1
            goto Lb4
        Lb2:
            r11 = r33
        Lb4:
            int r12 = -r3
            r22 = r11
            r11 = r12
        Lb8:
            r23 = 4
            if (r11 > r3) goto L14a
            if (r11 == r12) goto Le0
            if (r11 == r3) goto Ld3
            int r24 = r11 + 1
            int r24 = r24 + r17
            r25 = r11
            r11 = r16[r24]
            int r24 = r25 + (-1)
            int r24 = r24 + r17
            r26 = r13
            r13 = r16[r24]
            if (r11 <= r13) goto Ld7
            goto Le4
        Ld3:
            r25 = r11
            r26 = r13
        Ld7:
            int r11 = r25 + (-1)
            int r11 = r11 + r17
            r11 = r16[r11]
            int r13 = r11 + 1
            goto Leb
        Le0:
            r25 = r11
            r26 = r13
        Le4:
            int r11 = r25 + 1
            int r11 = r11 + r17
            r11 = r16[r11]
            r13 = r11
        Leb:
            int r24 = r13 - r7
            int r24 = r24 + r15
            int r24 = r24 - r25
            if (r3 == 0) goto Lf6
            r27 = 1
            goto Lf8
        Lf6:
            r27 = r33
        Lf8:
            if (r13 != r11) goto Lfd
            r28 = 1
            goto Lff
        Lfd:
            r28 = r33
        Lff:
            r27 = r27 & r28
            int r27 = r24 - r27
            r30 = r24
            r24 = r11
            r11 = r30
        L109:
            if (r13 >= r6) goto L118
            if (r11 >= r10) goto L118
            boolean r28 = r0.a(r13, r11)
            if (r28 == 0) goto L118
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L109
        L118:
            int r28 = r17 + r25
            r16[r28] = r13
            if (r22 == 0) goto L140
            r28 = r11
            int r11 = r19 - r25
            r29 = r14
            int r14 = r12 + 1
            if (r11 < r14) goto L142
            int r14 = r3 + (-1)
            if (r11 > r14) goto L142
            int r11 = r17 + r11
            r11 = r20[r11]
            if (r11 > r13) goto L142
            r26[r33] = r24
            r11 = 1
            r26[r11] = r27
            r26[r32] = r13
            r26[r34] = r28
            r26[r23] = r33
            r11 = 1
            goto L1da
        L140:
            r29 = r14
        L142:
            int r11 = r25 + 2
            r13 = r26
            r14 = r29
            goto Lb8
        L14a:
            r26 = r13
            r29 = r14
            r11 = r19 & 1
            if (r11 != 0) goto L154
            r11 = 1
            goto L156
        L154:
            r11 = r33
        L156:
            r13 = r12
        L157:
            if (r13 > r3) goto L26a
            if (r13 == r12) goto L179
            if (r13 == r3) goto L16e
            int r14 = r13 + 1
            int r14 = r14 + r17
            r14 = r20[r14]
            int r22 = r13 + (-1)
            int r22 = r22 + r17
            r24 = r11
            r11 = r20[r22]
            if (r14 >= r11) goto L170
            goto L17b
        L16e:
            r24 = r11
        L170:
            int r11 = r13 + (-1)
            int r11 = r11 + r17
            r11 = r20[r11]
            int r14 = r11 + (-1)
            goto L182
        L179:
            r24 = r11
        L17b:
            int r11 = r13 + 1
            int r11 = r11 + r17
            r11 = r20[r11]
            r14 = r11
        L182:
            int r22 = r6 - r14
            int r22 = r22 - r13
            int r22 = r10 - r22
            if (r3 == 0) goto L18d
            r25 = 1
            goto L18f
        L18d:
            r25 = r33
        L18f:
            if (r14 != r11) goto L194
            r27 = 1
            goto L196
        L194:
            r27 = r33
        L196:
            r25 = r25 & r27
            int r25 = r22 + r25
            r30 = r22
            r22 = r11
            r11 = r30
        L1a0:
            if (r14 <= r7) goto L1b9
            if (r11 <= r15) goto L1b9
            r27 = r11
            int r11 = r14 + (-1)
            r28 = r13
            int r13 = r27 + (-1)
            boolean r11 = r0.a(r11, r13)
            if (r11 == 0) goto L1bd
            int r14 = r14 + (-1)
            int r11 = r27 + (-1)
            r13 = r28
            goto L1a0
        L1b9:
            r27 = r11
            r28 = r13
        L1bd:
            int r13 = r17 + r28
            r20[r13] = r14
            if (r24 == 0) goto L264
            int r11 = r19 - r28
            if (r11 < r12) goto L264
            if (r11 > r3) goto L264
            int r11 = r17 + r11
            r11 = r16[r11]
            if (r11 < r14) goto L264
            r26[r33] = r14
            r11 = 1
            r26[r11] = r27
            r26[r32] = r22
            r26[r34] = r25
            r26[r23] = r11
        L1da:
            r3 = r26[r32]
            r12 = r26[r33]
            int r3 = r3 - r12
            r12 = r26[r34]
            r13 = r26[r11]
            int r12 = r12 - r13
            int r3 = java.lang.Math.min(r3, r12)
            if (r3 <= 0) goto L245
            r3 = r26[r33]
            r12 = r26[r11]
            r11 = r26[r34]
            int r11 = r11 - r12
            r13 = r26[r32]
            int r13 = r13 - r3
            if (r11 == r13) goto L23d
            int r13 = java.lang.Math.min(r13, r11)
            r11 = r26[r23]
            if (r11 == 0) goto L200
            r14 = 1
            goto L202
        L200:
            r14 = r33
        L202:
            r17 = r26[r34]
            r18 = 1
            r19 = r26[r18]
            r35 = r3
            int r3 = r17 - r19
            r21 = r26[r32]
            r22 = r26[r33]
            r23 = r11
            int r11 = r21 - r22
            if (r3 <= r11) goto L219
            r3 = r18
            goto L21b
        L219:
            r3 = r33
        L21b:
            r3 = r3 | r14
            r3 = r3 ^ 1
            int r3 = r35 + r3
            if (r23 == 0) goto L225
            r11 = r18
            goto L227
        L225:
            r11 = r33
        L227:
            int r14 = r17 - r19
            r35 = r3
            int r3 = r21 - r22
            if (r14 <= r3) goto L232
            r3 = r18
            goto L234
        L232:
            r3 = r33
        L234:
            r3 = r3 ^ 1
            r3 = r3 | r11
            r3 = r3 ^ 1
            int r12 = r12 + r3
            r3 = r35
            goto L241
        L23d:
            r35 = r3
            r18 = 1
        L241:
            r8.d(r3, r12, r13)
            goto L247
        L245:
            r18 = r11
        L247:
            r3 = r26[r33]
            r11 = r26[r18]
            r9.e(r7, r3, r15, r11)
            r3 = r26[r32]
            r7 = r26[r34]
            r9.e(r3, r6, r7, r10)
        L255:
            r7 = r32
            r10 = r33
            r3 = r36
            r11 = r16
            r12 = r20
            r13 = r26
            r6 = 1
            goto L57
        L264:
            int r13 = r28 + 2
            r11 = r24
            goto L157
        L26a:
            int r3 = r3 + 1
            r12 = r20
            r11 = r21
            r13 = r26
            r14 = r29
            r35 = 1
            goto L9e
        L278:
            r20 = r12
            r26 = r13
            goto L255
        L27d:
            r32 = r7
            r33 = r10
            r34 = 3
            int r3 = r8.f527b
            int r6 = r3 % 3
            if (r6 != 0) goto L28c
        L289:
            r6 = r34
            goto L292
        L28c:
            java.lang.String r6 = "Array size not a multiple of 3"
            y0.AbstractC1904a.b(r6)
            goto L289
        L292:
            if (r3 <= r6) goto L29b
            int r3 = r3 - r6
            r6 = r33
            r8.f(r6, r3)
            goto L29d
        L29b:
            r6 = r33
        L29d:
            r8.d(r4, r5, r6)
            r3 = r6
            r4 = r3
            r5 = r4
        L2a3:
            int r7 = r8.f527b
            if (r3 >= r7) goto L3a6
            int[] r7 = r8.f526a
            r9 = r7[r3]
            int r10 = r3 + 2
            r10 = r7[r10]
            int r9 = r9 - r10
            int r11 = r3 + 1
            r7 = r7[r11]
            int r7 = r7 - r10
            int r3 = r3 + 3
        L2b7:
            if (r4 >= r9) goto L2eb
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            c0.l r11 = r11.f10105v
            kotlin.jvm.internal.m.b(r11)
            int r12 = r11.f10102s
            r12 = r12 & 2
            if (r12 == 0) goto L2e2
            B0.n0 r12 = r11.f10107x
            kotlin.jvm.internal.m.b(r12)
            B0.n0 r13 = r12.f480D
            B0.n0 r12 = r12.f479C
            kotlin.jvm.internal.m.b(r12)
            if (r13 != 0) goto L2d7
            goto L2d9
        L2d7:
            r13.f479C = r12
        L2d9:
            r12.f480D = r13
            java.lang.Object r13 = r0.f424c
            c0.l r13 = (c0.AbstractC0724l) r13
            a(r2, r13, r12)
        L2e2:
            c0.l r11 = c(r11)
            r0.f424c = r11
            int r4 = r4 + 1
            goto L2b7
        L2eb:
            if (r5 >= r7) goto L36a
            int r9 = r0.f422a
            int r9 = r9 + r5
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            java.lang.Object r12 = r0.f426e
            R.e r12 = (R.e) r12
            java.lang.Object[] r12 = r12.f6676q
            r9 = r12[r9]
            c0.k r9 = (c0.InterfaceC0723k) r9
            c0.l r9 = b(r9, r11)
            r0.f424c = r9
            boolean r11 = r0.f423b
            if (r11 == 0) goto L364
            c0.l r9 = r9.f10105v
            kotlin.jvm.internal.m.b(r9)
            B0.n0 r9 = r9.f10107x
            kotlin.jvm.internal.m.b(r9)
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            B0.z r11 = B0.AbstractC0041g.g(r11)
            if (r11 == 0) goto L33a
            B0.B r12 = new B0.B
            B0.L r13 = r2.f429a
            r12.<init>(r13, r11)
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            r11.w0(r12)
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            a(r2, r11, r12)
            B0.n0 r11 = r9.f480D
            r12.f480D = r11
            r12.f479C = r9
            r9.f480D = r12
            goto L341
        L33a:
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            r11.w0(r9)
        L341:
            java.lang.Object r9 = r0.f424c
            c0.l r9 = (c0.AbstractC0724l) r9
            r9.n0()
            java.lang.Object r9 = r0.f424c
            c0.l r9 = (c0.AbstractC0724l) r9
            r9.t0()
            java.lang.Object r9 = r0.f424c
            c0.l r9 = (c0.AbstractC0724l) r9
            r.B r11 = B0.o0.f501a
            boolean r11 = r9.f10099D
            if (r11 != 0) goto L35e
            java.lang.String r11 = "autoInvalidateInsertedNode called on unattached node"
            y0.AbstractC1904a.b(r11)
        L35e:
            r11 = -1
            r12 = 1
            B0.o0.a(r9, r11, r12)
            goto L367
        L364:
            r12 = 1
            r9.f10108y = r12
        L367:
            int r5 = r5 + 1
            goto L2eb
        L36a:
            r12 = 1
        L36b:
            int r7 = r10 + (-1)
            if (r10 <= 0) goto L2a3
            java.lang.Object r9 = r0.f424c
            c0.l r9 = (c0.AbstractC0724l) r9
            c0.l r9 = r9.f10105v
            kotlin.jvm.internal.m.b(r9)
            r0.f424c = r9
            java.lang.Object r9 = r0.f425d
            R.e r9 = (R.e) r9
            int r10 = r0.f422a
            int r11 = r10 + r4
            java.lang.Object[] r9 = r9.f6676q
            r9 = r9[r11]
            c0.k r9 = (c0.InterfaceC0723k) r9
            java.lang.Object r11 = r0.f426e
            R.e r11 = (R.e) r11
            int r10 = r10 + r5
            java.lang.Object[] r11 = r11.f6676q
            r10 = r11[r10]
            c0.k r10 = (c0.InterfaceC0723k) r10
            boolean r11 = kotlin.jvm.internal.m.a(r9, r10)
            if (r11 != 0) goto L3a0
            java.lang.Object r11 = r0.f424c
            c0.l r11 = (c0.AbstractC0724l) r11
            i(r9, r10, r11)
        L3a0:
            int r4 = r4 + 1
            int r5 = r5 + 1
            r10 = r7
            goto L36b
        L3a6:
            B0.B0 r0 = r1.f432d
            c0.l r0 = r0.f10104u
            r10 = r6
        L3ab:
            if (r0 == 0) goto L3b9
            B0.h0 r2 = B0.i0.f443a
            if (r0 == r2) goto L3b9
            int r2 = r0.f10102s
            r10 = r10 | r2
            r0.f10103t = r10
            c0.l r0 = r0.f10104u
            goto L3ab
        L3b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0042g0.g(int, R.e, R.e, c0.l, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        L l7;
        B b7;
        s0 s0Var;
        AbstractC0724l abstractC0724l = this.f432d.f10104u;
        n0 n0Var = this.f430b;
        while (true) {
            l7 = this.f429a;
            if (abstractC0724l == null) {
                break;
            }
            InterfaceC0060z interfaceC0060zG = AbstractC0041g.g(abstractC0724l);
            if (interfaceC0060zG != null) {
                n0 n0Var2 = abstractC0724l.f10107x;
                if (n0Var2 != null) {
                    b7 = (B) n0Var2;
                    InterfaceC0060z interfaceC0060z = b7.f214a0;
                    b7.X0(interfaceC0060zG);
                    if (interfaceC0060z != abstractC0724l && (s0Var = b7.f498V) != null) {
                        s0Var.invalidate();
                    }
                } else {
                    b7 = new B(l7, interfaceC0060zG);
                    abstractC0724l.w0(b7);
                }
                n0Var.f480D = b7;
                b7.f479C = n0Var;
                n0Var = b7;
            } else {
                abstractC0724l.w0(n0Var);
            }
            abstractC0724l = abstractC0724l.f10104u;
        }
        L lS = l7.s();
        n0Var.f480D = lS != null ? lS.f268U.f430b : null;
        this.f431c = n0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC0724l abstractC0724l = this.f433e;
        B0 b02 = this.f432d;
        if (abstractC0724l == b02) {
            sb.append("]");
        } else {
            while (true) {
                if (abstractC0724l == null || abstractC0724l == b02) {
                    break;
                }
                sb.append(String.valueOf(abstractC0724l));
                if (abstractC0724l.f10105v == b02) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC0724l = abstractC0724l.f10105v;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
