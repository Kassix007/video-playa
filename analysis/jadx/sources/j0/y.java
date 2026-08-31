package j0;

import i0.C1131c;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC1145B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1131c f13731e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(C1131c c1131c) {
        this.f13731e = c1131c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return kotlin.jvm.internal.m.a(this.f13731e, ((y) obj).f13731e);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13731e.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.AbstractC1145B
    public final C1131c l() {
        return this.f13731e;
    }
}
