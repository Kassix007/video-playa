package z0;

import java.util.Map;

/* JADX INFO: renamed from: z0.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1928E extends W0.c {
    InterfaceC1927D O(int i, int i7, Map map, B5.c cVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default InterfaceC1927D f(int i, int i7, Map map, B5.c cVar) {
        return O(i, i7, map, cVar);
    }

    W0.l getLayoutDirection();

    boolean r();
}
