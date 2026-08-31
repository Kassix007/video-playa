package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O3.B f9552b = new O3.B(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9553a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0() {
        this.f9553a = new AtomicReference(null);
    }

    public j0(k0 store, h0 factory, P1.c defaultCreationExtras) {
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(defaultCreationExtras, "defaultCreationExtras");
        this.f9553a = new E.c0(store, factory, defaultCreationExtras);
    }

    public j0(O o6) {
        this.f9553a = o6;
    }
}
