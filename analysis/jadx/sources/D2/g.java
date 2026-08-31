package D2;

import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0659w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0654q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1379b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1380c = new f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0654q
    public final void a(InterfaceC0659w interfaceC0659w) {
        if (!(interfaceC0659w instanceof InterfaceC0643f)) {
            throw new IllegalArgumentException((interfaceC0659w + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0643f interfaceC0643f = (InterfaceC0643f) interfaceC0659w;
        interfaceC0643f.getClass();
        f owner = f1380c;
        kotlin.jvm.internal.m.e(owner, "owner");
        interfaceC0643f.n(owner);
        interfaceC0643f.b(owner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0654q
    public final EnumC0653p b() {
        return EnumC0653p.f9560u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.AbstractC0654q
    public final void c(InterfaceC0659w interfaceC0659w) {
    }
}
