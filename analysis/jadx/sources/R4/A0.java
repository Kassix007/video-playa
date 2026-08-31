package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {
    public static final C0526z0 Companion = new C0526z0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1369h[] f6722d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6725c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K2.j jVar = new K2.j(16);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        f6722d = new InterfaceC1369h[]{AbstractC1362a.c(enumC1370i, jVar), null, AbstractC1362a.c(enumC1370i, new K2.j(17))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ A0(int i, String str, List list, List list2) {
        if ((i & 1) == 0) {
            this.f6723a = null;
        } else {
            this.f6723a = list;
        }
        if ((i & 2) == 0) {
            this.f6724b = null;
        } else {
            this.f6724b = str;
        }
        if ((i & 4) == 0) {
            this.f6725c = null;
        } else {
            this.f6725c = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return kotlin.jvm.internal.m.a(this.f6723a, a02.f6723a) && kotlin.jvm.internal.m.a(this.f6724b, a02.f6724b) && kotlin.jvm.internal.m.a(this.f6725c, a02.f6725c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f6723a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f6724b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.f6725c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FloatingActionMenuData(tabs=" + this.f6723a + ", regex=" + this.f6724b + ", mapping=" + this.f6725c + ")";
    }
}
