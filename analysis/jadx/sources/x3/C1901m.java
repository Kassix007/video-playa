package x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.List;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: x3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1901m extends AbstractC1915a {
    public static final Parcelable.Creator<C1901m> CREATOR = new com.google.android.material.datepicker.p(18);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f18499r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1901m(int i, List list) {
        this.f18498q = i;
        this.f18499r = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f18498q);
        AbstractC0836n2.X(parcel, 2, this.f18499r);
        AbstractC0836n2.a0(parcel, iY);
    }
}
