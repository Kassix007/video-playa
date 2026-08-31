package c4;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class e extends C1.c {
    public static final Parcelable.Creator<e> CREATOR = new C1.b(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f10245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10247w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10243s = parcel.readInt();
        this.f10244t = parcel.readInt();
        this.f10245u = parcel.readInt() == 1;
        this.f10246v = parcel.readInt() == 1;
        this.f10247w = parcel.readInt() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10243s);
        parcel.writeInt(this.f10244t);
        parcel.writeInt(this.f10245u ? 1 : 0);
        parcel.writeInt(this.f10246v ? 1 : 0);
        parcel.writeInt(this.f10247w ? 1 : 0);
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f10243s = bottomSheetBehavior.f11373L;
        this.f10244t = bottomSheetBehavior.f11396e;
        this.f10245u = bottomSheetBehavior.f11390b;
        this.f10246v = bottomSheetBehavior.f11370I;
        this.f10247w = bottomSheetBehavior.f11371J;
    }
}
