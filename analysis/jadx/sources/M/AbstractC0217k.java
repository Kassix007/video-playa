package M;

import P.C0371o;
import P.T0;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: renamed from: M.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0217k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T0 f3553a = new T0(C0215j.f3541r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T0 f3554b = new T0(C0215j.f3542s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(C0213i c0213i, long j) {
        long j7 = c0213i.f3512a;
        long j8 = c0213i.f3525q;
        if (j0.o.c(j, j7)) {
            return c0213i.f3513b;
        }
        if (j0.o.c(j, c0213i.f)) {
            return c0213i.f3517g;
        }
        if (j0.o.c(j, c0213i.j)) {
            return c0213i.f3519k;
        }
        if (j0.o.c(j, c0213i.f3522n)) {
            return c0213i.f3523o;
        }
        if (j0.o.c(j, c0213i.f3531w)) {
            return c0213i.f3532x;
        }
        if (j0.o.c(j, c0213i.f3514c)) {
            return c0213i.f3515d;
        }
        if (j0.o.c(j, c0213i.f3518h)) {
            return c0213i.i;
        }
        if (j0.o.c(j, c0213i.f3520l)) {
            return c0213i.f3521m;
        }
        if (j0.o.c(j, c0213i.f3533y)) {
            return c0213i.f3534z;
        }
        if (j0.o.c(j, c0213i.f3529u)) {
            return c0213i.f3530v;
        }
        if (j0.o.c(j, c0213i.f3524p)) {
            return j8;
        }
        if (j0.o.c(j, c0213i.f3526r)) {
            return c0213i.f3527s;
        }
        if (j0.o.c(j, c0213i.f3502D) || j0.o.c(j, c0213i.f3504F) || j0.o.c(j, c0213i.f3505G) || j0.o.c(j, c0213i.f3506H) || j0.o.c(j, c0213i.f3507I) || j0.o.c(j, c0213i.f3508J)) {
            return j8;
        }
        int i = j0.o.f13723h;
        return j0.o.f13722g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(long j, C0371o c0371o) {
        c0371o.S(-1680936624);
        long jA = a((C0213i) c0371o.k(f3553a), j);
        if (jA == 16) {
            jA = ((j0.o) c0371o.k(AbstractC0229q.f3601a)).f13724a;
        }
        c0371o.p(false);
        return jA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0213i c(long j, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i, int i7) {
        return new C0213i(j, (i & 2) != 0 ? O.a.j : j7, (i & 4) != 0 ? O.a.f4068t : j8, (i & 8) != 0 ? O.a.f4059k : j9, (i & 16) != 0 ? O.a.f4056e : j10, j11, (i & 64) != 0 ? O.a.f4060l : j12, (i & 128) != 0 ? O.a.f4070v : j13, (i & 256) != 0 ? O.a.f4061m : j14, j15, (i & 1024) != 0 ? O.a.f4064p : j16, (i & 2048) != 0 ? O.a.f4051F : j17, (i & 4096) != 0 ? O.a.f4065q : j18, (i & 8192) != 0 ? O.a.f4052a : j19, (i & 16384) != 0 ? O.a.f4057g : j20, (32768 & i) != 0 ? O.a.f4071w : j21, (65536 & i) != 0 ? O.a.f4062n : j22, (131072 & i) != 0 ? O.a.f4050E : j23, (262144 & i) != 0 ? O.a.f4063o : j24, (524288 & i) != 0 ? j : j25, (1048576 & i) != 0 ? O.a.f : j26, (2097152 & i) != 0 ? O.a.f4055d : j27, O.a.f4053b, O.a.f4058h, O.a.f4054c, O.a.i, (67108864 & i) != 0 ? O.a.f4066r : j28, (134217728 & i) != 0 ? O.a.f4067s : j29, (268435456 & i) != 0 ? O.a.f4069u : j30, (536870912 & i) != 0 ? O.a.f4072x : j31, (i7 & 8) != 0 ? O.a.f4049D : j37, (1073741824 & i) != 0 ? O.a.f4073y : j32, (i & Integer.MIN_VALUE) != 0 ? O.a.f4074z : j33, (i7 & 1) != 0 ? O.a.f4046A : j34, (i7 & 2) != 0 ? O.a.f4047B : j35, (i7 & 4) != 0 ? O.a.f4048C : j36);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d(C0213i c0213i, int i) {
        switch (O.c.a(i)) {
            case 0:
                return c0213i.f3522n;
            case 1:
                return c0213i.f3531w;
            case 2:
                return c0213i.f3533y;
            case 3:
                return c0213i.f3530v;
            case 4:
                return c0213i.f3516e;
            case 5:
                return c0213i.f3529u;
            case 6:
                return c0213i.f3523o;
            case 7:
                return c0213i.f3532x;
            case 8:
                return c0213i.f3534z;
            case 9:
                return c0213i.f3513b;
            case 10:
                return c0213i.f3515d;
            case 11:
            case 12:
            case 15:
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return j0.o.f13722g;
            case 13:
                return c0213i.f3517g;
            case 14:
                return c0213i.i;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return c0213i.f3525q;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return c0213i.f3527s;
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return c0213i.f3519k;
            case 20:
                return c0213i.f3521m;
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return c0213i.f3499A;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                return c0213i.f3500B;
            case 25:
                return c0213i.f3512a;
            case 26:
                return c0213i.f3514c;
            case 29:
                return c0213i.f3501C;
            case 30:
                return c0213i.f;
            case 31:
                return c0213i.f3518h;
            case 34:
                return c0213i.f3524p;
            case 35:
                return c0213i.f3502D;
            case 36:
                return c0213i.f3504F;
            case 37:
                return c0213i.f3505G;
            case 38:
                return c0213i.f3506H;
            case 39:
                return c0213i.f3507I;
            case 40:
                return c0213i.f3508J;
            case 41:
                return c0213i.f3503E;
            case 42:
                return c0213i.f3528t;
            case 43:
                return c0213i.f3526r;
            case 44:
                return c0213i.j;
            case 45:
                return c0213i.f3520l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long e(int i, C0371o c0371o) {
        return d((C0213i) c0371o.k(f3553a), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0213i f(long j, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i, int i7) {
        long j38 = (i & 1) != 0 ? O.b.f4100t : j;
        return new C0213i(j38, (i & 2) != 0 ? O.b.j : j7, (i & 4) != 0 ? O.b.f4101u : j8, (i & 8) != 0 ? O.b.f4091k : j9, (i & 16) != 0 ? O.b.f4088e : j10, (i & 32) != 0 ? O.b.f4103w : j11, (i & 64) != 0 ? O.b.f4092l : j12, (i & 128) != 0 ? O.b.f4104x : j13, (i & 256) != 0 ? O.b.f4093m : j14, (i & 512) != 0 ? O.b.f4082H : j15, (i & 1024) != 0 ? O.b.f4096p : j16, (i & 2048) != 0 ? O.b.f4083I : j17, (i & 4096) != 0 ? O.b.f4097q : j18, (i & 8192) != 0 ? O.b.f4084a : j19, (i & 16384) != 0 ? O.b.f4089g : j20, (32768 & i) != 0 ? O.b.f4105y : j21, (65536 & i) != 0 ? O.b.f4094n : j22, (131072 & i) != 0 ? O.b.f4081G : j23, (262144 & i) != 0 ? O.b.f4095o : j24, (524288 & i) != 0 ? j38 : j25, (1048576 & i) != 0 ? O.b.f : j26, (2097152 & i) != 0 ? O.b.f4087d : j27, O.b.f4085b, O.b.f4090h, O.b.f4086c, O.b.i, (67108864 & i) != 0 ? O.b.f4098r : j28, (134217728 & i) != 0 ? O.b.f4099s : j29, (268435456 & i) != 0 ? O.b.f4102v : j30, (536870912 & i) != 0 ? O.b.f4106z : j31, (i7 & 8) != 0 ? O.b.f4080F : j37, (1073741824 & i) != 0 ? O.b.f4075A : j32, (i & Integer.MIN_VALUE) != 0 ? O.b.f4076B : j33, (i7 & 1) != 0 ? O.b.f4077C : j34, (i7 & 2) != 0 ? O.b.f4078D : j35, (i7 & 4) != 0 ? O.b.f4079E : j36);
    }
}
