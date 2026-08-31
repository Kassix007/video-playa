package M5;

import m5.AbstractC1362a;
import m5.AbstractC1374m;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: M5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0238a extends i0 implements InterfaceC1524c, InterfaceC0261w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1529h f3835s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0238a(InterfaceC1529h interfaceC1529h, boolean z5) {
        super(z5);
        I((InterfaceC0241b0) interfaceC1529h.get(C0258t.f3885r));
        this.f3835s = interfaceC1529h.plus(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final void H(C2.e eVar) {
        AbstractC0263y.p(eVar, this.f3835s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final void S(Object obj) {
        if (!(obj instanceof C0255p)) {
            c0(obj);
            return;
        }
        C0255p c0255p = (C0255p) obj;
        b0(C0255p.f3877b.get(c0255p) == 1, c0255p.f3878a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0261w
    public final InterfaceC1529h d() {
        return this.f3835s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(EnumC0262x enumC0262x, AbstractC0238a abstractC0238a, B5.e eVar) {
        Object objInvoke;
        int iOrdinal = enumC0262x.ordinal();
        C1386y c1386y = C1386y.f15098a;
        if (iOrdinal == 0) {
            try {
                R5.b.h(c1386y, AbstractC1397A.v(AbstractC1397A.p(eVar, abstractC0238a, this)));
                return;
            } finally {
                th = th;
                if (th instanceof D) {
                    th = ((D) th).f3807q;
                }
                resumeWith(AbstractC1362a.b(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.m.e(eVar, "<this>");
                AbstractC1397A.v(AbstractC1397A.p(eVar, abstractC0238a, this)).resumeWith(c1386y);
                return;
            }
            if (iOrdinal != 3) {
                throw new C2.e();
            }
            try {
                InterfaceC1529h interfaceC1529h = this.f3835s;
                Object objN = R5.b.n(interfaceC1529h, null);
                try {
                    if (eVar instanceof s5.a) {
                        kotlin.jvm.internal.B.b(2, eVar);
                        objInvoke = eVar.invoke(abstractC0238a, this);
                    } else {
                        objInvoke = AbstractC1397A.G(eVar, abstractC0238a, this);
                    }
                    R5.b.g(interfaceC1529h, objN);
                    if (objInvoke != EnumC1580a.f16356q) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    R5.b.g(interfaceC1529h, objN);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f3835s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        Throwable thA = AbstractC1374m.a(obj);
        if (thA != null) {
            obj = new C0255p(false, thA);
        }
        Object objO = O(obj);
        if (objO == AbstractC0263y.f3905e) {
            return;
        }
        p(objO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final String w() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void c0(Object obj) {
    }

    public void b0(boolean z5, Throwable th) {
    }
}
