package A;

import androidx.compose.foundation.layout.LayoutWeightElement;
import c0.InterfaceC0725m;

/* JADX INFO: renamed from: A.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0023u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0023u f149a = new C0023u();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m a(InterfaceC0725m interfaceC0725m) {
        if (1.0f <= 0.0d) {
            B.a.a("invalid weight; must be greater than zero");
        }
        return interfaceC0725m.d(new LayoutWeightElement(1.0f));
    }
}
