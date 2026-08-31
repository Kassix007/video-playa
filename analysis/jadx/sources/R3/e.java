package R3;

import A1.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import x3.t;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1915a {
    public static final Parcelable.Creator<e> CREATOR = new i(22);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.gms.common.b f6715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f6716s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(int i, com.google.android.gms.common.b bVar, t tVar) {
        this.f6714q = i;
        this.f6715r = bVar;
        this.f6716s = tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f6714q);
        AbstractC0836n2.U(parcel, 2, this.f6715r, i);
        AbstractC0836n2.U(parcel, 3, this.f6716s, i);
        AbstractC0836n2.a0(parcel, iY);
    }
}
