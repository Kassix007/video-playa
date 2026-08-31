package c3;

import a3.y;
import d3.InterfaceC1001a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1001a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.e f10219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i3.l f10220c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(y yVar, j3.b bVar, i3.k kVar) {
        this.f10218a = yVar;
        d3.e eVarF = kVar.f13606a.f();
        this.f10219b = eVarF;
        bVar.d(eVarF);
        eVarF.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(int i, int i7) {
        int i8 = i / i7;
        if ((i ^ i7) < 0 && i8 * i7 != i) {
            i8--;
        }
        return i - (i8 * i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10218a.invalidateSelf();
    }

    @Override // c3.d
    public final void c(List list, List list2) {
    }
}
