package n3;

import android.graphics.Path;
import android.graphics.PointF;
import g3.C1082a;
import i3.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f15173a = new PointF();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float b(float f, float f7, float f8) {
        return Math.max(f7, Math.min(f8, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(float f, float f7) {
        int i = (int) f;
        int i7 = (int) f7;
        int i8 = i / i7;
        int i9 = i % i7;
        if (!((i ^ i7) >= 0) && i9 != 0) {
            i8--;
        }
        return i - (i7 * i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(l lVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = lVar.f13608b;
        ArrayList arrayList = lVar.f13607a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f7 = pointF.y;
        PointF pointF2 = f15173a;
        pointF2.set(f, f7);
        int i = 0;
        while (i < arrayList.size()) {
            C1082a c1082a = (C1082a) arrayList.get(i);
            PointF pointF3 = c1082a.f13038a;
            PointF pointF4 = c1082a.f13039b;
            PointF pointF5 = c1082a.f13040c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (lVar.f13609c) {
            path3.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float f(float f, float f7, float f8) {
        return k1.i.a(f7, f, f8, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2, c3.l lVar) {
        if (eVar.a(i, lVar.getName())) {
            String name = lVar.getName();
            g3.e eVar3 = new g3.e(eVar2);
            eVar3.f13061a.add(name);
            g3.e eVar4 = new g3.e(eVar3);
            eVar4.f13062b = lVar;
            arrayList.add(eVar4);
        }
    }
}
