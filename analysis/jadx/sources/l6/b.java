package l6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f14590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f14591b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(X509TrustManager x509TrustManager, Method method) {
        this.f14590a = x509TrustManager;
        this.f14591b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p6.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f14591b.invoke(this.f14590a, x509Certificate);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("unable to get issues and signature", e7);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f14590a, bVar.f14590a) && kotlin.jvm.internal.m.a(this.f14591b, bVar.f14591b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14591b.hashCode() + (this.f14590a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f14590a + ", findByIssuerAndSignatureMethod=" + this.f14591b + ')';
    }
}
