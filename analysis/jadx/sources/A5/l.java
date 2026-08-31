package a5;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8948a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l(int i, i iVar) {
        if ((i & 1) == 0) {
            this.f8948a = null;
        } else {
            this.f8948a = iVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.m.a(this.f8948a, ((l) obj).f8948a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        i iVar = this.f8948a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SecondaryFooterDataClass(secondaryFooter=" + this.f8948a + ")";
    }
}
