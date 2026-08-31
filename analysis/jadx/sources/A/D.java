package A;

import a.AbstractC0597a;
import android.os.Build;
import android.view.View;
import java.util.List;
import w1.InterfaceC1850m;
import w1.l0;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends w1.Q implements Runnable, InterfaceC1850m, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Z f3s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o0 f6v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(Z z5) {
        super(!z5.f76s ? 1 : 0);
        this.f3s = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final void a(w1.Z z5) {
        this.f4t = false;
        this.f5u = false;
        o0 o0Var = this.f6v;
        if (z5.f18179a.a() != 0 && o0Var != null) {
            l0 l0Var = o0Var.f18232a;
            Z z6 = this.f3s;
            z6.f75r.f(AbstractC0597a.U(l0Var.g(8)));
            z6.f74q.f(AbstractC0597a.U(l0Var.g(8)));
            Z.a(z6, o0Var);
        }
        this.f6v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final void b() {
        this.f4t = true;
        this.f5u = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public final o0 c(View view, o0 o0Var) {
        this.f6v = o0Var;
        Z z5 = this.f3s;
        V v6 = z5.f74q;
        l0 l0Var = o0Var.f18232a;
        v6.f(AbstractC0597a.U(l0Var.g(8)));
        if (this.f4t) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f5u) {
            z5.f75r.f(AbstractC0597a.U(l0Var.g(8)));
            Z.a(z5, o0Var);
        }
        return z5.f76s ? o0.f18231b : o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final o0 d(o0 o0Var, List list) {
        Z z5 = this.f3s;
        Z.a(z5, o0Var);
        return z5.f76s ? o0.f18231b : o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final v3.l e(v3.l lVar) {
        this.f4t = false;
        return lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4t) {
            this.f4t = false;
            this.f5u = false;
            o0 o0Var = this.f6v;
            if (o0Var != null) {
                Z z5 = this.f3s;
                z5.f75r.f(AbstractC0597a.U(o0Var.f18232a.g(8)));
                Z.a(z5, o0Var);
                this.f6v = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
