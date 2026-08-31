package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.P1;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements Parcelable.Creator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iF0 = P1.f0(parcel);
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        int iM = 0;
        int iM2 = 0;
        boolean zK = false;
        int iM3 = 0;
        boolean zK2 = true;
        while (parcel.dataPosition() < iF0) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strU = P1.u(parcel, i);
                    break;
                case 3:
                    iM = P1.M(parcel, i);
                    break;
                case 4:
                    iM2 = P1.M(parcel, i);
                    break;
                case 5:
                    strU2 = P1.u(parcel, i);
                    break;
                case 6:
                    strU3 = P1.u(parcel, i);
                    break;
                case 7:
                    zK2 = P1.K(parcel, i);
                    break;
                case '\b':
                    strU4 = P1.u(parcel, i);
                    break;
                case '\t':
                    zK = P1.K(parcel, i);
                    break;
                case '\n':
                    iM3 = P1.M(parcel, i);
                    break;
                default:
                    P1.c0(parcel, i);
                    break;
            }
        }
        P1.y(parcel, iF0);
        return new C0(strU, iM, iM2, strU2, strU3, zK2, strU4, zK, iM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0[i];
    }
}
