package F;

import com.google.android.gms.internal.measurement.I1;
import m5.C1386y;
import r5.EnumC1580a;
import v.W;
import w.EnumC1778d0;

/* JADX INFO: renamed from: F.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0157k implements E.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0151e f1886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1887b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0157k(C0151e c0151e, boolean z5) {
        this.f1886a = c0151e;
        this.f1887b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final int a() {
        C0151e c0151e = this.f1886a;
        return (int) (c0151e.k().f1764e == EnumC1778d0.f17945q ? c0151e.k().g() & 4294967295L : c0151e.k().g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final float b() {
        return I1.R(this.f1886a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final I0.b c() {
        boolean z5 = this.f1887b;
        C0151e c0151e = this.f1886a;
        return z5 ? new I0.b(c0151e.l(), 1) : new I0.b(1, c0151e.l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final int d() {
        C0151e c0151e = this.f1886a;
        return (-c0151e.k().f) + c0151e.k().f1763d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final float e() {
        C0151e c0151e = this.f1886a;
        return S.a(c0151e.k(), c0151e.l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final Object f(int i, E.T t6) {
        C0151e c0151e = this.f1886a;
        Object objE = c0151e.e(W.f17278q, new L(c0151e, i, null), t6);
        C1386y c1386y = C1386y.f15098a;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objE != enumC1580a) {
            objE = c1386y;
        }
        return objE == enumC1580a ? objE : c1386y;
    }
}
