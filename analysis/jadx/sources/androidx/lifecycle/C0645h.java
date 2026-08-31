package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0645h implements InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9548q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f9550s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0645h(InterfaceC0643f defaultLifecycleObserver, InterfaceC0658v interfaceC0658v) {
        kotlin.jvm.internal.m.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9549r = defaultLifecycleObserver;
        this.f9550s = interfaceC0658v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        switch (this.f9548q) {
            case 0:
                InterfaceC0643f interfaceC0643f = (InterfaceC0643f) this.f9549r;
                switch (AbstractC0644g.f9544a[enumC0652o.ordinal()]) {
                    case 1:
                        interfaceC0643f.getClass();
                        break;
                    case 2:
                        interfaceC0643f.n(interfaceC0660x);
                        break;
                    case 3:
                        interfaceC0643f.b(interfaceC0660x);
                        break;
                    case 4:
                        interfaceC0643f.getClass();
                        break;
                    case 5:
                        interfaceC0643f.v(interfaceC0660x);
                        break;
                    case 6:
                        interfaceC0643f.c(interfaceC0660x);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new C2.e();
                }
                InterfaceC0658v interfaceC0658v = (InterfaceC0658v) this.f9550s;
                if (interfaceC0658v != null) {
                    interfaceC0658v.e(interfaceC0660x, enumC0652o);
                    return;
                }
                return;
            case 1:
                if (enumC0652o == EnumC0652o.ON_START) {
                    ((AbstractC0654q) this.f9549r).c(this);
                    ((Z.m) this.f9550s).F();
                    return;
                }
                return;
            default:
                HashMap map = ((C0639b) this.f9550s).f9525a;
                List list = (List) map.get(enumC0652o);
                Object obj = this.f9549r;
                C0639b.a(list, interfaceC0660x, enumC0652o, obj);
                C0639b.a((List) map.get(EnumC0652o.ON_ANY), interfaceC0660x, enumC0652o, obj);
                return;
        }
    }

    public C0645h(InterfaceC0659w interfaceC0659w) {
        this.f9549r = interfaceC0659w;
        C0641d c0641d = C0641d.f9534c;
        Class<?> cls = interfaceC0659w.getClass();
        C0639b c0639b = (C0639b) c0641d.f9535a.get(cls);
        this.f9550s = c0639b == null ? c0641d.a(cls, null) : c0639b;
    }

    public C0645h(Z.m mVar, AbstractC0654q abstractC0654q) {
        this.f9549r = abstractC0654q;
        this.f9550s = mVar;
    }
}
