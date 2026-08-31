package O3;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f4566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4567s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S0(C0271b1 c0271b1, long j, int i) {
        this.f4565q = i;
        switch (i) {
            case 1:
                this.f4566r = j;
                Objects.requireNonNull(c0271b1);
                this.f4567s = c0271b1;
                break;
            default:
                this.f4566r = j;
                Objects.requireNonNull(c0271b1);
                this.f4567s = c0271b1;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4565q) {
            case 0:
                C0323t0 c0323t0 = (C0323t0) this.f4567s.f4346r;
                C0288h0 c0288h0 = c0323t0.f5076u;
                C0323t0.j(c0288h0);
                C0282f0 c0282f0 = c0288h0.f4878B;
                long j = this.f4566r;
                c0282f0.b(j);
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4665D.c(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                C0271b1 c0271b1 = this.f4567s;
                c0271b1.o();
                c0271b1.p();
                C0323t0 c0323t02 = (C0323t0) c0271b1.f4346r;
                X x7 = c0323t02.f5077v;
                C0323t0.l(x7);
                x7.f4665D.b("Resetting analytics data (FE)");
                E1 e12 = c0323t02.f5079x;
                C0323t0.k(e12);
                e12.o();
                D1 d12 = e12.f4360w;
                ((C1) d12.f4349c).c();
                ((C0323t0) ((E1) d12.f4350d).f4346r).f5052A.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                d12.f4347a = jElapsedRealtime;
                d12.f4348b = jElapsedRealtime;
                c0323t02.q().t();
                boolean z5 = !c0323t02.a();
                C0288h0 c0288h02 = c0323t02.f5076u;
                C0323t0.j(c0288h02);
                c0288h02.f4896w.b(this.f4566r);
                C0323t0 c0323t03 = (C0323t0) c0288h02.f4346r;
                C0288h0 c0288h03 = c0323t03.f5076u;
                C0323t0.j(c0288h03);
                if (!TextUtils.isEmpty(c0288h03.f4889M.e())) {
                    c0288h02.f4889M.f(null);
                }
                c0288h02.f4883G.b(0L);
                c0288h02.f4884H.b(0L);
                if (!c0323t03.f5075t.B()) {
                    c0288h02.x(z5);
                }
                c0288h02.f4890N.f(null);
                c0288h02.f4891O.b(0L);
                c0288h02.f4892P.F(null);
                C0333w1 c0333w1O = c0323t02.o();
                c0333w1O.o();
                c0333w1O.p();
                a2 a2VarE = c0333w1O.E(false);
                c0333w1O.A();
                ((C0323t0) c0333w1O.f4346r).n().s();
                c0333w1O.C(new RunnableC0318r1(c0333w1O, a2VarE, 0));
                C0323t0.k(e12);
                e12.f4359v.t();
                c0271b1.f4756J = z5;
                c0323t02.o().s(new AtomicReference());
                break;
        }
    }
}
