package androidx.lifecycle;

import C0.C0111x0;

/* JADX INFO: loaded from: classes.dex */
public final class V implements InterfaceC0658v, AutoCloseable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f9509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U f9510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9511s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V(String str, U u6) {
        this.f9509q = str;
        this.f9510r = u6;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        if (enumC0652o == EnumC0652o.ON_DESTROY) {
            this.f9511s = false;
            interfaceC0660x.getLifecycle().c(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(Z.m registry, AbstractC0654q lifecycle) {
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(lifecycle, "lifecycle");
        if (this.f9511s) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9511s = true;
        lifecycle.a(this);
        registry.C(this.f9509q, (C0111x0) this.f9510r.f9508b.f3124a);
    }
}
