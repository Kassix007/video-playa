package d2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: d2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0993s implements Parcelable {
    public static final Parcelable.Creator<C0993s> CREATOR = new com.google.android.material.datepicker.p(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12200s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12198q);
        parcel.writeInt(this.f12199r);
        parcel.writeInt(this.f12200s ? 1 : 0);
    }
}
