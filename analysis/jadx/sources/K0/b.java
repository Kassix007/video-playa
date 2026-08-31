package k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13978e = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j = 3;
        long j7 = j << 32;
        f13974a = (((long) 0) & 4294967295L) | j7;
        f13975b = (((long) 1) & 4294967295L) | j7;
        f13976c = j7 | (((long) 2) & 4294967295L);
        f13977d = (j & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(long j) {
        return a(j, f13974a) ? "Rgb" : a(j, f13975b) ? "Xyz" : a(j, f13976c) ? "Lab" : a(j, f13977d) ? "Cmyk" : "Unknown";
    }
}
