package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1760h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1760h f17534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1760h[] f17535r;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1760h EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1760h enumC1760h = new EnumC1760h("IGNORE", 0);
        EnumC1760h enumC1760h2 = new EnumC1760h("RESPECT_PERFORMANCE", 1);
        f17534q = enumC1760h2;
        f17535r = new EnumC1760h[]{enumC1760h, enumC1760h2, new EnumC1760h("RESPECT_ALL", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1760h valueOf(String str) {
        return (EnumC1760h) Enum.valueOf(EnumC1760h.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1760h[] values() {
        return (EnumC1760h[]) f17535r.clone();
    }
}
