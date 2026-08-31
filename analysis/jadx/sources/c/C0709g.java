package c;

import M5.InterfaceC0261w;
import P5.C0393d;
import P5.C0403n;
import com.google.android.gms.internal.measurement.O1;
import kotlin.jvm.internal.u;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: c.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u f10058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0710h f10060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.e f10061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O1 f10062u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709g(C0710h c0710h, B5.e eVar, O1 o12, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f10060s = c0710h;
        this.f10061t = eVar;
        this.f10062u = o12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0709g(this.f10060s, this.f10061t, this.f10062u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0709g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        int i = this.f10059r;
        boolean z5 = true;
        if (i == 0) {
            AbstractC1362a.e(obj);
            if (this.f10060s.f9909a) {
                uVar = new u();
                C0403n c0403n = new C0403n(new C0393d((O5.e) this.f10062u.f10680b, z5), new C0708f(uVar, null));
                this.f10058q = uVar;
                this.f10059r = 1;
                Object objInvoke = this.f10061t.invoke(c0403n, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objInvoke == enumC1580a) {
                    return enumC1580a;
                }
            }
            return C1386y.f15098a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uVar = this.f10058q;
        AbstractC1362a.e(obj);
        if (!uVar.f14264q) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return C1386y.f15098a;
    }
}
