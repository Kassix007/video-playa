package e5;

import R4.C0468k1;
import R4.C0524y2;
import T1.u;
import android.graphics.Color;
import android.webkit.WebView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c0.C0722j;
import j0.AbstractC1145B;
import kotlin.jvm.internal.m;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;
import w.g1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements PointerInputEventHandler {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.a f12658t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(C0468k1 c0468k1, C1057b c1057b, B5.a aVar, int i) {
        this.f12655q = i;
        this.f12656r = c0468k1;
        this.f12657s = c1057b;
        this.f12658t = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1746o interfaceC1746o, InterfaceC1524c interfaceC1524c) {
        switch (this.f12655q) {
            case 0:
                final C0468k1 c0468k1 = (C0468k1) this.f12656r;
                final C1057b c1057b = (C1057b) this.f12657s;
                final int i = 0;
                final B5.a aVar = this.f12658t;
                final int i7 = 1;
                Object objD = g1.d(interfaceC1746o, new B5.c() { // from class: e5.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        switch (i) {
                            case 0:
                                Q2.g.j(c0468k1, c1057b, new d(aVar, 0));
                                break;
                            case 1:
                                androidx.compose.foundation.a.a(C0722j.f10095q, AbstractC1145B.b(Color.parseColor("#FFFFFF")), AbstractC1145B.f13658a);
                                C0468k1 c0468k12 = c0468k1;
                                C1056a c1056a = new C1056a(c0468k12.f7071c);
                                C1057b c1057b2 = c1057b;
                                String str = c1057b2.f12643a;
                                m.b(str);
                                c1056a.b(str);
                                String str2 = c1057b2.f;
                                if (str2 == null || str2.equals("")) {
                                    aVar.invoke();
                                } else {
                                    WebView webView = c0468k12.f7084k;
                                    if (webView != null) {
                                        webView.loadUrl(str2.toString());
                                    }
                                    u uVar = c0468k12.f7075e;
                                    if (uVar != null) {
                                        uVar.c();
                                    }
                                }
                                return C1386y.f15098a;
                            case 2:
                                Q2.g.j(c0468k1, c1057b, new d(aVar, 1));
                                break;
                            default:
                                C0468k1 c0468k13 = c0468k1;
                                C1056a c1056a2 = new C1056a(c0468k13.f7071c);
                                C1057b c1057b3 = c1057b;
                                String str3 = c1057b3.f12643a;
                                m.b(str3);
                                c1056a2.b(str3);
                                String str4 = c1057b3.f;
                                if (str4 == null || str4.equals("")) {
                                    aVar.invoke();
                                } else {
                                    WebView webView2 = c0468k13.f7084k;
                                    if (webView2 != null) {
                                        webView2.loadUrl(str4.toString());
                                    }
                                    u uVar2 = c0468k13.f7075e;
                                    if (uVar2 != null) {
                                        uVar2.c();
                                    }
                                }
                                return C1386y.f15098a;
                        }
                        return C1386y.f15098a;
                    }
                }, new B5.c() { // from class: e5.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        switch (i7) {
                            case 0:
                                Q2.g.j(c0468k1, c1057b, new d(aVar, 0));
                                break;
                            case 1:
                                androidx.compose.foundation.a.a(C0722j.f10095q, AbstractC1145B.b(Color.parseColor("#FFFFFF")), AbstractC1145B.f13658a);
                                C0468k1 c0468k12 = c0468k1;
                                C1056a c1056a = new C1056a(c0468k12.f7071c);
                                C1057b c1057b2 = c1057b;
                                String str = c1057b2.f12643a;
                                m.b(str);
                                c1056a.b(str);
                                String str2 = c1057b2.f;
                                if (str2 == null || str2.equals("")) {
                                    aVar.invoke();
                                } else {
                                    WebView webView = c0468k12.f7084k;
                                    if (webView != null) {
                                        webView.loadUrl(str2.toString());
                                    }
                                    u uVar = c0468k12.f7075e;
                                    if (uVar != null) {
                                        uVar.c();
                                    }
                                }
                                return C1386y.f15098a;
                            case 2:
                                Q2.g.j(c0468k1, c1057b, new d(aVar, 1));
                                break;
                            default:
                                C0468k1 c0468k13 = c0468k1;
                                C1056a c1056a2 = new C1056a(c0468k13.f7071c);
                                C1057b c1057b3 = c1057b;
                                String str3 = c1057b3.f12643a;
                                m.b(str3);
                                c1056a2.b(str3);
                                String str4 = c1057b3.f;
                                if (str4 == null || str4.equals("")) {
                                    aVar.invoke();
                                } else {
                                    WebView webView2 = c0468k13.f7084k;
                                    if (webView2 != null) {
                                        webView2.loadUrl(str4.toString());
                                    }
                                    u uVar2 = c0468k13.f7075e;
                                    if (uVar2 != null) {
                                        uVar2.c();
                                    }
                                }
                                return C1386y.f15098a;
                        }
                        return C1386y.f15098a;
                    }
                }, interfaceC1524c, 5);
                if (objD != EnumC1580a.f16356q) {
                    break;
                }
                break;
            case 1:
                final C0468k1 c0468k12 = (C0468k1) this.f12656r;
                final C1057b c1057b2 = (C1057b) this.f12657s;
                final int i8 = 2;
                final B5.a aVar2 = this.f12658t;
                final int i9 = 3;
                Object objD2 = g1.d(interfaceC1746o, new B5.c() { // from class: e5.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        switch (i8) {
                            case 0:
                                Q2.g.j(c0468k12, c1057b2, new d(aVar2, 0));
                                break;
                            case 1:
                                androidx.compose.foundation.a.a(C0722j.f10095q, AbstractC1145B.b(Color.parseColor("#FFFFFF")), AbstractC1145B.f13658a);
                                C0468k1 c0468k122 = c0468k12;
                                C1056a c1056a = new C1056a(c0468k122.f7071c);
                                C1057b c1057b22 = c1057b2;
                                String str = c1057b22.f12643a;
                                m.b(str);
                                c1056a.b(str);
                                String str2 = c1057b22.f;
                                if (str2 == null || str2.equals("")) {
                                    aVar2.invoke();
                                } else {
                                    WebView webView = c0468k122.f7084k;
                                    if (webView != null) {
                                        webView.loadUrl(str2.toString());
                                    }
                                    u uVar = c0468k122.f7075e;
                                    if (uVar != null) {
                                        uVar.c();
                                    }
                                }
                                return C1386y.f15098a;
                            case 2:
                                Q2.g.j(c0468k12, c1057b2, new d(aVar2, 1));
                                break;
                            default:
                                C0468k1 c0468k13 = c0468k12;
                                C1056a c1056a2 = new C1056a(c0468k13.f7071c);
                                C1057b c1057b3 = c1057b2;
                                String str3 = c1057b3.f12643a;
                                m.b(str3);
                                c1056a2.b(str3);
                                String str4 = c1057b3.f;
                                if (str4 == null || str4.equals("")) {
                                    aVar2.invoke();
                                } else {
                                    WebView webView2 = c0468k13.f7084k;
                                    if (webView2 != null) {
                                        webView2.loadUrl(str4.toString());
                                    }
                                    u uVar2 = c0468k13.f7075e;
                                    if (uVar2 != null) {
                                        uVar2.c();
                                    }
                                }
                                return C1386y.f15098a;
                        }
                        return C1386y.f15098a;
                    }
                }, new B5.c() { // from class: e5.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.c
                    public final Object invoke(Object obj) {
                        switch (i9) {
                            case 0:
                                Q2.g.j(c0468k12, c1057b2, new d(aVar2, 0));
                                break;
                            case 1:
                                androidx.compose.foundation.a.a(C0722j.f10095q, AbstractC1145B.b(Color.parseColor("#FFFFFF")), AbstractC1145B.f13658a);
                                C0468k1 c0468k122 = c0468k12;
                                C1056a c1056a = new C1056a(c0468k122.f7071c);
                                C1057b c1057b22 = c1057b2;
                                String str = c1057b22.f12643a;
                                m.b(str);
                                c1056a.b(str);
                                String str2 = c1057b22.f;
                                if (str2 == null || str2.equals("")) {
                                    aVar2.invoke();
                                } else {
                                    WebView webView = c0468k122.f7084k;
                                    if (webView != null) {
                                        webView.loadUrl(str2.toString());
                                    }
                                    u uVar = c0468k122.f7075e;
                                    if (uVar != null) {
                                        uVar.c();
                                    }
                                }
                                return C1386y.f15098a;
                            case 2:
                                Q2.g.j(c0468k12, c1057b2, new d(aVar2, 1));
                                break;
                            default:
                                C0468k1 c0468k13 = c0468k12;
                                C1056a c1056a2 = new C1056a(c0468k13.f7071c);
                                C1057b c1057b3 = c1057b2;
                                String str3 = c1057b3.f12643a;
                                m.b(str3);
                                c1056a2.b(str3);
                                String str4 = c1057b3.f;
                                if (str4 == null || str4.equals("")) {
                                    aVar2.invoke();
                                } else {
                                    WebView webView2 = c0468k13.f7084k;
                                    if (webView2 != null) {
                                        webView2.loadUrl(str4.toString());
                                    }
                                    u uVar2 = c0468k13.f7075e;
                                    if (uVar2 != null) {
                                        uVar2.c();
                                    }
                                }
                                return C1386y.f15098a;
                        }
                        return C1386y.f15098a;
                    }
                }, interfaceC1524c, 5);
                if (objD2 != EnumC1580a.f16356q) {
                    break;
                }
                break;
            default:
                Object objD3 = g1.d(interfaceC1746o, null, new C0524y2((a5.c) this.f12656r, this.f12658t, (B5.c) this.f12657s, 3), interfaceC1524c, 7);
                if (objD3 != EnumC1580a.f16356q) {
                    break;
                }
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public e(a5.c cVar, B5.a aVar, B5.c cVar2) {
        this.f12655q = 2;
        this.f12656r = cVar;
        this.f12658t = aVar;
        this.f12657s = cVar2;
    }
}
