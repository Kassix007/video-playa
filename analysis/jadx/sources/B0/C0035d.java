package B0;

import E.C0122e;
import M5.C0247h;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import c0.AbstractC0724l;
import c0.InterfaceC0723k;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.P1;
import g0.InterfaceC1067a;
import h0.InterfaceC1116i;
import h0.InterfaceC1119l;
import java.util.Collection;
import java.util.HashSet;
import m5.C1386y;
import m5.InterfaceC1366e;
import r.C1548G;
import t.C1609h;
import v0.C1737f;
import v0.C1743l;
import v0.C1748q;
import v0.C1749r;
import v0.EnumC1738g;
import v0.EnumC1747p;
import y0.AbstractC1904a;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1953m;
import z0.InterfaceC1955o;

/* JADX INFO: renamed from: B0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035d extends AbstractC0724l implements InterfaceC0060z, InterfaceC0051p, A0, y0, A0.f, A0.g, w0, InterfaceC0059y, InterfaceC0052q, InterfaceC1119l, u0, InterfaceC1067a, InterfaceC0048m {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC0723k f405E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public A0.a f406F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public HashSet f407G;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final void A(I0.i iVar) {
        int i;
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) interfaceC0723k;
        I0.i iVar2 = new I0.i();
        iVar2.f2259s = appendedSemanticsElement.f9345q;
        appendedSemanticsElement.f9346r.invoke(iVar2);
        kotlin.jvm.internal.m.c(iVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C1548G c1548g = iVar.f2257q;
        if (iVar2.f2259s) {
            iVar.f2259s = true;
        }
        if (iVar2.f2260t) {
            iVar.f2260t = true;
        }
        C1548G c1548g2 = iVar2.f2257q;
        Object[] objArr = c1548g2.f16134b;
        Object[] objArr2 = c1548g2.f16135c;
        long[] jArr = c1548g2.f16133a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr[i11];
                        Object obj2 = objArr2[i11];
                        I0.s sVar = (I0.s) obj;
                        if (!c1548g.b(sVar)) {
                            c1548g.l(sVar, obj2);
                        } else if (obj2 instanceof I0.a) {
                            Object objG = c1548g.g(sVar);
                            kotlin.jvm.internal.m.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            I0.a aVar = (I0.a) objG;
                            i = i8;
                            String str = aVar.f2221a;
                            if (str == null) {
                                str = ((I0.a) obj2).f2221a;
                            }
                            InterfaceC1366e interfaceC1366e = aVar.f2222b;
                            if (interfaceC1366e == null) {
                                interfaceC1366e = ((I0.a) obj2).f2222b;
                            }
                            c1548g.l(sVar, new I0.a(str, interfaceC1366e));
                        }
                        i = i8;
                    } else {
                        i = i8;
                    }
                    j >>= i;
                    i10++;
                    i8 = i;
                }
                if (i9 != i8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0() {
        if (this.f10099D) {
            this.f407G.clear();
            ((C0.A) AbstractC0041g.v(this)).getSnapshotObserver().a(this, C0039f.f412r, new C0033c(this, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h0.InterfaceC1119l
    public final void C(InterfaceC1116i interfaceC1116i) {
        InterfaceC0723k interfaceC0723k = this.f405E;
        AbstractC1904a.b("applyFocusProperties called on wrong node");
        interfaceC0723k.getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(N n7) {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((v.T) interfaceC0723k).f17276q.a(n7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final boolean N() {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C1749r) interfaceC0723k).f17492t.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final void U() {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        t2.e eVar = ((C1749r) interfaceC0723k).f17492t;
        EnumC1747p enumC1747p = (EnumC1747p) eVar.f16685r;
        C1749r c1749r = (C1749r) eVar.f16686s;
        if (enumC1747p == EnumC1747p.f17484r) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1748q c1748q = new C1748q(c1749r, 1);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            c1748q.invoke(motionEventObtain);
            motionEventObtain.recycle();
            eVar.f16685r = EnumC1747p.f17483q;
            c1749r.f17491s = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0048m, B0.y0
    public final void a() {
        if (this.f405E instanceof C1749r) {
            U();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g0.InterfaceC1067a
    public final W0.c b() {
        return AbstractC0041g.u(this).f261N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1955o) interfaceC0723k).c(t6, interfaceC1925B, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.w0
    public final Object c0(Object obj) {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C1609h) interfaceC0723k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g0.InterfaceC1067a
    public final long d() {
        return P1.d0(AbstractC0041g.s(this, 128).f18666s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void d0() {
        AbstractC0041g.l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0074 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x007d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [B5.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // A0.f, A0.g
    public final Object e(A0.h hVar) {
        C0042g0 c0042g0;
        this.f407G.add(hVar);
        if (!this.f10100q.f10099D) {
            AbstractC1904a.b("visitAncestors called on an unattached node");
        }
        AbstractC0724l abstractC0724l = this.f10100q.f10104u;
        L lU = AbstractC0041g.u(this);
        while (lU != null) {
            if ((lU.f268U.f433e.f10103t & 32) != 0) {
                while (abstractC0724l != null) {
                    if ((abstractC0724l.f10102s & 32) != 0) {
                        ?? F6 = abstractC0724l;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof A0.f) {
                                A0.f fVar = (A0.f) F6;
                                if (fVar.h().O(hVar)) {
                                    return fVar.h().X(hVar);
                                }
                            } else if ((F6.f10102s & 32) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                                int i = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC0724l2 != null) {
                                    if ((abstractC0724l2.f10102s & 32) != 0) {
                                        i++;
                                        eVar = eVar;
                                        if (i == 1) {
                                            F6 = abstractC0724l2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar.c(F6);
                                                F6 = 0;
                                            }
                                            eVar.c(abstractC0724l2);
                                        }
                                    }
                                    abstractC0724l2 = abstractC0724l2.f10105v;
                                    F6 = F6;
                                    eVar = eVar;
                                }
                                if (i == 1) {
                                }
                            }
                            F6 = AbstractC0041g.f(eVar);
                        }
                    }
                    abstractC0724l = abstractC0724l.f10104u;
                }
            }
            lU = lU.s();
            abstractC0724l = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
        }
        return hVar.f170a.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final void e0() {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C1749r) interfaceC0723k).f17492t.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0052q
    public final void g(n0 n0Var) {
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C0122e c0122e = (C0122e) interfaceC0723k;
        if (c0122e.f1560q) {
            return;
        }
        c0122e.f1560q = true;
        C0247h c0247h = c0122e.f1561r;
        if (c0247h != null) {
            c0247h.resumeWith(C1386y.f15098a);
        }
        c0122e.f1561r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g0.InterfaceC1067a
    public final W0.l getLayoutDirection() {
        return AbstractC0041g.u(this).f262O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A0.f
    public final I1 h() {
        A0.a aVar = this.f406F;
        return aVar != null ? aVar : A0.b.f162c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        x0(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        z0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    @Override // B0.y0
    public final void t(C1737f c1737f, EnumC1738g enumC1738g, long j) {
        boolean z5;
        InterfaceC0723k interfaceC0723k = this.f405E;
        kotlin.jvm.internal.m.c(interfaceC0723k, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        t2.e eVar = ((C1749r) interfaceC0723k).f17492t;
        eVar.getClass();
        ?? r10 = c1737f.f17451a;
        C1749r c1749r = (C1749r) eVar.f16686s;
        if (c1749r.f17491s) {
            z5 = true;
            break;
        }
        int size = ((Collection) r10).size();
        for (int i = 0; i < size; i++) {
            C1743l c1743l = (C1743l) r10.get(i);
            if (v0.v.a(c1743l) || v0.v.c(c1743l)) {
                z5 = true;
                break;
            }
        }
        z5 = false;
        EnumC1747p enumC1747p = (EnumC1747p) eVar.f16685r;
        EnumC1747p enumC1747p2 = EnumC1747p.f17485s;
        EnumC1738g enumC1738g2 = EnumC1738g.f17456s;
        if (enumC1747p != enumC1747p2) {
            if (enumC1738g == EnumC1738g.f17454q && z5) {
                eVar.f(c1737f);
            }
            if (enumC1738g == enumC1738g2 && !z5) {
                eVar.f(c1737f);
            }
        }
        if (enumC1738g == enumC1738g2) {
            int size2 = ((Collection) r10).size();
            for (int i7 = 0; i7 < size2; i7++) {
                if (!v0.v.c((C1743l) r10.get(i7))) {
                    return;
                }
            }
            eVar.f16685r = EnumC1747p.f17483q;
            c1749r.f17491s = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f405E.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.u0
    public final boolean x() {
        return this.f10099D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.f10099D
            if (r0 != 0) goto L9
            java.lang.String r0 = "initializeModifier called on unattached node"
            y0.AbstractC1904a.b(r0)
        L9:
            c0.k r0 = r5.f405E
            int r1 = r5.f10102s
            r1 = r1 & 32
            if (r1 == 0) goto L89
            boolean r1 = r0 instanceof A0.c
            if (r1 == 0) goto L2d
            B0.c r1 = new B0.c
            r2 = 0
            r1.<init>(r5, r2)
            B0.t0 r2 = B0.AbstractC0041g.v(r5)
            C0.A r2 = (C0.A) r2
            r.C r2 = r2.f721J0
            int r3 = r2.f(r1)
            if (r3 < 0) goto L2a
            goto L2d
        L2a:
            r2.a(r1)
        L2d:
            boolean r1 = r0 instanceof A.F
            if (r1 == 0) goto L89
            r1 = r0
            A.F r1 = (A.F) r1
            A0.a r2 = r5.f406F
            if (r2 == 0) goto L5d
            r1.getClass()
            A0.h r3 = A.c0.f89a
            boolean r4 = r2.O(r3)
            if (r4 == 0) goto L5d
            r2.f161c = r1
            B0.t0 r1 = B0.AbstractC0041g.v(r5)
            C0.A r1 = (C0.A) r1
            A0.e r1 = r1.getModifierLocalManager()
            R.e r2 = r1.f166b
            r2.c(r5)
            R.e r2 = r1.f167c
            r2.c(r3)
            r1.a()
            goto L89
        L5d:
            A0.a r2 = new A0.a
            r3 = 1
            r2.<init>(r3)
            r2.f161c = r1
            r5.f406F = r2
            boolean r2 = B0.AbstractC0041g.d(r5)
            if (r2 == 0) goto L89
            B0.t0 r2 = B0.AbstractC0041g.v(r5)
            C0.A r2 = (C0.A) r2
            A0.e r2 = r2.getModifierLocalManager()
            r1.getClass()
            A0.h r1 = A.c0.f89a
            R.e r3 = r2.f166b
            r3.c(r5)
            R.e r3 = r2.f167c
            r3.c(r1)
            r2.a()
        L89:
            int r1 = r5.f10102s
            r1 = r1 & 4
            r2 = 2
            if (r1 == 0) goto L99
            if (r6 != 0) goto L99
            B0.n0 r1 = B0.AbstractC0041g.s(r5, r2)
            r1.I0()
        L99:
            int r1 = r5.f10102s
            r1 = r1 & r2
            if (r1 == 0) goto Lc6
            boolean r1 = B0.AbstractC0041g.d(r5)
            if (r1 == 0) goto Lb6
            B0.n0 r1 = r5.f10107x
            kotlin.jvm.internal.m.b(r1)
            r3 = r1
            B0.B r3 = (B0.B) r3
            r3.X0(r5)
            B0.s0 r1 = r1.f498V
            if (r1 == 0) goto Lb6
            r1.invalidate()
        Lb6:
            if (r6 != 0) goto Lc6
            B0.n0 r6 = B0.AbstractC0041g.s(r5, r2)
            r6.I0()
            B0.L r6 = B0.AbstractC0041g.u(r5)
            r6.C()
        Lc6:
            boolean r6 = r0 instanceof C.x
            if (r6 == 0) goto Led
            r6 = r0
            C.x r6 = (C.x) r6
            B0.L r1 = B0.AbstractC0041g.u(r5)
            int r2 = r6.f692q
            switch(r2) {
                case 0: goto Le7;
                case 1: goto Le0;
                default: goto Ld6;
            }
        Ld6:
            w.A0 r6 = r6.f693r
            F.N r6 = (F.N) r6
            P.f0 r6 = r6.f1838x
            r6.setValue(r1)
            goto Led
        Le0:
            w.A0 r6 = r6.f693r
            D.y r6 = (D.y) r6
            r6.j = r1
            goto Led
        Le7:
            w.A0 r6 = r6.f693r
            C.A r6 = (C.A) r6
            r6.j = r1
        Led:
            int r6 = r5.f10102s
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L104
            boolean r6 = r0 instanceof E.C0122e
            if (r6 == 0) goto L104
            boolean r6 = B0.AbstractC0041g.d(r5)
            if (r6 == 0) goto L104
            B0.L r6 = B0.AbstractC0041g.u(r5)
            r6.C()
        L104:
            int r6 = r5.f10102s
            r1 = r6 & 16
            if (r1 == 0) goto L116
            boolean r1 = r0 instanceof v0.C1749r
            if (r1 == 0) goto L116
            v0.r r0 = (v0.C1749r) r0
            t2.e r0 = r0.f17492t
            B0.n0 r1 = r5.f10107x
            r0.f16684q = r1
        L116:
            r6 = r6 & 8
            if (r6 == 0) goto L123
            B0.t0 r6 = B0.AbstractC0041g.v(r5)
            C0.A r6 = (C0.A) r6
            r6.H()
        L123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0035d.x0(boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0() {
        InterfaceC0723k interfaceC0723k = this.f405E;
        AbstractC1904a.b("onFocusEvent called on wrong node");
        interfaceC0723k.getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z0() {
        if (!this.f10099D) {
            AbstractC1904a.b("unInitializeModifier called on unattached node");
        }
        InterfaceC0723k interfaceC0723k = this.f405E;
        if ((this.f10102s & 32) != 0) {
            if (interfaceC0723k instanceof A.F) {
                A0.e modifierLocalManager = ((C0.A) AbstractC0041g.v(this)).getModifierLocalManager();
                ((A.F) interfaceC0723k).getClass();
                A0.h hVar = A.c0.f89a;
                modifierLocalManager.f168d.c(AbstractC0041g.u(this));
                modifierLocalManager.f169e.c(hVar);
                modifierLocalManager.a();
            }
            if (interfaceC0723k instanceof A0.c) {
                ((A0.c) interfaceC0723k).e(AbstractC0041g.f427a);
            }
        }
        if ((this.f10102s & 8) != 0) {
            ((C0.A) AbstractC0041g.v(this)).H();
        }
    }

    @Override // B0.InterfaceC0059y
    public final void j0(InterfaceC1953m interfaceC1953m) {
    }

    @Override // B0.InterfaceC0059y
    public final void q(long j) {
    }
}
