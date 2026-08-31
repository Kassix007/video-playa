package i6;

import L0.l;
import O3.Y;
import a.AbstractC0597a;
import c3.C0733c;
import d6.n;
import d6.o;
import d6.s;
import d6.t;
import d6.u;
import d6.w;
import h6.h;
import h6.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import k6.C1191a;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import q6.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13644b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(d6.b cookieJar) {
        m.e(cookieJar, "cookieJar");
        this.f13644b = cookieJar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(u uVar, int i) {
        String strA = u.a(uVar, "Retry-After");
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        m.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        m.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.o
    public final u a(f fVar) {
        w wVar;
        SSLSocketFactory sSLSocketFactory;
        p6.c cVar;
        d6.e eVar;
        switch (this.f13643a) {
            case 0:
                d6.b bVar = (d6.b) this.f13644b;
                s sVar = fVar.f13652e;
                l lVarB = sVar.b();
                d6.l lVar = sVar.f12415c;
                n url = sVar.f12413a;
                k3.c cVar2 = sVar.f12416d;
                if (cVar2 != null) {
                    cVar2.getClass();
                    long jC = cVar2.c();
                    if (jC != -1) {
                        lVarB.m("Content-Length", String.valueOf(jC));
                        ((C0733c) lVarB.f3127d).e("Transfer-Encoding");
                    } else {
                        lVarB.m("Transfer-Encoding", "chunked");
                        ((C0733c) lVarB.f3127d).e("Content-Length");
                    }
                }
                boolean z5 = false;
                if (lVar.d("Host") == null) {
                    lVarB.m("Host", e6.b.s(url, false));
                }
                if (lVar.d("Connection") == null) {
                    lVarB.m("Connection", "Keep-Alive");
                }
                if (lVar.d("Accept-Encoding") == null && lVar.d("Range") == null) {
                    lVarB.m("Accept-Encoding", "gzip");
                    z5 = true;
                }
                bVar.getClass();
                m.e(url, "url");
                if (lVar.d("User-Agent") == null) {
                    lVarB.m("User-Agent", "okhttp/4.12.0");
                }
                u uVarB = fVar.b(lVarB.c());
                d6.l lVar2 = uVarB.f12437v;
                e.b(bVar, url, lVar2);
                t tVarB = uVarB.b();
                tVarB.f12418a = sVar;
                if (z5 && "gzip".equalsIgnoreCase(u.a(uVarB, "Content-Encoding")) && e.a(uVarB) && (wVar = uVarB.f12438w) != null) {
                    q qVar = new q(wVar.O());
                    C0733c c0733cH = lVar2.h();
                    c0733cH.e("Content-Encoding");
                    c0733cH.e("Content-Length");
                    tVarB.f = c0733cH.d().h();
                    tVarB.f12423g = new g(u.a(uVarB, "Content-Type"), -1L, AbstractC0597a.j(qVar));
                }
                return tVarB.a();
            default:
                s sVar2 = fVar.f13652e;
                h hVar = fVar.f13648a;
                List listV0 = n5.s.f15299q;
                u uVar = null;
                int i = 0;
                s request = sVar2;
                while (true) {
                    boolean z6 = true;
                    while (true) {
                        m.e(request, "request");
                        if (hVar.f13497y != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (hVar) {
                            try {
                                if (hVar.f13484A) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (hVar.f13498z) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z6) {
                            Y y6 = hVar.f13491s;
                            n nVar = request.f12413a;
                            d6.q qVar2 = hVar.f13489q;
                            if (nVar.i) {
                                SSLSocketFactory sSLSocketFactory2 = qVar2.f12384E;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                p6.c cVar3 = qVar2.f12388I;
                                eVar = qVar2.f12389J;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar3;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            hVar.f13495w = new h6.d(y6, new d6.a(nVar.f12371d, nVar.f12372e, qVar2.f12380A, qVar2.f12383D, sSLSocketFactory, cVar, eVar, qVar2.f12382C, qVar2.f12387H, qVar2.f12386G, qVar2.f12381B), hVar);
                        }
                        try {
                            if (hVar.f13486C) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u uVarB2 = fVar.b(request);
                                if (uVar != null) {
                                    t tVarB2 = uVarB2.b();
                                    t tVarB3 = uVar.b();
                                    tVarB3.f12423g = null;
                                    u uVarA = tVarB3.a();
                                    if (uVarA.f12438w != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    tVarB2.j = uVarA;
                                    uVarB2 = tVarB2.a();
                                }
                                uVar = uVarB2;
                                request = b(uVar, hVar.f13497y);
                                if (request == null) {
                                    hVar.f(false);
                                    return uVar;
                                }
                                w wVar2 = uVar.f12438w;
                                if (wVar2 != null) {
                                    e6.b.b(wVar2);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                hVar.f(true);
                            } catch (k e7) {
                                if (!c(e7.f13514r, hVar, request, false)) {
                                    IOException iOException = e7.f13513q;
                                    m.e(iOException, "<this>");
                                    Iterator it = listV0.iterator();
                                    while (it.hasNext()) {
                                        AbstractC1362a.a(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                listV0 = n5.l.v0(listV0, e7.f13513q);
                                hVar.f(true);
                                z6 = false;
                            } catch (IOException e8) {
                                if (!c(e8, hVar, request, !(e8 instanceof C1191a))) {
                                    Iterator it2 = listV0.iterator();
                                    while (it2.hasNext()) {
                                        AbstractC1362a.a(e8, (Exception) it2.next());
                                    }
                                    throw e8;
                                }
                                listV0 = n5.l.v0(listV0, e8);
                                hVar.f(true);
                                z6 = false;
                            }
                        } catch (Throwable th2) {
                            hVar.f(true);
                            throw th2;
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d6.s b(d6.u r12, L.s r13) throws java.net.ProtocolException {
        /*
            r11 = this;
            r0 = 0
            if (r13 == 0) goto Lc
            java.lang.Object r1 = r13.f3065e
            h6.j r1 = (h6.j) r1
            if (r1 == 0) goto Lc
            d6.x r1 = r1.f13500b
            goto Ld
        Lc:
            r1 = r0
        Ld:
            int r2 = r12.f12435t
            d6.s r3 = r12.f12432q
            java.lang.String r3 = r3.f12414b
            r4 = 0
            r5 = 1
            r6 = 308(0x134, float:4.32E-43)
            r7 = 307(0x133, float:4.3E-43)
            if (r2 == r7) goto Lc1
            if (r2 == r6) goto Lc1
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto Lb7
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L8a
            r13 = 503(0x1f7, float:7.05E-43)
            if (r2 == r13) goto L74
            r13 = 407(0x197, float:5.7E-43)
            if (r2 == r13) goto L55
            r13 = 408(0x198, float:5.72E-43)
            if (r2 == r13) goto L36
            switch(r2) {
                case 300: goto Lc1;
                case 301: goto Lc1;
                case 302: goto Lc1;
                case 303: goto Lc1;
                default: goto L34;
            }
        L34:
            goto L101
        L36:
            java.lang.Object r1 = r11.f13644b
            d6.q r1 = (d6.q) r1
            boolean r1 = r1.f12400v
            if (r1 != 0) goto L40
            goto L101
        L40:
            d6.u r1 = r12.f12441z
            if (r1 == 0) goto L4a
            int r1 = r1.f12435t
            if (r1 != r13) goto L4a
            goto L101
        L4a:
            int r13 = d(r12, r4)
            if (r13 <= 0) goto L52
            goto L101
        L52:
            d6.s r12 = r12.f12432q
            return r12
        L55:
            kotlin.jvm.internal.m.b(r1)
            java.net.Proxy r12 = r1.f12445b
            java.net.Proxy$Type r12 = r12.type()
            java.net.Proxy$Type r13 = java.net.Proxy.Type.HTTP
            if (r12 != r13) goto L6c
            java.lang.Object r12 = r11.f13644b
            d6.q r12 = (d6.q) r12
            d6.b r12 = r12.f12382C
            r12.getClass()
            return r0
        L6c:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r12.<init>(r13)
            throw r12
        L74:
            d6.u r1 = r12.f12441z
            if (r1 == 0) goto L7e
            int r1 = r1.f12435t
            if (r1 != r13) goto L7e
            goto L101
        L7e:
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r13 = d(r12, r13)
            if (r13 != 0) goto L101
            d6.s r12 = r12.f12432q
            return r12
        L8a:
            if (r13 == 0) goto L101
            java.lang.Object r1 = r13.f3063c
            h6.d r1 = (h6.d) r1
            d6.a r1 = r1.f13473b
            d6.n r1 = r1.f12301h
            java.lang.String r1 = r1.f12371d
            java.lang.Object r2 = r13.f3065e
            h6.j r2 = (h6.j) r2
            d6.x r2 = r2.f13500b
            d6.a r2 = r2.f12444a
            d6.n r2 = r2.f12301h
            java.lang.String r2 = r2.f12371d
            boolean r1 = kotlin.jvm.internal.m.a(r1, r2)
            if (r1 == 0) goto La9
            goto L101
        La9:
            java.lang.Object r13 = r13.f3065e
            h6.j r13 = (h6.j) r13
            monitor-enter(r13)
            r13.f13506k = r5     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r13)
            d6.s r12 = r12.f12432q
            return r12
        Lb4:
            r12 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lb4
            throw r12
        Lb7:
            java.lang.Object r12 = r11.f13644b
            d6.q r12 = (d6.q) r12
            d6.b r12 = r12.f12401w
            r12.getClass()
            return r0
        Lc1:
            java.lang.String r13 = "PROPFIND"
            java.lang.Object r1 = r11.f13644b
            d6.q r1 = (d6.q) r1
            boolean r2 = r1.f12402x
            if (r2 != 0) goto Lcc
            goto L101
        Lcc:
            java.lang.String r2 = "Location"
            java.lang.String r2 = d6.u.a(r12, r2)
            d6.s r8 = r12.f12432q
            if (r2 != 0) goto Ld7
            goto L101
        Ld7:
            d6.n r9 = r8.f12413a
            r9.getClass()
            d6.m r10 = new d6.m     // Catch: java.lang.IllegalArgumentException -> Le5
            r10.<init>()     // Catch: java.lang.IllegalArgumentException -> Le5
            r10.c(r9, r2)     // Catch: java.lang.IllegalArgumentException -> Le5
            goto Le6
        Le5:
            r10 = r0
        Le6:
            if (r10 == 0) goto Led
            d6.n r2 = r10.a()
            goto Lee
        Led:
            r2 = r0
        Lee:
            if (r2 != 0) goto Lf1
            goto L101
        Lf1:
            java.lang.String r9 = r2.f12368a
            d6.n r10 = r8.f12413a
            java.lang.String r10 = r10.f12368a
            boolean r9 = kotlin.jvm.internal.m.a(r9, r10)
            if (r9 != 0) goto L102
            boolean r1 = r1.f12403y
            if (r1 != 0) goto L102
        L101:
            return r0
        L102:
            L0.l r1 = r8.b()
            boolean r9 = D5.a.A(r3)
            if (r9 == 0) goto L14d
            int r12 = r12.f12435t
            boolean r9 = r3.equals(r13)
            if (r9 != 0) goto L118
            if (r12 == r6) goto L118
            if (r12 != r7) goto L119
        L118:
            r4 = r5
        L119:
            boolean r13 = r3.equals(r13)
            if (r13 != 0) goto L129
            if (r12 == r6) goto L129
            if (r12 == r7) goto L129
            java.lang.String r12 = "GET"
            r1.o(r12, r0)
            goto L130
        L129:
            if (r4 == 0) goto L12d
            k3.c r0 = r8.f12416d
        L12d:
            r1.o(r3, r0)
        L130:
            if (r4 != 0) goto L14d
            java.lang.String r12 = "Transfer-Encoding"
            java.lang.Object r13 = r1.f3127d
            c3.c r13 = (c3.C0733c) r13
            r13.e(r12)
            java.lang.String r12 = "Content-Length"
            java.lang.Object r13 = r1.f3127d
            c3.c r13 = (c3.C0733c) r13
            r13.e(r12)
            java.lang.String r12 = "Content-Type"
            java.lang.Object r13 = r1.f3127d
            c3.c r13 = (c3.C0733c) r13
            r13.e(r12)
        L14d:
            d6.n r12 = r8.f12413a
            boolean r12 = e6.b.a(r12, r2)
            if (r12 != 0) goto L15e
            java.lang.String r12 = "Authorization"
            java.lang.Object r13 = r1.f3127d
            c3.c r13 = (c3.C0733c) r13
            r13.e(r12)
        L15e:
            r1.f3125b = r2
            d6.s r12 = r1.c()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.a.b(d6.u, L.s):d6.s");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.io.IOException r4, h6.h r5, d6.s r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.f13644b
            d6.q r6 = (d6.q) r6
            boolean r6 = r6.f12400v
            r0 = 0
            if (r6 != 0) goto Lb
            goto L9d
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L9d
            if (r7 != 0) goto L9d
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto L9d
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            h6.d r4 = r5.f13495w
            kotlin.jvm.internal.m.b(r4)
            int r5 = r4.f
            r6 = 1
            if (r5 != 0) goto L49
            int r7 = r4.f13477g
            if (r7 != 0) goto L49
            int r7 = r4.f13478h
            if (r7 != 0) goto L49
            r4 = r0
            goto L9b
        L49:
            d6.x r7 = r4.i
            if (r7 == 0) goto L4e
            goto L96
        L4e:
            r7 = 0
            if (r5 > r6) goto L81
            int r5 = r4.f13477g
            if (r5 > r6) goto L81
            int r5 = r4.f13478h
            if (r5 <= 0) goto L5a
            goto L81
        L5a:
            h6.h r5 = r4.f13474c
            h6.j r5 = r5.f13496x
            if (r5 != 0) goto L61
            goto L81
        L61:
            monitor-enter(r5)
            int r1 = r5.f13507l     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L68
            monitor-exit(r5)
            goto L81
        L68:
            d6.x r1 = r5.f13500b     // Catch: java.lang.Throwable -> L7e
            d6.a r1 = r1.f12444a     // Catch: java.lang.Throwable -> L7e
            d6.n r1 = r1.f12301h     // Catch: java.lang.Throwable -> L7e
            d6.a r2 = r4.f13473b     // Catch: java.lang.Throwable -> L7e
            d6.n r2 = r2.f12301h     // Catch: java.lang.Throwable -> L7e
            boolean r1 = e6.b.a(r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7a
            monitor-exit(r5)
            goto L81
        L7a:
            d6.x r7 = r5.f13500b     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r5)
            goto L81
        L7e:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L81:
            if (r7 == 0) goto L87
            r4.i = r7
        L85:
            r4 = r6
            goto L9b
        L87:
            U.l r5 = r4.f13475d
            if (r5 == 0) goto L92
            boolean r5 = r5.g()
            if (r5 != r6) goto L92
            goto L96
        L92:
            W1.l r4 = r4.f13476e
            if (r4 != 0) goto L97
        L96:
            goto L85
        L97:
            boolean r4 = r4.d()
        L9b:
            if (r4 != 0) goto L9e
        L9d:
            return r0
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.a.c(java.io.IOException, h6.h, d6.s, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public a(d6.q qVar) {
        this.f13644b = qVar;
    }
}
