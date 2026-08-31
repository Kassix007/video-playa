package J1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: J1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171c implements Parcelable {
    public static final Parcelable.Creator<C0171c> CREATOR = new A1.i(4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f2634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f2635r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0171c(Parcel parcel) {
        this.f2634q = parcel.createStringArrayList();
        this.f2635r = parcel.createTypedArrayList(C0170b.CREATOR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2634q);
        parcel.writeTypedList(this.f2635r);
    }
}
