package coil.compose;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import c0.AbstractC0724l;
import c0.C0717e;
import i0.C1133e;
import k1.i;
import kotlin.jvm.internal.m;
import o0.AbstractC1412b;
import u2.C1693n;
import u2.s;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
public final class ContentPainterElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1412b f10266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0717e f10267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1950j f10268s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContentPainterElement(C1693n c1693n, C0717e c0717e, InterfaceC1950j interfaceC1950j) {
        this.f10266q = c1693n;
        this.f10267r = c0717e;
        this.f10268s = interfaceC1950j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return m.a(this.f10266q, contentPainterElement.f10266q) && m.a(this.f10267r, contentPainterElement.f10267r) && m.a(this.f10268s, contentPainterElement.f10268s) && Float.compare(1.0f, 1.0f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        s sVar = new s();
        sVar.f17185E = this.f10266q;
        sVar.f17186F = this.f10267r;
        sVar.f17187G = this.f10268s;
        sVar.f17188H = 1.0f;
        return sVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        s sVar = (s) abstractC0724l;
        long jH = sVar.f17185E.h();
        AbstractC1412b abstractC1412b = this.f10266q;
        boolean zA = C1133e.a(jH, abstractC1412b.h());
        sVar.f17185E = abstractC1412b;
        sVar.f17186F = this.f10267r;
        sVar.f17187G = this.f10268s;
        sVar.f17188H = 1.0f;
        if (!zA) {
            AbstractC0041g.m(sVar);
        }
        AbstractC0041g.l(sVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return i.b(1.0f, (this.f10268s.hashCode() + ((this.f10267r.hashCode() + (this.f10266q.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f10266q + ", alignment=" + this.f10267r + ", contentScale=" + this.f10268s + ", alpha=1.0, colorFilter=null)";
    }
}
