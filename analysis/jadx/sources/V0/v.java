package v0;

import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.O1;
import i0.C1130b;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f17496a = new StackTraceElement[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(C1743l c1743l) {
        return !c1743l.f17466h && c1743l.f17463d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(C1743l c1743l) {
        return (c1743l.b() || !c1743l.f17466h || c1743l.f17463d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(C1743l c1743l) {
        return c1743l.f17466h && !c1743l.f17463d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(C1743l c1743l, long j, long j7) {
        int i = c1743l.i == 1 ? 1 : 0;
        long j8 = c1743l.f17462c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32)) * f;
        float f7 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f;
        return (fIntBitsToFloat > f7) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(C1743l c1743l, boolean z5) {
        long jD = C1130b.d(c1743l.f17462c, c1743l.f17465g);
        if (z5 || !c1743l.b()) {
            return jD;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(C1737f c1737f, long j, B5.c cVar, boolean z5) {
        O1 o12 = c1737f.f17452b;
        MotionEvent motionEvent = o12 != null ? (MotionEvent) ((Z.m) o12.f10681c).f8313s : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z5) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i7));
        cVar.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i7));
        motionEvent.setAction(action);
    }
}
