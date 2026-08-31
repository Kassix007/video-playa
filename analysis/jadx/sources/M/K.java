package M;

import C0.AbstractC0065a;
import M5.InterfaceC0261w;
import P.C0345b;
import P.C0354f0;
import P.C0371o;
import P.C0372o0;
import android.content.Context;
import android.os.Build;
import u.C1642c;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0065a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1642c f3327A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final InterfaceC0261w f3328B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0354f0 f3329C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object f3330D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3331E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3332y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final B5.a f3333z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public K(Context context, boolean z5, B5.a aVar, C1642c c1642c, InterfaceC0261w interfaceC0261w) {
        super(context);
        this.f3332y = z5;
        this.f3333z = aVar;
        this.f3327A = c1642c;
        this.f3328B = interfaceC0261w;
        this.f3329C = C0345b.q(AbstractC0225o.f3583a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final void a(int i, C0371o c0371o) {
        c0371o.U(576708319);
        if ((((c0371o.i(this) ? 4 : 2) | i) & 3) == 2 && c0371o.x()) {
            c0371o.N();
        } else {
            ((B5.e) this.f3329C.getValue()).invoke(c0371o, 0);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new A.e0(i, 5, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3331E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.f3332y || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f3330D == null) {
            B5.a aVar = this.f3333z;
            this.f3330D = i >= 34 ? M0.a.i(J.a(aVar, this.f3327A, this.f3328B)) : E.a(aVar);
        }
        E.b(this, this.f3330D);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            E.c(this, this.f3330D);
        }
        this.f3330D = null;
    }
}
