package L;

import com.google.android.gms.internal.measurement.P1;
import i0.C1130b;
import i0.C1133e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3033a = 10;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float a(W0.c cVar, boolean z5, long j) {
        float fC = C1130b.c(P1.b(C1133e.d(j), C1133e.b(j))) / 2.0f;
        return z5 ? cVar.u(f3033a) + fC : fC;
    }
}
