package androidx.compose.foundation;

import B0.AbstractC0036d0;
import B0.InterfaceC0048m;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import v.U;
import v.V;
import y.i;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f9242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V f9243r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IndicationModifierElement(i iVar, V v6) {
        this.f9242q = iVar;
        this.f9243r = v6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return m.a(this.f9242q, indicationModifierElement.f9242q) && m.a(this.f9243r, indicationModifierElement.f9243r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        InterfaceC0048m interfaceC0048mB = this.f9243r.b(this.f9242q);
        U u6 = new U();
        u6.f17277G = interfaceC0048mB;
        u6.x0(interfaceC0048mB);
        return u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        U u6 = (U) abstractC0724l;
        InterfaceC0048m interfaceC0048mB = this.f9243r.b(this.f9242q);
        u6.y0(u6.f17277G);
        u6.f17277G = interfaceC0048mB;
        u6.x0(interfaceC0048mB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9243r.hashCode() + (this.f9242q.hashCode() * 31);
    }
}
