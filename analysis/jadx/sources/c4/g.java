package c4;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import v3.l;
import w1.Q;
import w1.Z;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f10253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f10256v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(View view) {
        super(0);
        this.f10256v = new int[2];
        this.f10253s = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final void a(Z z5) {
        this.f10253s.setTranslationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final void b() {
        View view = this.f10253s;
        int[] iArr = this.f10256v;
        view.getLocationOnScreen(iArr);
        this.f10254t = iArr[1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final o0 d(o0 o0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((Z) it.next()).f18179a.c() & 8) != 0) {
                this.f10253s.setTranslationY(W3.a.c(r0.f18179a.b(), this.f10255u, 0));
                break;
            }
        }
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final l e(l lVar) {
        View view = this.f10253s;
        int[] iArr = this.f10256v;
        view.getLocationOnScreen(iArr);
        int i = this.f10254t - iArr[1];
        this.f10255u = i;
        view.setTranslationY(i);
        return lVar;
    }
}
