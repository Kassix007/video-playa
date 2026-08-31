package Z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f8424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f8425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f8426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f8427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f[] f8428u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f fVar = new f("FETCH", 0);
        f8424q = fVar;
        f fVar2 = new f("XML_HTTP", 1);
        f8425r = fVar2;
        f fVar3 = new f("FORM", 2);
        f8426s = fVar3;
        f fVar4 = new f("HTML", 3);
        f8427t = fVar4;
        f8428u = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f[] values() {
        return (f[]) f8428u.clone();
    }
}
