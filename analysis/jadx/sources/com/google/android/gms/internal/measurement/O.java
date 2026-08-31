package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class O extends I3.a implements S {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S
    public final int d() {
        Parcel parcelJ = J(K(), 2);
        int i = parcelJ.readInt();
        parcelJ.recycle();
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S
    public final void j(String str, String str2, Bundle bundle, long j) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        AbstractC0887y.b(parcelK, bundle);
        parcelK.writeLong(j);
        L(parcelK, 1);
    }
}
