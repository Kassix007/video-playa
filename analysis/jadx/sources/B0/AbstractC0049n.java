package B0;

import c0.AbstractC0724l;
import r.C1543B;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: B0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049n extends AbstractC0724l {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f472E = o0.e(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractC0724l f473F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void n0() {
        super.n0();
        for (AbstractC0724l abstractC0724l = this.f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.w0(this.f10107x);
            if (!abstractC0724l.f10099D) {
                abstractC0724l.n0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void o0() {
        for (AbstractC0724l abstractC0724l = this.f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.o0();
        }
        super.o0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void s0() {
        super.s0();
        for (AbstractC0724l abstractC0724l = this.f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.s0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void t0() {
        for (AbstractC0724l abstractC0724l = this.f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.t0();
        }
        super.t0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void u0() {
        super.u0();
        for (AbstractC0724l abstractC0724l = this.f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.u0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void v0(AbstractC0724l abstractC0724l) {
        this.f10100q = abstractC0724l;
        for (AbstractC0724l abstractC0724l2 = this.f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
            abstractC0724l2.v0(abstractC0724l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void w0(n0 n0Var) {
        this.f10107x = n0Var;
        for (AbstractC0724l abstractC0724l = this.f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.w0(n0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0048m x0(InterfaceC0048m interfaceC0048m) {
        AbstractC0724l abstractC0724l = ((AbstractC0724l) interfaceC0048m).f10100q;
        if (abstractC0724l != interfaceC0048m) {
            AbstractC0724l abstractC0724l2 = interfaceC0048m instanceof AbstractC0724l ? (AbstractC0724l) interfaceC0048m : null;
            AbstractC0724l abstractC0724l3 = abstractC0724l2 != null ? abstractC0724l2.f10104u : null;
            if (abstractC0724l != this.f10100q || !kotlin.jvm.internal.m.a(abstractC0724l3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC0724l.f10099D) {
                AbstractC1904a.b("Cannot delegate to an already attached node");
            }
            abstractC0724l.v0(this.f10100q);
            int i = this.f10102s;
            int iF = o0.f(abstractC0724l);
            abstractC0724l.f10102s = iF;
            int i7 = this.f10102s;
            int i8 = iF & 2;
            if (i8 != 0 && (i7 & 2) != 0 && !(this instanceof InterfaceC0060z)) {
                AbstractC1904a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC0724l);
            }
            abstractC0724l.f10105v = this.f473F;
            this.f473F = abstractC0724l;
            abstractC0724l.f10104u = this;
            z0(iF | this.f10102s, false);
            if (this.f10099D) {
                if (i8 == 0 || (i & 2) != 0) {
                    w0(this.f10107x);
                } else {
                    C0042g0 c0042g0 = AbstractC0041g.u(this).f268U;
                    this.f10100q.w0(null);
                    c0042g0.h();
                }
                abstractC0724l.n0();
                abstractC0724l.t0();
                if (!abstractC0724l.f10099D) {
                    AbstractC1904a.b("autoInvalidateInsertedNode called on unattached node");
                }
                o0.a(abstractC0724l, -1, 1);
            }
        }
        return interfaceC0048m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y0(InterfaceC0048m interfaceC0048m) {
        AbstractC0724l abstractC0724l = null;
        for (AbstractC0724l abstractC0724l2 = this.f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
            if (abstractC0724l2 == interfaceC0048m) {
                boolean z5 = abstractC0724l2.f10099D;
                if (z5) {
                    C1543B c1543b = o0.f501a;
                    if (!z5) {
                        AbstractC1904a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    o0.a(abstractC0724l2, -1, 2);
                    abstractC0724l2.u0();
                    abstractC0724l2.o0();
                }
                abstractC0724l2.v0(abstractC0724l2);
                abstractC0724l2.f10103t = 0;
                if (abstractC0724l == null) {
                    this.f473F = abstractC0724l2.f10105v;
                } else {
                    abstractC0724l.f10105v = abstractC0724l2.f10105v;
                }
                abstractC0724l2.f10105v = null;
                abstractC0724l2.f10104u = null;
                int i = this.f10102s;
                int iF = o0.f(this);
                z0(iF, true);
                if (this.f10099D && (i & 2) != 0 && (iF & 2) == 0) {
                    C0042g0 c0042g0 = AbstractC0041g.u(this).f268U;
                    this.f10100q.w0(null);
                    c0042g0.h();
                    return;
                }
                return;
            }
            abstractC0724l = abstractC0724l2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0048m).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z0(int i, boolean z5) {
        AbstractC0724l abstractC0724l;
        int i7 = this.f10102s;
        this.f10102s = i;
        if (i7 != i) {
            AbstractC0724l abstractC0724l2 = this.f10100q;
            if (abstractC0724l2 == this) {
                this.f10103t = i;
            }
            if (this.f10099D) {
                AbstractC0724l abstractC0724l3 = this;
                while (abstractC0724l3 != null) {
                    i |= abstractC0724l3.f10102s;
                    abstractC0724l3.f10102s = i;
                    if (abstractC0724l3 == abstractC0724l2) {
                        break;
                    } else {
                        abstractC0724l3 = abstractC0724l3.f10104u;
                    }
                }
                if (z5 && abstractC0724l3 == abstractC0724l2) {
                    i = o0.f(abstractC0724l2);
                    abstractC0724l2.f10102s = i;
                }
                int i8 = i | ((abstractC0724l3 == null || (abstractC0724l = abstractC0724l3.f10105v) == null) ? 0 : abstractC0724l.f10103t);
                while (abstractC0724l3 != null) {
                    i8 |= abstractC0724l3.f10102s;
                    abstractC0724l3.f10103t = i8;
                    abstractC0724l3 = abstractC0724l3.f10104u;
                }
            }
        }
    }
}
