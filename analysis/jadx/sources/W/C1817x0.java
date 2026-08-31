package w;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1817x0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1821z0 f18102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f18103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f18104t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817x0(C1821z0 c1821z0, float f, float f7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18102r = c1821z0;
        this.f18103s = f;
        this.f18104t = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1817x0(this.f18102r, this.f18103s, this.f18104t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1817x0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18101q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            H0 h02 = this.f18102r.f18124T;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f18103s)) << 32) | (((long) Float.floatToRawIntBits(this.f18104t)) & 4294967295L);
            this.f18101q = 1;
            Object objA = AbstractC1802p0.a(h02, jFloatToRawIntBits, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objA == enumC1580a) {
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
