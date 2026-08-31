package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1915a {
    public static final Parcelable.Creator<r> CREATOR = new A1.i(27);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10368t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(int i, int i7, String str, boolean z5) {
        this.f10365q = z5;
        this.f10366r = str;
        this.f10367s = E3.h.Q(i) - 1;
        this.f10368t = D5.a.P(i7) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f10365q ? 1 : 0);
        AbstractC0836n2.V(parcel, 2, this.f10366r);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f10367s);
        AbstractC0836n2.b0(parcel, 4, 4);
        parcel.writeInt(this.f10368t);
        AbstractC0836n2.a0(parcel, iY);
    }
}
