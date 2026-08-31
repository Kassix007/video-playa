package b;

import C0.RunnableC0089m;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import h.AbstractActivityC1106h;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f9865q = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Runnable f9866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f9868t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(AbstractActivityC1106h abstractActivityC1106h) {
        this.f9868t = abstractActivityC1106h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "runnable");
        this.f9866r = runnable;
        View decorView = this.f9868t.getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        if (!this.f9867s) {
            decorView.postOnAnimation(new RunnableC0089m(12, this));
        } else if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f9866r;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f9865q) {
                this.f9867s = false;
                this.f9868t.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f9866r = null;
        t tVar = (t) this.f9868t.f9897w.getValue();
        synchronized (tVar.f9906b) {
            z5 = tVar.f9907c;
        }
        if (z5) {
            this.f9867s = false;
            this.f9868t.getWindow().getDecorView().post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f9868t.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
