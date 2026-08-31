package k6;

import java.io.InterruptedIOException;
import q6.C1538g;
import q6.E;
import q6.I;

/* JADX INFO: loaded from: classes.dex */
public final class s implements E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1538g f14216r = new C1538g();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f14218t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(v vVar, boolean z5) {
        this.f14218t = vVar;
        this.f14215q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) {
        kotlin.jvm.internal.m.e(source, "source");
        byte[] bArr = e6.b.f12673a;
        C1538g c1538g = this.f14216r;
        c1538g.Z(j, source);
        while (c1538g.f16063r >= 16384) {
            a(false);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[IGET, INVOKE, IGET, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[IGET, INVOKE, IGET, INVOKE, INVOKE, IGET, IGET, ARITH, IGET, IGET, INVOKE, IGET, ARITH, IPUT] complete}, expected: {[IGET, INVOKE, IGET, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    public final void a(boolean z5) {
        long jMin;
        boolean z6;
        v vVar = this.f14218t;
        synchronized (vVar) {
            vVar.f14234l.h();
            while (vVar.f14230e >= vVar.f && !this.f14215q && !this.f14217s) {
                try {
                    synchronized (vVar) {
                        int i = vVar.f14235m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            vVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    vVar.f14234l.k();
                    throw th;
                }
            }
            vVar.f14234l.k();
            vVar.b();
            jMin = Math.min(vVar.f - vVar.f14230e, this.f14216r.f16063r);
            vVar.f14230e += jMin;
            z6 = z5 && jMin == this.f14216r.f16063r;
        }
        this.f14218t.f14234l.h();
        try {
            v vVar2 = this.f14218t;
            vVar2.f14227b.n(vVar2.f14226a, z6, this.f14216r, jMin);
        } finally {
            this.f14218t.f14234l.k();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        v vVar = this.f14218t;
        byte[] bArr = e6.b.f12673a;
        synchronized (vVar) {
            if (this.f14217s) {
                return;
            }
            synchronized (vVar) {
                z5 = vVar.f14235m == 0;
            }
            v vVar2 = this.f14218t;
            if (!vVar2.j.f14215q) {
                if (this.f14216r.f16063r > 0) {
                    while (this.f14216r.f16063r > 0) {
                        a(true);
                    }
                } else if (z5) {
                    vVar2.f14227b.n(vVar2.f14226a, true, null, 0L);
                }
            }
            synchronized (this.f14218t) {
                this.f14217s = true;
            }
            this.f14218t.f14227b.flush();
            this.f14218t.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        return this.f14218t.f14234l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Flushable
    public final void flush() {
        v vVar = this.f14218t;
        byte[] bArr = e6.b.f12673a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f14216r.f16063r > 0) {
            a(false);
            this.f14218t.f14227b.flush();
        }
    }
}
