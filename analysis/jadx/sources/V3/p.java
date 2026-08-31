package v3;

import java.util.Arrays;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1763a f17591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.d f17592b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p(C1763a c1763a, com.google.android.gms.common.d dVar) {
        this.f17591a = c1763a;
        this.f17592b = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (AbstractC1887A.j(this.f17591a, pVar.f17591a) && AbstractC1887A.j(this.f17592b, pVar.f17592b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17591a, this.f17592b});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        l lVar = new l(this);
        lVar.a(this.f17591a, "key");
        lVar.a(this.f17592b, "feature");
        return lVar.toString();
    }
}
