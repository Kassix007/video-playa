package E2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f1679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f1680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f1681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d[] f1682t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d dVar = new d("EXACT", 0);
        f1679q = dVar;
        d dVar2 = new d("INEXACT", 1);
        f1680r = dVar2;
        d dVar3 = new d("AUTOMATIC", 2);
        f1681s = dVar3;
        f1682t = new d[]{dVar, dVar2, dVar3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d[] values() {
        return (d[]) f1682t.clone();
    }
}
