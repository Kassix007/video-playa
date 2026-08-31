package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.datepicker.p;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC1915a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10308r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Scope(int i, String str) {
        AbstractC1887A.e(str, "scopeUri must not be null or empty");
        this.f10307q = i;
        this.f10308r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f10308r.equals(((Scope) obj).f10308r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10308r.hashCode();
    }

    public final String toString() {
        return this.f10308r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f10307q);
        AbstractC0836n2.V(parcel, 2, this.f10308r);
        AbstractC0836n2.a0(parcel, iY);
    }
}
