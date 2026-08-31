package androidx.compose.foundation;

import A.b0;
import F.C0161o;
import I0.f;
import Q2.g;
import a.AbstractC0597a;
import android.view.KeyEvent;
import c0.AbstractC0727o;
import c0.C0722j;
import c0.InterfaceC0725m;
import j0.E;
import v.AbstractC1730z;
import v.C1717l;
import v.M;
import v.P;
import v.V;
import w.A0;
import w.EnumC1778d0;
import w.I;
import y.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(InterfaceC0725m interfaceC0725m, long j, E e7) {
        return interfaceC0725m.d(new BackgroundElement(j, e7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m b(InterfaceC0725m interfaceC0725m, i iVar, P p7, boolean z5, f fVar, B5.a aVar) {
        InterfaceC0725m interfaceC0725mA;
        if (p7 instanceof V) {
            interfaceC0725mA = new ClickableElement(iVar, (V) p7, z5, fVar, aVar);
        } else if (p7 == null) {
            interfaceC0725mA = new ClickableElement(iVar, null, z5, fVar, aVar);
        } else if (iVar != null) {
            interfaceC0725mA = c.a(iVar, p7).d(new ClickableElement(iVar, null, z5, fVar, aVar));
        } else {
            interfaceC0725mA = AbstractC0727o.a(C0722j.f10095q, new b(p7, z5, fVar, aVar));
        }
        return interfaceC0725m.d(interfaceC0725mA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ InterfaceC0725m c(InterfaceC0725m interfaceC0725m, i iVar, P p7, boolean z5, f fVar, B5.a aVar, int i) {
        if ((i & 4) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i & 16) != 0) {
            fVar = null;
        }
        return b(interfaceC0725m, iVar, p7, z6, fVar, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m d(InterfaceC0725m interfaceC0725m, B5.a aVar) {
        return AbstractC0727o.a(interfaceC0725m, new b0(3, aVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(KeyEvent keyEvent) {
        long jD = g.d(keyEvent.getKeyCode());
        if (t0.a.a(jD, t0.a.f) ? true : t0.a.a(jD, t0.a.i) ? true : t0.a.a(jD, t0.a.f16669m)) {
            return true;
        }
        return t0.a.a(jD, t0.a.f16666h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m f(InterfaceC0725m interfaceC0725m, A0 a02, EnumC1778d0 enumC1778d0, boolean z5, I i, i iVar, C1717l c1717l, C0161o c0161o) {
        float f = AbstractC1730z.f17424a;
        EnumC1778d0 enumC1778d02 = EnumC1778d0.f17945q;
        C0722j c0722j = C0722j.f10095q;
        return interfaceC0725m.d(enumC1778d0 == enumC1778d02 ? AbstractC0597a.n(c0722j, M.f17261t) : AbstractC0597a.n(c0722j, M.f17259r)).d(new ScrollingContainerElement(c1717l, c0161o, i, enumC1778d0, a02, iVar, z5));
    }
}
