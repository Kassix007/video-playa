package y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1922b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC1922b[] f18652q = {new EnumC1922b("PRESENT", 0), new EnumC1922b("ABSENT", 1), new EnumC1922b("PRESENT_OPTIONAL", 2), new EnumC1922b("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1922b EF5;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1922b valueOf(String str) {
        return (EnumC1922b) Enum.valueOf(EnumC1922b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1922b[] values() {
        return (EnumC1922b[]) f18652q.clone();
    }
}
