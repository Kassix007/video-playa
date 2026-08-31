package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0493q2 {
    public static final C0489p2 Companion = new C0489p2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC1369h[] f7164g = {null, null, null, null, null, AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7169e;
    public final List f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0493q2(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if ((i & 1) == 0) {
            this.f7165a = null;
        } else {
            this.f7165a = str;
        }
        if ((i & 2) == 0) {
            this.f7166b = null;
        } else {
            this.f7166b = str2;
        }
        if ((i & 4) == 0) {
            this.f7167c = null;
        } else {
            this.f7167c = str3;
        }
        if ((i & 8) == 0) {
            this.f7168d = null;
        } else {
            this.f7168d = str4;
        }
        if ((i & 16) == 0) {
            this.f7169e = null;
        } else {
            this.f7169e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493q2)) {
            return false;
        }
        C0493q2 c0493q2 = (C0493q2) obj;
        return kotlin.jvm.internal.m.a(this.f7165a, c0493q2.f7165a) && kotlin.jvm.internal.m.a(this.f7166b, c0493q2.f7166b) && kotlin.jvm.internal.m.a(this.f7167c, c0493q2.f7167c) && kotlin.jvm.internal.m.a(this.f7168d, c0493q2.f7168d) && kotlin.jvm.internal.m.a(this.f7169e, c0493q2.f7169e) && kotlin.jvm.internal.m.a(this.f, c0493q2.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7165a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7166b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7167c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7168d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7169e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("RichBottomBarTabs(url=", this.f7165a, ", label=", this.f7166b, ", icon=");
        k1.i.s(sbR, this.f7167c, ", type=", this.f7168d, ", floatingBtnPosition=");
        sbR.append(this.f7169e);
        sbR.append(", expandableIcons=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
