package j0;

import android.graphics.Path;
import android.graphics.RectF;
import i0.C1132d;

/* JADX INFO: renamed from: j0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1144A {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void a(InterfaceC1144A interfaceC1144A, C1132d c1132d) {
        C1152g c1152g = (C1152g) interfaceC1144A;
        if (c1152g.f13708b == null) {
            c1152g.f13708b = new RectF();
        }
        RectF rectF = c1152g.f13708b;
        kotlin.jvm.internal.m.b(rectF);
        float f = c1132d.f13526a;
        long j = c1132d.f13532h;
        long j7 = c1132d.f13531g;
        long j8 = c1132d.f;
        long j9 = c1132d.f13530e;
        rectF.set(f, c1132d.f13527b, c1132d.f13528c, c1132d.f13529d);
        if (c1152g.f13709c == null) {
            c1152g.f13709c = new float[8];
        }
        float[] fArr = c1152g.f13709c;
        kotlin.jvm.internal.m.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c1152g.f13707a;
        RectF rectF2 = c1152g.f13708b;
        kotlin.jvm.internal.m.b(rectF2);
        float[] fArr2 = c1152g.f13709c;
        kotlin.jvm.internal.m.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }
}
