package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1738g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1738g f17454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1738g f17455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1738g f17456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC1738g[] f17457t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1738g enumC1738g = new EnumC1738g("Initial", 0);
        f17454q = enumC1738g;
        EnumC1738g enumC1738g2 = new EnumC1738g("Main", 1);
        f17455r = enumC1738g2;
        EnumC1738g enumC1738g3 = new EnumC1738g("Final", 2);
        f17456s = enumC1738g3;
        f17457t = new EnumC1738g[]{enumC1738g, enumC1738g2, enumC1738g3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1738g valueOf(String str) {
        return (EnumC1738g) Enum.valueOf(EnumC1738g.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1738g[] values() {
        return (EnumC1738g[]) f17457t.clone();
    }
}
