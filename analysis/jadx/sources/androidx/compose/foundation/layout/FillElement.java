package androidx.compose.foundation.layout;

import A.A;
import A.EnumC0026x;
import B0.AbstractC0036d0;
import c0.AbstractC0724l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC0026x f9262q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FillElement(EnumC0026x enumC0026x) {
        this.f9262q = enumC0026x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.f9262q == ((FillElement) obj).f9262q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        A a7 = new A();
        a7.f0E = this.f9262q;
        a7.f1F = 1.0f;
        return a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        A a7 = (A) abstractC0724l;
        a7.f0E = this.f9262q;
        a7.f1F = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.f9262q.hashCode() * 31);
    }
}
