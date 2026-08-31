package R4;

import M5.InterfaceC0261w;
import P.C0348c0;
import k5.C1190b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f6772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0348c0 f6773r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C0468k1 c0468k1, C0348c0 c0348c0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6772q = c0468k1;
        this.f6773r = c0348c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new I0(this.f6772q, this.f6773r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        I0 i02 = (I0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        i02.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.J j;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f6772q;
        C1190b c1190b = c0468k1.f7086l;
        if (c1190b != null && (j = c1190b.f14129c) != null) {
            j.e(c0468k1.f7069b, new J0(new N5.d(1, c0468k1, this.f6773r), 0));
        }
        return C1386y.f15098a;
    }
}
