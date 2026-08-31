package j0;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC1145B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13692e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(long j) {
        this.f13692e = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return o.c(this.f13692e, ((G) obj).f13692e);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.AbstractC1145B
    public final void h(float f, long j, W1.d dVar) {
        dVar.c(1.0f);
        long jB = this.f13692e;
        if (f != 1.0f) {
            jB = o.b(jB, o.d(jB) * f);
        }
        dVar.e(jB);
        if (((Shader) dVar.f8045c) != null) {
            dVar.g(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = o.f13723h;
        return Long.hashCode(this.f13692e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SolidColor(value=" + ((Object) o.i(this.f13692e)) + ')';
    }
}
