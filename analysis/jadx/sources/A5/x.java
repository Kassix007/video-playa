package a5;

import P.C0363k;
import P.C0371o;
import P.W;
import com.web2native.MainActivity;
import java.util.List;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.n implements B5.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f9001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f9002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MainActivity f9004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B5.c f9005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B5.a f9006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W f9007w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List list, String str, String str2, MainActivity mainActivity, B5.c cVar, B5.a aVar, W w3) {
        super(4);
        this.f9001q = list;
        this.f9002r = str;
        this.f9003s = str2;
        this.f9004t = mainActivity;
        this.f9005u = cVar;
        this.f9006v = aVar;
        this.f9007w = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        D.j jVar = (D.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0371o c0371o = (C0371o) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c0371o.g(jVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c0371o.e(iIntValue) ? 32 : 16;
        }
        if (c0371o.K(i & 1, (i & 147) != 146)) {
            c cVar = (c) this.f9001q.get(iIntValue);
            c0371o.S(-1934858340);
            B5.a aVar = this.f9006v;
            boolean zG = c0371o.g(aVar);
            Object objH = c0371o.H();
            if (zG || objH == C0363k.f5418a) {
                objH = new v(aVar, this.f9007w);
                c0371o.d0(objH);
            }
            C3.a.d(cVar, this.f9002r, this.f9003s, this.f9004t, this.f9005u, (B5.a) objH, c0371o, 0);
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        return C1386y.f15098a;
    }
}
