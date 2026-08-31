package d6;

import C0.Z0;
import E.c0;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Cloneable, d {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final List f12378P = e6.b.i(r.HTTP_2, r.HTTP_1_1);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final List f12379Q = e6.b.i(i.f12341e, i.f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f12380A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ProxySelector f12381B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b f12382C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final SocketFactory f12383D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final SSLSocketFactory f12384E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final X509TrustManager f12385F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final List f12386G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final List f12387H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p6.c f12388I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final e f12389J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final l6.d f12390K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f12391L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f12392M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f12393N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final k3.d f12394O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f12395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k3.c f12396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f12397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f12398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Z0 f12399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f12401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f12403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f12404z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q() throws NoSuchAlgorithmException, KeyStoreException {
        c0 c0Var = new c0(10);
        k3.c cVar = new k3.c(26);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Z0 z02 = new Z0(8);
        b bVar = b.f12302a;
        b bVar2 = b.f12303b;
        b bVar3 = b.f12304c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.m.d(socketFactory, "getDefault()");
        List list = f12379Q;
        List list2 = f12378P;
        p6.c cVar2 = p6.c.f15903a;
        e eVar = e.f12317c;
        this.f12395q = c0Var;
        this.f12396r = cVar;
        this.f12397s = e6.b.t(arrayList);
        this.f12398t = e6.b.t(arrayList2);
        this.f12399u = z02;
        this.f12400v = true;
        this.f12401w = bVar;
        this.f12402x = true;
        this.f12403y = true;
        this.f12404z = bVar2;
        this.f12380A = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f12381B = proxySelector == null ? n6.a.f15305a : proxySelector;
        this.f12382C = bVar;
        this.f12383D = socketFactory;
        this.f12386G = list;
        this.f12387H = list2;
        this.f12388I = cVar2;
        this.f12391L = 10000;
        this.f12392M = 10000;
        this.f12393N = 10000;
        this.f12394O = new k3.d(29);
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            this.f12384E = null;
            this.f12390K = null;
            this.f12385F = null;
            this.f12389J = e.f12317c;
        } else {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f12342a) {
                    l6.m mVar = l6.m.f14610a;
                    X509TrustManager x509TrustManagerM = l6.m.f14610a.m();
                    this.f12385F = x509TrustManagerM;
                    this.f12384E = l6.m.f14610a.l(x509TrustManagerM);
                    l6.d dVarB = l6.m.f14610a.b(x509TrustManagerM);
                    this.f12390K = dVarB;
                    this.f12389J = kotlin.jvm.internal.m.a(eVar.f12319b, dVarB) ? eVar : new e(eVar.f12318a, dVarB);
                }
            }
            this.f12384E = null;
            this.f12390K = null;
            this.f12385F = null;
            this.f12389J = e.f12317c;
        }
        X509TrustManager x509TrustManager = this.f12385F;
        l6.d dVar = this.f12390K;
        SSLSocketFactory sSLSocketFactory = this.f12384E;
        List list4 = this.f12398t;
        List list5 = this.f12397s;
        kotlin.jvm.internal.m.c(list5, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list5.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list5).toString());
        }
        kotlin.jvm.internal.m.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List list6 = this.f12386G;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f12342a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (dVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (dVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.m.a(this.f12389J, e.f12317c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        return super.clone();
    }
}
