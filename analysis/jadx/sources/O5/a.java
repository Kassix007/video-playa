package O5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f5206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f5207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f5208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f5209t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a aVar = new a("SUSPEND", 0);
        f5206q = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f5207r = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f5208s = aVar3;
        f5209t = new a[]{aVar, aVar2, aVar3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a[] values() {
        return (a[]) f5209t.clone();
    }
}
