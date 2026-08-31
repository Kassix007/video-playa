package androidx.compose.foundation;

import B0.AbstractC0036d0;
import H.d;
import W0.f;
import c0.AbstractC0724l;
import g0.C1068b;
import j0.G;
import kotlin.jvm.internal.m;
import v.C1726v;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f9234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final G f9235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f9236s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BorderModifierNodeElement(float f, G g7, d dVar) {
        this.f9234q = f;
        this.f9235r = g7;
        this.f9236s = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return f.a(this.f9234q, borderModifierNodeElement.f9234q) && this.f9235r.equals(borderModifierNodeElement.f9235r) && this.f9236s.equals(borderModifierNodeElement.f9236s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        return new C1726v(this.f9234q, this.f9235r, this.f9236s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        C1726v c1726v = (C1726v) abstractC0724l;
        float f = c1726v.f17398H;
        C1068b c1068b = c1726v.f17401K;
        float f7 = this.f9234q;
        if (!f.a(f, f7)) {
            c1726v.f17398H = f7;
            c1068b.x0();
        }
        G g7 = c1726v.f17399I;
        G g8 = this.f9235r;
        if (!m.a(g7, g8)) {
            c1726v.f17399I = g8;
            c1068b.x0();
        }
        d dVar = c1726v.f17400J;
        d dVar2 = this.f9236s;
        if (m.a(dVar, dVar2)) {
            return;
        }
        c1726v.f17400J = dVar2;
        c1068b.x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9236s.hashCode() + ((this.f9235r.hashCode() + (Float.hashCode(this.f9234q) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) f.b(this.f9234q)) + ", brush=" + this.f9235r + ", shape=" + this.f9236s + ')';
    }
}
