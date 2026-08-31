package M;

import P.C0346b0;
import com.google.android.gms.internal.measurement.P1;
import q5.InterfaceC1524c;
import u0.InterfaceC1672a;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements InterfaceC1672a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I0 f3296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f3297r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E0(I0 i02, B5.c cVar) {
        this.f3296q = i02;
        this.f3297r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long F(int i, long j, long j7) {
        if (i != 1) {
            return 0L;
        }
        N.r rVar = this.f3296q.f3322c;
        float fE = rVar.e(Float.intBitsToFloat((int) (4294967295L & j7)));
        C0346b0 c0346b0 = rVar.j;
        float fE2 = Float.isNaN(c0346b0.e()) ? 0.0f : c0346b0.e();
        c0346b0.f(fE);
        return P1.b(0.0f, fE - fE2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final Object I(long j, InterfaceC1524c interfaceC1524c) {
        float fC = W0.p.c(j);
        I0 i02 = this.f3296q;
        float f = i02.f3322c.f();
        float fC2 = i02.f3322c.d().c();
        if (fC >= 0.0f || f <= fC2) {
            j = 0;
        } else {
            this.f3297r.invoke(new Float(fC));
        }
        return new W0.p(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long b0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        N.r rVar = this.f3296q.f3322c;
        float fE = rVar.e(fIntBitsToFloat);
        C0346b0 c0346b0 = rVar.j;
        float fE2 = Float.isNaN(c0346b0.e()) ? 0.0f : c0346b0.e();
        c0346b0.f(fE);
        return P1.b(0.0f, fE - fE2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final Object n(long j, long j7, InterfaceC1524c interfaceC1524c) {
        this.f3297r.invoke(new Float(W0.p.c(j7)));
        return new W0.p(j7);
    }
}
