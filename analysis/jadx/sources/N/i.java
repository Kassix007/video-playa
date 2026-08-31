package N;

import P.C0354f0;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f3943r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, int i) {
        super(0);
        this.f3942q = i;
        this.f3943r = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f3942q) {
            case 0:
                return this.f3943r.d();
            case 1:
                r rVar = this.f3943r;
                return new C1371j(rVar.d(), rVar.f3974h.getValue());
            case 2:
                r rVar2 = this.f3943r;
                Object value = rVar2.f3976l.getValue();
                if (value != null) {
                    return value;
                }
                float fE = rVar2.j.e();
                C0354f0 c0354f0 = rVar2.f3973g;
                if (Float.isNaN(fE)) {
                    return c0354f0.getValue();
                }
                Object value2 = c0354f0.getValue();
                y yVarD = rVar2.d();
                float fD = yVarD.d(value2);
                if (fD != fE && !Float.isNaN(fD)) {
                    if (fD < fE) {
                        Object objB = yVarD.b(fE, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = yVarD.b(fE, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            case 3:
                r rVar3 = this.f3943r;
                float fD2 = rVar3.d().d(rVar3.f3973g.getValue());
                float fD3 = rVar3.d().d(rVar3.i.getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float f7 = (rVar3.f() - fD2) / fD3;
                    if (f7 < 1.0E-6f) {
                        f = 0.0f;
                    } else if (f7 <= 0.999999f) {
                        f = f7;
                    }
                }
                return Float.valueOf(f);
            default:
                r rVar4 = this.f3943r;
                Object value3 = rVar4.f3976l.getValue();
                if (value3 != null) {
                    return value3;
                }
                float fE2 = rVar4.j.e();
                C0354f0 c0354f02 = rVar4.f3973g;
                return !Float.isNaN(fE2) ? rVar4.c(fE2, c0354f02.getValue(), 0.0f) : c0354f02.getValue();
        }
    }
}
