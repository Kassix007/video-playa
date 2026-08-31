package androidx.compose.foundation.layout;

import c0.InterfaceC0725m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(InterfaceC0725m interfaceC0725m, float f) {
        return interfaceC0725m.d(new PaddingElement(f, f, f, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m b(InterfaceC0725m interfaceC0725m, float f, float f7) {
        return interfaceC0725m.d(new PaddingElement(f, f7, f, f7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m c(InterfaceC0725m interfaceC0725m, float f, float f7, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f7 = 0;
        }
        return b(interfaceC0725m, f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m d(InterfaceC0725m interfaceC0725m, float f, float f7, float f8, float f9, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f7 = 0;
        }
        if ((i & 4) != 0) {
            f8 = 0;
        }
        if ((i & 8) != 0) {
            f9 = 0;
        }
        return interfaceC0725m.d(new PaddingElement(f, f7, f8, f9));
    }
}
