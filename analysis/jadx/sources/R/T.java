package r;

/* JADX INFO: loaded from: classes.dex */
public final class T extends n5.w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f16172r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T(S s6) {
        this.f16172r = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16171q < this.f16172r.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.w
    public final int nextInt() {
        int i = this.f16171q;
        this.f16171q = i + 1;
        return this.f16172r.d(i);
    }
}
