package J1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T f2596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0176h f2597s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ S(C0176h c0176h, T t6, int i) {
        this.f2595q = i;
        this.f2597s = c0176h;
        this.f2596r = t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2595q) {
            case 0:
                ArrayList arrayList = this.f2597s.f2649b;
                T t6 = this.f2596r;
                if (arrayList.contains(t6)) {
                    C0.S.a(t6.f2600c.f2703U, t6.f2598a);
                }
                break;
            default:
                C0176h c0176h = this.f2597s;
                ArrayList arrayList2 = c0176h.f2649b;
                T t7 = this.f2596r;
                arrayList2.remove(t7);
                c0176h.f2650c.remove(t7);
                break;
        }
    }
}
