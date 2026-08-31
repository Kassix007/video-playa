package T1;

import B0.G0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C1193b;
import r.S;

/* JADX INFO: loaded from: classes.dex */
public class r extends p implements Iterable, C5.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f7412w = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final D.u f7413v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(t tVar) {
        super(tVar);
        this.f7413v = new D.u(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.p
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r) || !super.equals(obj)) {
            return false;
        }
        D.u uVar = this.f7413v;
        int iF = ((S) uVar.f1291d).f();
        D.u uVar2 = ((r) obj).f7413v;
        if (iF != ((S) uVar2.f1291d).f() || uVar.f1289b != uVar2.f1289b) {
            return false;
        }
        S s6 = (S) uVar.f1291d;
        kotlin.jvm.internal.m.e(s6, "<this>");
        for (p pVar : (I5.a) I5.k.Q(new C1193b(6, s6))) {
            if (!pVar.equals(((S) uVar2.f1291d).c(pVar.f7404r.f8091a))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.p
    public final o h(G0 g02) {
        o oVarH = super.h(g02);
        D.u uVar = this.f7413v;
        uVar.getClass();
        return uVar.u(oVarH, g02, false, (r) uVar.f1290c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.p
    public final int hashCode() {
        D.u uVar = this.f7413v;
        int iD = uVar.f1289b;
        S s6 = (S) uVar.f1291d;
        int iF = s6.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + s6.d(i)) * 31) + ((p) s6.g(i)).hashCode();
        }
        return iD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o i(G0 g02, p pVar) {
        return this.f7413v.u(super.h(g02), g02, true, pVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        D.u uVar = this.f7413v;
        uVar.getClass();
        return new W1.m(uVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o j(String route, boolean z5, p pVar) {
        o oVarJ;
        kotlin.jvm.internal.m.e(route, "route");
        D.u uVar = this.f7413v;
        uVar.getClass();
        r rVar = (r) uVar.f1290c;
        o oVarF = rVar.f7404r.f(route);
        ArrayList arrayList = new ArrayList();
        Iterator it = rVar.iterator();
        while (true) {
            W1.m mVar = (W1.m) it;
            oVarJ = null;
            if (!mVar.hasNext()) {
                break;
            }
            p pVar2 = (p) mVar.next();
            if (!kotlin.jvm.internal.m.a(pVar2, pVar)) {
                if (pVar2 instanceof r) {
                    oVarJ = ((r) pVar2).j(route, false, rVar);
                } else {
                    pVar2.getClass();
                    oVarJ = pVar2.f7404r.f(route);
                }
            }
            if (oVarJ != null) {
                arrayList.add(oVarJ);
            }
        }
        o oVar = (o) n5.l.t0(arrayList);
        r rVar2 = rVar.f7405s;
        if (rVar2 != null && z5 && !rVar2.equals(pVar)) {
            oVarJ = rVar2.j(route, true, rVar);
        }
        return (o) n5.l.t0(n5.k.M0(new o[]{oVarF, oVar, oVarJ}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.p
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        D.u uVar = this.f7413v;
        String str = (String) uVar.f;
        uVar.getClass();
        p pVarO = (str == null || J5.m.U0(str)) ? null : uVar.o(str, true);
        if (pVarO == null) {
            pVarO = uVar.n(uVar.f1289b);
        }
        sb.append(" startDestination=");
        if (pVarO == null) {
            String str2 = (String) uVar.f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) uVar.f1292e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(uVar.f1289b));
                }
            }
        } else {
            sb.append("{");
            sb.append(pVarO.toString());
            sb.append("}");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
