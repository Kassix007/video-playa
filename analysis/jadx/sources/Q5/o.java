package Q5;

import M5.AbstractC0263y;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s5.i f6638u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.f */
    /* JADX WARN: Multi-variable type inference failed */
    public o(B5.f fVar, InterfaceC0397h interfaceC0397h, InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        super(interfaceC0397h, interfaceC1529h, i, aVar);
        this.f6638u = (s5.i) fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [B5.f, s5.i] */
    @Override // Q5.g
    public final g d(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return new o(this.f6638u, this.f6619t, interfaceC1529h, i, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.i
    public final Object g(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        Object objG = AbstractC0263y.g(new n(this, interfaceC0398i, null), interfaceC1524c);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }
}
