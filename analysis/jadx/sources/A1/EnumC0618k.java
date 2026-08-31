package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0618k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0618k f8748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC0618k[] f8749r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0618k enumC0618k = new EnumC0618k("Inherit", 0);
        f8748q = enumC0618k;
        f8749r = new EnumC0618k[]{enumC0618k, new EnumC0618k("SecureOn", 1), new EnumC0618k("SecureOff", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0618k valueOf(String str) {
        return (EnumC0618k) Enum.valueOf(EnumC0618k.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0618k[] values() {
        return (EnumC0618k[]) f8749r.clone();
    }
}
