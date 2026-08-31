package i3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f13608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13609c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(PointF pointF, boolean z5, List list) {
        this.f13608b = pointF;
        this.f13609c = z5;
        this.f13607a = new ArrayList(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f, float f7) {
        if (this.f13608b == null) {
            this.f13608b = new PointF();
        }
        this.f13608b.set(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ShapeData{numCurves=" + this.f13607a.size() + "closed=" + this.f13609c + '}';
    }

    public l() {
        this.f13607a = new ArrayList();
    }
}
