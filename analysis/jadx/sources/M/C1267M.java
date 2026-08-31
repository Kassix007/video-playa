package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: m.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1267M extends View.BaseSavedState {
    public static final Parcelable.Creator<C1267M> CREATOR = new com.google.android.material.datepicker.p(8);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14688q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f14688q ? (byte) 1 : (byte) 0);
    }
}
