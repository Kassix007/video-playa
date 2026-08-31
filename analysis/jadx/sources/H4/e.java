package H4;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2177c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Object obj, Object obj2, Object obj3) {
        this.f2175a = obj;
        this.f2176b = obj2;
        this.f2177c = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f2175a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f2176b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f2177c);
        return new IllegalArgumentException(sb.toString());
    }
}
