package v2;

import a.AbstractC0597a;
import d6.w;
import q6.InterfaceC1540i;
import q6.t;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0597a f17545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1540i f17547s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(InterfaceC1540i interfaceC1540i, AbstractC0597a abstractC0597a) {
        this.f17545q = abstractC0597a;
        this.f17547s = interfaceC1540i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final synchronized InterfaceC1540i O() {
        InterfaceC1540i interfaceC1540i;
        try {
            if (this.f17546r) {
                throw new IllegalStateException("closed");
            }
            interfaceC1540i = this.f17547s;
            if (interfaceC1540i == null) {
                t tVar = q6.l.f16071q;
                kotlin.jvm.internal.m.b(null);
                tVar.a0(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC1540i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w
    public final AbstractC0597a c() {
        return this.f17545q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d6.w, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17546r = true;
        InterfaceC1540i interfaceC1540i = this.f17547s;
        if (interfaceC1540i != null) {
            H2.f.a(interfaceC1540i);
        }
    }
}
