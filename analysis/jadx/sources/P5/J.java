package P5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final J f6358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final J f6359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final J f6360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ J[] f6361t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        J j = new J("START", 0);
        f6358q = j;
        J j7 = new J("STOP", 1);
        f6359r = j7;
        J j8 = new J("STOP_AND_RESET_REPLAY_CACHE", 2);
        f6360s = j8;
        f6361t = new J[]{j, j7, j8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static J[] values() {
        return (J[]) f6361t.clone();
    }
}
