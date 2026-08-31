package L0;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC0190b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3070a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [L0.m.invoke(java.lang.Object):java.lang.Object] */
    public /* synthetic */ A(String str) {
        this.f3070a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return kotlin.jvm.internal.m.a(this.f3070a, ((A) obj).f3070a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3070a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StringAnnotation(value=" + this.f3070a + ')';
    }
}
