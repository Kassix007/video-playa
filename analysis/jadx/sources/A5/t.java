package a5;

import M5.InterfaceC0261w;
import R4.N;
import androidx.lifecycle.J;
import com.web2native.MainActivity;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f8989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f8991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f8992t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, MainActivity mainActivity, kotlin.jvm.internal.y yVar2, kotlin.jvm.internal.y yVar3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8989q = yVar;
        this.f8990r = mainActivity;
        this.f8991s = yVar2;
        this.f8992t = yVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new t(this.f8989q, this.f8990r, this.f8991s, this.f8992t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        t tVar = (t) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        tVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        J j;
        AbstractC1362a.e(obj);
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        y yVar2 = this.f8989q;
        if (yVar2 != null && (j = yVar2.f9011e) != null) {
            j.e(this.f8990r, new N(new W1.e(yVar, this.f8991s, yVar2, this.f8992t, 3), 7));
        }
        return C1386y.f15098a;
    }
}
