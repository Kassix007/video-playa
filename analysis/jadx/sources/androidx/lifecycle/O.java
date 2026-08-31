package androidx.lifecycle;

import C0.RunnableC0089m;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class O implements InterfaceC0660x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final O f9496y = new O();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9498r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f9501u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9499s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9500t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0662z f9502v = new C0662z(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RunnableC0089m f9503w = new RunnableC0089m(10, this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j0 f9504x = new j0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        int i = this.f9498r + 1;
        this.f9498r = i;
        if (i == 1) {
            if (this.f9499s) {
                this.f9502v.f(EnumC0652o.ON_RESUME);
                this.f9499s = false;
            } else {
                Handler handler = this.f9501u;
                kotlin.jvm.internal.m.b(handler);
                handler.removeCallbacks(this.f9503w);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        return this.f9502v;
    }
}
