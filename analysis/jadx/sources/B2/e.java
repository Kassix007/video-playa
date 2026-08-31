package B2;

import B0.C0050o;
import B0.G0;
import O3.C0300l0;
import O3.C0305n;
import O3.C0323t0;
import O3.T1;
import O3.X;
import Q2.r;
import com.google.android.gms.internal.measurement.D;
import d2.d0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import s.C1586b;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f544h = 0;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C0300l0 c0300l0) {
        super(20);
        this.i = c0300l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.d0
    public Object c(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        switch (this.f544h) {
            case 1:
                String str = (String) obj;
                AbstractC1887A.d(str);
                C0300l0 c0300l0 = (C0300l0) this.i;
                c0300l0.p();
                AbstractC1887A.d(str);
                C0305n c0305n = c0300l0.f4510s.f4609s;
                T1.S(c0305n);
                G0 g0W0 = c0305n.w0(str);
                if (g0W0 == null) {
                    return null;
                }
                X x6 = ((C0323t0) c0300l0.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4666E.c(str, "Populate EES config from database on cache miss. appId");
                c0300l0.w(str, c0300l0.x(str, (byte[]) g0W0.f234r));
                e eVar = c0300l0.f4945A;
                synchronized (((C1586b) eVar.f12095g)) {
                    Set setEntrySet = ((r) eVar.f).f6574a.entrySet();
                    m.d(setEntrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((r) eVar.f).f6574a.entrySet();
                    m.d(setEntrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
                return (D) linkedHashMap.get(str);
            default:
                return super.c(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.d0
    public void d(Object obj, Object obj2, Object obj3) {
        switch (this.f544h) {
            case 0:
                d dVar = (d) obj2;
                ((g) ((C0050o) this.i).f499q).c((a) obj, dVar.f541a, dVar.f542b, dVar.f543c);
                break;
            default:
                super.d(obj, obj2, obj3);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.d0
    public int o(Object obj, Object obj2) {
        switch (this.f544h) {
            case 0:
                return ((d) obj2).f543c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, C0050o c0050o) {
        super(i);
        this.i = c0050o;
    }
}
