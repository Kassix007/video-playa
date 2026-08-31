package androidx.work;

import M5.InterfaceC0261w;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.n;
import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
@e(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
public final class ListenableFutureKt$launchFuture$1$2 extends i implements B5.e {
    final /* synthetic */ B5.e $block;
    final /* synthetic */ k $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$launchFuture$1$2(B5.e eVar, k kVar, InterfaceC1524c<? super ListenableFutureKt$launchFuture$1$2> interfaceC1524c) {
        super(2, interfaceC1524c);
        this.$block = eVar;
        this.$completer = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, interfaceC1524c);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // B5.e
    public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return ((ListenableFutureKt$launchFuture$1$2) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.L$0;
                B5.e eVar = this.$block;
                this.label = 1;
                obj = eVar.invoke(interfaceC0261w, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (obj == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            this.$completer.a(obj);
        } catch (CancellationException unused) {
            k kVar = this.$completer;
            kVar.f9374d = true;
            n nVar = kVar.f9372b;
            if (nVar != null && nVar.f9377r.cancel(true)) {
                kVar.f9371a = null;
                kVar.f9372b = null;
                kVar.f9373c = null;
            }
        } catch (Throwable th) {
            this.$completer.b(th);
        }
        return C1386y.f15098a;
    }
}
