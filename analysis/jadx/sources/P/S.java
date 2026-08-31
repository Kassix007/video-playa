package P;

import Q5.AbstractC0423c;
import q5.InterfaceC1528g;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC1528g, I0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ S f5373r = new S(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final S f5374s = new S(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final S f5375t = new S(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final S f5376u = new S(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final S f5377v = new S(4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5378q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [P.S.<clinit>():void, P.u.<init>(P.r, B0.G0):void] */
    public /* synthetic */ S(int i) {
        this.f5378q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(S s6) {
        P5.S s7;
        Object obj;
        V.b bVar;
        P5.S s8 = C0385v0.f5552x;
        do {
            s7 = C0385v0.f5552x;
            obj = (S.b) s7.getValue();
            bVar = (V.b) obj;
            U.c cVarA = bVar.f7917s;
            V.a aVar = (V.a) cVarA.get(s6);
            if (aVar != null) {
                Object obj2 = aVar.f7912a;
                Object obj3 = aVar.f7913b;
                U.m mVar = cVarA.f7493q;
                U.m mVarV = mVar.v(s6 != null ? s6.hashCode() : 0, 0, s6);
                if (mVar != mVarV) {
                    cVarA = mVarV == null ? U.c.f7492s : new U.c(mVarV, cVarA.f7494r - 1);
                }
                W.b bVar2 = W.b.f8006a;
                if (obj2 != bVar2) {
                    Object obj4 = cVarA.get(obj2);
                    kotlin.jvm.internal.m.b(obj4);
                    cVarA = cVarA.a(obj2, new V.a(((V.a) obj4).f7912a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVarA.get(obj3);
                    kotlin.jvm.internal.m.b(obj5);
                    cVarA = cVarA.a(obj3, new V.a(obj2, ((V.a) obj5).f7913b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f7915q : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f7916r;
                }
                bVar = new V.b(obj6, obj2, cVarA);
            }
            if (obj == bVar) {
                return;
            }
            E4.f fVar = AbstractC0423c.f6604b;
            if (obj == null) {
                obj = fVar;
            }
        } while (!s7.h(obj, bVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.I0
    public boolean a(Object obj, Object obj2) {
        switch (this.f5378q) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.m.a(obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f5378q) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
