package Z0;

import B0.L;
import B0.T;
import android.view.ViewGroup;
import java.util.List;
import n5.t;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1926C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f8327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f8328b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(r rVar, L l7) {
        this.f8327a = rVar;
        this.f8328b = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(T t6, List list, long j) {
        r rVar = this.f8327a;
        int childCount = rVar.getChildCount();
        t tVar = t.f15300q;
        if (childCount == 0) {
            return t6.f(W0.a.j(j), W0.a.i(j), tVar, b.f8318s);
        }
        if (W0.a.j(j) != 0) {
            rVar.getChildAt(0).setMinimumWidth(W0.a.j(j));
        }
        if (W0.a.i(j) != 0) {
            rVar.getChildAt(0).setMinimumHeight(W0.a.i(j));
        }
        int iJ = W0.a.j(j);
        int iH = W0.a.h(j);
        ViewGroup.LayoutParams layoutParams = rVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams);
        int iL = j.l(rVar, iJ, iH, layoutParams.width);
        int i = W0.a.i(j);
        int iG = W0.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = rVar.getLayoutParams();
        kotlin.jvm.internal.m.b(layoutParams2);
        rVar.measure(iL, j.l(rVar, i, iG, layoutParams2.height));
        return t6.f(rVar.getMeasuredWidth(), rVar.getMeasuredHeight(), tVar, new c(rVar, this.f8328b, 1));
    }
}
