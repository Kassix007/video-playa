package C1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Parcelable f1163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f1162r = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c() {
        this.f1163q = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1163q, i);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1163q = parcelable == f1162r ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1163q = parcelable == null ? f1162r : parcelable;
    }
}
