package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.datepicker.p;

/* JADX INFO: loaded from: classes.dex */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new p(10);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f15374q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(Parcelable parcelable, boolean z5) {
        super(parcelable);
        this.f15374q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f15374q ? (byte) 1 : (byte) 0);
    }

    public l(Parcel parcel) {
        super(parcel);
        this.f15374q = parcel.readByte() != 0;
    }
}
