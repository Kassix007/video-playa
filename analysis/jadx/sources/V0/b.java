package V0;

import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.l f7919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7920b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(j0.l lVar, float f) {
        this.f7919a = lVar;
        this.f7920b = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V0.p
    public final long a() {
        int i = j0.o.f13723h;
        return j0.o.f13722g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V0.p
    public final AbstractC1145B b() {
        return this.f7919a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V0.p
    public final float c() {
        return this.f7920b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f7919a, bVar.f7919a) && Float.compare(this.f7920b, bVar.f7920b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7920b) + (this.f7919a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f7919a);
        sb.append(", alpha=");
        return k1.i.j(sb, this.f7920b, ')');
    }
}
