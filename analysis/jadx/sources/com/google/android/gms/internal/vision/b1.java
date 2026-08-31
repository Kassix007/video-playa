package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.P1;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Parcelable.Creator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iF0 = P1.f0(parcel);
        int iM = 0;
        int iM2 = 0;
        long jN = 0;
        int iM3 = 0;
        int iM4 = 0;
        while (parcel.dataPosition() < iF0) {
            int i = parcel.readInt();
            char c7 = (char) i;
            if (c7 == 2) {
                iM = P1.M(parcel, i);
            } else if (c7 == 3) {
                iM3 = P1.M(parcel, i);
            } else if (c7 == 4) {
                iM4 = P1.M(parcel, i);
            } else if (c7 == 5) {
                jN = P1.N(parcel, i);
            } else if (c7 != 6) {
                P1.c0(parcel, i);
            } else {
                iM2 = P1.M(parcel, i);
            }
        }
        P1.y(parcel, iF0);
        a1 a1Var = new a1();
        a1Var.f11255q = iM;
        a1Var.f11256r = iM3;
        a1Var.f11257s = iM4;
        a1Var.f11258t = jN;
        a1Var.f11259u = iM2;
        return a1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a1[i];
    }
}
