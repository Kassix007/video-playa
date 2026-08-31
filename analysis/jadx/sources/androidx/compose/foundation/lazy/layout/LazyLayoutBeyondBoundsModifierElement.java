package androidx.compose.foundation.lazy.layout;

import B0.AbstractC0036d0;
import E.C0128k;
import E.C0131n;
import E.InterfaceC0132o;
import c0.AbstractC0724l;
import k1.i;
import kotlin.jvm.internal.m;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0132o f9284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0128k f9285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EnumC1778d0 f9286s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LazyLayoutBeyondBoundsModifierElement(InterfaceC0132o interfaceC0132o, C0128k c0128k, EnumC1778d0 enumC1778d0) {
        this.f9284q = interfaceC0132o;
        this.f9285r = c0128k;
        this.f9286s = enumC1778d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return m.a(this.f9284q, lazyLayoutBeyondBoundsModifierElement.f9284q) && m.a(this.f9285r, lazyLayoutBeyondBoundsModifierElement.f9285r) && this.f9286s == lazyLayoutBeyondBoundsModifierElement.f9286s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C0131n c0131n = new C0131n();
        c0131n.f1577E = this.f9284q;
        c0131n.f1578F = this.f9285r;
        c0131n.f1579G = this.f9286s;
        return c0131n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        C0131n c0131n = (C0131n) abstractC0724l;
        c0131n.f1577E = this.f9284q;
        c0131n.f1578F = this.f9285r;
        c0131n.f1579G = this.f9286s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9286s.hashCode() + i.e((this.f9285r.hashCode() + (this.f9284q.hashCode() * 31)) * 31, 31, false);
    }
}
