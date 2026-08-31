package R5;

import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.C0255p;
import M5.F;
import M5.S;
import M5.s0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1374m;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class g extends F implements s5.d, InterfaceC1524c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7237x = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0257s f7238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC1524c f7239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f7241w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(AbstractC0257s abstractC0257s, InterfaceC1524c interfaceC1524c) {
        super(-1);
        this.f7238t = abstractC0257s;
        this.f7239u = interfaceC1524c;
        this.f7240v = b.f7227b;
        this.f7241w = b.m(interfaceC1524c.getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.d
    public final s5.d getCallerFrame() {
        InterfaceC1524c interfaceC1524c = this.f7239u;
        if (interfaceC1524c instanceof s5.d) {
            return (s5.d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f7239u.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.F
    public final Object h() {
        Object obj = this.f7240v;
        this.f7240v = b.f7227b;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        Throwable thA = AbstractC1374m.a(obj);
        Object c0255p = thA == null ? obj : new C0255p(false, thA);
        InterfaceC1524c interfaceC1524c = this.f7239u;
        InterfaceC1529h context = interfaceC1524c.getContext();
        AbstractC0257s abstractC0257s = this.f7238t;
        if (b.j(abstractC0257s, context)) {
            this.f7240v = c0255p;
            this.f3809s = 0;
            b.i(abstractC0257s, interfaceC1524c.getContext(), this);
            return;
        }
        S sA = s0.a();
        if (sA.f3826q >= 4294967296L) {
            this.f7240v = c0255p;
            this.f3809s = 0;
            sA.b0(this);
            return;
        }
        sA.d0(true);
        try {
            InterfaceC1529h context2 = interfaceC1524c.getContext();
            Object objN = b.n(context2, this.f7241w);
            try {
                interfaceC1524c.resumeWith(obj);
                while (sA.f0()) {
                }
            } finally {
                b.g(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DispatchedContinuation[" + this.f7238t + ", " + AbstractC0263y.y(this.f7239u) + ']';
    }

    @Override // M5.F
    public final InterfaceC1524c c() {
        return this;
    }
}
