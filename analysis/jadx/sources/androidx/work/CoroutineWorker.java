package androidx.work;

import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.H;
import M5.InterfaceC0261w;
import a.AbstractC0597a;
import android.content.Context;
import androidx.work.ListenableWorker;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import m5.InterfaceC1364c;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final AbstractC0257s coroutineContext;
    private final WorkerParameters params;

    public static final class DeprecatedDispatcher extends AbstractC0257s {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        private static final AbstractC0257s dispatcher = H.f3811a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private DeprecatedDispatcher() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // M5.AbstractC0257s
        public void dispatch(InterfaceC1529h context, Runnable block) {
            m.e(context, "context");
            m.e(block, "block");
            dispatcher.dispatch(context, block);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AbstractC0257s getDispatcher() {
            return dispatcher;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // M5.AbstractC0257s
        public boolean isDispatchNeeded(InterfaceC1529h context) {
            m.e(context, "context");
            return dispatcher.isDispatchNeeded(context);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    @e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements B5.e {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AnonymousClass1(InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(2, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return CoroutineWorker.this.new AnonymousClass1(interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super ForegroundInfo> interfaceC1524c) {
            return ((AnonymousClass1) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
                return obj;
            }
            AbstractC1362a.e(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            return foregroundInfo == enumC1580a ? enumC1580a : foregroundInfo;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    public static final class C06691 extends i implements B5.e {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C06691(InterfaceC1524c<? super C06691> interfaceC1524c) {
            super(2, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return CoroutineWorker.this.new C06691(interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super ListenableWorker.Result> interfaceC1524c) {
            return ((C06691) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
                return obj;
            }
            AbstractC1362a.e(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            return objDoWork == enumC1580a ? enumC1580a : objDoWork;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        m.e(appContext, "appContext");
        m.e(params, "params");
        this.params = params;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    @InterfaceC1364c
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC1524c<? super ForegroundInfo> interfaceC1524c) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC1524c<? super ListenableWorker.Result> interfaceC1524c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0257s getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getForegroundInfo(InterfaceC1524c<? super ForegroundInfo> interfaceC1524c) {
        return getForegroundInfo$suspendImpl(this, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.ListenableWorker
    public final I4.b getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(AbstractC0263y.b()), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object setForeground(ForegroundInfo foregroundInfo, InterfaceC1524c<? super C1386y> interfaceC1524c) throws Throwable {
        I4.b foregroundAsync = setForegroundAsync(foregroundInfo);
        m.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        Object objF = AbstractC0597a.f(foregroundAsync, interfaceC1524c);
        return objF == EnumC1580a.f16356q ? objF : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object setProgress(Data data, InterfaceC1524c<? super C1386y> interfaceC1524c) throws Throwable {
        I4.b progressAsync = setProgressAsync(data);
        m.d(progressAsync, "setProgressAsync(data)");
        Object objF = AbstractC0597a.f(progressAsync, interfaceC1524c);
        return objF == EnumC1580a.f16356q ? objF : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.ListenableWorker
    public final I4.b startWork() {
        InterfaceC1529h coroutineContext = !m.a(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        m.d(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(AbstractC0263y.b()), null, new C06691(null), 2, null);
    }
}
