package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class V2 {
    public static final U2 Companion = new U2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1369h[] f6877c = {null, AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6879b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ V2(int i, Boolean bool, List list) {
        this.f6878a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f6879b = null;
        } else {
            this.f6879b = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V2)) {
            return false;
        }
        V2 v22 = (V2) obj;
        return kotlin.jvm.internal.m.a(this.f6878a, v22.f6878a) && kotlin.jvm.internal.m.a(this.f6879b, v22.f6879b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6878a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List list = this.f6879b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TopAppBar(enable=" + this.f6878a + ", data=" + this.f6879b + ")";
    }
}
