package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0653p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0653p f9556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0653p f9557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0653p f9558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0653p f9559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0653p f9560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0653p[] f9561v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0653p enumC0653p = new EnumC0653p("DESTROYED", 0);
        f9556q = enumC0653p;
        EnumC0653p enumC0653p2 = new EnumC0653p("INITIALIZED", 1);
        f9557r = enumC0653p2;
        EnumC0653p enumC0653p3 = new EnumC0653p("CREATED", 2);
        f9558s = enumC0653p3;
        EnumC0653p enumC0653p4 = new EnumC0653p("STARTED", 3);
        f9559t = enumC0653p4;
        EnumC0653p enumC0653p5 = new EnumC0653p("RESUMED", 4);
        f9560u = enumC0653p5;
        f9561v = new EnumC0653p[]{enumC0653p, enumC0653p2, enumC0653p3, enumC0653p4, enumC0653p5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0653p valueOf(String str) {
        return (EnumC0653p) Enum.valueOf(EnumC0653p.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0653p[] values() {
        return (EnumC0653p[]) f9561v.clone();
    }
}
