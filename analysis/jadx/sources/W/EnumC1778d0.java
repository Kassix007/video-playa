package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1778d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1778d0 f17945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1778d0 f17946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1778d0[] f17947s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1778d0 enumC1778d0 = new EnumC1778d0("Vertical", 0);
        f17945q = enumC1778d0;
        EnumC1778d0 enumC1778d02 = new EnumC1778d0("Horizontal", 1);
        f17946r = enumC1778d02;
        f17947s = new EnumC1778d0[]{enumC1778d0, enumC1778d02};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1778d0 valueOf(String str) {
        return (EnumC1778d0) Enum.valueOf(EnumC1778d0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1778d0[] values() {
        return (EnumC1778d0[]) f17947s.clone();
    }
}
