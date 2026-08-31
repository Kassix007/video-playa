package h6;

import E.c0;
import d6.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import l6.m;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f13479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile AtomicInteger f13480r = new AtomicInteger(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f13481s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(h hVar, H2.g gVar) {
        this.f13481s = hVar;
        this.f13479q = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        u uVarG;
        String strConcat = "OkHttp ".concat(this.f13481s.f13490r.f12413a.f());
        h hVar = this.f13481s;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            hVar.f13492t.h();
            boolean z5 = false;
            try {
                try {
                    uVarG = hVar.g();
                } catch (Throwable th) {
                    hVar.f13489q.f12395q.j(this);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                H2.g gVar = (H2.g) this.f13479q;
                switch (gVar.f2140q) {
                    case 0:
                        gVar.f2142s.resumeWith(uVarG);
                        break;
                    default:
                        gVar.f2142s.resumeWith(uVarG);
                        break;
                }
                c0Var = hVar.f13489q.f12395q;
            } catch (IOException e8) {
                e = e8;
                z5 = true;
                if (z5) {
                    m mVar = m.f14610a;
                    m mVar2 = m.f14610a;
                    String str = "Callback failure for " + h.a(hVar);
                    mVar2.getClass();
                    m.i(str, 4, e);
                } else {
                    ((H2.g) this.f13479q).a(hVar, e);
                }
                c0Var = hVar.f13489q.f12395q;
            } catch (Throwable th3) {
                th = th3;
                z5 = true;
                hVar.d();
                if (!z5) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC1362a.a(iOException, th);
                    ((H2.g) this.f13479q).a(hVar, iOException);
                }
                throw th;
            }
            c0Var.j(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
