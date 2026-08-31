package u2;

import o0.AbstractC1412b;

/* JADX INFO: renamed from: u2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1683d extends AbstractC1686g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1412b f17143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2.e f17144b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1683d(AbstractC1412b abstractC1412b, D2.e eVar) {
        this.f17143a = abstractC1412b;
        this.f17144b = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u2.AbstractC1686g
    public final AbstractC1412b a() {
        return this.f17143a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683d)) {
            return false;
        }
        C1683d c1683d = (C1683d) obj;
        return kotlin.jvm.internal.m.a(this.f17143a, c1683d.f17143a) && kotlin.jvm.internal.m.a(this.f17144b, c1683d.f17144b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        AbstractC1412b abstractC1412b = this.f17143a;
        return this.f17144b.hashCode() + ((abstractC1412b == null ? 0 : abstractC1412b.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Error(painter=" + this.f17143a + ", result=" + this.f17144b + ')';
    }
}
