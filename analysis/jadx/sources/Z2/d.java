package Z2;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import R4.C0458i;
import R4.C0468k1;
import R4.P0;
import T1.p;
import T1.u;
import U4.C0550q;
import android.webkit.CookieManager;
import android.webkit.WebView;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0550q f8414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f8415s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0550q c0550q, String str, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8414r = c0550q;
        this.f8415s = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        d dVar = new d(this.f8414r, this.f8415s, interfaceC1524c);
        dVar.f8413q = obj;
        return dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        dVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        P0 p02;
        T1.d dVarA;
        p pVar;
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f8413q;
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f8414r.f7851b;
        u uVar = c0468k1.f7075e;
        if (!m.a((uVar == null || (dVarA = uVar.a()) == null || (pVar = dVarA.f7354r) == null) ? null : (String) pVar.f7404r.f8095e, "splashScreen") && (str = this.f8415s) != null) {
            C0458i c0458i = c0468k1.f7073d;
            if (c0458i == null || (p02 = c0458i.f6989N) == null || (str2 = p02.f) == null) {
                str2 = "handleCredentialResponse";
            }
            WebView webView = c0468k1.f7084k;
            if (webView != null) {
                webView.evaluateJavascript("window." + str2 + "({credential:'" + str + "'})", null);
            }
            CookieManager.getInstance().flush();
            u uVar2 = c0468k1.f7075e;
            if (uVar2 != null) {
                uVar2.c();
            }
            AbstractC0263y.e(interfaceC0261w, null);
        }
        return C1386y.f15098a;
    }
}
