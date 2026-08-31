package T1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m5.C1371j;
import r.S;

/* JADX INFO: loaded from: classes.dex */
@y("navigation")
public class t extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f7416c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(A navigatorProvider) {
        kotlin.jvm.internal.m.e(navigatorProvider, "navigatorProvider");
        this.f7416c = navigatorProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final void d(List list, w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            p pVar = dVar.f7354r;
            kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            r rVar = (r) pVar;
            W1.l lVar = rVar.f7404r;
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            yVar.f14268q = dVar.f7360x.a();
            D.u uVar = rVar.f7413v;
            int i = uVar.f1289b;
            String str = (String) uVar.f;
            if (i == 0 && str == null) {
                lVar.getClass();
                String superName = String.valueOf(lVar.f8091a);
                kotlin.jvm.internal.m.e(superName, "superName");
                if (((r) uVar.f1290c).f7404r.f8091a == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            p pVarO = str != null ? uVar.o(str, false) : (p) ((S) uVar.f1291d).c(i);
            if (pVarO == null) {
                if (((String) uVar.f1292e) == null) {
                    String strValueOf = (String) uVar.f;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(uVar.f1289b);
                    }
                    uVar.f1292e = strValueOf;
                }
                String str2 = (String) uVar.f1292e;
                kotlin.jvm.internal.m.b(str2);
                throw new IllegalArgumentException(C0.S.n("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            W1.l lVar2 = pVarO.f7404r;
            if (str != null) {
                if (!str.equals((String) lVar2.f8095e)) {
                    o oVarF = lVar2.f(str);
                    Bundle bundle = oVarF != null ? oVarF.f7398r : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                        bundleG.putAll(bundle);
                        Bundle bundle2 = (Bundle) yVar.f14268q;
                        if (bundle2 != null) {
                            bundleG.putAll(bundle2);
                        }
                        yVar.f14268q = bundleG;
                    }
                }
                if (pVarO.g().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListB = AbstractC0836n2.B(pVarO.g(), new J5.i(3, yVar));
                    if (!arrayListB.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + pVarO + ". Missing required arguments [" + arrayListB + ']').toString());
                    }
                }
            }
            this.f7416c.b(pVarO.f7403q).d(AbstractC0836n2.z(b().b(pVarO, pVarO.d((Bundle) yVar.f14268q))), wVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: a()LT1/p; */
    @Override // T1.z
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public r a() {
        return new r(this);
    }
}
