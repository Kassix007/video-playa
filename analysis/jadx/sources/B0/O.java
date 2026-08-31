package B0;

import com.google.android.gms.internal.measurement.I1;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0.d f298a = I1.B();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final t0 a(L l7) {
        t0 t0Var = l7.f251D;
        if (t0Var != null) {
            return t0Var;
        }
        throw C0.S.i("LayoutNode should be attached to an owner");
    }
}
