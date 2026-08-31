package W0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f8022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f8023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ l[] f8024s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        l lVar = new l("Ltr", 0);
        f8022q = lVar;
        l lVar2 = new l("Rtl", 1);
        f8023r = lVar2;
        f8024s = new l[]{lVar, lVar2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l[] values() {
        return (l[]) f8024s.clone();
    }
}
