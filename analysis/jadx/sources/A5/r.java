package a5;

import P.C0345b;
import P.C0371o;
import R4.C0468k1;
import R4.C0517x;
import com.web2native.MainActivity;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f8979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8984w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, B5.c cVar, Object obj5, int i, int i7) {
        this.f8978q = i7;
        this.f8980s = obj;
        this.f8981t = obj2;
        this.f8982u = obj3;
        this.f8983v = obj4;
        this.f8979r = cVar;
        this.f8984w = obj5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8978q) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = C0345b.w(1);
                C3.a.d((c) this.f8980s, (String) this.f8981t, (String) this.f8982u, (MainActivity) this.f8983v, this.f8979r, (B5.a) this.f8984w, (C0371o) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW2 = C0345b.w(1);
                E3.h.h((C0468k1) this.f8980s, this.f8981t, (Boolean) this.f8982u, (C0517x) this.f8983v, this.f8979r, (Integer) this.f8984w, (C0371o) obj, iW2);
                break;
        }
        return C1386y.f15098a;
    }
}
