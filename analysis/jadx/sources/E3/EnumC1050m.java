package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1050m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1050m f12601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1050m[] f12602r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1050m enumC1050m = new EnumC1050m("Immediately", 0);
        f12601q = enumC1050m;
        f12602r = new EnumC1050m[]{enumC1050m, new EnumC1050m("OnIterationFinish", 1)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1050m valueOf(String str) {
        return (EnumC1050m) Enum.valueOf(EnumC1050m.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1050m[] values() {
        return (EnumC1050m[]) f12602r.clone();
    }
}
