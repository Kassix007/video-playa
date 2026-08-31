package C0;

import m5.C1386y;
import u.C1656j;
import u.C1659m;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.e f915r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(B5.e eVar, int i) {
        super(1);
        this.f914q = i;
        switch (i) {
            case 1:
                Z.m mVar = u.A0.f16746a;
                this.f915r = eVar;
                super(1);
                break;
            default:
                this.f915r = eVar;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f914q;
        C1386y c1386y = C1386y.f15098a;
        B5.e eVar = this.f915r;
        switch (i) {
            case 0:
                eVar.invoke((j0.m) obj, null);
                break;
            default:
                C1656j c1656j = (C1656j) obj;
                Object value = c1656j.f16949e.getValue();
                Z.m mVar = u.A0.f16746a;
                eVar.invoke(value, Float.valueOf(((C1659m) c1656j.f).f16972a));
                break;
        }
        return c1386y;
    }
}
