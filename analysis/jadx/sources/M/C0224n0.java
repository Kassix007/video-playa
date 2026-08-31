package M;

import com.google.android.gms.internal.measurement.P1;
import i0.C1133e;
import l0.InterfaceC1221d;
import m5.C1386y;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: M.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0224n0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f3581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3582r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224n0(long j, int i) {
        super(1);
        this.f3581q = j;
        this.f3582r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        InterfaceC1221d interfaceC1221d = (InterfaceC1221d) obj;
        float fMin = Math.min(interfaceC1221d.u(AbstractC0216j0.f3551a), C1133e.b(interfaceC1221d.d()));
        float fB = (C1133e.b(interfaceC1221d.d()) - fMin) / 2;
        long j = this.f3581q;
        if (this.f3582r == 1) {
            float f = fMin / 2.0f;
            InterfaceC1221d.V(interfaceC1221d, j, f, P1.b((C1133e.d(interfaceC1221d.d()) - f) - fB, C1133e.b(interfaceC1221d.d()) / 2.0f), 120);
        } else {
            InterfaceC1221d.g0(interfaceC1221d, j, P1.b((C1133e.d(interfaceC1221d.d()) - fMin) - fB, (C1133e.b(interfaceC1221d.d()) - fMin) / 2.0f), AbstractC1397A.g(fMin, fMin), 0.0f, 120);
        }
        return C1386y.f15098a;
    }
}
