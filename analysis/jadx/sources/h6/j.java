package h6;

import C0.S;
import L0.l;
import O3.V;
import O3.Y;
import a.AbstractC0597a;
import c3.C0733c;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import d6.q;
import d6.r;
import d6.s;
import d6.t;
import d6.u;
import d6.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k6.n;
import k6.o;
import k6.v;
import k6.w;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import p3.z0;
import q6.A;
import q6.I;
import q6.z;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k6.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f13500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f13501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f13502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d6.k f13503e;
    public r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f13504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A f13505h;
    public z i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f13511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f13512q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Y connectionPool, x route) {
        m.e(connectionPool, "connectionPool");
        m.e(route, "route");
        this.f13500b = route;
        this.f13510o = 1;
        this.f13511p = new ArrayList();
        this.f13512q = Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(q qVar, x failedRoute, IOException failure) {
        m.e(failedRoute, "failedRoute");
        m.e(failure, "failure");
        if (failedRoute.f12445b.type() != Proxy.Type.DIRECT) {
            d6.a aVar = failedRoute.f12444a;
            aVar.f12300g.connectFailed(aVar.f12301h.g(), failedRoute.f12445b.address(), failure);
        }
        k3.d dVar = qVar.f12394O;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f14122r).add(failedRoute);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k6.h
    public final synchronized void a(n nVar, k6.z settings) {
        m.e(settings, "settings");
        this.f13510o = (settings.f14247a & 16) != 0 ? settings.f14248b[4] : Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k6.h
    public final void b(v vVar) {
        vVar.c(8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, int i7, int i8, boolean z5, h hVar) throws Throwable {
        x xVar;
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f13500b.f12444a.j;
        V v6 = new V(list);
        d6.a aVar = this.f13500b.f12444a;
        if (aVar.f12297c == null) {
            if (!list.contains(d6.i.f)) {
                throw new k(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f13500b.f12444a.f12301h.f12371d;
            l6.m mVar = l6.m.f14610a;
            if (!l6.m.f14610a.h(str)) {
                throw new k(new UnknownServiceException(S.n("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new k(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        k kVar = null;
        do {
            try {
                x xVar2 = this.f13500b;
                if (xVar2.f12444a.f12297c != null && xVar2.f12445b.type() == Proxy.Type.HTTP) {
                    f(i, i7, i8, hVar);
                    if (this.f13501c == null) {
                    }
                    xVar = this.f13500b;
                    if (xVar.f12444a.f12297c == null && xVar.f12445b.type() == Proxy.Type.HTTP && this.f13501c == null) {
                        throw new k(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f13512q = System.nanoTime();
                    return;
                }
                e(i, i7, hVar);
                g(v6, hVar);
                InetSocketAddress inetSocketAddress = this.f13500b.f12446c;
                m.e(inetSocketAddress, "inetSocketAddress");
                xVar = this.f13500b;
                if (xVar.f12444a.f12297c == null) {
                }
                this.f13512q = System.nanoTime();
                return;
            } catch (IOException e7) {
                Socket socket = this.f13502d;
                if (socket != null) {
                    e6.b.c(socket);
                }
                Socket socket2 = this.f13501c;
                if (socket2 != null) {
                    e6.b.c(socket2);
                }
                this.f13502d = null;
                this.f13501c = null;
                this.f13505h = null;
                this.i = null;
                this.f13503e = null;
                this.f = null;
                this.f13504g = null;
                this.f13510o = 1;
                InetSocketAddress inetSocketAddress2 = this.f13500b.f12446c;
                m.e(inetSocketAddress2, "inetSocketAddress");
                if (kVar == null) {
                    kVar = new k(e7);
                } else {
                    AbstractC1362a.a(kVar.f13513q, e7);
                    kVar.f13514r = e7;
                }
                if (!z5) {
                    throw kVar;
                }
                v6.f4641c = true;
                if (!v6.f4640b) {
                    throw kVar;
                }
                if (e7 instanceof ProtocolException) {
                    throw kVar;
                }
                if (e7 instanceof InterruptedIOException) {
                    throw kVar;
                }
                if ((e7 instanceof SSLHandshakeException) && (e7.getCause() instanceof CertificateException)) {
                    throw kVar;
                }
                if (e7 instanceof SSLPeerUnverifiedException) {
                    throw kVar;
                }
            }
        } while (e7 instanceof SSLException);
        throw kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i7, h hVar) throws IOException {
        Socket socketCreateSocket;
        x xVar = this.f13500b;
        Proxy proxy = xVar.f12445b;
        d6.a aVar = xVar.f12444a;
        Proxy.Type type = proxy.type();
        int i8 = type == null ? -1 : i.f13499a[type.ordinal()];
        if (i8 == 1 || i8 == 2) {
            socketCreateSocket = aVar.f12296b.createSocket();
            m.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f13501c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f13500b.f12446c;
        m.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i7);
        try {
            l6.m mVar = l6.m.f14610a;
            l6.m.f14610a.e(socketCreateSocket, this.f13500b.f12446c, i);
            try {
                this.f13505h = AbstractC0597a.j(AbstractC0597a.S(socketCreateSocket));
                this.i = AbstractC0597a.i(AbstractC0597a.Q(socketCreateSocket));
            } catch (NullPointerException e7) {
                if (m.a(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f13500b.f12446c);
            connectException.initCause(e8);
            throw connectException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i, int i7, int i8, h hVar) throws IOException {
        l lVar = new l();
        x xVar = this.f13500b;
        d6.n url = xVar.f12444a.f12301h;
        m.e(url, "url");
        lVar.f3125b = url;
        lVar.o("CONNECT", null);
        d6.a aVar = xVar.f12444a;
        lVar.m("Host", e6.b.s(aVar.f12301h, true));
        lVar.m("Proxy-Connection", "Keep-Alive");
        lVar.m("User-Agent", "okhttp/4.12.0");
        s sVarC = lVar.c();
        C0733c c0733c = new C0733c(1);
        P1.h("Proxy-Authenticate");
        P1.k("OkHttp-Preemptive", "Proxy-Authenticate");
        c0733c.e("Proxy-Authenticate");
        c0733c.a("Proxy-Authenticate", "OkHttp-Preemptive");
        c0733c.d();
        aVar.f.getClass();
        d6.n nVar = sVarC.f12413a;
        e(i, i7, hVar);
        String str = "CONNECT " + e6.b.s(nVar, true) + " HTTP/1.1";
        A a7 = this.f13505h;
        m.b(a7);
        z zVar = this.i;
        m.b(zVar);
        j6.f fVar = new j6.f(null, this, a7, zVar);
        I iD = a7.f16025q.d();
        long j = i7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iD.g(j);
        zVar.f16101q.d().g(i8);
        fVar.j(sVarC.f12415c, str);
        fVar.b();
        t tVarF = fVar.f(false);
        m.b(tVarF);
        tVarF.f12418a = sVarC;
        u uVarA = tVarF.a();
        int i9 = uVarA.f12435t;
        long jH = e6.b.h(uVarA);
        if (jH != -1) {
            j6.d dVarI = fVar.i(jH);
            e6.b.q(dVarI, Integer.MAX_VALUE);
            dVarI.close();
        }
        if (i9 != 200) {
            if (i9 != 407) {
                throw new IOException(k1.i.i(i9, "Unexpected response code for CONNECT: "));
            }
            aVar.f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!a7.f16026r.e() || !zVar.f16102r.e()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(V v6, h hVar) throws Throwable {
        r rVarN = r.HTTP_1_1;
        d6.a aVar = this.f13500b.f12444a;
        SSLSocketFactory sSLSocketFactory = aVar.f12297c;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            r rVar = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar)) {
                this.f13502d = this.f13501c;
                this.f = rVarN;
                return;
            } else {
                this.f13502d = this.f13501c;
                this.f = rVar;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            m.b(sSLSocketFactory);
            Socket socket = this.f13501c;
            d6.n nVar = aVar.f12301h;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, nVar.f12371d, nVar.f12372e, true);
            m.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                d6.i iVarA = v6.a(sSLSocket2);
                if (iVarA.f12343b) {
                    l6.m mVar = l6.m.f14610a;
                    l6.m.f14610a.d(sSLSocket2, aVar.f12301h.f12371d, aVar.i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                m.d(sslSocketSession, "sslSocketSession");
                d6.k kVarO = K1.o(sslSocketSession);
                HostnameVerifier hostnameVerifier = aVar.f12298d;
                m.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar.f12301h.f12371d, sslSocketSession)) {
                    d6.e eVar = aVar.f12299e;
                    m.b(eVar);
                    this.f13503e = new d6.k(kVarO.f12356a, kVarO.f12357b, kVarO.f12358c, new C.k(eVar, kVarO, aVar, 8));
                    eVar.a(aVar.f12301h.f12371d, new A0.d(22, this));
                    if (iVarA.f12343b) {
                        l6.m mVar2 = l6.m.f14610a;
                        strF = l6.m.f14610a.f(sSLSocket2);
                    }
                    this.f13502d = sSLSocket2;
                    this.f13505h = AbstractC0597a.j(AbstractC0597a.S(sSLSocket2));
                    this.i = AbstractC0597a.i(AbstractC0597a.Q(sSLSocket2));
                    if (strF != null) {
                        rVarN = l6.d.n(strF);
                    }
                    this.f = rVarN;
                    l6.m mVar3 = l6.m.f14610a;
                    l6.m.f14610a.a(sSLSocket2);
                    if (this.f == r.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = kVarO.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f12301h.f12371d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar.f12301h.f12371d);
                sb.append(" not verified:\n              |    certificate: ");
                d6.e eVar2 = d6.e.f12317c;
                sb.append(AbstractC0597a.J(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(n5.l.u0(p6.c.a(x509Certificate, 7), p6.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(J5.n.y0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    l6.m mVar4 = l6.m.f14610a;
                    l6.m.f14610a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    e6.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(d6.a r10, java.util.List r11) {
        /*
            r9 = this;
            d6.n r0 = r10.f12301h
            byte[] r1 = e6.b.f12673a
            java.util.ArrayList r1 = r9.f13511p
            int r1 = r1.size()
            int r2 = r9.f13510o
            r3 = 0
            if (r1 >= r2) goto Ldb
            boolean r1 = r9.j
            if (r1 == 0) goto L15
            goto Ldb
        L15:
            d6.x r1 = r9.f13500b
            d6.a r2 = r1.f12444a
            d6.a r4 = r1.f12444a
            boolean r2 = r2.a(r10)
            if (r2 != 0) goto L23
            goto Ldb
        L23:
            java.lang.String r2 = r0.f12371d
            java.lang.String r5 = r0.f12371d
            d6.n r6 = r4.f12301h
            java.lang.String r6 = r6.f12371d
            boolean r2 = kotlin.jvm.internal.m.a(r2, r6)
            r6 = 1
            if (r2 == 0) goto L33
            return r6
        L33:
            k6.n r2 = r9.f13504g
            if (r2 != 0) goto L39
            goto Ldb
        L39:
            if (r11 == 0) goto Ldb
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4c
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4c
            goto Ldb
        L4c:
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Ldb
            java.lang.Object r2 = r11.next()
            d6.x r2 = (d6.x) r2
            java.net.Proxy r7 = r2.f12445b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L50
            java.net.Proxy r7 = r1.f12445b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto L50
            java.net.InetSocketAddress r7 = r1.f12446c
            java.net.InetSocketAddress r2 = r2.f12446c
            boolean r2 = kotlin.jvm.internal.m.a(r7, r2)
            if (r2 == 0) goto L50
            javax.net.ssl.HostnameVerifier r11 = r10.f12298d
            p6.c r1 = p6.c.f15903a
            if (r11 == r1) goto L7f
            goto Ldb
        L7f:
            byte[] r11 = e6.b.f12673a
            d6.n r11 = r4.f12301h
            int r0 = r0.f12372e
            int r1 = r11.f12372e
            if (r0 == r1) goto L8a
            goto Ldb
        L8a:
            java.lang.String r11 = r11.f12371d
            boolean r11 = kotlin.jvm.internal.m.a(r5, r11)
            if (r11 == 0) goto L93
            goto Lb9
        L93:
            boolean r11 = r9.f13506k
            if (r11 != 0) goto Ldb
            d6.k r11 = r9.f13503e
            if (r11 == 0) goto Ldb
            java.util.List r11 = r11.a()
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldb
            java.lang.Object r11 = r11.get(r3)
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.m.c(r11, r0)
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = p6.c.c(r5, r11)
            if (r11 == 0) goto Ldb
        Lb9:
            d6.e r10 = r10.f12299e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            kotlin.jvm.internal.m.b(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            d6.k r11 = r9.f13503e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            kotlin.jvm.internal.m.b(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            java.util.List r11 = r11.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.m.e(r5, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.m.e(r11, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            C.k r0 = new C.k     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            r1 = 7
            r0.<init>(r10, r11, r5, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            r10.a(r5, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldb
            return r6
        Ldb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.j.h(d6.a, java.util.List):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(boolean z5) {
        long j;
        byte[] bArr = e6.b.f12673a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f13501c;
        m.b(socket);
        Socket socket2 = this.f13502d;
        m.b(socket2);
        m.b(this.f13505h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        n nVar = this.f13504g;
        if (nVar != null) {
            synchronized (nVar) {
                if (nVar.f14193v) {
                    return false;
                }
                if (nVar.f14176D < nVar.f14175C) {
                    if (jNanoTime >= nVar.f14177E) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f13512q;
        }
        if (j < 10000000000L || !z5) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i6.d j(q qVar, i6.f fVar) {
        int i = fVar.f13653g;
        Socket socket = this.f13502d;
        m.b(socket);
        A a7 = this.f13505h;
        m.b(a7);
        z zVar = this.i;
        m.b(zVar);
        n nVar = this.f13504g;
        if (nVar != null) {
            return new o(qVar, this, fVar, nVar);
        }
        socket.setSoTimeout(i);
        I iD = a7.f16025q.d();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iD.g(j);
        zVar.f16101q.d().g(fVar.f13654h);
        return new j6.f(qVar, this, a7, zVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void k() {
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() throws SocketException {
        Socket socket = this.f13502d;
        m.b(socket);
        A a7 = this.f13505h;
        m.b(a7);
        z zVar = this.i;
        m.b(zVar);
        socket.setSoTimeout(0);
        g6.d taskRunner = g6.d.i;
        m.e(taskRunner, "taskRunner");
        z0 z0Var = new z0();
        z0Var.f15875a = taskRunner;
        z0Var.f = k6.h.f14159a;
        String peerName = this.f13500b.f12444a.f12301h.f12371d;
        m.e(peerName, "peerName");
        z0Var.f15876b = socket;
        String str = e6.b.f + ' ' + peerName;
        m.e(str, "<set-?>");
        z0Var.f15877c = str;
        z0Var.f15878d = a7;
        z0Var.f15879e = zVar;
        z0Var.f = this;
        n nVar = new n(z0Var);
        this.f13504g = nVar;
        k6.z zVar2 = n.f14172P;
        this.f13510o = (zVar2.f14247a & 16) != 0 ? zVar2.f14248b[4] : Integer.MAX_VALUE;
        w wVar = nVar.f14185M;
        synchronized (wVar) {
            try {
                if (wVar.f14241t) {
                    throw new IOException("closed");
                }
                Logger logger = w.f14237v;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e6.b.f(">> CONNECTION " + k6.f.f14155a.d(), new Object[0]));
                }
                wVar.f14238q.i(k6.f.f14155a);
                wVar.f14238q.flush();
            } finally {
            }
        }
        w wVar2 = nVar.f14185M;
        k6.z settings = nVar.f14178F;
        synchronized (wVar2) {
            try {
                m.e(settings, "settings");
                if (wVar2.f14241t) {
                    throw new IOException("closed");
                }
                wVar2.c(0, Integer.bitCount(settings.f14247a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z5 = true;
                    if (((1 << i) & settings.f14247a) == 0) {
                        z5 = false;
                    }
                    if (z5) {
                        wVar2.f14238q.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        wVar2.f14238q.writeInt(settings.f14248b[i]);
                    }
                    i++;
                }
                wVar2.f14238q.flush();
            } finally {
            }
        }
        if (nVar.f14178F.a() != 65535) {
            nVar.f14185M.z(0, r1 - 65535);
        }
        taskRunner.e().c(new g6.b(nVar.f14190s, nVar.f14186N, 0), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        x xVar = this.f13500b;
        sb.append(xVar.f12444a.f12301h.f12371d);
        sb.append(':');
        sb.append(xVar.f12444a.f12301h.f12372e);
        sb.append(", proxy=");
        sb.append(xVar.f12445b);
        sb.append(" hostAddress=");
        sb.append(xVar.f12446c);
        sb.append(" cipherSuite=");
        d6.k kVar = this.f13503e;
        if (kVar == null || (obj = kVar.f12357b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
