package P;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: P.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0374p0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0374p0 f5490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0374p0 f5491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0374p0 f5492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0374p0 f5493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0374p0 f5494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumC0374p0 f5495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC0374p0[] f5496w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0374p0 enumC0374p0 = new EnumC0374p0("ShutDown", 0);
        f5490q = enumC0374p0;
        EnumC0374p0 enumC0374p02 = new EnumC0374p0("ShuttingDown", 1);
        f5491r = enumC0374p02;
        EnumC0374p0 enumC0374p03 = new EnumC0374p0("Inactive", 2);
        f5492s = enumC0374p03;
        EnumC0374p0 enumC0374p04 = new EnumC0374p0("InactivePendingWork", 3);
        f5493t = enumC0374p04;
        EnumC0374p0 enumC0374p05 = new EnumC0374p0("Idle", 4);
        f5494u = enumC0374p05;
        EnumC0374p0 enumC0374p06 = new EnumC0374p0("PendingWork", 5);
        f5495v = enumC0374p06;
        f5496w = new EnumC0374p0[]{enumC0374p0, enumC0374p02, enumC0374p03, enumC0374p04, enumC0374p05, enumC0374p06};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0374p0 valueOf(String str) {
        return (EnumC0374p0) Enum.valueOf(EnumC0374p0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0374p0[] values() {
        return (EnumC0374p0[]) f5496w.clone();
    }
}
