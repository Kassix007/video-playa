package Z4;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;
import w.g1;

/* JADX INFO: loaded from: classes.dex */
public final class E implements PointerInputEventHandler {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f8447r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ E(B5.a aVar, int i) {
        this.f8446q = i;
        this.f8447r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1746o interfaceC1746o, InterfaceC1524c interfaceC1524c) {
        switch (this.f8446q) {
            case 0:
                final int i = 0;
                final B5.a aVar = this.f8447r;
                Object objD = g1.d(interfaceC1746o, null, new B5.c() { // from class: Z4.D
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        switch (i) {
                            case 0:
                                aVar.invoke();
                                break;
                            default:
                                aVar.invoke();
                                break;
                        }
                        return C1386y.f15098a;
                    }
                }, interfaceC1524c, 7);
                if (objD != EnumC1580a.f16356q) {
                    break;
                }
                break;
            default:
                final int i7 = 1;
                final B5.a aVar2 = this.f8447r;
                Object objD2 = g1.d(interfaceC1746o, null, new B5.c() { // from class: Z4.D
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        switch (i7) {
                            case 0:
                                aVar2.invoke();
                                break;
                            default:
                                aVar2.invoke();
                                break;
                        }
                        return C1386y.f15098a;
                    }
                }, interfaceC1524c, 7);
                if (objD2 != EnumC1580a.f16356q) {
                    break;
                }
                break;
        }
        return C1386y.f15098a;
    }
}
