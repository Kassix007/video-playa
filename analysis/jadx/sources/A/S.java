package A;

import androidx.compose.foundation.layout.LayoutWeightElement;
import c0.InterfaceC0725m;

/* JADX INFO: loaded from: classes.dex */
public interface S {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static InterfaceC0725m a() {
        if (1.0f <= 0.0d) {
            B.a.a("invalid weight; must be greater than zero");
        }
        return new LayoutWeightElement(1.0f);
    }
}
