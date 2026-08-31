package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1654i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1654i f16936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1654i f16937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1654i[] f16938s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1654i enumC1654i = new EnumC1654i("BoundReached", 0);
        f16936q = enumC1654i;
        EnumC1654i enumC1654i2 = new EnumC1654i("Finished", 1);
        f16937r = enumC1654i2;
        f16938s = new EnumC1654i[]{enumC1654i, enumC1654i2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1654i valueOf(String str) {
        return (EnumC1654i) Enum.valueOf(EnumC1654i.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1654i[] values() {
        return (EnumC1654i[]) f16938s.clone();
    }
}
