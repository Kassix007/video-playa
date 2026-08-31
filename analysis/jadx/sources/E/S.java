package E;

import M5.AbstractC0263y;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U f1501r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(U u6, int i) {
        super(1);
        this.f1500q = i;
        this.f1501r = u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f1500q) {
            case 0:
                InterfaceC0140x interfaceC0140x = (InterfaceC0140x) this.f1501r.f1505E.invoke();
                int iA = interfaceC0140x.a();
                int i = 0;
                while (true) {
                    if (i >= iA) {
                        i = -1;
                    } else if (!interfaceC0140x.b(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Number) obj).intValue();
                U u6 = this.f1501r;
                InterfaceC0140x interfaceC0140x2 = (InterfaceC0140x) u6.f1505E.invoke();
                if (iIntValue < 0 || iIntValue >= interfaceC0140x2.a()) {
                    StringBuilder sbL = k1.i.l("Can't scroll to index ", ", it is out of bounds [0, ", iIntValue);
                    sbL.append(interfaceC0140x2.a());
                    sbL.append(')');
                    AbstractC1923a.a(sbL.toString());
                }
                AbstractC0263y.t(u6.l0(), null, null, new T(u6, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
