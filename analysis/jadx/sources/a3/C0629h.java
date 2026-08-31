package a3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: a3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629h extends View.BaseSavedState {
    public static final Parcelable.Creator<C0629h> CREATOR = new A1.i(24);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f8817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f8819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f8821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8823w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8817q);
        parcel.writeFloat(this.f8819s);
        parcel.writeInt(this.f8820t ? 1 : 0);
        parcel.writeString(this.f8821u);
        parcel.writeInt(this.f8822v);
        parcel.writeInt(this.f8823w);
    }
}
