package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class R1 {
    public static final Q1 Companion = new Q1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1369h[] f6840d = {AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(28)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f6842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f6843c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ R1(int i, List list, Boolean bool, Integer num) {
        if ((i & 1) == 0) {
            this.f6841a = null;
        } else {
            this.f6841a = list;
        }
        if ((i & 2) == 0) {
            this.f6842b = null;
        } else {
            this.f6842b = bool;
        }
        if ((i & 4) == 0) {
            this.f6843c = null;
        } else {
            this.f6843c = num;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R1)) {
            return false;
        }
        R1 r12 = (R1) obj;
        return kotlin.jvm.internal.m.a(this.f6841a, r12.f6841a) && kotlin.jvm.internal.m.a(this.f6842b, r12.f6842b) && kotlin.jvm.internal.m.a(this.f6843c, r12.f6843c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f6841a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.f6842b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f6843c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Page(elements=" + this.f6841a + ", showSkipButton=" + this.f6842b + ", topMarginPercent=" + this.f6843c + ")";
    }
}
