package m;

/* JADX INFO: renamed from: m.L0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1266L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14685e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14687h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, int i7) {
        this.f14683c = i;
        this.f14684d = i7;
        this.f14687h = true;
        if (this.f14686g) {
            if (i7 != Integer.MIN_VALUE) {
                this.f14681a = i7;
            }
            if (i != Integer.MIN_VALUE) {
                this.f14682b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f14681a = i;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f14682b = i7;
        }
    }
}
