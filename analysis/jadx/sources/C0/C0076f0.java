package C0;

import M5.AbstractC0257s;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import m5.AbstractC1362a;
import m5.C1376o;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: C0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0076f0 extends AbstractC0257s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C1376o f1026A = AbstractC1362a.d(X.f969x);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0072d0 f1027B = new C0072d0(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Choreographer f1028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f1029r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1035x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0080h0 f1037z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1030s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n5.j f1031t = new n5.j();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f1032u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f1033v = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ChoreographerFrameCallbackC0074e0 f1036y = new ChoreographerFrameCallbackC0074e0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0076f0(Choreographer choreographer, Handler handler) {
        this.f1028q = choreographer;
        this.f1029r = handler;
        this.f1037z = new C0080h0(choreographer, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a0(C0076f0 c0076f0) {
        Runnable runnable;
        boolean z5;
        do {
            synchronized (c0076f0.f1030s) {
                n5.j jVar = c0076f0.f1031t;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0076f0.f1030s) {
                    n5.j jVar2 = c0076f0.f1031t;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (c0076f0.f1030s) {
                if (c0076f0.f1031t.isEmpty()) {
                    z5 = false;
                    c0076f0.f1034w = false;
                } else {
                    z5 = true;
                }
            }
        } while (z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        synchronized (this.f1030s) {
            this.f1031t.addLast(runnable);
            if (!this.f1034w) {
                this.f1034w = true;
                this.f1029r.post(this.f1036y);
                if (!this.f1035x) {
                    this.f1035x = true;
                    this.f1028q.postFrameCallback(this.f1036y);
                }
            }
        }
    }
}
