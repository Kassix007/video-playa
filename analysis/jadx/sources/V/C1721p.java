package v;

import B0.AbstractC0041g;
import B0.InterfaceC0051p;
import B0.p0;
import c0.AbstractC0724l;
import i0.C1131c;
import i0.C1132d;
import i0.C1133e;
import j0.AbstractC1145B;
import j0.InterfaceC1144A;
import l0.C1219b;
import l0.C1223f;
import l0.InterfaceC1221d;

/* JADX INFO: renamed from: v.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1721p extends AbstractC0724l implements InterfaceC0051p, p0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f17366E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public j0.E f17367F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f17368G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public W0.l f17369H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC1145B f17370I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public j0.E f17371J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AbstractC1145B f17372K;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.p0
    public final void E() {
        this.f17368G = 9205357640488583168L;
        this.f17369H = null;
        this.f17370I = null;
        this.f17371J = null;
        AbstractC0041g.l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(B0.N n7) {
        AbstractC1145B abstractC1145B;
        B0.N n8;
        InterfaceC1144A interfaceC1144A;
        C1219b c1219b = n7.f296q;
        if (this.f17367F != AbstractC1145B.f13658a) {
            if (C1133e.a(c1219b.d(), this.f17368G) && n7.getLayoutDirection() == this.f17369H && kotlin.jvm.internal.m.a(this.f17371J, this.f17367F)) {
                abstractC1145B = this.f17370I;
                kotlin.jvm.internal.m.b(abstractC1145B);
            } else {
                AbstractC0041g.r(this, new B0.K(17, this, n7));
                abstractC1145B = this.f17372K;
                this.f17372K = null;
            }
            this.f17370I = abstractC1145B;
            this.f17368G = c1219b.d();
            this.f17369H = n7.getLayoutDirection();
            this.f17371J = this.f17367F;
            kotlin.jvm.internal.m.b(abstractC1145B);
            if (!j0.o.c(this.f17366E, j0.o.f13722g)) {
                long j = this.f17366E;
                boolean z5 = abstractC1145B instanceof j0.y;
                C1223f c1223f = C1223f.f14430b;
                if (z5) {
                    C1131c c1131c = ((j0.y) abstractC1145B).f13731e;
                    float f = c1131c.f13522a;
                    float f7 = c1131c.f13523b;
                    n7.R(j, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f7)), (((long) Float.floatToRawIntBits(c1131c.f13524c - c1131c.f13522a)) << 32) | (((long) Float.floatToRawIntBits(c1131c.f13525d - c1131c.f13523b)) & 4294967295L), 1.0f, c1223f, 3);
                } else {
                    n8 = n7;
                    if (abstractC1145B instanceof j0.z) {
                        j0.z zVar = (j0.z) abstractC1145B;
                        interfaceC1144A = zVar.f;
                        if (interfaceC1144A == null) {
                            C1132d c1132d = zVar.f13732e;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c1132d.f13532h >> 32));
                            float f8 = c1132d.f13526a;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c1132d.f13527b)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                            float fB = c1132d.b();
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c1132d.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i = (int) (jFloatToRawIntBits >> 32);
                            int i7 = (int) (jFloatToRawIntBits & 4294967295L);
                            c1219b.f14424q.f14422c.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)), C1219b.a(c1219b, j, c1223f, 1.0f, 3));
                            n8 = n7;
                        }
                    } else {
                        if (!(abstractC1145B instanceof j0.x)) {
                            throw new C2.e();
                        }
                        interfaceC1144A = ((j0.x) abstractC1145B).f13730e;
                        n8 = n7;
                    }
                    n8.w(interfaceC1144A, j, c1223f);
                }
            }
            n8.a();
        }
        if (!j0.o.c(this.f17366E, j0.o.f13722g)) {
            InterfaceC1221d.g0(n7, this.f17366E, 0L, 0L, 0.0f, 126);
        }
        n8 = n7;
        n8.a();
    }
}
