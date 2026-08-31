package C0;

import M5.C0247h;
import android.view.Choreographer;
import m5.AbstractC1362a;

/* JADX INFO: renamed from: C0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0078g0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0247h f1038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f1039r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC0078g0(C0247h c0247h, C0080h0 c0080h0, B5.c cVar) {
        this.f1038q = c0247h;
        this.f1039r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objB;
        try {
            objB = this.f1039r.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            objB = AbstractC1362a.b(th);
        }
        this.f1038q.resumeWith(objB);
    }
}
