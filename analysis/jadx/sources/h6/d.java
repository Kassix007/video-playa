package h6;

import O3.Y;
import U.l;
import d6.n;
import d6.x;
import java.io.IOException;
import k6.A;
import k6.C1191a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f13472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6.a f13473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f13474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f13475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public W1.l f13476e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13478h;
    public x i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Y connectionPool, d6.a aVar, h hVar) {
        m.e(connectionPool, "connectionPool");
        this.f13472a = connectionPool;
        this.f13473b = aVar;
        this.f13474c = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.j a(int r13, int r14, int r15, boolean r16, boolean r17) throws java.io.IOException {
        /*
            r12 = this;
        L0:
            h6.h r0 = r12.f13474c
            boolean r0 = r0.f13486C
            if (r0 != 0) goto L369
            h6.h r0 = r12.f13474c
            h6.j r1 = r0.f13496x
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L48
            monitor-enter(r1)
            boolean r3 = r1.j     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L25
            d6.x r3 = r1.f13500b     // Catch: java.lang.Throwable -> L22
            d6.a r3 = r3.f12444a     // Catch: java.lang.Throwable -> L22
            d6.n r3 = r3.f12301h     // Catch: java.lang.Throwable -> L22
            boolean r3 = r12.b(r3)     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L20
            goto L25
        L20:
            r3 = r2
            goto L2b
        L22:
            r0 = move-exception
            r13 = r0
            goto L46
        L25:
            h6.h r3 = r12.f13474c     // Catch: java.lang.Throwable -> L22
            java.net.Socket r3 = r3.j()     // Catch: java.lang.Throwable -> L22
        L2b:
            monitor-exit(r1)
            h6.h r4 = r12.f13474c
            h6.j r4 = r4.f13496x
            if (r4 == 0) goto L40
            if (r3 != 0) goto L38
        L34:
            r2 = r17
            goto L318
        L38:
            java.lang.String r13 = "Check failed."
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r13)
            throw r14
        L40:
            if (r3 == 0) goto L48
            e6.b.c(r3)
            goto L48
        L46:
            monitor-exit(r1)
            throw r13
        L48:
            r1 = 0
            r12.f = r1
            r12.f13477g = r1
            r12.f13478h = r1
            O3.Y r3 = r12.f13472a
            d6.a r4 = r12.f13473b
            h6.h r5 = r12.f13474c
            boolean r3 = r3.a(r4, r5, r2, r1)
            if (r3 == 0) goto L63
            h6.h r1 = r12.f13474c
            h6.j r1 = r1.f13496x
            kotlin.jvm.internal.m.b(r1)
            goto L34
        L63:
            d6.x r3 = r12.i
            if (r3 == 0) goto L6c
            r12.i = r2
        L69:
            r4 = r2
            goto L2ac
        L6c:
            U.l r3 = r12.f13475d
            if (r3 == 0) goto L99
            boolean r3 = r3.g()
            if (r3 == 0) goto L99
            U.l r1 = r12.f13475d
            kotlin.jvm.internal.m.b(r1)
            boolean r3 = r1.g()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r1.f7511r
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r1.f7510q
            int r5 = r4 + 1
            r1.f7510q = r5
            java.lang.Object r1 = r3.get(r4)
            r3 = r1
            d6.x r3 = (d6.x) r3
            goto L69
        L93:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L99:
            W1.l r3 = r12.f13476e
            if (r3 != 0) goto Lac
            W1.l r3 = new W1.l
            d6.a r4 = r12.f13473b
            h6.h r5 = r12.f13474c
            d6.q r6 = r5.f13489q
            k3.d r6 = r6.f12394O
            r3.<init>(r4, r6, r5)
            r12.f13476e = r3
        Lac:
            boolean r4 = r3.d()
            if (r4 == 0) goto L363
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        Lb7:
            int r5 = r3.f8091a
            java.lang.Object r6 = r3.f8095e
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r5 >= r6) goto L261
            java.lang.Object r5 = r3.f8092b
            d6.a r5 = (d6.a) r5
            java.lang.String r6 = "No route to "
            int r7 = r3.f8091a
            java.lang.Object r8 = r3.f8095e
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            if (r7 >= r8) goto L23f
            java.lang.Object r7 = r3.f8095e
            java.util.List r7 = (java.util.List) r7
            int r8 = r3.f8091a
            int r9 = r8 + 1
            r3.f8091a = r9
            java.lang.Object r7 = r7.get(r8)
            java.net.Proxy r7 = (java.net.Proxy) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.f = r8
            java.net.Proxy$Type r9 = r7.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L14b
            java.net.Proxy$Type r9 = r7.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto Lfd
            goto L14b
        Lfd:
            java.net.SocketAddress r9 = r7.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L12f
            java.lang.String r10 = "proxyAddress"
            kotlin.jvm.internal.m.d(r9, r10)
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.m.e(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 != 0) goto L121
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
            kotlin.jvm.internal.m.d(r10, r11)
            goto L12a
        L121:
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            kotlin.jvm.internal.m.d(r10, r11)
        L12a:
            int r9 = r9.getPort()
            goto L151
        L12f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Proxy.address() is not an InetSocketAddress: "
            r13.<init>(r14)
            java.lang.Class r14 = r9.getClass()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L14b:
            d6.n r9 = r5.f12301h
            java.lang.String r10 = r9.f12371d
            int r9 = r9.f12372e
        L151:
            if (r0 > r9) goto L220
            r11 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r11) goto L220
            java.net.Proxy$Type r6 = r7.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r6 != r11) goto L167
            java.net.InetSocketAddress r5 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r5)
            goto L1b1
        L167:
            byte[] r6 = e6.b.f12673a
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.m.e(r10, r6)
            J5.k r6 = e6.b.f12677e
            boolean r6 = r6.c(r10)
            if (r6 == 0) goto L17f
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r10)
            java.util.List r5 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r5)
            goto L198
        L17f:
            d6.b r6 = r5.f12295a
            r6.getClass()
            java.net.InetAddress[] r6 = java.net.InetAddress.getAllByName(r10)     // Catch: java.lang.NullPointerException -> L20f
            java.lang.String r11 = "getAllByName(hostname)"
            kotlin.jvm.internal.m.d(r6, r11)     // Catch: java.lang.NullPointerException -> L20f
            java.util.List r6 = n5.k.R0(r6)     // Catch: java.lang.NullPointerException -> L20f
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L1f3
            r5 = r6
        L198:
            java.util.Iterator r5 = r5.iterator()
        L19c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1b1
            java.lang.Object r6 = r5.next()
            java.net.InetAddress r6 = (java.net.InetAddress) r6
            java.net.InetSocketAddress r10 = new java.net.InetSocketAddress
            r10.<init>(r6, r9)
            r8.add(r10)
            goto L19c
        L1b1:
            java.lang.Object r5 = r3.f
            java.util.Iterator r5 = r5.iterator()
        L1b7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1ec
            java.lang.Object r6 = r5.next()
            java.net.InetSocketAddress r6 = (java.net.InetSocketAddress) r6
            d6.x r8 = new d6.x
            java.lang.Object r9 = r3.f8092b
            d6.a r9 = (d6.a) r9
            r8.<init>(r9, r7, r6)
            java.lang.Object r6 = r3.f8094d
            k3.d r6 = (k3.d) r6
            monitor-enter(r6)
            java.lang.Object r9 = r6.f14122r     // Catch: java.lang.Throwable -> L1e8
            java.util.LinkedHashSet r9 = (java.util.LinkedHashSet) r9     // Catch: java.lang.Throwable -> L1e8
            boolean r9 = r9.contains(r8)     // Catch: java.lang.Throwable -> L1e8
            monitor-exit(r6)
            if (r9 == 0) goto L1e4
            java.lang.Object r6 = r3.f8093c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r8)
            goto L1b7
        L1e4:
            r4.add(r8)
            goto L1b7
        L1e8:
            r0 = move-exception
            r13 = r0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e8
            throw r13
        L1ec:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto Lb7
            goto L261
        L1f3:
            java.net.UnknownHostException r13 = new java.net.UnknownHostException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            d6.b r15 = r5.f12295a
            r14.append(r15)
            java.lang.String r15 = " returned no addresses for "
            r14.append(r15)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L20f:
            r0 = move-exception
            r13 = r0
            java.net.UnknownHostException r14 = new java.net.UnknownHostException
            java.lang.String r15 = "Broken system behaviour for dns lookup of "
            java.lang.String r15 = r15.concat(r10)
            r14.<init>(r15)
            r14.initCause(r13)
            throw r14
        L220:
            java.net.SocketException r13 = new java.net.SocketException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r6)
            r14.append(r10)
            r15 = 58
            r14.append(r15)
            r14.append(r9)
            java.lang.String r15 = "; port is out of range"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L23f:
            java.net.SocketException r13 = new java.net.SocketException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r6)
            d6.n r15 = r5.f12301h
            java.lang.String r15 = r15.f12371d
            r14.append(r15)
            java.lang.String r15 = "; exhausted proxy configurations: "
            r14.append(r15)
            java.lang.Object r15 = r3.f8095e
            java.util.List r15 = (java.util.List) r15
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L261:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L275
            java.lang.Object r5 = r3.f8093c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            n5.q.e0(r4, r5)
            java.lang.Object r3 = r3.f8093c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
        L275:
            U.l r3 = new U.l
            r3.<init>()
            r3.f7511r = r4
            r12.f13475d = r3
            h6.h r5 = r12.f13474c
            boolean r5 = r5.f13486C
            if (r5 != 0) goto L35b
            O3.Y r5 = r12.f13472a
            d6.a r6 = r12.f13473b
            h6.h r7 = r12.f13474c
            boolean r1 = r5.a(r6, r7, r4, r1)
            if (r1 == 0) goto L299
            h6.h r1 = r12.f13474c
            h6.j r1 = r1.f13496x
            kotlin.jvm.internal.m.b(r1)
            goto L34
        L299:
            boolean r1 = r3.g()
            if (r1 == 0) goto L355
            int r1 = r3.f7510q
            int r5 = r1 + 1
            r3.f7510q = r5
            java.lang.Object r1 = r4.get(r1)
            r3 = r1
            d6.x r3 = (d6.x) r3
        L2ac:
            h6.j r5 = new h6.j
            O3.Y r1 = r12.f13472a
            r5.<init>(r1, r3)
            h6.h r1 = r12.f13474c
            r1.f13488E = r5
            h6.h r10 = r12.f13474c     // Catch: java.lang.Throwable -> L34e
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r5.c(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L34e
            h6.h r1 = r12.f13474c
            r1.f13488E = r2
            h6.h r1 = r12.f13474c
            d6.q r1 = r1.f13489q
            k3.d r1 = r1.f12394O
            monitor-enter(r1)
            java.lang.Object r2 = r1.f14122r     // Catch: java.lang.Throwable -> L34a
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L34a
            r2.remove(r3)     // Catch: java.lang.Throwable -> L34a
            monitor-exit(r1)
            O3.Y r1 = r12.f13472a
            d6.a r2 = r12.f13473b
            h6.h r6 = r12.f13474c
            boolean r1 = r1.a(r2, r6, r4, r0)
            if (r1 == 0) goto L2f3
            h6.h r1 = r12.f13474c
            h6.j r1 = r1.f13496x
            kotlin.jvm.internal.m.b(r1)
            r12.i = r3
            java.net.Socket r2 = r5.f13502d
            kotlin.jvm.internal.m.b(r2)
            e6.b.c(r2)
            goto L34
        L2f3:
            monitor-enter(r5)
            O3.Y r1 = r12.f13472a     // Catch: java.lang.Throwable -> L346
            r1.getClass()     // Catch: java.lang.Throwable -> L346
            byte[] r2 = e6.b.f12673a     // Catch: java.lang.Throwable -> L346
            java.lang.Object r2 = r1.f4683e     // Catch: java.lang.Throwable -> L346
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2     // Catch: java.lang.Throwable -> L346
            r2.add(r5)     // Catch: java.lang.Throwable -> L346
            java.lang.Object r2 = r1.f4681c     // Catch: java.lang.Throwable -> L346
            g6.c r2 = (g6.c) r2     // Catch: java.lang.Throwable -> L346
            java.lang.Object r1 = r1.f4682d     // Catch: java.lang.Throwable -> L346
            g6.b r1 = (g6.b) r1     // Catch: java.lang.Throwable -> L346
            r3 = 0
            r2.c(r1, r3)     // Catch: java.lang.Throwable -> L346
            h6.h r1 = r12.f13474c     // Catch: java.lang.Throwable -> L346
            r1.b(r5)     // Catch: java.lang.Throwable -> L346
            monitor-exit(r5)
            r2 = r17
            r1 = r5
        L318:
            boolean r3 = r1.i(r2)
            if (r3 == 0) goto L31f
            return r1
        L31f:
            r1.k()
            d6.x r1 = r12.i
            if (r1 != 0) goto L0
            U.l r1 = r12.f13475d
            if (r1 == 0) goto L32f
            boolean r1 = r1.g()
            goto L330
        L32f:
            r1 = r0
        L330:
            if (r1 != 0) goto L0
            W1.l r1 = r12.f13476e
            if (r1 == 0) goto L33a
            boolean r0 = r1.d()
        L33a:
            if (r0 == 0) goto L33e
            goto L0
        L33e:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "exhausted all routes"
            r13.<init>(r14)
            throw r13
        L346:
            r0 = move-exception
            r13 = r0
            monitor-exit(r5)
            throw r13
        L34a:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34a
            throw r13
        L34e:
            r0 = move-exception
            r13 = r0
            h6.h r14 = r12.f13474c
            r14.f13488E = r2
            throw r13
        L355:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L35b:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Canceled"
            r13.<init>(r14)
            throw r13
        L363:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L369:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Canceled"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.d.a(int, int, int, boolean, boolean):h6.j");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(n url) {
        m.e(url, "url");
        n nVar = this.f13473b.f12301h;
        return url.f12372e == nVar.f12372e && m.a(url.f12371d, nVar.f12371d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(IOException e7) {
        m.e(e7, "e");
        this.i = null;
        if ((e7 instanceof A) && ((A) e7).f14132q == 8) {
            this.f++;
        } else if (e7 instanceof C1191a) {
            this.f13477g++;
        } else {
            this.f13478h++;
        }
    }
}
