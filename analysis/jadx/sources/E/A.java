package E;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r.AbstractC1561l;
import r.C1570v;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1928E;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC1928E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0137u f1470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z0.T f1471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0140x f1472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1570v f1473t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A(C0137u c0137u, z0.T t6) {
        this.f1470q = c0137u;
        this.f1471r = t6;
        this.f1472s = (InterfaceC0140x) c0137u.f1590b.invoke();
        C1570v c1570v = AbstractC1561l.f16221a;
        this.f1473t = new C1570v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float D(long j) {
        return this.f1471r.D(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final int G(float f) {
        return this.f1471r.G(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final InterfaceC1927D O(int i, int i7, Map map, B5.c cVar) {
        return this.f1471r.O(i, i7, map, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long Q(long j) {
        return this.f1471r.Q(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float T(long j) {
        return this.f1471r.T(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a(int i, long j) {
        C1570v c1570v = this.f1473t;
        List list = (List) c1570v.b(i);
        if (list != null) {
            return list;
        }
        InterfaceC0140x interfaceC0140x = this.f1472s;
        Object objB = interfaceC0140x.b(i);
        List listH = this.f1471r.H(objB, this.f1470q.a(i, objB, interfaceC0140x.c(i)));
        int size = listH.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((InterfaceC1925B) listH.get(i7)).a(j));
        }
        c1570v.h(i, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long a0(float f) {
        return this.f1471r.a0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f1471r.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final InterfaceC1927D f(int i, int i7, Map map, B5.c cVar) {
        return this.f1471r.f(i, i7, map, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float f0(int i) {
        return this.f1471r.f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final W0.l getLayoutDirection() {
        return this.f1471r.getLayoutDirection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float i0(float f) {
        return this.f1471r.i0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f1471r.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final boolean r() {
        return this.f1471r.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long s(float f) {
        return this.f1471r.s(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float u(float f) {
        return this.f1471r.u(f);
    }
}
