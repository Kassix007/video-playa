package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Arrays;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1915a {
    public static final Parcelable.Creator<d> CREATOR = new A1.i(26);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10331s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d() {
        this.f10329q = "CLIENT_TELEMETRY";
        this.f10331s = 1L;
        this.f10330r = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long W() {
        long j = this.f10331s;
        return j == -1 ? this.f10330r : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f10329q;
            if (((str != null && str.equals(dVar.f10329q)) || (str == null && dVar.f10329q == null)) && W() == dVar.W()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10329q, Long.valueOf(W())});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        v3.l lVar = new v3.l(this);
        lVar.a(this.f10329q, "name");
        lVar.a(Long.valueOf(W()), "version");
        return lVar.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 1, this.f10329q);
        AbstractC0836n2.b0(parcel, 2, 4);
        parcel.writeInt(this.f10330r);
        long jW = W();
        AbstractC0836n2.b0(parcel, 3, 8);
        parcel.writeLong(jW);
        AbstractC0836n2.a0(parcel, iY);
    }

    public d(String str, long j, int i) {
        this.f10329q = str;
        this.f10330r = i;
        this.f10331s = j;
    }
}
