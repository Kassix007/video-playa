package P;

/* JADX INFO: renamed from: P.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5384a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0343a(int i) {
        this.f5384a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return this.f5384a != Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return super.toString() + "{ location = " + this.f5384a + " }";
    }
}
