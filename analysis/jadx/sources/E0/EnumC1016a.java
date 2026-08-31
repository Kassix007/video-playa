package e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1016a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1016a f12472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1016a f12473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1016a[] f12474s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1016a enumC1016a = new EnumC1016a("SHOW_ORIGINAL", 0);
        f12472q = enumC1016a;
        EnumC1016a enumC1016a2 = new EnumC1016a("SHOW_TRANSLATED", 1);
        f12473r = enumC1016a2;
        f12474s = new EnumC1016a[]{enumC1016a, enumC1016a2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1016a valueOf(String str) {
        return (EnumC1016a) Enum.valueOf(EnumC1016a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1016a[] values() {
        return (EnumC1016a[]) f12474s.clone();
    }
}
