package u;

import C0.Q0;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import c0.C0714b;
import c0.InterfaceC0728p;
import m5.C1386y;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1644d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1659m f16890a = new C1659m(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1660n f16891b = new C1660n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1661o f16892c = new C1661o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1662p f16893d = new C1662p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1659m f16894e = new C1659m(Float.NEGATIVE_INFINITY);
    public static final C1660n f = new C1660n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1661o f16895g = new C1661o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1662p f16896h = new C1662p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[] i = new float[91];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1658l a(float f7, float f8, int i7) {
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        return new C1658l(A0.f16746a, Float.valueOf(f7), new C1659m(f8), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object b(float f7, float f8, float f9, InterfaceC1657k interfaceC1657k, B5.e eVar, s5.i iVar) {
        Z.m mVar = A0.f16746a;
        Float f10 = new Float(f7);
        Float f11 = new Float(f8);
        C1659m c1659m = new C1659m(new Float(f9).floatValue());
        Object objC = c(new C1658l(mVar, f10, c1659m, 56), new n0(interfaceC1657k, mVar, f10, f11, c1659m), Long.MIN_VALUE, new Q0(eVar, 1), iVar);
        C1386y c1386y = C1386y.f15098a;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objC != enumC1580a) {
            objC = c1386y;
        }
        return objC == enumC1580a ? objC : c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(u.C1658l r22, u.InterfaceC1652h r23, long r24, B5.c r26, s5.c r27) {
        /*
            r3 = r23
            r0 = r27
            boolean r1 = r0 instanceof u.C1655i0
            if (r1 == 0) goto L18
            r1 = r0
            u.i0 r1 = (u.C1655i0) r1
            int r2 = r1.f16944v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.f16944v = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            u.i0 r1 = new u.i0
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.f16943u
            int r1 = r8.f16944v
            r9 = 2
            r10 = 1
            r5.a r11 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L4d
            if (r1 == r10) goto L44
            if (r1 != r9) goto L3c
            kotlin.jvm.internal.y r1 = r8.f16942t
            B5.c r2 = r8.f16941s
            u.h r3 = r8.f16940r
            u.l r4 = r8.f16939q
        L34:
            m5.AbstractC1362a.e(r0)     // Catch: java.util.concurrent.CancellationException -> L39
            goto Lf0
        L39:
            r0 = move-exception
            goto L160
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L44:
            kotlin.jvm.internal.y r1 = r8.f16942t
            B5.c r2 = r8.f16941s
            u.h r3 = r8.f16940r
            u.l r4 = r8.f16939q
            goto L34
        L4d:
            m5.AbstractC1362a.e(r0)
            r0 = 0
            java.lang.Object r13 = r3.b(r0)
            u.q r15 = r3.f(r0)
            kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y
            r1.<init>()
            r4 = -9223372036854775808
            int r0 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb8
            q5.h r0 = r8.getContext()     // Catch: java.util.concurrent.CancellationException -> Lb4
            float r6 = m(r0)     // Catch: java.util.concurrent.CancellationException -> Lb4
            u.k0 r0 = new u.k0     // Catch: java.util.concurrent.CancellationException -> Lb4
            r5 = r22
            r7 = r26
            r2 = r13
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> Laf
            r7 = r1
            r8.f16939q = r5     // Catch: java.util.concurrent.CancellationException -> Lad
            r8.f16940r = r3     // Catch: java.util.concurrent.CancellationException -> Lad
            r6 = r26
            r8.f16941s = r6     // Catch: java.util.concurrent.CancellationException -> Lad
            r8.f16942t = r7     // Catch: java.util.concurrent.CancellationException -> Lad
            r8.f16944v = r10     // Catch: java.util.concurrent.CancellationException -> Lad
            boolean r1 = r3.a()     // Catch: java.util.concurrent.CancellationException -> Lad
            if (r1 == 0) goto L90
            java.lang.Object r0 = r(r0, r8)     // Catch: java.util.concurrent.CancellationException -> Lad
            goto La2
        L90:
            a0.m r1 = new a0.m     // Catch: java.util.concurrent.CancellationException -> Lad
            r2 = 1
            r1.<init>(r0, r2)     // Catch: java.util.concurrent.CancellationException -> Lad
            q5.h r0 = r8.getContext()     // Catch: java.util.concurrent.CancellationException -> Lad
            P.T r0 = P.C0345b.o(r0)     // Catch: java.util.concurrent.CancellationException -> Lad
            java.lang.Object r0 = r0.e(r1, r8)     // Catch: java.util.concurrent.CancellationException -> Lad
        La2:
            if (r0 != r11) goto La6
            goto L151
        La6:
            r4 = r5
            r2 = r6
            goto Lef
        La9:
            r4 = r5
        Laa:
            r1 = r7
            goto L160
        Lad:
            r0 = move-exception
            goto La9
        Laf:
            r0 = move-exception
        Lb0:
            r7 = r1
            r4 = r5
            goto L160
        Lb4:
            r0 = move-exception
            r5 = r22
            goto Lb0
        Lb8:
            r5 = r22
            r6 = r26
            r7 = r1
            u.j r12 = new u.j     // Catch: java.util.concurrent.CancellationException -> L15b
            Z.m r14 = r3.d()     // Catch: java.util.concurrent.CancellationException -> L15b
            java.lang.Object r18 = r3.e()     // Catch: java.util.concurrent.CancellationException -> L15b
            u.j0 r0 = new u.j0     // Catch: java.util.concurrent.CancellationException -> L15b
            r1 = 1
            r0.<init>(r5, r1)     // Catch: java.util.concurrent.CancellationException -> L15b
            r19 = r24
            r16 = r24
            r21 = r0
            r12.<init>(r13, r14, r15, r16, r18, r19, r21)     // Catch: java.util.concurrent.CancellationException -> L15b
            q5.h r0 = r8.getContext()     // Catch: java.util.concurrent.CancellationException -> L15b
            float r0 = m(r0)     // Catch: java.util.concurrent.CancellationException -> L15b
            r1 = r24
            r4 = r3
            r3 = r0
            r0 = r12
            l(r0, r1, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L15b
            r12 = r0
            r7.f14268q = r12     // Catch: java.util.concurrent.CancellationException -> L15b
            r4 = r22
            r3 = r23
            r2 = r26
        Lef:
            r1 = r7
        Lf0:
            java.lang.Object r0 = r1.f14268q     // Catch: java.util.concurrent.CancellationException -> L39
            kotlin.jvm.internal.m.b(r0)     // Catch: java.util.concurrent.CancellationException -> L39
            u.j r0 = (u.C1656j) r0     // Catch: java.util.concurrent.CancellationException -> L39
            P.f0 r0 = r0.i     // Catch: java.util.concurrent.CancellationException -> L39
            java.lang.Object r0 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.util.concurrent.CancellationException -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L39
            if (r0 == 0) goto L158
            q5.h r0 = r8.getContext()     // Catch: java.util.concurrent.CancellationException -> L39
            float r0 = m(r0)     // Catch: java.util.concurrent.CancellationException -> L39
            u.l0 r5 = new u.l0     // Catch: java.util.concurrent.CancellationException -> L39
            r24 = r0
            r23 = r1
            r27 = r2
            r25 = r3
            r26 = r4
            r22 = r5
            r22.<init>(r23, r24, r25, r26, r27)     // Catch: java.util.concurrent.CancellationException -> L152
            r0 = r22
            r1 = r23
            r3 = r25
            r4 = r26
            r2 = r27
            r8.f16939q = r4     // Catch: java.util.concurrent.CancellationException -> L39
            r8.f16940r = r3     // Catch: java.util.concurrent.CancellationException -> L39
            r8.f16941s = r2     // Catch: java.util.concurrent.CancellationException -> L39
            r8.f16942t = r1     // Catch: java.util.concurrent.CancellationException -> L39
            r8.f16944v = r9     // Catch: java.util.concurrent.CancellationException -> L39
            boolean r5 = r3.a()     // Catch: java.util.concurrent.CancellationException -> L39
            if (r5 == 0) goto L13d
            java.lang.Object r0 = r(r0, r8)     // Catch: java.util.concurrent.CancellationException -> L39
            goto L14f
        L13d:
            a0.m r5 = new a0.m     // Catch: java.util.concurrent.CancellationException -> L39
            r6 = 1
            r5.<init>(r0, r6)     // Catch: java.util.concurrent.CancellationException -> L39
            q5.h r0 = r8.getContext()     // Catch: java.util.concurrent.CancellationException -> L39
            P.T r0 = P.C0345b.o(r0)     // Catch: java.util.concurrent.CancellationException -> L39
            java.lang.Object r0 = r0.e(r5, r8)     // Catch: java.util.concurrent.CancellationException -> L39
        L14f:
            if (r0 != r11) goto Lf0
        L151:
            return r11
        L152:
            r0 = move-exception
            r1 = r23
            r4 = r26
            goto L160
        L158:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L15b:
            r0 = move-exception
            r4 = r22
            goto Laa
        L160:
            java.lang.Object r2 = r1.f14268q
            u.j r2 = (u.C1656j) r2
            if (r2 != 0) goto L167
            goto L16e
        L167:
            P.f0 r2 = r2.i
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.setValue(r3)
        L16e:
            java.lang.Object r1 = r1.f14268q
            u.j r1 = (u.C1656j) r1
            if (r1 == 0) goto L17f
            long r1 = r1.f16950g
            long r5 = r4.f16964t
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L17f
            r1 = 0
            r4.f16966v = r1
        L17f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.AbstractC1644d.c(u.l, u.h, long, B5.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object d(float f7, float f8, InterfaceC1657k interfaceC1657k, B5.e eVar, s5.i iVar, int i7) {
        if ((i7 & 8) != 0) {
            interfaceC1657k = o(7, null);
        }
        return b(f7, f8, 0.0f, interfaceC1657k, eVar, iVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object e(C1658l c1658l, C1667v c1667v, boolean z5, B5.c cVar, s5.c cVar2) {
        Object objC = c(c1658l, new C1666u(c1667v, c1658l.f16961q, c1658l.f16962r.getValue(), c1658l.f16963s), z5 ? c1658l.f16964t : Long.MIN_VALUE, cVar, cVar2);
        return objC == EnumC1580a.f16356q ? objC : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1626E f(C1629H c1629h, float f7, C1625D c1625d, C0371o c0371o) {
        return i(c1629h, Float.valueOf(0.0f), Float.valueOf(f7), A0.f16746a, c1625d, c0371o, 33208, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object g(C1658l c1658l, Float f7, InterfaceC1657k interfaceC1657k, boolean z5, B5.c cVar, s5.c cVar2) {
        Object objC = c(c1658l, new n0(interfaceC1657k, c1658l.f16961q, c1658l.f16962r.getValue(), f7, c1658l.f16963s), z5 ? c1658l.f16964t : Long.MIN_VALUE, cVar, cVar2);
        return objC == EnumC1580a.f16356q ? objC : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1626E i(C1629H c1629h, Number number, Number number2, Z.m mVar, C1625D c1625d, C0371o c0371o, int i7, int i8) {
        Object objH = c0371o.H();
        P.S s6 = C0363k.f5418a;
        if (objH == s6) {
            C1626E c1626e = new C1626E(c1629h, number, number2, mVar, c1625d);
            c0371o.d0(c1626e);
            objH = c1626e;
        }
        C1626E c1626e2 = (C1626E) objH;
        boolean z5 = (((57344 & i7) ^ 24576) > 16384 && c0371o.i(c1625d)) || (i7 & 24576) == 16384;
        Object objH2 = c0371o.H();
        if (z5 || objH2 == s6) {
            M.S s7 = new M.S(number, c1626e2, number2, c1625d, 3);
            c0371o.d0(s7);
            objH2 = s7;
        }
        C0345b.g((B5.a) objH2, c0371o);
        boolean zI = c0371o.i(c1629h);
        Object objH3 = c0371o.H();
        if (zI || objH3 == s6) {
            objH3 = new A.Y(25, c1629h, c1626e2);
            c0371o.d0(objH3);
        }
        C0345b.c(c1626e2, (B5.c) objH3, c0371o);
        return c1626e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC1663q j(AbstractC1663q abstractC1663q) {
        AbstractC1663q abstractC1663qC = abstractC1663q.c();
        int iB = abstractC1663qC.b();
        for (int i7 = 0; i7 < iB; i7++) {
            abstractC1663qC.e(i7, abstractC1663q.a(i7));
        }
        return abstractC1663qC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1658l k(C1658l c1658l, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = ((Number) c1658l.f16962r.getValue()).floatValue();
        }
        if ((i7 & 2) != 0) {
            f8 = ((C1659m) c1658l.f16963s).f16972a;
        }
        return new C1658l(c1658l.f16961q, Float.valueOf(f7), new C1659m(f8), c1658l.f16964t, c1658l.f16965u, c1658l.f16966v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(C1656j c1656j, long j, float f7, InterfaceC1652h interfaceC1652h, C1658l c1658l, B5.c cVar) {
        long jC = f7 == 0.0f ? interfaceC1652h.c() : (long) ((j - c1656j.f16947c) / f7);
        c1656j.f16950g = j;
        c1656j.f16949e.setValue(interfaceC1652h.b(jC));
        c1656j.f = interfaceC1652h.f(jC);
        if (interfaceC1652h.g(jC)) {
            c1656j.f16951h = c1656j.f16950g;
            c1656j.i.setValue(Boolean.FALSE);
        }
        q(c1656j, c1658l);
        cVar.invoke(c1656j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float m(InterfaceC1529h interfaceC1529h) {
        InterfaceC0728p interfaceC0728p = (InterfaceC0728p) interfaceC1529h.get(C0714b.f10075D);
        float fK = interfaceC0728p != null ? interfaceC0728p.K() : 1.0f;
        if (fK >= 0.0f) {
            return fK;
        }
        AbstractC1637P.b("negative scale factor");
        return fK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1625D n(InterfaceC1668w interfaceC1668w) {
        return new C1625D(interfaceC1668w, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1649f0 o(int i7, Object obj) {
        float f7 = (i7 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new C1649f0(f7, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static z0 p(int i7, int i8, InterfaceC1669x interfaceC1669x) {
        int i9 = (i8 & 2) != 0 ? 0 : 90;
        if ((i8 & 4) != 0) {
            interfaceC1669x = AbstractC1670y.f17083a;
        }
        return new z0(i7, i9, interfaceC1669x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(C1656j c1656j, C1658l c1658l) {
        c1658l.f16962r.setValue(c1656j.f16949e.getValue());
        AbstractC1663q abstractC1663q = c1658l.f16963s;
        AbstractC1663q abstractC1663q2 = c1656j.f;
        int iB = abstractC1663q.b();
        for (int i7 = 0; i7 < iB; i7++) {
            abstractC1663q.e(i7, abstractC1663q2.a(i7));
        }
        c1658l.f16965u = c1656j.f16951h;
        c1658l.f16964t = c1656j.f16950g;
        c1658l.f16966v = ((Boolean) c1656j.i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object r(B5.c cVar, s5.c cVar2) {
        if (cVar2.getContext().get(C0.E0.f812q) == null) {
            return C0345b.o(cVar2.getContext()).e(cVar, cVar2);
        }
        throw new ClassCastException();
    }
}
