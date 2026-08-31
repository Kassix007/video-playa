package E;

import P.w0;
import android.view.Choreographer;
import android.view.View;

/* JADX INFO: renamed from: E.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0119b implements d0, w0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static long f1533w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f1534q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1536s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1539v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R.e f1535r = new R.e(new b0[16]);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Choreographer f1537t = Choreographer.getInstance();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC0119b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f1534q = r5
            R.e r0 = new R.e
            r1 = 16
            E.b0[] r1 = new E.b0[r1]
            r0.<init>(r1)
            r4.f1535r = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f1537t = r0
            long r0 = E.RunnableC0119b.f1533w
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            E.RunnableC0119b.f1533w = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E.RunnableC0119b.<init>(android.view.View):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.d0
    public final void a(b0 b0Var) {
        this.f1535r.c(b0Var);
        if (this.f1536s) {
            return;
        }
        this.f1536s = true;
        this.f1534q.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void b() {
        this.f1538u = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f1538u) {
            this.f1539v = j;
            this.f1534q.post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        this.f1538u = false;
        this.f1534q.removeCallbacks(this);
        this.f1537t.removeFrameCallback(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        R.e eVar = this.f1535r;
        if (eVar.f6678s == 0 || !this.f1536s || !this.f1538u || this.f1534q.getWindowVisibility() != 0) {
            this.f1536s = false;
            return;
        }
        C0118a c0118a = new C0118a(this.f1539v + f1533w);
        boolean z5 = false;
        while (eVar.f6678s != 0 && !z5) {
            if (Math.max(0L, c0118a.f1527a - System.nanoTime()) <= 0 || ((b0) eVar.f6676q[0]).b(c0118a)) {
                z5 = true;
            } else {
                eVar.m(0);
            }
        }
        if (z5) {
            this.f1537t.postFrameCallback(this);
        } else {
            this.f1536s = false;
        }
    }

    @Override // P.w0
    public final void c() {
    }
}
