package d1;

import e1.AbstractC1028h;
import e1.C1034n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends C0953d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C0953d[] f11965q0 = new C0953d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f11966r0 = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(int i, C1034n c1034n, ArrayList arrayList) {
        for (int i7 = 0; i7 < this.f11966r0; i7++) {
            C0953d c0953d = this.f11965q0[i7];
            ArrayList arrayList2 = c1034n.f12534a;
            if (!arrayList2.contains(c0953d)) {
                arrayList2.add(c0953d);
            }
        }
        for (int i8 = 0; i8 < this.f11966r0; i8++) {
            AbstractC1028h.b(this.f11965q0[i8], i, arrayList, c1034n);
        }
    }

    public void S() {
    }
}
