package androidx.lifecycle;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0655s implements InterfaceC0658v, InterfaceC0261w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0654q f9565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1529h f9566r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0655s(AbstractC0654q abstractC0654q, InterfaceC1529h coroutineContext) {
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        this.f9565q = abstractC0654q;
        this.f9566r = coroutineContext;
        if (abstractC0654q.b() == EnumC0653p.f9556q) {
            AbstractC0263y.f(coroutineContext, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0261w
    public final InterfaceC1529h d() {
        return this.f9566r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        AbstractC0654q abstractC0654q = this.f9565q;
        if (abstractC0654q.b().compareTo(EnumC0653p.f9556q) <= 0) {
            abstractC0654q.c(this);
            AbstractC0263y.f(this.f9566r, null);
        }
    }
}
