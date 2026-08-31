package M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A0 f3276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A0 f3277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final A0 f3278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final A0 f3279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final A0 f3280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ A0[] f3281v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        A0 a02 = new A0("TopBar", 0);
        f3276q = a02;
        A0 a03 = new A0("MainContent", 1);
        f3277r = a03;
        A0 a04 = new A0("Snackbar", 2);
        f3278s = a04;
        A0 a05 = new A0("Fab", 3);
        f3279t = a05;
        A0 a06 = new A0("BottomBar", 4);
        f3280u = a06;
        f3281v = new A0[]{a02, a03, a04, a05, a06};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static A0 valueOf(String str) {
        return (A0) Enum.valueOf(A0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static A0[] values() {
        return (A0[]) f3281v.clone();
    }
}
