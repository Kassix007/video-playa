package a6;

import Z4.G;

/* JADX INFO: loaded from: classes.dex */
public final class n implements V5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f9040a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X5.g f9041b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        X5.f[] fVarArr = new X5.f[0];
        G g7 = new G(3);
        kotlin.jvm.internal.m.e("kotlinx.serialization.json.JsonElement", "serialName");
        if (J5.m.U0("kotlinx.serialization.json.JsonElement")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        X5.i iVar = X5.i.f8194c;
        X5.c cVar = X5.c.f8177c;
        if (cVar.equals(iVar)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        X5.a aVar = new X5.a("kotlinx.serialization.json.JsonElement");
        g7.invoke(aVar);
        f9041b = new X5.g("kotlinx.serialization.json.JsonElement", cVar, aVar.f8173b.size(), n5.k.R0(fVarArr), aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return f9041b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final Object c(Y5.b bVar) {
        return D5.a.m(bVar).T0();
    }
}
