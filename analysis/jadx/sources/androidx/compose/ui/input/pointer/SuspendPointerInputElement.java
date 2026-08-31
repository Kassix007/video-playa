package androidx.compose.ui.input.pointer;

import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import l6.d;
import v0.C1731A;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f9334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PointerInputEventHandler f9336s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SuspendPointerInputElement(Object obj, d dVar, PointerInputEventHandler pointerInputEventHandler, int i) {
        dVar = (i & 2) != 0 ? null : dVar;
        this.f9334q = obj;
        this.f9335r = dVar;
        this.f9336s = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return m.a(this.f9334q, suspendPointerInputElement.f9334q) && m.a(this.f9335r, suspendPointerInputElement.f9335r) && this.f9336s == suspendPointerInputElement.f9336s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        return new C1731A(this.f9334q, this.f9335r, this.f9336s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        C1731A c1731a = (C1731A) abstractC0724l;
        Object obj = c1731a.f17425E;
        Object obj2 = this.f9334q;
        boolean z5 = !m.a(obj, obj2);
        c1731a.f17425E = obj2;
        Object obj3 = c1731a.f17426F;
        Object obj4 = this.f9335r;
        if (!m.a(obj3, obj4)) {
            z5 = true;
        }
        c1731a.f17426F = obj4;
        Class<?> cls = c1731a.f17427G.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f9336s;
        if (cls == pointerInputEventHandler.getClass() ? z5 : true) {
            c1731a.y0();
        }
        c1731a.f17427G = pointerInputEventHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f9334q;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f9335r;
        return this.f9336s.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
