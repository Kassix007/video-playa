package E2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f1687c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3.a f1688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3.a f1689b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        b bVar = b.f1677t;
        f1687c = new h(bVar, bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(C3.a aVar, C3.a aVar2) {
        this.f1688a = aVar;
        this.f1689b = aVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.a(this.f1688a, hVar.f1688a) && m.a(this.f1689b, hVar.f1689b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1689b.hashCode() + (this.f1688a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Size(width=" + this.f1688a + ", height=" + this.f1689b + ')';
    }
}
