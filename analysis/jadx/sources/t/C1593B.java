package t;

import u.C1649f0;
import u.q0;

/* JADX INFO: renamed from: t.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1593B extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1594C f16571r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1593B(C1594C c1594c, int i) {
        super(1);
        this.f16570q = i;
        this.f16571r = c1594c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f16570q) {
            case 0:
                q0 q0Var = (q0) obj;
                t tVar = t.f16637q;
                t tVar2 = t.f16638r;
                C1649f0 c1649f0 = null;
                if (!q0Var.b(tVar, tVar2)) {
                    if (q0Var.b(tVar2, t.f16639s)) {
                        L l7 = this.f16571r.f16573F.f16582a;
                    } else {
                        c1649f0 = z.f16659d;
                    }
                }
                return c1649f0 == null ? z.f16659d : c1649f0;
            default:
                q0 q0Var2 = (q0) obj;
                t tVar3 = t.f16637q;
                t tVar4 = t.f16638r;
                if (q0Var2.b(tVar3, tVar4)) {
                    return z.f16658c;
                }
                if (!q0Var2.b(tVar4, t.f16639s)) {
                    return z.f16658c;
                }
                L l8 = this.f16571r.f16573F.f16582a;
                return z.f16658c;
        }
    }
}
