package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I f8805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f8806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f8807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ I[] f8808t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        I i = new I("AUTOMATIC", 0);
        f8805q = i;
        I i7 = new I("HARDWARE", 1);
        f8806r = i7;
        I i8 = new I("SOFTWARE", 2);
        f8807s = i8;
        f8808t = new I[]{i, i7, i8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static I[] values() {
        return (I[]) f8808t.clone();
    }
}
