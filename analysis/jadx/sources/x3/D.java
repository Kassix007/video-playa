package x3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1893e f18386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18387e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(AbstractC1893e abstractC1893e, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f18386d = abstractC1893e;
        this.f18387e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E4.a
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i7 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) J3.a.a(parcel, Bundle.CREATOR);
            J3.a.b(parcel);
            AbstractC1887A.h(this.f18386d, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC1893e abstractC1893e = this.f18386d;
            int i8 = this.f18387e;
            abstractC1893e.getClass();
            F f = new F(abstractC1893e, i7, strongBinder, bundle);
            C c7 = abstractC1893e.f18436v;
            c7.sendMessage(c7.obtainMessage(1, i8, -1, f));
            this.f18386d = null;
        } else if (i == 2) {
            parcel.readInt();
            J3.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i9 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            H h4 = (H) J3.a.a(parcel, H.CREATOR);
            J3.a.b(parcel);
            AbstractC1893e abstractC1893e2 = this.f18386d;
            AbstractC1887A.h(abstractC1893e2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC1887A.g(h4);
            abstractC1893e2.f18429L = h4;
            Bundle bundle2 = h4.f18393q;
            AbstractC1887A.h(this.f18386d, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC1893e abstractC1893e3 = this.f18386d;
            int i10 = this.f18387e;
            abstractC1893e3.getClass();
            F f7 = new F(abstractC1893e3, i9, strongBinder2, bundle2);
            C c8 = abstractC1893e3.f18436v;
            c8.sendMessage(c8.obtainMessage(1, i10, -1, f7));
            this.f18386d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
