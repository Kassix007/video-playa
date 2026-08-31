package androidx.compose.foundation.lazy.layout;

import B0.AbstractC0036d0;
import E.K;
import E.g0;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K f9292q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TraversablePrefetchStateModifierElement(K k7) {
        this.f9292q = k7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && m.a(this.f9292q, ((TraversablePrefetchStateModifierElement) obj).f9292q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        g0 g0Var = new g0();
        g0Var.f1565E = this.f9292q;
        return g0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        ((g0) abstractC0724l).f1565E = this.f9292q;
    }

    public final int hashCode() {
        return this.f9292q.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f9292q + ')';
    }
}
