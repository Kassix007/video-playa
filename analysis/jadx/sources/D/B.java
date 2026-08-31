package D;

import E.P;
import E.T;
import m5.C1386y;
import r5.EnumC1580a;
import v.W;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f1189a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(y yVar) {
        this.f1189a = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final int a() {
        y yVar = this.f1189a;
        return (int) (yVar.g().f1259p == EnumC1778d0.f17945q ? yVar.g().g() & 4294967295L : yVar.g().g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final float b() {
        y yVar = this.f1189a;
        return (yVar.f1308d.f685b.e() * 500) + yVar.f1308d.f686c.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final I0.b c() {
        return new I0.b(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final int d() {
        y yVar = this.f1189a;
        return (-yVar.g().f1256m) + yVar.g().f1260q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final float e() {
        y yVar = this.f1189a;
        int iE = yVar.f1308d.f685b.e();
        int iE2 = yVar.f1308d.f686c.e();
        return yVar.c() ? (iE * 500) + iE2 + 100 : (iE * 500) + iE2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.P
    public final Object f(int i, T t6) {
        Z.m mVar = y.f1304w;
        y yVar = this.f1189a;
        yVar.getClass();
        Object objE = yVar.e(W.f17278q, new x(yVar, i, null), t6);
        C1386y c1386y = C1386y.f15098a;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objE != enumC1580a) {
            objE = c1386y;
        }
        return objE == enumC1580a ? objE : c1386y;
    }
}
