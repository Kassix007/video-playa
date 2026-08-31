package D2;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1364r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    b(boolean z5, boolean z6) {
        this.f1363q = z5;
        this.f1364r = z6;
    }
}
