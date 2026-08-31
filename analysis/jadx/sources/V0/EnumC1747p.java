package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1747p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1747p f17483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1747p f17484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1747p f17485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC1747p[] f17486t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1747p enumC1747p = new EnumC1747p("Unknown", 0);
        f17483q = enumC1747p;
        EnumC1747p enumC1747p2 = new EnumC1747p("Dispatching", 1);
        f17484r = enumC1747p2;
        EnumC1747p enumC1747p3 = new EnumC1747p("NotDispatching", 2);
        f17485s = enumC1747p3;
        f17486t = new EnumC1747p[]{enumC1747p, enumC1747p2, enumC1747p3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1747p valueOf(String str) {
        return (EnumC1747p) Enum.valueOf(EnumC1747p.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1747p[] values() {
        return (EnumC1747p[]) f17486t.clone();
    }
}
