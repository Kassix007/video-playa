package c;

import kotlin.jvm.internal.u;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: c.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0708f extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f10057q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708f(u uVar, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f10057q = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0708f c0708f = new C0708f(this.f10057q, (InterfaceC1524c) obj3);
        C1386y c1386y = C1386y.f15098a;
        c0708f.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        this.f10057q.f14264q = true;
        return C1386y.f15098a;
    }
}
