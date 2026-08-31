package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G f225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G f226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final G f227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final G f228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final G f229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ G[] f230v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        G g7 = new G("Measuring", 0);
        f225q = g7;
        G g8 = new G("LookaheadMeasuring", 1);
        f226r = g8;
        G g9 = new G("LayingOut", 2);
        f227s = g9;
        G g10 = new G("LookaheadLayingOut", 3);
        f228t = g10;
        G g11 = new G("Idle", 4);
        f229u = g11;
        f230v = new G[]{g7, g8, g9, g10, g11};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G[] values() {
        return (G[]) f230v.clone();
    }
}
