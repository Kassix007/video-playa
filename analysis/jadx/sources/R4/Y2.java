package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class Y2 {
    public static final X2 Companion = new X2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1369h[] f6899d = {null, null, AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S0 f6901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6902c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Y2(int i, String str, S0 s02, List list) {
        if ((i & 1) == 0) {
            this.f6900a = null;
        } else {
            this.f6900a = str;
        }
        if ((i & 2) == 0) {
            this.f6901b = null;
        } else {
            this.f6901b = s02;
        }
        if ((i & 4) == 0) {
            this.f6902c = null;
        } else {
            this.f6902c = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2)) {
            return false;
        }
        Y2 y22 = (Y2) obj;
        return kotlin.jvm.internal.m.a(this.f6900a, y22.f6900a) && kotlin.jvm.internal.m.a(this.f6901b, y22.f6901b) && kotlin.jvm.internal.m.a(this.f6902c, y22.f6902c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6900a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        S0 s02 = this.f6901b;
        int iHashCode2 = (iHashCode + (s02 == null ? 0 : s02.hashCode())) * 31;
        List list = this.f6902c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TopAppBarData(regex=" + this.f6900a + ", headerConfig=" + this.f6901b + ", mapping=" + this.f6902c + ")";
    }
}
