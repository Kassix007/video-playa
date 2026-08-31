package P;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final M f5336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M f5337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final M f5338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final M f5339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ M[] f5340u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        M m4 = new M("IGNORED", 0);
        f5336q = m4;
        M m7 = new M("SCHEDULED", 1);
        f5337r = m7;
        M m8 = new M("DEFERRED", 2);
        f5338s = m8;
        M m9 = new M("IMMINENT", 3);
        f5339t = m9;
        f5340u = new M[]{m4, m7, m8, m9};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static M[] values() {
        return (M[]) f5340u.clone();
    }
}
