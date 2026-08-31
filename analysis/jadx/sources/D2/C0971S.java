package d2;

/* JADX INFO: renamed from: d2.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0971S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12017e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12019h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12023n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        if ((this.f12016d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f12016d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.f12018g ? this.f12014b - this.f12015c : this.f12017e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "State{mTargetPosition=" + this.f12013a + ", mData=null, mItemCount=" + this.f12017e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f12014b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f12015c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f12018g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f12020k + '}';
    }
}
