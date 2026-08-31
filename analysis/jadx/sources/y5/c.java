package y5;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1921a f18653c = new C1921a(-1, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18655b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new c(-1, true, false);
        new c(76, false, true);
        new c(64, false, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(int i, boolean z5, boolean z6) {
        this.f18654a = z5;
        this.f18655b = z6;
        if (z5 && z6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
