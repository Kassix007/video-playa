package P5;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class z extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h f6463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f6464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Float f6465u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC0397h interfaceC0397h, S s6, Float f, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6463s = interfaceC0397h;
        this.f6464t = s6;
        this.f6465u = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        z zVar = new z(this.f6463s, this.f6464t, this.f6465u, interfaceC1524c);
        zVar.f6462r = obj;
        return zVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((J) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6461q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            int iOrdinal = ((J) this.f6462r).ordinal();
            S s6 = this.f6464t;
            if (iOrdinal == 0) {
                this.f6461q = 1;
                Object objCollect = this.f6463s.collect(s6, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objCollect == enumC1580a) {
                    return enumC1580a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C2.e();
                }
                E4.f fVar = H.f6353a;
                Float f = this.f6465u;
                if (f == fVar) {
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                s6.h(null, f);
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
