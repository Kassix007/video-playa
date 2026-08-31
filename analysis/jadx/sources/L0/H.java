package L0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC0190b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3095a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H(String str) {
        this.f3095a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return kotlin.jvm.internal.m.a(this.f3095a, ((H) obj).f3095a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3095a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.p(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f3095a, ')');
    }
}
