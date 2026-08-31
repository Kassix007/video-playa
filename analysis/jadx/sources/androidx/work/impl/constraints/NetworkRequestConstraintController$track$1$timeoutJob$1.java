package androidx.work.impl.constraints;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import O5.s;
import O5.t;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
@e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {149}, m = "invokeSuspend")
public final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends i implements B5.e {
    final /* synthetic */ t $$this$callbackFlow;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$timeoutJob$1(NetworkRequestConstraintController networkRequestConstraintController, t tVar, InterfaceC1524c<? super NetworkRequestConstraintController$track$1$timeoutJob$1> interfaceC1524c) {
        super(2, interfaceC1524c);
        this.this$0 = networkRequestConstraintController;
        this.$$this$callbackFlow = tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
        return new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, this.$$this$callbackFlow, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // B5.e
    public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return ((NetworkRequestConstraintController$track$1$timeoutJob$1) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            AbstractC1362a.e(obj);
            long j = this.this$0.timeoutMs;
            this.label = 1;
            Object objH = AbstractC0263y.h(j, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objH == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.this$0.timeoutMs + " ms");
        ((s) this.$$this$callbackFlow).j(new ConstraintsState.ConstraintsNotMet(7));
        return C1386y.f15098a;
    }
}
