package u;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1663q f16782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1669x f16783b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G0(AbstractC1663q abstractC1663q, InterfaceC1669x interfaceC1669x) {
        this.f16782a = abstractC1663q;
        this.f16783b = interfaceC1669x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return kotlin.jvm.internal.m.a(this.f16782a, g02.f16782a) && kotlin.jvm.internal.m.a(this.f16783b, g02.f16783b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f16783b.hashCode() + (this.f16782a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f16782a + ", easing=" + this.f16783b + ", arcMode=ArcMode(value=0))";
    }
}
