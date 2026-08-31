package z0;

import B0.InterfaceC0060z;
import c0.AbstractC0724l;

/* JADX INFO: renamed from: z0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1956p extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B5.f f18699E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        return (InterfaceC1927D) this.f18699E.invoke(t6, interfaceC1925B, new W0.a(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f18699E + ')';
    }
}
