package v0;

import M5.InterfaceC0261w;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class z extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1731A f17511r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C1731A c1731a, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17511r = c1731a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new z(this.f17511r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17510q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1731A c1731a = this.f17511r;
            PointerInputEventHandler pointerInputEventHandler = c1731a.f17427G;
            this.f17510q = 2;
            Object objInvoke = pointerInputEventHandler.invoke(c1731a, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objInvoke == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
