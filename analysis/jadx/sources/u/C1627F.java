package u;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: u.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1627F extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ float f16773q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1627F c1627f = new C1627F(2, interfaceC1524c);
        c1627f.f16773q = ((Number) obj).floatValue();
        return c1627f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1627F) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        return Boolean.valueOf(this.f16773q > 0.0f);
    }
}
