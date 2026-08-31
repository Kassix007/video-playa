package x3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x extends I3.a implements z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean N() {
        Parcel parcelI = I(K(), 7);
        int i = J3.a.f2805a;
        boolean z5 = parcelI.readInt() != 0;
        parcelI.recycle();
        return z5;
    }
}
