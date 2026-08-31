package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new A1.i(28);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f11470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f11471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f11472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f11473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11476w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(q qVar, q qVar2, d dVar, q qVar3, int i) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f11470q = qVar;
        this.f11471r = qVar2;
        this.f11473t = qVar3;
        this.f11474u = i;
        this.f11472s = dVar;
        if (qVar3 != null && qVar.f11534q.compareTo(qVar3.f11534q) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (qVar3 != null && qVar3.f11534q.compareTo(qVar2.f11534q) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > y.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f11476w = qVar.d(qVar2) + 1;
        this.f11475v = (qVar2.f11536s - qVar.f11536s) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11470q.equals(bVar.f11470q) && this.f11471r.equals(bVar.f11471r) && Objects.equals(this.f11473t, bVar.f11473t) && this.f11474u == bVar.f11474u && this.f11472s.equals(bVar.f11472s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11470q, this.f11471r, this.f11473t, Integer.valueOf(this.f11474u), this.f11472s});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11470q, 0);
        parcel.writeParcelable(this.f11471r, 0);
        parcel.writeParcelable(this.f11473t, 0);
        parcel.writeParcelable(this.f11472s, 0);
        parcel.writeInt(this.f11474u);
    }
}
