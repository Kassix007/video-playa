package A;

import B0.w0;
import c0.AbstractC0724l;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0724l implements w0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f18E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f19F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.w0
    public final Object c0(Object obj) {
        N n7 = obj instanceof N ? (N) obj : null;
        if (n7 == null) {
            n7 = new N();
        }
        n7.f34a = this.f18E;
        n7.f35b = this.f19F;
        return n7;
    }
}
