package j0;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: j0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1153h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f13710a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1153h(PathMeasure pathMeasure) {
        this.f13710a = pathMeasure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f, float f7, C1152g c1152g) {
        if (c1152g == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f13710a.getSegment(f, f7, c1152g.f13707a, true);
    }
}
