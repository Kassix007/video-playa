package e3;

import P.C;
import P.C0345b;
import P.C0354f0;
import P.S0;
import a3.C0632k;
import v.a0;

/* JADX INFO: renamed from: e3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044g implements S0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0354f0 f12569A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0354f0 f12570B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C f12571C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final a0 f12572D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0354f0 f12573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0354f0 f12574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f12575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f12576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0354f0 f12577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0354f0 f12578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0354f0 f12579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C f12580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0354f0 f12581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0354f0 f12582z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1044g() {
        Boolean bool = Boolean.FALSE;
        this.f12573q = C0345b.q(bool);
        this.f12574r = C0345b.q(1);
        this.f12575s = C0345b.q(1);
        this.f12576t = C0345b.q(bool);
        this.f12577u = C0345b.q(null);
        this.f12578v = C0345b.q(Float.valueOf(1.0f));
        this.f12579w = C0345b.q(bool);
        this.f12580x = C0345b.m(new C1043f(this, 1));
        this.f12581y = C0345b.q(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f12582z = C0345b.q(fValueOf);
        this.f12569A = C0345b.q(fValueOf);
        this.f12570B = C0345b.q(Long.MIN_VALUE);
        this.f12571C = C0345b.m(new C1043f(this, 0));
        C0345b.m(new C1043f(this, 2));
        this.f12572D = new a0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(C1044g c1044g, int i, long j) {
        C0354f0 c0354f0 = c1044g.f12581y;
        C0354f0 c0354f02 = c1044g.f12577u;
        C0354f0 c0354f03 = c1044g.f12582z;
        C c7 = c1044g.f12580x;
        C0354f0 c0354f04 = c1044g.f12570B;
        C0632k c0632k = (C0632k) c0354f0.getValue();
        if (c0632k == null) {
            return true;
        }
        long jLongValue = ((Number) c0354f04.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) c0354f04.getValue()).longValue();
        c0354f04.setValue(Long.valueOf(j));
        if (c0354f02.getValue() != null) {
            throw new ClassCastException();
        }
        if (c0354f02.getValue() != null) {
            throw new ClassCastException();
        }
        float fFloatValue = ((Number) c7.getValue()).floatValue() * ((jLongValue / ((long) 1000000)) / c0632k.b());
        float fFloatValue2 = ((Number) c7.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) c0354f03.getValue()).floatValue() + fFloatValue) : (((Number) c0354f03.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < 0.0f) {
            c1044g.g(D5.a.p(((Number) c0354f03.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i7 = (int) (fFloatValue2 / 1.0f);
        int i8 = i7 + 1;
        if (c1044g.e() + i8 > i) {
            c1044g.g(c1044g.d());
            c1044g.f(i);
            return false;
        }
        c1044g.f(c1044g.e() + i8);
        float f = fFloatValue2 - (i7 * 1.0f);
        c1044g.g(((Number) c7.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(C1044g c1044g, boolean z5) {
        c1044g.f12573q.setValue(Boolean.valueOf(z5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d() {
        return ((Number) this.f12571C.getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        return ((Number) this.f12574r.getValue()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        this.f12574r.setValue(Integer.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(float f) {
        C0632k c0632k;
        this.f12582z.setValue(Float.valueOf(f));
        if (((Boolean) this.f12579w.getValue()).booleanValue() && (c0632k = (C0632k) this.f12581y.getValue()) != null) {
            f -= f % (1 / c0632k.f8843n);
        }
        this.f12569A.setValue(Float.valueOf(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return Float.valueOf(((Number) this.f12569A.getValue()).floatValue());
    }
}
