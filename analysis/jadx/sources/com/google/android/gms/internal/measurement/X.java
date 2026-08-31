package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1915a {
    public static final Parcelable.Creator<X> CREATOR = new W(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f10751s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X(int i, String str, Intent intent) {
        this.f10749q = i;
        this.f10750r = str;
        this.f10751s = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static X W(Activity activity) {
        return new X(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        return this.f10749q == x6.f10749q && Objects.equals(this.f10750r, x6.f10750r) && Objects.equals(this.f10751s, x6.f10751s);
    }

    public final int hashCode() {
        return this.f10749q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f10749q);
        AbstractC0836n2.V(parcel, 2, this.f10750r);
        AbstractC0836n2.U(parcel, 3, this.f10751s, i);
        AbstractC0836n2.a0(parcel, iY);
    }
}
