package E;

import B0.G0;
import C0.C0106v;
import android.os.Trace;
import java.util.List;
import z.AbstractC1923a;
import z0.InterfaceC1939P;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f1542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1939P f1543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1544e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f1546h;
    public boolean i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G0 f1549m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b0(G0 g02, int i, long j, c0 c0Var) {
        this.f1549m = g02;
        this.f1540a = i;
        this.f1541b = j;
        this.f1542c = c0Var;
        int i7 = K5.j.f2992b;
        this.f1548l = System.nanoTime() - K5.j.f2991a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.J
    public final void a() {
        this.i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r9v23, types: [B5.c, kotlin.jvm.internal.n] */
    public final boolean b(C0118a c0118a) {
        long j;
        c0 c0Var;
        long j7;
        c0 c0Var2;
        long j8;
        long j9;
        long j10 = c0118a.f1527a;
        G0 g02 = this.f1549m;
        InterfaceC0140x interfaceC0140x = (InterfaceC0140x) ((C0137u) g02.f234r).f1590b.invoke();
        if (this.f) {
            return false;
        }
        int iA = interfaceC0140x.a();
        int i = this.f1540a;
        if (i < 0 || i >= iA) {
            return false;
        }
        Object objC = interfaceC0140x.c(i);
        this.j = Math.max(0L, j10 - System.nanoTime());
        int i7 = K5.j.f2992b;
        this.f1548l = System.nanoTime() - K5.j.f2991a;
        this.f1547k = 0L;
        InterfaceC1939P interfaceC1939P = this.f1543d;
        c0 c0Var3 = this.f1542c;
        if (interfaceC1939P != null) {
            j8 = j10;
            j = 0;
            c0Var2 = c0Var3;
        } else {
            j = 0;
            long j11 = this.j;
            long j12 = c0Var3.r(objC).f1550a;
            if ((!this.i || j11 <= 0) && j12 >= j11) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                if (this.f1543d != null) {
                    AbstractC1923a.a("Request was already composed!");
                }
                Object objB = interfaceC0140x.b(i);
                this.f1543d = ((z0.S) g02.f235s).a().d(objB, ((C0137u) g02.f234r).a(i, objB, objC));
                Trace.endSection();
                e();
                long j13 = this.f1547k;
                C0120c c0120c = (C0120c) c0Var3.f1552q;
                long j14 = c0120c.f1550a;
                if (j14 == 0) {
                    j7 = j13;
                    c0Var = c0Var3;
                } else {
                    long j15 = 4;
                    c0Var = c0Var3;
                    j7 = (j13 / j15) + ((j14 / j15) * ((long) 3));
                }
                c0120c.f1550a = j7;
                c0Var2 = c0Var;
                C0120c c0120cR = c0Var2.r(objC);
                long j16 = c0120cR.f1550a;
                if (j16 == 0) {
                    j8 = j10;
                } else {
                    long j17 = 4;
                    j8 = j10;
                    j13 = (j13 / j17) + ((j16 / j17) * ((long) 3));
                }
                c0120cR.f1550a = j13;
            } finally {
            }
        }
        if (!this.i) {
            if (!this.f1545g) {
                if (this.j <= j) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f1546h = d();
                    this.f1545g = true;
                } finally {
                }
            }
            a0 a0Var = this.f1546h;
            if (a0Var != null) {
                List[] listArr = (List[]) a0Var.f1531d;
                int i8 = a0Var.f1528a;
                List list = (List) a0Var.f1530c;
                if (i8 < list.size()) {
                    if (((b0) a0Var.f1532e).f) {
                        AbstractC1923a.c("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (a0Var.f1528a < list.size()) {
                        try {
                            if (listArr[a0Var.f1528a] == null) {
                                long j18 = j;
                                if (Math.max(j18, j8 - System.nanoTime()) <= j18) {
                                    return true;
                                }
                                int i9 = a0Var.f1528a;
                                K k7 = (K) list.get(i9);
                                ?? r9 = k7.f1488a;
                                I i10 = new I(k7);
                                r9.invoke(i10);
                                listArr[i9] = i10.f1486a;
                            }
                            List list2 = listArr[a0Var.f1528a];
                            kotlin.jvm.internal.m.b(list2);
                            while (a0Var.f1529b < list2.size()) {
                                if (((b0) list2.get(a0Var.f1529b)).b(c0118a)) {
                                    return true;
                                }
                                a0Var.f1529b++;
                            }
                            a0Var.f1529b = 0;
                            a0Var.f1528a++;
                            j = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            e();
        }
        if (this.f1544e) {
            return false;
        }
        long j19 = this.f1541b;
        if (W0.a.k(j19)) {
            return false;
        }
        long j20 = this.j;
        long j21 = c0Var2.r(objC).f1551b;
        if ((!this.i || j20 <= 0) && j21 >= j20) {
            return true;
        }
        Trace.beginSection("compose:lazy:prefetch:measure");
        try {
            c(j19);
            Trace.endSection();
            e();
            long j22 = this.f1547k;
            C0120c c0120c2 = (C0120c) c0Var2.f1552q;
            long j23 = c0120c2.f1551b;
            if (j23 == 0) {
                j9 = j22;
            } else {
                long j24 = 4;
                j9 = (j22 / j24) + ((j23 / j24) * ((long) 3));
            }
            c0120c2.f1551b = j9;
            C0120c c0120cR2 = c0Var2.r(objC);
            long j25 = c0120cR2.f1551b;
            if (j25 != 0) {
                long j26 = 4;
                j22 = (j22 / j26) + ((j25 / j26) * ((long) 3));
            }
            c0120cR2.f1551b = j22;
            return false;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(long j) {
        if (this.f) {
            AbstractC1923a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f1544e) {
            AbstractC1923a.a("Request was already measured!");
        }
        this.f1544e = true;
        InterfaceC1939P interfaceC1939P = this.f1543d;
        if (interfaceC1939P == null) {
            AbstractC1923a.b("performComposition() must be called before performMeasure()");
            throw new C2.e();
        }
        int iB = interfaceC1939P.b();
        for (int i = 0; i < iB; i++) {
            interfaceC1939P.d(i, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.J
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        InterfaceC1939P interfaceC1939P = this.f1543d;
        if (interfaceC1939P != null) {
            interfaceC1939P.a();
        }
        this.f1543d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a0 d() {
        InterfaceC1939P interfaceC1939P = this.f1543d;
        if (interfaceC1939P == null) {
            AbstractC1923a.b("Should precompose before resolving nested prefetch states");
            throw new C2.e();
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        interfaceC1939P.c(new C0106v(yVar, 1));
        List list = (List) yVar.f14268q;
        if (list == null) {
            return null;
        }
        a0 a0Var = new a0();
        a0Var.f1532e = this;
        a0Var.f1530c = list;
        a0Var.f1531d = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC1923a.a("NestedPrefetchController shouldn't be created with no states");
        }
        return a0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        int i = K5.j.f2992b;
        long jNanoTime = System.nanoTime() - K5.j.f2991a;
        long j = this.f1548l;
        K5.c unit = K5.c.NANOSECONDS;
        kotlin.jvm.internal.m.e(unit, "unit");
        long jK = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                int i7 = K5.a.f2967t;
            } else {
                jK = K5.a.f(j < 0 ? K5.a.f2966s : K5.a.f2965r);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jK = jNanoTime < 0 ? K5.a.f2966s : K5.a.f2965r;
        } else {
            long j7 = jNanoTime - j;
            if (((~(j7 ^ j)) & (j7 ^ jNanoTime)) < 0) {
                K5.c cVar = K5.c.MILLISECONDS;
                if (unit.compareTo(cVar) < 0) {
                    long jC = K5.f.c(1L, cVar, unit);
                    long j8 = (jNanoTime / jC) - (j / jC);
                    long j9 = (jNanoTime % jC) - (j % jC);
                    int i8 = K5.a.f2967t;
                    jK = K5.a.d(K5.f.k(j8, cVar), K5.f.k(j9, unit));
                } else {
                    jK = K5.a.f(j7 < 0 ? K5.a.f2966s : K5.a.f2965r);
                }
            } else {
                jK = K5.f.k(j7, unit);
            }
        }
        long j10 = jK >> 1;
        int i9 = K5.a.f2967t;
        long j11 = (1 & ((int) jK)) == 0 ? j10 : j10 > 9223372036854L ? Long.MAX_VALUE : j10 < -9223372036854L ? Long.MIN_VALUE : j10 * ((long) 1000000);
        this.f1547k = j11;
        this.j -= j11;
        this.f1548l = jNanoTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f1540a);
        sb.append(", constraints = ");
        sb.append((Object) W0.a.l(this.f1541b));
        sb.append(", isComposed = ");
        sb.append(this.f1543d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f1544e);
        sb.append(", isCanceled = ");
        sb.append(this.f);
        sb.append(" }");
        return sb.toString();
    }
}
