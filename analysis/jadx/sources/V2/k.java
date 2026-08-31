package v2;

import a.AbstractC0597a;
import d6.w;
import java.io.Closeable;
import q6.A;
import q6.InterfaceC1540i;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f17538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q6.l f17539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f17540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Closeable f17541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public A f17543v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(x xVar, q6.l lVar, String str, Closeable closeable) {
        this.f17538q = xVar;
        this.f17539r = lVar;
        this.f17540s = str;
        this.f17541t = closeable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final synchronized InterfaceC1540i O() {
        if (this.f17542u) {
            throw new IllegalStateException("closed");
        }
        A a7 = this.f17543v;
        if (a7 != null) {
            return a7;
        }
        A aJ = AbstractC0597a.j(this.f17539r.a0(this.f17538q));
        this.f17543v = aJ;
        return aJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final AbstractC0597a c() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f17542u = true;
            A a7 = this.f17543v;
            if (a7 != null) {
                H2.f.a(a7);
            }
            Closeable closeable = this.f17541t;
            if (closeable != null) {
                H2.f.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
