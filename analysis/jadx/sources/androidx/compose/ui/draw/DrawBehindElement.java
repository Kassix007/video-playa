package androidx.compose.ui.draw;

import B0.AbstractC0036d0;
import B5.c;
import c0.AbstractC0724l;
import g0.C1070d;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f9315q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DrawBehindElement(c cVar) {
        this.f9315q = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && m.a(this.f9315q, ((DrawBehindElement) obj).f9315q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C1070d c1070d = new C1070d();
        c1070d.f12814E = this.f9315q;
        return c1070d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        ((C1070d) abstractC0724l).f12814E = this.f9315q;
    }

    public final int hashCode() {
        return this.f9315q.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f9315q + ')';
    }
}
