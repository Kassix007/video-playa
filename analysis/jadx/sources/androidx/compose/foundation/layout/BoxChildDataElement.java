package androidx.compose.foundation.layout;

import A.C0013j;
import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import c0.C0717e;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0717e f9261q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BoxChildDataElement(C0717e c0717e) {
        this.f9261q = c0717e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f9261q.equals(boxChildDataElement.f9261q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C0013j c0013j = new C0013j();
        c0013j.f111E = this.f9261q;
        return c0013j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        ((C0013j) abstractC0724l).f111E = this.f9261q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f9261q.hashCode() * 31);
    }
}
