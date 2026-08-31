package Q5;

import P5.InterfaceC0398i;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final O5.w f6592q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(O5.t tVar) {
        this.f6592q = tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        Object objK = this.f6592q.k(obj, interfaceC1524c);
        return objK == EnumC1580a.f16356q ? objK : C1386y.f15098a;
    }
}
