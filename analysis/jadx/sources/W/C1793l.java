package w;

import M5.AbstractC0263y;
import q5.InterfaceC1524c;
import u.C1667v;

/* JADX INFO: renamed from: w.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1793l implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1667v f18020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1792k0 f18021b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1793l(C1667v c1667v) {
        C1792k0 c1792k0 = AbstractC1802p0.f18042b;
        this.f18020a = c1667v;
        this.f18021b = c1792k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.I
    public final Object a(C0 c02, float f, InterfaceC1524c interfaceC1524c) {
        return AbstractC0263y.B(this.f18021b, new C1791k(f, this, c02, null), interfaceC1524c);
    }
}
