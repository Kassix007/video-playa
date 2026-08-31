package d6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import n5.AbstractC1397A;
import p5.C1484a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f12341e;
    public static final i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f12344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f12345d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        g gVar = g.f12333r;
        g gVar2 = g.f12334s;
        g gVar3 = g.f12335t;
        g gVar4 = g.f12327l;
        g gVar5 = g.f12329n;
        g gVar6 = g.f12328m;
        g gVar7 = g.f12330o;
        g gVar8 = g.f12332q;
        g gVar9 = g.f12331p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.j, g.f12326k, g.f12325h, g.i, g.f, g.f12324g, g.f12323e};
        h hVar = new h();
        hVar.b((g[]) Arrays.copyOf(gVarArr, 9));
        y yVar = y.TLS_1_3;
        y yVar2 = y.TLS_1_2;
        hVar.d(yVar, yVar2);
        if (!hVar.f12337a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f12338b = true;
        hVar.a();
        h hVar2 = new h();
        hVar2.b((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar2.d(yVar, yVar2);
        if (!hVar2.f12337a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f12338b = true;
        f12341e = hVar2.a();
        h hVar3 = new h();
        hVar3.b((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar3.d(yVar, yVar2, y.TLS_1_1, y.TLS_1_0);
        if (!hVar3.f12337a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f12338b = true;
        hVar3.a();
        f = new i(false, false, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(boolean z5, boolean z6, String[] strArr, String[] strArr2) {
        this.f12342a = z5;
        this.f12343b = z6;
        this.f12344c = strArr;
        this.f12345d = strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List a() {
        String[] strArr = this.f12344c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f12320b.c(str));
        }
        return n5.l.B0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f12342a) {
            return false;
        }
        String[] strArr = this.f12345d;
        if (strArr != null && !e6.b.g(strArr, sSLSocket.getEnabledProtocols(), C1484a.f15898b)) {
            return false;
        }
        String[] strArr2 = this.f12344c;
        return strArr2 == null || e6.b.g(strArr2, sSLSocket.getEnabledCipherSuites(), g.f12321c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List c() {
        String[] strArr = this.f12345d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC1397A.q(str));
        }
        return n5.l.B0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z5 = iVar.f12342a;
        boolean z6 = this.f12342a;
        if (z6 != z5) {
            return false;
        }
        if (z6) {
            return Arrays.equals(this.f12344c, iVar.f12344c) && Arrays.equals(this.f12345d, iVar.f12345d) && this.f12343b == iVar.f12343b;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (!this.f12342a) {
            return 17;
        }
        String[] strArr = this.f12344c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f12345d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f12343b ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (!this.f12342a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f12343b + ')';
    }
}
