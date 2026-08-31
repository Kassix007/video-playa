package d2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12105e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        int i = this.f12101a;
        int i7 = 2;
        if ((i & 7) != 0) {
            int i8 = this.f12104d;
            int i9 = this.f12102b;
            if (((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i10 = this.f12104d;
            int i11 = this.f12103c;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i12 = this.f12105e;
            int i13 = this.f12102b;
            if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i14 = this.f12105e;
            int i15 = this.f12103c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if ((i & (i7 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
