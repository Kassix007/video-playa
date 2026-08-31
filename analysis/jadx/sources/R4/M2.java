package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class M2 {
    public static final L2 Companion = new L2();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC1369h[] f6798m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6803e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f6804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f6805h;
    public final String i;
    public final Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6807l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0433b2 c0433b2 = new C0433b2(6);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        f6798m = new InterfaceC1369h[]{null, AbstractC1362a.c(enumC1370i, c0433b2), null, null, null, AbstractC1362a.c(enumC1370i, new C0433b2(7)), null, null, null, null, null, null};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ M2(int i, String str, List list, String str2, String str3, String str4, List list2, Integer num, Integer num2, String str5, Integer num3, String str6, String str7) {
        if (512 != (i & 512)) {
            Z5.N.e(i, 512, K2.f6786a.b());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f6799a = null;
        } else {
            this.f6799a = str;
        }
        if ((i & 2) == 0) {
            this.f6800b = null;
        } else {
            this.f6800b = list;
        }
        if ((i & 4) == 0) {
            this.f6801c = null;
        } else {
            this.f6801c = str2;
        }
        if ((i & 8) == 0) {
            this.f6802d = null;
        } else {
            this.f6802d = str3;
        }
        if ((i & 16) == 0) {
            this.f6803e = "#666666";
        } else {
            this.f6803e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.f6804g = null;
        } else {
            this.f6804g = num;
        }
        if ((i & 128) == 0) {
            this.f6805h = null;
        } else {
            this.f6805h = num2;
        }
        if ((i & 256) == 0) {
            this.i = "#666666";
        } else {
            this.i = str5;
        }
        this.j = num3;
        if ((i & 1024) == 0) {
            this.f6806k = null;
        } else {
            this.f6806k = str6;
        }
        if ((i & 2048) == 0) {
            this.f6807l = null;
        } else {
            this.f6807l = str7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m22 = (M2) obj;
        return kotlin.jvm.internal.m.a(this.f6799a, m22.f6799a) && kotlin.jvm.internal.m.a(this.f6800b, m22.f6800b) && kotlin.jvm.internal.m.a(this.f6801c, m22.f6801c) && kotlin.jvm.internal.m.a(this.f6802d, m22.f6802d) && kotlin.jvm.internal.m.a(this.f6803e, m22.f6803e) && kotlin.jvm.internal.m.a(this.f, m22.f) && kotlin.jvm.internal.m.a(this.f6804g, m22.f6804g) && kotlin.jvm.internal.m.a(this.f6805h, m22.f6805h) && kotlin.jvm.internal.m.a(this.i, m22.i) && kotlin.jvm.internal.m.a(this.j, m22.j) && kotlin.jvm.internal.m.a(this.f6806k, m22.f6806k) && kotlin.jvm.internal.m.a(this.f6807l, m22.f6807l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6799a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f6800b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f6801c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6802d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6803e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f6804g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6805h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.f6806k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f6807l;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("StickyFooterItem(regEx=");
        sb.append(this.f6799a);
        sb.append(", mapping=");
        sb.append(this.f6800b);
        sb.append(", fontFamily=");
        k1.i.s(sb, this.f6801c, ", bgColor=", this.f6802d, ", iconColor=");
        sb.append(this.f6803e);
        sb.append(", tabs=");
        sb.append(this.f);
        sb.append(", fontSize=");
        sb.append(this.f6804g);
        sb.append(", iconFontSize=");
        sb.append(this.f6805h);
        sb.append(", textColor=");
        sb.append(this.i);
        sb.append(", height=");
        sb.append(this.j);
        sb.append(", activeIconColor=");
        sb.append(this.f6806k);
        sb.append(", activeTextColor=");
        sb.append(this.f6807l);
        sb.append(")");
        return sb.toString();
    }
}
