package B0;

import A.InterfaceC0008e;
import C0.V0;
import D.C0116a;
import E.C0136t;
import E.C0137u;
import E.InterfaceC0140x;
import M.N0;
import M.O0;
import O3.C0299l;
import P.AbstractC0373p;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import Q.C0411b;
import Q.C0418i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.P1;
import e0.ViewOnAttachStateChangeListenerC1018c;
import i0.C1130b;
import java.util.ArrayList;
import m0.C1348c;
import m5.C1386y;
import n5.AbstractC1397A;
import v0.C1743l;
import w.C1801p;
import w.InterfaceC1788i0;
import z.AbstractC1923a;
import z0.AbstractC1938O;
import z0.C1958r;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f451s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, int i7, Object obj, Object obj2) {
        super(2);
        this.f449q = i7;
        this.f450r = obj;
        this.f451s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f449q;
        C1386y c1386y = C1386y.f15098a;
        Object obj3 = this.f451s;
        Object obj4 = this.f450r;
        switch (i) {
            case 0:
                j0.m mVar = (j0.m) obj;
                C1348c c1348c = (C1348c) obj2;
                n0 n0Var = (n0) obj4;
                L l7 = n0Var.f478B;
                if (!l7.G()) {
                    n0Var.f497U = true;
                } else {
                    n0Var.f494R = mVar;
                    n0Var.f493Q = c1348c;
                    v0 snapshotObserver = ((C0.A) O.a(l7)).getSnapshotObserver();
                    j0.C c7 = n0.f474W;
                    snapshotObserver.a(n0Var, C0039f.f414t, (k0) obj3);
                    n0Var.f497U = false;
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((C0.A) obj4, (B5.e) obj3, (C0371o) obj, C0345b.w(1));
                break;
            case 2:
                W0.c cVar = (W0.c) obj;
                long j = ((W0.a) obj2).f8007a;
                if (W0.a.h(j) == Integer.MAX_VALUE) {
                    AbstractC1923a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = W0.a.h(j);
                InterfaceC0008e interfaceC0008e = (InterfaceC0008e) obj3;
                int iG = cVar.G(interfaceC0008e.a());
                int i7 = ((C0116a) obj4).f1190a;
                int i8 = iH - ((i7 - 1) * iG);
                int i9 = i8 / i7;
                int i10 = i8 % i7;
                ArrayList arrayList = new ArrayList(i7);
                int i11 = 0;
                while (i11 < i7) {
                    arrayList.add(Integer.valueOf((i11 < i10 ? 1 : 0) + i9));
                    i11++;
                }
                int[] iArrA0 = n5.l.A0(arrayList);
                int[] iArr = new int[iArrA0.length];
                interfaceC0008e.c(cVar, iH, iArrA0, W0.l.f8022q, iArr);
                break;
            case 3:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0137u c0137u = (C0137u) obj4;
                C0136t c0136t = (C0136t) obj3;
                if (!c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0371o.N();
                } else {
                    InterfaceC0140x interfaceC0140x = (InterfaceC0140x) c0137u.f1590b.invoke();
                    int iD = c0136t.f1586c;
                    Object obj5 = c0136t.f1584a;
                    if ((iD >= interfaceC0140x.a() || !interfaceC0140x.b(iD).equals(obj5)) && (iD = interfaceC0140x.d(obj5)) != -1) {
                        c0136t.f1586c = iD;
                    }
                    int i12 = iD;
                    if (i12 != -1) {
                        c0371o.S(-660404355);
                        E.C.d(interfaceC0140x, c0137u.f1589a, i12, c0136t.f1584a, c0371o, 0);
                        c0371o.p(false);
                    } else {
                        c0371o.S(-660169871);
                        c0371o.p(false);
                    }
                    boolean zI = c0371o.i(c0136t);
                    Object objH = c0371o.H();
                    if (zI || objH == C0363k.f5418a) {
                        objH = new C0029a(9, c0136t);
                        c0371o.d0(objH);
                    }
                    C0345b.c(obj5, (B5.c) objH, c0371o);
                }
                break;
            case 4:
                break;
            case 5:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c0371o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0371o2.N();
                } else {
                    ((X.e) obj4).invoke((E.W) obj3, c0371o2, 0);
                }
                break;
            case 6:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                vVar.f14265q += ((InterfaceC1788i0) ((F.E) obj3).f1783b).a(fFloatValue - vVar.f14265q);
                break;
            case 7:
                C0371o c0371o3 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o3.x()) {
                    c0371o3.N();
                } else {
                    N0.a(((O0) obj4).j, (X.e) obj3, c0371o3, 0);
                }
                break;
            case 8:
                ((Number) obj2).intValue();
                N0.a((L0.F) obj4, (X.e) obj3, (C0371o) obj, C0345b.w(1));
                break;
            case 9:
                float fFloatValue2 = ((Number) obj).floatValue();
                float fFloatValue3 = ((Number) obj2).floatValue();
                N.r rVar = ((N.o) obj4).f3963a;
                rVar.j.f(fFloatValue2);
                rVar.f3975k.f(fFloatValue3);
                ((kotlin.jvm.internal.v) obj3).f14265q = fFloatValue2;
                break;
            case 10:
                int iIntValue3 = ((Number) obj).intValue();
                I0.m mVar2 = (I0.m) obj2;
                ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c = (ViewOnAttachStateChangeListenerC1018c) obj3;
                if (!((V0) obj4).f938b.b(mVar2.f2270g)) {
                    viewOnAttachStateChangeListenerC1018c.m(iIntValue3, mVar2);
                    viewOnAttachStateChangeListenerC1018c.f12492x.j(c1386y);
                }
                break;
            case 11:
                ((Number) obj2).intValue();
                ((u.v0) obj4).a(C0345b.w(1), (C0371o) obj, obj3);
                break;
            case 12:
                ((Number) obj2).intValue();
                AbstractC1397A.b((InterfaceC0725m) obj4, (B5.c) obj3, (C0371o) obj, C0345b.w(1));
                break;
            case 13:
                long j7 = ((C1130b) obj2).f13520a;
                P1.d((C0299l) obj4, (C1743l) obj);
                O5.e eVar = ((w.C) obj3).f17748K;
                if (eVar != null) {
                    eVar.j(new C1801p(j7));
                }
                break;
            case 14:
                C0371o c0371o4 = (C0371o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!c0371o4.K(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    c0371o4.N();
                } else {
                    Boolean bool = (Boolean) ((C1958r) obj4).f.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    B5.e eVar2 = (B5.e) obj3;
                    c0371o4.V(bool);
                    boolean zH = c0371o4.h(zBooleanValue);
                    if (zBooleanValue) {
                        eVar2.invoke(c0371o4, 0);
                    } else {
                        if (c0371o4.f5463k != 0) {
                            AbstractC0373p.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!c0371o4.f5453O) {
                            if (zH) {
                                P.z0 z0Var = c0371o4.f5444F;
                                int i13 = z0Var.f5590g;
                                int i14 = z0Var.f5591h;
                                C0411b c0411b = c0371o4.f5450L;
                                c0411b.getClass();
                                c0411b.d(false);
                                c0411b.f6488b.f6486o.W(C0418i.f6503c);
                                AbstractC0373p.a(c0371o4.f5470r, i13, i14);
                                c0371o4.f5444F.q();
                            } else {
                                c0371o4.M();
                            }
                        }
                    }
                    if (c0371o4.f5476x && c0371o4.f5444F.i == c0371o4.f5477y) {
                        c0371o4.f5477y = -1;
                        c0371o4.f5476x = false;
                    }
                    c0371o4.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC1938O.a((InterfaceC0725m) obj4, (B5.e) obj3, (C0371o) obj, C0345b.w(1));
                break;
        }
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, Object obj, Object obj2) {
        super(2);
        this.f449q = i;
        this.f450r = obj;
        this.f451s = obj2;
    }
}
