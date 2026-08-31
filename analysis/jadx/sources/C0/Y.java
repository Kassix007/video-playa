package C0;

import E.C0136t;
import a1.C0615h;
import a1.DialogC0617j;
import c.C0704b;
import c.C0710h;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements P.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f974b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Y(int i, Object obj) {
        this.f973a = i;
        this.f974b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.E
    public final void a() {
        switch (this.f973a) {
            case 0:
                ((C0109w0) this.f974b).f1141a.invoke();
                break;
            case 1:
                ((C0136t) this.f974b).f1587d = null;
                break;
            case 2:
                ((E.K) this.f974b).f1490c = null;
                break;
            case 3:
                ((E.G) this.f974b).f = true;
                break;
            case 4:
                M.M m4 = (M.M) this.f974b;
                m4.dismiss();
                M.K k7 = m4.f3340w;
                w1 w1Var = k7.f982s;
                if (w1Var != null) {
                    w1Var.d();
                }
                k7.f982s = null;
                k7.requestLayout();
                break;
            case 5:
                DialogC0617j dialogC0617j = (DialogC0617j) this.f974b;
                dialogC0617j.dismiss();
                C0615h c0615h = dialogC0617j.f8747w;
                w1 w1Var2 = c0615h.f982s;
                if (w1Var2 != null) {
                    w1Var2.d();
                }
                c0615h.f982s = null;
                c0615h.requestLayout();
                break;
            case 6:
                ((C0704b) this.f974b).e();
                break;
            case 7:
                ((C0710h) this.f974b).e();
                break;
            default:
                u.v0 v0Var = (u.v0) this.f974b;
                v0Var.i();
                v0Var.f17069a.n();
                break;
        }
    }
}
