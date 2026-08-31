package D4;

import A1.i;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new i(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f1455q, 0);
        parcel.writeInt(bVar.f1456r ? 1 : 0);
    }
}
