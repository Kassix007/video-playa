package x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: x3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1898j extends AbstractC1915a {
    public static final Parcelable.Creator<C1898j> CREATOR = new com.google.android.material.datepicker.p(19);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f18467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f18468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f18469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f18470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f18471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f18472y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1898j(int i, int i7, int i8, long j, long j7, String str, String str2, int i9, int i10) {
        this.f18464q = i;
        this.f18465r = i7;
        this.f18466s = i8;
        this.f18467t = j;
        this.f18468u = j7;
        this.f18469v = str;
        this.f18470w = str2;
        this.f18471x = i9;
        this.f18472y = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f18464q);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f18465r);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f18466s);
        AbstractC0836n2.b0(parcel, 4, 8);
        parcel.writeLong(this.f18467t);
        AbstractC0836n2.b0(parcel, 5, 8);
        parcel.writeLong(this.f18468u);
        AbstractC0836n2.V(parcel, 6, this.f18469v);
        AbstractC0836n2.V(parcel, 7, this.f18470w);
        AbstractC0836n2.b0(parcel, 8, 4);
        parcel.writeInt(this.f18471x);
        AbstractC0836n2.b0(parcel, 9, 4);
        parcel.writeInt(this.f18472y);
        AbstractC0836n2.a0(parcel, iY);
    }
}
