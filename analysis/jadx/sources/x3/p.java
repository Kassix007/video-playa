package x3;

import J1.AbstractComponentCallbacksC0185q;
import J1.C0188u;
import android.app.Activity;
import android.content.Intent;
import e.C1014g;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Intent f18505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18507t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p(Intent intent, Object obj, int i, int i7) {
        this.f18504q = i7;
        this.f18505r = intent;
        this.f18507t = obj;
        this.f18506s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.r
    public final void a() {
        switch (this.f18504q) {
            case 0:
                Intent intent = this.f18505r;
                if (intent != null) {
                    ((Activity) this.f18507t).startActivityForResult(intent, this.f18506s);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f18505r;
                if (intent2 != null) {
                    AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = (AbstractComponentCallbacksC0185q) this.f18507t;
                    if (abstractComponentCallbacksC0185q.f2691I == null) {
                        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0185q + " not attached to Activity");
                    }
                    J1.H hK = abstractComponentCallbacksC0185q.k();
                    C1014g c1014g = hK.f2547z;
                    int i = this.f18506s;
                    if (c1014g == null) {
                        C0188u c0188u = hK.f2541t;
                        if (i == -1) {
                            c0188u.f2735u.startActivity(intent2, null);
                            return;
                        } else {
                            c0188u.getClass();
                            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                        }
                    }
                    String str = abstractComponentCallbacksC0185q.f2722u;
                    J1.E e7 = new J1.E();
                    e7.f2508q = str;
                    e7.f2509r = i;
                    hK.f2514C.addLast(e7);
                    hK.f2547z.u(intent2);
                    return;
                }
                return;
        }
    }
}
