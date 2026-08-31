package x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: x3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1900l extends AbstractC1915a {
    public static final Parcelable.Creator<C1900l> CREATOR = new com.google.android.material.datepicker.p(22);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f18496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f18497u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1900l(int i, int i7, int i8, boolean z5, boolean z6) {
        this.f18493q = i;
        this.f18494r = z5;
        this.f18495s = z6;
        this.f18496t = i7;
        this.f18497u = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f18493q);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f18494r ? 1 : 0);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f18495s ? 1 : 0);
        AbstractC0836n2.b0(parcel, 4, 4);
        parcel.writeInt(this.f18496t);
        AbstractC0836n2.b0(parcel, 5, 4);
        parcel.writeInt(this.f18497u);
        AbstractC0836n2.a0(parcel, iY);
    }
}
