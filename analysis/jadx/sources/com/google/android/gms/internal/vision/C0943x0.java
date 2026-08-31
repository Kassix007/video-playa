package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0943x0 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0[] f11328a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.B0
    public final J0 a(Class cls) {
        for (B0 b02 : this.f11328a) {
            if (b02.b(cls)) {
                return b02.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.B0
    public final boolean b(Class cls) {
        for (B0 b02 : this.f11328a) {
            if (b02.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
