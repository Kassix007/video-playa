package q2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: q2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1497b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15934a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1497b(Class cls, String str, int i) {
        super(cls, str);
        this.f15934a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f15934a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(x.f16005a.x((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f15934a) {
            case 0:
                C1500e c1500e = (C1500e) obj;
                PointF pointF = (PointF) obj2;
                c1500e.getClass();
                c1500e.f15937a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c1500e.f15938b = iRound;
                int i = c1500e.f + 1;
                c1500e.f = i;
                if (i == c1500e.f15942g) {
                    x.a(c1500e.f15941e, c1500e.f15937a, iRound, c1500e.f15939c, c1500e.f15940d);
                    c1500e.f = 0;
                    c1500e.f15942g = 0;
                }
                break;
            case 1:
                C1500e c1500e2 = (C1500e) obj;
                PointF pointF2 = (PointF) obj2;
                c1500e2.getClass();
                c1500e2.f15939c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c1500e2.f15940d = iRound2;
                int i7 = c1500e2.f15942g + 1;
                c1500e2.f15942g = i7;
                if (c1500e2.f == i7) {
                    x.a(c1500e2.f15941e, c1500e2.f15937a, c1500e2.f15938b, c1500e2.f15939c, iRound2);
                    c1500e2.f = 0;
                    c1500e2.f15942g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                x.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                x.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                x.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                x.f16005a.K((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
