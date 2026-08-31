package w;

import M5.AbstractC0263y;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class T extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O5.i f17854s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(O5.i iVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17854s = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        T t6 = new T(this.f17854s, interfaceC1524c);
        t6.f17853r = obj;
        return t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0004 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        ?? r02 = this.f17852q;
        try {
            if (r02 == 0) {
                AbstractC1362a.e(obj);
                M5.B bT = AbstractC0263y.t((InterfaceC0261w) this.f17853r, null, null, new S(2, null), 3);
                O5.i iVar = this.f17854s;
                this.f17853r = bT;
                this.f17852q = 1;
                obj = iVar.h(this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                r02 = bT;
                if (obj == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (r02 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) this.f17853r;
                AbstractC1362a.e(obj);
                r02 = interfaceC0241b0;
            }
            return (Q) obj;
        } finally {
            r02.a(null);
        }
    }
}
