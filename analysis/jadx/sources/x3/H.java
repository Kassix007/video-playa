package x3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC1915a {
    public static final Parcelable.Creator<H> CREATOR = new com.google.android.material.datepicker.p(23);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Bundle f18393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.google.android.gms.common.d[] f18394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1894f f18396t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.P(parcel, 1, this.f18393q);
        AbstractC0836n2.W(parcel, 2, this.f18394r, i);
        int i7 = this.f18395s;
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(i7);
        AbstractC0836n2.U(parcel, 4, this.f18396t, i);
        AbstractC0836n2.a0(parcel, iY);
    }
}
