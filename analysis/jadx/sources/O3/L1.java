package O3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends AbstractC1915a {
    public static final Parcelable.Creator<L1> CREATOR = new A1.i(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f4511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f4512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4513s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f4514t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4515u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f4516v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f4517w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L1(long j, byte[] bArr, String str, Bundle bundle, int i, long j7, String str2) {
        this.f4511q = j;
        this.f4512r = bArr;
        this.f4513s = str;
        this.f4514t = bundle;
        this.f4515u = i;
        this.f4516v = j7;
        this.f4517w = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 8);
        parcel.writeLong(this.f4511q);
        AbstractC0836n2.Q(parcel, 2, this.f4512r);
        AbstractC0836n2.V(parcel, 3, this.f4513s);
        AbstractC0836n2.P(parcel, 4, this.f4514t);
        AbstractC0836n2.b0(parcel, 5, 4);
        parcel.writeInt(this.f4515u);
        AbstractC0836n2.b0(parcel, 6, 8);
        parcel.writeLong(this.f4516v);
        AbstractC0836n2.V(parcel, 7, this.f4517w);
        AbstractC0836n2.a0(parcel, iY);
    }
}
