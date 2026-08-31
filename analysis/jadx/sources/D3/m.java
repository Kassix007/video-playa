package d3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k {
    public final PointF i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f12247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f12248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f12249m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.f12247k = new float[2];
        this.f12248l = new PathMeasure();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object f(C1415a c1415a, float f) {
        float f7;
        l lVar = (l) c1415a;
        Path path = lVar.f12245q;
        Z.m mVar = this.f12234e;
        if (mVar == null || c1415a.f15418h == null) {
            f7 = f;
        } else {
            f7 = f;
            PointF pointF = (PointF) mVar.o(lVar.f15417g, lVar.f15418h.floatValue(), (PointF) lVar.f15413b, (PointF) lVar.f15414c, d(), f7, this.f12233d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c1415a.f15413b;
        }
        l lVar2 = this.f12249m;
        PathMeasure pathMeasure = this.f12248l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f12249m = lVar;
        }
        float length = pathMeasure.getLength();
        float f8 = f7 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.f12247k;
        pathMeasure.getPosTan(f8, fArr, fArr2);
        float f9 = fArr[0];
        float f10 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f9, f10);
        if (f8 < 0.0f) {
            pointF2.offset(fArr2[0] * f8, fArr2[1] * f8);
            return pointF2;
        }
        if (f8 > length) {
            float f11 = f8 - length;
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
        }
        return pointF2;
    }
}
