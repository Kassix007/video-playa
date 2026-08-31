package R4;

import com.web2native.OrufyConnectHandlerUtil;
import m5.C1386y;

/* JADX INFO: renamed from: R4.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0464j1 implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7033r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0464j1(C0468k1 c0468k1, int i) {
        this.f7032q = i;
        this.f7033r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        T1.d dVarA;
        switch (this.f7032q) {
            case 0:
                Object systemService = this.f7033r.f7067a.getSystemService("bluetooth");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                break;
            case 1:
                C0468k1 c0468k1 = this.f7033r;
                OrufyConnectHandlerUtil orufyConnectHandlerUtil = c0468k1.f7052L;
                if (orufyConnectHandlerUtil != null) {
                    orufyConnectHandlerUtil.showConversation(c0468k1.f7067a);
                }
                break;
            case 2:
                V v6 = this.f7033r.f7093o0;
                break;
            default:
                C0468k1 c0468k12 = this.f7033r;
                T1.u uVar = c0468k12.f7075e;
                if (((uVar == null || (dVarA = uVar.a()) == null) ? null : dVarA.f7354r) == null) {
                    c0468k12.f7067a.finish();
                }
                T1.u uVar2 = c0468k12.f7075e;
                if (uVar2 != null) {
                    uVar2.c();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
