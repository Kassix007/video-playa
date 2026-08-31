package B0;

import m5.C1386y;
import z0.AbstractC1932I;

/* JADX INFO: renamed from: B0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032b0 extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0034c0 f371r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0032b0(C0034c0 c0034c0, int i) {
        super(0);
        this.f370q = i;
        this.f371r = c0034c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        AbstractC1932I placementScope;
        switch (this.f370q) {
            case 0:
                C0034c0 c0034c0 = this.f371r;
                P p7 = c0034c0.f400v;
                p7.i = 0;
                R.e eVarW = p7.f299a.w();
                Object[] objArr = eVarW.f6676q;
                int i = eVarW.f6678s;
                for (int i7 = 0; i7 < i; i7++) {
                    C0034c0 c0034c02 = ((L) objArr[i7]).f269V.f311p;
                    c0034c02.f402x = c0034c02.f403y;
                    c0034c02.f403y = Integer.MAX_VALUE;
                    c0034c02.f382I = false;
                    if (c0034c02.f375B == I.f238r) {
                        c0034c02.f375B = I.f239s;
                    }
                }
                L l7 = p7.f299a;
                L l8 = p7.f299a;
                R.e eVarW2 = l7.w();
                Object[] objArr2 = eVarW2.f6676q;
                int i8 = eVarW2.f6678s;
                for (int i9 = 0; i9 < i8; i9++) {
                    ((L) objArr2[i9]).f269V.f311p.f386M.getClass();
                }
                c0034c0.n().j0().d();
                R.e eVarW3 = l8.w();
                Object[] objArr3 = eVarW3.f6676q;
                int i10 = eVarW3.f6678s;
                for (int i11 = 0; i11 < i10; i11++) {
                    L l9 = (L) objArr3[i11];
                    P p8 = l9.f269V;
                    if (p8.f311p.f402x != l9.t()) {
                        l8.L();
                        l8.A();
                        if (l9.t() == Integer.MAX_VALUE) {
                            if (p8.f301c) {
                                Y y6 = p8.f312q;
                                kotlin.jvm.internal.m.b(y6);
                                y6.Y(false);
                            }
                            p8.f311p.b0();
                        }
                    }
                }
                R.e eVarW4 = l8.w();
                Object[] objArr4 = eVarW4.f6676q;
                int i12 = eVarW4.f6678s;
                for (int i13 = 0; i13 < i12; i13++) {
                    M m4 = ((L) objArr4[i13]).f269V.f311p.f386M;
                    m4.getClass();
                    m4.f291c = false;
                }
                break;
            case 1:
                C0034c0 c0034c03 = this.f371r;
                c0034c03.f400v.a().a(c0034c03.f390Q);
                break;
            default:
                C0034c0 c0034c04 = this.f371r;
                P p9 = c0034c04.f400v;
                n0 n0Var = p9.a().f480D;
                if (n0Var == null || (placementScope = n0Var.f323y) == null) {
                    placementScope = ((C0.A) O.a(p9.f299a)).getPlacementScope();
                }
                B5.c cVar = c0034c04.f395V;
                if (cVar == null) {
                    n0 n0VarA = p9.a();
                    long j = c0034c04.f396W;
                    float f = c0034c04.f397X;
                    placementScope.getClass();
                    AbstractC1932I.a(placementScope, n0VarA);
                    n0VarA.U(W0.i.c(j, n0VarA.f18668u), f, null);
                } else {
                    n0 n0VarA2 = p9.a();
                    long j7 = c0034c04.f396W;
                    float f7 = c0034c04.f397X;
                    placementScope.getClass();
                    AbstractC1932I.a(placementScope, n0VarA2);
                    n0VarA2.U(W0.i.c(j7, n0VarA2.f18668u), f7, cVar);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
