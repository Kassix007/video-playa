package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0515w1 {
    public static final C0511v1 Companion = new C0511v1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1369h[] f7199c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7201b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K2.j jVar = new K2.j(22);
        EnumC1370i enumC1370i = EnumC1370i.f15077q;
        f7199c = new InterfaceC1369h[]{AbstractC1362a.c(enumC1370i, jVar), AbstractC1362a.c(enumC1370i, new K2.j(23))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0515w1(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f7200a = null;
        } else {
            this.f7200a = list;
        }
        if ((i & 2) == 0) {
            this.f7201b = null;
        } else {
            this.f7201b = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515w1)) {
            return false;
        }
        C0515w1 c0515w1 = (C0515w1) obj;
        return kotlin.jvm.internal.m.a(this.f7200a, c0515w1.f7200a) && kotlin.jvm.internal.m.a(this.f7201b, c0515w1.f7201b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f7200a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f7201b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiWindowSupport(openWindow=" + this.f7200a + ", closeWindow=" + this.f7201b + ")";
    }
}
