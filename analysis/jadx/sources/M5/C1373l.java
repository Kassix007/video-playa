package m5;

import java.io.Serializable;

/* JADX INFO: renamed from: m5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1373l implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Throwable f15082q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1373l(Throwable exception) {
        kotlin.jvm.internal.m.e(exception, "exception");
        this.f15082q = exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1373l) {
            return kotlin.jvm.internal.m.a(this.f15082q, ((C1373l) obj).f15082q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15082q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Failure(" + this.f15082q + ')';
    }
}
