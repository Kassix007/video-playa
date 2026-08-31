package j6;

import E.Y;
import E3.h;
import K2.g;
import O3.T;
import d6.l;
import d6.n;
import d6.q;
import d6.r;
import d6.s;
import d6.t;
import d6.u;
import h6.j;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import kotlin.jvm.internal.m;
import q6.A;
import q6.E;
import q6.G;
import q6.InterfaceC1539h;
import q6.InterfaceC1540i;
import q6.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1540i f13908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1539h f13909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13910e;
    public final T f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f13911g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(q qVar, j jVar, A source, z sink) {
        m.e(source, "source");
        m.e(sink, "sink");
        this.f13906a = qVar;
        this.f13907b = jVar;
        this.f13908c = source;
        this.f13909d = sink;
        this.f = new T(source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final E a(s request, long j) {
        m.e(request, "request");
        if ("chunked".equalsIgnoreCase(request.f12415c.d("Transfer-Encoding"))) {
            if (this.f13910e == 1) {
                this.f13910e = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f13910e).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f13910e == 1) {
            this.f13910e = 2;
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f13910e).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void b() {
        this.f13909d.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void c(s request) {
        m.e(request, "request");
        Proxy.Type type = this.f13907b.f13500b.f12445b.type();
        m.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f12414b);
        sb.append(' ');
        n nVar = request.f12413a;
        if (nVar.i || type != Proxy.Type.HTTP) {
            String strB = nVar.b();
            String strD = nVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        m.d(string, "StringBuilder().apply(builderAction).toString()");
        j(request.f12415c, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void cancel() {
        Socket socket = this.f13907b.f13501c;
        if (socket != null) {
            e6.b.c(socket);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void d() {
        this.f13909d.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final G e(u uVar) {
        if (!i6.e.a(uVar)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(u.a(uVar, "Transfer-Encoding"))) {
            n nVar = uVar.f12432q.f12413a;
            if (this.f13910e == 4) {
                this.f13910e = 5;
                return new c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f13910e).toString());
        }
        long jH = e6.b.h(uVar);
        if (jH != -1) {
            return i(jH);
        }
        if (this.f13910e == 4) {
            this.f13910e = 5;
            this.f13907b.k();
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f13910e).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final t f(boolean z5) {
        T t6 = this.f;
        int i = this.f13910e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f13910e).toString());
        }
        try {
            String strE = ((InterfaceC1540i) t6.f4573s).E(t6.f4572r);
            t6.f4572r -= (long) strE.length();
            Y yK = h.K(strE);
            int i7 = yK.f1519b;
            t tVar = new t();
            tVar.f12419b = (r) yK.f1520c;
            tVar.f12420c = i7;
            tVar.f12421d = (String) yK.f1521d;
            tVar.f = t6.h().h();
            if (z5 && i7 == 100) {
                return null;
            }
            if (i7 == 100) {
                this.f13910e = 3;
                return tVar;
            }
            if (102 > i7 || i7 >= 200) {
                this.f13910e = 4;
                return tVar;
            }
            this.f13910e = 3;
            return tVar;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on ".concat(this.f13907b.f13500b.f12444a.f12301h.f()), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final j g() {
        return this.f13907b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final long h(u uVar) {
        if (!i6.e.a(uVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(u.a(uVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return e6.b.h(uVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d i(long j) {
        if (this.f13910e == 4) {
            this.f13910e = 5;
            return new d(this, j);
        }
        throw new IllegalStateException(("state: " + this.f13910e).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(l lVar, String requestLine) {
        m.e(requestLine, "requestLine");
        if (this.f13910e != 0) {
            throw new IllegalStateException(("state: " + this.f13910e).toString());
        }
        InterfaceC1539h interfaceC1539h = this.f13909d;
        interfaceC1539h.R(requestLine).R("\r\n");
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            interfaceC1539h.R(lVar.g(i)).R(": ").R(lVar.i(i)).R("\r\n");
        }
        interfaceC1539h.R("\r\n");
        this.f13910e = 1;
    }
}
