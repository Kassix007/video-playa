package Z0;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.t0;
import C0.A;
import android.view.View;
import android.view.ViewTreeObserver;
import c0.AbstractC0724l;
import h0.AbstractC1111d;
import h0.C1115h;
import h0.InterfaceC1114g;
import h0.InterfaceC1116i;
import h0.InterfaceC1119l;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0724l implements InterfaceC1119l, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f8384E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ViewTreeObserver f8385F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final o f8386G = new o(this, 0);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final o f8387H = new o(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h0.InterfaceC1119l
    public final void C(InterfaceC1116i interfaceC1116i) {
        interfaceC1116i.b(false);
        interfaceC1116i.c(this.f8386G);
        interfaceC1116i.d(this.f8387H);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC0041g.u(this).f251D == null) {
            return;
        }
        View viewC = l.c(this);
        InterfaceC1114g focusOwner = ((A) AbstractC0041g.v(this)).getFocusOwner();
        t0 t0VarV = AbstractC0041g.v(this);
        boolean z5 = (view == null || view.equals(t0VarV) || !l.a(viewC, view)) ? false : true;
        boolean z6 = (view2 == null || view2.equals(t0VarV) || !l.a(viewC, view2)) ? false : true;
        if (z5 && z6) {
            this.f8384E = view2;
            return;
        }
        if (!z6) {
            if (!z5) {
                this.f8384E = null;
                return;
            }
            this.f8384E = null;
            if (x0().z0().a()) {
                ((C1115h) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.f8384E = view2;
        h0.o oVarX0 = x0();
        int iOrdinal = oVarX0.z0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new C2.e();
        }
        AbstractC1111d.w(oVarX0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        ViewTreeObserver viewTreeObserver = AbstractC0041g.w(this).getViewTreeObserver();
        this.f8385F = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        ViewTreeObserver viewTreeObserver = this.f8385F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f8385F = null;
        AbstractC0041g.w(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f8384E = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h0.o x0() {
        if (!this.f10100q.f10099D) {
            AbstractC1904a.b("visitLocalDescendants called on an unattached node");
        }
        AbstractC0724l abstractC0724l = this.f10100q;
        if ((abstractC0724l.f10103t & 1024) != 0) {
            boolean z5 = false;
            for (AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                if ((abstractC0724l2.f10102s & 1024) != 0) {
                    AbstractC0724l abstractC0724lF = abstractC0724l2;
                    R.e eVar = null;
                    while (abstractC0724lF != null) {
                        if (abstractC0724lF instanceof h0.o) {
                            h0.o oVar = (h0.o) abstractC0724lF;
                            if (z5) {
                                return oVar;
                            }
                            z5 = true;
                        } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                            int i = 0;
                            for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                if ((abstractC0724l3.f10102s & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC0724lF = abstractC0724l3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new R.e(new AbstractC0724l[16]);
                                        }
                                        if (abstractC0724lF != null) {
                                            eVar.c(abstractC0724lF);
                                            abstractC0724lF = null;
                                        }
                                        eVar.c(abstractC0724l3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC0724lF = AbstractC0041g.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }
}
