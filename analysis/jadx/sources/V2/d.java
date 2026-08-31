package V2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f7959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f7960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ d[] f7961s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d dVar = new d("EXACT", 0);
        f7959q = dVar;
        d dVar2 = new d("INEXACT", 1);
        f7960r = dVar2;
        f7961s = new d[]{dVar, dVar2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d[] values() {
        return (d[]) f7961s.clone();
    }
}
