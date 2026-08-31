package d6;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1362a;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f12356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1376o f12359d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(y yVar, g gVar, List list, B5.a aVar) {
        this.f12356a = yVar;
        this.f12357b = gVar;
        this.f12358c = list;
        this.f12359d = AbstractC1362a.d(new A0.d(aVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List a() {
        return (List) this.f12359d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f12356a == this.f12356a && kotlin.jvm.internal.m.a(kVar.f12357b, this.f12357b) && kotlin.jvm.internal.m.a(kVar.a(), a()) && kotlin.jvm.internal.m.a(kVar.f12358c, this.f12358c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12358c.hashCode() + ((a().hashCode() + ((this.f12357b.hashCode() + ((this.f12356a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(n5.m.c0(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.m.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f12356a);
        sb.append(" cipherSuite=");
        sb.append(this.f12357b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f12358c;
        ArrayList arrayList2 = new ArrayList(n5.m.c0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.m.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
