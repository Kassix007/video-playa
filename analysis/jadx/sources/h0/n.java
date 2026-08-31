package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n f13430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f13431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n f13432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f13433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ n[] f13434u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        n nVar = new n("Active", 0);
        f13430q = nVar;
        n nVar2 = new n("ActiveParent", 1);
        f13431r = nVar2;
        n nVar3 = new n("Captured", 2);
        f13432s = nVar3;
        n nVar4 = new n("Inactive", 3);
        f13433t = nVar4;
        f13434u = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n[] values() {
        return (n[]) f13434u.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new C2.e();
            }
        }
        return true;
    }
}
