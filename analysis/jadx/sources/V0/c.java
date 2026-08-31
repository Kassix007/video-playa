package V0;

import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7921a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(long j) {
        this.f7921a = j;
        if (j != 16) {
            return;
        }
        Q0.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V0.p
    public final long a() {
        return this.f7921a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V0.p
    public final AbstractC1145B b() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V0.p
    public final float c() {
        return j0.o.d(this.f7921a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j0.o.c(this.f7921a, ((c) obj).f7921a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = j0.o.f13723h;
        return Long.hashCode(this.f7921a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColorStyle(value=" + ((Object) j0.o.i(this.f7921a)) + ')';
    }
}
