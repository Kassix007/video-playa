package D4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ S3.e f1457q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, S3.e eVar) {
        super(handler);
        this.f1457q = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f1457q.b(null);
    }
}
