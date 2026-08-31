package w;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H f17779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17780t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h4, long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17779s = h4;
        this.f17780t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        G g7 = new G(this.f17779s, this.f17780t, interfaceC1524c);
        g7.f17778r = obj;
        return g7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17777q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f17778r;
            H h4 = this.f17779s;
            B5.f fVar = h4.f17789S;
            long j = this.f17780t;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * 1.0f;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * 1.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
            EnumC1778d0 enumC1778d0 = h4.f17786P;
            e3.u uVar = D.f17754a;
            Float f = new Float(enumC1778d0 == EnumC1778d0.f17945q ? W0.p.c(jFloatToRawIntBits) : W0.p.b(jFloatToRawIntBits));
            this.f17777q = 1;
            Object objInvoke = fVar.invoke(interfaceC0261w, f, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objInvoke == enumC1580a) {
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
