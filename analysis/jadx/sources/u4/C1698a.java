package u4;

import android.os.Handler;
import android.os.Message;
import k1.i;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1698a implements Handler.Callback {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw i.g(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw i.g(message.obj);
    }
}
