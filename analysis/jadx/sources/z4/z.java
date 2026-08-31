package Z4;

import P.W;
import android.content.Context;
import android.webkit.WebView;
import androidx.work.ForegroundInfo;
import androidx.work.impl.utils.WorkForegroundUpdater;
import java.util.UUID;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8527q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8531u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z(W w3, WebView webView, M m4, W w6) {
        this.f8528r = w3;
        this.f8530t = webView;
        this.f8531u = m4;
        this.f8529s = w6;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.utils.WorkForegroundUpdater.a(androidx.work.impl.utils.WorkForegroundUpdater, java.util.UUID, androidx.work.ForegroundInfo, android.content.Context):java.lang.Void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f8527q) {
            case 0:
                W w3 = (W) this.f8528r;
                WebView webView = (WebView) this.f8530t;
                M m4 = (M) this.f8531u;
                W w6 = (W) this.f8529s;
                o oVar = (o) w3.getValue();
                kotlin.jvm.internal.m.b(oVar);
                C0561c c0561c = oVar.f8499b;
                kotlin.jvm.internal.m.b(c0561c);
                String str = c0561c.f8483a;
                if (str != null) {
                    if (webView != null) {
                        webView.loadUrl(str);
                    }
                    w6.setValue(Boolean.FALSE);
                    if (m4 != null) {
                        m4.d("");
                    }
                }
                return C1386y.f15098a;
            default:
                return ((WorkForegroundUpdater) this.f8528r).lambda$setForegroundAsync$0((UUID) this.f8529s, (ForegroundInfo) this.f8530t, (Context) this.f8531u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ z(WorkForegroundUpdater workForegroundUpdater, UUID uuid, ForegroundInfo foregroundInfo, Context context) {
        this.f8528r = workForegroundUpdater;
        this.f8529s = uuid;
        this.f8530t = foregroundInfo;
        this.f8531u = context;
    }
}
