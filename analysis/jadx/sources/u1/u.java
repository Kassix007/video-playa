package U1;

import P.S0;
import P.W;
import com.web2native.MainActivity;
import java.util.List;
import m5.C1386y;
import r.C1542A;
import t.C1595D;
import t.C1596E;
import t.C1601J;
import t.C1606e;
import t.C1613l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7584q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f7585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f7586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7588u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7589v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7591x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u(List list, String str, String str2, MainActivity mainActivity, B5.c cVar, B5.a aVar, W w3) {
        this.f7587t = list;
        this.f7588u = str;
        this.f7589v = str2;
        this.f7590w = mainActivity;
        this.f7585r = cVar;
        this.f7591x = aVar;
        this.f7586s = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f7584q;
        Object obj2 = this.f7591x;
        Object obj3 = this.f7590w;
        Object obj4 = this.f7589v;
        Object obj5 = this.f7588u;
        Object obj6 = this.f7587t;
        switch (i) {
            case 0:
                C1542A c1542a = (C1542A) obj6;
                i iVar = (i) obj5;
                B5.c cVar = (B5.c) obj4;
                B5.c cVar2 = (B5.c) obj3;
                C1613l c1613l = (C1613l) obj;
                boolean zContains = ((List) ((S0) obj2).getValue()).contains(c1613l.a());
                float f = 0.0f;
                if (!zContains) {
                    C1595D c1595d = C1595D.f16578b;
                    C1596E c1596e = C1596E.f16580b;
                    int i7 = androidx.compose.animation.a.f9230b;
                    return new t.s(c1595d, c1596e, 0.0f, new C1601J(C1606e.f16606q));
                }
                String str = ((T1.d) c1613l.a()).f7358v;
                int iC = c1542a.c(str);
                if (iC >= 0) {
                    f = c1542a.f16106c[iC];
                } else {
                    c1542a.e(0.0f, str);
                }
                if (!kotlin.jvm.internal.m.a(((T1.d) c1613l.c()).f7358v, ((T1.d) c1613l.a()).f7358v)) {
                    f = (((Boolean) iVar.f7550c.getValue()).booleanValue() || ((Boolean) this.f7586s.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                c1542a.e(f, ((T1.d) c1613l.c()).f7358v);
                return new t.s((C1595D) this.f7585r.invoke(c1613l), (C1596E) cVar.invoke(c1613l), f, (C1601J) cVar2.invoke(c1613l));
            default:
                List list = (List) obj6;
                D.h LazyVerticalGrid = (D.h) obj;
                kotlin.jvm.internal.m.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                LazyVerticalGrid.f1214c.a(list.size(), new D.f(D.g.f1210r, new a5.w(0, list), new X.e(699646206, true, new a5.x(list, (String) obj5, (String) obj4, (MainActivity) obj3, this.f7585r, (B5.a) obj2, this.f7586s))));
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ u(C1542A c1542a, i iVar, B5.c cVar, B5.c cVar2, B5.c cVar3, S0 s02, W w3) {
        this.f7587t = c1542a;
        this.f7588u = iVar;
        this.f7585r = cVar;
        this.f7589v = cVar2;
        this.f7590w = cVar3;
        this.f7591x = s02;
        this.f7586s = w3;
    }
}
