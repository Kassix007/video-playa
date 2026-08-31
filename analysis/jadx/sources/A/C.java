package A;

import B0.w0;
import c0.AbstractC0724l;
import c0.C0715c;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0724l implements w0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0715c f2E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.w0
    public final Object c0(Object obj) {
        N n7 = obj instanceof N ? (N) obj : null;
        if (n7 == null) {
            n7 = new N();
        }
        n7.f36c = new C0025w(this.f2E);
        return n7;
    }
}
