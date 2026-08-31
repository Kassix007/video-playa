package androidx.compose.ui.input.rotary;

import B0.AbstractC0036d0;
import C0.C0095p;
import c0.AbstractC0724l;
import x0.C1882a;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends AbstractC0036d0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = C0095p.f1085t;
        ((RotaryInputElement) obj).getClass();
        return obj2.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C0095p c0095p = C0095p.f1085t;
        C1882a c1882a = new C1882a();
        c1882a.f18326E = c0095p;
        return c1882a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        ((C1882a) abstractC0724l).f18326E = C0095p.f1085t;
    }

    public final int hashCode() {
        return C0095p.f1085t.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C0095p.f1085t + ", onPreRotaryScrollEvent=null)";
    }
}
