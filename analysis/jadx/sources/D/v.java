package D;

import C.C0061a;
import E.I;
import a0.AbstractC0606h;
import java.util.Collection;
import java.util.List;
import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1295s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, int i7, Object obj) {
        super(1);
        this.f1293q = i7;
        this.f1295s = obj;
        this.f1294r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f1293q) {
            case 0:
                I i = (I) obj;
                C0061a c0061a = ((y) this.f1295s).f1305a;
                AbstractC0606h abstractC0606hC = a0.r.c();
                a0.r.f(abstractC0606hC, a0.r.d(abstractC0606hC), abstractC0606hC != null ? abstractC0606hC.e() : null);
                c0061a.getClass();
                for (int i7 = 0; i7 < 2; i7++) {
                    i.a(this.f1294r + i7);
                }
                return C1386y.f15098a;
            case 1:
                AbstractC1932I.d((AbstractC1932I) obj, (AbstractC1933J) this.f1295s, 0, -this.f1294r);
                return C1386y.f15098a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f1294r, (Collection) this.f1295s));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i, Collection collection) {
        super(1);
        this.f1293q = 2;
        this.f1294r = i;
        this.f1295s = collection;
    }
}
