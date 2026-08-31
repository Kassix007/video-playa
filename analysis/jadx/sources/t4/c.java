package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C1.c {
    public static final Parcelable.Creator<c> CREATOR = new C1.b(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16744s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16744s = parcel.readInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f16744s);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f16744s = sideSheetBehavior.f11581h;
    }
}
