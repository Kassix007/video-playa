package d2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new com.google.android.material.datepicker.p(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f12078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12079u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f12080v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f12081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12084z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12075q);
        parcel.writeInt(this.f12076r);
        parcel.writeInt(this.f12077s);
        if (this.f12077s > 0) {
            parcel.writeIntArray(this.f12078t);
        }
        parcel.writeInt(this.f12079u);
        if (this.f12079u > 0) {
            parcel.writeIntArray(this.f12080v);
        }
        parcel.writeInt(this.f12082x ? 1 : 0);
        parcel.writeInt(this.f12083y ? 1 : 0);
        parcel.writeInt(this.f12084z ? 1 : 0);
        parcel.writeList(this.f12081w);
    }
}
