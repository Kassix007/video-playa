package N5;

import C0.S;
import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.C;
import M5.C0247h;
import M5.H;
import M5.J;
import M5.m0;
import M5.v0;
import R5.n;
import R5.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0257s implements C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f4041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f4043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f4044t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(Handler handler, String str, boolean z5) {
        this.f4041q = handler;
        this.f4042r = str;
        this.f4043s = z5;
        this.f4044t = z5 ? this : new f(handler, str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        AbstractC0263y.f(interfaceC1529h, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        T5.e eVar = H.f3811a;
        T5.d.f7468q.dispatch(interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        if (this.f4041q.post(runnable)) {
            return;
        }
        a0(interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f4041q == this.f4041q && fVar.f4043s == this.f4043s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this.f4041q) ^ (this.f4043s ? 1231 : 1237);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final boolean isDispatchNeeded(InterfaceC1529h interfaceC1529h) {
        return (this.f4043s && m.a(Looper.myLooper(), this.f4041q.getLooper())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public AbstractC0257s limitedParallelism(int i, String str) {
        R5.b.a(i);
        return str != null ? new o(this, str) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final J n(long j, final v0 v0Var, InterfaceC1529h interfaceC1529h) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f4041q.postDelayed(v0Var, j)) {
            return new J() { // from class: N5.e
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // M5.J
                public final void a() {
                    this.f4039q.f4041q.removeCallbacks(v0Var);
                }
            };
        }
        a0(interfaceC1529h, v0Var);
        return m0.f3871q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        f fVar;
        String str;
        T5.e eVar = H.f3811a;
        f fVar2 = n.f7261a;
        if (this == fVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                fVar = fVar2.f4044t;
            } catch (UnsupportedOperationException unused) {
                fVar = null;
            }
            str = this == fVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f4042r;
        if (string == null) {
            string = this.f4041q.toString();
        }
        return this.f4043s ? S.l(string, ".immediate") : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final void z(long j, C0247h c0247h) {
        c cVar = new c(0, c0247h, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f4041q.postDelayed(cVar, j)) {
            c0247h.u(new d(0, this, cVar));
        } else {
            a0(c0247h.f3858u, cVar);
        }
    }

    public f(Handler handler) {
        this(handler, null, false);
    }
}
