package androidx.compose.foundation.layout;

import A.EnumC0026x;
import A.g0;
import B0.AbstractC0036d0;
import B5.e;
import c0.AbstractC0724l;
import k1.i;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC0026x f9273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f9274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f9275s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(EnumC0026x enumC0026x, e eVar, Object obj) {
        this.f9273q = enumC0026x;
        this.f9274r = (n) eVar;
        this.f9275s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f9273q == wrapContentElement.f9273q && this.f9275s.equals(wrapContentElement.f9275s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        g0 g0Var = new g0();
        g0Var.f103E = this.f9273q;
        g0Var.f104F = this.f9274r;
        return g0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        g0 g0Var = (g0) abstractC0724l;
        g0Var.f103E = this.f9273q;
        g0Var.f104F = this.f9274r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9275s.hashCode() + i.e(this.f9273q.hashCode() * 31, 31, false);
    }
}
