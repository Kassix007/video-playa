package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R1.c f9543a = new R1.c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        R1.c cVar = this.f9543a;
        if (cVar != null && !cVar.f6699d) {
            cVar.f6699d = true;
            synchronized (cVar.f6696a) {
                try {
                    Iterator it = cVar.f6697b.values().iterator();
                    while (it.hasNext()) {
                        R1.c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = cVar.f6698c.iterator();
                    while (it2.hasNext()) {
                        R1.c.a((AutoCloseable) it2.next());
                    }
                    cVar.f6698c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
    }
}
