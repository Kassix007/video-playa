package a3;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f8878r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u(y yVar, int i) {
        this.f8877q = i;
        this.f8878r = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8877q) {
            case 0:
                Drawable drawable = this.f8878r;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                y yVar = this.f8878r;
                Semaphore semaphore = yVar.f8914c0;
                j3.c cVar = yVar.f8890E;
                if (cVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    cVar.r(yVar.f8921r.a());
                    if (y.f8883i0 && yVar.f8912a0) {
                        if (yVar.f8915d0 == null) {
                            yVar.f8915d0 = new Handler(Looper.getMainLooper());
                            yVar.f8916e0 = new u(yVar, 0);
                        }
                        yVar.f8915d0.post(yVar.f8916e0);
                    }
                    break;
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
