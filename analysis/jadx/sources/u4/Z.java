package U4;

import P.C0345b;
import P.C0371o;
import R4.C0468k1;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7785q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7787s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Z(int i, int i7, C0468k1 c0468k1) {
        this.f7787s = i;
        this.f7786r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0371o c0371o = (C0371o) obj;
        Integer num = (Integer) obj2;
        switch (this.f7785q) {
            case 0:
                num.getClass();
                AbstractC0534a.q(this.f7787s, this.f7786r, c0371o, C0345b.w(1));
                break;
            default:
                num.intValue();
                AbstractC0534a.d(this.f7786r, c0371o, C0345b.w(this.f7787s | 1));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ Z(C0468k1 c0468k1, int i) {
        this.f7786r = c0468k1;
        this.f7787s = i;
    }
}
