package H;

import i0.C1133e;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2026a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(float f) {
        this.f2026a = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC1923a.a("The percent should be in the range of [0, 100]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H.a
    public final float a(long j, W0.c cVar) {
        return (this.f2026a / 100.0f) * C1133e.c(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f2026a, ((c) obj).f2026a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f2026a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f2026a + "%)";
    }
}
