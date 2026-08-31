package M5;

import m5.C1371j;
import q5.C1525d;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends R5.r {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ThreadLocal f3908u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public y0(InterfaceC1524c interfaceC1524c, InterfaceC1529h interfaceC1529h) {
        z0 z0Var = z0.f3911q;
        super(interfaceC1524c, interfaceC1529h.get(z0Var) == null ? interfaceC1529h.plus(z0Var) : interfaceC1529h);
        this.f3908u = new ThreadLocal();
        if (interfaceC1524c.getContext().get(C1525d.f16021q) instanceof AbstractC0257s) {
            return;
        }
        Object objN = R5.b.n(interfaceC1529h, null);
        R5.b.g(interfaceC1529h, objN);
        h0(interfaceC1529h, objN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.r
    public final void e0() {
        g0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f0() {
        boolean z5 = this.threadLocalIsSet && this.f3908u.get() == null;
        this.f3908u.remove();
        return !z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0() {
        if (this.threadLocalIsSet) {
            C1371j c1371j = (C1371j) this.f3908u.get();
            if (c1371j != null) {
                R5.b.g((InterfaceC1529h) c1371j.f15080q, c1371j.f15081r);
            }
            this.f3908u.remove();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h0(InterfaceC1529h interfaceC1529h, Object obj) {
        this.threadLocalIsSet = true;
        this.f3908u.set(new C1371j(interfaceC1529h, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.r, M5.i0
    public final void p(Object obj) {
        g0();
        Object objV = AbstractC0263y.v(obj);
        InterfaceC1524c interfaceC1524c = this.f7266t;
        InterfaceC1529h context = interfaceC1524c.getContext();
        Object objN = R5.b.n(context, null);
        y0 y0VarA = objN != R5.b.f7229d ? AbstractC0263y.A(interfaceC1524c, context, objN) : null;
        try {
            interfaceC1524c.resumeWith(objV);
            if (y0VarA == null || y0VarA.f0()) {
                R5.b.g(context, objN);
            }
        } catch (Throwable th) {
            if (y0VarA == null || y0VarA.f0()) {
                R5.b.g(context, objN);
            }
            throw th;
        }
    }
}
