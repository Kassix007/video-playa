package M5;

import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends T5.i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3809s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(int i) {
        super(false, 0L);
        this.f3809s = i;
    }

    public abstract InterfaceC1524c c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Throwable d(Object obj) {
        C0255p c0255p = obj instanceof C0255p ? (C0255p) obj : null;
        if (c0255p != null) {
            return c0255p.f3878a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Throwable th) {
        AbstractC0263y.p(new A5.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1524c interfaceC1524cC = c();
            kotlin.jvm.internal.m.c(interfaceC1524cC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            R5.g gVar = (R5.g) interfaceC1524cC;
            InterfaceC1524c interfaceC1524c = gVar.f7239u;
            Object obj = gVar.f7241w;
            InterfaceC1529h context = interfaceC1524c.getContext();
            Object objN = R5.b.n(context, obj);
            InterfaceC0241b0 interfaceC0241b0 = null;
            y0 y0VarA = objN != R5.b.f7229d ? AbstractC0263y.A(interfaceC1524c, context, objN) : null;
            try {
                InterfaceC1529h context2 = interfaceC1524c.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i = this.f3809s;
                    boolean z5 = true;
                    if (i != 1 && i != 2) {
                        z5 = false;
                    }
                    if (z5) {
                        interfaceC0241b0 = (InterfaceC0241b0) context2.get(C0258t.f3885r);
                    }
                }
                if (interfaceC0241b0 != null && !interfaceC0241b0.b()) {
                    CancellationException cancellationExceptionV = interfaceC0241b0.v();
                    b(cancellationExceptionV);
                    interfaceC1524c.resumeWith(AbstractC1362a.b(cancellationExceptionV));
                } else if (thD != null) {
                    interfaceC1524c.resumeWith(AbstractC1362a.b(thD));
                } else {
                    interfaceC1524c.resumeWith(e(objH));
                }
                if (y0VarA == null || y0VarA.f0()) {
                    R5.b.g(context, objN);
                }
            } catch (Throwable th) {
                if (y0VarA == null || y0VarA.f0()) {
                    R5.b.g(context, objN);
                }
                throw th;
            }
        } catch (D e7) {
            AbstractC0263y.p(e7.f3807q, c().getContext());
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
