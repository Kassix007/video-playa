package k6;

import E.Y;
import c3.C0733c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import q6.C1541j;
import q6.E;
import q6.G;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f14198g = e6.b.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f14199h = e6.b.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.j f14200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.f f14201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f14202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile v f14203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d6.r f14204e;
    public volatile boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(d6.q qVar, h6.j jVar, i6.f fVar, n http2Connection) {
        kotlin.jvm.internal.m.e(http2Connection, "http2Connection");
        this.f14200a = jVar;
        this.f14201b = fVar;
        this.f14202c = http2Connection;
        List list = qVar.f12387H;
        d6.r rVar = d6.r.H2_PRIOR_KNOWLEDGE;
        this.f14204e = list.contains(rVar) ? rVar : d6.r.HTTP_2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final E a(d6.s request, long j) {
        kotlin.jvm.internal.m.e(request, "request");
        v vVar = this.f14203d;
        kotlin.jvm.internal.m.b(vVar);
        return vVar.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void b() {
        v vVar = this.f14203d;
        kotlin.jvm.internal.m.b(vVar);
        vVar.f().close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void c(d6.s request) throws IOException {
        int i;
        v vVar;
        boolean z5;
        kotlin.jvm.internal.m.e(request, "request");
        if (this.f14203d != null) {
            return;
        }
        boolean z6 = request.f12416d != null;
        d6.l lVar = request.f12415c;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new b(b.f, request.f12414b));
        C1541j c1541j = b.f14135g;
        d6.n url = request.f12413a;
        kotlin.jvm.internal.m.e(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new b(c1541j, strB));
        String strD2 = request.f12415c.d("Host");
        if (strD2 != null) {
            arrayList.add(new b(b.i, strD2));
        }
        arrayList.add(new b(b.f14136h, url.f12368a));
        int size = lVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            String strG = lVar.g(i7);
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = strG.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f14198g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.m.a(lVar.i(i7), "trailers"))) {
                arrayList.add(new b(lowerCase, lVar.i(i7)));
            }
        }
        n nVar = this.f14202c;
        nVar.getClass();
        boolean z7 = !z6;
        synchronized (nVar.f14185M) {
            synchronized (nVar) {
                try {
                    if (nVar.f14192u > 1073741823) {
                        nVar.e(8);
                    }
                    if (nVar.f14193v) {
                        throw new C1191a();
                    }
                    i = nVar.f14192u;
                    nVar.f14192u = i + 2;
                    vVar = new v(i, nVar, z7, false, null);
                    z5 = !z6 || nVar.f14182J >= nVar.f14183K || vVar.f14230e >= vVar.f;
                    if (vVar.h()) {
                        nVar.f14189r.put(Integer.valueOf(i), vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            nVar.f14185M.f(z7, i, arrayList);
        }
        if (z5) {
            nVar.f14185M.flush();
        }
        this.f14203d = vVar;
        if (this.f) {
            v vVar2 = this.f14203d;
            kotlin.jvm.internal.m.b(vVar2);
            vVar2.e(9);
            throw new IOException("Canceled");
        }
        v vVar3 = this.f14203d;
        kotlin.jvm.internal.m.b(vVar3);
        u uVar = vVar3.f14233k;
        long j = this.f14201b.f13653g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.g(j);
        v vVar4 = this.f14203d;
        kotlin.jvm.internal.m.b(vVar4);
        vVar4.f14234l.g(this.f14201b.f13654h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void cancel() {
        this.f = true;
        v vVar = this.f14203d;
        if (vVar != null) {
            vVar.e(9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final void d() {
        this.f14202c.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final G e(d6.u uVar) {
        v vVar = this.f14203d;
        kotlin.jvm.internal.m.b(vVar);
        return vVar.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final d6.t f(boolean z5) throws IOException {
        d6.l lVar;
        v vVar = this.f14203d;
        if (vVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (vVar) {
            vVar.f14233k.h();
            while (vVar.f14231g.isEmpty() && vVar.f14235m == 0) {
                try {
                    try {
                        vVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    vVar.f14233k.k();
                    throw th;
                }
            }
            vVar.f14233k.k();
            if (vVar.f14231g.isEmpty()) {
                IOException iOException = vVar.f14236n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = vVar.f14235m;
                k1.i.m(i);
                throw new A(i);
            }
            Object objRemoveFirst = vVar.f14231g.removeFirst();
            kotlin.jvm.internal.m.d(objRemoveFirst, "headersQueue.removeFirst()");
            lVar = (d6.l) objRemoveFirst;
        }
        d6.r protocol = this.f14204e;
        kotlin.jvm.internal.m.e(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = lVar.size();
        Y yK = null;
        for (int i7 = 0; i7 < size; i7++) {
            String name = lVar.g(i7);
            String value = lVar.i(i7);
            if (kotlin.jvm.internal.m.a(name, ":status")) {
                yK = E3.h.K("HTTP/1.1 " + value);
            } else if (!f14199h.contains(name)) {
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(value, "value");
                arrayList.add(name);
                arrayList.add(J5.m.n1(value).toString());
            }
        }
        if (yK == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        d6.t tVar = new d6.t();
        tVar.f12419b = protocol;
        tVar.f12420c = yK.f1519b;
        tVar.f12421d = (String) yK.f1521d;
        String[] elements = (String[]) arrayList.toArray(new String[0]);
        C0733c c0733c = new C0733c(1);
        ArrayList arrayList2 = c0733c.f10129a;
        kotlin.jvm.internal.m.e(arrayList2, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        arrayList2.addAll(n5.k.x0(elements));
        tVar.f = c0733c;
        if (z5 && tVar.f12420c == 100) {
            return null;
        }
        return tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final h6.j g() {
        return this.f14200a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i6.d
    public final long h(d6.u uVar) {
        if (i6.e.a(uVar)) {
            return e6.b.h(uVar);
        }
        return 0L;
    }
}
