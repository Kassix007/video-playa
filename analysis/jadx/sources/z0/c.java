package Z0;

import B0.L;
import B0.t0;
import C0.A;
import C0.C0093o;
import android.view.WindowInsets;
import java.util.HashMap;
import m5.C1386y;
import w1.AbstractC1835K;
import w1.o0;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f8323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L f8324s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(r rVar, L l7, int i) {
        super(1);
        this.f8322q = i;
        this.f8323r = rVar;
        this.f8324s = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsF;
        switch (this.f8322q) {
            case 0:
                t0 t0Var = (t0) obj;
                A a7 = t0Var instanceof A ? (A) t0Var : null;
                r rVar = this.f8323r;
                if (a7 != null) {
                    HashMap<j, L> holderToLayoutNode = a7.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    L l7 = this.f8324s;
                    holderToLayoutNode.put(rVar, l7);
                    a7.getAndroidViewsHandler$ui_release().addView(rVar);
                    a7.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(l7, rVar);
                    rVar.setImportantForAccessibility(1);
                    AbstractC1835K.m(rVar, new C0093o(a7, l7, a7));
                }
                if (rVar.getView().getParent() != rVar) {
                    rVar.addView(rVar.getView());
                }
                break;
            case 1:
                l.d(this.f8323r, this.f8324s);
                break;
            default:
                L l8 = this.f8324s;
                r rVar2 = this.f8323r;
                l.d(rVar2, l8);
                ((A) rVar2.f8359s).f728N = true;
                int[] iArr = rVar2.f8345D;
                int i = iArr[0];
                int i7 = iArr[1];
                rVar2.getView().getLocationOnScreen(iArr);
                long j = rVar2.f8346E;
                long jE = ((InterfaceC1953m) obj).E();
                rVar2.f8346E = jE;
                o0 o0Var = rVar2.f8347F;
                if (o0Var != null && ((i != iArr[0] || i7 != iArr[1] || !W0.k.a(j, jE)) && (windowInsetsF = rVar2.n(o0Var).f()) != null)) {
                    rVar2.getView().dispatchApplyWindowInsets(windowInsetsF);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
