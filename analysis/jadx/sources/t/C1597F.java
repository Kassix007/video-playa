package t;

import u.z0;

/* JADX INFO: renamed from: t.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1597F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f16583a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1597F(z0 z0Var) {
        this.f16583a = z0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1597F)) {
            return false;
        }
        C1597F c1597f = (C1597F) obj;
        c1597f.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && this.f16583a.equals(c1597f.f16583a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16583a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f16583a + ')';
    }
}
