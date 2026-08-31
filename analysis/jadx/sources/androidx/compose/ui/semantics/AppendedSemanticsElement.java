package androidx.compose.ui.semantics;

import B0.AbstractC0036d0;
import B5.c;
import c0.AbstractC0724l;
import c0.InterfaceC0723k;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends AbstractC0036d0 implements InterfaceC0723k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f9345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f9346r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppendedSemanticsElement(c cVar, boolean z5) {
        this.f9345q = z5;
        this.f9346r = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f9345q == appendedSemanticsElement.f9345q && m.a(this.f9346r, appendedSemanticsElement.f9346r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        I0.c cVar = new I0.c();
        cVar.f2225E = this.f9345q;
        cVar.f2226F = this.f9346r;
        return cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        I0.c cVar = (I0.c) abstractC0724l;
        cVar.f2225E = this.f9345q;
        cVar.f2226F = this.f9346r;
    }

    public final int hashCode() {
        return this.f9346r.hashCode() + (Boolean.hashCode(this.f9345q) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f9345q + ", properties=" + this.f9346r + ')';
    }
}
