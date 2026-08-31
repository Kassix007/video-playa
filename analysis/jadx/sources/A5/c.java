package a5;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8937c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f8935a = null;
        } else {
            this.f8935a = str;
        }
        if ((i & 2) == 0) {
            this.f8936b = null;
        } else {
            this.f8936b = str2;
        }
        if ((i & 4) == 0) {
            this.f8937c = null;
        } else {
            this.f8937c = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f8935a, cVar.f8935a) && kotlin.jvm.internal.m.a(this.f8936b, cVar.f8936b) && kotlin.jvm.internal.m.a(this.f8937c, cVar.f8937c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f8935a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8936b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8937c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.k(S.r("MenusItemList(label=", this.f8935a, ", fileName=", this.f8936b, ", url="), this.f8937c, ")");
    }
}
