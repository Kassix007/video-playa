package w2;

import J5.k;
import java.io.Closeable;

/* JADX INFO: renamed from: w2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1864b implements Closeable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1863a f18257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1867e f18259s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1864b(C1867e c1867e, C1863a c1863a) {
        this.f18259s = c1867e;
        this.f18257q = c1863a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f18258r) {
            return;
        }
        this.f18258r = true;
        C1867e c1867e = this.f18259s;
        synchronized (c1867e) {
            C1863a c1863a = this.f18257q;
            int i = c1863a.f18256h - 1;
            c1863a.f18256h = i;
            if (i == 0 && c1863a.f) {
                k kVar = C1867e.f18261G;
                c1867e.G(c1863a);
            }
        }
    }
}
