package a0;

import m5.C1386y;

/* JADX INFO: renamed from: a0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0600b extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f8648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.c f8649s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0600b(B5.c cVar, B5.c cVar2, int i) {
        super(1);
        this.f8647q = i;
        this.f8648r = cVar;
        this.f8649s = cVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f8647q) {
            case 0:
                l lVar = (l) obj;
                synchronized (n.f8680b) {
                    j = n.f8682d;
                    n.f8682d = 1 + j;
                }
                return new C0602d(j, lVar, this.f8648r, this.f8649s);
            case 1:
                this.f8648r.invoke(obj);
                this.f8649s.invoke(obj);
                return C1386y.f15098a;
            default:
                this.f8648r.invoke(obj);
                this.f8649s.invoke(obj);
                return C1386y.f15098a;
        }
    }
}
