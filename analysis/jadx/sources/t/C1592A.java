package t;

import B0.N;
import j0.AbstractC1145B;
import l0.AbstractC1220c;
import l0.C1219b;
import l0.C1223f;
import l0.InterfaceC1221d;
import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: renamed from: t.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1592A extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f16566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f16567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16569u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1592A(Object obj, long j, long j7, Object obj2, int i) {
        super(1);
        this.f16565q = i;
        this.f16568t = obj;
        this.f16566r = j;
        this.f16567s = j7;
        this.f16569u = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f16565q) {
            case 0:
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                AbstractC1933J abstractC1933J = (AbstractC1933J) this.f16568t;
                long j = this.f16566r;
                long j7 = this.f16567s;
                A.J j8 = (A.J) this.f16569u;
                abstractC1932I.getClass();
                AbstractC1932I.a(abstractC1932I, abstractC1933J);
                abstractC1933J.U(W0.i.c((((long) (((int) (j >> 32)) + ((int) (j7 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j7 & 4294967295L)))) & 4294967295L), abstractC1933J.f18668u), 0.0f, j8);
                break;
            default:
                N n7 = (N) obj;
                n7.a();
                AbstractC1145B abstractC1145B = (AbstractC1145B) this.f16568t;
                AbstractC1220c abstractC1220c = (AbstractC1220c) this.f16569u;
                long j9 = (104 & 2) != 0 ? 0L : this.f16566r;
                long jK0 = (104 & 4) != 0 ? InterfaceC1221d.k0(n7.f296q.d(), j9) : this.f16567s;
                float f = (104 & 8) != 0 ? 1.0f : 0.0f;
                if ((104 & 16) != 0) {
                    abstractC1220c = C1223f.f14430b;
                }
                C1219b c1219b = n7.f296q;
                int i = (int) (j9 >> 32);
                int i7 = (int) (j9 & 4294967295L);
                c1219b.f14424q.f14422c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (jK0 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jK0 & 4294967295L)) + Float.intBitsToFloat(i7), c1219b.c(abstractC1145B, abstractC1220c, f, null, 3, 1));
                break;
        }
        return C1386y.f15098a;
    }
}
