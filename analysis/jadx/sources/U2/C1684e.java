package u2;

import o0.AbstractC1412b;

/* JADX INFO: renamed from: u2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1684e extends AbstractC1686g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1412b f17145a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1684e(AbstractC1412b abstractC1412b) {
        this.f17145a = abstractC1412b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u2.AbstractC1686g
    public final AbstractC1412b a() {
        return this.f17145a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1684e) && kotlin.jvm.internal.m.a(this.f17145a, ((C1684e) obj).f17145a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        AbstractC1412b abstractC1412b = this.f17145a;
        if (abstractC1412b == null) {
            return 0;
        }
        return abstractC1412b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Loading(painter=" + this.f17145a + ')';
    }
}
