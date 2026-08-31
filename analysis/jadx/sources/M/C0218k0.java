package M;

import P.S0;
import l0.C1224g;
import l0.InterfaceC1221d;
import m5.C1386y;
import u.C1626E;

/* JADX INFO: renamed from: M.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218k0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f3555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1224g f3556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S0 f3557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S0 f3558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0 f3559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ S0 f3560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f3561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f3562x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218k0(long j, C1224g c1224g, C1626E c1626e, C1626E c1626e2, C1626E c1626e3, C1626E c1626e4, float f, long j7) {
        super(1);
        this.f3555q = j;
        this.f3556r = c1224g;
        this.f3557s = c1626e;
        this.f3558t = c1626e2;
        this.f3559u = c1626e3;
        this.f3560v = c1626e4;
        this.f3561w = f;
        this.f3562x = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        float f;
        InterfaceC1221d interfaceC1221d = (InterfaceC1221d) obj;
        long j = this.f3555q;
        C1224g c1224g = this.f3556r;
        q0.d(interfaceC1221d, 0.0f, 360.0f, j, c1224g);
        float fFloatValue = (((Number) this.f3557s.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f3558t.getValue()).floatValue();
        S0 s02 = this.f3559u;
        float fAbs = Math.abs(fFloatValue2 - ((Number) s02.getValue()).floatValue());
        float fFloatValue3 = ((Number) s02.getValue()).floatValue() + ((Number) this.f3560v.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (c1224g.f14433d == 0) {
            f = 0.0f;
        } else {
            f = ((this.f3561w / (q0.f3606e / 2)) * 57.29578f) / 2.0f;
        }
        q0.d(interfaceC1221d, fFloatValue3 + f, Math.max(fAbs, 0.1f), this.f3562x, c1224g);
        return C1386y.f15098a;
    }
}
