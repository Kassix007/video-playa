package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1109b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1109b f13396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1109b f13397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1109b f13398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC1109b[] f13399t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1109b enumC1109b = new EnumC1109b("None", 0);
        f13396q = enumC1109b;
        EnumC1109b enumC1109b2 = new EnumC1109b("Cancelled", 1);
        f13397r = enumC1109b2;
        EnumC1109b enumC1109b3 = new EnumC1109b("Redirected", 2);
        f13398s = enumC1109b3;
        f13399t = new EnumC1109b[]{enumC1109b, enumC1109b2, enumC1109b3, new EnumC1109b("RedirectCancelled", 3)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1109b valueOf(String str) {
        return (EnumC1109b) Enum.valueOf(EnumC1109b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1109b[] values() {
        return (EnumC1109b[]) f13399t.clone();
    }
}
