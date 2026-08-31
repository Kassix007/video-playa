package m5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1370i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1370i f15077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1370i f15078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC1370i[] f15079s;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1370i EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1370i enumC1370i = new EnumC1370i("SYNCHRONIZED", 0);
        EnumC1370i enumC1370i2 = new EnumC1370i("PUBLICATION", 1);
        f15077q = enumC1370i2;
        EnumC1370i enumC1370i3 = new EnumC1370i("NONE", 2);
        f15078r = enumC1370i3;
        f15079s = new EnumC1370i[]{enumC1370i, enumC1370i2, enumC1370i3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1370i valueOf(String str) {
        return (EnumC1370i) Enum.valueOf(EnumC1370i.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1370i[] values() {
        return (EnumC1370i[]) f15079s.clone();
    }
}
