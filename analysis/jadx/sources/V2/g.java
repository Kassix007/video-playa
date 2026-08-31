package V2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f7962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g[] f7963r;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        g gVar = new g("FILL", 0);
        g gVar2 = new g("FIT", 1);
        f7962q = gVar2;
        f7963r = new g[]{gVar, gVar2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g[] values() {
        return (g[]) f7963r.clone();
    }
}
