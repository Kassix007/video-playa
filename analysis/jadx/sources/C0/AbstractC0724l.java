package c0;

import B0.AbstractC0041g;
import B0.InterfaceC0048m;
import B0.K;
import B0.n0;
import B0.q0;
import C0.A;
import M5.AbstractC0263y;
import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import M5.d0;
import v.I;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: c0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0724l implements InterfaceC0048m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10096A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10097B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public K f10098C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10099D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public R5.d f10101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10102s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC0724l f10104u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC0724l f10105v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0 f10106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n0 f10107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10108y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10109z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0724l f10100q = this;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10103t = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0261w l0() {
        R5.d dVar = this.f10101r;
        if (dVar != null) {
            return dVar;
        }
        R5.d dVarA = AbstractC0263y.a(((A) AbstractC0041g.v(this)).getCoroutineContext().plus(new d0((InterfaceC0241b0) ((A) AbstractC0041g.v(this)).getCoroutineContext().get(C0258t.f3885r))));
        this.f10101r = dVarA;
        return dVarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean m0() {
        return !(this instanceof I);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n0() {
        if (this.f10099D) {
            AbstractC1904a.b("node attached multiple times");
        }
        if (this.f10107x == null) {
            AbstractC1904a.b("attach invoked on a node without a coordinator");
        }
        this.f10099D = true;
        this.f10096A = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o0() {
        if (!this.f10099D) {
            AbstractC1904a.b("Cannot detach a node that is not attached");
        }
        if (this.f10096A) {
            AbstractC1904a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f10097B) {
            AbstractC1904a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f10099D = false;
        R5.d dVar = this.f10101r;
        if (dVar != null) {
            AbstractC0263y.e(dVar, new C0726n("The Modifier.Node was detached", 0));
            this.f10101r = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s0() {
        if (!this.f10099D) {
            AbstractC1904a.b("reset() called on an unattached node");
        }
        r0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t0() {
        if (!this.f10099D) {
            AbstractC1904a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f10096A) {
            AbstractC1904a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f10096A = false;
        p0();
        this.f10097B = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u0() {
        if (!this.f10099D) {
            AbstractC1904a.b("node detached multiple times");
        }
        if (this.f10107x == null) {
            AbstractC1904a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f10097B) {
            AbstractC1904a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f10097B = false;
        K k7 = this.f10098C;
        if (k7 != null) {
            k7.invoke();
        }
        q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v0(AbstractC0724l abstractC0724l) {
        this.f10100q = abstractC0724l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w0(n0 n0Var) {
        this.f10107x = n0Var;
    }

    public void p0() {
    }

    public void q0() {
    }

    public void r0() {
    }
}
