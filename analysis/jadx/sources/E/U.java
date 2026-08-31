package E;

import B0.A0;
import B0.C0029a;
import c0.AbstractC0724l;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0724l implements A0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B5.a f1505E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public P f1506F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public EnumC1778d0 f1507G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f1508H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public I0.g f1509I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final S f1510J = new S(this, 0);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public S f1511K;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(B5.a aVar, P p7, EnumC1778d0 enumC1778d0, boolean z5) {
        this.f1505E = aVar;
        this.f1506F = p7;
        this.f1507G = enumC1778d0;
        this.f1508H = z5;
        x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final void A(I0.i iVar) {
        H5.k[] kVarArr = I0.r.f2326a;
        I0.s sVar = I0.p.f2311m;
        H5.k[] kVarArr2 = I0.r.f2326a;
        H5.k kVar = kVarArr2[6];
        sVar.a(iVar, Boolean.TRUE);
        iVar.j(I0.p.f2299I, this.f1510J);
        if (this.f1507G == EnumC1778d0.f17945q) {
            I0.g gVar = this.f1509I;
            if (gVar == null) {
                kotlin.jvm.internal.m.k("scrollAxisRange");
                throw null;
            }
            I0.s sVar2 = I0.p.f2318t;
            H5.k kVar2 = kVarArr2[11];
            sVar2.a(iVar, gVar);
        } else {
            I0.g gVar2 = this.f1509I;
            if (gVar2 == null) {
                kotlin.jvm.internal.m.k("scrollAxisRange");
                throw null;
            }
            I0.s sVar3 = I0.p.f2317s;
            H5.k kVar3 = kVarArr2[10];
            sVar3.a(iVar, gVar2);
        }
        S s6 = this.f1511K;
        if (s6 != null) {
            iVar.j(I0.h.f, new I0.a(null, s6));
        }
        iVar.j(I0.h.f2233A, new I0.a(null, new C0029a(15, new Q(this, 0))));
        I0.b bVarC = this.f1506F.c();
        I0.s sVar4 = I0.p.f;
        H5.k kVar4 = kVarArr2[21];
        sVar4.a(iVar, bVarC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x0() {
        this.f1509I = new I0.g(new Q(this, 1), new Q(this, 2));
        this.f1511K = this.f1508H ? new S(this, 1) : null;
    }
}
