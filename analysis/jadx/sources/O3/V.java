package O3;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p5.C1484a;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4642d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V(X x6, int i, boolean z5, boolean z6) {
        this.f4642d = x6;
        this.f4639a = i;
        this.f4640b = z5;
        this.f4641c = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.String[]] */
    public d6.i a(SSLSocket sSLSocket) throws UnknownServiceException {
        d6.i iVar;
        int i;
        boolean z5;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i7 = this.f4639a;
        List list = (List) this.f4642d;
        int size = list.size();
        while (true) {
            if (i7 >= size) {
                iVar = null;
                break;
            }
            iVar = (d6.i) list.get(i7);
            if (iVar.b(sSLSocket)) {
                this.f4639a = i7 + 1;
                break;
            }
            i7++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f4641c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.m.b(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.m.d(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i8 = this.f4639a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i8 >= size2) {
                z5 = false;
                break;
            }
            if (((d6.i) list.get(i8)).b(sSLSocket)) {
                z5 = true;
                break;
            }
            i8++;
        }
        this.f4640b = z5;
        boolean z6 = this.f4641c;
        ?? r12 = iVar.f12345d;
        String[] strArr = iVar.f12344c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.m.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = e6.b.m(enabledCipherSuites, strArr, d6.g.f12321c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (r12 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.m.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = e6.b.m(enabledProtocols2, r12, C1484a.f15898b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.m.d(supportedCipherSuites, "supportedCipherSuites");
        d6.f fVar = d6.g.f12321c;
        byte[] bArr = e6.b.f12673a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z6 && i != -1) {
            kotlin.jvm.internal.m.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.m.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        d6.h hVar = new d6.h();
        hVar.f12337a = iVar.f12342a;
        hVar.f12339c = strArr;
        hVar.f12340d = r12;
        hVar.f12338b = iVar.f12343b;
        kotlin.jvm.internal.m.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        hVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.m.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        hVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        d6.i iVarA = hVar.a();
        if (iVarA.c() != null) {
            sSLSocket.setEnabledProtocols(iVarA.f12345d);
        }
        if (iVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(iVarA.f12344c);
        }
        return iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(String str) {
        ((X) this.f4642d).x(this.f4639a, this.f4640b, this.f4641c, str, null, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Object obj, String str) {
        ((X) this.f4642d).x(this.f4639a, this.f4640b, this.f4641c, str, obj, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(Object obj, Object obj2, String str) {
        ((X) this.f4642d).x(this.f4639a, this.f4640b, this.f4641c, str, obj, obj2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((X) this.f4642d).x(this.f4639a, this.f4640b, this.f4641c, str, obj, obj2, obj3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public V(List connectionSpecs) {
        kotlin.jvm.internal.m.e(connectionSpecs, "connectionSpecs");
        this.f4642d = connectionSpecs;
    }
}
