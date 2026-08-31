package K0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f2848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f2849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a[] f2850s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a aVar = new a("On", 0);
        f2848q = aVar;
        a aVar2 = new a("Off", 1);
        f2849r = aVar2;
        f2850s = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a[] values() {
        return (a[]) f2850s.clone();
    }
}
