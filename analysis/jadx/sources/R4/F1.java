package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class F1 {
    public static final E1 Companion = new E1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1369h[] f6754d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6757c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K2.j jVar = new K2.j(24);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        f6754d = new InterfaceC1369h[]{null, AbstractC1362a.c(enumC1370i, jVar), AbstractC1362a.c(enumC1370i, new K2.j(25))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ F1(int i, String str, List list, List list2) {
        if ((i & 1) == 0) {
            this.f6755a = null;
        } else {
            this.f6755a = str;
        }
        if ((i & 2) == 0) {
            this.f6756b = null;
        } else {
            this.f6756b = list;
        }
        if ((i & 4) == 0) {
            this.f6757c = null;
        } else {
            this.f6757c = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F1)) {
            return false;
        }
        F1 f12 = (F1) obj;
        return kotlin.jvm.internal.m.a(this.f6755a, f12.f6755a) && kotlin.jvm.internal.m.a(this.f6756b, f12.f6756b) && kotlin.jvm.internal.m.a(this.f6757c, f12.f6757c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6755a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f6756b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f6757c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NoInternetData(bgColor=" + this.f6755a + ", pages=" + this.f6756b + ", actionButtons=" + this.f6757c + ")";
    }
}
