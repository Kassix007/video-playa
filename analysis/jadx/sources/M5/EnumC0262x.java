package M5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: M5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0262x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0262x f3895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0262x f3896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0262x f3897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0262x f3898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0262x[] f3899u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0262x enumC0262x = new EnumC0262x("DEFAULT", 0);
        f3895q = enumC0262x;
        EnumC0262x enumC0262x2 = new EnumC0262x("LAZY", 1);
        f3896r = enumC0262x2;
        EnumC0262x enumC0262x3 = new EnumC0262x("ATOMIC", 2);
        f3897s = enumC0262x3;
        EnumC0262x enumC0262x4 = new EnumC0262x("UNDISPATCHED", 3);
        f3898t = enumC0262x4;
        f3899u = new EnumC0262x[]{enumC0262x, enumC0262x2, enumC0262x3, enumC0262x4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0262x valueOf(String str) {
        return (EnumC0262x) Enum.valueOf(EnumC0262x.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0262x[] values() {
        return (EnumC0262x[]) f3899u.clone();
    }
}
