package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f9910b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.k f9911c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(boolean z5) {
        this.f9909a = z5;
    }

    public abstract void b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(C0684a backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(C0684a backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        Iterator it = this.f9910b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0685b) it.next()).cancel();
        }
    }

    public void a() {
    }
}
