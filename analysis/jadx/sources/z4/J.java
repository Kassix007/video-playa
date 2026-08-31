package Z4;

import P.W;
import android.webkit.WebView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;
import w.g1;

/* JADX INFO: loaded from: classes.dex */
public final class J implements PointerInputEventHandler {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W f8470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ WebView f8471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M f8472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f8473t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J(W w3, WebView webView, M m4, W w6) {
        this.f8470q = w3;
        this.f8471r = webView;
        this.f8472s = m4;
        this.f8473t = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1746o interfaceC1746o, InterfaceC1524c interfaceC1524c) {
        Object objD = g1.d(interfaceC1746o, null, new W1.e(this.f8470q, this.f8471r, this.f8472s, this.f8473t, 2), interfaceC1524c, 7);
        return objD == EnumC1580a.f16356q ? objD : C1386y.f15098a;
    }
}
