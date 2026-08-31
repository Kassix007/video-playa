package R4;

import android.content.DialogInterface;
import android.webkit.HttpAuthHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6965r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g3(int i, Object obj) {
        this.f6964q = i;
        this.f6965r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f6964q) {
            case 0:
                HttpAuthHandler httpAuthHandler = (HttpAuthHandler) ((k3.c) this.f6965r).f14120q;
                if (httpAuthHandler != null) {
                    httpAuthHandler.cancel();
                }
                break;
            default:
                ((I2.e) this.f6965r).invoke();
                break;
        }
    }
}
