package Q5;

import M5.InterfaceC0261w;
import P5.InterfaceC0397h;
import java.util.concurrent.atomic.AtomicInteger;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class s extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h[] f6645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f6647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O5.e f6648u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC0397h[] interfaceC0397hArr, int i, AtomicInteger atomicInteger, O5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6645r = interfaceC0397hArr;
        this.f6646s = i;
        this.f6647t = atomicInteger;
        this.f6648u = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new s(this.f6645r, this.f6646s, this.f6647t, this.f6648u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6644q;
        AtomicInteger atomicInteger = this.f6647t;
        O5.e eVar = this.f6648u;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                InterfaceC0397h[] interfaceC0397hArr = this.f6645r;
                int i7 = this.f6646s;
                InterfaceC0397h interfaceC0397h = interfaceC0397hArr[i7];
                r rVar = new r(eVar, i7);
                this.f6644q = 1;
                Object objCollect = interfaceC0397h.collect(rVar, this);
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
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.f(null);
            }
            return C1386y.f15098a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.f(null);
            }
        }
    }
}
