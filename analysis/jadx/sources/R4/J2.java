package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class J2 {
    public static final I2 Companion = new I2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1369h[] f6780c = {null, AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6782b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ J2(int i, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.f6781a = null;
        } else {
            this.f6781a = bool;
        }
        if ((i & 2) == 0) {
            this.f6782b = null;
        } else {
            this.f6782b = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J2)) {
            return false;
        }
        J2 j22 = (J2) obj;
        return kotlin.jvm.internal.m.a(this.f6781a, j22.f6781a) && kotlin.jvm.internal.m.a(this.f6782b, j22.f6782b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6781a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List list = this.f6782b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StickyFooterData(enable=" + this.f6781a + ", data=" + this.f6782b + ")";
    }
}
