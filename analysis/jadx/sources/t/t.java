package t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f16637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t f16638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t f16639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ t[] f16640t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        t tVar = new t("PreEnter", 0);
        f16637q = tVar;
        t tVar2 = new t("Visible", 1);
        f16638r = tVar2;
        t tVar3 = new t("PostExit", 2);
        f16639s = tVar3;
        f16640t = new t[]{tVar, tVar2, tVar3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t[] values() {
        return (t[]) f16640t.clone();
    }
}
