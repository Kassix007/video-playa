package C;

import E.F;
import P.C0348c0;
import androidx.work.impl.Scheduler;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0348c0 f685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0348c0 f686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f688e;
    public final F f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(int i, int i7, int i8) {
        this.f684a = i8;
        switch (i8) {
            case 1:
                this.f685b = new C0348c0(i);
                this.f686c = new C0348c0(i7);
                this.f = new F(i, 90, Scheduler.MAX_GREEDY_SCHEDULER_LIMIT);
                break;
            default:
                this.f685b = new C0348c0(i);
                this.f686c = new C0348c0(i7);
                this.f = new F(i, 30, 100);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, int i7) {
        switch (this.f684a) {
            case 0:
                if (i < 0.0f) {
                    AbstractC1923a.a("Index should be non-negative (" + i + ')');
                }
                this.f685b.f(i);
                this.f.b(i);
                this.f686c.f(i7);
                break;
            default:
                if (i < 0.0f) {
                    AbstractC1923a.a("Index should be non-negative");
                }
                this.f685b.f(i);
                this.f.b(i);
                this.f686c.f(i7);
                break;
        }
    }
}
