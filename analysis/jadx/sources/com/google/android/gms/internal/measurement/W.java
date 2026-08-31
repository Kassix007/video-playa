package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10733a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.measurement.V.<clinit>():void, com.google.android.gms.internal.measurement.X.<clinit>():void] */
    public /* synthetic */ W(int i) {
        this.f10733a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10733a) {
            case 0:
                int iF0 = P1.f0(parcel);
                Bundle bundleO = null;
                String strU = null;
                boolean zK = false;
                long jN = 0;
                long jN2 = 0;
                while (parcel.dataPosition() < iF0) {
                    int i = parcel.readInt();
                    char c7 = (char) i;
                    if (c7 == 1) {
                        jN = P1.N(parcel, i);
                    } else if (c7 == 2) {
                        jN2 = P1.N(parcel, i);
                    } else if (c7 == 3) {
                        zK = P1.K(parcel, i);
                    } else if (c7 == 7) {
                        bundleO = P1.o(parcel, i);
                    } else if (c7 != '\b') {
                        P1.c0(parcel, i);
                    } else {
                        strU = P1.u(parcel, i);
                    }
                }
                P1.y(parcel, iF0);
                return new V(jN, jN2, zK, bundleO, strU);
            default:
                int iF02 = P1.f0(parcel);
                String strU2 = null;
                int iM = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iF02) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        iM = P1.M(parcel, i7);
                    } else if (c8 == 2) {
                        strU2 = P1.u(parcel, i7);
                    } else if (c8 != 3) {
                        P1.c0(parcel, i7);
                    } else {
                        intent = (Intent) P1.t(parcel, i7, Intent.CREATOR);
                    }
                }
                P1.y(parcel, iF02);
                return new X(iM, strU2, intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f10733a) {
            case 0:
                return new V[i];
            default:
                return new X[i];
        }
    }
}
