package z0;

import m5.C1386y;

/* JADX INFO: renamed from: z0.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1940Q extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f18678r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1940Q(S s6, int i) {
        super(2);
        this.f18677q = i;
        this.f18678r = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18677q) {
            case 0:
                this.f18678r.a().f18731r = (P.r) obj2;
                break;
            case 1:
                ((B0.L) obj).X(new v(this.f18678r.a(), (B5.e) obj2));
                break;
            default:
                B0.L l7 = (B0.L) obj;
                S s6 = this.f18678r;
                U u6 = s6.f18679a;
                y yVar = l7.f270W;
                if (yVar == null) {
                    yVar = new y(l7, u6);
                    l7.f270W = yVar;
                }
                s6.f18680b = yVar;
                s6.a().b();
                y yVarA = s6.a();
                if (yVarA.f18732s != u6) {
                    yVarA.f18732s = u6;
                    yVarA.c(false);
                    B0.L.S(yVarA.f18730q, false, 7);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
