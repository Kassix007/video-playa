package G;

import C.k;
import M5.InterfaceC0261w;
import com.google.android.gms.internal.measurement.K1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f1962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f1963s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, k kVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1962r = eVar;
        this.f1963s = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new c(this.f1962r, this.f1963s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1961q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f1961q = 1;
            Object objF = K1.f(this.f1962r, this.f1963s, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objF == enumC1580a) {
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
