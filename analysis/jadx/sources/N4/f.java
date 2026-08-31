package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.p;
import l4.C1236f;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new p(9);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1236f f15277r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15276q);
        parcel.writeParcelable(this.f15277r, 0);
    }
}
