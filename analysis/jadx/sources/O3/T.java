package O3;

import c3.C0733c;
import i0.C1130b;
import java.util.concurrent.atomic.AtomicLong;
import q6.InterfaceC1540i;
import v0.C1743l;
import w.EnumC1778d0;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements S3.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f4572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f4573s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ T(int i, long j, Object obj) {
        this.f4571q = i;
        this.f4573s = obj;
        this.f4572r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long a(C1743l c1743l, float f) {
        long jE = C1130b.e(this.f4572r, C1130b.d(c1743l.f17462c, c1743l.f17465g));
        this.f4572r = jE;
        EnumC1778d0 enumC1778d0 = (EnumC1778d0) this.f4573s;
        if ((enumC1778d0 == null ? C1130b.c(jE) : Math.abs(g(jE))) < f) {
            return 9205357640488583168L;
        }
        if (enumC1778d0 == null) {
            long j = this.f4572r;
            float fC = C1130b.c(j);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / fC;
            return C1130b.d(this.f4572r, C1130b.f((4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / fC))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f));
        }
        float fG = g(this.f4572r) - (Math.signum(g(this.f4572r)) * f);
        long j7 = this.f4572r;
        EnumC1778d0 enumC1778d02 = EnumC1778d0.f17946r;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (enumC1778d0 == enumC1778d02 ? j7 & 4294967295L : j7 >> 32));
        if (enumC1778d0 == enumC1778d02) {
            return (((long) Float.floatToRawIntBits(fG)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fG)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i) {
        if (i < 64) {
            this.f4572r &= ~(1 << i);
            return;
        }
        T t6 = (T) this.f4573s;
        if (t6 != null) {
            t6.b(i - 64);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c(int i) {
        T t6 = (T) this.f4573s;
        if (t6 == null) {
            return i >= 64 ? Long.bitCount(this.f4572r) : Long.bitCount(this.f4572r & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f4572r & ((1 << i) - 1));
        }
        return Long.bitCount(this.f4572r) + t6.c(i - 64);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        if (((T) this.f4573s) == null) {
            this.f4573s = new T();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e(int i) {
        if (i < 64) {
            return (this.f4572r & (1 << i)) != 0;
        }
        d();
        return ((T) this.f4573s).e(i - 64);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(int i, boolean z5) {
        if (i >= 64) {
            d();
            ((T) this.f4573s).f(i - 64, z5);
            return;
        }
        long j = this.f4572r;
        boolean z6 = (Long.MIN_VALUE & j) != 0;
        long j7 = (1 << i) - 1;
        this.f4572r = ((j & (~j7)) << 1) | (j & j7);
        if (z5) {
            k(i);
        } else {
            b(i);
        }
        if (z6 || ((T) this.f4573s) != null) {
            d();
            ((T) this.f4573s).f(0, z6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float g(long j) {
        return Float.intBitsToFloat((int) (((EnumC1778d0) this.f4573s) == EnumC1778d0.f17946r ? j >> 32 : j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d6.l h() {
        C0733c c0733c = new C0733c(1);
        while (true) {
            String strE = ((InterfaceC1540i) this.f4573s).E(this.f4572r);
            this.f4572r -= (long) strE.length();
            if (strE.length() == 0) {
                return c0733c.d();
            }
            int iR0 = J5.m.R0(strE, ':', 1, 4);
            if (iR0 != -1) {
                String strSubstring = strE.substring(0, iR0);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strE.substring(iR0 + 1);
                kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c0733c.a(strSubstring, strSubstring2);
            } else if (strE.charAt(0) == ':') {
                String strSubstring3 = strE.substring(1);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                c0733c.a("", strSubstring3);
            } else {
                c0733c.a("", strE);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean i(int i) {
        if (i >= 64) {
            d();
            return ((T) this.f4573s).i(i - 64);
        }
        long j = 1 << i;
        long j7 = this.f4572r;
        boolean z5 = (j7 & j) != 0;
        long j8 = j7 & (~j);
        this.f4572r = j8;
        long j9 = j - 1;
        this.f4572r = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
        T t6 = (T) this.f4573s;
        if (t6 != null) {
            if (t6.e(0)) {
                k(63);
            }
            ((T) this.f4573s).i(0);
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j() {
        this.f4572r = 0L;
        T t6 = (T) this.f4573s;
        if (t6 != null) {
            t6.j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(int i) {
        if (i < 64) {
            this.f4572r |= 1 << i;
        } else {
            d();
            ((T) this.f4573s).k(i - 64);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.b
    public /* synthetic */ void q(Exception exc) {
        B0.G0 g02 = (B0.G0) this.f4573s;
        ((AtomicLong) g02.f236t).set(this.f4572r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4571q) {
            case 2:
                if (((T) this.f4573s) == null) {
                    return Long.toBinaryString(this.f4572r);
                }
                return ((T) this.f4573s).toString() + "xx" + Long.toBinaryString(this.f4572r);
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public T(B3.a aVar) {
        this.f4571q = 1;
        AbstractC1887A.g(aVar);
        this.f4573s = aVar;
    }

    public T(InterfaceC1540i source) {
        this.f4571q = 3;
        kotlin.jvm.internal.m.e(source, "source");
        this.f4573s = source;
        this.f4572r = 262144L;
    }

    public T() {
        this.f4571q = 2;
        this.f4572r = 0L;
    }
}
