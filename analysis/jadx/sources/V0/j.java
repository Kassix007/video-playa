package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f7933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f7934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ j[] f7935s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        j jVar = new j("Ltr", 0);
        f7933q = jVar;
        j jVar2 = new j("Rtl", 1);
        f7934r = jVar2;
        f7935s = new j[]{jVar, jVar2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static j[] values() {
        return (j[]) f7935s.clone();
    }
}
