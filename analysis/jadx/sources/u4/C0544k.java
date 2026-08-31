package U4;

import M5.InterfaceC0261w;
import g5.C1091b;
import g5.C1092c;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: U4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0544k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P.W f7836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7838s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544k(P.W w3, P.W w6, P.W w7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7836q = w3;
        this.f7837r = w6;
        this.f7838s = w7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0544k(this.f7836q, this.f7837r, this.f7838s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0544k c0544k = (C0544k) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0544k.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        C1092c c1092c = (C1092c) this.f7836q.getValue();
        C0542i c0542i = new C0542i(this.f7837r, this.f7838s, 0);
        c1092c.getClass();
        new C1091b(c1092c, c0542i);
        return C1386y.f15098a;
    }
}
