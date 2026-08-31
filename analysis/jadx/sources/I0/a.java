package I0;

import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1366e f2222b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(String str, InterfaceC1366e interfaceC1366e) {
        this.f2221a = str;
        this.f2222b = interfaceC1366e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.f2221a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f2221a, aVar.f2221a) && kotlin.jvm.internal.m.a(this.f2222b, aVar.f2222b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f2221a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC1366e interfaceC1366e = this.f2222b;
        return iHashCode + (interfaceC1366e != null ? interfaceC1366e.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityAction(label=" + this.f2221a + ", action=" + this.f2222b + ')';
    }
}
