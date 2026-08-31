package d6;

import C0.S;
import a.AbstractC0597a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f12296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f12297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f12298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f12299e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f12300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f12301h;
    public final List i;
    public final List j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(String uriHost, int i, b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.m.e(uriHost, "uriHost");
        kotlin.jvm.internal.m.e(dns, "dns");
        kotlin.jvm.internal.m.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.m.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.m.e(protocols, "protocols");
        kotlin.jvm.internal.m.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.m.e(proxySelector, "proxySelector");
        this.f12295a = dns;
        this.f12296b = socketFactory;
        this.f12297c = sSLSocketFactory;
        this.f12298d = hostnameVerifier;
        this.f12299e = eVar;
        this.f = proxyAuthenticator;
        this.f12300g = proxySelector;
        m mVar = new m();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            mVar.f12361a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            mVar.f12361a = "https";
        }
        String strT = AbstractC0597a.T(b.e(uriHost, 0, 0, 7));
        if (strT == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        mVar.f12364d = strT;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(k1.i.i(i, "unexpected port: ").toString());
        }
        mVar.f12365e = i;
        this.f12301h = mVar.a();
        this.i = e6.b.t(protocols);
        this.j = e6.b.t(connectionSpecs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(a that) {
        kotlin.jvm.internal.m.e(that, "that");
        return kotlin.jvm.internal.m.a(this.f12295a, that.f12295a) && kotlin.jvm.internal.m.a(this.f, that.f) && kotlin.jvm.internal.m.a(this.i, that.i) && kotlin.jvm.internal.m.a(this.j, that.j) && kotlin.jvm.internal.m.a(this.f12300g, that.f12300g) && kotlin.jvm.internal.m.a(this.f12297c, that.f12297c) && kotlin.jvm.internal.m.a(this.f12298d, that.f12298d) && kotlin.jvm.internal.m.a(this.f12299e, that.f12299e) && this.f12301h.f12372e == that.f12301h.f12372e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f12301h, aVar.f12301h) && a(aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hashCode(this.f12299e) + ((Objects.hashCode(this.f12298d) + ((Objects.hashCode(this.f12297c) + ((this.f12300g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.f12295a.hashCode() + S.h(this.f12301h.f12374h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.f12301h;
        sb.append(nVar.f12371d);
        sb.append(':');
        sb.append(nVar.f12372e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f12300g);
        sb.append('}');
        return sb.toString();
    }
}
