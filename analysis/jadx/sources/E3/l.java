package E3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends I3.a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D3.a N(D3.b bVar, String str, int i) {
        Parcel parcelK = K();
        J3.a.c(parcelK, bVar);
        parcelK.writeString(str);
        parcelK.writeInt(i);
        Parcel parcelI = I(parcelK, 2);
        D3.a aVarJ = D3.b.J(parcelI.readStrongBinder());
        parcelI.recycle();
        return aVarJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D3.a O(D3.b bVar, String str, int i, D3.b bVar2) {
        Parcel parcelK = K();
        J3.a.c(parcelK, bVar);
        parcelK.writeString(str);
        parcelK.writeInt(i);
        J3.a.c(parcelK, bVar2);
        Parcel parcelI = I(parcelK, 8);
        D3.a aVarJ = D3.b.J(parcelI.readStrongBinder());
        parcelI.recycle();
        return aVarJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D3.a P(D3.b bVar, String str, int i) {
        Parcel parcelK = K();
        J3.a.c(parcelK, bVar);
        parcelK.writeString(str);
        parcelK.writeInt(i);
        Parcel parcelI = I(parcelK, 4);
        D3.a aVarJ = D3.b.J(parcelI.readStrongBinder());
        parcelI.recycle();
        return aVarJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D3.a Q(D3.b bVar, String str, boolean z5, long j) {
        Parcel parcelK = K();
        J3.a.c(parcelK, bVar);
        parcelK.writeString(str);
        parcelK.writeInt(z5 ? 1 : 0);
        parcelK.writeLong(j);
        Parcel parcelI = I(parcelK, 7);
        D3.a aVarJ = D3.b.J(parcelI.readStrongBinder());
        parcelI.recycle();
        return aVarJ;
    }
}
