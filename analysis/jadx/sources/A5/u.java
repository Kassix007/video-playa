package a5;

import M5.InterfaceC0261w;
import P.W;
import R4.N;
import U4.C0546m;
import com.web2native.MainActivity;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class u extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f8993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f8995s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, MainActivity mainActivity, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8993q = yVar;
        this.f8994r = mainActivity;
        this.f8995s = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new u(this.f8993q, this.f8994r, this.f8995s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        u uVar = (u) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        uVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        this.f8993q.f9011e.e(this.f8994r, new N(new C0546m(this.f8995s, 4), 7));
        return C1386y.f15098a;
    }
}
