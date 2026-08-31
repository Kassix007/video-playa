package U4;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import android.webkit.WebView;
import k5.C1190b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7824r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C0468k1 c0468k1, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7824r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new g0(this.f7824r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.J j;
        int i = this.f7823q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f7823q = 1;
            Object objH = AbstractC0263y.h(200L, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objH == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        C0468k1 c0468k1 = this.f7824r;
        C0458i c0458i = c0468k1.f7073d;
        boolean zA = c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6992Q, Boolean.TRUE) : false;
        C1386y c1386y = C1386y.f15098a;
        if (zA) {
            C1190b c1190b = c0468k1.f7086l;
            if (c1190b != null && (j = c1190b.f14129c) != null) {
                j.e(c0468k1.f7069b, new R4.N(new C0548o(c0468k1, 4), 5));
                return c1386y;
            }
        } else if (c0468k1.f == -1) {
            WebView webView = c0468k1.f7084k;
            kotlin.jvm.internal.m.b(webView);
            if (webView.getProgress() < 70) {
                try {
                    AbstractC0534a.x(c0468k1);
                    return c1386y;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return c1386y;
                }
            }
            if (AbstractC0534a.f7792e) {
                AbstractC0534a.f7792e = false;
                AbstractC0534a.C(c0468k1);
            }
        } else if (AbstractC0534a.f7792e) {
            AbstractC0534a.f7792e = false;
            AbstractC0534a.C(c0468k1);
            return c1386y;
        }
        return c1386y;
    }
}
