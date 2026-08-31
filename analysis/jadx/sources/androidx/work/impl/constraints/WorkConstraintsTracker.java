package androidx.work.impl.constraints;

import B5.a;
import B5.c;
import B5.f;
import M5.p0;
import P5.H;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import Q5.t;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.k;
import n5.l;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$areAllConstraintsMet$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.c
        public final CharSequence invoke(ConstraintController it) {
            m.e(it, "it");
            return it.getClass().getSimpleName();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends androidx.work.impl.constraints.controllers.ConstraintController> */
    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> controllers) {
        m.e(controllers, "controllers");
        this.controllers = controllers;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.constraints.WorkConstraintsTrackerKt.access$getTAG$p():java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        m.e(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.id + " constrained by " + l.q0(arrayList, null, null, null, AnonymousClass1.INSTANCE, 31));
        }
        return arrayList.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0397h track(WorkSpec spec) {
        m.e(spec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n5.m.c0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((ConstraintController) obj2).track(spec.constraints));
        }
        final InterfaceC0397h[] interfaceC0397hArr = (InterfaceC0397h[]) l.B0(arrayList2).toArray(new InterfaceC0397h[0]);
        return H.g(new InterfaceC0397h() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends n implements a {
                final /* synthetic */ InterfaceC0397h[] $flowArray;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC0397h[] interfaceC0397hArr) {
                    super(0);
                    this.$flowArray = interfaceC0397hArr;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // B5.a
                public final ConstraintsState[] invoke() {
                    return new ConstraintsState[this.$flowArray.length];
                }
            }

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            @e(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends i implements f {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public AnonymousClass3(InterfaceC1524c interfaceC1524c) {
                    super(3, interfaceC1524c);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // B5.f
                public final Object invoke(InterfaceC0398i interfaceC0398i, ConstraintsState[] constraintsStateArr, InterfaceC1524c<? super C1386y> interfaceC1524c) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC1524c);
                    anonymousClass3.L$0 = interfaceC0398i;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(C1386y.f15098a);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // s5.a
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState constraintsState;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC1362a.e(obj);
                        InterfaceC0398i interfaceC0398i = (InterfaceC0398i) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                constraintsState = null;
                                break;
                            }
                            constraintsState = constraintsStateArr[i7];
                            if (!m.a(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i7++;
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        Object objEmit = interfaceC0398i.emit(constraintsState, this);
                        EnumC1580a enumC1580a = EnumC1580a.f16356q;
                        if (objEmit == enumC1580a) {
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
            @Override // P5.InterfaceC0397h
            public Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) throws Throwable {
                InterfaceC0397h[] interfaceC0397hArr2 = interfaceC0397hArr;
                t tVar = new t(interfaceC0397hArr2, new AnonymousClass2(interfaceC0397hArr2), new AnonymousClass3(null), interfaceC0398i, null);
                p0 p0Var = new p0(interfaceC1524c.getContext(), interfaceC1524c, 1);
                Object objD0 = I1.D0(p0Var, true, p0Var, tVar);
                C1386y c1386y = C1386y.f15098a;
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objD0 != enumC1580a) {
                    objD0 = c1386y;
                }
                return objD0 == enumC1580a ? objD0 : c1386y;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this(k.M0(new ConstraintController[]{new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null}));
        m.e(trackers, "trackers");
    }
}
