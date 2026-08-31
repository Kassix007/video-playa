package androidx.compose.foundation.layout;

import A.K;
import B0.AbstractC0036d0;
import W0.f;
import c0.AbstractC0724l;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f9264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f9265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f9266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f9267t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PaddingElement(float f, float f7, float f8, float f9) {
        this.f9264q = f;
        this.f9265r = f7;
        this.f9266s = f8;
        this.f9267t = f9;
        boolean z5 = true;
        boolean z6 = (f >= 0.0f || Float.isNaN(f)) & (f7 >= 0.0f || Float.isNaN(f7)) & (f8 >= 0.0f || Float.isNaN(f8));
        if (f9 < 0.0f && !Float.isNaN(f9)) {
            z5 = false;
        }
        if (!z6 || !z5) {
            B.a.a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f9264q, paddingElement.f9264q) && f.a(this.f9265r, paddingElement.f9265r) && f.a(this.f9266s, paddingElement.f9266s) && f.a(this.f9267t, paddingElement.f9267t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        K k7 = new K();
        k7.f25E = this.f9264q;
        k7.f26F = this.f9265r;
        k7.f27G = this.f9266s;
        k7.f28H = this.f9267t;
        k7.f29I = true;
        return k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        K k7 = (K) abstractC0724l;
        k7.f25E = this.f9264q;
        k7.f26F = this.f9265r;
        k7.f27G = this.f9266s;
        k7.f28H = this.f9267t;
        k7.f29I = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + i.b(this.f9267t, i.b(this.f9266s, i.b(this.f9265r, Float.hashCode(this.f9264q) * 31, 31), 31), 31);
    }
}
