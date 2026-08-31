package L0;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f3084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f3085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f3086d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(y yVar, y yVar2, y yVar3, y yVar4) {
        this.f3083a = yVar;
        this.f3084b = yVar2;
        this.f3085c = yVar3;
        this.f3086d = yVar4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        return kotlin.jvm.internal.m.a(this.f3083a, d5.f3083a) && kotlin.jvm.internal.m.a(this.f3084b, d5.f3084b) && kotlin.jvm.internal.m.a(this.f3085c, d5.f3085c) && kotlin.jvm.internal.m.a(this.f3086d, d5.f3086d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        y yVar = this.f3083a;
        int iHashCode = (yVar != null ? yVar.hashCode() : 0) * 31;
        y yVar2 = this.f3084b;
        int iHashCode2 = (iHashCode + (yVar2 != null ? yVar2.hashCode() : 0)) * 31;
        y yVar3 = this.f3085c;
        int iHashCode3 = (iHashCode2 + (yVar3 != null ? yVar3.hashCode() : 0)) * 31;
        y yVar4 = this.f3086d;
        return iHashCode3 + (yVar4 != null ? yVar4.hashCode() : 0);
    }
}
