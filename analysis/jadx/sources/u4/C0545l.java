package U4;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;
import w.g1;

/* JADX INFO: renamed from: U4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0545l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7841s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0545l(int i, Object obj, Object obj2) {
        this.f7839q = i;
        this.f7840r = obj;
        this.f7841s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1746o interfaceC1746o, InterfaceC1524c interfaceC1524c) {
        switch (this.f7839q) {
            case 0:
                Object objD = g1.d(interfaceC1746o, null, new C0542i((P.W) this.f7840r, (P.W) this.f7841s, 1), interfaceC1524c, 7);
                if (objD != EnumC1580a.f16356q) {
                    break;
                }
                break;
            default:
                Object objD2 = g1.d(interfaceC1746o, null, new N5.d(9, (a5.c) this.f7840r, (B5.c) this.f7841s), interfaceC1524c, 7);
                if (objD2 != EnumC1580a.f16356q) {
                    break;
                }
                break;
        }
        return C1386y.f15098a;
    }
}
