package androidx.compose.ui.draw;

import B5.c;
import c0.C0714b;
import c0.C0717e;
import c0.InterfaceC0725m;
import j0.j;
import o0.AbstractC1412b;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(InterfaceC0725m interfaceC0725m, c cVar) {
        return interfaceC0725m.d(new DrawBehindElement(cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m b(InterfaceC0725m interfaceC0725m, AbstractC1412b abstractC1412b, InterfaceC1950j interfaceC1950j, float f, j jVar, int i) {
        C0717e c0717e = C0714b.f10080u;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return interfaceC0725m.d(new PainterElement(abstractC1412b, c0717e, interfaceC1950j, f, jVar));
    }
}
