package p3;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f15844a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15846c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t0(J j) {
        if (j == null) {
            return;
        }
        j.n(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void a(float f, float f7) {
        this.f15844a.moveTo(f, f7);
        this.f15845b = f;
        this.f15846c = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void b(float f, float f7, float f8, float f9, float f10, float f11) {
        this.f15844a.cubicTo(f, f7, f8, f9, f10, f11);
        this.f15845b = f10;
        this.f15846c = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void c(float f, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        z0.f(this.f15845b, this.f15846c, f, f7, f8, z5, z6, f9, f10, this);
        this.f15845b = f9;
        this.f15846c = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void close() {
        this.f15844a.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void d(float f, float f7, float f8, float f9) {
        this.f15844a.quadTo(f, f7, f8, f9);
        this.f15845b = f8;
        this.f15846c = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void e(float f, float f7) {
        this.f15844a.lineTo(f, f7);
        this.f15845b = f;
        this.f15846c = f7;
    }
}
