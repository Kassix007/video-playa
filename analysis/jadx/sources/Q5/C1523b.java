package q5;

import C0.S;
import M5.C0256q;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: q5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1523b implements InterfaceC1529h, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1529h f16019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1527f f16020r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1523b(InterfaceC1527f element, InterfaceC1529h left) {
        m.e(left, "left");
        m.e(element, "element");
        this.f16019q = left;
        this.f16020r = element;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1523b) {
            C1523b c1523b = (C1523b) obj;
            c1523b.getClass();
            int i = 2;
            C1523b c1523b2 = c1523b;
            int i7 = 2;
            while (true) {
                InterfaceC1529h interfaceC1529h = c1523b2.f16019q;
                c1523b2 = interfaceC1529h instanceof C1523b ? (C1523b) interfaceC1529h : null;
                if (c1523b2 == null) {
                    break;
                }
                i7++;
            }
            C1523b c1523b3 = this;
            while (true) {
                InterfaceC1529h interfaceC1529h2 = c1523b3.f16019q;
                c1523b3 = interfaceC1529h2 instanceof C1523b ? (C1523b) interfaceC1529h2 : null;
                if (c1523b3 == null) {
                    break;
                }
                i++;
            }
            if (i7 == i) {
                C1523b c1523b4 = this;
                while (true) {
                    InterfaceC1527f interfaceC1527f = c1523b4.f16020r;
                    if (!m.a(c1523b.get(interfaceC1527f.getKey()), interfaceC1527f)) {
                        zA = false;
                        break;
                    }
                    InterfaceC1529h interfaceC1529h3 = c1523b4.f16019q;
                    if (!(interfaceC1529h3 instanceof C1523b)) {
                        m.c(interfaceC1529h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC1527f interfaceC1527f2 = (InterfaceC1527f) interfaceC1529h3;
                        zA = m.a(c1523b.get(interfaceC1527f2.getKey()), interfaceC1527f2);
                        break;
                    }
                    c1523b4 = (C1523b) interfaceC1529h3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        return eVar.invoke(this.f16019q.fold(obj, eVar), this.f16020r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g key) {
        m.e(key, "key");
        C1523b c1523b = this;
        while (true) {
            InterfaceC1527f interfaceC1527f = c1523b.f16020r.get(key);
            if (interfaceC1527f != null) {
                return interfaceC1527f;
            }
            InterfaceC1529h interfaceC1529h = c1523b.f16019q;
            if (!(interfaceC1529h instanceof C1523b)) {
                return interfaceC1529h.get(key);
            }
            c1523b = (C1523b) interfaceC1529h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16020r.hashCode() + this.f16019q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g key) {
        m.e(key, "key");
        InterfaceC1527f interfaceC1527f = this.f16020r;
        InterfaceC1527f interfaceC1527f2 = interfaceC1527f.get(key);
        InterfaceC1529h interfaceC1529h = this.f16019q;
        if (interfaceC1527f2 != null) {
            return interfaceC1529h;
        }
        InterfaceC1529h interfaceC1529hMinusKey = interfaceC1529h.minusKey(key);
        return interfaceC1529hMinusKey == interfaceC1529h ? this : interfaceC1529hMinusKey == C1530i.f16022q ? interfaceC1527f : new C1523b(interfaceC1527f, interfaceC1529hMinusKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h context) {
        m.e(context, "context");
        return context == C1530i.f16022q ? this : (InterfaceC1529h) context.fold(this, new C0256q(14, (byte) 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.p(new StringBuilder("["), (String) fold("", new C0256q(13, (byte) 0)), ']');
    }
}
