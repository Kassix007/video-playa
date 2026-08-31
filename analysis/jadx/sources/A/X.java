package A;

import C0.ComponentCallbacks2C0066a0;
import C0.ComponentCallbacks2C0068b0;
import P.S0;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.InterfaceC0660x;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import u.C1626E;
import u.C1629H;
import u.o0;
import u.p0;
import u.v0;
import w1.AbstractC1826B;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class X implements P.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ X(int i, Object obj, Object obj2) {
        this.f54a = i;
        this.f55b = obj;
        this.f56c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.E
    public final void a() {
        int i = this.f54a;
        Object obj = this.f56c;
        Object obj2 = this.f55b;
        switch (i) {
            case 0:
                Z z5 = (Z) obj2;
                View view = (View) obj;
                int i7 = z5.f77t - 1;
                z5.f77t = i7;
                if (i7 == 0) {
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    AbstractC1826B.l(view, null);
                    AbstractC1835K.o(view, null);
                    view.removeOnAttachStateChangeListener(z5.f78u);
                }
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0066a0) obj);
                break;
            case 2:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0068b0) obj);
                break;
            case 3:
                ((E.W) obj2).f1515c.j(obj);
                break;
            case 4:
                ((T1.d) obj2).f7360x.j.c((U1.l) obj);
                break;
            case 5:
                Iterator it = ((List) ((S0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((U1.i) obj).b().c((T1.d) it.next());
                }
                break;
            case 6:
                ((androidx.lifecycle.G) obj2).j((Y.a) obj);
                break;
            case 7:
                ((InterfaceC0660x) obj2).getLifecycle().c((W1.f) obj);
                break;
            case 8:
                ((C1629H) obj2).f16784a.l((C1626E) obj);
                break;
            case 9:
                ((v0) obj2).j.remove((v0) obj);
                break;
            default:
                v0 v0Var = (v0) obj2;
                v0Var.getClass();
                o0 o0Var = (o0) ((p0) obj).f17016b.getValue();
                if (o0Var != null) {
                    v0Var.i.remove(o0Var.f17007q);
                }
                break;
        }
    }
}
