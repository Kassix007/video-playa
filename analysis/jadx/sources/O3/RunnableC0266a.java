package O3;

import java.util.Objects;
import r.C1554e;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0266a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C f4699t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0266a(A a7, String str, long j, int i) {
        this.f4696q = i;
        this.f4697r = str;
        this.f4698s = j;
        this.f4699t = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4696q) {
            case 0:
                A a7 = (A) this.f4699t;
                String str = (String) this.f4697r;
                a7.o();
                AbstractC1887A.d(str);
                C1554e c1554e = a7.f4299t;
                boolean zIsEmpty = c1554e.isEmpty();
                long j = this.f4698s;
                if (zIsEmpty) {
                    a7.f4300u = j;
                }
                Integer num = (Integer) c1554e.get(str);
                if (num != null) {
                    c1554e.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c1554e.f16166s < 100) {
                    c1554e.put(str, 1);
                    a7.f4298s.put(str, Long.valueOf(j));
                } else {
                    X x6 = ((C0323t0) a7.f4346r).f5077v;
                    C0323t0.l(x6);
                    x6.f4673z.b("Too many ads visible");
                }
                break;
            case 1:
                A a8 = (A) this.f4699t;
                String str2 = (String) this.f4697r;
                C0323t0 c0323t0 = (C0323t0) a8.f4346r;
                a8.o();
                AbstractC1887A.d(str2);
                C1554e c1554e2 = a8.f4299t;
                Integer num2 = (Integer) c1554e2.get(str2);
                if (num2 == null) {
                    X x7 = c0323t0.f5077v;
                    C0323t0.l(x7);
                    x7.f4670w.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    C0304m1 c0304m1 = c0323t0.f5053B;
                    X x8 = c0323t0.f5077v;
                    C0323t0.k(c0304m1);
                    C0295j1 c0295j1U = c0304m1.u(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c1554e2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        c1554e2.remove(str2);
                        C1554e c1554e3 = a8.f4298s;
                        Long l7 = (Long) c1554e3.get(str2);
                        long j7 = this.f4698s;
                        if (l7 == null) {
                            C0323t0.l(x8);
                            x8.f4670w.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j7 - l7.longValue();
                            c1554e3.remove(str2);
                            a8.t(str2, jLongValue, c0295j1U);
                        }
                        if (c1554e2.isEmpty()) {
                            long j8 = a8.f4300u;
                            if (j8 != 0) {
                                a8.s(j7 - j8, c0295j1U);
                                a8.f4300u = 0L;
                            } else {
                                C0323t0.l(x8);
                                x8.f4670w.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                C0304m1 c0304m12 = (C0304m1) this.f4699t;
                c0304m12.s((C0295j1) this.f4697r, false, this.f4698s);
                c0304m12.f4967v = null;
                C0333w1 c0333w1O = ((C0323t0) c0304m12.f4346r).o();
                c0333w1O.o();
                c0333w1O.p();
                c0333w1O.C(new I4.a(c0333w1O, (C0295j1) null));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0266a(C0304m1 c0304m1, C0295j1 c0295j1, long j) {
        this.f4696q = 2;
        this.f4697r = c0295j1;
        this.f4698s = j;
        Objects.requireNonNull(c0304m1);
        this.f4699t = c0304m1;
    }
}
