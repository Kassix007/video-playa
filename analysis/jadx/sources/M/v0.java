package M;

import P.C0345b;
import P.C0371o;
import c0.C0717e;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.List;
import m5.C1386y;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3636q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X.e f3638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3643x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i, B5.e eVar, X.e eVar2, B5.e eVar3, B5.e eVar4, N.z zVar, B5.e eVar5) {
        super(2);
        this.f3637r = i;
        this.f3639t = eVar;
        this.f3638s = eVar2;
        this.f3640u = eVar3;
        this.f3641v = eVar4;
        this.f3643x = zVar;
        this.f3642w = eVar5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        C0231t c0231t;
        Object obj6;
        Integer numValueOf;
        int iG;
        int iB;
        Object obj7;
        Object obj8;
        int i;
        int iG2;
        int iG3;
        switch (this.f3636q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
                    c0371o.N();
                } else {
                    z0.b(this.f3637r, (B5.e) this.f3639t, this.f3638s, (B5.e) this.f3640u, (B5.e) this.f3641v, (N.z) this.f3643x, (B5.e) this.f3642w, c0371o, 0);
                }
                return C1386y.f15098a;
            case 1:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                z0.T t6 = (z0.T) this.f3640u;
                if ((iIntValue & 3) == 2 && c0371o2.x()) {
                    c0371o2.N();
                } else {
                    A.W w3 = (A.W) this.f3639t;
                    float fF0 = ((ArrayList) this.f3641v).isEmpty() ? t6.f0(w3.d(t6)) : t6.f0(this.f3637r);
                    float fF02 = (((ArrayList) this.f3642w).isEmpty() || (num = (Integer) this.f3643x) == null) ? t6.f0(w3.b(t6)) : t6.f0(num.intValue());
                    W0.l layoutDirection = t6.getLayoutDirection();
                    W0.l lVar = W0.l.f8022q;
                    float fF03 = layoutDirection == lVar ? t6.f0(w3.c(t6, layoutDirection)) : t6.f0(w3.a(t6, layoutDirection));
                    W0.l layoutDirection2 = t6.getLayoutDirection();
                    this.f3638s.invoke(new A.L(fF03, fF0, layoutDirection2 == lVar ? t6.f0(w3.a(t6, layoutDirection2)) : t6.f0(w3.c(t6, layoutDirection2)), fF02), c0371o2, 0);
                }
                return C1386y.f15098a;
            case 2:
                z0.T t7 = (z0.T) obj;
                long j = ((W0.a) obj2).f8007a;
                A.W w6 = (A.W) this.f3643x;
                int iH = W0.a.h(j);
                int iG4 = W0.a.g(j);
                long jA = W0.a.a(0, 0, 0, 10, j);
                List listH = t7.H(A0.f3276q, (B5.e) this.f3639t);
                ArrayList arrayList = new ArrayList(listH.size());
                int size = listH.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(((InterfaceC1925B) listH.get(i7)).a(jA));
                }
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i8 = ((AbstractC1933J) obj3).f18665r;
                    int iU = AbstractC0836n2.u(arrayList);
                    if (1 <= iU) {
                        int i9 = 1;
                        while (true) {
                            Object obj9 = arrayList.get(i9);
                            int i10 = ((AbstractC1933J) obj9).f18665r;
                            if (i8 < i10) {
                                i8 = i10;
                                obj3 = obj9;
                            }
                            if (i9 != iU) {
                                i9++;
                            }
                        }
                    }
                }
                AbstractC1933J abstractC1933J = (AbstractC1933J) obj3;
                int i11 = abstractC1933J != null ? abstractC1933J.f18665r : 0;
                List listH2 = t7.H(A0.f3278s, (B5.e) this.f3640u);
                ArrayList arrayList2 = new ArrayList(listH2.size());
                int size2 = listH2.size();
                int i12 = 0;
                while (i12 < size2) {
                    arrayList2.add(((InterfaceC1925B) listH2.get(i12)).a(W0.b.h((-w6.c(t7, t7.getLayoutDirection())) - w6.a(t7, t7.getLayoutDirection()), -w6.b(t7), jA)));
                    i12++;
                    arrayList = arrayList;
                    listH2 = listH2;
                    i11 = i11;
                }
                ArrayList arrayList3 = arrayList;
                int i13 = i11;
                if (arrayList2.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList2.get(0);
                    int i14 = ((AbstractC1933J) obj4).f18665r;
                    int iU2 = AbstractC0836n2.u(arrayList2);
                    if (1 <= iU2) {
                        Object obj10 = obj4;
                        int i15 = i14;
                        int i16 = 1;
                        while (true) {
                            Object obj11 = arrayList2.get(i16);
                            int i17 = ((AbstractC1933J) obj11).f18665r;
                            if (i15 < i17) {
                                obj10 = obj11;
                                i15 = i17;
                            }
                            if (i16 != iU2) {
                                i16++;
                            } else {
                                obj4 = obj10;
                            }
                        }
                    }
                }
                AbstractC1933J abstractC1933J2 = (AbstractC1933J) obj4;
                int i18 = abstractC1933J2 != null ? abstractC1933J2.f18665r : 0;
                if (arrayList2.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList2.get(0);
                    int i19 = ((AbstractC1933J) obj5).f18664q;
                    int iU3 = AbstractC0836n2.u(arrayList2);
                    if (1 <= iU3) {
                        Object obj12 = obj5;
                        int i20 = i19;
                        int i21 = 1;
                        while (true) {
                            Object obj13 = arrayList2.get(i21);
                            int i22 = ((AbstractC1933J) obj13).f18664q;
                            if (i20 < i22) {
                                obj12 = obj13;
                                i20 = i22;
                            }
                            if (i21 != iU3) {
                                i21++;
                            } else {
                                obj5 = obj12;
                            }
                        }
                    }
                }
                AbstractC1933J abstractC1933J3 = (AbstractC1933J) obj5;
                int i23 = abstractC1933J3 != null ? abstractC1933J3.f18664q : 0;
                List listH3 = t7.H(A0.f3279t, (B5.e) this.f3641v);
                int i24 = i23;
                ArrayList arrayList4 = new ArrayList(listH3.size());
                int size3 = listH3.size();
                int i25 = 0;
                while (i25 < size3) {
                    int i26 = i18;
                    ArrayList arrayList5 = arrayList2;
                    AbstractC1933J abstractC1933JA = ((InterfaceC1925B) listH3.get(i25)).a(W0.b.h((-w6.c(t7, t7.getLayoutDirection())) - w6.a(t7, t7.getLayoutDirection()), -w6.b(t7), jA));
                    if (abstractC1933JA.f18665r == 0 || abstractC1933JA.f18664q == 0) {
                        abstractC1933JA = null;
                    }
                    if (abstractC1933JA != null) {
                        arrayList4.add(abstractC1933JA);
                    }
                    i25++;
                    i18 = i26;
                    arrayList2 = arrayList5;
                }
                int i27 = i18;
                ArrayList arrayList6 = arrayList2;
                boolean zIsEmpty = arrayList4.isEmpty();
                int i28 = this.f3637r;
                if (zIsEmpty) {
                    c0231t = null;
                } else {
                    if (arrayList4.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i29 = ((AbstractC1933J) obj7).f18664q;
                        int iU4 = AbstractC0836n2.u(arrayList4);
                        if (1 <= iU4) {
                            Object obj14 = obj7;
                            int i30 = i29;
                            int i31 = 1;
                            while (true) {
                                Object obj15 = arrayList4.get(i31);
                                int i32 = ((AbstractC1933J) obj15).f18664q;
                                if (i30 < i32) {
                                    i30 = i32;
                                    obj14 = obj15;
                                }
                                if (i31 != iU4) {
                                    i31++;
                                } else {
                                    obj7 = obj14;
                                }
                            }
                        }
                    }
                    kotlin.jvm.internal.m.b(obj7);
                    int i33 = ((AbstractC1933J) obj7).f18664q;
                    if (arrayList4.isEmpty()) {
                        i = i33;
                        obj8 = null;
                    } else {
                        obj8 = arrayList4.get(0);
                        int i34 = ((AbstractC1933J) obj8).f18665r;
                        int iU5 = AbstractC0836n2.u(arrayList4);
                        if (1 <= iU5) {
                            Object obj16 = obj8;
                            int i35 = i34;
                            int i36 = 1;
                            while (true) {
                                Object obj17 = arrayList4.get(i36);
                                i = i33;
                                int i37 = ((AbstractC1933J) obj17).f18665r;
                                if (i35 < i37) {
                                    i35 = i37;
                                    obj16 = obj17;
                                }
                                if (i36 != iU5) {
                                    i36++;
                                    i33 = i;
                                } else {
                                    obj8 = obj16;
                                }
                            }
                        } else {
                            i = i33;
                        }
                    }
                    kotlin.jvm.internal.m.b(obj8);
                    int i38 = ((AbstractC1933J) obj8).f18665r;
                    W0.l lVar2 = W0.l.f8022q;
                    if (i28 != 0) {
                        if (i28 != 2 && i28 != 3) {
                            iG2 = (iH - i) / 2;
                        } else if (t7.getLayoutDirection() == lVar2) {
                            iG3 = t7.G(z0.f3690a);
                            iG2 = (iH - iG3) - i;
                        } else {
                            iG2 = t7.G(z0.f3690a);
                        }
                        c0231t = new C0231t(iG2, i38);
                    } else if (t7.getLayoutDirection() == lVar2) {
                        iG2 = t7.G(z0.f3690a);
                        c0231t = new C0231t(iG2, i38);
                    } else {
                        iG3 = t7.G(z0.f3690a);
                        iG2 = (iH - iG3) - i;
                        c0231t = new C0231t(iG2, i38);
                    }
                }
                List listH4 = t7.H(A0.f3280u, new X.e(-2146438447, true, new A.e0(7, (B5.e) this.f3642w)));
                ArrayList arrayList7 = new ArrayList(listH4.size());
                int size4 = listH4.size();
                for (int i39 = 0; i39 < size4; i39++) {
                    arrayList7.add(((InterfaceC1925B) listH4.get(i39)).a(jA));
                }
                if (arrayList7.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList7.get(0);
                    int i40 = ((AbstractC1933J) obj6).f18665r;
                    int iU6 = AbstractC0836n2.u(arrayList7);
                    if (1 <= iU6) {
                        Object obj18 = obj6;
                        int i41 = 1;
                        while (true) {
                            Object obj19 = arrayList7.get(i41);
                            Object obj20 = obj18;
                            int i42 = ((AbstractC1933J) obj19).f18665r;
                            if (i40 < i42) {
                                i40 = i42;
                                obj18 = obj19;
                            } else {
                                obj18 = obj20;
                            }
                            if (i41 != iU6) {
                                i41++;
                            } else {
                                obj6 = obj18;
                            }
                        }
                    }
                }
                AbstractC1933J abstractC1933J4 = (AbstractC1933J) obj6;
                Integer numValueOf2 = abstractC1933J4 != null ? Integer.valueOf(abstractC1933J4.f18665r) : null;
                if (c0231t != null) {
                    int i43 = c0231t.f3617b;
                    if (numValueOf2 == null || i28 == 3) {
                        iG = t7.G(z0.f3690a) + i43;
                        iB = w6.b(t7);
                    } else {
                        iG = numValueOf2.intValue() + i43;
                        iB = t7.G(z0.f3690a);
                    }
                    numValueOf = Integer.valueOf(iB + iG);
                } else {
                    numValueOf = null;
                }
                int iIntValue2 = i27 != 0 ? i27 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : w6.b(t7)) : 0;
                C0231t c0231t2 = c0231t;
                List listH5 = t7.H(A0.f3277r, new X.e(-1213360416, true, new v0((A.W) this.f3643x, t7, arrayList3, i13, arrayList7, numValueOf2, this.f3638s)));
                ArrayList arrayList8 = new ArrayList(listH5.size());
                int size5 = listH5.size();
                int i44 = 0;
                while (i44 < size5) {
                    arrayList8.add(((InterfaceC1925B) listH5.get(i44)).a(jA));
                    i44++;
                    iIntValue2 = iIntValue2;
                }
                return t7.f(iH, iG4, n5.t.f15300q, new x0(arrayList8, arrayList3, arrayList6, arrayList7, c0231t2, iH, i24, (A.W) this.f3643x, t7, iG4, iIntValue2, numValueOf2, arrayList4, numValueOf));
            default:
                ((Number) obj2).intValue();
                androidx.compose.animation.a.a((u.v0) this.f3639t, (InterfaceC0725m) this.f3640u, (B5.c) this.f3641v, (C0717e) this.f3642w, (B5.c) this.f3643x, this.f3638s, (C0371o) obj, C0345b.w(this.f3637r | 1));
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(A.W w3, z0.T t6, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, X.e eVar) {
        super(2);
        this.f3639t = w3;
        this.f3640u = t6;
        this.f3641v = arrayList;
        this.f3637r = i;
        this.f3642w = arrayList2;
        this.f3643x = num;
        this.f3638s = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(B5.e eVar, B5.e eVar2, B5.e eVar3, int i, A.W w3, B5.e eVar4, X.e eVar5) {
        super(2);
        this.f3639t = eVar;
        this.f3640u = eVar2;
        this.f3641v = eVar3;
        this.f3637r = i;
        this.f3643x = w3;
        this.f3642w = eVar4;
        this.f3638s = eVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u.v0 v0Var, InterfaceC0725m interfaceC0725m, B5.c cVar, C0717e c0717e, B5.c cVar2, X.e eVar, int i) {
        super(2);
        this.f3639t = v0Var;
        this.f3640u = interfaceC0725m;
        this.f3641v = cVar;
        this.f3642w = c0717e;
        this.f3643x = cVar2;
        this.f3638s = eVar;
        this.f3637r = i;
    }
}
