package P;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5379a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U0(Object obj) {
        this.f5379a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.V0
    public final Object a(InterfaceC0360i0 interfaceC0360i0) {
        return this.f5379a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U0) && kotlin.jvm.internal.m.a(this.f5379a, ((U0) obj).f5379a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f5379a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StaticValueHolder(value=" + this.f5379a + ')';
    }
}
