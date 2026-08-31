package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC1915a {
    public static final Parcelable.Creator<V> CREATOR = new W(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f10721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f10722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f10724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f10725u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V(long j, long j7, boolean z5, Bundle bundle, String str) {
        this.f10721q = j;
        this.f10722r = j7;
        this.f10723s = z5;
        this.f10724t = bundle;
        this.f10725u = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 8);
        parcel.writeLong(this.f10721q);
        AbstractC0836n2.b0(parcel, 2, 8);
        parcel.writeLong(this.f10722r);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f10723s ? 1 : 0);
        AbstractC0836n2.P(parcel, 7, this.f10724t);
        AbstractC0836n2.V(parcel, 8, this.f10725u);
        AbstractC0836n2.a0(parcel, iY);
    }
}
