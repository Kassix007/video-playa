package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1757e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1757e f17524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1757e f17525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1757e f17526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1757e f17527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC1757e[] f17528u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1757e enumC1757e = new EnumC1757e("MEMORY_CACHE", 0);
        f17524q = enumC1757e;
        EnumC1757e enumC1757e2 = new EnumC1757e("MEMORY", 1);
        f17525r = enumC1757e2;
        EnumC1757e enumC1757e3 = new EnumC1757e("DISK", 2);
        f17526s = enumC1757e3;
        EnumC1757e enumC1757e4 = new EnumC1757e("NETWORK", 3);
        f17527t = enumC1757e4;
        f17528u = new EnumC1757e[]{enumC1757e, enumC1757e2, enumC1757e3, enumC1757e4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1757e valueOf(String str) {
        return (EnumC1757e) Enum.valueOf(EnumC1757e.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1757e[] values() {
        return (EnumC1757e[]) f17528u.clone();
    }
}
