package androidx.compose.ui.graphics;

import B5.c;
import c0.InterfaceC0725m;
import j0.AbstractC1145B;
import j0.E;
import j0.H;
import j0.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(InterfaceC0725m interfaceC0725m, c cVar) {
        return interfaceC0725m.d(new BlockGraphicsLayerElement(cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m b(InterfaceC0725m interfaceC0725m, float f, E e7, boolean z5, int i) {
        float f7 = (i & 4) != 0 ? 1.0f : 0.0f;
        float f8 = (i & 32) != 0 ? 0.0f : f;
        long j = H.f13693b;
        E e8 = (i & 2048) != 0 ? AbstractC1145B.f13658a : e7;
        boolean z6 = (i & 4096) != 0 ? false : z5;
        long j7 = u.f13728a;
        return interfaceC0725m.d(new GraphicsLayerElement(f7, f8, j, e8, z6, j7, j7));
    }
}
