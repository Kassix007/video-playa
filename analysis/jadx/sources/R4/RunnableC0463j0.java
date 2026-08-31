package R4;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.FileProvider;
import com.web2native.MainActivity;
import java.io.File;

/* JADX INFO: renamed from: R4.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0463j0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f7029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f7031t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0463j0(C0498s0 c0498s0, String str, String str2, int i) {
        this.f7028q = i;
        this.f7029r = c0498s0;
        this.f7030s = str;
        this.f7031t = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7028q) {
            case 0:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0463j0(this.f7029r, this.f7030s, this.f7031t, 1), 5000L);
                break;
            default:
                C0498s0 c0498s0 = this.f7029r;
                File fileB = c0498s0.b(this.f7030s);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(335544320);
                MainActivity mainActivity = c0498s0.f7180a;
                intent.setDataAndType(FileProvider.d(mainActivity, mainActivity.getPackageName() + ".provider", fileB), this.f7031t);
                intent.addFlags(1);
                mainActivity.startActivity(intent);
                break;
        }
    }
}
