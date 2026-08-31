package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class H extends F {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.F
    public final void a(long j, Object obj) {
        ((AbstractC0749h) ((A) i0.k(j, obj))).f10505q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.F
    public final void b(long j, Object obj, Object obj2) {
        A aN = (A) i0.k(j, obj);
        A a7 = (A) i0.k(j, obj2);
        int size = aN.size();
        int size2 = a7.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0749h) aN).f10505q) {
                aN = aN.n(size2 + size);
            }
            aN.addAll(a7);
        }
        if (size > 0) {
            a7 = aN;
        }
        i0.c(j, obj, a7);
    }
}
