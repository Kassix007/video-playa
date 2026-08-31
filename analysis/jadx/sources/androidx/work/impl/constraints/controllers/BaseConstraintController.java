package androidx.work.impl.constraints.controllers;

import B5.a;
import O5.s;
import O5.t;
import P5.C0392c;
import P5.InterfaceC0397h;
import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
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
public abstract class BaseConstraintController<T> implements ConstraintController {
    private final ConstraintTracker<T> tracker;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1, reason: invalid class name */
    @e(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements B5.e {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConstraintController<T> this$0;

        /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00021 extends n implements a {
            final /* synthetic */ BaseConstraintController$track$1$listener$1 $listener;
            final /* synthetic */ BaseConstraintController<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(BaseConstraintController<T> baseConstraintController, BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1) {
                super(0);
                this.this$0 = baseConstraintController;
                this.$listener = baseConstraintController$track$1$listener$1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13invoke();
                return C1386y.f15098a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m13invoke() {
                ((BaseConstraintController) this.this$0).tracker.removeListener(this.$listener);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseConstraintController<T> baseConstraintController, InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.this$0 = baseConstraintController;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC1524c);
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
            if (i == 0) {
                AbstractC1362a.e(obj);
                final t tVar = (t) this.L$0;
                final BaseConstraintController<T> baseConstraintController = this.this$0;
                ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T t6) {
                        Object constraintsNotMet = baseConstraintController.isConstrained(t6) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE;
                        s sVar = (s) tVar;
                        sVar.getClass();
                        sVar.j(constraintsNotMet);
                    }
                };
                ((BaseConstraintController) this.this$0).tracker.addListener(constraintListener);
                C00021 c00021 = new C00021(this.this$0, constraintListener);
                this.label = 1;
                Object objL = AbstractC1397A.l(tVar, c00021, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objL == enumC1580a) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseConstraintController(ConstraintTracker<T> tracker) {
        m.e(tracker, "tracker");
        this.tracker = tracker;
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public boolean isConstrained(T t6) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        m.e(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC0397h track(Constraints constraints) {
        m.e(constraints, "constraints");
        return new C0392c(new AnonymousClass1(this, null), C1530i.f16022q, -2, O5.a.f5206q);
    }
}
