package M;

import i0.C1133e;
import l0.InterfaceC1221d;
import m5.C1386y;

/* JADX INFO: renamed from: M.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226o0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f3585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.a f3586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f3588u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B5.c f3589v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226o0(int i, float f, B5.a aVar, long j, long j7, B5.c cVar) {
        super(1);
        this.f3584q = i;
        this.f3585r = f;
        this.f3586s = aVar;
        this.f3587t = j;
        this.f3588u = j7;
        this.f3589v = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        InterfaceC1221d interfaceC1221d = (InterfaceC1221d) obj;
        float fB = C1133e.b(interfaceC1221d.d());
        int i = this.f3584q;
        float fI0 = this.f3585r;
        if (i != 0 && C1133e.b(interfaceC1221d.d()) <= C1133e.d(interfaceC1221d.d())) {
            fI0 += interfaceC1221d.i0(fB);
        }
        float fI02 = fI0 / interfaceC1221d.i0(C1133e.d(interfaceC1221d.d()));
        float fFloatValue = ((Number) this.f3586s.invoke()).floatValue();
        float fMin = Math.min(fFloatValue, fI02) + fFloatValue;
        if (fMin <= 1.0f) {
            q0.c(interfaceC1221d, fMin, 1.0f, this.f3587t, fB, this.f3584q);
        }
        q0.c(interfaceC1221d, 0.0f, fFloatValue, this.f3588u, fB, this.f3584q);
        this.f3589v.invoke(interfaceC1221d);
        return C1386y.f15098a;
    }
}
