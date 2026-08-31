package androidx.compose.ui.layout;

import B0.AbstractC0036d0;
import B5.f;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import z0.C1956p;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f9337q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutElement(f fVar) {
        this.f9337q = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && m.a(this.f9337q, ((LayoutElement) obj).f9337q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C1956p c1956p = new C1956p();
        c1956p.f18699E = this.f9337q;
        return c1956p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        ((C1956p) abstractC0724l).f18699E = this.f9337q;
    }

    public final int hashCode() {
        return this.f9337q.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f9337q + ')';
    }
}
