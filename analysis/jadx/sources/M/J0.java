package M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final J0 f3323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final J0 f3324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final J0 f3325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ J0[] f3326t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        J0 j02 = new J0("Hidden", 0);
        f3323q = j02;
        J0 j03 = new J0("Expanded", 1);
        f3324r = j03;
        J0 j04 = new J0("PartiallyExpanded", 2);
        f3325s = j04;
        f3326t = new J0[]{j02, j03, j04};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static J0 valueOf(String str) {
        return (J0) Enum.valueOf(J0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static J0[] values() {
        return (J0[]) f3326t.clone();
    }
}
