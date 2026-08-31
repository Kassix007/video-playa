package p0;

import B0.G0;
import i1.C1134a;
import l0.InterfaceC1221d;
import m5.C1386y;

/* JADX INFO: renamed from: p0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1429C extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1430D f15477r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1429C(C1430D c1430d, int i) {
        super(1);
        this.f15476q = i;
        this.f15477r = c1430d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [B5.a, kotlin.jvm.internal.n] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f15476q) {
            case 0:
                C1430D c1430d = this.f15477r;
                c1430d.f15480d = true;
                c1430d.f.invoke();
                return C1386y.f15098a;
            default:
                InterfaceC1221d interfaceC1221d = (InterfaceC1221d) obj;
                C1430D c1430d2 = this.f15477r;
                C1435c c1435c = c1430d2.f15478b;
                float f = c1430d2.f15484k;
                float f7 = c1430d2.f15485l;
                G0 g0Z = interfaceC1221d.z();
                long jE = g0Z.E();
                g0Z.t().k();
                try {
                    ((C1134a) g0Z.f234r).y(f, f7, 0L);
                    c1435c.a(interfaceC1221d);
                    g0Z.t().i();
                    g0Z.X(jE);
                    return C1386y.f15098a;
                } catch (Throwable th) {
                    g0Z.t().i();
                    g0Z.X(jE);
                    throw th;
                }
        }
    }
}
