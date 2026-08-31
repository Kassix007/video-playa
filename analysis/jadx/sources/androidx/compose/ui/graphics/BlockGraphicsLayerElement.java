package androidx.compose.ui.graphics;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import B0.n0;
import B5.c;
import c0.AbstractC0724l;
import j0.k;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f9323q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BlockGraphicsLayerElement(c cVar) {
        this.f9323q = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && m.a(this.f9323q, ((BlockGraphicsLayerElement) obj).f9323q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        k kVar = new k();
        kVar.f13714E = this.f9323q;
        return kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        k kVar = (k) abstractC0724l;
        kVar.f13714E = this.f9323q;
        n0 n0Var = AbstractC0041g.s(kVar, 2).f479C;
        if (n0Var != null) {
            n0Var.U0(kVar.f13714E, true);
        }
    }

    public final int hashCode() {
        return this.f9323q.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f9323q + ')';
    }
}
