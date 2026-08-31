package androidx.compose.ui.layout;

import B5.f;
import Z0.c;
import c0.InterfaceC0725m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(f fVar) {
        return new LayoutElement(fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m b() {
        return new LayoutIdElement();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m c(InterfaceC0725m interfaceC0725m, c cVar) {
        return interfaceC0725m.d(new OnGloballyPositionedElement(cVar));
    }
}
