package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class O1 {
    public static final N1 Companion = new N1();
    public static final InterfaceC1369h[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U1 f6821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f6823e;
    public final C0517x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f6824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f6825h;
    public final Integer i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K2.j jVar = new K2.j(26);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        j = new InterfaceC1369h[]{AbstractC1362a.c(enumC1370i, jVar), null, null, AbstractC1362a.c(enumC1370i, new K2.j(27)), null, null, null, null, null};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ O1(int i, List list, String str, U1 u12, List list2, Boolean bool, C0517x c0517x, Integer num, Boolean bool2, Integer num2) {
        if ((i & 1) == 0) {
            this.f6819a = null;
        } else {
            this.f6819a = list;
        }
        if ((i & 2) == 0) {
            this.f6820b = null;
        } else {
            this.f6820b = str;
        }
        if ((i & 4) == 0) {
            this.f6821c = null;
        } else {
            this.f6821c = u12;
        }
        if ((i & 8) == 0) {
            this.f6822d = null;
        } else {
            this.f6822d = list2;
        }
        if ((i & 16) == 0) {
            this.f6823e = null;
        } else {
            this.f6823e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = c0517x;
        }
        if ((i & 64) == 0) {
            this.f6824g = 1;
        } else {
            this.f6824g = num;
        }
        if ((i & 128) == 0) {
            this.f6825h = Boolean.FALSE;
        } else {
            this.f6825h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = -1;
        } else {
            this.i = num2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O1)) {
            return false;
        }
        O1 o12 = (O1) obj;
        return kotlin.jvm.internal.m.a(this.f6819a, o12.f6819a) && kotlin.jvm.internal.m.a(this.f6820b, o12.f6820b) && kotlin.jvm.internal.m.a(this.f6821c, o12.f6821c) && kotlin.jvm.internal.m.a(this.f6822d, o12.f6822d) && kotlin.jvm.internal.m.a(this.f6823e, o12.f6823e) && kotlin.jvm.internal.m.a(this.f, o12.f) && kotlin.jvm.internal.m.a(this.f6824g, o12.f6824g) && kotlin.jvm.internal.m.a(this.f6825h, o12.f6825h) && kotlin.jvm.internal.m.a(this.i, o12.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f6819a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f6820b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        U1 u12 = this.f6821c;
        int iHashCode3 = (iHashCode2 + (u12 == null ? 0 : u12.hashCode())) * 31;
        List list2 = this.f6822d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f6823e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        C0517x c0517x = this.f;
        int iHashCode6 = (iHashCode5 + (c0517x == null ? 0 : c0517x.hashCode())) * 31;
        Integer num = this.f6824g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f6825h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.i;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Onboarding(actionButtons=" + this.f6819a + ", bgColor=" + this.f6820b + ", pageIndicator=" + this.f6821c + ", pages=" + this.f6822d + ", showAlways=" + this.f6823e + ", skipButton=" + this.f + ", version=" + this.f6824g + ", showOnAppUpdate=" + this.f6825h + ", onboardingShowInterval=" + this.i + ")";
    }
}
