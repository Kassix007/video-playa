package U2;

import I2.w;
import M5.InterfaceC0241b0;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0660x;
import m5.C1386y;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements o, InterfaceC0643f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0654q f7683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0241b0 f7684r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(AbstractC0654q abstractC0654q, InterfaceC0241b0 interfaceC0241b0) {
        this.f7683q = abstractC0654q;
        this.f7684r = interfaceC0241b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U2.o
    public final void a() {
        this.f7683q.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void c(InterfaceC0660x interfaceC0660x) {
        this.f7684r.a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U2.o
    public final Object d(w wVar) throws Throwable {
        Object objN = D5.a.n(this.f7683q, wVar);
        return objN == EnumC1580a.f16356q ? objN : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U2.o
    public final void start() {
        this.f7683q.a(this);
    }
}
