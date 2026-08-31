package j0;

import android.graphics.Paint;
import android.graphics.Shader;
import i0.C1133e;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1145B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Shader f13715e;
    public long f = 9205357640488583168L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shader f13716g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(Shader shader) {
        this.f13716g = shader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.AbstractC1145B
    public final void h(float f, long j, W1.d dVar) {
        Shader shader = this.f13715e;
        if (shader == null || !C1133e.a(this.f, j)) {
            if (C1133e.e(j)) {
                shader = null;
                this.f13715e = null;
                this.f = 9205357640488583168L;
            } else {
                shader = this.f13716g;
                this.f13715e = shader;
                this.f = j;
            }
        }
        long jB = AbstractC1145B.b(((Paint) dVar.f8044b).getColor());
        long j7 = o.f13718b;
        if (!o.c(jB, j7)) {
            dVar.e(j7);
        }
        if (!kotlin.jvm.internal.m.a((Shader) dVar.f8045c, shader)) {
            dVar.g(shader);
        }
        if (((Paint) dVar.f8044b).getAlpha() / 255.0f == f) {
            return;
        }
        dVar.c(f);
    }
}
