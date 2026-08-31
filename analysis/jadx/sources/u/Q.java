package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Q f16819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Q[] f16820r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Q q7 = new Q("Restart", 0);
        f16819q = q7;
        f16820r = new Q[]{q7, new Q("Reverse", 1)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Q[] values() {
        return (Q[]) f16820r.clone();
    }
}
