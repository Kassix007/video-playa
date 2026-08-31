package D;

import z.AbstractC1923a;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0116a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1190a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0116a(int i) {
        this.f1190a = i;
        if (i > 0) {
            return;
        }
        AbstractC1923a.a("Provided count should be larger than zero");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0116a) {
            return this.f1190a == ((C0116a) obj).f1190a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return -this.f1190a;
    }
}
