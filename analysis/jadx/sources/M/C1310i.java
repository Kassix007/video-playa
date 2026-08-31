package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1310i implements Parcelable {
    public static final Parcelable.Creator<C1310i> CREATOR = new com.google.android.material.datepicker.p(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14794q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14794q);
    }
}
