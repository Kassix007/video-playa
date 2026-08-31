package R4;

import java.util.List;
import m5.AbstractC1362a;
import m5.EnumC1370i;
import m5.InterfaceC1369h;

/* JADX INFO: renamed from: R4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0490q {
    public static final C0486p Companion = new C0486p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC1369h[] f7153e = {null, null, AbstractC1362a.c(EnumC1370i.f15077q, new K2.j(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f7155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f7157d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0490q(int i, Boolean bool, Boolean bool2, List list, Boolean bool3) {
        this.f7154a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f7155b = Boolean.FALSE;
        } else {
            this.f7155b = bool2;
        }
        if ((i & 4) == 0) {
            this.f7156c = n5.s.f15299q;
        } else {
            this.f7156c = list;
        }
        if ((i & 8) == 0) {
            this.f7157d = Boolean.FALSE;
        } else {
            this.f7157d = bool3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0490q)) {
            return false;
        }
        C0490q c0490q = (C0490q) obj;
        return kotlin.jvm.internal.m.a(this.f7154a, c0490q.f7154a) && kotlin.jvm.internal.m.a(this.f7155b, c0490q.f7155b) && kotlin.jvm.internal.m.a(this.f7156c, c0490q.f7156c) && kotlin.jvm.internal.m.a(this.f7157d, c0490q.f7157d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f7154a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f7155b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.f7156c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.f7157d;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BiometricAuth(enable=" + this.f7154a + ", showOnLoad=" + this.f7155b + ", whiteListDomains=" + this.f7156c + ", allowOtherMethod=" + this.f7157d + ")";
    }
}
