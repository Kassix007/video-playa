package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K f9480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9482s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f9483t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(G g7, K k7) {
        this.f9483t = g7;
        this.f9480q = k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        if (z5 == this.f9481r) {
            return;
        }
        this.f9481r = z5;
        int i = z5 ? 1 : -1;
        G g7 = this.f9483t;
        int i7 = g7.f9487c;
        g7.f9487c = i + i7;
        if (!g7.f9488d) {
            g7.f9488d = true;
            while (true) {
                try {
                    int i8 = g7.f9487c;
                    if (i7 == i8) {
                        break;
                    }
                    boolean z6 = i7 == 0 && i8 > 0;
                    boolean z7 = i7 > 0 && i8 == 0;
                    if (z6) {
                        g7.g();
                    } else if (z7) {
                        g7.h();
                    }
                    i7 = i8;
                } catch (Throwable th) {
                    g7.f9488d = false;
                    throw th;
                }
            }
            g7.f9488d = false;
        }
        if (this.f9481r) {
            g7.c(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean h(InterfaceC0660x interfaceC0660x) {
        return false;
    }

    public abstract boolean i();
}
