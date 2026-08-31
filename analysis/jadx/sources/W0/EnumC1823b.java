package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1823b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1823b f18132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1823b f18133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1823b[] f18134s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1823b enumC1823b = new EnumC1823b("Lsq2", 0);
        f18132q = enumC1823b;
        EnumC1823b enumC1823b2 = new EnumC1823b("Impulse", 1);
        f18133r = enumC1823b2;
        f18134s = new EnumC1823b[]{enumC1823b, enumC1823b2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1823b valueOf(String str) {
        return (EnumC1823b) Enum.valueOf(EnumC1823b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1823b[] values() {
        return (EnumC1823b[]) f18134s.clone();
    }
}
