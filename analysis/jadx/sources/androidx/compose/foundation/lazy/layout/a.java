package androidx.compose.foundation.lazy.layout;

import E.C0128k;
import E.InterfaceC0132o;
import E.P;
import H5.h;
import c0.InterfaceC0725m;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(InterfaceC0132o interfaceC0132o, C0128k c0128k, EnumC1778d0 enumC1778d0) {
        return new LazyLayoutBeyondBoundsModifierElement(interfaceC0132o, c0128k, enumC1778d0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m b(InterfaceC0725m interfaceC0725m, h hVar, P p7, EnumC1778d0 enumC1778d0, boolean z5) {
        return interfaceC0725m.d(new LazyLayoutSemanticsModifier(hVar, p7, enumC1778d0, z5));
    }
}
