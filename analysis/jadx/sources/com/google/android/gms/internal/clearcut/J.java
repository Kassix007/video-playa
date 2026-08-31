package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class J implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N[] f10422a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.N
    public final X a(Class cls) {
        for (N n7 : this.f10422a) {
            if (n7.b(cls)) {
                return n7.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.N
    public final boolean b(Class cls) {
        for (N n7 : this.f10422a) {
            if (n7.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
