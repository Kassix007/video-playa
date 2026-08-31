package Z5;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0572a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f8539a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E() {
        a0 a0Var = a0.f8577a;
        a6.n nVar = a6.n.f9040a;
        this.f8539a = new D(a0.f8578b, a6.n.f9041b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return this.f8539a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object d() {
        return new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final int e(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final void g(Y5.a aVar, int i, Object obj) {
        Map builder = (Map) obj;
        a6.n nVar = a6.n.f9040a;
        kotlin.jvm.internal.m.e(builder, "builder");
        a0 a0Var = a0.f8577a;
        D d5 = this.f8539a;
        Object objB = aVar.b(d5, i, a0Var, null);
        int iJ = aVar.j(d5);
        if (iJ != i + 1) {
            throw new IllegalArgumentException(C0.S.j(i, iJ, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        builder.put(objB, (!builder.containsKey(objB) || (a6.n.f9041b.f8185b instanceof X5.e)) ? aVar.b(d5, iJ, nVar, null) : aVar.b(d5, iJ, nVar, n5.x.J(objB, builder)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        kotlin.jvm.internal.m.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object i(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
