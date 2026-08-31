package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0429a2 {
    public static final Z1 Companion = new Z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1369h[] f6912b = {AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6913a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0429a2(int i, List list) {
        if ((i & 1) == 0) {
            this.f6913a = null;
        } else {
            this.f6913a = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0429a2) && kotlin.jvm.internal.m.a(this.f6913a, ((C0429a2) obj).f6913a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f6913a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RegexInternalExternal(rules=" + this.f6913a + ")";
    }
}
