package a5;

import R4.C0433b2;
import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1369h[] f8945b = {AbstractC1362a.c(EnumC1370i.f15077q, new C0433b2(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8946a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(int i, List list) {
        if ((i & 1) == 0) {
            this.f8946a = null;
        } else {
            this.f8946a = list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.m.a(this.f8946a, ((i) obj).f8946a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        List list = this.f8946a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SecondaryFooterData(menus=" + this.f8946a + ")";
    }
}
