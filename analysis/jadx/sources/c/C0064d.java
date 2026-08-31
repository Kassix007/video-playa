package C;

import E.P;
import E.T;
import m5.C1386y;
import r5.EnumC1580a;
import v.W;
import w.EnumC1778d0;

/* JADX INFO: renamed from: C.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0064d implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f598a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0064d(A a7) {
        this.f598a = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final int a() {
        A a7 = this.f598a;
        return (int) (a7.g().f668o == EnumC1778d0.f17945q ? a7.g().g() & 4294967295L : a7.g().g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final float b() {
        A a7 = this.f598a;
        return (a7.f566d.f685b.e() * 500) + a7.f566d.f686c.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final I0.b c() {
        return new I0.b(-1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final int d() {
        A a7 = this.f598a;
        return (-a7.g().f665l) + a7.g().f669p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final float e() {
        A a7 = this.f598a;
        int iE = a7.f566d.f685b.e();
        int iE2 = a7.f566d.f686c.e();
        return a7.c() ? (iE * 500) + iE2 + 100 : (iE * 500) + iE2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final Object f(int i, T t6) {
        Z.m mVar = A.f562w;
        A a7 = this.f598a;
        a7.getClass();
        Object objE = a7.e(W.f17278q, new z(a7, i, null), t6);
        C1386y c1386y = C1386y.f15098a;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objE != enumC1580a) {
            objE = c1386y;
        }
        return objE == enumC1580a ? objE : c1386y;
    }
}
