package b;

import C0.C0097q;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC0658v, InterfaceC0685b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0654q f9920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f9921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f9922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0683A f9923t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(C0683A c0683a, AbstractC0654q abstractC0654q, u onBackPressedCallback) {
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        this.f9923t = c0683a;
        this.f9920q = abstractC0654q;
        this.f9921r = onBackPressedCallback;
        abstractC0654q.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.InterfaceC0685b
    public final void cancel() {
        this.f9920q.c(this);
        this.f9921r.f9910b.remove(this);
        z zVar = this.f9922s;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f9922s = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        if (enumC0652o != EnumC0652o.ON_START) {
            if (enumC0652o != EnumC0652o.ON_STOP) {
                if (enumC0652o == EnumC0652o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                z zVar = this.f9922s;
                if (zVar != null) {
                    zVar.cancel();
                    return;
                }
                return;
            }
        }
        C0683A c0683a = this.f9923t;
        c0683a.getClass();
        u onBackPressedCallback = this.f9921r;
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        c0683a.f9847b.addLast(onBackPressedCallback);
        z zVar2 = new z(c0683a, onBackPressedCallback);
        onBackPressedCallback.f9910b.add(zVar2);
        c0683a.e();
        onBackPressedCallback.f9911c = new C0097q(0, c0683a, C0683A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
        this.f9922s = zVar2;
    }
}
