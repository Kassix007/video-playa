package j0;

import i0.C1131c;
import i0.C1132d;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC1145B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1132d f13732e;
    public final C1152g f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(C1132d c1132d) {
        C1152g c1152gA;
        this.f13732e = c1132d;
        if (l6.d.w(c1132d)) {
            c1152gA = null;
        } else {
            c1152gA = i.a();
            InterfaceC1144A.a(c1152gA, c1132d);
        }
        this.f = c1152gA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return kotlin.jvm.internal.m.a(this.f13732e, ((z) obj).f13732e);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13732e.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.AbstractC1145B
    public final C1131c l() {
        C1132d c1132d = this.f13732e;
        return new C1131c(c1132d.f13526a, c1132d.f13527b, c1132d.f13528c, c1132d.f13529d);
    }
}
