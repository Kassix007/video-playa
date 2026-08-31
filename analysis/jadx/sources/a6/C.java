package a6;

import a.AbstractC0597a;

/* JADX INFO: loaded from: classes.dex */
public final class C implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f9014a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X5.g f9015b = AbstractC0597a.k("kotlinx.serialization.json.JsonPrimitive", X5.d.f8183k, new X5.f[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return f9015b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        l lVarT0 = D5.a.m(bVar).T0();
        if (lVarT0 instanceof B) {
            return (B) lVarT0;
        }
        throw b6.e.a(-1, lVarT0.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.z.a(lVarT0.getClass()));
    }
}
