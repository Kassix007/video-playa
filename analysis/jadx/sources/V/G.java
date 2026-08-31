package v;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y.i f17238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y.h f17239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M5.J f17240t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(y.i iVar, y.h hVar, M5.J j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17238r = iVar;
        this.f17239s = hVar;
        this.f17240t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new G(this.f17238r, this.f17239s, this.f17240t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17237q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f17237q = 1;
            Object objA = this.f17238r.a(this.f17239s, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objA == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        M5.J j = this.f17240t;
        if (j != null) {
            j.a();
        }
        return C1386y.f15098a;
    }
}
