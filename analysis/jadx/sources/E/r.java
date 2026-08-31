package E;

import B0.InterfaceC0051p;
import c0.AbstractC0724l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0724l implements InterfaceC0051p {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f1581E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(B0.N n7) {
        ArrayList arrayList = this.f1581E.f9299h;
        if (arrayList.size() <= 0) {
            n7.a();
        } else {
            C0.S.t(arrayList.get(0));
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.m.a(this.f1581E, ((r) obj).f1581E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1581E.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        this.f1581E.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f1581E;
        bVar.d();
        bVar.f9294b = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f1581E + ')';
    }
}
