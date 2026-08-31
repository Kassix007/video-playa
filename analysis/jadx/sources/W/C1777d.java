package w;

import P.C0345b;
import P.InterfaceC0360i0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m5.C1386y;
import v0.C1743l;

/* JADX INFO: renamed from: w.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1777d extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1777d f17939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1777d f17940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1777d f17941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1777d f17942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1777d f17943v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17944q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f17939r = new C1777d(i, 0);
        f17940s = new C1777d(i, 1);
        f17941t = new C1777d(i, 2);
        f17942u = new C1777d(i, 3);
        f17943v = new C1777d(i, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1777d(int i, int i7) {
        super(i);
        this.f17944q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f17944q) {
            case 0:
                InterfaceC0360i0 interfaceC0360i0 = (InterfaceC0360i0) obj;
                P.T0 t02 = AndroidCompositionLocals_androidKt.f9341b;
                interfaceC0360i0.getClass();
                if (((Context) C0345b.r(interfaceC0360i0, t02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC1781f.f17960b;
                }
                InterfaceC1775c.f17931a.getClass();
                return C1773b.f17920c;
            case 1:
                return Boolean.TRUE;
            case 2:
                ((Number) obj).longValue();
                return C1386y.f15098a;
            case 3:
                return Boolean.valueOf(!(((C1743l) obj).i == 2));
            default:
                ((Number) obj).floatValue();
                return C1386y.f15098a;
        }
    }
}
