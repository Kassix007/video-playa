package E;

import P.C0354f0;
import P.S0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements S0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f1477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1478t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(int i, int i7, int i8) {
        this.f1475q = i7;
        this.f1476r = i8;
        int i9 = (i / i7) * i7;
        this.f1477s = new C0354f0(D5.a.O(Math.max(i9 - i8, 0), i9 + i7 + i8), P.S.f5377v);
        this.f1478t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        if (i != this.f1478t) {
            this.f1478t = i;
            int i7 = this.f1475q;
            int i8 = (i / i7) * i7;
            int i9 = this.f1476r;
            this.f1477s.setValue(D5.a.O(Math.max(i8 - i9, 0), i8 + i7 + i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return (G5.d) this.f1477s.getValue();
    }
}
