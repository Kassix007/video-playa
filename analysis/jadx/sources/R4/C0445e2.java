package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445e2 {
    public static final C0441d2 Companion = new C0441d2();
    public static final InterfaceC1369h[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f6939e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6941h;
    public final List i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0433b2 c0433b2 = new C0433b2(0);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        j = new InterfaceC1369h[]{null, AbstractC1362a.c(enumC1370i, c0433b2), null, null, null, null, null, null, AbstractC1362a.c(enumC1370i, new C0433b2(1))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0445e2(int i, String str, List list, String str2, String str3, Integer num, String str4, String str5, String str6, List list2) {
        if ((i & 1) == 0) {
            this.f6935a = null;
        } else {
            this.f6935a = str;
        }
        if ((i & 2) == 0) {
            this.f6936b = null;
        } else {
            this.f6936b = list;
        }
        if ((i & 4) == 0) {
            this.f6937c = null;
        } else {
            this.f6937c = str2;
        }
        if ((i & 8) == 0) {
            this.f6938d = null;
        } else {
            this.f6938d = str3;
        }
        if ((i & 16) == 0) {
            this.f6939e = 35;
        } else {
            this.f6939e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f6940g = null;
        } else {
            this.f6940g = str5;
        }
        if ((i & 128) == 0) {
            this.f6941h = null;
        } else {
            this.f6941h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0445e2)) {
            return false;
        }
        C0445e2 c0445e2 = (C0445e2) obj;
        return kotlin.jvm.internal.m.a(this.f6935a, c0445e2.f6935a) && kotlin.jvm.internal.m.a(this.f6936b, c0445e2.f6936b) && kotlin.jvm.internal.m.a(this.f6937c, c0445e2.f6937c) && kotlin.jvm.internal.m.a(this.f6938d, c0445e2.f6938d) && kotlin.jvm.internal.m.a(this.f6939e, c0445e2.f6939e) && kotlin.jvm.internal.m.a(this.f, c0445e2.f) && kotlin.jvm.internal.m.a(this.f6940g, c0445e2.f6940g) && kotlin.jvm.internal.m.a(this.f6941h, c0445e2.f6941h) && kotlin.jvm.internal.m.a(this.i, c0445e2.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6935a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f6936b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f6937c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6938d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f6939e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f6940g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f6941h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.i;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RichBottomBarData(regex=");
        sb.append(this.f6935a);
        sb.append(", mapping=");
        sb.append(this.f6936b);
        sb.append(", iconColor=");
        k1.i.s(sb, this.f6937c, ", bgColor=", this.f6938d, ", cornerRadius=");
        sb.append(this.f6939e);
        sb.append(", activeColor=");
        sb.append(this.f);
        sb.append(", floatingBtnBgColor=");
        k1.i.s(sb, this.f6940g, ", floatingBtnIconColor=", this.f6941h, ", tabs=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
