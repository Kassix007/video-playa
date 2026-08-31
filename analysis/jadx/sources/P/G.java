package P;

/* JADX INFO: loaded from: classes.dex */
public final class G implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0354f0 f5311a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(C0354f0 c0354f0) {
        this.f5311a = c0354f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.V0
    public final Object a(InterfaceC0360i0 interfaceC0360i0) {
        return this.f5311a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && this.f5311a.equals(((G) obj).f5311a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5311a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DynamicValueHolder(state=" + this.f5311a + ')';
    }
}
