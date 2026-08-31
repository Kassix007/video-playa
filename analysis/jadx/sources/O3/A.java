package O3;

import android.os.Bundle;
import java.util.Iterator;
import r.C1551b;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class A extends C {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1554e f4298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1554e f4299t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4300u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4299t = new C1554e(0);
        this.f4298s = new C1554e(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(String str, long j) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (str == null || str.length() == 0) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Ad unit id must be a non-empty string");
        } else {
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(new RunnableC0266a(this, str, j, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(String str, long j) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (str == null || str.length() == 0) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Ad unit id must be a non-empty string");
        } else {
            C0312p0 c0312p0 = c0323t0.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(new RunnableC0266a(this, str, j, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(long j) {
        C0304m1 c0304m1 = ((C0323t0) this.f4346r).f5053B;
        C0323t0.k(c0304m1);
        C0295j1 c0295j1U = c0304m1.u(false);
        C1554e c1554e = this.f4298s;
        for (String str : (C1551b) c1554e.keySet()) {
            t(str, j - ((Long) c1554e.get(str)).longValue(), c0295j1U);
        }
        if (!c1554e.isEmpty()) {
            s(j - this.f4300u, c0295j1U);
        }
        u(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(long j, C0295j1 c0295j1) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (c0295j1 == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4666E.b("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4666E.c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            Y1.f0(c0295j1, bundle, true);
            C0271b1 c0271b1 = c0323t0.f5054C;
            C0323t0.k(c0271b1);
            c0271b1.v("am", "_xa", bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(String str, long j, C0295j1 c0295j1) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (c0295j1 == null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4666E.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4666E.c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            Y1.f0(c0295j1, bundle, true);
            C0271b1 c0271b1 = c0323t0.f5054C;
            C0323t0.k(c0271b1);
            c0271b1.v("am", "_xu", bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(long j) {
        C1554e c1554e = this.f4298s;
        Iterator it = ((C1551b) c1554e.keySet()).iterator();
        while (it.hasNext()) {
            c1554e.put((String) it.next(), Long.valueOf(j));
        }
        if (c1554e.isEmpty()) {
            return;
        }
        this.f4300u = j;
    }
}
