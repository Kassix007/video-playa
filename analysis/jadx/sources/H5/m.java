package H5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ m[] f2209q = {new m("PUBLIC", 0), new m("PROTECTED", 1), new m("INTERNAL", 2), new m("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    m EF5;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m[] values() {
        return (m[]) f2209q.clone();
    }
}
