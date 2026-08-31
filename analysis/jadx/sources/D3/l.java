package d3;

import a3.C0632k;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class l extends C1415a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f12245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1415a f12246r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(C0632k c0632k, C1415a c1415a) {
        super(c0632k, (PointF) c1415a.f15413b, (PointF) c1415a.f15414c, c1415a.f15415d, c1415a.f15416e, c1415a.f, c1415a.f15417g, c1415a.f15418h);
        this.f12246r = c1415a;
        d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        Object obj;
        Object obj2 = this.f15414c;
        Object obj3 = this.f15413b;
        boolean z5 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f15414c) == null || z5) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C1415a c1415a = this.f12246r;
        PointF pointF3 = c1415a.f15423o;
        PointF pointF4 = c1415a.f15424p;
        Matrix matrix = n3.i.f15199a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f7 = pointF.y + pointF3.y;
            float f8 = pointF2.x;
            float f9 = f8 + pointF4.x;
            float f10 = pointF2.y;
            path.cubicTo(f, f7, f9, f10 + pointF4.y, f8, f10);
        }
        this.f12245q = path;
    }
}
