package J1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new A1.i(6);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f2549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0170b[] f2550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f2552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f2553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f2554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f2555x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2548q);
        parcel.writeStringList(this.f2549r);
        parcel.writeTypedArray(this.f2550s, i);
        parcel.writeInt(this.f2551t);
        parcel.writeString(this.f2552u);
        parcel.writeStringList(this.f2553v);
        parcel.writeTypedList(this.f2554w);
        parcel.writeTypedList(this.f2555x);
    }
}
