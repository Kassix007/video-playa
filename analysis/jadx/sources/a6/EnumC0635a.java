package a6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0635a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0635a f9016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC0635a[] f9017r;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0635a EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0635a enumC0635a = new EnumC0635a("NONE", 0);
        EnumC0635a enumC0635a2 = new EnumC0635a("ALL_JSON_OBJECTS", 1);
        EnumC0635a enumC0635a3 = new EnumC0635a("POLYMORPHIC", 2);
        f9016q = enumC0635a3;
        f9017r = new EnumC0635a[]{enumC0635a, enumC0635a2, enumC0635a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0635a valueOf(String str) {
        return (EnumC0635a) Enum.valueOf(EnumC0635a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0635a[] values() {
        return (EnumC0635a[]) f9017r.clone();
    }
}
