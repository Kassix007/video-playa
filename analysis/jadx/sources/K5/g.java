package K5;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2986a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2988c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        switch (this.f2986a) {
            case 1:
                if (!(obj instanceof v1.b)) {
                    return false;
                }
                ((v1.b) obj).getClass();
                if (this.f2987b != null) {
                    throw null;
                }
                if (this.f2988c == null) {
                    return true;
                }
                throw null;
            default:
                return super.equals(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        switch (this.f2986a) {
            case 1:
                String str = this.f2987b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f2988c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // K5.i
    public d toInstant() {
        throw new e(this.f2987b + " when parsing an Instant from \"" + f.l(64, this.f2988c) + '\"');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f2986a) {
            case 1:
                return "Pair{" + ((Object) this.f2987b) + " " + ((Object) this.f2988c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public g(String error, String str) {
        m.e(error, "error");
        this.f2987b = error;
        this.f2988c = str;
    }
}
