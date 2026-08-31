package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends AbstractBinderC0882x implements S {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0882x
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        AbstractC0887y.d(parcel);
        j(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }
}
