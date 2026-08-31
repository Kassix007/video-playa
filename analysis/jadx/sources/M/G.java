package M;

import M5.InterfaceC0261w;
import android.window.BackEvent;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.C1642c;

/* JADX INFO: loaded from: classes.dex */
public final class G extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1642c f3306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BackEvent f3307s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C1642c c1642c, BackEvent backEvent, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3306r = c1642c;
        this.f3307s = backEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new G(this.f3306r, this.f3307s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3305q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            Float f = new Float(N.A.f3912a.c(this.f3307s.getProgress()));
            this.f3305q = 1;
            Object objE = this.f3306r.e(f, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objE == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
