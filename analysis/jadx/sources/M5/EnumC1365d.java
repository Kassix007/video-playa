package m5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1365d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1365d f15073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1365d[] f15074r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1365d enumC1365d = new EnumC1365d("WARNING", 0);
        f15073q = enumC1365d;
        f15074r = new EnumC1365d[]{enumC1365d, new EnumC1365d("ERROR", 1), new EnumC1365d("HIDDEN", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1365d valueOf(String str) {
        return (EnumC1365d) Enum.valueOf(EnumC1365d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1365d[] values() {
        return (EnumC1365d[]) f15074r.clone();
    }
}
