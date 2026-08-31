package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1633L {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1633L f16807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1633L[] f16808r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1633L enumC1633L = new EnumC1633L("Default", 0);
        f16807q = enumC1633L;
        f16808r = new EnumC1633L[]{enumC1633L, new EnumC1633L("UserInput", 1), new EnumC1633L("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1633L valueOf(String str) {
        return (EnumC1633L) Enum.valueOf(EnumC1633L.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1633L[] values() {
        return (EnumC1633L[]) f16808r.clone();
    }
}
