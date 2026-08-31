package K2;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.m;
import q6.C1538g;
import q6.E;
import q6.I;
import q6.p;

/* JADX INFO: loaded from: classes.dex */
public final class g implements E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2892q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2895t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(E e7, J5.i iVar) {
        this.f2894s = e7;
        this.f2895t = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) throws EOFException {
        int i = this.f2892q;
        Object obj = this.f2895t;
        switch (i) {
            case 0:
                if (this.f2893r) {
                    source.skip(j);
                    return;
                }
                try {
                    ((E) this.f2894s).Z(j, source);
                    return;
                } catch (IOException e7) {
                    this.f2893r = true;
                    ((J5.i) obj).invoke(e7);
                    return;
                }
            default:
                m.e(source, "source");
                if (this.f2893r) {
                    throw new IllegalStateException("closed");
                }
                long j7 = source.f16063r;
                byte[] bArr = e6.b.f12673a;
                if (j < 0 || 0 > j7 || j7 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((j6.f) obj).f13909d.Z(j, source);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2892q) {
            case 0:
                try {
                    ((E) this.f2894s).close();
                } catch (IOException e7) {
                    this.f2893r = true;
                    ((J5.i) this.f2895t).invoke(e7);
                    return;
                }
                break;
            default:
                j6.f fVar = (j6.f) this.f2895t;
                if (!this.f2893r) {
                    this.f2893r = true;
                    p pVar = (p) this.f2894s;
                    I i = pVar.f16076e;
                    pVar.f16076e = I.f16040d;
                    i.a();
                    i.b();
                    fVar.f13910e = 3;
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final I d() {
        switch (this.f2892q) {
            case 0:
                return ((E) this.f2894s).d();
            default:
                return (p) this.f2894s;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E, java.io.Flushable
    public final void flush() {
        switch (this.f2892q) {
            case 0:
                try {
                    ((E) this.f2894s).flush();
                } catch (IOException e7) {
                    this.f2893r = true;
                    ((J5.i) this.f2895t).invoke(e7);
                    return;
                }
                break;
            default:
                if (!this.f2893r) {
                    ((j6.f) this.f2895t).f13909d.flush();
                    break;
                }
                break;
        }
    }

    public g(j6.f fVar) {
        this.f2895t = fVar;
        this.f2894s = new p(fVar.f13909d.d());
    }
}
