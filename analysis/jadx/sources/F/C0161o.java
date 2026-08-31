package F;

import w.InterfaceC1775c;

/* JADX INFO: renamed from: F.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161o implements InterfaceC1775c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151e f1900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1775c f1901c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0161o(C0151e c0151e, InterfaceC1775c interfaceC1775c) {
        this.f1900b = c0151e;
        this.f1901c = interfaceC1775c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.InterfaceC1775c
    public final float a(float f, float f7, float f8) {
        float fA = this.f1901c.a(f, f7, f8);
        boolean z5 = false;
        if (f <= 0.0f ? f + f7 <= 0.0f : f + f7 > f8) {
            z5 = true;
        }
        float fAbs = Math.abs(fA);
        C0151e c0151e = this.f1900b;
        if (fAbs == 0.0f || !z5) {
            if (Math.abs(c0151e.f) < 1.0E-6d) {
                return 0.0f;
            }
            float fN = c0151e.f * (-1.0f);
            if (((Boolean) c0151e.f1816F.getValue()).booleanValue()) {
                fN += c0151e.n();
            }
            return D5.a.p(fN, -f8, f8);
        }
        float fN2 = c0151e.f * (-1);
        while (fA > 0.0f && fN2 < fA) {
            fN2 += c0151e.n();
        }
        while (fA < 0.0f && fN2 > fA) {
            fN2 -= c0151e.n();
        }
        return fN2;
    }
}
