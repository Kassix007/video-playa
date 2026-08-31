package j6;

import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.E;
import q6.I;
import q6.InterfaceC1539h;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f13896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f13898s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(f fVar) {
        this.f13898s = fVar;
        this.f13896q = new p(fVar.f13909d.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) {
        InterfaceC1539h interfaceC1539h = this.f13898s.f13909d;
        m.e(source, "source");
        if (this.f13897r) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        interfaceC1539h.j(j);
        interfaceC1539h.R("\r\n");
        interfaceC1539h.Z(j, source);
        interfaceC1539h.R("\r\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f13897r) {
            return;
        }
        this.f13897r = true;
        this.f13898s.f13909d.R("0\r\n\r\n");
        p pVar = this.f13896q;
        I i = pVar.f16076e;
        pVar.f16076e = I.f16040d;
        i.a();
        i.b();
        this.f13898s.f13910e = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        return this.f13896q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Flushable
    public final synchronized void flush() {
        if (this.f13897r) {
            return;
        }
        this.f13898s.f13909d.flush();
    }
}
