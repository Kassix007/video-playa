package d3;

import android.graphics.PointF;
import com.google.android.gms.internal.measurement.I1;
import i3.C1139d;
import java.util.List;
import o3.C1415a;
import o3.C1417c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i, List list) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new C1417c();
                break;
            default:
                int iMax = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    C1139d c1139d = (C1139d) ((C1415a) list.get(i7)).f15413b;
                    if (c1139d != null) {
                        iMax = Math.max(iMax, c1139d.f13569b.length);
                    }
                }
                this.j = new C1139d(new float[iMax], new int[iMax]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object f(C1415a c1415a, float f) {
        Object obj;
        float f7;
        switch (this.i) {
            case 0:
                C1139d c1139d = (C1139d) this.j;
                C1139d c1139d2 = (C1139d) c1415a.f15413b;
                C1139d c1139d3 = (C1139d) c1415a.f15414c;
                int[] iArr = c1139d.f13569b;
                float[] fArr = c1139d.f13568a;
                boolean zEquals = c1139d2.equals(c1139d3);
                int[] iArr2 = c1139d2.f13569b;
                if (zEquals || f <= 0.0f) {
                    c1139d.a(c1139d2);
                } else if (f >= 1.0f) {
                    c1139d.a(c1139d3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = c1139d3.f13569b;
                    if (length != iArr3.length) {
                        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + iArr2.length + " vs " + iArr3.length + ")");
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = n3.g.f(c1139d2.f13568a[i], c1139d3.f13568a[i], f);
                        iArr[i] = I1.W(f, iArr2[i], iArr3[i]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return c1139d;
            case 1:
                return l(c1415a, f, f, f);
            default:
                C1417c c1417c = (C1417c) this.j;
                Object obj2 = c1415a.f15413b;
                if (obj2 == null || (obj = c1415a.f15414c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C1417c c1417c2 = (C1417c) obj2;
                C1417c c1417c3 = (C1417c) obj;
                Z.m mVar = this.f12234e;
                if (mVar != null) {
                    f7 = f;
                    C1417c c1417c4 = (C1417c) mVar.o(c1415a.f15417g, c1415a.f15418h.floatValue(), c1417c2, c1417c3, f7, d(), this.f12233d);
                    if (c1417c4 != null) {
                        return c1417c4;
                    }
                } else {
                    f7 = f;
                }
                float f8 = n3.g.f(c1417c2.f15431a, c1417c3.f15431a, f7);
                float f9 = n3.g.f(c1417c2.f15432b, c1417c3.f15432b, f7);
                c1417c.f15431a = f8;
                c1417c.f15432b = f9;
                return c1417c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public /* bridge */ /* synthetic */ Object g(C1415a c1415a, float f, float f7, float f8) {
        switch (this.i) {
            case 1:
                return l(c1415a, f, f7, f8);
            default:
                return super.g(c1415a, f, f7, f8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PointF l(C1415a c1415a, float f, float f7, float f8) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = c1415a.f15413b;
        if (obj2 == null || (obj = c1415a.f15414c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        Z.m mVar = this.f12234e;
        if (mVar != null && (pointF = (PointF) mVar.o(c1415a.f15417g, c1415a.f15418h.floatValue(), pointF3, pointF4, f, d(), this.f12233d)) != null) {
            return pointF;
        }
        float f9 = pointF3.x;
        float fA = k1.i.a(pointF4.x, f9, f7, f9);
        float f10 = pointF3.y;
        pointF2.set(fA, k1.i.a(pointF4.y, f10, f8, f10));
        return pointF2;
    }
}
