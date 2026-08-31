package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Arrays;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractC1915a {
    public static final Parcelable.Creator<C0> CREATOR = new D0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f10399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f10400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f10401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f10402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f10403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f10404y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0(String str, int i, int i7, String str2, p0 p0Var) {
        AbstractC1887A.g(str);
        this.f10396q = str;
        this.f10397r = i;
        this.f10398s = i7;
        this.f10402w = str2;
        this.f10399t = null;
        this.f10400u = null;
        this.f10401v = true;
        this.f10403x = false;
        this.f10404y = p0Var.f10539q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0) {
            C0 c02 = (C0) obj;
            if (AbstractC1887A.j(this.f10396q, c02.f10396q) && this.f10397r == c02.f10397r && this.f10398s == c02.f10398s && AbstractC1887A.j(this.f10402w, c02.f10402w) && AbstractC1887A.j(this.f10399t, c02.f10399t) && AbstractC1887A.j(this.f10400u, c02.f10400u) && this.f10401v == c02.f10401v && this.f10403x == c02.f10403x && this.f10404y == c02.f10404y) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10396q, Integer.valueOf(this.f10397r), Integer.valueOf(this.f10398s), this.f10402w, this.f10399t, this.f10400u, Boolean.valueOf(this.f10401v), Boolean.valueOf(this.f10403x), Integer.valueOf(this.f10404y)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f10396q + ",packageVersionCode=" + this.f10397r + ",logSource=" + this.f10398s + ",logSourceName=" + this.f10402w + ",uploadAccount=" + this.f10399t + ",loggingId=" + this.f10400u + ",logAndroidId=" + this.f10401v + ",isAnonymous=" + this.f10403x + ",qosTier=" + this.f10404y + "]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 2, this.f10396q);
        AbstractC0836n2.b0(parcel, 3, 4);
        parcel.writeInt(this.f10397r);
        AbstractC0836n2.b0(parcel, 4, 4);
        parcel.writeInt(this.f10398s);
        AbstractC0836n2.V(parcel, 5, this.f10399t);
        AbstractC0836n2.V(parcel, 6, this.f10400u);
        AbstractC0836n2.b0(parcel, 7, 4);
        parcel.writeInt(this.f10401v ? 1 : 0);
        AbstractC0836n2.V(parcel, 8, this.f10402w);
        AbstractC0836n2.b0(parcel, 9, 4);
        parcel.writeInt(this.f10403x ? 1 : 0);
        AbstractC0836n2.b0(parcel, 10, 4);
        parcel.writeInt(this.f10404y);
        AbstractC0836n2.a0(parcel, iY);
    }

    public C0(String str, int i, int i7, String str2, String str3, boolean z5, String str4, boolean z6, int i8) {
        this.f10396q = str;
        this.f10397r = i;
        this.f10398s = i7;
        this.f10399t = str2;
        this.f10400u = str3;
        this.f10401v = z5;
        this.f10402w = str4;
        this.f10403x = z6;
        this.f10404y = i8;
    }
}
