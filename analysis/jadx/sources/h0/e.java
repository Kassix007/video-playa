package H0;

import C0.S;
import i0.C1130b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f2053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f2054s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2054s = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        e eVar = new e(this.f2054s, interfaceC1524c);
        eVar.f2053r = ((Number) obj).floatValue();
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2052q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            float f = this.f2053r;
            f fVar = this.f2054s;
            I0.i iVar = fVar.f2055a.f2268d;
            Object objG = iVar.f2257q.g(I0.h.f2238e);
            if (objG == null) {
                objG = null;
            }
            B5.e eVar = (B5.e) objG;
            if (eVar == null) {
                throw S.i("Required value was null.");
            }
            C1130b c1130b = new C1130b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.f2052q = 1;
            obj = eVar.invoke(c1130b, this);
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
        return new Float(Float.intBitsToFloat((int) (((C1130b) obj).f13520a & 4294967295L)));
    }
}
