package O3;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: O3.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0318r1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a2 f5038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0333w1 f5039s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0318r1(C0333w1 c0333w1, a2 a2Var, int i) {
        this.f5037q = i;
        this.f5038r = a2Var;
        this.f5039s = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f5037q) {
            case 0:
                C0333w1 c0333w1 = this.f5039s;
                I i = c0333w1.f5109u;
                C0323t0 c0323t0 = (C0323t0) c0333w1.f4346r;
                if (i != null) {
                    try {
                        i.l(this.f5038r);
                    } catch (RemoteException e7) {
                        X x6 = c0323t0.f5077v;
                        C0323t0.l(x6);
                        x6.f4670w.c(e7, "Failed to reset data on the service: remote exception");
                    }
                    c0333w1.B();
                } else {
                    X x7 = c0323t0.f5077v;
                    C0323t0.l(x7);
                    x7.f4670w.b("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                C0333w1 c0333w12 = this.f5039s;
                I i7 = c0333w12.f5109u;
                C0323t0 c0323t02 = (C0323t0) c0333w12.f4346r;
                if (i7 == null) {
                    X x8 = c0323t02.f5077v;
                    C0323t0.l(x8);
                    x8.f4670w.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        a2 a2Var = this.f5038r;
                        C0284g c0284g = c0323t02.f5075t;
                        E e8 = F.f4420c1;
                        if (c0284g.y(null, e8)) {
                            c0333w12.G(i7, null, a2Var);
                        }
                        i7.n(a2Var);
                        c0323t02.n().t();
                        c0323t02.f5075t.y(null, e8);
                        c0333w12.G(i7, null, a2Var);
                        c0333w12.B();
                    } catch (RemoteException e9) {
                        X x9 = c0323t02.f5077v;
                        C0323t0.l(x9);
                        x9.f4670w.c(e9, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                C0333w1 c0333w13 = this.f5039s;
                I i8 = c0333w13.f5109u;
                C0323t0 c0323t03 = (C0323t0) c0333w13.f4346r;
                if (i8 == null) {
                    X x10 = c0323t03.f5077v;
                    C0323t0.l(x10);
                    x10.f4673z.b("Failed to send app backgrounded");
                } else {
                    try {
                        i8.q(this.f5038r);
                        c0333w13.B();
                    } catch (RemoteException e10) {
                        X x11 = c0323t03.f5077v;
                        C0323t0.l(x11);
                        x11.f4670w.c(e10, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                C0333w1 c0333w14 = this.f5039s;
                I i9 = c0333w14.f5109u;
                C0323t0 c0323t04 = (C0323t0) c0333w14.f4346r;
                if (i9 == null) {
                    X x12 = c0323t04.f5077v;
                    C0323t0.l(x12);
                    x12.f4670w.b("Failed to send measurementEnabled to service");
                } else {
                    try {
                        i9.B(this.f5038r);
                        c0333w14.B();
                    } catch (RemoteException e11) {
                        X x13 = c0323t04.f5077v;
                        C0323t0.l(x13);
                        x13.f4670w.c(e11, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                C0333w1 c0333w15 = this.f5039s;
                I i10 = c0333w15.f5109u;
                C0323t0 c0323t05 = (C0323t0) c0333w15.f4346r;
                if (i10 == null) {
                    X x14 = c0323t05.f5077v;
                    C0323t0.l(x14);
                    x14.f4670w.b("Failed to send consent settings to service");
                } else {
                    try {
                        i10.F(this.f5038r);
                        c0333w15.B();
                    } catch (RemoteException e12) {
                        X x15 = c0323t05.f5077v;
                        C0323t0.l(x15);
                        x15.f4670w.c(e12, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0318r1(C0333w1 c0333w1, a2 a2Var) {
        this.f5037q = 4;
        this.f5038r = a2Var;
        Objects.requireNonNull(c0333w1);
        this.f5039s = c0333w1;
    }
}
