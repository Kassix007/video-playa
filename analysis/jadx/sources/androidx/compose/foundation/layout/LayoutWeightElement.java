package androidx.compose.foundation.layout;

import A.H;
import B0.AbstractC0036d0;
import c0.AbstractC0724l;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f9263q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutWeightElement(float f) {
        this.f9263q = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f9263q == layoutWeightElement.f9263q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        H h4 = new H();
        h4.f18E = this.f9263q;
        h4.f19F = true;
        return h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        H h4 = (H) abstractC0724l;
        h4.f18E = this.f9263q;
        h4.f19F = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.f9263q) * 31);
    }
}
