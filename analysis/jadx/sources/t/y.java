package t;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f16654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f16655r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z5, B5.a aVar) {
        super(1);
        this.f16654q = z5;
        this.f16655r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        j0.C c7 = (j0.C) obj;
        boolean z5 = !this.f16654q && ((Boolean) this.f16655r.invoke()).booleanValue();
        if (c7.f13662A != z5) {
            c7.f13667q |= 16384;
            c7.f13662A = z5;
        }
        return C1386y.f15098a;
    }
}
