package O3;

import java.util.Objects;
import java.util.concurrent.Callable;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0326u0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5088c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CallableC0326u0(C0 c02, Object obj, int i) {
        this.f5086a = i;
        this.f5088c = obj;
        this.f5087b = c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5086a) {
            case 0:
                C0 c02 = (C0) this.f5087b;
                c02.f4330c.A();
                C0305n c0305n = c02.f4330c.f4609s;
                T1.S(c0305n);
                return c0305n.l0((String) this.f5088c);
            case 1:
                C0 c03 = (C0) this.f5087b;
                c03.f4330c.A();
                return new C0290i(c03.f4330c.o0(((a2) this.f5088c).f4729q));
            default:
                a2 a2Var = (a2) this.f5088c;
                String str = a2Var.f4729q;
                AbstractC1887A.g(str);
                T1 t12 = (T1) this.f5087b;
                J0 j0A = t12.a(str);
                I0 i02 = I0.ANALYTICS_STORAGE;
                if (j0A.i(i02) && J0.c(100, a2Var.f4716I).i(i02)) {
                    return t12.a0(a2Var).E();
                }
                t12.b().f4666E.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CallableC0326u0(T1 t12, a2 a2Var) {
        this.f5086a = 2;
        this.f5088c = a2Var;
        Objects.requireNonNull(t12);
        this.f5087b = t12;
    }
}
