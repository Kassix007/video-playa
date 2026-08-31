package t;

import java.util.LinkedHashMap;
import u.A0;
import u.AbstractC1644d;
import u.C1649f0;
import u.z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f16656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1649f0 f16657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1649f0 f16658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1649f0 f16659d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        v vVar = v.f16646r;
        v vVar2 = v.f16647s;
        Z.m mVar = A0.f16746a;
        f16656a = new Z.m(26, vVar, vVar2, false);
        f16657b = AbstractC1644d.o(5, null);
        long j = 1;
        long j7 = (j & 4294967295L) | (j << 32);
        f16658c = AbstractC1644d.o(1, new W0.i(j7));
        f16659d = AbstractC1644d.o(1, new W0.k(j7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1595D a(z0 z0Var) {
        return new C1595D(new L(new C1597F(z0Var), (D5.a) null, (LinkedHashMap) null, 62));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1596E b(z0 z0Var) {
        return new C1596E(new L(new C1597F(z0Var), (D5.a) null, (LinkedHashMap) null, 62));
    }
}
