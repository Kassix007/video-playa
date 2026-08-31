package v;

import C0.AbstractC0103t0;
import P.C0345b;
import P.InterfaceC0360i0;
import P.T0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f17377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f17378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f17379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f17380u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17381q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f17377r = new r(i, 0);
        f17378s = new r(i, 1);
        f17379t = new r(i, 2);
        f17380u = new r(i, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i7) {
        super(i);
        this.f17381q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f17381q;
        C1386y c1386y = C1386y.f15098a;
        switch (i) {
            case 0:
                ((B0.N) obj).a();
                return c1386y;
            case 1:
                return c1386y;
            case 2:
                InterfaceC0360i0 interfaceC0360i0 = (InterfaceC0360i0) obj;
                int i7 = AbstractC1719n.f17365a;
                T0 t02 = AndroidCompositionLocals_androidKt.f9341b;
                interfaceC0360i0.getClass();
                Context context = (Context) C0345b.r(interfaceC0360i0, t02);
                W0.c cVar = (W0.c) C0345b.r(interfaceC0360i0, AbstractC0103t0.f1116h);
                b0 b0Var = (b0) C0345b.r(interfaceC0360i0, c0.f17315a);
                if (b0Var == null) {
                    return null;
                }
                return new C1718m(context, cVar, b0Var.f17308a, b0Var.f17309b);
            default:
                I0.e eVar = I0.e.f2227c;
                H5.k[] kVarArr = I0.r.f2326a;
                I0.s sVar = I0.p.f2304c;
                H5.k kVar = I0.r.f2326a[1];
                sVar.a((I0.i) obj, eVar);
                return c1386y;
        }
    }
}
