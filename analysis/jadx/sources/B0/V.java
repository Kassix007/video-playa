package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final V f331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final V f332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final V f333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ V[] f334t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        V v6 = new V("IsPlacedInLookahead", 0);
        f331q = v6;
        V v7 = new V("IsPlacedInApproach", 1);
        f332r = v7;
        V v8 = new V("IsNotPlaced", 2);
        f333s = v8;
        f334t = new V[]{v6, v7, v8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static V[] values() {
        return (V[]) f334t.clone();
    }
}
