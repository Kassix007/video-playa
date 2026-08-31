package J1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new A1.i(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2509r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2508q);
        parcel.writeInt(this.f2509r);
    }
}
