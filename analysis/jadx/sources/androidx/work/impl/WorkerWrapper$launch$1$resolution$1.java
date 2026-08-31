package androidx.work.impl;

import M5.InterfaceC0261w;
import androidx.work.impl.WorkerWrapper;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
@s5.e(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
public final class WorkerWrapper$launch$1$resolution$1 extends i implements B5.e {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1$resolution$1(WorkerWrapper workerWrapper, InterfaceC1524c<? super WorkerWrapper$launch$1$resolution$1> interfaceC1524c) {
        super(2, interfaceC1524c);
        this.this$0 = workerWrapper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
        return new WorkerWrapper$launch$1$resolution$1(this.this$0, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // B5.e
    public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super WorkerWrapper.Resolution> interfaceC1524c) {
        return ((WorkerWrapper$launch$1$resolution$1) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
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
        WorkerWrapper workerWrapper = this.this$0;
        this.label = 1;
        Object objRunWorker = workerWrapper.runWorker(this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objRunWorker == enumC1580a ? enumC1580a : objRunWorker;
    }
}
