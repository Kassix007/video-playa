package androidx.compose.foundation.lazy.layout;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import E.P;
import E.U;
import c0.AbstractC0724l;
import k1.i;
import kotlin.jvm.internal.m;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B5.a f9288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final P f9289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EnumC1778d0 f9290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f9291t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LazyLayoutSemanticsModifier(B5.a aVar, P p7, EnumC1778d0 enumC1778d0, boolean z5) {
        this.f9288q = aVar;
        this.f9289r = p7;
        this.f9290s = enumC1778d0;
        this.f9291t = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f9288q == lazyLayoutSemanticsModifier.f9288q && m.a(this.f9289r, lazyLayoutSemanticsModifier.f9289r) && this.f9290s == lazyLayoutSemanticsModifier.f9290s && this.f9291t == lazyLayoutSemanticsModifier.f9291t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        return new U(this.f9288q, this.f9289r, this.f9290s, this.f9291t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        U u6 = (U) abstractC0724l;
        u6.f1505E = this.f9288q;
        u6.f1506F = this.f9289r;
        EnumC1778d0 enumC1778d0 = u6.f1507G;
        EnumC1778d0 enumC1778d02 = this.f9290s;
        if (enumC1778d0 != enumC1778d02) {
            u6.f1507G = enumC1778d02;
            AbstractC0041g.n(u6);
        }
        boolean z5 = u6.f1508H;
        boolean z6 = this.f9291t;
        if (z5 == z6) {
            return;
        }
        u6.f1508H = z6;
        u6.x0();
        AbstractC0041g.n(u6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + i.e((this.f9290s.hashCode() + ((this.f9289r.hashCode() + (this.f9288q.hashCode() * 31)) * 31)) * 31, 31, this.f9291t);
    }
}
