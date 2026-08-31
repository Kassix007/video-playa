package P;

import M5.InterfaceC0261w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q5.C1530i;
import q5.InterfaceC1529h;
import r.C1569u;
import s.AbstractC1585a;

/* JADX INFO: renamed from: P.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0345b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5386a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f5387b = new F();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(P.C0368m0 r11, X.e r12, P.C0371o r13, int r14) {
        /*
            r0 = -1350970552(0xffffffffaf79d348, float:-2.272148E-10)
            r13.U(r0)
            B0.w r0 = r13.f5475w
            P.i0 r1 = r13.m()
            r2 = 201(0xc9, float:2.82E-43)
            P.Z r3 = P.AbstractC0373p.f5486b
            r13.Q(r2, r3)
            java.lang.Object r2 = r13.H()
            P.S r3 = P.C0363k.f5418a
            boolean r3 = kotlin.jvm.internal.m.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L29
        L22:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            kotlin.jvm.internal.m.c(r2, r3)
            P.V0 r2 = (P.V0) r2
        L29:
            P.l0 r3 = r11.f5429a
            P.V0 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r13.d0(r5)
        L38:
            boolean r6 = r13.f5453O
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L6d
            boolean r2 = r11.f
            if (r2 != 0) goto L4b
            r2 = r1
            X.i r2 = (X.i) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L69
        L4b:
            X.i r1 = (X.i) r1
            U.m r2 = r1.f7493q
            int r6 = r3.hashCode()
            U.l r2 = r2.u(r6, r8, r3, r5)
            if (r2 != 0) goto L5a
            goto L69
        L5a:
            X.i r3 = new X.i
            java.lang.Object r5 = r2.f7511r
            U.m r5 = (U.m) r5
            int r1 = r1.f7494r
            int r2 = r2.f7510q
            int r1 = r1 + r2
            r3.<init>(r5, r1)
            r1 = r3
        L69:
            r13.f5447I = r7
        L6b:
            r2 = r8
            goto Lc7
        L6d:
            P.z0 r6 = r13.f5444F
            int r9 = r6.f5590g
            int[] r10 = r6.f5586b
            java.lang.Object r6 = r6.b(r10, r9)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.m.c(r6, r9)
            P.i0 r6 = (P.InterfaceC0360i0) r6
            boolean r9 = r13.x()
            if (r9 == 0) goto L86
            if (r2 != 0) goto L94
        L86:
            boolean r9 = r11.f
            if (r9 != 0) goto La2
            r9 = r1
            X.i r9 = (X.i) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 != 0) goto L94
            goto La2
        L94:
            if (r2 == 0) goto L9b
            boolean r2 = r13.f5474v
            if (r2 != 0) goto L9b
            goto La0
        L9b:
            boolean r2 = r13.f5474v
            if (r2 == 0) goto La0
            goto Lc0
        La0:
            r1 = r6
            goto Lc0
        La2:
            X.i r1 = (X.i) r1
            U.m r2 = r1.f7493q
            int r9 = r3.hashCode()
            U.l r2 = r2.u(r9, r8, r3, r5)
            if (r2 != 0) goto Lb1
            goto Lc0
        Lb1:
            X.i r3 = new X.i
            java.lang.Object r5 = r2.f7511r
            U.m r5 = (U.m) r5
            int r1 = r1.f7494r
            int r2 = r2.f7510q
            int r1 = r1 + r2
            r3.<init>(r5, r1)
            r1 = r3
        Lc0:
            boolean r2 = r13.f5476x
            if (r2 != 0) goto Lc6
            if (r6 == r1) goto L6b
        Lc6:
            r2 = r7
        Lc7:
            if (r2 == 0) goto Ld0
            boolean r3 = r13.f5453O
            if (r3 != 0) goto Ld0
            r13.F(r1)
        Ld0:
            boolean r3 = r13.f5474v
            r0.c(r3)
            r13.f5474v = r2
            r13.f5448J = r1
            r2 = 202(0xca, float:2.83E-43)
            P.Z r3 = P.AbstractC0373p.f5487c
            r13.O(r2, r8, r3, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lf8
            goto Lf9
        Lf8:
            r7 = r8
        Lf9:
            r13.f5474v = r7
            r13.f5448J = r4
            P.o0 r13 = r13.r()
            if (r13 == 0) goto L10b
            E.v r0 = new E.v
            r1 = 2
            r0.<init>(r14, r1, r11, r12)
            r13.f5482d = r0
        L10b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0345b.a(P.m0, X.e, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(P.C0368m0[] r8, B5.e r9, P.C0371o r10, int r11) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r10.U(r0)
            B0.w r0 = r10.f5475w
            P.i0 r1 = r10.m()
            r2 = 201(0xc9, float:2.82E-43)
            P.Z r3 = P.AbstractC0373p.f5486b
            r10.Q(r2, r3)
            boolean r2 = r10.f5453O
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            X.i r2 = X.i.f8148t
            X.i r2 = x(r8, r1, r2)
            X.i r1 = r10.c0(r1, r2)
            r10.f5447I = r3
        L25:
            r2 = r4
            goto L74
        L27:
            P.z0 r2 = r10.f5444F
            int r5 = r2.f5590g
            java.lang.Object r2 = r2.g(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.m.c(r2, r5)
            P.i0 r2 = (P.InterfaceC0360i0) r2
            P.z0 r6 = r10.f5444F
            int r7 = r6.f5590g
            java.lang.Object r6 = r6.g(r7, r3)
            kotlin.jvm.internal.m.c(r6, r5)
            P.i0 r6 = (P.InterfaceC0360i0) r6
            X.i r5 = x(r8, r1, r6)
            boolean r7 = r10.x()
            if (r7 == 0) goto L65
            boolean r7 = r10.f5476x
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.f5463k
            P.z0 r5 = r10.f5444F
            int r5 = r5.p()
            int r5 = r5 + r1
            r10.f5463k = r5
            r1 = r2
            goto L25
        L65:
            X.i r1 = r10.c0(r1, r5)
            boolean r5 = r10.f5476x
            if (r5 != 0) goto L73
            boolean r2 = kotlin.jvm.internal.m.a(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.f5453O
            if (r5 != 0) goto L7d
            r10.F(r1)
        L7d:
            boolean r5 = r10.f5474v
            r0.c(r5)
            r10.f5474v = r2
            r10.f5448J = r1
            r2 = 202(0xca, float:2.83E-43)
            P.Z r5 = P.AbstractC0373p.f5487c
            r10.O(r2, r4, r5, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.f5474v = r3
            r0 = 0
            r10.f5448J = r0
            P.o0 r10 = r10.r()
            if (r10 == 0) goto Lb9
            E.v r0 = new E.v
            r1 = 1
            r0.<init>(r11, r1, r8, r9)
            r10.f5482d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0345b.b(P.m0[], B5.e, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(Object obj, B5.c cVar, C0371o c0371o) {
        boolean zG = c0371o.g(obj);
        Object objH = c0371o.H();
        if (zG || objH == C0363k.f5418a) {
            objH = new D(cVar);
            c0371o.d0(objH);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(Object obj, Object obj2, B5.c cVar, C0371o c0371o) {
        boolean zG = c0371o.g(obj) | c0371o.g(obj2);
        Object objH = c0371o.H();
        if (zG || objH == C0363k.f5418a) {
            objH = new D(cVar);
            c0371o.d0(objH);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(B5.e eVar, C0371o c0371o, Object obj) {
        InterfaceC1529h interfaceC1529hH = c0371o.f5457b.h();
        boolean zG = c0371o.g(obj);
        Object objH = c0371o.H();
        if (zG || objH == C0363k.f5418a) {
            objH = new P(interfaceC1529hH, eVar);
            c0371o.d0(objH);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(Object obj, Object obj2, B5.e eVar, C0371o c0371o) {
        InterfaceC1529h interfaceC1529hH = c0371o.f5457b.h();
        boolean zG = c0371o.g(obj) | c0371o.g(obj2);
        Object objH = c0371o.H();
        if (zG || objH == C0363k.f5418a) {
            objH = new P(interfaceC1529hH, eVar);
            c0371o.d0(objH);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(B5.a aVar, C0371o c0371o) {
        Q.K k7 = c0371o.f5450L.f6488b.f6486o;
        k7.W(Q.A.f6466c);
        D5.a.I(k7, 0, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(C1569u c1569u, int i) {
        if (c1569u.f16252b == 0 || !(c1569u.c(0) == i || c1569u.c(c1569u.f16252b - 1) == i)) {
            int i7 = c1569u.f16252b;
            c1569u.a(i);
            while (i7 > 0) {
                int i8 = ((i7 + 1) >>> 1) - 1;
                int iC = c1569u.c(i8);
                if (i <= iC) {
                    break;
                }
                c1569u.e(i7, iC);
                i7 = i8;
            }
            c1569u.e(i7, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(D0 d02, List list, C0382u c0382u) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int iC = d02.c((C0343a) list.get(i));
            int iK = d02.K(d02.f5289b, d02.q(iC));
            Object obj = iK < d02.f(d02.f5289b, d02.q(iC + 1)) ? d02.f5290c[d02.g(iK)] : C0363k.f5418a;
            C0372o0 c0372o0 = obj instanceof C0372o0 ? (C0372o0) obj : null;
            if (c0372o0 != null) {
                c0372o0.f5480b = c0382u;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final W j(P5.P p7, C0371o c0371o) {
        Object value = p7.getValue();
        C1530i c1530i = C1530i.f16022q;
        boolean zI = c0371o.i(c1530i) | c0371o.i(p7);
        Object objH = c0371o.H();
        Object obj = C0363k.f5418a;
        if (zI || objH == obj) {
            objH = new O0(c1530i, p7, null);
            c0371o.d0(objH);
        }
        B5.e eVar = (B5.e) objH;
        Object objH2 = c0371o.H();
        if (objH2 == obj) {
            objH2 = q(value);
            c0371o.d0(objH2);
        }
        W w3 = (W) objH2;
        boolean zI2 = c0371o.i(eVar);
        Object objH3 = c0371o.H();
        if (zI2 || objH3 == obj) {
            objH3 = new L0(eVar, w3, null);
            c0371o.d0(objH3);
        }
        f(p7, c1530i, (B5.e) objH3, c0371o);
        return w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0261w k(C0371o c0371o) {
        return new y0(c0371o.f5457b.h());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final R.e l() {
        B0.G0 g02 = J0.f5323b;
        R.e eVar = (R.e) g02.s();
        if (eVar != null) {
            return eVar;
        }
        R.e eVar2 = new R.e(new C0369n[0]);
        g02.T(eVar2);
        return eVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C m(B5.a aVar) {
        B0.G0 g02 = J0.f5322a;
        return new C(aVar, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C n(B5.a aVar, I0 i02) {
        B0.G0 g02 = J0.f5322a;
        return new C(aVar, i02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final T o(InterfaceC1529h interfaceC1529h) {
        T t6 = (T) interfaceC1529h.get(S.f5373r);
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List p(D0 d02, int i, D0 d03, boolean z5, boolean z6, boolean z7) {
        List list;
        boolean z8;
        C0343a c0343aP;
        int i7;
        int i8;
        int iS = d02.s(i);
        int i9 = i + iS;
        int iF = d02.f(d02.f5289b, d02.q(i));
        int iF2 = d02.f(d02.f5289b, d02.q(i9));
        int i10 = iF2 - iF;
        boolean z9 = i >= 0 && (d02.f5289b[(d02.q(i) * 5) + 1] & 201326592) != 0;
        d03.u(iS);
        d03.v(i10, d03.f5304t);
        if (d02.f5293g < i9) {
            d02.z(i9);
        }
        if (d02.f5295k < iF2) {
            d02.A(iF2, i9);
        }
        int[] iArr = d03.f5289b;
        int i11 = d03.f5304t;
        int i12 = i11 * 5;
        n5.k.C0(i12, i * 5, i9 * 5, d02.f5289b, iArr);
        Object[] objArr = d03.f5290c;
        int i13 = d03.i;
        System.arraycopy(d02.f5290c, iF, objArr, i13, i10);
        int i14 = d03.f5306v;
        iArr[i12 + 2] = i14;
        int i15 = i11 - i;
        int i16 = i11 + iS;
        int iF3 = i13 - d03.f(iArr, i11);
        int i17 = d03.f5297m;
        int i18 = d03.f5296l;
        int length = objArr.length;
        boolean z10 = z9;
        int i19 = i17;
        int i20 = i11;
        while (i20 < i16) {
            if (i20 != i11) {
                int i21 = (i20 * 5) + 2;
                iArr[i21] = iArr[i21] + i15;
            }
            int[] iArr2 = iArr;
            int iF4 = d03.f(iArr, i20) + iF3;
            if (i19 < i20) {
                i7 = i11;
                i8 = 0;
            } else {
                i7 = i11;
                i8 = d03.f5295k;
            }
            iArr2[(i20 * 5) + 4] = D0.h(iF4, i8, i18, length);
            if (i20 == i19) {
                i19++;
            }
            i20++;
            i11 = i7;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        d03.f5297m = i19;
        int iB = C0.b(d02.f5291d, i, d02.n());
        int iB2 = C0.b(d02.f5291d, i9, d02.n());
        if (iB < iB2) {
            ArrayList arrayList = d02.f5291d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i22 = iB; i22 < iB2; i22++) {
                C0343a c0343a = (C0343a) arrayList.get(i22);
                c0343a.f5384a += i15;
                arrayList2.add(c0343a);
            }
            d03.f5291d.addAll(C0.b(d03.f5291d, d03.f5304t, d03.n()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = n5.s.f15299q;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = d02.f5292e;
            HashMap map2 = d03.f5292e;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i23 = 0; i23 < size; i23++) {
                }
            }
        }
        int i24 = d03.f5306v;
        HashMap map3 = d03.f5292e;
        if (map3 != null && (c0343aP = d03.P(i14)) != null) {
        }
        int iC = d02.C(d02.f5289b, i);
        if (!z7) {
            z8 = false;
        } else if (z5) {
            boolean z11 = iC >= 0;
            if (z11) {
                d02.N();
                d02.a(iC - d02.f5304t);
                d02.N();
            }
            d02.a(i - d02.f5304t);
            boolean zF = d02.F();
            if (z11) {
                d02.J();
                d02.i();
                d02.J();
                d02.i();
            }
            z8 = zF;
        } else {
            boolean zG = d02.G(i, iS);
            d02.H(iF, i10, i - 1);
            z8 = zG;
        }
        if (z8) {
            AbstractC0373p.c("Unexpectedly removed anchors");
        }
        int i25 = d03.f5299o;
        int i26 = iArr3[i12 + 1];
        d03.f5299o = i25 + ((1073741824 & i26) != 0 ? 1 : i26 & 67108863);
        if (z6) {
            d03.f5304t = i16;
            d03.i = i13 + i10;
        }
        if (z10) {
            d03.R(i14);
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0354f0 q(Object obj) {
        return new C0354f0(obj, S.f5377v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object r(InterfaceC0360i0 interfaceC0360i0, AbstractC0366l0 abstractC0366l0) {
        kotlin.jvm.internal.m.c(abstractC0366l0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        X.i iVar = (X.i) interfaceC0360i0;
        Object objB = iVar.get(abstractC0366l0);
        if (objB == null) {
            objB = abstractC0366l0.b();
        }
        return ((V0) objB).a(iVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0367m s(C0371o c0371o) {
        C0371o c0371o2;
        c0371o.Q(206, AbstractC0373p.f5489e);
        if (c0371o.f5453O) {
            D0.x(c0371o.f5446H);
        }
        Object objZ = c0371o.z();
        C0365l c0365l = objZ instanceof C0365l ? (C0365l) objZ : null;
        if (c0365l == null) {
            c0371o2 = c0371o;
            c0365l = new C0365l(new C0367m(c0371o2, c0371o.f5454P, c0371o.f5468p, c0371o.f5440B, c0371o.f5461g.f5526H));
            c0371o2.e0(c0365l);
        } else {
            c0371o2 = c0371o;
        }
        C0367m c0367m = c0365l.f5421q;
        c0367m.f.setValue(c0371o2.m());
        c0371o2.p(false);
        return c0367m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final W t(Object obj, C0371o c0371o) {
        Object objH = c0371o.H();
        if (objH == C0363k.f5418a) {
            objH = q(obj);
            c0371o.d0(objH);
        }
        W w3 = (W) objH;
        w3.setValue(obj);
        return w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(B5.e eVar, C0371o c0371o, Object obj) {
        if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), obj)) {
            c0371o.d0(obj);
            c0371o.c(obj, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int v(C1569u c1569u) {
        int iC;
        int i = c1569u.f16252b;
        int iC2 = c1569u.c(0);
        while (c1569u.f16252b != 0 && c1569u.c(0) == iC2) {
            int i7 = c1569u.f16252b;
            if (i7 == 0) {
                AbstractC1585a.e("IntList is empty.");
                throw null;
            }
            c1569u.e(0, c1569u.f16251a[i7 - 1]);
            c1569u.d(c1569u.f16252b - 1);
            int i8 = c1569u.f16252b;
            int i9 = i8 >>> 1;
            int i10 = 0;
            while (i10 < i9) {
                int iC3 = c1569u.c(i10);
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iC4 = c1569u.c(i12);
                if (i11 >= i8 || (iC = c1569u.c(i11)) <= iC4) {
                    if (iC4 > iC3) {
                        c1569u.e(i10, iC4);
                        c1569u.e(i12, iC3);
                        i10 = i12;
                    }
                } else if (iC > iC3) {
                    c1569u.e(i10, iC);
                    c1569u.e(i11, iC3);
                    i10 = i11;
                }
            }
        }
        return iC2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int w(int i) {
        int i7 = 306783378 & i;
        int i8 = 613566756 & i;
        return (i & (-920350135)) | (i8 >> 1) | i7 | ((i7 << 1) & i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final X.i x(C0368m0[] c0368m0Arr, InterfaceC0360i0 interfaceC0360i0, InterfaceC0360i0 interfaceC0360i02) {
        X.h hVar = new X.h(X.i.f8148t);
        for (C0368m0 c0368m0 : c0368m0Arr) {
            AbstractC0366l0 abstractC0366l0 = c0368m0.f5429a;
            if (c0368m0.f || !((X.i) interfaceC0360i0).containsKey(abstractC0366l0)) {
                hVar.put(abstractC0366l0, abstractC0366l0.c(c0368m0, (V0) ((X.i) interfaceC0360i02).get(abstractC0366l0)));
            }
        }
        return hVar.a();
    }
}
