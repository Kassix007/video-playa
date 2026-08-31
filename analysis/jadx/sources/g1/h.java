package G1;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E1.i implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f1992q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(EditText editText) {
        this.f1992q = new WeakReference(editText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.i
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f1992q.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f1992q.get(), 1);
    }
}
