package t2;

import M5.InterfaceC0261w;
import android.graphics.Bitmap;
import java.util.ArrayList;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D2.j f16709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f16710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E2.h f16711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1618c f16712u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bitmap f16713v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(D2.j jVar, l lVar, E2.h hVar, C1618c c1618c, Bitmap bitmap, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16709r = jVar;
        this.f16710s = lVar;
        this.f16711t = hVar;
        this.f16712u = c1618c;
        this.f16713v = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new k(this.f16709r, this.f16710s, this.f16711t, this.f16712u, this.f16713v, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f16708q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        ArrayList arrayList = this.f16710s.f16720h;
        boolean z5 = this.f16713v != null;
        D2.j jVar = this.f16709r;
        M2.k kVar = new M2.k(jVar, arrayList, 0, jVar, this.f16711t, this.f16712u, z5);
        this.f16708q = 1;
        Object objB = kVar.b(jVar, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objB == enumC1580a ? enumC1580a : objB;
    }
}
