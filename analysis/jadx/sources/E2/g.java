package E2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f1684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f1685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ g[] f1686s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        g gVar = new g("FILL", 0);
        f1684q = gVar;
        g gVar2 = new g("FIT", 1);
        f1685r = gVar2;
        f1686s = new g[]{gVar, gVar2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g[] values() {
        return (g[]) f1686s.clone();
    }
}
