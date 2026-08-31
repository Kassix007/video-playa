package m;

import l.InterfaceC1195B;

/* JADX INFO: renamed from: m.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1253F extends AbstractViewOnTouchListenerC1331s0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1271O f14651A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C1265L f14652z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253F(C1271O c1271o, C1271O c1271o2, C1265L c1265l) {
        super(c1271o2);
        this.f14651A = c1271o;
        this.f14652z = c1265l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractViewOnTouchListenerC1331s0
    public final InterfaceC1195B b() {
        return this.f14652z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractViewOnTouchListenerC1331s0
    public final boolean c() {
        C1271O c1271o = this.f14651A;
        if (c1271o.getInternalPopup().a()) {
            return true;
        }
        c1271o.f14695v.k(c1271o.getTextDirection(), c1271o.getTextAlignment());
        return true;
    }
}
