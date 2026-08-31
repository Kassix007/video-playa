package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I f237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ I[] f240t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        I i = new I("InMeasureBlock", 0);
        f237q = i;
        I i7 = new I("InLayoutBlock", 1);
        f238r = i7;
        I i8 = new I("NotUsed", 2);
        f239s = i8;
        f240t = new I[]{i, i7, i8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static I[] values() {
        return (I[]) f240t.clone();
    }
}
