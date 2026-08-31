package Z4;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0561c f8499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0564f f8500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f8501d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o(int i, String str, C0561c c0561c, C0564f c0564f, u uVar) {
        if ((i & 1) == 0) {
            this.f8498a = null;
        } else {
            this.f8498a = str;
        }
        if ((i & 2) == 0) {
            this.f8499b = null;
        } else {
            this.f8499b = c0561c;
        }
        if ((i & 4) == 0) {
            this.f8500c = null;
        } else {
            this.f8500c = c0564f;
        }
        if ((i & 8) == 0) {
            this.f8501d = null;
        } else {
            this.f8501d = uVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f8498a, oVar.f8498a) && kotlin.jvm.internal.m.a(this.f8499b, oVar.f8499b) && kotlin.jvm.internal.m.a(this.f8500c, oVar.f8500c) && kotlin.jvm.internal.m.a(this.f8501d, oVar.f8501d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f8498a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0561c c0561c = this.f8499b;
        int iHashCode2 = (iHashCode + (c0561c == null ? 0 : c0561c.hashCode())) * 31;
        C0564f c0564f = this.f8500c;
        int iHashCode3 = (iHashCode2 + (c0564f == null ? 0 : c0564f.hashCode())) * 31;
        u uVar = this.f8501d;
        return iHashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CardDetails(id=" + this.f8498a + ", action=" + this.f8499b + ", card=" + this.f8500c + ", schedule=" + this.f8501d + ")";
    }
}
