package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0469k2 {
    public static final C0465j2 Companion = new C0465j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1369h[] f7105c = {null, AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7107b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0469k2(int i, Boolean bool, List list) {
        this.f7106a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f7107b = null;
        } else {
            this.f7107b = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0469k2)) {
            return false;
        }
        C0469k2 c0469k2 = (C0469k2) obj;
        return kotlin.jvm.internal.m.a(this.f7106a, c0469k2.f7106a) && kotlin.jvm.internal.m.a(this.f7107b, c0469k2.f7107b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f7106a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List list = this.f7107b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RichBottomBarFullData(enable=" + this.f7106a + ", richBottomBarData=" + this.f7107b + ")";
    }
}
