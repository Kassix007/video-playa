package g3;

import android.graphics.PointF;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f13038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f13039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f13040c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1082a() {
        this.f13038a = new PointF();
        this.f13039b = new PointF();
        this.f13040c = new PointF();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        PointF pointF = this.f13040c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f13038a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f13039b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C1082a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f13038a = pointF;
        this.f13039b = pointF2;
        this.f13040c = pointF3;
    }
}
