package w;

import c0.C0726n;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements InterfaceC1788i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f17752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f17753b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0(H0 h02, E0 e02) {
        this.f17752a = h02;
        this.f17753b = e02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.InterfaceC1788i0
    public final float a(float f) {
        float fAbs = Math.abs(f);
        H0 h02 = this.f17752a;
        if (fAbs != 0.0f && ((f > 0.0f && !h02.f17790a.c()) || ((f < 0.0f && !h02.f17790a.a()) || !((Boolean) h02.f17795g.invoke()).booleanValue()))) {
            throw new C0726n("The fling animation was cancelled", 4);
        }
        return h02.d(h02.g(this.f17753b.a(2, h02.e(h02.h(f)))));
    }
}
