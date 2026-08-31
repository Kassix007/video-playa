package T1;

import java.util.ArrayList;
import r.S;

/* JADX INFO: loaded from: classes.dex */
public final class s extends q {
    public final A f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7415h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(A provider, String startDestination) {
        super(provider.b(C3.a.z(t.class)), null);
        kotlin.jvm.internal.m.e(provider, "provider");
        kotlin.jvm.internal.m.e(startDestination, "startDestination");
        this.f7415h = new ArrayList();
        this.f = provider;
        this.f7414g = startDestination;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r c() {
        r rVar = (r) super.a();
        ArrayList nodes = this.f7415h;
        kotlin.jvm.internal.m.e(nodes, "nodes");
        D.u uVar = rVar.f7413v;
        uVar.getClass();
        int size = nodes.size();
        int iHashCode = 0;
        int i = 0;
        while (i < size) {
            Object obj = nodes.get(i);
            i++;
            p pVar = (p) obj;
            if (pVar != null) {
                S s6 = (S) uVar.f1291d;
                r rVar2 = (r) uVar.f1290c;
                W1.l lVar = rVar2.f7404r;
                W1.l lVar2 = pVar.f7404r;
                int i7 = lVar2.f8091a;
                String str = (String) lVar2.f8095e;
                if (i7 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) lVar.f8095e;
                if (str2 != null && kotlin.jvm.internal.m.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + pVar + " cannot have the same route as graph " + rVar2).toString());
                }
                if (i7 == lVar.f8091a) {
                    throw new IllegalArgumentException(("Destination " + pVar + " cannot have the same id as graph " + rVar2).toString());
                }
                p pVar2 = (p) s6.c(i7);
                if (pVar2 == pVar) {
                    continue;
                } else {
                    if (pVar.f7405s != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (pVar2 != null) {
                        pVar2.f7405s = null;
                    }
                    pVar.f7405s = rVar2;
                    s6.e(lVar2.f8091a, pVar);
                }
            }
        }
        String str3 = this.f7414g;
        if (str3 == null) {
            if (this.f7408b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        r rVar3 = (r) uVar.f1290c;
        if (str3 != null) {
            if (str3.equals((String) rVar3.f7404r.f8095e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + rVar3).toString());
            }
            if (J5.m.U0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i8 = p.f7402u;
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        uVar.f1289b = iHashCode;
        uVar.f = str3;
        return rVar;
    }
}
