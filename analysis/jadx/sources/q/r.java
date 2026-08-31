package Q;

import P.C0343a;
import P.C0372o0;
import P.D0;
import P.InterfaceC0347c;
import P.x0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f6512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f6513e;
    public static final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f6514g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6515c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f6512d = new r(i, 2, 0);
        int i7 = 1;
        f6513e = new r(i7, i7, 1);
        f = new r(i, 2, 2);
        int i8 = 1;
        f6514g = new r(i8, i8, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i7, int i8) {
        super(i, i7);
        this.f6515c = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        int iC;
        int iO;
        switch (this.f6515c) {
            case 0:
                Object objInvoke = ((B5.a) j.d(0)).invoke();
                C0343a c0343a = (C0343a) j.d(1);
                int iC2 = j.c(0);
                c0343a.getClass();
                d02.S(d02.c(c0343a), objInvoke);
                interfaceC0347c.h(iC2, objInvoke);
                interfaceC0347c.d(objInvoke);
                break;
            case 1:
                C0343a c0343a2 = (C0343a) j.d(0);
                int iC3 = j.c(0);
                interfaceC0347c.o();
                c0343a2.getClass();
                interfaceC0347c.c(iC3, d02.B(d02.c(c0343a2)));
                break;
            case 2:
                Object objD = j.d(0);
                C0343a c0343a3 = (C0343a) j.d(1);
                int iC4 = j.c(0);
                if (objD instanceof x0) {
                    jVar.f8151c.c((x0) objD);
                }
                int iC5 = d02.c(c0343a3);
                int iG = d02.g(d02.L(iC5, iC4));
                Object[] objArr = d02.f5290c;
                Object obj = objArr[iG];
                objArr[iG] = objD;
                if (obj instanceof x0) {
                    int iO2 = d02.o() - d02.L(iC5, iC4);
                    x0 x0Var = (x0) obj;
                    C0343a c0343a4 = x0Var.f5577b;
                    if (c0343a4 == null || !c0343a4.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = d02.c(c0343a4);
                        iO = d02.o() - d02.M(iC);
                    }
                    jVar.d(x0Var, iO2, iC, iO);
                } else if (obj instanceof C0372o0) {
                    ((C0372o0) obj).d();
                }
                break;
            default:
                Object objD2 = j.d(0);
                int iC6 = j.c(0);
                if (objD2 instanceof x0) {
                    jVar.f8151c.c((x0) objD2);
                }
                int iG2 = d02.g(d02.L(d02.f5304t, iC6));
                Object[] objArr2 = d02.f5290c;
                Object obj2 = objArr2[iG2];
                objArr2[iG2] = objD2;
                if (obj2 instanceof x0) {
                    jVar.d((x0) obj2, d02.o() - d02.L(d02.f5304t, iC6), -1, -1);
                } else if (obj2 instanceof C0372o0) {
                    ((C0372o0) obj2).d();
                }
                break;
        }
    }
}
