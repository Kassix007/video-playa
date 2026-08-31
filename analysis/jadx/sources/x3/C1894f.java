package x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: x3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1894f extends AbstractC1915a {
    public static final Parcelable.Creator<C1894f> CREATOR = new com.google.android.material.datepicker.p(24);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1900l f18441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f18444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f18445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f18446v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1894f(C1900l c1900l, boolean z5, boolean z6, int[] iArr, int i, int[] iArr2) {
        this.f18441q = c1900l;
        this.f18442r = z5;
        this.f18443s = z6;
        this.f18444t = iArr;
        this.f18445u = i;
        this.f18446v = iArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.U(parcel, 1, this.f18441q, i);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f18442r ? 1 : 0);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f18443s ? 1 : 0);
        AbstractC0836n2.T(parcel, 4, this.f18444t);
        AbstractC0836n2.b0(parcel, 5, 4);
        parcel.writeInt(this.f18445u);
        AbstractC0836n2.T(parcel, 6, this.f18446v);
        AbstractC0836n2.a0(parcel, iY);
    }
}
