package androidx.compose.material3.internal;

import B0.AbstractC0036d0;
import B5.e;
import N.r;
import N.u;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f9312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f9313r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DraggableAnchorsElement(r rVar, e eVar) {
        this.f9312q = rVar;
        this.f9313r = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return m.a(this.f9312q, draggableAnchorsElement.f9312q) && this.f9313r == draggableAnchorsElement.f9313r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        u uVar = new u();
        uVar.f3981E = this.f9312q;
        uVar.f3982F = this.f9313r;
        uVar.f3983G = EnumC1778d0.f17945q;
        return uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        u uVar = (u) abstractC0724l;
        uVar.f3981E = this.f9312q;
        uVar.f3982F = this.f9313r;
        uVar.f3983G = EnumC1778d0.f17945q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return EnumC1778d0.f17945q.hashCode() + ((this.f9313r.hashCode() + (this.f9312q.hashCode() * 31)) * 31);
    }
}
