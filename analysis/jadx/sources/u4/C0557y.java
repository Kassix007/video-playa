package U4;

import M.I0;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: U4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0557y extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f7888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0 f7889r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557y(InterfaceC0261w interfaceC0261w, I0 i02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7888q = interfaceC0261w;
        this.f7889r = i02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0557y(this.f7888q, this.f7889r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0557y c0557y = (C0557y) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0557y.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        AbstractC0263y.t(this.f7888q, null, null, new C0556x(this.f7889r, null), 3);
        return C1386y.f15098a;
    }
}
