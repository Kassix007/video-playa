package F3;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e, IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f1951c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(IBinder iBinder) {
        this.f1951c = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1951c;
    }
}
