package T5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f7451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f7452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f7453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f7454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f7455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b[] f7456v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7451q = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7452r = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7453s = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7454t = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7455u = bVar5;
        f7456v = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b[] values() {
        return (b[]) f7456v.clone();
    }
}
