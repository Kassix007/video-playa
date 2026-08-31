package l6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile m f14610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f14611b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    static {
        /*
            boolean r0 = O3.B.l()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L74
            java.util.Map r0 = m6.c.f15104b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet r5 = m6.c.f15103a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L12
            r4.setUseParentHandlers(r1)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L43
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L4f
        L43:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L4d
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L4f
        L4d:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L4f:
            r4.setLevel(r3)
            m6.d r3 = m6.d.f15105a
            r4.addHandler(r3)
            goto L12
        L58:
            boolean r0 = l6.a.f14588d
            if (r0 == 0) goto L62
            l6.a r0 = new l6.a
            r0.<init>()
            goto L63
        L62:
            r0 = r2
        L63:
            if (r0 != 0) goto L15d
            boolean r0 = l6.c.f14592e
            if (r0 == 0) goto L6e
            l6.c r2 = new l6.c
            r2.<init>()
        L6e:
            kotlin.jvm.internal.m.b(r2)
        L71:
            r0 = r2
            goto L15d
        L74:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "Conscrypt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            boolean r0 = l6.h.f14598d
            if (r0 == 0) goto L90
            l6.h r0 = new l6.h
            r0.<init>()
            goto L91
        L90:
            r0 = r2
        L91:
            if (r0 == 0) goto L95
            goto L15d
        L95:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "BC"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb6
            boolean r0 = l6.e.f14595d
            if (r0 == 0) goto Lb1
            l6.e r0 = new l6.e
            r0.<init>()
            goto Lb2
        Lb1:
            r0 = r2
        Lb2:
            if (r0 == 0) goto Lb6
            goto L15d
        Lb6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "OpenJSSE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld7
            boolean r0 = l6.l.f14608d
            if (r0 == 0) goto Ld2
            l6.l r0 = new l6.l
            r0.<init>()
            goto Ld3
        Ld2:
            r0 = r2
        Ld3:
            if (r0 == 0) goto Ld7
            goto L15d
        Ld7:
            boolean r0 = l6.k.f14607c
            if (r0 == 0) goto Le1
            l6.k r0 = new l6.k
            r0.<init>()
            goto Le2
        Le1:
            r0 = r2
        Le2:
            if (r0 == 0) goto Le6
            goto L15d
        Le6:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r1 = java.lang.System.getProperty(r1, r3)
            java.lang.String r3 = "jvmVersion"
            kotlin.jvm.internal.m.d(r1, r3)     // Catch: java.lang.NumberFormatException -> Lfe
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lfe
            r3 = 9
            if (r1 < r3) goto Lfe
            goto L154
        Lfe:
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L154
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r2)     // Catch: java.lang.Throwable -> L154
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> L154
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> L154
            java.lang.String r3 = "put"
            java.lang.Class[] r4 = new java.lang.Class[]{r0, r4}     // Catch: java.lang.Throwable -> L154
            java.lang.reflect.Method r7 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L154
            java.lang.String r3 = "get"
            java.lang.Class[] r4 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L154
            java.lang.reflect.Method r8 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L154
            java.lang.String r3 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L154
            java.lang.reflect.Method r9 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L154
            l6.j r6 = new l6.j     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "putMethod"
            kotlin.jvm.internal.m.d(r7, r0)     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "getMethod"
            kotlin.jvm.internal.m.d(r8, r0)     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "removeMethod"
            kotlin.jvm.internal.m.d(r9, r0)     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "clientProviderClass"
            kotlin.jvm.internal.m.d(r10, r0)     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "serverProviderClass"
            kotlin.jvm.internal.m.d(r11, r0)     // Catch: java.lang.Throwable -> L154
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L154
            r2 = r6
        L154:
            if (r2 == 0) goto L158
            goto L71
        L158:
            l6.m r0 = new l6.m
            r0.<init>()
        L15d:
            l6.m.f14610a = r0
            java.lang.Class<d6.q> r0 = d6.q.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            l6.m.f14611b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.m.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(String message, int i, Throwable th) {
        kotlin.jvm.internal.m.e(message, "message");
        f14611b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d b(X509TrustManager x509TrustManager) {
        return new p6.a(c(x509TrustManager));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p6.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.m.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new p6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(Socket socket, InetSocketAddress address, int i) throws IOException {
        kotlin.jvm.internal.m.e(address, "address");
        socket.connect(address, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String f(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object g() {
        if (f14611b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean h(String hostname) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(Object obj, String message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(message, 5, (Throwable) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.m.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            kotlin.jvm.internal.m.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e7) {
            throw new AssertionError("No System TLS: " + e7, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.m.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        kotlin.jvm.internal.m.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
