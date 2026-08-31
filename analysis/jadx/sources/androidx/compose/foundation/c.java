package androidx.compose.foundation;

import F.C0162p;
import P.T0;
import c0.AbstractC0727o;
import c0.C0722j;
import c0.InterfaceC0725m;
import v.P;
import v.S;
import v.V;
import y.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T0 f9255a = new T0(S.f17273r);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(i iVar, P p7) {
        C0722j c0722j = C0722j.f10095q;
        return p7 == null ? c0722j : p7 instanceof V ? new IndicationModifierElement(iVar, (V) p7) : AbstractC0727o.a(c0722j, new C0162p(2, p7, iVar));
    }
}
