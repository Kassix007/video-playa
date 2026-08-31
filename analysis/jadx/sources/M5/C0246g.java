package M5;

import m5.C1386y;

/* JADX INFO: renamed from: M5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0246g implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3849r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0246g(int i, Object obj) {
        this.f3848q = i;
        this.f3849r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f3848q) {
            case 0:
                ((J5.i) this.f3849r).invoke((Throwable) obj);
                break;
            case 1:
                U5.c cVar = (U5.c) this.f3849r;
                U5.c.f7896h.set(cVar, null);
                cVar.g(null);
                break;
            default:
                ((U5.h) this.f3849r).c();
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0246g(U5.c cVar, U5.b bVar) {
        this.f3848q = 1;
        this.f3849r = cVar;
    }
}
