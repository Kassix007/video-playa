package b6;

import D.u;
import m5.AbstractC1362a;
import m5.C1363b;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s5.h implements B5.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ C1363b f10027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ U.l f10028t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(U.l lVar, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f10028t = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.f10028t, (InterfaceC1524c) obj3);
        gVar.f10027s = (C1363b) obj;
        return gVar.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        U.l lVar = this.f10028t;
        u uVar = (u) lVar.f7511r;
        C1363b c1363b = this.f10027s;
        int i = this.f10026r;
        if (i == 0) {
            AbstractC1362a.e(obj);
            byte bW = uVar.w();
            if (bW == 1) {
                return lVar.l(true);
            }
            if (bW == 0) {
                return lVar.l(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return lVar.k();
                }
                u.m(uVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f10027s = null;
            this.f10026r = 1;
            obj = U.l.b(lVar, c1363b, this);
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
        return (a6.l) obj;
    }
}
