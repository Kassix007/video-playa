package O3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class G1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G1 f4478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G1 f4479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ G1[] f4480s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        G1 g12 = new G1("CONSENT", 0);
        f4478q = g12;
        G1 g13 = new G1("LEGITIMATE_INTEREST", 1);
        G1 g14 = new G1("FLEXIBLE_CONSENT", 2);
        G1 g15 = new G1("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f4479r = g15;
        f4480s = new G1[]{g12, g13, g14, g15};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G1[] values() {
        return (G1[]) f4480s.clone();
    }
}
