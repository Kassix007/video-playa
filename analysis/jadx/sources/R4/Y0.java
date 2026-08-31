package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 {
    public static final X0 Companion = new X0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC1369h[] f6892g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f6895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6897e;
    public final List f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K2.j jVar = new K2.j(19);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        f6892g = new InterfaceC1369h[]{null, null, null, null, AbstractC1362a.c(enumC1370i, jVar), AbstractC1362a.c(enumC1370i, new K2.j(20))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Y0(int i, Boolean bool, Integer num, Boolean bool2, String str, List list, List list2) {
        this.f6893a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f6894b = 0;
        } else {
            this.f6894b = num;
        }
        if ((i & 4) == 0) {
            this.f6895c = null;
        } else {
            this.f6895c = bool2;
        }
        if ((i & 8) == 0) {
            this.f6896d = "#ffffff";
        } else {
            this.f6896d = str;
        }
        if ((i & 16) == 0) {
            this.f6897e = null;
        } else {
            this.f6897e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        return kotlin.jvm.internal.m.a(this.f6893a, y02.f6893a) && kotlin.jvm.internal.m.a(this.f6894b, y02.f6894b) && kotlin.jvm.internal.m.a(this.f6895c, y02.f6895c) && kotlin.jvm.internal.m.a(this.f6896d, y02.f6896d) && kotlin.jvm.internal.m.a(this.f6897e, y02.f6897e) && kotlin.jvm.internal.m.a(this.f, y02.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6893a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f6894b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f6895c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f6896d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f6897e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IAPScreenData(disableOnFirstLoad=" + this.f6893a + ", disableForDays=" + this.f6894b + ", enable=" + this.f6895c + ", bgColor=" + this.f6896d + ", pages=" + this.f6897e + ", actionButtons=" + this.f + ")";
    }
}
