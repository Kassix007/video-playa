package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0622a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0622a f8809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0622a f8810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0622a[] f8811s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0622a enumC0622a = new EnumC0622a("AUTOMATIC", 0);
        f8809q = enumC0622a;
        EnumC0622a enumC0622a2 = new EnumC0622a("ENABLED", 1);
        f8810r = enumC0622a2;
        f8811s = new EnumC0622a[]{enumC0622a, enumC0622a2, new EnumC0622a("DISABLED", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0622a valueOf(String str) {
        return (EnumC0622a) Enum.valueOf(EnumC0622a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0622a[] values() {
        return (EnumC0622a[]) f8811s.clone();
    }
}
