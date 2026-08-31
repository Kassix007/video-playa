package androidx.work.impl.constraints;

import B5.c;
import M5.InterfaceC0241b0;
import O5.s;
import O5.t;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkRequestConstraintController$track$1$onConstraintState$1 extends n implements c {
    final /* synthetic */ t $$this$callbackFlow;
    final /* synthetic */ InterfaceC0241b0 $timeoutJob;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$onConstraintState$1(InterfaceC0241b0 interfaceC0241b0, t tVar) {
        super(1);
        this.$timeoutJob = interfaceC0241b0;
        this.$$this$callbackFlow = tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConstraintsState) obj);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void invoke(ConstraintsState it) {
        m.e(it, "it");
        this.$timeoutJob.a(null);
        ((s) this.$$this$callbackFlow).j(it);
    }
}
