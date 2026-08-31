package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W f17278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final W f17279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ W[] f17280s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W w3 = new W("Default", 0);
        f17278q = w3;
        W w6 = new W("UserInput", 1);
        f17279r = w6;
        f17280s = new W[]{w3, w6, new W("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static W[] values() {
        return (W[]) f17280s.clone();
    }
}
