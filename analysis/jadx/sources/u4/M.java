package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class M extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7752s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0468k1 c0468k1, P.W w3, P.W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7750q = c0468k1;
        this.f7751r = w3;
        this.f7752s = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new M(this.f7750q, this.f7751r, this.f7752s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        M m4 = (M) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        m4.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        final C0468k1 c0468k1;
        WebView webView;
        AbstractC1362a.e(obj);
        final P.W w3 = this.f7751r;
        if (((Number) w3.getValue()).intValue() > 200 && (webView = (c0468k1 = this.f7750q).f7084k) != null) {
            final P.W w6 = this.f7752s;
            webView.evaluateJavascript("(function() {var activeElement = document.activeElement;if(activeElement) {   var rect = activeElement.getBoundingClientRect();   return rect.bottom;} else {   return -1;}})()", new ValueCallback() { // from class: U4.L
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    String str = (String) obj2;
                    kotlin.jvm.internal.m.b(str);
                    Float fValueOf = null;
                    try {
                        if (J5.s.z0(str)) {
                            fValueOf = Float.valueOf(Float.parseFloat(str));
                        }
                    } catch (NumberFormatException unused) {
                    }
                    float fFloatValue = fValueOf != null ? fValueOf.floatValue() : -1.0f;
                    C0468k1 c0468k12 = c0468k1;
                    if (fFloatValue > 0.0f) {
                        fFloatValue += c0468k12.f7098t.f13883q.e();
                    }
                    if (fFloatValue > 500.0f) {
                        P.W w7 = w3;
                        if (((Number) w7.getValue()).intValue() != ((Number) w6.getValue()).intValue()) {
                            WebView webView2 = c0468k12.f7084k;
                            kotlin.jvm.internal.m.b(webView2);
                            if (webView2.getVisibility() == 0) {
                                WebView webView3 = c0468k12.f7084k;
                                kotlin.jvm.internal.m.b(webView3);
                                webView3.scrollBy(0, ((Number) w7.getValue()).intValue());
                            }
                        }
                    }
                }
            });
        }
        return C1386y.f15098a;
    }
}
