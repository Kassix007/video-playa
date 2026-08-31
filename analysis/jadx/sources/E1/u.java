package E1;

import P5.S;
import R4.C0468k1;
import android.webkit.WebChromeClient;
import com.web2native.MainActivity;
import j5.C1164a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1661e;
    public Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(C0468k1 c0468k1) {
        this.f1660d = c0468k1;
        this.f1659c = -10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        C0468k1 c0468k1 = (C0468k1) this.f1660d;
        S s6 = c0468k1.f7098t.f13871b;
        Boolean bool = Boolean.TRUE;
        s6.getClass();
        s6.h(null, bool);
        C1164a c1164a = c0468k1.f7090n;
        S s7 = c1164a.f13850b;
        Boolean bool2 = Boolean.FALSE;
        s7.getClass();
        s7.h(null, bool2);
        c1164a.f13852d.g(null);
        this.f1661e = null;
        MainActivity mainActivity = c0468k1.f7067a;
        mainActivity.getWindow().getDecorView().setSystemUiVisibility(this.f1658b);
        mainActivity.setRequestedOrientation(this.f1657a);
        WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) this.f;
        kotlin.jvm.internal.m.b(customViewCallback);
        customViewCallback.onCustomViewHidden();
        this.f = null;
        int i = this.f1659c;
        if (i == 1) {
            mainActivity.setRequestedOrientation(1);
        } else if (i == 0) {
            mainActivity.setRequestedOrientation(0);
        } else if (i != -10) {
            mainActivity.setRequestedOrientation(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        this.f1657a = 1;
        this.f1661e = (x) this.f1660d;
        this.f1659c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c() {
        F1.a aVarB = ((x) this.f1661e).f1671b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f1944t).get(iA + aVarB.f1941q) == 0) || this.f1658b == 65039;
    }

    public u(x xVar) {
        this.f1657a = 1;
        this.f1660d = xVar;
        this.f1661e = xVar;
    }
}
