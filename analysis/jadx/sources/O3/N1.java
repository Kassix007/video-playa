package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.List;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends AbstractC1915a {
    public static final Parcelable.Creator<N1> CREATOR = new A1.i(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f4540q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N1(ArrayList arrayList) {
        this.f4540q = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.X(parcel, 1, this.f4540q);
        AbstractC0836n2.a0(parcel, iY);
    }
}
