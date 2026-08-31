package p3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1451d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1451d f15756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1451d f15757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1451d[] f15758s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1451d enumC1451d = new EnumC1451d("all", 0);
        f15756q = enumC1451d;
        EnumC1451d enumC1451d2 = new EnumC1451d("aural", 1);
        EnumC1451d enumC1451d3 = new EnumC1451d("braille", 2);
        EnumC1451d enumC1451d4 = new EnumC1451d("embossed", 3);
        EnumC1451d enumC1451d5 = new EnumC1451d("handheld", 4);
        EnumC1451d enumC1451d6 = new EnumC1451d("print", 5);
        EnumC1451d enumC1451d7 = new EnumC1451d("projection", 6);
        EnumC1451d enumC1451d8 = new EnumC1451d("screen", 7);
        f15757r = enumC1451d8;
        f15758s = new EnumC1451d[]{enumC1451d, enumC1451d2, enumC1451d3, enumC1451d4, enumC1451d5, enumC1451d6, enumC1451d7, enumC1451d8, new EnumC1451d("speech", 8), new EnumC1451d("tty", 9), new EnumC1451d("tv", 10)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1451d valueOf(String str) {
        return (EnumC1451d) Enum.valueOf(EnumC1451d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1451d[] values() {
        return (EnumC1451d[]) f15758s.clone();
    }
}
