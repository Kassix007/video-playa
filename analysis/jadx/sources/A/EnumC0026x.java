package A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0026x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0026x f153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0026x f154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0026x f155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC0026x[] f156t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0026x enumC0026x = new EnumC0026x("Vertical", 0);
        f153q = enumC0026x;
        EnumC0026x enumC0026x2 = new EnumC0026x("Horizontal", 1);
        f154r = enumC0026x2;
        EnumC0026x enumC0026x3 = new EnumC0026x("Both", 2);
        f155s = enumC0026x3;
        f156t = new EnumC0026x[]{enumC0026x, enumC0026x2, enumC0026x3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0026x valueOf(String str) {
        return (EnumC0026x) Enum.valueOf(EnumC0026x.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0026x[] values() {
        return (EnumC0026x[]) f156t.clone();
    }
}
