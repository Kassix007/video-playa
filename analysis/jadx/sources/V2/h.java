package V2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f7964c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f7966b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        b bVar = b.f7958a;
        f7964c = new h(bVar, bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(c cVar, c cVar2) {
        this.f7965a = cVar;
        this.f7966b = cVar2;
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
        return m.a(this.f7965a, hVar.f7965a) && m.a(this.f7966b, hVar.f7966b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7966b.hashCode() + (this.f7965a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Size(width=" + this.f7965a + ", height=" + this.f7966b + ')';
    }
}
