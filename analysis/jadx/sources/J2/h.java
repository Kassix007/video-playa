package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f2767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f2768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f2769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f2770t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ h[] f2771u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        h hVar = new h("MEMORY_CACHE", 0);
        f2767q = hVar;
        h hVar2 = new h("MEMORY", 1);
        f2768r = hVar2;
        h hVar3 = new h("DISK", 2);
        f2769s = hVar3;
        h hVar4 = new h("NETWORK", 3);
        f2770t = hVar4;
        f2771u = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h[] values() {
        return (h[]) f2771u.clone();
    }
}
