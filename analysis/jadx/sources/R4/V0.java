package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {
    public static final U0 Companion = new U0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC1369h[] f6871e = {AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(18)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f6875d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ V0(int i, List list, Integer num, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.f6872a = null;
        } else {
            this.f6872a = list;
        }
        if ((i & 2) == 0) {
            this.f6873b = null;
        } else {
            this.f6873b = num;
        }
        if ((i & 4) == 0) {
            this.f6874c = null;
        } else {
            this.f6874c = str;
        }
        if ((i & 8) == 0) {
            this.f6875d = null;
        } else {
            this.f6875d = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return kotlin.jvm.internal.m.a(this.f6872a, v02.f6872a) && kotlin.jvm.internal.m.a(this.f6873b, v02.f6873b) && kotlin.jvm.internal.m.a(this.f6874c, v02.f6874c) && kotlin.jvm.internal.m.a(this.f6875d, v02.f6875d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f6872a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f6873b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f6874c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f6875d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IAPPage(elements=" + this.f6872a + ", topMarginPercent=" + this.f6873b + ", productId=" + this.f6874c + ", isProductAutoRenewable=" + this.f6875d + ")";
    }
}
