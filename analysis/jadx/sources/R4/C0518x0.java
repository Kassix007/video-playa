package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0518x0 {
    public static final C0514w0 Companion = new C0514w0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1369h[] f7210c = {null, AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7212b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0518x0(int i, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.f7211a = null;
        } else {
            this.f7211a = bool;
        }
        if ((i & 2) == 0) {
            this.f7212b = null;
        } else {
            this.f7212b = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0518x0)) {
            return false;
        }
        C0518x0 c0518x0 = (C0518x0) obj;
        return kotlin.jvm.internal.m.a(this.f7211a, c0518x0.f7211a) && kotlin.jvm.internal.m.a(this.f7212b, c0518x0.f7212b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f7211a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List list = this.f7212b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FloatingActionMenu(enable=" + this.f7211a + ", data=" + this.f7212b + ")";
    }
}
