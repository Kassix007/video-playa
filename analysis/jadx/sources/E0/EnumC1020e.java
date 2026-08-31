package e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1020e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1020e f12499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1020e f12500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1020e[] f12501s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1020e enumC1020e = new EnumC1020e("VIEW_APPEAR", 0);
        f12499q = enumC1020e;
        EnumC1020e enumC1020e2 = new EnumC1020e("VIEW_DISAPPEAR", 1);
        f12500r = enumC1020e2;
        f12501s = new EnumC1020e[]{enumC1020e, enumC1020e2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1020e valueOf(String str) {
        return (EnumC1020e) Enum.valueOf(EnumC1020e.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1020e[] values() {
        return (EnumC1020e[]) f12501s.clone();
    }
}
