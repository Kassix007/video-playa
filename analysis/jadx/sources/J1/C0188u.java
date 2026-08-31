package J1;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import b.C0683A;
import h.AbstractActivityC1106h;

/* JADX INFO: renamed from: J1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188u extends C3.a implements l0, b.B, g2.e, L {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractActivityC1106h f2734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractActivityC1106h f2735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f2736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final H f2737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f2738x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0188u(AbstractActivityC1106h abstractActivityC1106h) {
        this.f2738x = abstractActivityC1106h;
        Handler handler = new Handler();
        this.f2737w = new H();
        this.f2734t = abstractActivityC1106h;
        this.f2735u = abstractActivityC1106h;
        this.f2736v = handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final View J(int i) {
        return this.f2738x.findViewById(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final boolean K() {
        Window window = this.f2738x.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.B
    public final C0683A a() {
        return this.f2738x.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.e
    public final Z.m b() {
        return (Z.m) this.f2738x.f9894t.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.l0
    public final k0 f() {
        return this.f2738x.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        return this.f2738x.f13296L;
    }

    @Override // J1.L
    public final void c() {
    }
}
