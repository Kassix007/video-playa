package H2;

import M5.C0247h;
import java.io.IOException;
import m5.AbstractC1362a;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h6.h f2141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0247h f2142s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g(h6.h hVar, C0247h c0247h, int i) {
        this.f2140q = i;
        this.f2141r = hVar;
        this.f2142s = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(h6.h hVar, IOException iOException) {
        switch (this.f2140q) {
            case 0:
                if (!hVar.f13486C) {
                    this.f2142s.resumeWith(AbstractC1362a.b(iOException));
                }
                break;
            default:
                if (!hVar.f13486C) {
                    this.f2142s.resumeWith(AbstractC1362a.b(iOException));
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f2140q) {
            case 0:
                try {
                    this.f2141r.d();
                    break;
                } catch (Throwable unused) {
                }
                break;
            default:
                try {
                    this.f2141r.d();
                    break;
                } catch (Throwable unused2) {
                }
                break;
        }
        return C1386y.f15098a;
    }
}
