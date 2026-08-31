package O3;

/* JADX INFO: loaded from: classes.dex */
public enum G0 {
    UNINITIALIZED(0),
    POLICY(1),
    DENIED(2),
    GRANTED(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4477q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    G0(int i) {
        this.f4477q = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return this.f4477q;
    }
}
