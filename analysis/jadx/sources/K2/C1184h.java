package k2;

import android.database.sqlite.SQLiteProgram;
import j2.InterfaceC1159e;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1184h implements InterfaceC1159e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SQLiteProgram f14111q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1184h(SQLiteProgram delegate) {
        m.e(delegate, "delegate");
        this.f14111q = delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void H(int i, long j) {
        this.f14111q.bindLong(i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void N(int i, byte[] value) {
        m.e(value, "value");
        this.f14111q.bindBlob(i, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14111q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void m(int i, String value) {
        m.e(value, "value");
        this.f14111q.bindString(i, value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void p(double d5, int i) {
        this.f14111q.bindDouble(i, d5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1159e
    public final void s(int i) {
        this.f14111q.bindNull(i);
    }
}
