package E;

import P.C0345b;
import P.C0354f0;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f1480b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f1483e;
    public boolean f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1481c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0354f0 f1484g = C0345b.q(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(Object obj, H h4) {
        this.f1479a = obj;
        this.f1480b = h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G a() {
        if (this.f) {
            AbstractC1923a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f1482d == 0) {
            this.f1480b.f1485q.add(this);
            G g7 = (G) this.f1484g.getValue();
            if (g7 != null) {
                g7.a();
            } else {
                g7 = null;
            }
            this.f1483e = g7;
        }
        this.f1482d++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f) {
            return;
        }
        if (this.f1482d <= 0) {
            AbstractC1923a.c("Release should only be called once");
        }
        int i = this.f1482d - 1;
        this.f1482d = i;
        if (i == 0) {
            this.f1480b.f1485q.remove(this);
            G g7 = this.f1483e;
            if (g7 != null) {
                g7.b();
            }
            this.f1483e = null;
        }
    }
}
