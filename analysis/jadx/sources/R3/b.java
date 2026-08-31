package R3;

import A1.i;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import u3.h;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1915a implements h {
    public static final Parcelable.Creator<b> CREATOR = new i(20);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f6711s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(int i, int i7, Intent intent) {
        this.f6709q = i;
        this.f6710r = i7;
        this.f6711s = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f6709q);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f6710r);
        AbstractC0836n2.U(parcel, 3, this.f6711s, i);
        AbstractC0836n2.a0(parcel, iY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.h
    public final Status z() {
        return this.f6710r == 0 ? Status.f10309u : Status.f10311w;
    }
}
