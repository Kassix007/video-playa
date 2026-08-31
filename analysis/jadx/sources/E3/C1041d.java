package e3;

import M5.AbstractC0263y;
import M5.l0;
import P.C0354f0;
import a3.C0632k;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: e3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1041d extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1044g f12558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f12560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0632k f12561u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f12562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnumC1050m f12563w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041d(C1044g c1044g, int i, float f, C0632k c0632k, float f7, EnumC1050m enumC1050m, InterfaceC1524c interfaceC1524c) {
        super(1, interfaceC1524c);
        this.f12558r = c1044g;
        this.f12559s = i;
        this.f12560t = f;
        this.f12561u = c0632k;
        this.f12562v = f7;
        this.f12563w = enumC1050m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new C1041d(this.f12558r, this.f12559s, this.f12560t, this.f12561u, this.f12562v, this.f12563w, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        return ((C1041d) create((InterfaceC1524c) obj)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1529h interfaceC1529h;
        int i = this.f12557q;
        C1386y c1386y = C1386y.f15098a;
        C1044g c1044g = this.f12558r;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                c1044g.f(this.f12559s);
                C0354f0 c0354f0 = c1044g.f12573q;
                c1044g.f12575s.setValue(Integer.MAX_VALUE);
                C0354f0 c0354f02 = c1044g.f12576t;
                Boolean bool = Boolean.FALSE;
                c0354f02.setValue(bool);
                C0354f0 c0354f03 = c1044g.f12578v;
                float f = this.f12560t;
                c0354f03.setValue(Float.valueOf(f));
                c1044g.f12577u.setValue(null);
                C0354f0 c0354f04 = c1044g.f12581y;
                C0632k c0632k = this.f12561u;
                c0354f04.setValue(c0632k);
                c1044g.g(this.f12562v);
                c1044g.f12579w.setValue(bool);
                c1044g.f12570B.setValue(Long.MIN_VALUE);
                if (c0632k == null) {
                    c0354f0.setValue(bool);
                    return c1386y;
                }
                if (Float.isInfinite(f)) {
                    c1044g.g(c1044g.d());
                    c0354f0.setValue(bool);
                    c1044g.f(Integer.MAX_VALUE);
                    return c1386y;
                }
                c0354f0.setValue(Boolean.TRUE);
                int iOrdinal = this.f12563w.ordinal();
                if (iOrdinal == 0) {
                    interfaceC1529h = C1530i.f16022q;
                } else {
                    if (iOrdinal != 1) {
                        throw new C2.e();
                    }
                    interfaceC1529h = l0.f3870q;
                }
                C1040c c1040c = new C1040c(this.f12563w, AbstractC0263y.n(getContext()), this.f12559s, this.f12558r, null);
                this.f12557q = 1;
                Object objB = AbstractC0263y.B(interfaceC1529h, c1040c, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objB == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            AbstractC0263y.i(getContext());
            C1044g.c(c1044g, false);
            return c1386y;
        } catch (Throwable th) {
            C1044g.c(c1044g, false);
            throw th;
        }
    }
}
