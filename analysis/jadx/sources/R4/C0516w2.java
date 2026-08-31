package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0516w2 {
    public static final C0512v2 Companion = new C0512v2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1369h[] f7202b = {AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7203a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0516w2(int i, List list) {
        if ((i & 1) == 0) {
            this.f7203a = null;
        } else {
            this.f7203a = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0516w2) && kotlin.jvm.internal.m.a(this.f7203a, ((C0516w2) obj).f7203a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f7203a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SecondaryFooterData(menus=" + this.f7203a + ")";
    }
}
