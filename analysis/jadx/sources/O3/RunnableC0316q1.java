package O3;

import java.util.Objects;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0316q1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a2 f5027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f5028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0333w1 f5029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC1915a f5030u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0316q1(C0333w1 c0333w1, a2 a2Var, boolean z5, AbstractC1915a abstractC1915a, int i) {
        this.f5026q = i;
        this.f5027r = a2Var;
        this.f5028s = z5;
        this.f5030u = abstractC1915a;
        this.f5029t = c0333w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f5026q) {
            case 0:
                C0333w1 c0333w1 = this.f5029t;
                I i = c0333w1.f5109u;
                if (i != null) {
                    c0333w1.G(i, this.f5028s ? null : (V1) this.f5030u, this.f5027r);
                    c0333w1.B();
                } else {
                    X x6 = ((C0323t0) c0333w1.f4346r).f5077v;
                    C0323t0.l(x6);
                    x6.f4670w.b("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                C0333w1 c0333w12 = this.f5029t;
                I i7 = c0333w12.f5109u;
                if (i7 != null) {
                    c0333w12.G(i7, this.f5028s ? null : (C0328v) this.f5030u, this.f5027r);
                    c0333w12.B();
                } else {
                    X x7 = ((C0323t0) c0333w12.f4346r).f5077v;
                    C0323t0.l(x7);
                    x7.f4670w.b("Discarding data. Failed to send event to service");
                }
                break;
            default:
                C0333w1 c0333w13 = this.f5029t;
                I i8 = c0333w13.f5109u;
                if (i8 != null) {
                    c0333w13.G(i8, this.f5028s ? null : (C0278e) this.f5030u, this.f5027r);
                    c0333w13.B();
                } else {
                    X x8 = ((C0323t0) c0333w13.f4346r).f5077v;
                    C0323t0.l(x8);
                    x8.f4670w.b("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0316q1(C0333w1 c0333w1, a2 a2Var, boolean z5, C0278e c0278e) {
        this.f5026q = 2;
        this.f5027r = a2Var;
        this.f5028s = z5;
        this.f5030u = c0278e;
        Objects.requireNonNull(c0333w1);
        this.f5029t = c0333w1;
    }
}
