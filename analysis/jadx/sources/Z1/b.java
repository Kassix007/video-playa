package Z1;

import B5.e;
import M5.InterfaceC0261w;
import android.net.Uri;
import android.view.InputEvent;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f8397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f8398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InputEvent f8399t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8397r = dVar;
        this.f8398s = uri;
        this.f8399t = inputEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new b(this.f8397r, this.f8398s, this.f8399t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f8396q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            a2.e eVar = this.f8397r.f8403a;
            this.f8396q = 1;
            Object objF = eVar.f(this.f8398s, this.f8399t, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objF == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
