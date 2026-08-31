package P;

/* JADX INFO: loaded from: classes.dex */
public final class A implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.n f5263a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public A(B5.c cVar) {
        this.f5263a = (kotlin.jvm.internal.n) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // P.V0
    public final Object a(InterfaceC0360i0 interfaceC0360i0) {
        return this.f5263a.invoke(interfaceC0360i0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && this.f5263a.equals(((A) obj).f5263a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5263a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f5263a + ')';
    }
}
