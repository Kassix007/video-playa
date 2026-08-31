package U4;

import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import android.os.Handler;
import android.os.Looper;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7742q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7742q = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new H(this.f7742q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        H h4 = (H) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        h4.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f7742q;
        C0458i c0458i = c0468k1.f7073d;
        if (c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6994S, Boolean.TRUE) : false) {
            new Handler(Looper.getMainLooper()).postDelayed(new G(c0468k1, 0), 0L);
        }
        return C1386y.f15098a;
    }
}
