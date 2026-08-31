package Z4;

import C0.S;

/* JADX INFO: renamed from: Z4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567i {
    public static final C0566h Companion = new C0566h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8493c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0567i(int i, String str, String str2, String str3) {
        this.f8491a = (i & 1) == 0 ? "#ffffff" : str;
        if ((i & 2) == 0) {
            this.f8492b = "#10435E";
        } else {
            this.f8492b = str2;
        }
        if ((i & 4) == 0) {
            this.f8493c = null;
        } else {
            this.f8493c = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0567i)) {
            return false;
        }
        C0567i c0567i = (C0567i) obj;
        return kotlin.jvm.internal.m.a(this.f8491a, c0567i.f8491a) && kotlin.jvm.internal.m.a(this.f8492b, c0567i.f8492b) && kotlin.jvm.internal.m.a(this.f8493c, c0567i.f8493c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f8491a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8492b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8493c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.k(S.r("CardButton(textColor=", this.f8491a, ", bgColor=", this.f8492b, ", text="), this.f8493c, ")");
    }
}
