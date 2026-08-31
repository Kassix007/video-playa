package v3;

import java.util.Arrays;
import u3.InterfaceC1696a;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1763a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z.m f17553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1696a f17554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17555d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1763a(Z.m mVar, InterfaceC1696a interfaceC1696a, String str) {
        this.f17553b = mVar;
        this.f17554c = interfaceC1696a;
        this.f17555d = str;
        this.f17552a = Arrays.hashCode(new Object[]{mVar, interfaceC1696a, str});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1763a)) {
            return false;
        }
        C1763a c1763a = (C1763a) obj;
        return AbstractC1887A.j(this.f17553b, c1763a.f17553b) && AbstractC1887A.j(this.f17554c, c1763a.f17554c) && AbstractC1887A.j(this.f17555d, c1763a.f17555d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17552a;
    }
}
