package m6;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f15101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f15102b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f15101a = x509TrustManager;
        this.f15102b = x509TrustManagerExtensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f15101a == this.f15101a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this.f15101a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final List l(String hostname, List chain) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.m.e(chain, "chain");
        kotlin.jvm.internal.m.e(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f15102b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.m.d(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }
}
