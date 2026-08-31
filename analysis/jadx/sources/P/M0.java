package P;

import P5.InterfaceC0398i;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0364k0 f5342r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ M0(C0364k0 c0364k0, int i) {
        this.f5341q = i;
        this.f5342r = c0364k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        switch (this.f5341q) {
            case 0:
                this.f5342r.setValue(obj);
                break;
            default:
                this.f5342r.setValue(obj);
                break;
        }
        return C1386y.f15098a;
    }
}
