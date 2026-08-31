package androidx.compose.ui.input.key;

import B0.AbstractC0036d0;
import C0.C0110x;
import c0.AbstractC0724l;
import t0.d;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0110x f9331q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public KeyInputElement(C0110x c0110x) {
        this.f9331q = c0110x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f9331q == ((KeyInputElement) obj).f9331q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        d dVar = new d();
        dVar.f16672E = this.f9331q;
        return dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        ((d) abstractC0724l).f16672E = this.f9331q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9331q.hashCode() * 31;
    }
}
