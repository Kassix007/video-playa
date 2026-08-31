package L0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0190b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3094a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(String str) {
        this.f3094a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return kotlin.jvm.internal.m.a(this.f3094a, ((G) obj).f3094a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3094a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.p(new StringBuilder("UrlAnnotation(url="), this.f3094a, ')');
    }
}
