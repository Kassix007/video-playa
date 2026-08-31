package androidx.work.impl.constraints;

import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class WorkConstraintsTrackerKt {
    private static final long DefaultNetworkRequestTimeoutMs = 1000;
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1, reason: invalid class name */
    @e(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {67}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements B5.e {
        final /* synthetic */ OnConstraintsStateChangedListener $listener;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ WorkConstraintsTracker $this_listen;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, OnConstraintsStateChangedListener onConstraintsStateChangedListener, InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.$this_listen = workConstraintsTracker;
            this.$spec = workSpec;
            this.$listener = onConstraintsStateChangedListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return new AnonymousClass1(this.$this_listen, this.$spec, this.$listener, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super C1386y> interfaceC1524c) {
            return ((AnonymousClass1) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                AbstractC1362a.e(obj);
                InterfaceC0397h interfaceC0397hTrack = this.$this_listen.track(this.$spec);
                final OnConstraintsStateChangedListener onConstraintsStateChangedListener = this.$listener;
                final WorkSpec workSpec = this.$spec;
                InterfaceC0398i interfaceC0398i = new InterfaceC0398i() { // from class: androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object emit(ConstraintsState constraintsState, InterfaceC1524c<? super C1386y> interfaceC1524c) {
                        onConstraintsStateChangedListener.onConstraintsStateChanged(workSpec, constraintsState);
                        return C1386y.f15098a;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    @Override // P5.InterfaceC0398i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC1524c interfaceC1524c) {
                        return emit((ConstraintsState) obj2, (InterfaceC1524c<? super C1386y>) interfaceC1524c);
                    }
                };
                this.label = 1;
                Object objCollect = interfaceC0397hTrack.collect(interfaceC0398i, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objCollect == enumC1580a) {
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
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        m.d(strTagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = strTagWithPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NetworkRequestConstraintController NetworkRequestConstraintController(Context context) {
        m.e(context, "context");
        Object systemService = context.getSystemService("connectivity");
        m.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new NetworkRequestConstraintController((ConnectivityManager) systemService, 0L, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0241b0 listen(WorkConstraintsTracker workConstraintsTracker, WorkSpec spec, AbstractC0257s dispatcher, OnConstraintsStateChangedListener listener) {
        m.e(workConstraintsTracker, "<this>");
        m.e(spec, "spec");
        m.e(dispatcher, "dispatcher");
        m.e(listener, "listener");
        return AbstractC0263y.t(AbstractC0263y.a(dispatcher), null, null, new AnonymousClass1(workConstraintsTracker, spec, listener, null), 3);
    }
}
