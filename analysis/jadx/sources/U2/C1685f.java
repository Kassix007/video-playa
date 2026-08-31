package u2;

import o0.AbstractC1412b;

/* JADX INFO: renamed from: u2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1685f extends AbstractC1686g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1412b f17146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2.r f17147b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1685f(AbstractC1412b abstractC1412b, D2.r rVar) {
        this.f17146a = abstractC1412b;
        this.f17147b = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u2.AbstractC1686g
    public final AbstractC1412b a() {
        return this.f17146a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1685f)) {
            return false;
        }
        C1685f c1685f = (C1685f) obj;
        return kotlin.jvm.internal.m.a(this.f17146a, c1685f.f17146a) && kotlin.jvm.internal.m.a(this.f17147b, c1685f.f17147b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17147b.hashCode() + (this.f17146a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Success(painter=" + this.f17146a + ", result=" + this.f17147b + ')';
    }
}
