package F;

import P.C0346b0;
import java.util.concurrent.CancellationException;
import q5.InterfaceC1524c;
import u0.InterfaceC1672a;

/* JADX INFO: renamed from: F.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0147a implements InterfaceC1672a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0151e f1852q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0147a(C0151e c0151e) {
        this.f1852q = c0151e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long F(int i, long j, long j7) {
        if (i != 2 || Float.intBitsToFloat((int) (j7 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long b0(int i, long j) {
        C0151e c0151e = this.f1852q;
        D d5 = c0151e.f1821d;
        if (i != 1 || Math.abs(((C0346b0) d5.f1779t).e()) <= 1.0E-6d) {
            return 0L;
        }
        float fE = ((C0346b0) d5.f1779t).e() * c0151e.m();
        float f = ((c0151e.k().f1761b + c0151e.k().f1762c) * (-Math.signum(((C0346b0) d5.f1779t).e()))) + fE;
        if (((C0346b0) d5.f1779t).e() > 0.0f) {
            f = fE;
            fE = f;
        }
        float f7 = -c0151e.f1825k.d(-D5.a.p(Float.intBitsToFloat((int) (j >> 32)), fE, f));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final Object n(long j, long j7, InterfaceC1524c interfaceC1524c) {
        return new W0.p(W0.p.a(j7, 0.0f, 0.0f, 1));
    }
}
