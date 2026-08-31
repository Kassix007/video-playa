package d2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new com.google.android.material.datepicker.p(2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f12068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12069t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f12066q + ", mGapDir=" + this.f12067r + ", mHasUnwantedGapAfter=" + this.f12069t + ", mGapPerSpan=" + Arrays.toString(this.f12068s) + '}';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12066q);
        parcel.writeInt(this.f12067r);
        parcel.writeInt(this.f12069t ? 1 : 0);
        int[] iArr = this.f12068s;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f12068s);
        }
    }
}
