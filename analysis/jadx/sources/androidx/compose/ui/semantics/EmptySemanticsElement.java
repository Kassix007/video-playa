package androidx.compose.ui.semantics;

import B0.AbstractC0036d0;
import I0.d;
import c0.AbstractC0724l;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f9347q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EmptySemanticsElement(d dVar) {
        this.f9347q = dVar;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        return this.f9347q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final /* bridge */ /* synthetic */ void g(AbstractC0724l abstractC0724l) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
