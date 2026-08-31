package r5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1580a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1580a f16356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1580a f16357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1580a f16358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC1580a[] f16359t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1580a enumC1580a = new EnumC1580a("COROUTINE_SUSPENDED", 0);
        f16356q = enumC1580a;
        EnumC1580a enumC1580a2 = new EnumC1580a("UNDECIDED", 1);
        f16357r = enumC1580a2;
        EnumC1580a enumC1580a3 = new EnumC1580a("RESUMED", 2);
        f16358s = enumC1580a3;
        f16359t = new EnumC1580a[]{enumC1580a, enumC1580a2, enumC1580a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1580a valueOf(String str) {
        return (EnumC1580a) Enum.valueOf(EnumC1580a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1580a[] values() {
        return (EnumC1580a[]) f16359t.clone();
    }
}
