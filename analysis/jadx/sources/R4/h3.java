package R4;

import androidx.work.OperationKt;
import androidx.work.Tracer;
import com.web2native.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h3 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6969q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6974v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h3(Tracer tracer, String str, B5.a aVar, androidx.lifecycle.J j, androidx.concurrent.futures.k kVar) {
        this.f6971s = tracer;
        this.f6970r = str;
        this.f6972t = aVar;
        this.f6973u = j;
        this.f6974v = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6969q) {
            case 0:
                V.g(this.f6970r, (MainActivity) this.f6973u, (String) this.f6971s, (String) this.f6972t, (C0468k1) this.f6974v);
                break;
            default:
                OperationKt.launchOperation$lambda$2$lambda$1((Tracer) this.f6971s, this.f6970r, (B5.a) this.f6972t, (androidx.lifecycle.J) this.f6973u, (androidx.concurrent.futures.k) this.f6974v);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ h3(String str, MainActivity mainActivity, String str2, String str3, C0468k1 c0468k1) {
        this.f6970r = str;
        this.f6973u = mainActivity;
        this.f6971s = str2;
        this.f6972t = str3;
        this.f6974v = c0468k1;
    }
}
