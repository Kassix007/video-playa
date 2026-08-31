package androidx.compose.ui.viewinterop;

import B0.AbstractC0036d0;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import B0.L;
import B5.c;
import C0.AbstractC0103t0;
import C0.S;
import E.C0139w;
import P.C0345b;
import P.C0363k;
import P.C0367m;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import W0.l;
import X.d;
import Z.i;
import Z.k;
import Z0.b;
import Z0.m;
import Z0.n;
import Z0.r;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0660x;
import c0.AbstractC0724l;
import c0.AbstractC0727o;
import c0.C0722j;
import c0.InterfaceC0725m;
import g2.e;
import h0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(c cVar, InterfaceC0725m interfaceC0725m, c cVar2, C0371o c0371o, int i) {
        int i7;
        InterfaceC0660x interfaceC0660x;
        W0.c cVar3;
        InterfaceC0360i0 interfaceC0360i0;
        l lVar;
        Object obj;
        e eVar;
        Object obj2 = b.f8320u;
        c0371o.U(-180024211);
        if ((i & 6) == 0) {
            i7 = (c0371o.i(cVar) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= c0371o.g(interfaceC0725m) ? 32 : 16;
        }
        int i8 = i7 | 384;
        if ((i & 3072) == 0) {
            i8 |= c0371o.i(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= c0371o.i(cVar2) ? 16384 : 8192;
        }
        if (c0371o.K(i8 & 1, (i8 & 9363) != 9362)) {
            int i9 = c0371o.f5454P;
            InterfaceC0725m interfaceC0725mD = interfaceC0725m.d(FocusGroupPropertiesElement.f9348q);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC0036d0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj3) {
                    return obj3 == this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B0.AbstractC0036d0
                public final AbstractC0724l f() {
                    return new o(0, null, 7);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B0.AbstractC0036d0
                public final /* bridge */ /* synthetic */ void g(AbstractC0724l abstractC0724l) {
                }

                public final int hashCode() {
                    return 1739042953;
                }
            };
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD.d(focusTargetNode$FocusTargetElement).d(FocusTargetPropertiesElement.f9349q).d(focusTargetNode$FocusTargetElement));
            W0.c cVar4 = (W0.c) c0371o.k(AbstractC0103t0.f1116h);
            l lVar2 = (l) c0371o.k(AbstractC0103t0.f1120n);
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0660x interfaceC0660x2 = (InterfaceC0660x) c0371o.k(N1.a.f4029a);
            e eVar2 = (e) c0371o.k(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            c0371o.S(608635513);
            int i10 = i8 & 14;
            int i11 = c0371o.f5454P;
            Context context = (Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b);
            C0367m c0367mS = C0345b.s(c0371o);
            i iVar = (i) c0371o.k(k.f8310a);
            View view = (View) c0371o.k(AndroidCompositionLocals_androidKt.f);
            boolean zI = c0371o.i(context) | ((((i10 & 14) ^ 6) > 4 && c0371o.g(cVar)) || (i10 & 6) == 4) | c0371o.i(c0367mS) | c0371o.i(iVar) | c0371o.e(i11) | c0371o.i(view);
            Object objH = c0371o.H();
            if (zI || objH == C0363k.f5418a) {
                interfaceC0660x = interfaceC0660x2;
                cVar3 = cVar4;
                interfaceC0360i0 = interfaceC0360i0M;
                lVar = lVar2;
                obj = obj2;
                eVar = eVar2;
                Object nVar = new n(context, cVar, c0367mS, iVar, i11, view);
                c0371o.d0(nVar);
                objH = nVar;
            } else {
                interfaceC0660x = interfaceC0660x2;
                lVar = lVar2;
                cVar3 = cVar4;
                interfaceC0360i0 = interfaceC0360i0M;
                obj = obj2;
                eVar = eVar2;
            }
            B5.a aVar = (B5.a) objH;
            c0371o.O(125, 1, null, null);
            c0371o.f5469q = true;
            if (c0371o.f5453O) {
                c0371o.l(aVar);
            } else {
                c0371o.g0();
            }
            InterfaceC0046k.f452a.getClass();
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0);
            C0345b.u(m.f8370t, c0371o, interfaceC0725mC);
            C0345b.u(m.f8371u, c0371o, cVar3);
            C0345b.u(m.f8372v, c0371o, interfaceC0660x);
            C0345b.u(m.f8373w, c0371o, eVar);
            C0345b.u(m.f8374x, c0371o, lVar);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                k1.i.o(i9, c0371o, i9, c0044i);
            }
            C0345b.u(m.f8368r, c0371o, cVar2);
            C0345b.u(m.f8369s, c0371o, obj);
            c0371o.p(true);
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new d(cVar, interfaceC0725m, cVar2, i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(c cVar, InterfaceC0725m interfaceC0725m, c cVar2, C0371o c0371o, int i, int i7) {
        int i8;
        int i9;
        b bVar = b.f8320u;
        c0371o.U(-1783766393);
        if ((i & 6) == 0) {
            i8 = (c0371o.i(cVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        int i10 = i7 & 2;
        if (i10 != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            i8 |= c0371o.g(interfaceC0725m) ? 32 : 16;
        }
        int i11 = i7 & 4;
        if (i11 != 0) {
            i9 = i8 | 384;
        } else {
            i9 = i8 | (c0371o.i(cVar2) ? 256 : 128);
        }
        if (c0371o.K(i9 & 1, (i9 & 147) != 146)) {
            if (i10 != 0) {
                interfaceC0725m = C0722j.f10095q;
            }
            if (i11 != 0) {
                cVar2 = bVar;
            }
            a(cVar, interfaceC0725m, cVar2, c0371o, (i9 & 14) | 3072 | (i9 & 112) | ((i9 << 6) & 57344));
        } else {
            c0371o.N();
        }
        InterfaceC0725m interfaceC0725m2 = interfaceC0725m;
        c cVar3 = cVar2;
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0139w(cVar, interfaceC0725m2, cVar3, i, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final r c(L l7) {
        r rVar = l7.f252E;
        if (rVar != null) {
            return rVar;
        }
        throw S.i("Required value was null.");
    }
}
