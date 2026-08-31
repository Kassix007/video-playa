package M;

import A.AbstractC0017n;
import P.C0371o;
import c0.C0722j;
import m5.C1386y;

/* JADX INFO: renamed from: M.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197a extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f3427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f3428r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0197a(float f, float f7) {
        super(2);
        this.f3427q = f;
        this.f3428r = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0371o c0371o = (C0371o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
            c0371o.N();
        } else {
            AbstractC0017n.a(androidx.compose.foundation.layout.c.d(C0722j.f10095q, this.f3427q, this.f3428r), c0371o, 0);
        }
        return C1386y.f15098a;
    }
}
