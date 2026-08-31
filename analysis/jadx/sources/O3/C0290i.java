package O3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0290i extends AbstractC1915a {
    public static final Parcelable.Creator<C0290i> CREATOR = new A1.i(10);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bundle f4906q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0290i(Bundle bundle) {
        this.f4906q = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.P(parcel, 1, this.f4906q);
        AbstractC0836n2.a0(parcel, iY);
    }
}
