package a6;

import a.AbstractC0597a;

/* JADX INFO: loaded from: classes.dex */
public final class v implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f9046a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X5.g f9047b = AbstractC0597a.k("kotlinx.serialization.json.JsonNull", X5.h.f8193d, new X5.f[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return f9047b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        D5.a.m(bVar);
        if (bVar.f()) {
            throw new b6.c("Expected 'null' literal");
        }
        return u.INSTANCE;
    }
}
