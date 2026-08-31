package H0;

import M5.InterfaceC0261w;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import j0.AbstractC1145B;
import java.util.function.Consumer;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f2036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f2037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Rect f2038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Consumer f2039u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2036r = fVar;
        this.f2037s = scrollCaptureSession;
        this.f2038t = rect;
        this.f2039u = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new b(this.f2036r, this.f2037s, this.f2038t, this.f2039u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2035q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            ScrollCaptureSession scrollCaptureSession = this.f2037s;
            Rect rect = this.f2038t;
            W0.j jVar = new W0.j(rect.left, rect.top, rect.right, rect.bottom);
            this.f2035q = 1;
            obj = f.a(this.f2036r, scrollCaptureSession, jVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (obj == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        this.f2039u.accept(AbstractC1145B.t((W0.j) obj));
        return C1386y.f15098a;
    }
}
