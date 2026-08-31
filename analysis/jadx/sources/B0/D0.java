package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final D0 f221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final D0 f222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D0 f223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ D0[] f224t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        D0 d02 = new D0("ContinueTraversal", 0);
        f221q = d02;
        D0 d03 = new D0("SkipSubtreeAndContinueTraversal", 1);
        f222r = d03;
        D0 d04 = new D0("CancelTraversal", 2);
        f223s = d04;
        f224t = new D0[]{d02, d03, d04};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D0 valueOf(String str) {
        return (D0) Enum.valueOf(D0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D0[] values() {
        return (D0[]) f224t.clone();
    }
}
