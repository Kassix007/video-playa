package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0275d extends AbstractC1915a {
    public static final Parcelable.Creator<C0275d> CREATOR = new A1.i(8);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f4823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4825s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0275d(int i, long j, long j7) {
        this.f4823q = j;
        this.f4824r = i;
        this.f4825s = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 8);
        parcel.writeLong(this.f4823q);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f4824r);
        AbstractC0836n2.b0(parcel, 3, 8);
        parcel.writeLong(this.f4825s);
        AbstractC0836n2.a0(parcel, iY);
    }
}
