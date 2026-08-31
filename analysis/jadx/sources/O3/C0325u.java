package O3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0325u extends AbstractC1915a implements Iterable {
    public static final Parcelable.Creator<C0325u> CREATOR = new A1.i(11);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bundle f5085q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0325u(Bundle bundle) {
        this.f5085q = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object W(String str) {
        return this.f5085q.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Double a0() {
        return Double.valueOf(this.f5085q.getDouble(FirebaseAnalytics.Param.VALUE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b0() {
        return this.f5085q.getString(FirebaseAnalytics.Param.CURRENCY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle c0() {
        return new Bundle(this.f5085q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0322t(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f5085q.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.P(parcel, 2, c0());
        AbstractC0836n2.a0(parcel, iY);
    }
}
