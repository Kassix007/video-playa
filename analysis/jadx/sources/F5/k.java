package f5;

import M5.InterfaceC0261w;
import P.W;
import R4.C0468k1;
import R4.N;
import U4.C0539f;
import androidx.lifecycle.J;
import j5.C1166c;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f12784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f12785r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0468k1 c0468k1, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12784q = c0468k1;
        this.f12785r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new k(this.f12784q, this.f12785r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        kVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        J j;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f12784q;
        Boolean boolValueOf = Boolean.valueOf(c0468k1.f7067a.getResources().getConfiguration().orientation == 2);
        W w3 = this.f12785r;
        w3.setValue(boolValueOf);
        C1166c c1166c = c0468k1.f7097s;
        if (c1166c != null && (j = c1166c.f13864g) != null) {
            j.e(c0468k1.f7069b, new N(new C0539f(c0468k1, w3, 3), 9));
        }
        return C1386y.f15098a;
    }
}
