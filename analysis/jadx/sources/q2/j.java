package Q2;

import B0.C0050o;
import I2.B;
import I2.y;
import R4.C0433b2;
import android.content.Context;
import m5.AbstractC1362a;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class j implements L2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1376o f6538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1376o f6539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0050o f6540c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(C0433b2 c0433b2) {
        K2.j jVar = new K2.j(9);
        i iVar = i.f6537q;
        this.f6538a = AbstractC1362a.d(c0433b2);
        this.f6539b = AbstractC1362a.d(jVar);
        C0050o c0050o = new C0050o();
        c0050o.f499q = iVar;
        c0050o.f500r = R2.b.f6700a;
        this.f6540c = c0050o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L2.f
    public final L2.g a(Object obj, U2.n nVar, y yVar) {
        B b7 = (B) obj;
        if (!kotlin.jvm.internal.m.a(b7.f2336c, "http") && !kotlin.jvm.internal.m.a(b7.f2336c, "https")) {
            return null;
        }
        String str = b7.f2334a;
        C1376o c1376o = this.f6538a;
        C1376o c1376oD = AbstractC1362a.d(new I2.d(4, yVar));
        C1376o c1376o2 = this.f6539b;
        C0050o c0050o = this.f6540c;
        Context context = nVar.f7686a;
        Object obj2 = c0050o.f500r;
        R2.b bVar = R2.b.f6700a;
        if (obj2 == bVar) {
            synchronized (c0050o) {
                obj2 = c0050o.f500r;
                if (obj2 == bVar) {
                    B5.c cVar = (B5.c) c0050o.f499q;
                    kotlin.jvm.internal.m.b(cVar);
                    Object objInvoke = cVar.invoke(context);
                    c0050o.f500r = objInvoke;
                    c0050o.f499q = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new q(str, nVar, c1376o, c1376oD, c1376o2, (e) obj2);
    }
}
