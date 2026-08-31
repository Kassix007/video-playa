package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0446f {
    public static final C0442e Companion = new C0442e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1369h[] f6944b = {AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6945a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0446f(int i, List list) {
        if ((i & 1) == 0) {
            this.f6945a = null;
        } else {
            this.f6945a = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0446f) && kotlin.jvm.internal.m.a(this.f6945a, ((C0446f) obj).f6945a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f6945a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AdMobAds(data=" + this.f6945a + ")";
    }
}
