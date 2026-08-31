package androidx.work.impl.constraints;

import B5.a;
import M5.AbstractC0263y;
import O5.s;
import O5.t;
import P5.C0392c;
import P5.InterfaceC0397h;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.Constraints;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.C1530i;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkRequestConstraintController implements ConstraintController {
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1, reason: invalid class name */
    @e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements B5.e {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX INFO: renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00001 extends n implements a {
            final /* synthetic */ a $tryUnregister;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(a aVar) {
                super(0);
                this.$tryUnregister = aVar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m11invoke();
                return C1386y.f15098a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m11invoke() {
                this.$tryUnregister.invoke();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constraints, this.this$0, interfaceC1524c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(t tVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
            return ((AnonymousClass1) create(tVar, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            C1386y c1386y = C1386y.f15098a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
                return c1386y;
            }
            AbstractC1362a.e(obj);
            t tVar = (t) this.L$0;
            NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
            if (requiredNetworkRequest == null) {
                s sVar = (s) tVar;
                sVar.getClass();
                sVar.f5260t.g(false, null);
                return c1386y;
            }
            NetworkRequestConstraintController$track$1$onConstraintState$1 networkRequestConstraintController$track$1$onConstraintState$1 = new NetworkRequestConstraintController$track$1$onConstraintState$1(AbstractC0263y.t(tVar, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, tVar, null), 3), tVar);
            C00001 c00001 = new C00001(Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, networkRequestConstraintController$track$1$onConstraintState$1) : IndividualNetworkCallback.Companion.addCallback(this.this$0.connManager, requiredNetworkRequest, networkRequestConstraintController$track$1$onConstraintState$1));
            this.label = 1;
            Object objL = AbstractC1397A.l(tVar, c00001, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            return objL == enumC1580a ? enumC1580a : c1386y;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NetworkRequestConstraintController(ConnectivityManager connManager, long j) {
        m.e(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        m.e(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkRequest() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        m.e(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC0397h track(Constraints constraints) {
        m.e(constraints, "constraints");
        return new C0392c(new AnonymousClass1(constraints, this, null), C1530i.f16022q, -2, O5.a.f5206q);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 android.net.ConnectivityManager)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1000 long) : (r2v0 long))
 A[MD:(android.net.ConnectivityManager, long):void (m)] (LINE:4) call: androidx.work.impl.constraints.NetworkRequestConstraintController.<init>(android.net.ConnectivityManager, long):void type: THIS */
    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j, int i, g gVar) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }
}
