package I2;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2338e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(String str, String str2, String str3, String str4, String str5) {
        this.f2334a = str;
        this.f2335b = str2;
        this.f2336c = str3;
        this.f2337d = str4;
        this.f2338e = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && kotlin.jvm.internal.m.a(((B) obj).f2334a, this.f2334a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2334a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2334a;
    }
}
