package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503t1 {
    public static final C0499s1 Companion = new C0499s1();
    public static final InterfaceC1369h[] f = {AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(21)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f7188e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0503t1(int i, List list, String str, String str2, String str3, Integer num) {
        if ((i & 1) == 0) {
            this.f7184a = null;
        } else {
            this.f7184a = list;
        }
        if ((i & 2) == 0) {
            this.f7185b = null;
        } else {
            this.f7185b = str;
        }
        if ((i & 4) == 0) {
            this.f7186c = "#ffffff";
        } else {
            this.f7186c = str2;
        }
        if ((i & 8) == 0) {
            this.f7187d = "#000000";
        } else {
            this.f7187d = str3;
        }
        if ((i & 16) == 0) {
            this.f7188e = 10;
        } else {
            this.f7188e = num;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0503t1)) {
            return false;
        }
        C0503t1 c0503t1 = (C0503t1) obj;
        return kotlin.jvm.internal.m.a(this.f7184a, c0503t1.f7184a) && kotlin.jvm.internal.m.a(this.f7185b, c0503t1.f7185b) && kotlin.jvm.internal.m.a(this.f7186c, c0503t1.f7186c) && kotlin.jvm.internal.m.a(this.f7187d, c0503t1.f7187d) && kotlin.jvm.internal.m.a(this.f7188e, c0503t1.f7188e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f7184a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f7185b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7186c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7187d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f7188e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MenusItems(items=");
        sb.append(this.f7184a);
        sb.append(", regex=");
        sb.append(this.f7185b);
        sb.append(", textColor=");
        k1.i.s(sb, this.f7186c, ", bgColor=", this.f7187d, ", bottomMargin=");
        sb.append(this.f7188e);
        sb.append(")");
        return sb.toString();
    }
}
