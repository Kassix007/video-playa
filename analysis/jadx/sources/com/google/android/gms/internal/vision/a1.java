package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends AbstractC1915a {
    public static final Parcelable.Creator<a1> CREATOR = new b1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11259u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        int i7 = this.f11255q;
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(i7);
        int i8 = this.f11256r;
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(i8);
        int i9 = this.f11257s;
        AbstractC0836n2.b0(parcel, 4, 4);
        parcel.writeInt(i9);
        long j = this.f11258t;
        AbstractC0836n2.b0(parcel, 5, 8);
        parcel.writeLong(j);
        int i10 = this.f11259u;
        AbstractC0836n2.b0(parcel, 6, 4);
        parcel.writeInt(i10);
        AbstractC0836n2.a0(parcel, iY);
    }
}
