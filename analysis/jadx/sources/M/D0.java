package M;

import P.C0371o;
import P.T0;
import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T0 f3295a = new T0(C0215j.f3537A);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final j0.E a(int i, C0371o c0371o) {
        C0 c02 = (C0) c0371o.k(f3295a);
        switch (O.c.a(i)) {
            case 0:
                return c02.f3292e;
            case 1:
                return b(c02.f3292e);
            case 2:
                return c02.f3288a;
            case 3:
                return b(c02.f3288a);
            case 4:
                return H.e.f2031a;
            case 5:
                return c02.f3291d;
            case 6:
                H.d dVar = c02.f3291d;
                float f = (float) 0.0d;
                return H.d.a(dVar, new H.b(f), null, new H.b(f), 6);
            case 7:
                return b(c02.f3291d);
            case 8:
                return c02.f3290c;
            case 9:
                return AbstractC1145B.f13658a;
            case 10:
                return c02.f3289b;
            default:
                throw new C2.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final H.d b(H.d dVar) {
        float f = (float) 0.0d;
        return H.d.a(dVar, null, new H.b(f), new H.b(f), 3);
    }
}
