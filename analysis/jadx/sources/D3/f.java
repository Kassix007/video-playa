package d3;

import android.graphics.PointF;
import com.google.android.gms.internal.measurement.I1;
import g3.C1083b;
import java.util.List;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, List list) {
        super(list);
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.e
    public final Object f(C1415a c1415a, float f) {
        int i;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(c1415a, f));
            case 1:
                Object obj2 = c1415a.f15413b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c1415a.f15414c;
                if (obj3 == null) {
                    if (c1415a.f15419k == 784923401) {
                        c1415a.f15419k = ((Integer) obj2).intValue();
                    }
                    i = c1415a.f15419k;
                } else {
                    if (c1415a.f15420l == 784923401) {
                        c1415a.f15420l = ((Integer) obj3).intValue();
                    }
                    i = c1415a.f15420l;
                }
                int i7 = i;
                Z.m mVar = this.f12234e;
                if (mVar == null || (num = (Integer) mVar.o(c1415a.f15417g, c1415a.f15418h.floatValue(), (Integer) obj2, Integer.valueOf(i7), f, d(), this.f12233d)) == null) {
                    if (c1415a.f15419k == 784923401) {
                        c1415a.f15419k = ((Integer) obj2).intValue();
                    }
                    int i8 = c1415a.f15419k;
                    PointF pointF = n3.g.f15173a;
                    iIntValue = (int) (((i7 - i8) * f) + i8);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = c1415a.f15413b;
                Z.m mVar2 = this.f12234e;
                if (mVar2 == null) {
                    return (f != 1.0f || (obj = c1415a.f15414c) == null) ? (C1083b) obj4 : (C1083b) obj;
                }
                float f7 = c1415a.f15417g;
                Float f8 = c1415a.f15418h;
                float fFloatValue = f8 == null ? Float.MAX_VALUE : f8.floatValue();
                C1083b c1083b = (C1083b) obj4;
                Object obj5 = c1415a.f15414c;
                return (C1083b) mVar2.o(f7, fFloatValue, c1083b, obj5 == null ? c1083b : (C1083b) obj5, f, c(), this.f12233d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int l(C1415a c1415a, float f) {
        float f7;
        Float f8;
        Object obj = c1415a.f15413b;
        Object obj2 = c1415a.f15413b;
        if (obj == null || c1415a.f15414c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Z.m mVar = this.f12234e;
        if (mVar == null || (f8 = c1415a.f15418h) == null) {
            f7 = f;
        } else {
            f7 = f;
            Integer num = (Integer) mVar.o(c1415a.f15417g, f8.floatValue(), (Integer) obj2, (Integer) c1415a.f15414c, f7, d(), this.f12233d);
            if (num != null) {
                return num.intValue();
            }
        }
        return I1.W(n3.g.b(f7, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) c1415a.f15414c).intValue());
    }
}
