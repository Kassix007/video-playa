package a5;

import R4.C0433b2;
import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final e Companion = new e();
    public static final InterfaceC1369h[] f = {AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(17)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f8943e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(int i, List list, String str, String str2, String str3, Integer num) {
        if ((i & 1) == 0) {
            this.f8939a = null;
        } else {
            this.f8939a = list;
        }
        if ((i & 2) == 0) {
            this.f8940b = null;
        } else {
            this.f8940b = str;
        }
        if ((i & 4) == 0) {
            this.f8941c = "#ffffff";
        } else {
            this.f8941c = str2;
        }
        if ((i & 8) == 0) {
            this.f8942d = "#000000";
        } else {
            this.f8942d = str3;
        }
        if ((i & 16) == 0) {
            this.f8943e = 10;
        } else {
            this.f8943e = num;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f8939a, fVar.f8939a) && kotlin.jvm.internal.m.a(this.f8940b, fVar.f8940b) && kotlin.jvm.internal.m.a(this.f8941c, fVar.f8941c) && kotlin.jvm.internal.m.a(this.f8942d, fVar.f8942d) && kotlin.jvm.internal.m.a(this.f8943e, fVar.f8943e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f8939a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f8940b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8941c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8942d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f8943e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MenusItems(items=");
        sb.append(this.f8939a);
        sb.append(", regex=");
        sb.append(this.f8940b);
        sb.append(", textColor=");
        k1.i.s(sb, this.f8941c, ", bgColor=", this.f8942d, ", bottomMargin=");
        sb.append(this.f8943e);
        sb.append(")");
        return sb.toString();
    }
}
