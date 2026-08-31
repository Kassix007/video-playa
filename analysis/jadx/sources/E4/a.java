package E4;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.r;
import com.google.android.gms.internal.clearcut.y0;
import v3.q;
import v3.x;
import z4.AbstractC1970d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1725c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [D4.e.<init>(D4.f, S3.e):void, y4.g.<init>(y4.j, E1.t, S3.e):void] */
    public /* synthetic */ a(int i) {
        this.f1725c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean I(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f1725c;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i7) throws RemoteException {
        boolean zOnTransact;
        int i8 = 0;
        int i9 = 1;
        switch (this.f1725c) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i7)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                D4.e eVar = (D4.e) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i10 = b.f1726a;
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(k1.i.i(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                k kVar = eVar.f.f1464a;
                if (kVar != null) {
                    S3.e eVar2 = eVar.f1462e;
                    synchronized (kVar.f) {
                        kVar.f1743e.remove(eVar2);
                        break;
                    }
                    synchronized (kVar.f) {
                        try {
                            if (kVar.f1746k.get() <= 0 || kVar.f1746k.decrementAndGet() <= 0) {
                                kVar.a().post(new i(i8, kVar));
                            } else {
                                kVar.f1740b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            }
                        } finally {
                        }
                    }
                    break;
                }
                eVar.f1461d.a("onGetLaunchReviewFlowInfo", new Object[0]);
                eVar.f1462e.b(new D4.b((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i7)) {
                    return true;
                }
                return I(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i7)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                switch (i) {
                    case 3:
                        I3.b.b(parcel);
                        break;
                    case 4:
                        I3.b.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        I3.b.b(parcel);
                        break;
                    case 7:
                        I3.b.b(parcel);
                        break;
                    case 8:
                        R3.e eVar3 = (R3.e) I3.b.a(parcel, R3.e.CREATOR);
                        I3.b.b(parcel);
                        x xVar = (x) this;
                        xVar.f17604e.post(new q(xVar, eVar3, i9));
                        break;
                    case 9:
                        I3.b.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            case 3:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i7);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    y0 y0Var = (y0) this;
                    switch (i) {
                        case 1:
                            y0Var.f10581d.A0((Status) r.a(parcel, Status.CREATOR));
                            break;
                        case 2:
                            throw new UnsupportedOperationException();
                        case 3:
                            parcel.readLong();
                            throw new UnsupportedOperationException();
                        case 4:
                            throw new UnsupportedOperationException();
                        case 5:
                            parcel.readLong();
                            throw new UnsupportedOperationException();
                        case 6:
                            throw new UnsupportedOperationException();
                        case 7:
                            throw new UnsupportedOperationException();
                        case 8:
                            throw new UnsupportedOperationException();
                        case 9:
                            throw new UnsupportedOperationException();
                        default:
                            return false;
                    }
                }
                return true;
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i7)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                y4.g gVar = (y4.g) this;
                if (i == 2) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i11 = AbstractC1970d.f18749a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(k1.i.i(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    gVar.f(bundle2);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i12 = AbstractC1970d.f18749a;
                    Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int iDataAvail3 = parcel.dataAvail();
                    if (iDataAvail3 > 0) {
                        throw new BadParcelableException(k1.i.i(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    gVar.a(bundle3);
                }
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public a(String str) {
        this.f1725c = 1;
        attachInterface(this, str);
    }
}
