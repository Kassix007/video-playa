package T5;

import M5.AbstractC0257s;
import R5.o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f7470r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = k.f7478c;
        int i7 = k.f7479d;
        long j = k.f7480e;
        String str = k.f7476a;
        e eVar = new e();
        eVar.f7472q = new c(i, i7, j, str);
        f7470r = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final AbstractC0257s limitedParallelism(int i, String str) {
        R5.b.a(i);
        return i >= k.f7478c ? str != null ? new o(this, str) : this : super.limitedParallelism(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
