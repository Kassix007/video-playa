package U4;

import P.C0345b;
import P.C0371o;
import R4.C0468k1;
import h5.AbstractC1127b;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f7777t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ V(int i, C0468k1 c0468k1, int i7, int i8) {
        this.f7774q = i8;
        this.f7775r = i;
        this.f7776s = c0468k1;
        this.f7777t = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7774q) {
            case 0:
                ((Integer) obj2).intValue();
                int iW = C0345b.w(this.f7777t | 1);
                AbstractC0534a.a(this.f7775r, (C0468k1) this.f7776s, (C0371o) obj, iW);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iW2 = C0345b.w(this.f7777t | 1);
                AbstractC0534a.e(this.f7775r, (C0468k1) this.f7776s, (C0371o) obj, iW2);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1127b.a((X.e) this.f7776s, (C0371o) obj, C0345b.w(this.f7775r | 1), this.f7777t);
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ V(X.e eVar, int i, int i7) {
        this.f7774q = 2;
        this.f7776s = eVar;
        this.f7775r = i;
        this.f7777t = i7;
    }
}
