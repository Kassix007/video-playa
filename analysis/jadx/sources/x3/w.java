package x3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f18524c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(IBinder iBinder) {
        this.f18524c = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(D d5, C1895g c1895g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(d5);
            parcelObtain.writeInt(1);
            com.google.android.material.datepicker.p.a(c1895g, parcelObtain, 0);
            this.f18524c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18524c;
    }
}
