package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends AbstractC1915a {
    public static final Parcelable.Creator<I1> CREATOR = new A1.i(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f4494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4495s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I1(String str, long j, int i) {
        this.f4493q = str;
        this.f4494r = j;
        this.f4495s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 1, this.f4493q);
        AbstractC0836n2.b0(parcel, 2, 8);
        parcel.writeLong(this.f4494r);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f4495s);
        AbstractC0836n2.a0(parcel, iY);
    }
}
