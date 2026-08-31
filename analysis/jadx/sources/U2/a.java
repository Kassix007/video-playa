package U2;

import M5.InterfaceC0241b0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0241b0 f7625q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [I2.y.a(U2.g, int, s5.c):java.lang.Object] */
    public /* synthetic */ a(InterfaceC0241b0 interfaceC0241b0) {
        this.f7625q = interfaceC0241b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return kotlin.jvm.internal.m.a(this.f7625q, ((a) obj).f7625q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7625q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f7625q + ')';
    }
}
